package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.FilterableManifest;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheKeyFactory;
import com.google.android.exoplayer2.upstream.cache.CacheUtil;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SegmentDownloader<M extends FilterableManifest<M>> implements Downloader {
    private static final int BUFFER_SIZE_BYTES = 131072;
    private final Cache cache;
    private final CacheKeyFactory cacheKeyFactory;
    private final CacheDataSource dataSource;
    private final AtomicBoolean isCanceled = new AtomicBoolean();
    private final DataSpec manifestDataSpec;
    private final CacheDataSource offlineDataSource;
    private final PriorityTaskManager priorityTaskManager;
    private final ArrayList<StreamKey> streamKeys;

    public static final class ProgressNotifier implements CacheUtil.ProgressListener {
        private long bytesDownloaded;
        private final long contentLength;
        private final Downloader.ProgressListener progressListener;
        private int segmentsDownloaded;
        private final int totalSegments;

        public ProgressNotifier(Downloader.ProgressListener progressListener, long j, int i, long j2, int i2) {
            this.progressListener = progressListener;
            this.contentLength = j;
            this.totalSegments = i;
            this.bytesDownloaded = j2;
            this.segmentsDownloaded = i2;
        }

        private float getPercentDownloaded() {
            long j = this.contentLength;
            if (j != -1 && j != 0) {
                return (this.bytesDownloaded * 100.0f) / j;
            }
            int i = this.totalSegments;
            if (i != 0) {
                return (this.segmentsDownloaded * 100.0f) / i;
            }
            return -1.0f;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CacheUtil.ProgressListener
        public void onProgress(long j, long j2, long j3) {
            long j4 = this.bytesDownloaded + j3;
            this.bytesDownloaded = j4;
            this.progressListener.onProgress(this.contentLength, j4, getPercentDownloaded());
        }

        public void onSegmentDownloaded() {
            this.segmentsDownloaded++;
            this.progressListener.onProgress(this.contentLength, this.bytesDownloaded, getPercentDownloaded());
        }
    }

    public static class Segment implements Comparable<Segment> {
        public final DataSpec dataSpec;
        public final long startTimeUs;

        public Segment(long j, DataSpec dataSpec) {
            this.startTimeUs = j;
            this.dataSpec = dataSpec;
        }

        @Override // java.lang.Comparable
        public int compareTo(Segment segment) {
            return Util.compareLong(this.startTimeUs, segment.startTimeUs);
        }
    }

    public SegmentDownloader(Uri uri, List<StreamKey> list, DownloaderConstructorHelper downloaderConstructorHelper) {
        this.manifestDataSpec = getCompressibleDataSpec(uri);
        this.streamKeys = new ArrayList<>(list);
        this.cache = downloaderConstructorHelper.getCache();
        this.dataSource = downloaderConstructorHelper.createCacheDataSource();
        this.offlineDataSource = downloaderConstructorHelper.createOfflineCacheDataSource();
        this.cacheKeyFactory = downloaderConstructorHelper.getCacheKeyFactory();
        this.priorityTaskManager = downloaderConstructorHelper.getPriorityTaskManager();
    }

    public static DataSpec getCompressibleDataSpec(Uri uri) {
        return new DataSpec(uri, 0L, -1L, null, 1);
    }

    private void removeDataSpec(DataSpec dataSpec) {
        CacheUtil.remove(dataSpec, this.cache, this.cacheKeyFactory);
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void cancel() {
        this.isCanceled.set(true);
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public final void download(@Nullable Downloader.ProgressListener progressListener) throws InterruptedException, IOException {
        this.priorityTaskManager.add(-1000);
        try {
            FilterableManifest manifest = getManifest(this.dataSource, this.manifestDataSpec);
            if (!this.streamKeys.isEmpty()) {
                manifest = (FilterableManifest) manifest.copy(this.streamKeys);
            }
            List<Segment> segments = getSegments(this.dataSource, manifest, false);
            int size = segments.size();
            long j = 0;
            long j2 = 0;
            int i = 0;
            for (int size2 = segments.size() - 1; size2 >= 0; size2--) {
                Pair<Long, Long> cached = CacheUtil.getCached(segments.get(size2).dataSpec, this.cache, this.cacheKeyFactory);
                long jLongValue = ((Long) cached.first).longValue();
                long jLongValue2 = ((Long) cached.second).longValue();
                j2 += jLongValue2;
                if (jLongValue != -1) {
                    if (jLongValue == jLongValue2) {
                        i++;
                        segments.remove(size2);
                    }
                    if (j != -1) {
                        j += jLongValue;
                    }
                } else {
                    j = -1;
                }
            }
            Collections.sort(segments);
            ProgressNotifier progressNotifier = progressListener != null ? new ProgressNotifier(progressListener, j, size, j2, i) : null;
            byte[] bArr = new byte[131072];
            for (int i2 = 0; i2 < segments.size(); i2++) {
                CacheUtil.cache(segments.get(i2).dataSpec, this.cache, this.cacheKeyFactory, this.dataSource, bArr, this.priorityTaskManager, -1000, progressNotifier, this.isCanceled, true);
                if (progressNotifier != null) {
                    progressNotifier.onSegmentDownloaded();
                }
            }
        } finally {
            this.priorityTaskManager.remove(-1000);
        }
    }

    public abstract M getManifest(DataSource dataSource, DataSpec dataSpec) throws IOException;

    public abstract List<Segment> getSegments(DataSource dataSource, M m, boolean z) throws InterruptedException, IOException;

    @Override // com.google.android.exoplayer2.offline.Downloader
    public final void remove() throws InterruptedException {
        try {
            List<Segment> segments = getSegments(this.offlineDataSource, getManifest(this.offlineDataSource, this.manifestDataSpec), true);
            for (int i = 0; i < segments.size(); i++) {
                removeDataSpec(segments.get(i).dataSpec);
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            removeDataSpec(this.manifestDataSpec);
            throw th;
        }
        removeDataSpec(this.manifestDataSpec);
    }
}
