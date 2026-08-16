package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.CompositeMediaSource;
import com.google.android.exoplayer2.source.MaskingMediaPeriod;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p000.C4261e2;
import p000.C5630w2;

/* JADX INFO: loaded from: classes2.dex */
public final class AdsMediaSource extends CompositeMediaSource<MediaSource.MediaPeriodId> {
    private static final MediaSource.MediaPeriodId DUMMY_CONTENT_MEDIA_PERIOD_ID = new MediaSource.MediaPeriodId(new Object());
    private final MediaSourceFactory adMediaSourceFactory;
    private AdMediaSourceHolder[][] adMediaSourceHolders;

    @Nullable
    private AdPlaybackState adPlaybackState;
    private final AdsLoader.AdViewProvider adViewProvider;
    private final AdsLoader adsLoader;

    @Nullable
    private ComponentListener componentListener;
    private final MediaSource contentMediaSource;

    @Nullable
    private Timeline contentTimeline;
    private final Handler mainHandler;
    private final Timeline.Period period;

    public static final class AdLoadException extends IOException {
        public static final int TYPE_AD = 0;
        public static final int TYPE_AD_GROUP = 1;
        public static final int TYPE_ALL_ADS = 2;
        public static final int TYPE_UNEXPECTED = 3;
        public final int type;

        /* JADX INFO: loaded from: classes.dex */
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        private AdLoadException(int i, Exception exc) {
            super(exc);
            this.type = i;
        }

        public static AdLoadException createForAd(Exception exc) {
            return new AdLoadException(0, exc);
        }

        public static AdLoadException createForAdGroup(Exception exc, int i) {
            return new AdLoadException(1, new IOException(C5630w2.m29215a("Failed to load ad group ", i), exc));
        }

        public static AdLoadException createForAllAds(Exception exc) {
            return new AdLoadException(2, exc);
        }

        public static AdLoadException createForUnexpected(RuntimeException runtimeException) {
            return new AdLoadException(3, runtimeException);
        }

        public RuntimeException getRuntimeExceptionForUnexpected() {
            Assertions.checkState(this.type == 3);
            return (RuntimeException) Assertions.checkNotNull(getCause());
        }
    }

    public final class AdMediaSourceHolder {
        private final List<MaskingMediaPeriod> activeMediaPeriods = new ArrayList();
        private final MediaSource adMediaSource;
        private Timeline timeline;

        public AdMediaSourceHolder(MediaSource mediaSource) {
            this.adMediaSource = mediaSource;
        }

        public MediaPeriod createMediaPeriod(Uri uri, MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
            MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(this.adMediaSource, mediaPeriodId, allocator, j);
            maskingMediaPeriod.setPrepareErrorListener(AdsMediaSource.this.new AdPrepareErrorListener(uri, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup));
            this.activeMediaPeriods.add(maskingMediaPeriod);
            Timeline timeline = this.timeline;
            if (timeline != null) {
                maskingMediaPeriod.createPeriod(new MediaSource.MediaPeriodId(timeline.getUidOfPeriod(0), mediaPeriodId.windowSequenceNumber));
            }
            return maskingMediaPeriod;
        }

        public long getDurationUs() {
            Timeline timeline = this.timeline;
            return timeline == null ? C3219C.TIME_UNSET : timeline.getPeriod(0, AdsMediaSource.this.period).getDurationUs();
        }

        public void handleSourceInfoRefresh(Timeline timeline) {
            Assertions.checkArgument(timeline.getPeriodCount() == 1);
            if (this.timeline == null) {
                Object uidOfPeriod = timeline.getUidOfPeriod(0);
                for (int i = 0; i < this.activeMediaPeriods.size(); i++) {
                    MaskingMediaPeriod maskingMediaPeriod = this.activeMediaPeriods.get(i);
                    maskingMediaPeriod.createPeriod(new MediaSource.MediaPeriodId(uidOfPeriod, maskingMediaPeriod.f11108id.windowSequenceNumber));
                }
            }
            this.timeline = timeline;
        }

        public boolean isInactive() {
            return this.activeMediaPeriods.isEmpty();
        }

        public void releaseMediaPeriod(MaskingMediaPeriod maskingMediaPeriod) {
            this.activeMediaPeriods.remove(maskingMediaPeriod);
            maskingMediaPeriod.releasePeriod();
        }
    }

    public final class AdPrepareErrorListener implements MaskingMediaPeriod.PrepareErrorListener {
        private final int adGroupIndex;
        private final int adIndexInAdGroup;
        private final Uri adUri;

