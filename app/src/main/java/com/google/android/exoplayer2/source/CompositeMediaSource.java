package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.CompositeMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CompositeMediaSource<T> extends BaseMediaSource {
    private final HashMap<T, MediaSourceAndListener> childSources = new HashMap<>();

    @Nullable
    private Handler eventHandler;

    @Nullable
    private TransferListener mediaTransferListener;

    public final class ForwardingEventListener implements MediaSourceEventListener {
        private MediaSourceEventListener.EventDispatcher eventDispatcher;

        /* JADX INFO: renamed from: id */
        private final T f11107id;

        public ForwardingEventListener(T t) {
            this.eventDispatcher = CompositeMediaSource.this.createEventDispatcher(null);
            this.f11107id = t;
        }

        private boolean maybeUpdateEventDispatcher(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            MediaSource.MediaPeriodId mediaPeriodIdForChildMediaPeriodId;
            if (mediaPeriodId != null) {
                mediaPeriodIdForChildMediaPeriodId = CompositeMediaSource.this.getMediaPeriodIdForChildMediaPeriodId(this.f11107id, mediaPeriodId);
                if (mediaPeriodIdForChildMediaPeriodId == null) {
                    return false;
                }
            } else {
                mediaPeriodIdForChildMediaPeriodId = null;
            }
            int windowIndexForChildWindowIndex = CompositeMediaSource.this.getWindowIndexForChildWindowIndex(this.f11107id, i);
            MediaSourceEventListener.EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher.windowIndex == windowIndexForChildWindowIndex && Util.areEqual(eventDispatcher.mediaPeriodId, mediaPeriodIdForChildMediaPeriodId)) {
                return true;
            }
            this.eventDispatcher = CompositeMediaSource.this.createEventDispatcher(windowIndexForChildWindowIndex, mediaPeriodIdForChildMediaPeriodId, 0L);
            return true;
        }

        private MediaSourceEventListener.MediaLoadData maybeUpdateMediaLoadData(MediaSourceEventListener.MediaLoadData mediaLoadData) {
            long mediaTimeForChildMediaTime = CompositeMediaSource.this.getMediaTimeForChildMediaTime(this.f11107id, mediaLoadData.mediaStartTimeMs);
            long mediaTimeForChildMediaTime2 = CompositeMediaSource.this.getMediaTimeForChildMediaTime(this.f11107id, mediaLoadData.mediaEndTimeMs);
            return (mediaTimeForChildMediaTime == mediaLoadData.mediaStartTimeMs && mediaTimeForChildMediaTime2 == mediaLoadData.mediaEndTimeMs) ? mediaLoadData : new MediaSourceEventListener.MediaLoadData(mediaLoadData.dataType, mediaLoadData.trackType, mediaLoadData.trackFormat, mediaLoadData.trackSelectionReason, mediaLoadData.trackSelectionData, mediaTimeForChildMediaTime, mediaTimeForChildMediaTime2);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onDownstreamFormatChanged(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i, mediaPeriodId)) {
                this.eventDispatcher.downstreamFormatChanged(maybeUpdateMediaLoadData(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadCanceled(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i, mediaPeriodId)) {
                this.eventDispatcher.loadCanceled(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadCompleted(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i, mediaPeriodId)) {
                this.eventDispatcher.loadCompleted(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadError(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            if (maybeUpdateEventDispatcher(i, mediaPeriodId)) {
                this.eventDispatcher.loadError(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData), iOException, z);
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadStarted(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i, mediaPeriodId)) {
                this.eventDispatcher.loadStarted(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onMediaPeriodCreated(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i, mediaPeriodId) && CompositeMediaSource.this.shouldDispatchCreateOrReleaseEvent((MediaSource.MediaPeriodId) Assertions.checkNotNull(this.eventDispatcher.mediaPeriodId))) {
                this.eventDispatcher.mediaPeriodCreated();
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onMediaPeriodReleased(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i, mediaPeriodId) && CompositeMediaSource.this.shouldDispatchCreateOrReleaseEvent((MediaSource.MediaPeriodId) Assertions.checkNotNull(this.eventDispatcher.mediaPeriodId))) {
                this.eventDispatcher.mediaPeriodReleased();
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onReadingStarted(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i, mediaPeriodId)) {
                this.eventDispatcher.readingStarted();
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onUpstreamDiscarded(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i, mediaPeriodId)) {
                this.eventDispatcher.upstreamDiscarded(maybeUpdateMediaLoadData(mediaLoadData));
            }
        }
    }

    public static final class MediaSourceAndListener {
        public final MediaSource.MediaSourceCaller caller;
        public final MediaSourceEventListener eventListener;
        public final MediaSource mediaSource;

        public MediaSourceAndListener(MediaSource mediaSource, MediaSource.MediaSourceCaller mediaSourceCaller, MediaSourceEventListener mediaSourceEventListener) {
            this.mediaSource = mediaSource;
            this.caller = mediaSourceCaller;
            this.eventListener = mediaSourceEventListener;
        }
    }

    public final void disableChildSource(T t) {
        MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) Assertions.checkNotNull(this.childSources.get(t));
        mediaSourceAndListener.mediaSource.disable(mediaSourceAndListener.caller);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    public void disableInternal() {
        for (MediaSourceAndListener mediaSourceAndListener : this.childSources.values()) {
            mediaSourceAndListener.mediaSource.disable(mediaSourceAndListener.caller);
        }
    }

    public final void enableChildSource(T t) {
        MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) Assertions.checkNotNull(this.childSources.get(t));
        mediaSourceAndListener.mediaSource.enable(mediaSourceAndListener.caller);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    public void enableInternal() {
        for (MediaSourceAndListener mediaSourceAndListener : this.childSources.values()) {
            mediaSourceAndListener.mediaSource.enable(mediaSourceAndListener.caller);
        }
    }

    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(T t, MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId;
    }

    public long getMediaTimeForChildMediaTime(@Nullable T t, long j) {
        return j;
    }

    public int getWindowIndexForChildWindowIndex(T t, int i) {
        return i;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    @CallSuper
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator<MediaSourceAndListener> it = this.childSources.values().iterator();
        while (it.hasNext()) {
            it.next().mediaSource.maybeThrowSourceInfoRefreshError();
        }
    }

    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: merged with bridge method [inline-methods] */
    public abstract void lambda$prepareChildSource$0(T t, MediaSource mediaSource, Timeline timeline);

    public final void prepareChildSource(final T t, MediaSource mediaSource) {
        Assertions.checkArgument(!this.childSources.containsKey(t));
        MediaSource.MediaSourceCaller mediaSourceCaller = new MediaSource.MediaSourceCaller(this, t) { // from class: eb

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ CompositeMediaSource f13759a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Object f13760b;

            /* JADX WARN: Invalid debug info offset */
            @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
            public final void onSourceInfoRefreshed(MediaSource mediaSource2, Timeline timeline) {
            }
        };
        ForwardingEventListener forwardingEventListener = new ForwardingEventListener(t);
        this.childSources.put(t, new MediaSourceAndListener(mediaSource, mediaSourceCaller, forwardingEventListener));
        mediaSource.addEventListener((Handler) Assertions.checkNotNull(this.eventHandler), forwardingEventListener);
        mediaSource.prepareSource(mediaSourceCaller, this.mediaTransferListener);
        if (isEnabled()) {
            return;
        }
        mediaSource.disable(mediaSourceCaller);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        this.mediaTransferListener = transferListener;
        this.eventHandler = new Handler();
    }

    public final void releaseChildSource(T t) {
        MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) Assertions.checkNotNull(this.childSources.remove(t));
        mediaSourceAndListener.mediaSource.releaseSource(mediaSourceAndListener.caller);
        mediaSourceAndListener.mediaSource.removeEventListener(mediaSourceAndListener.eventListener);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    public void releaseSourceInternal() {
        for (MediaSourceAndListener mediaSourceAndListener : this.childSources.values()) {
            mediaSourceAndListener.mediaSource.releaseSource(mediaSourceAndListener.caller);
            mediaSourceAndListener.mediaSource.removeEventListener(mediaSourceAndListener.eventListener);
        }
        this.childSources.clear();
    }

    public boolean shouldDispatchCreateOrReleaseEvent(MediaSource.MediaPeriodId mediaPeriodId) {
        return true;
    }
}
