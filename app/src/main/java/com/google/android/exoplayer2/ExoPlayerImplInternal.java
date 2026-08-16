package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C5516uN;

/* JADX INFO: loaded from: classes2.dex */
final class ExoPlayerImplInternal implements Handler.Callback, MediaPeriod.Callback, TrackSelector.InvalidationListener, MediaSource.MediaSourceCaller, DefaultMediaClock.PlaybackParameterListener, PlayerMessage.Sender {
    private static final int ACTIVE_INTERVAL_MS = 10;
    private static final int IDLE_INTERVAL_MS = 1000;
    private static final int MSG_DO_SOME_WORK = 2;
    private static final int MSG_PERIOD_PREPARED = 9;
    public static final int MSG_PLAYBACK_INFO_CHANGED = 0;
    public static final int MSG_PLAYBACK_PARAMETERS_CHANGED = 1;
    private static final int MSG_PLAYBACK_PARAMETERS_CHANGED_INTERNAL = 17;
    private static final int MSG_PREPARE = 0;
    private static final int MSG_REFRESH_SOURCE_INFO = 8;
    private static final int MSG_RELEASE = 7;
    private static final int MSG_SEEK_TO = 3;
    private static final int MSG_SEND_MESSAGE = 15;
    private static final int MSG_SEND_MESSAGE_TO_TARGET_THREAD = 16;
    private static final int MSG_SET_FOREGROUND_MODE = 14;
    private static final int MSG_SET_PLAYBACK_PARAMETERS = 4;
    private static final int MSG_SET_PLAY_WHEN_READY = 1;
    private static final int MSG_SET_REPEAT_MODE = 12;
    private static final int MSG_SET_SEEK_PARAMETERS = 5;
    private static final int MSG_SET_SHUFFLE_ENABLED = 13;
    private static final int MSG_SOURCE_CONTINUE_LOADING_REQUESTED = 10;
    private static final int MSG_STOP = 6;
    private static final int MSG_TRACK_SELECTION_INVALIDATED = 11;
    private static final String TAG = "ExoPlayerImplInternal";
    private final long backBufferDurationUs;
    private final BandwidthMeter bandwidthMeter;
    private final Clock clock;
    private boolean deliverPendingMessageAtStartPositionRequired;
    private final TrackSelectorResult emptyTrackSelectorResult;
    private Renderer[] enabledRenderers;
    private final Handler eventHandler;
    private boolean foregroundMode;
    private final HandlerWrapper handler;
    private final HandlerThread internalPlaybackThread;
    private final LoadControl loadControl;
    private final DefaultMediaClock mediaClock;
    private MediaSource mediaSource;
    private int nextPendingMessageIndexHint;
    private SeekPosition pendingInitialSeekPosition;
    private final ArrayList<PendingMessageInfo> pendingMessages;
    private int pendingPrepareCount;
    private final Timeline.Period period;
    private boolean playWhenReady;
    private PlaybackInfo playbackInfo;
    private boolean rebuffering;
    private boolean released;
    private final RendererCapabilities[] rendererCapabilities;
    private long rendererPositionUs;
    private final Renderer[] renderers;
    private int repeatMode;
    private final boolean retainBackBufferFromKeyframe;
    private boolean shouldContinueLoading;
    private boolean shuffleModeEnabled;
    private final TrackSelector trackSelector;
    private final Timeline.Window window;
    private final MediaPeriodQueue queue = new MediaPeriodQueue();
    private SeekParameters seekParameters = SeekParameters.DEFAULT;
    private final PlaybackInfoUpdate playbackInfoUpdate = new PlaybackInfoUpdate();

    public static final class MediaSourceRefreshInfo {
        public final MediaSource source;
        public final Timeline timeline;

        public MediaSourceRefreshInfo(MediaSource mediaSource, Timeline timeline) {
            this.source = mediaSource;
            this.timeline = timeline;
        }
    }

    public static final class PendingMessageInfo implements Comparable<PendingMessageInfo> {
        public final PlayerMessage message;
        public int resolvedPeriodIndex;
        public long resolvedPeriodTimeUs;

        @Nullable
        public Object resolvedPeriodUid;

        public PendingMessageInfo(PlayerMessage playerMessage) {
            this.message = playerMessage;
        }

        @Override // java.lang.Comparable
        public int compareTo(PendingMessageInfo pendingMessageInfo) {
            Object obj = this.resolvedPeriodUid;
            if ((obj == null) != (pendingMessageInfo.resolvedPeriodUid == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.resolvedPeriodIndex - pendingMessageInfo.resolvedPeriodIndex;
            return i != 0 ? i : Util.compareLong(this.resolvedPeriodTimeUs, pendingMessageInfo.resolvedPeriodTimeUs);
        }

        public void setResolvedPosition(int i, long j, Object obj) {
            this.resolvedPeriodIndex = i;
            this.resolvedPeriodTimeUs = j;
            this.resolvedPeriodUid = obj;
        }
    }

    public static final class PlaybackInfoUpdate {
        private int discontinuityReason;
        private PlaybackInfo lastPlaybackInfo;
        private int operationAcks;
        private boolean positionDiscontinuity;

        private PlaybackInfoUpdate() {
        }

        public boolean hasPendingUpdate(PlaybackInfo playbackInfo) {
            return playbackInfo != this.lastPlaybackInfo || this.operationAcks > 0 || this.positionDiscontinuity;
        }

        public void incrementPendingOperationAcks(int i) {
            this.operationAcks += i;
        }

        public void reset(PlaybackInfo playbackInfo) {
            this.lastPlaybackInfo = playbackInfo;
            this.operationAcks = 0;
            this.positionDiscontinuity = false;
        }

        public void setPositionDiscontinuity(int i) {
            if (this.positionDiscontinuity && this.discontinuityReason != 4) {
                Assertions.checkArgument(i == 4);
            } else {
                this.positionDiscontinuity = true;
                this.discontinuityReason = i;
            }
        }
    }

    public static final class SeekPosition {
        public final Timeline timeline;
        public final int windowIndex;
        public final long windowPositionUs;

        public SeekPosition(Timeline timeline, int i, long j) {
            this.timeline = timeline;
            this.windowIndex = i;
            this.windowPositionUs = j;
        }
    }

    public ExoPlayerImplInternal(Renderer[] rendererArr, TrackSelector trackSelector, TrackSelectorResult trackSelectorResult, LoadControl loadControl, BandwidthMeter bandwidthMeter, boolean z, int i, boolean z2, Handler handler, Clock clock) {
        this.renderers = rendererArr;
        this.trackSelector = trackSelector;
        this.emptyTrackSelectorResult = trackSelectorResult;
        this.loadControl = loadControl;
        this.bandwidthMeter = bandwidthMeter;
        this.playWhenReady = z;
        this.repeatMode = i;
        this.shuffleModeEnabled = z2;
        this.eventHandler = handler;
        this.clock = clock;
        this.backBufferDurationUs = loadControl.getBackBufferDurationUs();
        this.retainBackBufferFromKeyframe = loadControl.retainBackBufferFromKeyframe();
        this.playbackInfo = PlaybackInfo.createDummy(C3219C.TIME_UNSET, trackSelectorResult);
        this.rendererCapabilities = new RendererCapabilities[rendererArr.length];
        for (int i2 = 0; i2 < rendererArr.length; i2++) {
            rendererArr[i2].setIndex(i2);
            this.rendererCapabilities[i2] = rendererArr[i2].getCapabilities();
        }
        this.mediaClock = new DefaultMediaClock(this, clock);
        this.pendingMessages = new ArrayList<>();
        this.enabledRenderers = new Renderer[0];
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        trackSelector.init(this, bandwidthMeter);
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.internalPlaybackThread = handlerThread;
        handlerThread.start();
        this.handler = clock.createHandler(handlerThread.getLooper(), this);
        this.deliverPendingMessageAtStartPositionRequired = true;
    }

    private PlaybackInfo copyWithNewPosition(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2) {
        this.deliverPendingMessageAtStartPositionRequired = true;
        return this.playbackInfo.copyWithNewPosition(mediaPeriodId, j, j2, getTotalBufferedDurationUs());
    }

    private void deliverMessage(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.isCanceled()) {
            return;
        }
        try {
            playerMessage.getTarget().handleMessage(playerMessage.getType(), playerMessage.getPayload());
        } finally {
            playerMessage.markAsProcessed(true);
        }
    }

    private void disableRenderer(Renderer renderer) throws ExoPlaybackException {
        this.mediaClock.onRendererDisabled(renderer);
        ensureStopped(renderer);
        renderer.disable();
    }

