package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.TeeDataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p000.C1071Qb;

/* JADX INFO: loaded from: classes2.dex */
public final class CacheDataSource implements DataSource {
    public static final int CACHE_IGNORED_REASON_ERROR = 0;
    public static final int CACHE_IGNORED_REASON_UNSET_LENGTH = 1;
    private static final int CACHE_NOT_IGNORED = -1;
    public static final int FLAG_BLOCK_ON_CACHE = 1;
    public static final int FLAG_IGNORE_CACHE_FOR_UNSET_LENGTH_REQUESTS = 4;
    public static final int FLAG_IGNORE_CACHE_ON_ERROR = 2;
    private static final long MIN_READ_BEFORE_CHECKING_CACHE = 102400;

    @Nullable
    private Uri actualUri;
    private final boolean blockOnCache;
    private long bytesRemaining;
    private final Cache cache;
    private final CacheKeyFactory cacheKeyFactory;
    private final DataSource cacheReadDataSource;

    @Nullable
    private final DataSource cacheWriteDataSource;
    private long checkCachePosition;

    @Nullable
    private DataSource currentDataSource;
    private boolean currentDataSpecLengthUnset;

    @Nullable
    private CacheSpan currentHoleSpan;
    private boolean currentRequestIgnoresCache;

    @Nullable
    private final EventListener eventListener;
    private int flags;

    @Nullable
    private byte[] httpBody;
    private int httpMethod;
    private Map<String, String> httpRequestHeaders;
    private final boolean ignoreCacheForUnsetLengthRequests;
    private final boolean ignoreCacheOnError;

    @Nullable
    private String key;
    private long readPosition;
    private boolean seenCacheError;
    private long totalCachedBytesRead;
    private final DataSource upstreamDataSource;

    @Nullable
    private Uri uri;

    /* JADX INFO: loaded from: classes.dex */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface CacheIgnoredReason {
    }

    public interface EventListener {
        void onCacheIgnored(int i);

        void onCachedBytesRead(long j, long j2);
    }