        public AdPrepareErrorListener(Uri uri, int i, int i2) {
            this.adUri = uri;
            this.adGroupIndex = i;
            this.adIndexInAdGroup = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPrepareError$0(IOException iOException) {
            AdsMediaSource.this.adsLoader.handlePrepareError(this.adGroupIndex, this.adIndexInAdGroup, iOException);
        }

        @Override // com.google.android.exoplayer2.source.MaskingMediaPeriod.PrepareErrorListener
        public void onPrepareError(MediaSource.MediaPeriodId mediaPeriodId, final IOException iOException) {
            AdsMediaSource.this.createEventDispatcher(mediaPeriodId).loadError(new DataSpec(this.adUri), this.adUri, Collections.emptyMap(), 6, -1L, 0L, 0L, AdLoadException.createForAd(iOException), true);
            AdsMediaSource.this.mainHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11113a.lambda$onPrepareError$0(iOException);
                }
            });
        }
    }

    public final class ComponentListener implements AdsLoader.EventListener {
        private final Handler playerHandler = new Handler();
        private volatile boolean released;

        public ComponentListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdPlaybackState$0(AdPlaybackState adPlaybackState) {
            if (this.released) {
                return;
            }
            AdsMediaSource.this.onAdPlaybackState(adPlaybackState);
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public /* synthetic */ void onAdClicked() {
            C4261e2.m20017a(this);
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public void onAdLoadError(AdLoadException adLoadException, DataSpec dataSpec) {
            if (this.released) {
                return;
            }
            AdsMediaSource.this.createEventDispatcher(null).loadError(dataSpec, dataSpec.uri, Collections.emptyMap(), 6, SystemClock.elapsedRealtime(), 0L, 0L, adLoadException, true);
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public void onAdPlaybackState(final AdPlaybackState adPlaybackState) {
            if (this.released) {
                return;
            }
            this.playerHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11115a.lambda$onAdPlaybackState$0(adPlaybackState);
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public /* synthetic */ void onAdTapped() {
            C4261e2.m20020d(this);
        }

        public void release() {
            this.released = true;
            this.playerHandler.removeCallbacksAndMessages(null);
        }
    }

    public AdsMediaSource(MediaSource mediaSource, MediaSourceFactory mediaSourceFactory, AdsLoader adsLoader, AdsLoader.AdViewProvider adViewProvider) {
        this.contentMediaSource = mediaSource;
        this.adMediaSourceFactory = mediaSourceFactory;
        this.adsLoader = adsLoader;
        this.adViewProvider = adViewProvider;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.period = new Timeline.Period();
        this.adMediaSourceHolders = new AdMediaSourceHolder[0][];
        adsLoader.setSupportedContentTypes(mediaSourceFactory.getSupportedTypes());
    }

    private long[][] getAdDurationsUs() {
        long[][] jArr = new long[this.adMediaSourceHolders.length][];
        int i = 0;
        while (true) {
            AdMediaSourceHolder[][] adMediaSourceHolderArr = this.adMediaSourceHolders;
            if (i >= adMediaSourceHolderArr.length) {
                return jArr;
            }
            jArr[i] = new long[adMediaSourceHolderArr[i].length];
            int i2 = 0;
            while (true) {
                AdMediaSourceHolder[] adMediaSourceHolderArr2 = this.adMediaSourceHolders[i];
                if (i2 < adMediaSourceHolderArr2.length) {
                    AdMediaSourceHolder adMediaSourceHolder = adMediaSourceHolderArr2[i2];
                    jArr[i][i2] = adMediaSourceHolder == null ? C3219C.TIME_UNSET : adMediaSourceHolder.getDurationUs();
                    i2++;
                }
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareSourceInternal$0(ComponentListener componentListener) {
        this.adsLoader.start(componentListener, this.adViewProvider);
    }

    private void maybeUpdateSourceInfo() {
        Timeline singlePeriodAdTimeline = this.contentTimeline;
        AdPlaybackState adPlaybackState = this.adPlaybackState;
        if (adPlaybackState == null || singlePeriodAdTimeline == null) {
            return;
        }
        AdPlaybackState adPlaybackStateWithAdDurationsUs = adPlaybackState.withAdDurationsUs(getAdDurationsUs());
        this.adPlaybackState = adPlaybackStateWithAdDurationsUs;
        if (adPlaybackStateWithAdDurationsUs.adGroupCount != 0) {
            singlePeriodAdTimeline = new SinglePeriodAdTimeline(singlePeriodAdTimeline, this.adPlaybackState);
        }
        refreshSourceInfo(singlePeriodAdTimeline);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdPlaybackState(AdPlaybackState adPlaybackState) {
        if (this.adPlaybackState == null) {
            AdMediaSourceHolder[][] adMediaSourceHolderArr = new AdMediaSourceHolder[adPlaybackState.adGroupCount][];
            this.adMediaSourceHolders = adMediaSourceHolderArr;
            Arrays.fill(adMediaSourceHolderArr, new AdMediaSourceHolder[0]);
        }
        this.adPlaybackState = adPlaybackState;
        maybeUpdateSourceInfo();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        AdMediaSourceHolder adMediaSourceHolder;
        AdPlaybackState adPlaybackState = (AdPlaybackState) Assertions.checkNotNull(this.adPlaybackState);
        if (adPlaybackState.adGroupCount <= 0 || !mediaPeriodId.isAd()) {
            MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(this.contentMediaSource, mediaPeriodId, allocator, j);
            maskingMediaPeriod.createPeriod(mediaPeriodId);
            return maskingMediaPeriod;
        }
        int i = mediaPeriodId.adGroupIndex;
        int i2 = mediaPeriodId.adIndexInAdGroup;
        Uri uri = (Uri) Assertions.checkNotNull(adPlaybackState.adGroups[i].uris[i2]);
        AdMediaSourceHolder[][] adMediaSourceHolderArr = this.adMediaSourceHolders;
        AdMediaSourceHolder[] adMediaSourceHolderArr2 = adMediaSourceHolderArr[i];
        if (adMediaSourceHolderArr2.length <= i2) {
            adMediaSourceHolderArr[i] = (AdMediaSourceHolder[]) Arrays.copyOf(adMediaSourceHolderArr2, i2 + 1);
        }
        AdMediaSourceHolder adMediaSourceHolder2 = this.adMediaSourceHolders[i][i2];
        if (adMediaSourceHolder2 == null) {
            MediaSource mediaSourceCreateMediaSource = this.adMediaSourceFactory.createMediaSource(uri);
            adMediaSourceHolder = new AdMediaSourceHolder(mediaSourceCreateMediaSource);
            this.adMediaSourceHolders[i][i2] = adMediaSourceHolder;
            prepareChildSource(mediaPeriodId, mediaSourceCreateMediaSource);
        } else {
            adMediaSourceHolder = adMediaSourceHolder2;
        }
        return adMediaSourceHolder.createMediaPeriod(uri, mediaPeriodId, allocator, j);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId, MediaSource.MediaPeriodId mediaPeriodId2) {
        return mediaPeriodId.isAd() ? mediaPeriodId : mediaPeriodId2;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    @Nullable
    public Object getTag() {
        return this.contentMediaSource.getTag();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public void lambda$prepareChildSource$0(MediaSource.MediaPeriodId mediaPeriodId, MediaSource mediaSource, Timeline timeline) {
        if (mediaPeriodId.isAd()) {
            ((AdMediaSourceHolder) Assertions.checkNotNull(this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup])).handleSourceInfoRefresh(timeline);
        } else {
            Assertions.checkArgument(timeline.getPeriodCount() == 1);
            this.contentTimeline = timeline;
        }
        maybeUpdateSourceInfo();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        final ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        prepareChildSource(DUMMY_CONTENT_MEDIA_PERIOD_ID, this.contentMediaSource);
        this.mainHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f11111a.lambda$prepareSourceInternal$0(componentListener);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        MaskingMediaPeriod maskingMediaPeriod = (MaskingMediaPeriod) mediaPeriod;
        MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod.f11108id;
        if (!mediaPeriodId.isAd()) {
            maskingMediaPeriod.releasePeriod();
            return;
        }
        AdMediaSourceHolder adMediaSourceHolder = (AdMediaSourceHolder) Assertions.checkNotNull(this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup]);
        adMediaSourceHolder.releaseMediaPeriod(maskingMediaPeriod);
        if (adMediaSourceHolder.isInactive()) {
            releaseChildSource(mediaPeriodId);
            this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup] = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        ((ComponentListener) Assertions.checkNotNull(this.componentListener)).release();
        this.componentListener = null;
        this.contentTimeline = null;
        this.adPlaybackState = null;
        this.adMediaSourceHolders = new AdMediaSourceHolder[0][];
        Handler handler = this.mainHandler;
        final AdsLoader adsLoader = this.adsLoader;
        adsLoader.getClass();
        handler.post(new Runnable(adsLoader) { // from class: f2

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AdsLoader f13883a;

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    public AdsMediaSource(MediaSource mediaSource, DataSource.Factory factory, AdsLoader adsLoader, AdsLoader.AdViewProvider adViewProvider) {
        this(mediaSource, new ProgressiveMediaSource.Factory(factory), adsLoader, adViewProvider);
    }
}
