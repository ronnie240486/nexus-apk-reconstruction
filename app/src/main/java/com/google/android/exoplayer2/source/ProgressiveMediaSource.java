package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.List;
import p000.C0499Hg;
import p000.C4335fC;

/* JADX INFO: loaded from: classes2.dex */
public final class ProgressiveMediaSource extends BaseMediaSource implements ProgressiveMediaPeriod.Listener {
    public static final int DEFAULT_LOADING_CHECK_INTERVAL_BYTES = 1048576;
    private final int continueLoadingCheckIntervalBytes;

    @Nullable
    private final String customCacheKey;
    private final DataSource.Factory dataSourceFactory;
    private final DrmSessionManager<?> drmSessionManager;
    private final ExtractorsFactory extractorsFactory;
    private final LoadErrorHandlingPolicy loadableLoadErrorHandlingPolicy;

    @Nullable
    private final Object tag;
    private long timelineDurationUs = C3219C.TIME_UNSET;
    private boolean timelineIsLive;
    private boolean timelineIsSeekable;

    @Nullable
    private TransferListener transferListener;
    private final Uri uri;

    public static final class Factory implements MediaSourceFactory {
        private int continueLoadingCheckIntervalBytes;

        @Nullable
        private String customCacheKey;
        private final DataSource.Factory dataSourceFactory;
        private DrmSessionManager<?> drmSessionManager;
        private ExtractorsFactory extractorsFactory;
        private boolean isCreateCalled;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;

        @Nullable
        private Object tag;

        public Factory(DataSource.Factory factory) {
            this(factory, new DefaultExtractorsFactory());
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public int[] getSupportedTypes() {
            return new int[]{3};
        }

        public Factory setContinueLoadingCheckIntervalBytes(int i) {
            Assertions.checkState(!this.isCreateCalled);
            this.continueLoadingCheckIntervalBytes = i;
            return this;
        }

        public Factory setCustomCacheKey(@Nullable String str) {
            Assertions.checkState(!this.isCreateCalled);
            this.customCacheKey = str;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public /* bridge */ /* synthetic */ MediaSourceFactory setDrmSessionManager(DrmSessionManager drmSessionManager) {
            return setDrmSessionManager((DrmSessionManager<?>) drmSessionManager);
        }

        @Deprecated
        public Factory setExtractorsFactory(ExtractorsFactory extractorsFactory) {
            Assertions.checkState(!this.isCreateCalled);
            this.extractorsFactory = extractorsFactory;
            return this;
        }

        public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            Assertions.checkState(!this.isCreateCalled);
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public /* synthetic */ MediaSourceFactory setStreamKeys(List list) {
            return C4335fC.m20300a(this, list);
        }

        public Factory setTag(Object obj) {
            Assertions.checkState(!this.isCreateCalled);
            this.tag = obj;
            return this;
        }

        public Factory(DataSource.Factory factory, ExtractorsFactory extractorsFactory) {
            this.dataSourceFactory = factory;
            this.extractorsFactory = extractorsFactory;
            this.drmSessionManager = C0499Hg.m2391d();
            this.loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            this.continueLoadingCheckIntervalBytes = 1048576;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public ProgressiveMediaSource createMediaSource(Uri uri) {
            this.isCreateCalled = true;
            return new ProgressiveMediaSource(uri, this.dataSourceFactory, this.extractorsFactory, this.drmSessionManager, this.loadErrorHandlingPolicy, this.customCacheKey, this.continueLoadingCheckIntervalBytes, this.tag);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setDrmSessionManager(DrmSessionManager<?> drmSessionManager) {
            Assertions.checkState(!this.isCreateCalled);
            if (drmSessionManager == null) {
                drmSessionManager = C0499Hg.m2391d();
            }
            this.drmSessionManager = drmSessionManager;
            return this;
        }
    }

    public ProgressiveMediaSource(Uri uri, DataSource.Factory factory, ExtractorsFactory extractorsFactory, DrmSessionManager<?> drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, @Nullable String str, int i, @Nullable Object obj) {
        this.uri = uri;
        this.dataSourceFactory = factory;
        this.extractorsFactory = extractorsFactory;
        this.drmSessionManager = drmSessionManager;
        this.loadableLoadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.customCacheKey = str;
        this.continueLoadingCheckIntervalBytes = i;
        this.tag = obj;
    }

    private void notifySourceInfoRefreshed(long j, boolean z, boolean z2) {
        this.timelineDurationUs = j;
        this.timelineIsSeekable = z;
        this.timelineIsLive = z2;
        refreshSourceInfo(new SinglePeriodTimeline(this.timelineDurationUs, this.timelineIsSeekable, false, this.timelineIsLive, null, this.tag));
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        DataSource dataSourceCreateDataSource = this.dataSourceFactory.createDataSource();
        TransferListener transferListener = this.transferListener;
        if (transferListener != null) {
            dataSourceCreateDataSource.addTransferListener(transferListener);
        }
        return new ProgressiveMediaPeriod(this.uri, dataSourceCreateDataSource, this.extractorsFactory.createExtractors(), this.drmSessionManager, this.loadableLoadErrorHandlingPolicy, createEventDispatcher(mediaPeriodId), this, allocator, this.customCacheKey, this.continueLoadingCheckIntervalBytes);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    @Nullable
    public Object getTag() {
        return this.tag;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaPeriod.Listener
    public void onSourceInfoRefreshed(long j, boolean z, boolean z2) {
        if (j == C3219C.TIME_UNSET) {
            j = this.timelineDurationUs;
        }
        if (this.timelineDurationUs == j && this.timelineIsSeekable == z && this.timelineIsLive == z2) {
            return;
        }
        notifySourceInfoRefreshed(j, z, z2);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        this.transferListener = transferListener;
        this.drmSessionManager.prepare();
        notifySourceInfoRefreshed(this.timelineDurationUs, this.timelineIsSeekable, this.timelineIsLive);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((ProgressiveMediaPeriod) mediaPeriod).release();
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.drmSessionManager.release();
    }
}
