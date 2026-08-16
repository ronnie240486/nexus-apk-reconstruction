package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C1071Qb;

/* JADX INFO: loaded from: classes2.dex */
public final class CacheUtil {
    public static final int DEFAULT_BUFFER_SIZE_BYTES = 131072;
    public static final CacheKeyFactory DEFAULT_CACHE_KEY_FACTORY = new CacheKeyFactory() { // from class: E8
        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.upstream.cache.CacheKeyFactory
        public final String buildCacheKey(DataSpec dataSpec) {
            return null;
        }
    };

    public interface ProgressListener {
        void onProgress(long j, long j2, long j3);
    }

    public static final class ProgressNotifier {
        private long bytesCached;
        private final ProgressListener listener;
        private long requestLength;

        public ProgressNotifier(ProgressListener progressListener) {
            this.listener = progressListener;
        }

        public void init(long j, long j2) {
            this.requestLength = j;
            this.bytesCached = j2;
            this.listener.onProgress(j, j2, 0L);
        }

        public void onBytesCached(long j) {
            long j2 = this.bytesCached + j;
            this.bytesCached = j2;
            this.listener.onProgress(this.requestLength, j2, j);
        }

        public void onRequestLengthResolved(long j) {
            if (this.requestLength != -1 || j == -1) {
                return;
            }
            this.requestLength = j;
            this.listener.onProgress(j, this.bytesCached, 0L);
        }
    }

    private CacheUtil() {
    }

    private static String buildCacheKey(DataSpec dataSpec, @Nullable CacheKeyFactory cacheKeyFactory) {
        if (cacheKeyFactory == null) {
            cacheKeyFactory = DEFAULT_CACHE_KEY_FACTORY;
        }
        return cacheKeyFactory.buildCacheKey(dataSpec);
    }

    @WorkerThread
    public static void cache(DataSpec dataSpec, Cache cache, DataSource dataSource, @Nullable ProgressListener progressListener, @Nullable AtomicBoolean atomicBoolean) throws InterruptedException, IOException {
        cache(dataSpec, cache, null, new CacheDataSource(cache, dataSource), new byte[131072], null, 0, progressListener, atomicBoolean, false);
    }

    public static String generateKey(Uri uri) {
        return uri.toString();
    }

    public static Pair<Long, Long> getCached(DataSpec dataSpec, Cache cache, @Nullable CacheKeyFactory cacheKeyFactory) {
        String strBuildCacheKey = buildCacheKey(dataSpec, cacheKeyFactory);
        long j = dataSpec.absoluteStreamPosition;
        long requestLength = getRequestLength(dataSpec, cache, strBuildCacheKey);
        long j2 = j;
        long j3 = requestLength;
        long j4 = 0;
        while (j3 != 0) {
            long cachedLength = cache.getCachedLength(strBuildCacheKey, j2, j3 != -1 ? j3 : Long.MAX_VALUE);
            if (cachedLength <= 0) {
                cachedLength = -cachedLength;
                if (cachedLength == Long.MAX_VALUE) {
                    break;
                }
            } else {
                j4 += cachedLength;
            }
            j2 += cachedLength;
            if (j3 == -1) {
                cachedLength = 0;
            }
            j3 -= cachedLength;
        }
        return Pair.create(Long.valueOf(requestLength), Long.valueOf(j4));
    }

    private static long getRequestLength(DataSpec dataSpec, Cache cache, String str) {
        long j = dataSpec.length;
        if (j != -1) {
            return j;
        }
        long jM4795a = C1071Qb.m4795a(cache.getContentMetadata(str));
        if (jM4795a == -1) {
            return -1L;
        }
        return jM4795a - dataSpec.absoluteStreamPosition;
    }

    public static boolean isCausedByPositionOutOfRange(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).reason == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$static$0(DataSpec dataSpec) {
        String str = dataSpec.key;
        return str != null ? str : generateKey(dataSpec.uri);
    }