    /* JADX WARN: Code duplicated, block: B:84:0x011d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0122 A[LOOP:1: B:85:0x0120->B:86:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Instruction removed from duplicated block: B:84:0x011d, please report this as an issue */
    private void doSomeWork() throws ExoPlaybackException, IOException {
        boolean z;
        boolean z2;
        int i;
        int i2;
        long j;
        long jUptimeMillis = this.clock.uptimeMillis();
        updatePeriods();
        int i3 = this.playbackInfo.playbackState;
        if (i3 == 1 || i3 == 4) {
            this.handler.removeMessages(2);
            return;
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            scheduleNextWork(jUptimeMillis, 10L);
            return;
        }
        TraceUtil.beginSection("doSomeWork");
        updatePlaybackPositions();
        if (playingPeriod.prepared) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            playingPeriod.mediaPeriod.discardBuffer(this.playbackInfo.positionUs - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
            int i4 = 0;
            boolean z3 = true;
            boolean z4 = true;
            while (true) {
                Renderer[] rendererArr = this.renderers;
                if (i4 >= rendererArr.length) {
                    break;
                }
                Renderer renderer = rendererArr[i4];
                if (renderer.getState() != 0) {
                    renderer.render(this.rendererPositionUs, jElapsedRealtime);
                    z3 = z3 && renderer.isEnded();
                    boolean z5 = playingPeriod.sampleStreams[i4] != renderer.getStream();
                    boolean z6 = z5 || (!z5 && playingPeriod.getNext() != null && renderer.hasReadStreamToEnd()) || renderer.isReady() || renderer.isEnded();
                    z4 = z4 && z6;
                    if (!z6) {
                        renderer.maybeThrowStreamError();
                    }
                }
                i4++;
            }
            z = z3;
            z2 = z4;
        } else {
            playingPeriod.mediaPeriod.maybeThrowPrepareError();
            z = true;
            z2 = true;
        }
        long j2 = playingPeriod.f19778info.durationUs;
        if (z && playingPeriod.prepared && ((j2 == C3219C.TIME_UNSET || j2 <= this.playbackInfo.positionUs) && playingPeriod.f19778info.isFinal)) {
            setState(4);
            stopRenderers();
        } else {
            if (this.playbackInfo.playbackState != 2 || !shouldTransitionToReadyState(z2)) {
                if (this.playbackInfo.playbackState == 3 && (this.enabledRenderers.length != 0 ? !z2 : !isTimelineReady())) {
                    this.rebuffering = this.playWhenReady;
                    i = 2;
                    setState(2);
                    stopRenderers();
                }
                if (this.playbackInfo.playbackState == i) {
                    for (Renderer renderer2 : this.enabledRenderers) {
                        renderer2.maybeThrowStreamError();
                    }
                }
                if ((this.playWhenReady || this.playbackInfo.playbackState != 3) && (i2 = this.playbackInfo.playbackState) != 2) {
                    if (this.enabledRenderers.length != 0 || i2 == 4) {
                        this.handler.removeMessages(2);
                    } else {
                        j = 1000;
                    }
                    TraceUtil.endSection();
                }
                j = 10;
                scheduleNextWork(jUptimeMillis, j);
                TraceUtil.endSection();
            }
            setState(3);
            if (this.playWhenReady) {
                startRenderers();
            }
        }
        i = 2;
        if (this.playbackInfo.playbackState == i) {
            while (i < r5) {
                renderer2.maybeThrowStreamError();
            }
        }
        if (this.playWhenReady) {
            if (this.enabledRenderers.length != 0) {
            }
            this.handler.removeMessages(2);
        } else {
            if (this.enabledRenderers.length != 0) {
            }
            this.handler.removeMessages(2);
        }
        TraceUtil.endSection();
    }

    private void enableRenderer(int i, boolean z, int i2) throws ExoPlaybackException {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        Renderer renderer = this.renderers[i];
        this.enabledRenderers[i2] = renderer;
        if (renderer.getState() == 0) {
            TrackSelectorResult trackSelectorResult = playingPeriod.getTrackSelectorResult();
            RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i];
            Format[] formats = getFormats(trackSelectorResult.selections.get(i));
            boolean z2 = this.playWhenReady && this.playbackInfo.playbackState == 3;
            renderer.enable(rendererConfiguration, formats, playingPeriod.sampleStreams[i], this.rendererPositionUs, !z && z2, playingPeriod.getRendererOffset());
            this.mediaClock.onRendererEnabled(renderer);
            if (z2) {
                renderer.start();
            }
        }
    }

    private void enableRenderers(boolean[] zArr, int i) throws ExoPlaybackException {
        this.enabledRenderers = new Renderer[i];
        TrackSelectorResult trackSelectorResult = this.queue.getPlayingPeriod().getTrackSelectorResult();
        for (int i2 = 0; i2 < this.renderers.length; i2++) {
            if (!trackSelectorResult.isRendererEnabled(i2)) {
                this.renderers[i2].reset();
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.renderers.length; i4++) {
            if (trackSelectorResult.isRendererEnabled(i4)) {
                enableRenderer(i4, zArr[i4], i3);
                i3++;
            }
        }
    }

    private void ensureStopped(Renderer renderer) throws ExoPlaybackException {
        if (renderer.getState() == 2) {
            renderer.stop();
        }
    }

    private String getExoPlaybackExceptionMessage(ExoPlaybackException exoPlaybackException) {
        if (exoPlaybackException.type != 1) {
            return "Playback error.";
        }
        return "Renderer error: index=" + exoPlaybackException.rendererIndex + ", type=" + Util.getTrackTypeString(this.renderers[exoPlaybackException.rendererIndex].getTrackType()) + ", format=" + exoPlaybackException.rendererFormat + ", rendererSupport=" + C5516uN.m28608e(exoPlaybackException.rendererFormatSupport);
    }

    private static Format[] getFormats(TrackSelection trackSelection) {
        int length = trackSelection != null ? trackSelection.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i = 0; i < length; i++) {
            formatArr[i] = trackSelection.getFormat(i);
        }
        return formatArr;
    }

