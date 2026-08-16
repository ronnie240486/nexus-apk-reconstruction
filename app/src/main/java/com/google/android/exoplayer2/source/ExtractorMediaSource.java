package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;
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
import p000.C1367VB;
import p000.C4335fC;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class ExtractorMediaSource extends CompositeMediaSource<Void> {

    @Deprecated
    public static final int DEFAULT_LOADING_CHECK_INTERVAL_BYTES = 1048576;
    private final ProgressiveMediaSource progressiveMediaSource;

    @Deprecated
    public interface EventListener {
        void onLoadError(IOException iOException);
    }

    @Deprecated
    public static final class EventListenerWrapper implements MediaSourceEventListener {
        private final EventListener eventListener;

        public EventListenerWrapper(EventListener eventListener) {
            this.eventListener = (EventListener) Assertions.checkNotNull(eventListener);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public /* synthetic */ void onDownstreamFormatChanged(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            C1367VB.m6488a(this, i, mediaPeriodId, mediaLoadData);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public /* synthetic */ void onLoadCanceled(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            C1367VB.m6489b(this, i, mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public /* synthetic */ void onLoadCompleted(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            C1367VB.m6490c(this, i, mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadError(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            this.eventListener.onLoadError(iOException);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public /* synthetic */ void onLoadStarted(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            C1367VB.m6492e(this, i, mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public /* synthetic */ void onMediaPeriodCreated(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            C1367VB.m6493f(this, i, mediaPeriodId);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public /* synthetic */ void onMediaPeriodReleased(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            C1367VB.m6494g(this, i, mediaPeriodId);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public /* synthetic */ void onReadingStarted(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            C1367VB.m6495h(this, i, mediaPeriodId);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public /* synthetic */ void onUpstreamDiscarded(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            C1367VB.m6496i(this, i, mediaPeriodId, mediaLoadData);
        }
    }

    @Deprecated
    public static final class Factory implements MediaSourceFactory {

        @Nullable
        private String customCacheKey;
        private final DataSource.Factory dataSourceFactory;

        @Nullable
        private ExtractorsFactory extractorsFactory;
        private boolean isCreateCalled;

        @Nullable
        private Object tag;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
        private int continueLoadingCheckIntervalBytes = 1048576;

        public Factory(DataSource.Factory factory) {
            this.dataSourceFactory = factory;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public ExtractorMediaSource createMediaSource(Uri uri) {
            this.isCreateCalled = true;
            if (this.extractorsFactory == null) {
                this.extractorsFactory = new DefaultExtractorsFactory();
            }
            return new ExtractorMediaSource(uri, this.dataSourceFactory, this.extractorsFactory, this.loadErrorHandlingPolicy, this.customCacheKey, this.continueLoadingCheckIntervalBytes, this.tag);
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

        public Factory setCustomCacheKey(String str) {
            Assertions.checkState(!this.isCreateCalled);
            this.customCacheKey = str;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        public Factory setDrmSessionManager(DrmSessionManager<?> drmSessionManager) {
            throw new UnsupportedOperationException();
        }

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

        @Deprecated
        public Factory setMinLoadableRetryCount(int i) {
            return setLoadErrorHandlingPolicy(new DefaultLoadErrorHandlingPolicy(i));
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

        @Deprecated
        public ExtractorMediaSource createMediaSource(Uri uri, @Nullable Handler handler, @Nullable MediaSourceEventListener mediaSourceEventListener) {
            ExtractorMediaSource extractorMediaSourceCreateMediaSource = createMediaSource(uri);
            if (handler != null && mediaSourceEventListener != null) {
                extractorMediaSourceCreateMediaSource.addEventListener(handler, mediaSourceEventListener);
            }
            return extractorMediaSourceCreateMediaSource;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        public /* bridge */ /* synthetic */ MediaSourceFactory setDrmSessionManager(DrmSessionManager drmSessionManager) {
            return setDrmSessionManager((DrmSessionManager<?>) drmSessionManager);
        }
    }

    @Deprecated
    public ExtractorMediaSource(Uri uri, DataSource.Factory factory, ExtractorsFactory extractorsFactory, @Nullable Handler handler, @Nullable EventListener eventListener) {
        this(uri, factory, extractorsFactory, handler, eventListener, null);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        return this.progressiveMediaSource.createPeriod(mediaPeriodId, allocator, j);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    @Nullable
    public Object getTag() {
        return this.progressiveMediaSource.getTag();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        prepareChildSource(null, this.progressiveMediaSource);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        this.progressiveMediaSource.releasePeriod(mediaPeriod);
    }

    @Deprecated
    public ExtractorMediaSource(Uri uri, DataSource.Factory factory, ExtractorsFactory extractorsFactory, @Nullable Handler handler, @Nullable EventListener eventListener, @Nullable String str) {
        this(uri, factory, extractorsFactory, handler, eventListener, str, 1048576);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void lambda$prepareChildSource$0(@Nullable Void r1, MediaSource mediaSource, Timeline timeline) {
        refreshSourceInfo(timeline);
    }

    @Deprecated
    public ExtractorMediaSource(Uri uri, DataSource.Factory factory, ExtractorsFactory extractorsFactory, @Nullable Handler handler, @Nullable EventListener eventListener, @Nullable String str, int i) {
        this(uri, factory, extractorsFactory, new DefaultLoadErrorHandlingPolicy(), str, i, (Object) null);
        if (eventListener == null || handler == null) {
            return;
        }
        addEventListener(handler, new EventListenerWrapper(eventListener));
    }

    private ExtractorMediaSource(Uri uri, DataSource.Factory factory, ExtractorsFactory extractorsFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy, @Nullable String str, int i, @Nullable Object obj) {
        this.progressiveMediaSource = new ProgressiveMediaSource(uri, factory, extractorsFactory, C0499Hg.m2391d(), loadErrorHandlingPolicy, str, i, obj);
    }
}