    private static long readAndDiscard(DataSpec dataSpec, long j, long j2, DataSource dataSource, byte[] bArr, @Nullable PriorityTaskManager priorityTaskManager, int i, @Nullable ProgressNotifier progressNotifier, boolean z, @Nullable AtomicBoolean atomicBoolean) throws InterruptedException, IOException {
        long jOpen;
        boolean z2;
        long j3 = j - dataSpec.absoluteStreamPosition;
        long j4 = -1;
        long j5 = j2 != -1 ? j3 + j2 : -1L;
        long j6 = j3;
        while (true) {
            if (priorityTaskManager != null) {
                priorityTaskManager.proceed(i);
            }
            throwExceptionIfInterruptedOrCancelled(atomicBoolean);
            try {
                if (j5 != j4) {
                    try {
                        jOpen = dataSource.open(dataSpec.subrange(j6, j5 - j6));
                        z2 = true;
                        break;
                    } catch (IOException e) {
                        if (z) {
                            try {
                                if (isCausedByPositionOutOfRange(e)) {
                                    Util.closeQuietly(dataSource);
                                    jOpen = j4;
                                    z2 = false;
                                    break;
                                }
                            } catch (PriorityTaskManager.PriorityTooLowException unused) {
                                Util.closeQuietly(dataSource);
                                j4 = -1;
                            }
                        }
                        throw e;
                    }
                }
                jOpen = j4;
                z2 = false;
                break;
            } catch (Throwable th) {
                Util.closeQuietly(dataSource);
                throw th;
            }
        }
        if (!z2) {
            jOpen = dataSource.open(dataSpec.subrange(j6, j4));
        }
        if (z && progressNotifier != null && jOpen != j4) {
            progressNotifier.onRequestLengthResolved(jOpen + j6);
        }
        while (j6 != j5) {
            throwExceptionIfInterruptedOrCancelled(atomicBoolean);
            int i2 = dataSource.read(bArr, 0, j5 != j4 ? (int) Math.min(bArr.length, j5 - j6) : bArr.length);
            if (i2 == -1) {
                if (progressNotifier == null) {
                    break;
                }
                progressNotifier.onRequestLengthResolved(j6);
                break;
            }
            long j7 = i2;
            j6 += j7;
            if (progressNotifier != null) {
                progressNotifier.onBytesCached(j7);
            }
            j4 = -1;
        }
        long j8 = j6 - j3;
        Util.closeQuietly(dataSource);
        return j8;
    }

    @WorkerThread
    public static void remove(DataSpec dataSpec, Cache cache, @Nullable CacheKeyFactory cacheKeyFactory) {
        remove(cache, buildCacheKey(dataSpec, cacheKeyFactory));
    }

    private static void throwExceptionIfInterruptedOrCancelled(@Nullable AtomicBoolean atomicBoolean) throws InterruptedException {
        if (Thread.interrupted() || (atomicBoolean != null && atomicBoolean.get())) {
            throw new InterruptedException();
        }
    }

    @WorkerThread
    public static void cache(DataSpec dataSpec, Cache cache, @Nullable CacheKeyFactory cacheKeyFactory, CacheDataSource cacheDataSource, byte[] bArr, @Nullable PriorityTaskManager priorityTaskManager, int i, @Nullable ProgressListener progressListener, @Nullable AtomicBoolean atomicBoolean, boolean z) throws InterruptedException, IOException {
        long requestLength;
        ProgressNotifier progressNotifier;
        Assertions.checkNotNull(cacheDataSource);
        Assertions.checkNotNull(bArr);
        String strBuildCacheKey = buildCacheKey(dataSpec, cacheKeyFactory);
        if (progressListener != null) {
            progressNotifier = new ProgressNotifier(progressListener);
            Pair<Long, Long> cached = getCached(dataSpec, cache, cacheKeyFactory);
            progressNotifier.init(((Long) cached.first).longValue(), ((Long) cached.second).longValue());
            requestLength = ((Long) cached.first).longValue();
        } else {
            requestLength = getRequestLength(dataSpec, cache, strBuildCacheKey);
            progressNotifier = null;
        }
        ProgressNotifier progressNotifier2 = progressNotifier;
        long j = dataSpec.absoluteStreamPosition;
        boolean z2 = requestLength == -1;
        long j2 = requestLength;
        long j3 = j;
        while (j2 != 0) {
            throwExceptionIfInterruptedOrCancelled(atomicBoolean);
            long cachedLength = cache.getCachedLength(strBuildCacheKey, j3, z2 ? Long.MAX_VALUE : j2);
            if (cachedLength <= 0) {
                long j4 = -cachedLength;
                long j5 = j4 == Long.MAX_VALUE ? -1L : j4;
                if (readAndDiscard(dataSpec, j3, j5, cacheDataSource, bArr, priorityTaskManager, i, progressNotifier2, j5 == j2, atomicBoolean) < j4) {
                    if (z && !z2) {
                        throw new EOFException();
                    }
                    return;
                }
                cachedLength = j4;
            }
            j3 += cachedLength;
            if (!z2) {
                j2 -= cachedLength;
            }
        }
    }

    @WorkerThread
    public static void remove(Cache cache, String str) {
        Iterator<CacheSpan> it = cache.getCachedSpans(str).iterator();
        while (it.hasNext()) {
            try {
                cache.removeSpan(it.next());
            } catch (Cache.CacheException unused) {
            }
        }
    }
}