    private long getMaxRendererReadPositionUs() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null) {
            return 0L;
        }
        long rendererOffset = readingPeriod.getRendererOffset();
        if (!readingPeriod.prepared) {
            return rendererOffset;
        }
        int i = 0;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i >= rendererArr.length) {
                return rendererOffset;
            }
            if (rendererArr[i].getState() != 0 && this.renderers[i].getStream() == readingPeriod.sampleStreams[i]) {
                long readingPositionUs = this.renderers[i].getReadingPositionUs();
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                rendererOffset = Math.max(readingPositionUs, rendererOffset);
            }
            i++;
        }
    }

    private Pair<Object, Long> getPeriodPosition(Timeline timeline, int i, long j) {
        return timeline.getPeriodPosition(this.window, this.period, i, j);
    }

    private long getTotalBufferedDurationUs() {
        return getTotalBufferedDurationUs(this.playbackInfo.bufferedPositionUs);
    }

    private void handleContinueLoadingRequested(MediaPeriod mediaPeriod) {
        if (this.queue.isLoading(mediaPeriod)) {
            this.queue.reevaluateBuffer(this.rendererPositionUs);
            maybeContinueLoading();
        }
    }

    private void handleLoadingMediaPeriodChanged(boolean z) {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        MediaSource.MediaPeriodId mediaPeriodId = loadingPeriod == null ? this.playbackInfo.periodId : loadingPeriod.f19778info.f11056id;
        boolean z2 = !this.playbackInfo.loadingMediaPeriodId.equals(mediaPeriodId);
        if (z2) {
            this.playbackInfo = this.playbackInfo.copyWithLoadingMediaPeriodId(mediaPeriodId);
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        playbackInfo.bufferedPositionUs = loadingPeriod == null ? playbackInfo.positionUs : loadingPeriod.getBufferedPositionUs();
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        if ((z2 || z) && loadingPeriod != null && loadingPeriod.prepared) {
            updateLoadControlTrackSelection(loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
        }
    }

    private void handlePeriodPrepared(MediaPeriod mediaPeriod) throws ExoPlaybackException {
        if (this.queue.isLoading(mediaPeriod)) {
            MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
            loadingPeriod.handlePrepared(this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.timeline);
            updateLoadControlTrackSelection(loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
            if (loadingPeriod == this.queue.getPlayingPeriod()) {
                resetRendererPosition(loadingPeriod.f19778info.startPositionUs);
                updatePlayingPeriodRenderers(null);
            }
            maybeContinueLoading();
        }
    }

    private void handlePlaybackParameters(PlaybackParameters playbackParameters, boolean z) throws ExoPlaybackException {
        this.eventHandler.obtainMessage(1, z ? 1 : 0, 0, playbackParameters).sendToTarget();
        updateTrackSelectionPlaybackSpeed(playbackParameters.speed);
        for (Renderer renderer : this.renderers) {
            if (renderer != null) {
                renderer.setOperatingRate(playbackParameters.speed);
            }
        }
    }

    private void handleSourceInfoRefreshEndedPlayback() {
        if (this.playbackInfo.playbackState != 1) {
            setState(4);
        }
        resetInternal(false, false, true, false, true);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0100  */
    /* JADX WARN: Code duplicated, block: B:47:0x0108 A[LOOP:0: B:47:0x0108->B:61:0x0108, LOOP_START, PHI: r12
      0x0108: PHI (r12v18 com.google.android.exoplayer2.MediaPeriodHolder) = (r12v15 com.google.android.exoplayer2.MediaPeriodHolder), (r12v19 com.google.android.exoplayer2.MediaPeriodHolder) binds: [B:46:0x0106, B:61:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x010e  */
    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0130  */
    /* JADX WARN: Code duplicated, block: B:60:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0108 A[SYNTHETIC] */
    private void handleSourceInfoRefreshed(MediaSourceRefreshInfo mediaSourceRefreshInfo) throws ExoPlaybackException {
        MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAds;
        long jLongValue;
        Pair<Object, Long> periodPosition;
        MediaPeriodHolder playingPeriod;
        long j;
        if (mediaSourceRefreshInfo.source != this.mediaSource) {
            return;
        }
        this.playbackInfoUpdate.incrementPendingOperationAcks(this.pendingPrepareCount);
        this.pendingPrepareCount = 0;
        Timeline timeline = this.playbackInfo.timeline;
        Timeline timeline2 = mediaSourceRefreshInfo.timeline;
        this.queue.setTimeline(timeline2);
        this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline2);
        resolvePendingMessagePositions();
        MediaSource.MediaPeriodId mediaPeriodId = this.playbackInfo.periodId;
        long j2 = mediaPeriodId.isAd() ? this.playbackInfo.contentPositionUs : this.playbackInfo.positionUs;
        SeekPosition seekPosition = this.pendingInitialSeekPosition;
        if (seekPosition == null) {
            if (j2 == C3219C.TIME_UNSET && !timeline2.isEmpty()) {
                Pair<Object, Long> periodPosition2 = getPeriodPosition(timeline2, timeline2.getFirstWindowIndex(this.shuffleModeEnabled), C3219C.TIME_UNSET);
                MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAds2 = this.queue.resolveMediaPeriodIdForAds(periodPosition2.first, ((Long) periodPosition2.second).longValue());
                jLongValue = !mediaPeriodIdResolveMediaPeriodIdForAds2.isAd() ? ((Long) periodPosition2.second).longValue() : j2;
                mediaPeriodIdResolveMediaPeriodIdForAds = mediaPeriodIdResolveMediaPeriodIdForAds2;
            } else if (timeline2.getIndexOfPeriod(mediaPeriodId.periodUid) == -1) {
                Object objResolveSubsequentPeriod = resolveSubsequentPeriod(mediaPeriodId.periodUid, timeline, timeline2);
                if (objResolveSubsequentPeriod == null) {
                    handleSourceInfoRefreshEndedPlayback();
                    return;
                }
                periodPosition = getPeriodPosition(timeline2, timeline2.getPeriodByUid(objResolveSubsequentPeriod, this.period).windowIndex, C3219C.TIME_UNSET);
            } else {
                MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAds3 = this.queue.resolveMediaPeriodIdForAds(this.playbackInfo.periodId.periodUid, j2);
                if (!this.playbackInfo.periodId.isAd() && !mediaPeriodIdResolveMediaPeriodIdForAds3.isAd()) {
                    mediaPeriodIdResolveMediaPeriodIdForAds3 = this.playbackInfo.periodId;
                }
                mediaPeriodIdResolveMediaPeriodIdForAds = mediaPeriodIdResolveMediaPeriodIdForAds3;
                jLongValue = j2;
            }
            if (this.playbackInfo.periodId.equals(mediaPeriodIdResolveMediaPeriodIdForAds) || j2 != jLongValue) {
                playingPeriod = this.queue.getPlayingPeriod();
                if (playingPeriod != null) {
                    while (playingPeriod.getNext() != null) {
                        playingPeriod = playingPeriod.getNext();
                        if (playingPeriod.f19778info.f11056id.equals(mediaPeriodIdResolveMediaPeriodIdForAds)) {
                            playingPeriod.f19778info = this.queue.getUpdatedMediaPeriodInfo(playingPeriod.f19778info);
                        }
                    }
                }
                if (mediaPeriodIdResolveMediaPeriodIdForAds.isAd()) {
                    j = 0;
                } else {
                    j = jLongValue;
                }
                this.playbackInfo = copyWithNewPosition(mediaPeriodIdResolveMediaPeriodIdForAds, seekToPeriodPosition(mediaPeriodIdResolveMediaPeriodIdForAds, j), jLongValue);
            } else if (!this.queue.updateQueuedPeriods(this.rendererPositionUs, getMaxRendererReadPositionUs())) {
                seekToCurrentPosition(false);
            }
            handleLoadingMediaPeriodChanged(false);
        }
        periodPosition = resolveSeekPosition(seekPosition, true);
        this.pendingInitialSeekPosition = null;
        if (periodPosition == null) {
            handleSourceInfoRefreshEndedPlayback();
            return;
        }
        long jLongValue2 = ((Long) periodPosition.second).longValue();
        mediaPeriodIdResolveMediaPeriodIdForAds = this.queue.resolveMediaPeriodIdForAds(periodPosition.first, jLongValue2);
        jLongValue = jLongValue2;
        if (this.playbackInfo.periodId.equals(mediaPeriodIdResolveMediaPeriodIdForAds)) {
            playingPeriod = this.queue.getPlayingPeriod();
            if (playingPeriod != null) {
                while (playingPeriod.getNext() != null) {
                    playingPeriod = playingPeriod.getNext();
                    if (playingPeriod.f19778info.f11056id.equals(mediaPeriodIdResolveMediaPeriodIdForAds)) {
                        playingPeriod.f19778info = this.queue.getUpdatedMediaPeriodInfo(playingPeriod.f19778info);
                    }
                }
            }
            if (mediaPeriodIdResolveMediaPeriodIdForAds.isAd()) {
                j = 0;
            } else {
                j = jLongValue;
            }
            this.playbackInfo = copyWithNewPosition(mediaPeriodIdResolveMediaPeriodIdForAds, seekToPeriodPosition(mediaPeriodIdResolveMediaPeriodIdForAds, j), jLongValue);
        } else {
            playingPeriod = this.queue.getPlayingPeriod();
            if (playingPeriod != null) {
                while (playingPeriod.getNext() != null) {
                    playingPeriod = playingPeriod.getNext();
                    if (playingPeriod.f19778info.f11056id.equals(mediaPeriodIdResolveMediaPeriodIdForAds)) {
                        playingPeriod.f19778info = this.queue.getUpdatedMediaPeriodInfo(playingPeriod.f19778info);
                    }
                }
            }
            if (mediaPeriodIdResolveMediaPeriodIdForAds.isAd()) {
                j = 0;
            } else {
                j = jLongValue;
            }
            this.playbackInfo = copyWithNewPosition(mediaPeriodIdResolveMediaPeriodIdForAds, seekToPeriodPosition(mediaPeriodIdResolveMediaPeriodIdForAds, j), jLongValue);
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private boolean hasReadingPeriodFinishedReading() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (!readingPeriod.prepared) {
            return false;
        }
        int i = 0;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i >= rendererArr.length) {
                return true;
            }
            Renderer renderer = rendererArr[i];
            SampleStream sampleStream = readingPeriod.sampleStreams[i];
            if (renderer.getStream() != sampleStream || (sampleStream != null && !renderer.hasReadStreamToEnd())) {
                return false;
            }
            i++;
        }
    }

    private boolean isLoadingPossible() {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        return (loadingPeriod == null || loadingPeriod.getNextLoadPositionUs() == Long.MIN_VALUE) ? false : true;
    }

    private boolean isTimelineReady() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long j = playingPeriod.f19778info.durationUs;
        return playingPeriod.prepared && (j == C3219C.TIME_UNSET || this.playbackInfo.positionUs < j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessageToTargetThread$0(PlayerMessage playerMessage) {
        try {
            deliverMessage(playerMessage);
        } catch (ExoPlaybackException e) {
            Log.m17583e(TAG, "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private void maybeContinueLoading() {
        boolean zShouldContinueLoading = shouldContinueLoading();
        this.shouldContinueLoading = zShouldContinueLoading;
        if (zShouldContinueLoading) {
            this.queue.getLoadingPeriod().continueLoading(this.rendererPositionUs);
        }
        updateIsLoading();
    }

    private void maybeNotifyPlaybackInfoChanged() {
        if (this.playbackInfoUpdate.hasPendingUpdate(this.playbackInfo)) {
            this.eventHandler.obtainMessage(0, this.playbackInfoUpdate.operationAcks, this.playbackInfoUpdate.positionDiscontinuity ? this.playbackInfoUpdate.discontinuityReason : -1, this.playbackInfo).sendToTarget();
            this.playbackInfoUpdate.reset(this.playbackInfo);
        }
    }

    private void maybeThrowSourceInfoRefreshError() throws IOException {
        if (this.queue.getLoadingPeriod() != null) {
            for (Renderer renderer : this.enabledRenderers) {
                if (!renderer.hasReadStreamToEnd()) {
                    return;
                }
            }
        }
        this.mediaSource.maybeThrowSourceInfoRefreshError();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007e A[LOOP:1: B:31:0x007f->B:30:0x007e, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x007f, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0099 -> B:29:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void maybeTriggerPendingMessages(long j, long j2) throws ExoPlaybackException {
        PendingMessageInfo pendingMessageInfo;
        if (this.pendingMessages.isEmpty() || this.playbackInfo.periodId.isAd()) {
            return;
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.startPositionUs == j && this.deliverPendingMessageAtStartPositionRequired) {
            j--;
        }
        this.deliverPendingMessageAtStartPositionRequired = false;
        int indexOfPeriod = playbackInfo.timeline.getIndexOfPeriod(playbackInfo.periodId.periodUid);
        int iMin = Math.min(this.nextPendingMessageIndexHint, this.pendingMessages.size());
        PendingMessageInfo pendingMessageInfo2 = iMin > 0 ? this.pendingMessages.get(iMin - 1) : null;
        while (pendingMessageInfo2 != null) {
            int i = pendingMessageInfo2.resolvedPeriodIndex;
            if (i <= indexOfPeriod && (i != indexOfPeriod || pendingMessageInfo2.resolvedPeriodTimeUs <= j)) {
                break;
            }
            int i2 = iMin - 1;
            pendingMessageInfo2 = i2 > 0 ? this.pendingMessages.get(iMin - 2) : null;
            iMin = i2;
        }
        if (iMin < this.pendingMessages.size()) {
            pendingMessageInfo = this.pendingMessages.get(iMin);
        } else {
            pendingMessageInfo = null;
        }
        while (true) {
            if (pendingMessageInfo == null && pendingMessageInfo.resolvedPeriodUid != null) {
                int i3 = pendingMessageInfo.resolvedPeriodIndex;
                if (i3 < indexOfPeriod || (i3 == indexOfPeriod && pendingMessageInfo.resolvedPeriodTimeUs <= j)) {
                    iMin++;
                    if (iMin < this.pendingMessages.size()) {
                        pendingMessageInfo = this.pendingMessages.get(iMin);
                    } else {
                        pendingMessageInfo = null;
                    }
                    if (pendingMessageInfo == null) {
                    }
                }
            }
            while (pendingMessageInfo != null && pendingMessageInfo.resolvedPeriodUid != null && pendingMessageInfo.resolvedPeriodIndex == indexOfPeriod) {
                long j3 = pendingMessageInfo.resolvedPeriodTimeUs;
                if (j3 <= j || j3 > j2) {
                    break;
                }
                try {
                    sendMessageToTarget(pendingMessageInfo.message);
                    if (pendingMessageInfo.message.getDeleteAfterDelivery() || pendingMessageInfo.message.isCanceled()) {
                        this.pendingMessages.remove(iMin);
                    } else {
                        iMin++;
                    }
                    pendingMessageInfo = iMin < this.pendingMessages.size() ? this.pendingMessages.get(iMin) : null;
                } catch (Throwable th) {
                    if (pendingMessageInfo.message.getDeleteAfterDelivery() || pendingMessageInfo.message.isCanceled()) {
                        this.pendingMessages.remove(iMin);
                    }
                    throw th;
                }
            }
            this.nextPendingMessageIndexHint = iMin;
            return;
        }
    }

    private void maybeUpdateLoadingPeriod() throws ExoPlaybackException, IOException {
        this.queue.reevaluateBuffer(this.rendererPositionUs);
        if (this.queue.shouldLoadNextMediaPeriod()) {
            MediaPeriodInfo nextMediaPeriodInfo = this.queue.getNextMediaPeriodInfo(this.rendererPositionUs, this.playbackInfo);
            if (nextMediaPeriodInfo == null) {
                maybeThrowSourceInfoRefreshError();
            } else {
                MediaPeriodHolder mediaPeriodHolderEnqueueNextMediaPeriodHolder = this.queue.enqueueNextMediaPeriodHolder(this.rendererCapabilities, this.trackSelector, this.loadControl.getAllocator(), this.mediaSource, nextMediaPeriodInfo, this.emptyTrackSelectorResult);
                mediaPeriodHolderEnqueueNextMediaPeriodHolder.mediaPeriod.prepare(this, nextMediaPeriodInfo.startPositionUs);
                if (this.queue.getPlayingPeriod() == mediaPeriodHolderEnqueueNextMediaPeriodHolder) {
                    resetRendererPosition(mediaPeriodHolderEnqueueNextMediaPeriodHolder.getStartPositionRendererTime());
                }
                handleLoadingMediaPeriodChanged(false);
            }
        }
        if (!this.shouldContinueLoading) {
            maybeContinueLoading();
        } else {
            this.shouldContinueLoading = isLoadingPossible();
            updateIsLoading();
        }
    }

    private void maybeUpdatePlayingPeriod() throws ExoPlaybackException {
        boolean z = false;
        while (shouldAdvancePlayingPeriod()) {
            if (z) {
                maybeNotifyPlaybackInfoChanged();
            }
            MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
            if (playingPeriod == this.queue.getReadingPeriod()) {
                setAllRendererStreamsFinal();
            }
            MediaPeriodHolder mediaPeriodHolderAdvancePlayingPeriod = this.queue.advancePlayingPeriod();
            updatePlayingPeriodRenderers(playingPeriod);
            MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolderAdvancePlayingPeriod.f19778info;
            this.playbackInfo = copyWithNewPosition(mediaPeriodInfo.f11056id, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.contentPositionUs);
            this.playbackInfoUpdate.setPositionDiscontinuity(playingPeriod.f19778info.isLastInTimelinePeriod ? 0 : 3);
            updatePlaybackPositions();
            z = true;
        }
    }

    private void maybeUpdateReadingPeriod() throws ExoPlaybackException {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null) {
            return;
        }
        int i = 0;
        if (readingPeriod.getNext() == null) {
            if (!readingPeriod.f19778info.isFinal) {
                return;
            }
            while (true) {
                Renderer[] rendererArr = this.renderers;
                if (i >= rendererArr.length) {
                    return;
                }
                Renderer renderer = rendererArr[i];
                SampleStream sampleStream = readingPeriod.sampleStreams[i];
                if (sampleStream != null && renderer.getStream() == sampleStream && renderer.hasReadStreamToEnd()) {
                    renderer.setCurrentStreamFinal();
                }
                i++;
            }
        } else {
            if (!hasReadingPeriodFinishedReading() || !readingPeriod.getNext().prepared) {
                return;
            }
            TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
            MediaPeriodHolder mediaPeriodHolderAdvanceReadingPeriod = this.queue.advanceReadingPeriod();
            TrackSelectorResult trackSelectorResult2 = mediaPeriodHolderAdvanceReadingPeriod.getTrackSelectorResult();
            if (mediaPeriodHolderAdvanceReadingPeriod.mediaPeriod.readDiscontinuity() != C3219C.TIME_UNSET) {
                setAllRendererStreamsFinal();
                return;
            }
            int i2 = 0;
            while (true) {
                Renderer[] rendererArr2 = this.renderers;
                if (i2 >= rendererArr2.length) {
                    return;
                }
                Renderer renderer2 = rendererArr2[i2];
                if (trackSelectorResult.isRendererEnabled(i2) && !renderer2.isCurrentStreamFinal()) {
                    TrackSelection trackSelection = trackSelectorResult2.selections.get(i2);
                    boolean zIsRendererEnabled = trackSelectorResult2.isRendererEnabled(i2);
                    boolean z = this.rendererCapabilities[i2].getTrackType() == 6;
                    RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i2];
                    RendererConfiguration rendererConfiguration2 = trackSelectorResult2.rendererConfigurations[i2];
                    if (zIsRendererEnabled && rendererConfiguration2.equals(rendererConfiguration) && !z) {
                        renderer2.replaceStream(getFormats(trackSelection), mediaPeriodHolderAdvanceReadingPeriod.sampleStreams[i2], mediaPeriodHolderAdvanceReadingPeriod.getRendererOffset());
                    } else {
                        renderer2.setCurrentStreamFinal();
                    }
                }
                i2++;
            }
        }
    }

    private void notifyTrackSelectionDiscontinuity() {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (TrackSelection trackSelection : playingPeriod.getTrackSelectorResult().selections.getAll()) {
                if (trackSelection != null) {
                    trackSelection.onDiscontinuity();
                }
            }
        }
    }

    private void prepareInternal(MediaSource mediaSource, boolean z, boolean z2) {
        this.pendingPrepareCount++;
        resetInternal(false, true, z, z2, true);
        this.loadControl.onPrepared();
        this.mediaSource = mediaSource;
        setState(2);
        mediaSource.prepareSource(this, this.bandwidthMeter.getTransferListener());
        this.handler.sendEmptyMessage(2);
    }

    private void releaseInternal() {
        resetInternal(true, true, true, true, false);
        this.loadControl.onReleased();
        setState(1);
        this.internalPlaybackThread.quit();
        synchronized (this) {
            this.released = true;
            notifyAll();
        }
    }

    private void reselectTracksInternal() throws ExoPlaybackException {
        float f = this.mediaClock.getPlaybackParameters().speed;
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        boolean z = true;
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null && playingPeriod.prepared; playingPeriod = playingPeriod.getNext()) {
            TrackSelectorResult trackSelectorResultSelectTracks = playingPeriod.selectTracks(f, this.playbackInfo.timeline);
            if (!trackSelectorResultSelectTracks.isEquivalent(playingPeriod.getTrackSelectorResult())) {
                MediaPeriodQueue mediaPeriodQueue = this.queue;
                if (z) {
                    MediaPeriodHolder playingPeriod2 = mediaPeriodQueue.getPlayingPeriod();
                    boolean zRemoveAfter = this.queue.removeAfter(playingPeriod2);
                    boolean[] zArr = new boolean[this.renderers.length];
                    long jApplyTrackSelection = playingPeriod2.applyTrackSelection(trackSelectorResultSelectTracks, this.playbackInfo.positionUs, zRemoveAfter, zArr);
                    PlaybackInfo playbackInfo = this.playbackInfo;
                    if (playbackInfo.playbackState != 4 && jApplyTrackSelection != playbackInfo.positionUs) {
                        PlaybackInfo playbackInfo2 = this.playbackInfo;
                        this.playbackInfo = copyWithNewPosition(playbackInfo2.periodId, jApplyTrackSelection, playbackInfo2.contentPositionUs);
                        this.playbackInfoUpdate.setPositionDiscontinuity(4);
                        resetRendererPosition(jApplyTrackSelection);
                    }
                    boolean[] zArr2 = new boolean[this.renderers.length];
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        Renderer[] rendererArr = this.renderers;
                        if (i >= rendererArr.length) {
                            break;
                        }
                        Renderer renderer = rendererArr[i];
                        boolean z2 = renderer.getState() != 0;
                        zArr2[i] = z2;
                        SampleStream sampleStream = playingPeriod2.sampleStreams[i];
                        if (sampleStream != null) {
                            i2++;
                        }
                        if (z2) {
                            if (sampleStream != renderer.getStream()) {
                                disableRenderer(renderer);
                            } else if (zArr[i]) {
                                renderer.resetPosition(this.rendererPositionUs);
                            }
                        }
                        i++;
                    }
                    this.playbackInfo = this.playbackInfo.copyWithTrackInfo(playingPeriod2.getTrackGroups(), playingPeriod2.getTrackSelectorResult());
                    enableRenderers(zArr2, i2);
                } else {
                    mediaPeriodQueue.removeAfter(playingPeriod);
                    if (playingPeriod.prepared) {
                        playingPeriod.applyTrackSelection(trackSelectorResultSelectTracks, Math.max(playingPeriod.f19778info.startPositionUs, playingPeriod.toPeriodTime(this.rendererPositionUs)), false);
                    }
                }
                handleLoadingMediaPeriodChanged(true);
                if (this.playbackInfo.playbackState != 4) {
                    maybeContinueLoading();
                    updatePlaybackPositions();
                    this.handler.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            if (playingPeriod == readingPeriod) {
                z = false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6 A[LOOP:2: B:36:0x00a0->B:38:0x00a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00df  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:64:0x0103  */
    /* JADX WARN: Code duplicated, block: B:66:0x0108  */
    /* JADX WARN: Code duplicated, block: B:68:0x010d  */
    private void resetInternal(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        PlaybackInfo playbackInfo;
        MediaSource.MediaPeriodId dummyFirstMediaPeriodId;
        long j;
        long j2;
        Timeline timeline;
        PlaybackInfo playbackInfo2;
        ExoPlaybackException exoPlaybackException;
        TrackGroupArray trackGroupArray;
        TrackSelectorResult trackSelectorResult;
        MediaSource mediaSource;
        Iterator<PendingMessageInfo> it;
        this.handler.removeMessages(2);
        this.rebuffering = false;
        this.mediaClock.stop();
        this.rendererPositionUs = 0L;
        for (Renderer renderer : this.enabledRenderers) {
            try {
                disableRenderer(renderer);
            } catch (ExoPlaybackException | RuntimeException e) {
                Log.m17583e(TAG, "Disable failed.", e);
            }
        }
        if (z) {
            for (Renderer renderer2 : this.renderers) {
                try {
                    renderer2.reset();
                } catch (RuntimeException e2) {
                    Log.m17583e(TAG, "Reset failed.", e2);
                }
            }
        }
        this.enabledRenderers = new Renderer[0];
        if (!z3) {
            if (z4) {
                if (this.pendingInitialSeekPosition == null && !this.playbackInfo.timeline.isEmpty()) {
                    PlaybackInfo playbackInfo3 = this.playbackInfo;
                    playbackInfo3.timeline.getPeriodByUid(playbackInfo3.periodId.periodUid, this.period);
                    this.pendingInitialSeekPosition = new SeekPosition(Timeline.EMPTY, this.period.windowIndex, this.period.getPositionInWindowUs() + this.playbackInfo.positionUs);
                }
                z6 = true;
            }
            this.queue.clear(!z4);
            this.shouldContinueLoading = false;
            if (z4) {
                this.queue.setTimeline(Timeline.EMPTY);
                it = this.pendingMessages.iterator();
                while (it.hasNext()) {
                    it.next().message.markAsProcessed(false);
                }
                this.pendingMessages.clear();
            }
            playbackInfo = this.playbackInfo;
            if (z6) {
                dummyFirstMediaPeriodId = playbackInfo.getDummyFirstMediaPeriodId(this.shuffleModeEnabled, this.window, this.period);
            } else {
                dummyFirstMediaPeriodId = playbackInfo.periodId;
            }
            MediaSource.MediaPeriodId mediaPeriodId = dummyFirstMediaPeriodId;
            j = C3219C.TIME_UNSET;
            if (z6) {
                j2 = -9223372036854775807L;
            } else {
                j2 = this.playbackInfo.positionUs;
            }
            if (!z6) {
                j = this.playbackInfo.contentPositionUs;
            }
            long j3 = j;
            if (z4) {
                timeline = Timeline.EMPTY;
            } else {
                timeline = this.playbackInfo.timeline;
            }
            Timeline timeline2 = timeline;
            playbackInfo2 = this.playbackInfo;
            int i = playbackInfo2.playbackState;
            if (z5) {
                exoPlaybackException = null;
            } else {
                exoPlaybackException = playbackInfo2.playbackError;
            }
            if (z4) {
                trackGroupArray = TrackGroupArray.EMPTY;
            } else {
                trackGroupArray = playbackInfo2.trackGroups;
            }
            TrackGroupArray trackGroupArray2 = trackGroupArray;
            if (z4) {
                trackSelectorResult = this.emptyTrackSelectorResult;
            } else {
                trackSelectorResult = playbackInfo2.trackSelectorResult;
            }
            this.playbackInfo = new PlaybackInfo(timeline2, mediaPeriodId, j2, j3, i, exoPlaybackException, false, trackGroupArray2, trackSelectorResult, mediaPeriodId, j2, 0L, j2);
            if (z2 || (mediaSource = this.mediaSource) == null) {
            }
            try {
                mediaSource.releaseSource(this);
            } catch (RuntimeException e3) {
                Log.m17583e(TAG, "Failed to release child source.", e3);
            }
            this.mediaSource = null;
            return;
        }
        this.pendingInitialSeekPosition = null;
        z6 = z3;
        this.queue.clear(!z4);
        this.shouldContinueLoading = false;
        if (z4) {
            this.queue.setTimeline(Timeline.EMPTY);
            it = this.pendingMessages.iterator();
            while (it.hasNext()) {
                it.next().message.markAsProcessed(false);
            }
            this.pendingMessages.clear();
        }
        playbackInfo = this.playbackInfo;
        if (z6) {
            dummyFirstMediaPeriodId = playbackInfo.getDummyFirstMediaPeriodId(this.shuffleModeEnabled, this.window, this.period);
        } else {
            dummyFirstMediaPeriodId = playbackInfo.periodId;
        }
        MediaSource.MediaPeriodId mediaPeriodId2 = dummyFirstMediaPeriodId;
        j = C3219C.TIME_UNSET;
        if (z6) {
            j2 = -9223372036854775807L;
        } else {
            j2 = this.playbackInfo.positionUs;
        }
        if (!z6) {
            j = this.playbackInfo.contentPositionUs;
        }
        long j4 = j;
        if (z4) {
            timeline = Timeline.EMPTY;
        } else {
            timeline = this.playbackInfo.timeline;
        }
        Timeline timeline3 = timeline;
        playbackInfo2 = this.playbackInfo;
        int i2 = playbackInfo2.playbackState;
        if (z5) {
            exoPlaybackException = null;
        } else {
            exoPlaybackException = playbackInfo2.playbackError;
        }
        if (z4) {
            trackGroupArray = TrackGroupArray.EMPTY;
        } else {
            trackGroupArray = playbackInfo2.trackGroups;
        }
        TrackGroupArray trackGroupArray3 = trackGroupArray;
        if (z4) {
            trackSelectorResult = this.emptyTrackSelectorResult;
        } else {
            trackSelectorResult = playbackInfo2.trackSelectorResult;
        }
        this.playbackInfo = new PlaybackInfo(timeline3, mediaPeriodId2, j2, j4, i2, exoPlaybackException, false, trackGroupArray3, trackSelectorResult, mediaPeriodId2, j2, 0L, j2);
        if (z2) {
        }
    }

    private void resetRendererPosition(long j) throws ExoPlaybackException {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod != null) {
            j = playingPeriod.toRendererTime(j);
        }
        this.rendererPositionUs = j;
        this.mediaClock.resetPosition(j);
        for (Renderer renderer : this.enabledRenderers) {
            renderer.resetPosition(this.rendererPositionUs);
        }
        notifyTrackSelectionDiscontinuity();
    }

    private boolean resolvePendingMessagePosition(PendingMessageInfo pendingMessageInfo) {
        Object obj = pendingMessageInfo.resolvedPeriodUid;
        if (obj == null) {
            Pair<Object, Long> pairResolveSeekPosition = resolveSeekPosition(new SeekPosition(pendingMessageInfo.message.getTimeline(), pendingMessageInfo.message.getWindowIndex(), C3219C.msToUs(pendingMessageInfo.message.getPositionMs())), false);
            if (pairResolveSeekPosition == null) {
                return false;
            }
            pendingMessageInfo.setResolvedPosition(this.playbackInfo.timeline.getIndexOfPeriod(pairResolveSeekPosition.first), ((Long) pairResolveSeekPosition.second).longValue(), pairResolveSeekPosition.first);
            return true;
        }
        int indexOfPeriod = this.playbackInfo.timeline.getIndexOfPeriod(obj);
        if (indexOfPeriod == -1) {
            return false;
        }
        pendingMessageInfo.resolvedPeriodIndex = indexOfPeriod;
        return true;
    }

    private void resolvePendingMessagePositions() {
        for (int size = this.pendingMessages.size() - 1; size >= 0; size--) {
            if (!resolvePendingMessagePosition(this.pendingMessages.get(size))) {
                this.pendingMessages.get(size).message.markAsProcessed(false);
                this.pendingMessages.remove(size);
            }
        }
        Collections.sort(this.pendingMessages);
    }

    @Nullable
    private Pair<Object, Long> resolveSeekPosition(SeekPosition seekPosition, boolean z) {
        Object objResolveSubsequentPeriod;
        Timeline timeline = this.playbackInfo.timeline;
        Timeline timeline2 = seekPosition.timeline;
        if (timeline.isEmpty()) {
            return null;
        }
        if (timeline2.isEmpty()) {
            timeline2 = timeline;
        }
        try {
            Pair<Object, Long> periodPosition = timeline2.getPeriodPosition(this.window, this.period, seekPosition.windowIndex, seekPosition.windowPositionUs);
            if (timeline == timeline2 || timeline.getIndexOfPeriod(periodPosition.first) != -1) {
                return periodPosition;
            }
            if (z && (objResolveSubsequentPeriod = resolveSubsequentPeriod(periodPosition.first, timeline2, timeline)) != null) {
                return getPeriodPosition(timeline, timeline.getPeriodByUid(objResolveSubsequentPeriod, this.period).windowIndex, C3219C.TIME_UNSET);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    @Nullable
    private Object resolveSubsequentPeriod(Object obj, Timeline timeline, Timeline timeline2) {
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        int periodCount = timeline.getPeriodCount();
        int nextPeriodIndex = indexOfPeriod;
        int indexOfPeriod2 = -1;
        for (int i = 0; i < periodCount && indexOfPeriod2 == -1; i++) {
            nextPeriodIndex = timeline.getNextPeriodIndex(nextPeriodIndex, this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
            if (nextPeriodIndex == -1) {
                break;
            }
            indexOfPeriod2 = timeline2.getIndexOfPeriod(timeline.getUidOfPeriod(nextPeriodIndex));
        }
        if (indexOfPeriod2 == -1) {
            return null;
        }
        return timeline2.getUidOfPeriod(indexOfPeriod2);
    }

    private void scheduleNextWork(long j, long j2) {
        this.handler.removeMessages(2);
        this.handler.sendEmptyMessageAtTime(2, j + j2);
    }

    private void seekToCurrentPosition(boolean z) throws ExoPlaybackException {
        MediaSource.MediaPeriodId mediaPeriodId = this.queue.getPlayingPeriod().f19778info.f11056id;
        long jSeekToPeriodPosition = seekToPeriodPosition(mediaPeriodId, this.playbackInfo.positionUs, true);
        if (jSeekToPeriodPosition != this.playbackInfo.positionUs) {
            this.playbackInfo = copyWithNewPosition(mediaPeriodId, jSeekToPeriodPosition, this.playbackInfo.contentPositionUs);
            if (z) {
                this.playbackInfoUpdate.setPositionDiscontinuity(4);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void seekToInternal(SeekPosition seekPosition) throws Throwable {
        long jLongValue;
        long jLongValue2;
        boolean z;
        MediaSource.MediaPeriodId dummyFirstMediaPeriodId;
        int i;
        long j;
        long adjustedSeekPositionUs;
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        Pair<Object, Long> pairResolveSeekPosition = resolveSeekPosition(seekPosition, true);
        int i2 = -9223372036854775807;
        if (pairResolveSeekPosition == null) {
            dummyFirstMediaPeriodId = this.playbackInfo.getDummyFirstMediaPeriodId(this.shuffleModeEnabled, this.window, this.period);
            jLongValue2 = -9223372036854775807L;
            jLongValue = -9223372036854775807L;
            z = true;
        } else {
            Object obj = pairResolveSeekPosition.first;
            jLongValue = ((Long) pairResolveSeekPosition.second).longValue();
            MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAds = this.queue.resolveMediaPeriodIdForAds(obj, jLongValue);
            if (mediaPeriodIdResolveMediaPeriodIdForAds.isAd()) {
                jLongValue2 = 0;
                z = true;
            } else {
                jLongValue2 = ((Long) pairResolveSeekPosition.second).longValue();
                z = seekPosition.windowPositionUs == C3219C.TIME_UNSET;
            }
            dummyFirstMediaPeriodId = mediaPeriodIdResolveMediaPeriodIdForAds;
        }
        try {
            try {
                if (this.mediaSource != null && this.pendingPrepareCount <= 0) {
                    if (jLongValue2 == C3219C.TIME_UNSET) {
                        setState(4);
                        i = 2;
                        resetInternal(false, false, true, false, true);
                    } else {
                        i = 2;
                        if (dummyFirstMediaPeriodId.equals(this.playbackInfo.periodId)) {
                            MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
                            adjustedSeekPositionUs = (playingPeriod == null || !playingPeriod.prepared || jLongValue2 == 0) ? jLongValue2 : playingPeriod.mediaPeriod.getAdjustedSeekPositionUs(jLongValue2, this.seekParameters);
                            if (C3219C.usToMs(adjustedSeekPositionUs) == C3219C.usToMs(this.playbackInfo.positionUs)) {
                                this.playbackInfo = copyWithNewPosition(dummyFirstMediaPeriodId, this.playbackInfo.positionUs, jLongValue);
                                if (z) {
                                    this.playbackInfoUpdate.setPositionDiscontinuity(2);
                                    return;
                                }
                                return;
                            }
                        } else {
                            adjustedSeekPositionUs = jLongValue2;
                        }
                        long jSeekToPeriodPosition = seekToPeriodPosition(dummyFirstMediaPeriodId, adjustedSeekPositionUs);
                        z |= jLongValue2 != jSeekToPeriodPosition;
                        j = jSeekToPeriodPosition;
                    }
                    this.playbackInfo = copyWithNewPosition(dummyFirstMediaPeriodId, j, jLongValue);
                    if (z) {
                        this.playbackInfoUpdate.setPositionDiscontinuity(i);
                    }
                }
                i = 2;
                this.pendingInitialSeekPosition = seekPosition;
                j = jLongValue2;
                this.playbackInfo = copyWithNewPosition(dummyFirstMediaPeriodId, j, jLongValue);
                if (z) {
                    this.playbackInfoUpdate.setPositionDiscontinuity(i);
                }
            } catch (Throwable th) {
                th = th;
                this.playbackInfo = copyWithNewPosition(dummyFirstMediaPeriodId, jLongValue2, jLongValue);
                if (z) {
                    this.playbackInfoUpdate.setPositionDiscontinuity(i2);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i2 = 2;
        }
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j) throws ExoPlaybackException {
        return seekToPeriodPosition(mediaPeriodId, j, this.queue.getPlayingPeriod() != this.queue.getReadingPeriod());
    }

    private void sendMessageInternal(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.getPositionMs() == C3219C.TIME_UNSET) {
            sendMessageToTarget(playerMessage);
            return;
        }
        if (this.mediaSource == null || this.pendingPrepareCount > 0) {
            this.pendingMessages.add(new PendingMessageInfo(playerMessage));
            return;
        }
        PendingMessageInfo pendingMessageInfo = new PendingMessageInfo(playerMessage);
        if (!resolvePendingMessagePosition(pendingMessageInfo)) {
            playerMessage.markAsProcessed(false);
        } else {
            this.pendingMessages.add(pendingMessageInfo);
            Collections.sort(this.pendingMessages);
        }
    }

    private void sendMessageToTarget(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.getHandler().getLooper() != this.handler.getLooper()) {
            this.handler.obtainMessage(16, playerMessage).sendToTarget();
            return;
        }
        deliverMessage(playerMessage);
        int i = this.playbackInfo.playbackState;
        if (i == 3 || i == 2) {
            this.handler.sendEmptyMessage(2);
        }
    }

    private void sendMessageToTargetThread(final PlayerMessage playerMessage) {
        Handler handler = playerMessage.getHandler();
        if (handler.getLooper().getThread().isAlive()) {
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11103a.lambda$sendMessageToTargetThread$0(playerMessage);
                }
            });
        } else {
            Log.m17586w("TAG", "Trying to send message on a dead thread.");
            playerMessage.markAsProcessed(false);
        }
    }

    private void sendPlaybackParametersChangedInternal(PlaybackParameters playbackParameters, boolean z) {
        this.handler.obtainMessage(17, z ? 1 : 0, 0, playbackParameters).sendToTarget();
    }

    private void setAllRendererStreamsFinal() {
        for (Renderer renderer : this.renderers) {
            if (renderer.getStream() != null) {
                renderer.setCurrentStreamFinal();
            }
        }
    }

    private void setForegroundModeInternal(boolean z, @Nullable AtomicBoolean atomicBoolean) {
        if (this.foregroundMode != z) {
            this.foregroundMode = z;
            if (!z) {
                for (Renderer renderer : this.renderers) {
                    if (renderer.getState() == 0) {
                        renderer.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void setPlayWhenReadyInternal(boolean z) throws ExoPlaybackException {
        this.rebuffering = false;
        this.playWhenReady = z;
        if (!z) {
            stopRenderers();
            updatePlaybackPositions();
            return;
        }
        int i = this.playbackInfo.playbackState;
        if (i == 3) {
            startRenderers();
        } else if (i != 2) {
            return;
        }
        this.handler.sendEmptyMessage(2);
    }

    private void setPlaybackParametersInternal(PlaybackParameters playbackParameters) {
        this.mediaClock.setPlaybackParameters(playbackParameters);
        sendPlaybackParametersChangedInternal(this.mediaClock.getPlaybackParameters(), true);
    }

    private void setRepeatModeInternal(int i) throws ExoPlaybackException {
        this.repeatMode = i;
        if (!this.queue.updateRepeatMode(i)) {
            seekToCurrentPosition(true);
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setSeekParametersInternal(SeekParameters seekParameters) {
        this.seekParameters = seekParameters;
    }

    private void setShuffleModeEnabledInternal(boolean z) throws ExoPlaybackException {
        this.shuffleModeEnabled = z;
        if (!this.queue.updateShuffleModeEnabled(z)) {
            seekToCurrentPosition(true);
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setState(int i) {
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playbackState != i) {
            this.playbackInfo = playbackInfo.copyWithPlaybackState(i);
        }
    }

    private boolean shouldAdvancePlayingPeriod() {
        MediaPeriodHolder playingPeriod;
        MediaPeriodHolder next;
        if (!this.playWhenReady || (playingPeriod = this.queue.getPlayingPeriod()) == null || (next = playingPeriod.getNext()) == null) {
            return false;
        }
        return (playingPeriod != this.queue.getReadingPeriod() || hasReadingPeriodFinishedReading()) && this.rendererPositionUs >= next.getStartPositionRendererTime();
    }

    private boolean shouldContinueLoading() {
        if (!isLoadingPossible()) {
            return false;
        }
        return this.loadControl.shouldContinueLoading(getTotalBufferedDurationUs(this.queue.getLoadingPeriod().getNextLoadPositionUs()), this.mediaClock.getPlaybackParameters().speed);
    }

    private boolean shouldTransitionToReadyState(boolean z) {
        if (this.enabledRenderers.length == 0) {
            return isTimelineReady();
        }
        if (!z) {
            return false;
        }
        if (!this.playbackInfo.isLoading) {
            return true;
        }
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        return (loadingPeriod.isFullyBuffered() && loadingPeriod.f19778info.isFinal) || this.loadControl.shouldStartPlayback(getTotalBufferedDurationUs(), this.mediaClock.getPlaybackParameters().speed, this.rebuffering);
    }

    private void startRenderers() throws ExoPlaybackException {
        this.rebuffering = false;
        this.mediaClock.start();
        for (Renderer renderer : this.enabledRenderers) {
            renderer.start();
        }
    }

    private void stopInternal(boolean z, boolean z2, boolean z3) {
        resetInternal(z || !this.foregroundMode, true, z2, z2, z2);
        this.playbackInfoUpdate.incrementPendingOperationAcks(this.pendingPrepareCount + (z3 ? 1 : 0));
        this.pendingPrepareCount = 0;
        this.loadControl.onStopped();
        setState(1);
    }

    private void stopRenderers() throws ExoPlaybackException {
        this.mediaClock.stop();
        for (Renderer renderer : this.enabledRenderers) {
            ensureStopped(renderer);
        }
    }

    private void updateIsLoading() {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        boolean z = this.shouldContinueLoading || (loadingPeriod != null && loadingPeriod.mediaPeriod.isLoading());
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (z != playbackInfo.isLoading) {
            this.playbackInfo = playbackInfo.copyWithIsLoading(z);
        }
    }

    private void updateLoadControlTrackSelection(TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult) {
        this.loadControl.onTracksSelected(this.renderers, trackGroupArray, trackSelectorResult.selections);
    }

    private void updatePeriods() throws ExoPlaybackException, IOException {
        MediaSource mediaSource = this.mediaSource;
        if (mediaSource == null) {
            return;
        }
        if (this.pendingPrepareCount > 0) {
            mediaSource.maybeThrowSourceInfoRefreshError();
            return;
        }
        maybeUpdateLoadingPeriod();
        maybeUpdateReadingPeriod();
        maybeUpdatePlayingPeriod();
    }

    private void updatePlaybackPositions() throws ExoPlaybackException {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            return;
        }
        long discontinuity = playingPeriod.prepared ? playingPeriod.mediaPeriod.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != C3219C.TIME_UNSET) {
            resetRendererPosition(discontinuity);
            if (discontinuity != this.playbackInfo.positionUs) {
                PlaybackInfo playbackInfo = this.playbackInfo;
                this.playbackInfo = copyWithNewPosition(playbackInfo.periodId, discontinuity, playbackInfo.contentPositionUs);
                this.playbackInfoUpdate.setPositionDiscontinuity(4);
            }
        } else {
            long jSyncAndGetPositionUs = this.mediaClock.syncAndGetPositionUs(playingPeriod != this.queue.getReadingPeriod());
            this.rendererPositionUs = jSyncAndGetPositionUs;
            long periodTime = playingPeriod.toPeriodTime(jSyncAndGetPositionUs);
            maybeTriggerPendingMessages(this.playbackInfo.positionUs, periodTime);
            this.playbackInfo.positionUs = periodTime;
        }
        this.playbackInfo.bufferedPositionUs = this.queue.getLoadingPeriod().getBufferedPositionUs();
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
    }

    private void updatePlayingPeriodRenderers(@Nullable MediaPeriodHolder mediaPeriodHolder) throws ExoPlaybackException {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null || mediaPeriodHolder == playingPeriod) {
            return;
        }
        boolean[] zArr = new boolean[this.renderers.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i >= rendererArr.length) {
                this.playbackInfo = this.playbackInfo.copyWithTrackInfo(playingPeriod.getTrackGroups(), playingPeriod.getTrackSelectorResult());
                enableRenderers(zArr, i2);
                return;
            }
            Renderer renderer = rendererArr[i];
            zArr[i] = renderer.getState() != 0;
            if (playingPeriod.getTrackSelectorResult().isRendererEnabled(i)) {
                i2++;
            }
            if (zArr[i] && (!playingPeriod.getTrackSelectorResult().isRendererEnabled(i) || (renderer.isCurrentStreamFinal() && renderer.getStream() == mediaPeriodHolder.sampleStreams[i]))) {
                disableRenderer(renderer);
            }
            i++;
        }
    }

    private void updateTrackSelectionPlaybackSpeed(float f) {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (TrackSelection trackSelection : playingPeriod.getTrackSelectorResult().selections.getAll()) {
                if (trackSelection != null) {
                    trackSelection.onPlaybackSpeed(f);
                }
            }
        }
    }

    public Looper getPlaybackLooper() {
        return this.internalPlaybackThread.getLooper();
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d7  */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        ExoPlaybackException e;
        PlaybackInfo playbackInfo;
        try {
            switch (message.what) {
                case 0:
                    prepareInternal((MediaSource) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    setPlayWhenReadyInternal(message.arg1 != 0);
                    break;
                case 2:
                    doSomeWork();
                    break;
                case 3:
                    seekToInternal((SeekPosition) message.obj);
                    break;
                case 4:
                    setPlaybackParametersInternal((PlaybackParameters) message.obj);
                    break;
                case 5:
                    setSeekParametersInternal((SeekParameters) message.obj);
                    break;
                case 6:
                    stopInternal(false, message.arg1 != 0, true);
                    break;
                case 7:
                    releaseInternal();
                    return true;
                case 8:
                    handleSourceInfoRefreshed((MediaSourceRefreshInfo) message.obj);
                    break;
                case 9:
                    handlePeriodPrepared((MediaPeriod) message.obj);
                    break;
                case 10:
                    handleContinueLoadingRequested((MediaPeriod) message.obj);
                    break;
                case 11:
                    reselectTracksInternal();
                    break;
                case 12:
                    setRepeatModeInternal(message.arg1);
                    break;
                case 13:
                    setShuffleModeEnabledInternal(message.arg1 != 0);
                    break;
                case 14:
                    setForegroundModeInternal(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 15:
                    sendMessageInternal((PlayerMessage) message.obj);
                    break;
                case 16:
                    sendMessageToTargetThread((PlayerMessage) message.obj);
                    break;
                case 17:
                    handlePlaybackParameters((PlaybackParameters) message.obj, message.arg1 != 0);
                    break;
                default:
                    return false;
            }
            maybeNotifyPlaybackInfoChanged();
        } catch (ExoPlaybackException e2) {
            e = e2;
            Log.m17583e(TAG, getExoPlaybackExceptionMessage(e), e);
            stopInternal(true, false, false);
            playbackInfo = this.playbackInfo;
            this.playbackInfo = playbackInfo.copyWithPlaybackError(e);
            maybeNotifyPlaybackInfoChanged();
        } catch (IOException e3) {
            Log.m17583e(TAG, "Source error", e3);
            stopInternal(false, false, false);
            playbackInfo = this.playbackInfo;
            e = ExoPlaybackException.createForSource(e3);
            this.playbackInfo = playbackInfo.copyWithPlaybackError(e);
            maybeNotifyPlaybackInfoChanged();
        } catch (OutOfMemoryError e4) {
            e = e4;
            Log.m17583e(TAG, "Internal runtime error", e);
            if (e instanceof OutOfMemoryError) {
                e = ExoPlaybackException.createForOutOfMemoryError((OutOfMemoryError) e);
            } else {
                e = ExoPlaybackException.createForUnexpected((RuntimeException) e);
            }
            stopInternal(true, false, false);
            playbackInfo = this.playbackInfo;
            this.playbackInfo = playbackInfo.copyWithPlaybackError(e);
            maybeNotifyPlaybackInfoChanged();
        } catch (RuntimeException e5) {
            e = e5;
            Log.m17583e(TAG, "Internal runtime error", e);
            if (e instanceof OutOfMemoryError) {
                e = ExoPlaybackException.createForOutOfMemoryError((OutOfMemoryError) e);
            } else {
                e = ExoPlaybackException.createForUnexpected((RuntimeException) e);
            }
            stopInternal(true, false, false);
            playbackInfo = this.playbackInfo;
            this.playbackInfo = playbackInfo.copyWithPlaybackError(e);
            maybeNotifyPlaybackInfoChanged();
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(10, mediaPeriod).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.DefaultMediaClock.PlaybackParameterListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        sendPlaybackParametersChangedInternal(playbackParameters, false);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(9, mediaPeriod).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
    public void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
        this.handler.obtainMessage(8, new MediaSourceRefreshInfo(mediaSource, timeline)).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        this.handler.sendEmptyMessage(11);
    }

    public void prepare(MediaSource mediaSource, boolean z, boolean z2) {
        this.handler.obtainMessage(0, z ? 1 : 0, z2 ? 1 : 0, mediaSource).sendToTarget();
    }

    public synchronized void release() {
        if (!this.released && this.internalPlaybackThread.isAlive()) {
            this.handler.sendEmptyMessage(7);
            boolean z = false;
            while (!this.released) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void seekTo(Timeline timeline, int i, long j) {
        this.handler.obtainMessage(3, new SeekPosition(timeline, i, j)).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Sender
    public synchronized void sendMessage(PlayerMessage playerMessage) {
        if (!this.released && this.internalPlaybackThread.isAlive()) {
            this.handler.obtainMessage(15, playerMessage).sendToTarget();
            return;
        }
        Log.m17586w(TAG, "Ignoring messages sent after release.");
        playerMessage.markAsProcessed(false);
    }

    public synchronized void setForegroundMode(boolean z) {
        try {
            if (!this.released && this.internalPlaybackThread.isAlive()) {
                boolean z2 = false;
                if (z) {
                    this.handler.obtainMessage(14, 1, 0).sendToTarget();
                } else {
                    AtomicBoolean atomicBoolean = new AtomicBoolean();
                    this.handler.obtainMessage(14, 0, 0, atomicBoolean).sendToTarget();
                    while (!atomicBoolean.get()) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setPlayWhenReady(boolean z) {
        this.handler.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }

    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(4, playbackParameters).sendToTarget();
    }

    public void setRepeatMode(int i) {
        this.handler.obtainMessage(12, i, 0).sendToTarget();
    }

    public void setSeekParameters(SeekParameters seekParameters) {
        this.handler.obtainMessage(5, seekParameters).sendToTarget();
    }

    public void setShuffleModeEnabled(boolean z) {
        this.handler.obtainMessage(13, z ? 1 : 0, 0).sendToTarget();
    }

    public void stop(boolean z) {
        this.handler.obtainMessage(6, z ? 1 : 0, 0).sendToTarget();
    }

    private long getTotalBufferedDurationUs(long j) {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        if (loadingPeriod == null) {
            return 0L;
        }
        return Math.max(0L, j - loadingPeriod.toPeriodTime(this.rendererPositionUs));
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z) throws ExoPlaybackException {
        stopRenderers();
        this.rebuffering = false;
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playbackState != 1 && !playbackInfo.timeline.isEmpty()) {
            setState(2);
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        MediaPeriodHolder mediaPeriodHolderAdvancePlayingPeriod = playingPeriod;
        while (mediaPeriodHolderAdvancePlayingPeriod != null) {
            if (mediaPeriodId.equals(mediaPeriodHolderAdvancePlayingPeriod.f19778info.f11056id) && mediaPeriodHolderAdvancePlayingPeriod.prepared) {
                this.queue.removeAfter(mediaPeriodHolderAdvancePlayingPeriod);
                break;
            }
            mediaPeriodHolderAdvancePlayingPeriod = this.queue.advancePlayingPeriod();
        }
        if (z || playingPeriod != mediaPeriodHolderAdvancePlayingPeriod || (mediaPeriodHolderAdvancePlayingPeriod != null && mediaPeriodHolderAdvancePlayingPeriod.toRendererTime(j) < 0)) {
            for (Renderer renderer : this.enabledRenderers) {
                disableRenderer(renderer);
            }
            this.enabledRenderers = new Renderer[0];
            if (mediaPeriodHolderAdvancePlayingPeriod != null) {
                mediaPeriodHolderAdvancePlayingPeriod.setRendererOffset(0L);
            }
            playingPeriod = null;
        }
        if (mediaPeriodHolderAdvancePlayingPeriod != null) {
            updatePlayingPeriodRenderers(playingPeriod);
            if (mediaPeriodHolderAdvancePlayingPeriod.hasEnabledTracks) {
                j = mediaPeriodHolderAdvancePlayingPeriod.mediaPeriod.seekToUs(j);
                mediaPeriodHolderAdvancePlayingPeriod.mediaPeriod.discardBuffer(j - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
            }
            resetRendererPosition(j);
            maybeContinueLoading();
        } else {
            this.queue.clear(true);
            this.playbackInfo = this.playbackInfo.copyWithTrackInfo(TrackGroupArray.EMPTY, this.emptyTrackSelectorResult);
            resetRendererPosition(j);
        }
        handleLoadingMediaPeriodChanged(false);
        this.handler.sendEmptyMessage(2);
        return j;
    }
}