    /* JADX INFO: loaded from: classes.dex */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public CacheDataSource(Cache cache, DataSource dataSource) {
        this(cache, dataSource, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void closeCurrentSource() throws IOException {
        DataSource dataSource = this.currentDataSource;
        if (dataSource == null) {
            return;
        }
        try {
            dataSource.close();
        } finally {
            this.currentDataSource = null;
            this.currentDataSpecLengthUnset = false;
            CacheSpan cacheSpan = this.currentHoleSpan;
            if (cacheSpan != null) {
                this.cache.releaseHoleSpan(cacheSpan);
                this.currentHoleSpan = null;
            }
        }
    }

    private static Uri getRedirectedUriOrDefault(Cache cache, String str, Uri uri) {
        Uri uriM4796b = C1071Qb.m4796b(cache.getContentMetadata(str));
        return uriM4796b != null ? uriM4796b : uri;
    }

    private void handleBeforeThrow(Throwable th) {
        if (isReadingFromCache() || (th instanceof Cache.CacheException)) {
            this.seenCacheError = true;
        }
    }

    private boolean isBypassingCache() {
        return this.currentDataSource == this.upstreamDataSource;
    }

    private boolean isReadingFromCache() {
        return this.currentDataSource == this.cacheReadDataSource;
    }

    private boolean isReadingFromUpstream() {
        return !isReadingFromCache();
    }

    private boolean isWritingToCache() {
        return this.currentDataSource == this.cacheWriteDataSource;
    }

    private void notifyBytesRead() {
        EventListener eventListener = this.eventListener;
        if (eventListener == null || this.totalCachedBytesRead <= 0) {
            return;
        }
        eventListener.onCachedBytesRead(this.cache.getCacheSpace(), this.totalCachedBytesRead);
        this.totalCachedBytesRead = 0L;
    }

    private void notifyCacheIgnored(int i) {
        EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.onCacheIgnored(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00db  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0115  */
    /* JADX WARN: Code duplicated, block: B:58:0x0117  */
    /* JADX WARN: Code duplicated, block: B:66:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x014a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0155  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    private void openNextSource(boolean z) throws IOException {
        CacheSpan cacheSpanStartReadWrite;
        long jMin;
        DataSource dataSource;
        DataSpec dataSpec;
        CacheSpan cacheSpan;
        DataSpec dataSpec2;
        DataSource dataSource2;
        long j;
        boolean z2;
        long jOpen;
        ContentMetadataMutations contentMetadataMutations;
        if (this.currentRequestIgnoresCache) {
            cacheSpanStartReadWrite = null;
        } else if (this.blockOnCache) {
            try {
                cacheSpanStartReadWrite = this.cache.startReadWrite(this.key, this.readPosition);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            cacheSpanStartReadWrite = this.cache.startReadWriteNonBlocking(this.key, this.readPosition);
        }
        if (cacheSpanStartReadWrite != null) {
            if (cacheSpanStartReadWrite.isCached) {
                Uri uriFromFile = Uri.fromFile(cacheSpanStartReadWrite.file);
                long j2 = this.readPosition - cacheSpanStartReadWrite.position;
                long jMin2 = cacheSpanStartReadWrite.length - j2;
                long j3 = this.bytesRemaining;
                if (j3 != -1) {
                    jMin2 = Math.min(jMin2, j3);
                }
                dataSpec2 = new DataSpec(uriFromFile, this.readPosition, j2, jMin2, this.key, this.flags);
                dataSource2 = this.cacheReadDataSource;
            } else {
                if (cacheSpanStartReadWrite.isOpenEnded()) {
                    jMin = this.bytesRemaining;
                } else {
                    jMin = cacheSpanStartReadWrite.length;
                    long j4 = this.bytesRemaining;
                    if (j4 != -1) {
                        jMin = Math.min(jMin, j4);
                    }
                }
                long j5 = jMin;
                Uri uri = this.uri;
                int i = this.httpMethod;
                byte[] bArr = this.httpBody;
                long j6 = this.readPosition;
                DataSpec dataSpec3 = new DataSpec(uri, i, bArr, j6, j6, j5, this.key, this.flags, this.httpRequestHeaders);
                dataSource = this.cacheWriteDataSource;
                if (dataSource != null) {
                    cacheSpan = cacheSpanStartReadWrite;
                    dataSpec = dataSpec3;
                } else {
                    dataSource = this.upstreamDataSource;
                    this.cache.releaseHoleSpan(cacheSpanStartReadWrite);
                    dataSpec = dataSpec3;
                    cacheSpan = null;
                }
            }
            if (this.currentRequestIgnoresCache && dataSource == this.upstreamDataSource) {
                j = this.readPosition + MIN_READ_BEFORE_CHECKING_CACHE;
            } else {
                j = Long.MAX_VALUE;
            }
            this.checkCachePosition = j;
            if (z) {
                Assertions.checkState(isBypassingCache());
                if (dataSource == this.upstreamDataSource) {
                    return;
                }
                try {
                    closeCurrentSource();
                } catch (Throwable th) {
                    if (!cacheSpan.isHoleSpan()) {
                        throw th;
                    }
                    this.cache.releaseHoleSpan(cacheSpan);
                    throw th;
                }
            }
            if (cacheSpan != null && cacheSpan.isHoleSpan()) {
                this.currentHoleSpan = cacheSpan;
            }
            this.currentDataSource = dataSource;
            if (dataSpec.length == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.currentDataSpecLengthUnset = z2;
            jOpen = dataSource.open(dataSpec);
            contentMetadataMutations = new ContentMetadataMutations();
            if (this.currentDataSpecLengthUnset && jOpen != -1) {
                this.bytesRemaining = jOpen;
                ContentMetadataMutations.setContentLength(contentMetadataMutations, this.readPosition + jOpen);
            }
            if (isReadingFromUpstream()) {
                Uri uri2 = this.currentDataSource.getUri();
                this.actualUri = uri2;
                ContentMetadataMutations.setRedirectedUri(contentMetadataMutations, this.uri.equals(uri2) ^ true ? this.actualUri : null);
            }
            if (isWritingToCache()) {
                this.cache.applyContentMetadataMutations(this.key, contentMetadataMutations);
            }
        }
        dataSource2 = this.upstreamDataSource;
        Uri uri3 = this.uri;
        int i2 = this.httpMethod;
        byte[] bArr2 = this.httpBody;
        long j7 = this.readPosition;
        dataSpec2 = new DataSpec(uri3, i2, bArr2, j7, j7, this.bytesRemaining, this.key, this.flags, this.httpRequestHeaders);
        dataSource = dataSource2;
        cacheSpan = cacheSpanStartReadWrite;
        dataSpec = dataSpec2;
        if (this.currentRequestIgnoresCache) {
            j = Long.MAX_VALUE;
        } else {
            j = Long.MAX_VALUE;
        }
        this.checkCachePosition = j;
        if (z) {
            Assertions.checkState(isBypassingCache());
            if (dataSource == this.upstreamDataSource) {
                return;
            } else {
                closeCurrentSource();
            }
        }
        if (cacheSpan != null) {
            this.currentHoleSpan = cacheSpan;
        }
        this.currentDataSource = dataSource;
        if (dataSpec.length == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.currentDataSpecLengthUnset = z2;
        jOpen = dataSource.open(dataSpec);
        contentMetadataMutations = new ContentMetadataMutations();
        if (this.currentDataSpecLengthUnset) {
            this.bytesRemaining = jOpen;
            ContentMetadataMutations.setContentLength(contentMetadataMutations, this.readPosition + jOpen);
        }
        if (isReadingFromUpstream()) {
            Uri uri4 = this.currentDataSource.getUri();
            this.actualUri = uri4;
            ContentMetadataMutations.setRedirectedUri(contentMetadataMutations, this.uri.equals(uri4) ^ true ? this.actualUri : null);
        }
        if (isWritingToCache()) {
            this.cache.applyContentMetadataMutations(this.key, contentMetadataMutations);
        }
    }

    private void setNoBytesRemainingAndMaybeStoreLength() throws IOException {
        this.bytesRemaining = 0L;
        if (isWritingToCache()) {
            ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
            ContentMetadataMutations.setContentLength(contentMetadataMutations, this.readPosition);
            this.cache.applyContentMetadataMutations(this.key, contentMetadataMutations);
        }
    }

    private int shouldIgnoreCacheForRequest(DataSpec dataSpec) {
        if (this.ignoreCacheOnError && this.seenCacheError) {
            return 0;
        }
        return (this.ignoreCacheForUnsetLengthRequests && dataSpec.length == -1) ? 1 : -1;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
        this.cacheReadDataSource.addTransferListener(transferListener);
        this.upstreamDataSource.addTransferListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        this.uri = null;
        this.actualUri = null;
        this.httpMethod = 1;
        this.httpBody = null;
        this.httpRequestHeaders = Collections.emptyMap();
        this.flags = 0;
        this.readPosition = 0L;
        this.key = null;
        notifyBytesRead();
        try {
            closeCurrentSource();
        } catch (Throwable th) {
            handleBeforeThrow(th);
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        return isReadingFromUpstream() ? this.upstreamDataSource.getResponseHeaders() : Collections.emptyMap();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return this.actualUri;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        try {
            String strBuildCacheKey = this.cacheKeyFactory.buildCacheKey(dataSpec);
            this.key = strBuildCacheKey;
            Uri uri = dataSpec.uri;
            this.uri = uri;
            this.actualUri = getRedirectedUriOrDefault(this.cache, strBuildCacheKey, uri);
            this.httpMethod = dataSpec.httpMethod;
            this.httpBody = dataSpec.httpBody;
            this.httpRequestHeaders = dataSpec.httpRequestHeaders;
            this.flags = dataSpec.flags;
            this.readPosition = dataSpec.position;
            int iShouldIgnoreCacheForRequest = shouldIgnoreCacheForRequest(dataSpec);
            boolean z = iShouldIgnoreCacheForRequest != -1;
            this.currentRequestIgnoresCache = z;
            if (z) {
                notifyCacheIgnored(iShouldIgnoreCacheForRequest);
            }
            long j = dataSpec.length;
            if (j != -1 || this.currentRequestIgnoresCache) {
                this.bytesRemaining = j;
            } else {
                long jM4795a = C1071Qb.m4795a(this.cache.getContentMetadata(this.key));
                this.bytesRemaining = jM4795a;
                if (jM4795a != -1) {
                    long j2 = jM4795a - dataSpec.position;
                    this.bytesRemaining = j2;
                    if (j2 <= 0) {
                        throw new DataSourceException(0);
                    }
                }
            }
            openNextSource(false);
            return this.bytesRemaining;
        } catch (Throwable th) {
            handleBeforeThrow(th);
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        try {
            if (this.readPosition >= this.checkCachePosition) {
                openNextSource(true);
            }
            int i3 = this.currentDataSource.read(bArr, i, i2);
            if (i3 != -1) {
                if (isReadingFromCache()) {
                    this.totalCachedBytesRead += (long) i3;
                }
                long j = i3;
                this.readPosition += j;
                long j2 = this.bytesRemaining;
                if (j2 != -1) {
                    this.bytesRemaining = j2 - j;
                }
            } else {
                if (!this.currentDataSpecLengthUnset) {
                    long j3 = this.bytesRemaining;
                    if (j3 <= 0) {
                        if (j3 == -1) {
                        }
                    }
                    closeCurrentSource();
                    openNextSource(false);
                    return read(bArr, i, i2);
                }
                setNoBytesRemainingAndMaybeStoreLength();
            }
            return i3;
        } catch (IOException e) {
            if (this.currentDataSpecLengthUnset && CacheUtil.isCausedByPositionOutOfRange(e)) {
                setNoBytesRemainingAndMaybeStoreLength();
                return -1;
            }
            handleBeforeThrow(e);
            throw e;
        } catch (Throwable th) {
            handleBeforeThrow(th);
            throw th;
        }
    }

    public CacheDataSource(Cache cache, DataSource dataSource, int i) {
        this(cache, dataSource, new FileDataSource(), new CacheDataSink(cache, CacheDataSink.DEFAULT_FRAGMENT_SIZE), i, null);
    }

    public CacheDataSource(Cache cache, DataSource dataSource, DataSource dataSource2, @Nullable DataSink dataSink, int i, @Nullable EventListener eventListener) {
        this(cache, dataSource, dataSource2, dataSink, i, eventListener, null);
    }

    public CacheDataSource(Cache cache, DataSource dataSource, DataSource dataSource2, @Nullable DataSink dataSink, int i, @Nullable EventListener eventListener, @Nullable CacheKeyFactory cacheKeyFactory) {
        this.httpRequestHeaders = Collections.emptyMap();
        this.cache = cache;
        this.cacheReadDataSource = dataSource2;
        this.cacheKeyFactory = cacheKeyFactory == null ? CacheUtil.DEFAULT_CACHE_KEY_FACTORY : cacheKeyFactory;
        this.blockOnCache = (i & 1) != 0;
        this.ignoreCacheOnError = (i & 2) != 0;
        this.ignoreCacheForUnsetLengthRequests = (i & 4) != 0;
        this.upstreamDataSource = dataSource;
        this.cacheWriteDataSource = dataSink != null ? new TeeDataSource(dataSource, dataSink) : null;
        this.eventListener = eventListener;
    }
}
