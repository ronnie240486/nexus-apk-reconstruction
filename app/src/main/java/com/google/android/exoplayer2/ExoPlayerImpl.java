package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class ExoPlayerImpl extends BasePlayer implements ExoPlayer {
    private static final String TAG = "ExoPlayerImpl";
    final TrackSelectorResult emptyTrackSelectorResult;
    private final Handler eventHandler;
    private boolean foregroundMode;
    private boolean hasPendingPrepare;
    private boolean hasPendingSeek;
    private final ExoPlayerImplInternal internalPlayer;
    private final Handler internalPlayerHandler;
    private final CopyOnWriteArrayList<BasePlayer.ListenerHolder> listeners;
    private int maskingPeriodIndex;
    private int maskingWindowIndex;
    private long maskingWindowPositionMs;
    private MediaSource mediaSource;
    private final ArrayDeque<Runnable> pendingListenerNotifications;
    private int pendingOperationAcks;
    private int pendingSetPlaybackParametersAcks;
    private final Timeline.Period period;
    private boolean playWhenReady;
    private PlaybackInfo playbackInfo;
    private PlaybackParameters playbackParameters;
    private int playbackSuppressionReason;
    private final Renderer[] renderers;
    private int repeatMode;
    private SeekParameters seekParameters;
    private boolean shuffleModeEnabled;
    private final TrackSelector trackSelector;

    public static final class PlaybackInfoUpdate implements Runnable {
        private final boolean isLoadingChanged;
        private final boolean isPlayingChanged;
        private final CopyOnWriteArrayList<BasePlayer.ListenerHolder> listenerSnapshot;
        private final boolean playWhenReady;
        private final boolean playbackErrorChanged;
        private final PlaybackInfo playbackInfo;
        private final boolean playbackStateChanged;
        private final boolean positionDiscontinuity;
        private final int positionDiscontinuityReason;
        private final boolean seekProcessed;
        private final int timelineChangeReason;
        private final boolean timelineChanged;
        private final TrackSelector trackSelector;
        private final boolean trackSelectorResultChanged;

        public PlaybackInfoUpdate(PlaybackInfo playbackInfo, PlaybackInfo playbackInfo2, CopyOnWriteArrayList<BasePlayer.ListenerHolder> copyOnWriteArrayList, TrackSelector trackSelector, boolean z, int i, int i2, boolean z2, boolean z3, boolean z4) {
            this.playbackInfo = playbackInfo;
            this.listenerSnapshot = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
            this.trackSelector = trackSelector;
            this.positionDiscontinuity = z;
            this.positionDiscontinuityReason = i;
            this.timelineChangeReason = i2;
            this.seekProcessed = z2;
            this.playWhenReady = z3;
            this.isPlayingChanged = z4;
            this.playbackStateChanged = playbackInfo2.playbackState != playbackInfo.playbackState;
            ExoPlaybackException exoPlaybackException = playbackInfo2.playbackError;
            ExoPlaybackException exoPlaybackException2 = playbackInfo.playbackError;
            this.playbackErrorChanged = (exoPlaybackException == exoPlaybackException2 || exoPlaybackException2 == null) ? false : true;
            this.timelineChanged = playbackInfo2.timeline != playbackInfo.timeline;
            this.isLoadingChanged = playbackInfo2.isLoading != playbackInfo.isLoading;
            this.trackSelectorResultChanged = playbackInfo2.trackSelectorResult != playbackInfo.trackSelectorResult;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0(Player.EventListener eventListener) {
            eventListener.onTimelineChanged(this.playbackInfo.timeline, this.timelineChangeReason);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$1(Player.EventListener eventListener) {
            eventListener.onPositionDiscontinuity(this.positionDiscontinuityReason);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$2(Player.EventListener eventListener) {
            eventListener.onPlayerError(this.playbackInfo.playbackError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$3(Player.EventListener eventListener) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            eventListener.onTracksChanged(playbackInfo.trackGroups, playbackInfo.trackSelectorResult.selections);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$4(Player.EventListener eventListener) {
            eventListener.onLoadingChanged(this.playbackInfo.isLoading);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$5(Player.EventListener eventListener) {
            eventListener.onPlayerStateChanged(this.playWhenReady, this.playbackInfo.playbackState);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$6(Player.EventListener eventListener) {
            eventListener.onIsPlayingChanged(this.playbackInfo.playbackState == 3);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.timelineChanged || this.timelineChangeReason == 0) {
                ExoPlayerImpl.invokeAll(this.listenerSnapshot, new BasePlayer.ListenerInvocation() { // from class: com.google.android.exoplayer2.i
                    @Override // com.google.android.exoplayer2.BasePlayer.ListenerInvocation
                    public final void invokeListener(Player.EventListener eventListener) {
                        this.f11079a.lambda$run$0(eventListener);
                    }
                });
            }
            if (this.positionDiscontinuity) {
                ExoPlayerImpl.invokeAll(this.listenerSnapshot, new BasePlayer.ListenerInvocation() { // from class: com.google.android.exoplayer2.j
                    @Override // com.google.android.exoplayer2.BasePlayer.ListenerInvocation
                    public final void invokeListener(Player.EventListener eventListener) {
                        this.f11080a.lambda$run$1(eventListener);
                    }
                });
            }
            if (this.playbackErrorChanged) {
                ExoPlayerImpl.invokeAll(this.listenerSnapshot, new BasePlayer.ListenerInvocation() { // from class: com.google.android.exoplayer2.k
                    @Override // com.google.android.exoplayer2.BasePlayer.ListenerInvocation
                    public final void invokeListener(Player.EventListener eventListener) {
                        this.f11081a.lambda$run$2(eventListener);
                    }
                });
            }
            if (this.trackSelectorResultChanged) {
                this.trackSelector.onSelectionActivated(this.playbackInfo.trackSelectorResult.f19780info);
                ExoPlayerImpl.invokeAll(this.listenerSnapshot, new BasePlayer.ListenerInvocation() { // from class: com.google.android.exoplayer2.l
                    @Override // com.google.android.exoplayer2.BasePlayer.ListenerInvocation
                    public final void invokeListener(Player.EventListener eventListener) {
                        this.f11082a.lambda$run$3(eventListener);
                    }
                });
            }
            if (this.isLoadingChanged) {
                ExoPlayerImpl.invokeAll(this.listenerSnapshot, new BasePlayer.ListenerInvocation() { // from class: com.google.android.exoplayer2.m
                    @Override // com.google.android.exoplayer2.BasePlayer.ListenerInvocation
                    public final void invokeListener(Player.EventListener eventListener) {
                        this.f11083a.lambda$run$4(eventListener);
                    }
                });
            }
            if (this.playbackStateChanged) {
                ExoPlayerImpl.invokeAll(this.listenerSnapshot, new BasePlayer.ListenerInvocation() { // from class: com.google.android.exoplayer2.n
                    @Override // com.google.android.exoplayer2.BasePlayer.ListenerInvocation
                    public final void invokeListener(Player.EventListener eventListener) {
                        this.f11096a.lambda$run$5(eventListener);
                    }
                });
            }
            if (this.isPlayingChanged) {
                ExoPlayerImpl.invokeAll(this.listenerSnapshot, new BasePlayer.ListenerInvocation() { // from class: com.google.android.exoplayer2.o
                    @Override // com.google.android.exoplayer2.BasePlayer.ListenerInvocation
                    public final void invokeListener(Player.EventListener eventListener) {
                        this.f11097a.lambda$run$6(eventListener);
                    }
                });
            }
            if (this.seekProcessed) {
                ExoPlayerImpl.invokeAll(this.listenerSnapshot, new BasePlayer.ListenerInvocation() { // from class: ji
                    /* JADX WARN: Invalid debug info offset */
                    @Override // com.google.android.exoplayer2.BasePlayer.ListenerInvocation
                    public final void invokeListener(Player.EventListener eventListener) {
                    }
                });
            }
        }
    }

    @SuppressLint({"HandlerLeak"})
    public ExoPlayerImpl(Renderer[] rendererArr, TrackSelector trackSelector, LoadControl loadControl, BandwidthMeter bandwidthMeter, Clock clock, Looper looper) {
        Log.m17584i(TAG, "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.11.8] [" + Util.DEVICE_DEBUG_INFO + "]");
        Assertions.checkState(rendererArr.length > 0);
        this.renderers = (Renderer[]) Assertions.checkNotNull(rendererArr);
        this.trackSelector = (TrackSelector) Assertions.checkNotNull(trackSelector);
        this.playWhenReady = false;
        this.repeatMode = 0;
        this.shuffleModeEnabled = false;
        this.listeners = new CopyOnWriteArrayList<>();
        TrackSelectorResult trackSelectorResult = new TrackSelectorResult(new RendererConfiguration[rendererArr.length], new TrackSelection[rendererArr.length], null);
        this.emptyTrackSelectorResult = trackSelectorResult;
        this.period = new Timeline.Period();
        this.playbackParameters = PlaybackParameters.DEFAULT;
        this.seekParameters = SeekParameters.DEFAULT;
        this.playbackSuppressionReason = 0;
        Handler handler = new Handler(looper) { // from class: com.google.android.exoplayer2.ExoPlayerImpl.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                ExoPlayerImpl.this.handleEvent(message);
            }
        };
        this.eventHandler = handler;
        this.playbackInfo = PlaybackInfo.createDummy(0L, trackSelectorResult);
        this.pendingListenerNotifications = new ArrayDeque<>();
        ExoPlayerImplInternal exoPlayerImplInternal = new ExoPlayerImplInternal(rendererArr, trackSelector, trackSelectorResult, loadControl, bandwidthMeter, this.playWhenReady, this.repeatMode, this.shuffleModeEnabled, handler, clock);
        this.internalPlayer = exoPlayerImplInternal;
        this.internalPlayerHandler = new Handler(exoPlayerImplInternal.getPlaybackLooper());
    }

    private PlaybackInfo getResetPlaybackInfo(boolean z, boolean z2, boolean z3, int i) {
        if (z) {
            this.maskingWindowIndex = 0;
            this.maskingPeriodIndex = 0;
            this.maskingWindowPositionMs = 0L;
        } else {
            this.maskingWindowIndex = getCurrentWindowIndex();
            this.maskingPeriodIndex = getCurrentPeriodIndex();
            this.maskingWindowPositionMs = getCurrentPosition();
        }
        boolean z4 = z || z2;
        PlaybackInfo playbackInfo = this.playbackInfo;
        MediaSource.MediaPeriodId dummyFirstMediaPeriodId = z4 ? playbackInfo.getDummyFirstMediaPeriodId(this.shuffleModeEnabled, this.window, this.period) : playbackInfo.periodId;
        long j = z4 ? 0L : this.playbackInfo.positionUs;
        return new PlaybackInfo(z2 ? Timeline.EMPTY : this.playbackInfo.timeline, dummyFirstMediaPeriodId, j, z4 ? C3219C.TIME_UNSET : this.playbackInfo.contentPositionUs, i, z3 ? null : this.playbackInfo.playbackError, false, z2 ? TrackGroupArray.EMPTY : this.playbackInfo.trackGroups, z2 ? this.emptyTrackSelectorResult : this.playbackInfo.trackSelectorResult, dummyFirstMediaPeriodId, j, 0L, j);
    }

    private void handlePlaybackInfo(PlaybackInfo playbackInfo, int i, boolean z, int i2) {
        int i3 = this.pendingOperationAcks - i;
        this.pendingOperationAcks = i3;
        if (i3 == 0) {
            if (playbackInfo.startPositionUs == C3219C.TIME_UNSET) {
                playbackInfo = playbackInfo.copyWithNewPosition(playbackInfo.periodId, 0L, playbackInfo.contentPositionUs, playbackInfo.totalBufferedDurationUs);
            }
            PlaybackInfo playbackInfo2 = playbackInfo;
            if (!this.playbackInfo.timeline.isEmpty() && playbackInfo2.timeline.isEmpty()) {
                this.maskingPeriodIndex = 0;
                this.maskingWindowIndex = 0;
                this.maskingWindowPositionMs = 0L;
            }
            int i4 = this.hasPendingPrepare ? 0 : 2;
            boolean z2 = this.hasPendingSeek;
            this.hasPendingPrepare = false;
            this.hasPendingSeek = false;
            updatePlaybackInfo(playbackInfo2, z, i2, i4, z2);
        }
    }

    private void handlePlaybackParameters(final PlaybackParameters playbackParameters, boolean z) {
        if (z) {
            this.pendingSetPlaybackParametersAcks--;
        }
        if (this.pendingSetPlaybackParametersAcks != 0 || this.playbackParameters.equals(playbackParameters)) {
            return;
        }
        this.playbackParameters = playbackParameters;
        notifyListeners(new BasePlayer.ListenerInvocation() { // from class: com.google.android.exoplayer2.b
            @Override // com.google.android.exoplayer2.BasePlayer.ListenerInvocation
            public final void invokeListener(Player.EventListener eventListener) {
                eventListener.onPlaybackParametersChanged(playbackParameters);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void invokeAll(CopyOnWriteArrayList<BasePlayer.ListenerHolder> copyOnWriteArrayList, BasePlayer.ListenerInvocation listenerInvocation) {
        Iterator<BasePlayer.ListenerHolder> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().invoke(listenerInvocation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setPlayWhenReady$0(boolean z, boolean z2, int i, boolean z3, int i2, boolean z4, boolean z5, Player.EventListener eventListener) {
        if (z) {
            eventListener.onPlayerStateChanged(z2, i);
        }
        if (z3) {
            eventListener.onPlaybackSuppressionReasonChanged(i2);
        }
        if (z4) {
            eventListener.onIsPlayingChanged(z5);
        }
    }

    private void notifyListeners(final BasePlayer.ListenerInvocation listenerInvocation) {
        final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.listeners);
        notifyListeners(new Runnable() { // from class: com.google.android.exoplayer2.d
            @Override // java.lang.Runnable
            public final void run() {
                ExoPlayerImpl.invokeAll(copyOnWriteArrayList, listenerInvocation);
            }
        });
    }

    private long periodPositionUsToWindowPositionMs(MediaSource.MediaPeriodId mediaPeriodId, long j) {
        long jUsToMs = C3219C.usToMs(j);
        this.playbackInfo.timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        return this.period.getPositionInWindowMs() + jUsToMs;
    }

    private boolean shouldMaskPosition() {
        return this.playbackInfo.timeline.isEmpty() || this.pendingOperationAcks > 0;
    }

    private void updatePlaybackInfo(PlaybackInfo playbackInfo, boolean z, int i, int i2, boolean z2) {
        boolean zIsPlaying = isPlaying();
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        this.playbackInfo = playbackInfo;
        notifyListeners(new PlaybackInfoUpdate(playbackInfo, playbackInfo2, this.listeners, this.trackSelector, z, i, i2, z2, this.playWhenReady, zIsPlaying != isPlaying()));
    }

    @Override // com.google.android.exoplayer2.Player
    public void addListener(Player.EventListener eventListener) {
        this.listeners.addIfAbsent(new BasePlayer.ListenerHolder(eventListener));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public PlayerMessage createMessage(PlayerMessage.Target target) {
        return new PlayerMessage(this.internalPlayer, target, this.playbackInfo.timeline, getCurrentWindowIndex(), this.internalPlayerHandler);
    }

    @Override // com.google.android.exoplayer2.Player
    public Looper getApplicationLooper() {
        return this.eventHandler.getLooper();
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    public Player.AudioComponent getAudioComponent() {
        return null;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getBufferedPosition() {
        if (!isPlayingAd()) {
            return getContentBufferedPosition();
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        return playbackInfo.loadingMediaPeriodId.equals(playbackInfo.periodId) ? C3219C.usToMs(this.playbackInfo.bufferedPositionUs) : getDuration();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentBufferedPosition() {
        if (shouldMaskPosition()) {
            return this.maskingWindowPositionMs;
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.loadingMediaPeriodId.windowSequenceNumber != playbackInfo.periodId.windowSequenceNumber) {
            return playbackInfo.timeline.getWindow(getCurrentWindowIndex(), this.window).getDurationMs();
        }
        long j = playbackInfo.bufferedPositionUs;
        if (this.playbackInfo.loadingMediaPeriodId.isAd()) {
            PlaybackInfo playbackInfo2 = this.playbackInfo;
            Timeline.Period periodByUid = playbackInfo2.timeline.getPeriodByUid(playbackInfo2.loadingMediaPeriodId.periodUid, this.period);
            long adGroupTimeUs = periodByUid.getAdGroupTimeUs(this.playbackInfo.loadingMediaPeriodId.adGroupIndex);
            j = adGroupTimeUs == Long.MIN_VALUE ? periodByUid.durationUs : adGroupTimeUs;
        }
        return periodPositionUsToWindowPositionMs(this.playbackInfo.loadingMediaPeriodId, j);
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentPosition() {
        if (!isPlayingAd()) {
            return getCurrentPosition();
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, this.period);
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        return playbackInfo2.contentPositionUs == C3219C.TIME_UNSET ? playbackInfo2.timeline.getWindow(getCurrentWindowIndex(), this.window).getDefaultPositionMs() : this.period.getPositionInWindowMs() + C3219C.usToMs(this.playbackInfo.contentPositionUs);
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdGroupIndex() {
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adGroupIndex;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdIndexInAdGroup() {
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adIndexInAdGroup;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentPeriodIndex() {
        if (shouldMaskPosition()) {
            return this.maskingPeriodIndex;
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        return playbackInfo.timeline.getIndexOfPeriod(playbackInfo.periodId.periodUid);
    }

    @Override // com.google.android.exoplayer2.Player
    public long getCurrentPosition() {
        if (shouldMaskPosition()) {
            return this.maskingWindowPositionMs;
        }
        if (this.playbackInfo.periodId.isAd()) {
            return C3219C.usToMs(this.playbackInfo.positionUs);
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        return periodPositionUsToWindowPositionMs(playbackInfo.periodId, playbackInfo.positionUs);
    }

    @Override // com.google.android.exoplayer2.Player
    public Timeline getCurrentTimeline() {
        return this.playbackInfo.timeline;
    }

    @Override // com.google.android.exoplayer2.Player
    public TrackGroupArray getCurrentTrackGroups() {
        return this.playbackInfo.trackGroups;
    }

    @Override // com.google.android.exoplayer2.Player
    public TrackSelectionArray getCurrentTrackSelections() {
        return this.playbackInfo.trackSelectorResult.selections;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentWindowIndex() {
        if (shouldMaskPosition()) {
            return this.maskingWindowIndex;
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        return playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, this.period).windowIndex;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getDuration() {
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
        playbackInfo.timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        return C3219C.usToMs(this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup));
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    public Player.MetadataComponent getMetadataComponent() {
        return null;
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    public ExoPlaybackException getPlaybackError() {
        return this.playbackInfo.playbackError;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public Looper getPlaybackLooper() {
        return this.internalPlayer.getPlaybackLooper();
    }

    @Override // com.google.android.exoplayer2.Player
    public PlaybackParameters getPlaybackParameters() {
        return this.playbackParameters;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackState() {
        return this.playbackInfo.playbackState;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackSuppressionReason() {
        return this.playbackSuppressionReason;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getRendererCount() {
        return this.renderers.length;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getRendererType(int i) {
        return this.renderers[i].getTrackType();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getRepeatMode() {
        return this.repeatMode;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public SeekParameters getSeekParameters() {
        return this.seekParameters;
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getShuffleModeEnabled() {
        return this.shuffleModeEnabled;
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    public Player.TextComponent getTextComponent() {
        return null;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getTotalBufferedDuration() {
        return C3219C.usToMs(this.playbackInfo.totalBufferedDurationUs);
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    public Player.VideoComponent getVideoComponent() {
        return null;
    }

    public void handleEvent(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException();
            }
            handlePlaybackParameters((PlaybackParameters) message.obj, message.arg1 != 0);
        } else {
            PlaybackInfo playbackInfo = (PlaybackInfo) message.obj;
            int i2 = message.arg1;
            int i3 = message.arg2;
            handlePlaybackInfo(playbackInfo, i2, i3 != -1, i3);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isLoading() {
        return this.playbackInfo.isLoading;
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isPlayingAd() {
        return !shouldMaskPosition() && this.playbackInfo.periodId.isAd();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void prepare(MediaSource mediaSource) {
        prepare(mediaSource, true, true);
    }

    @Override // com.google.android.exoplayer2.Player
    public void release() {
        Log.m17584i(TAG, "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.11.8] [" + Util.DEVICE_DEBUG_INFO + "] [" + ExoPlayerLibraryInfo.registeredModules() + "]");
        this.mediaSource = null;
        this.internalPlayer.release();
        this.eventHandler.removeCallbacksAndMessages(null);
        this.playbackInfo = getResetPlaybackInfo(false, false, false, 1);
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeListener(Player.EventListener eventListener) {
        for (BasePlayer.ListenerHolder listenerHolder : this.listeners) {
            if (listenerHolder.listener.equals(eventListener)) {
                listenerHolder.release();
                this.listeners.remove(listenerHolder);
            }
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void retry() {
        MediaSource mediaSource = this.mediaSource;
        if (mediaSource == null || this.playbackInfo.playbackState != 1) {
            return;
        }
        prepare(mediaSource, false, false);
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekTo(int i, long j) {
        Timeline timeline = this.playbackInfo.timeline;
        if (i < 0 || (!timeline.isEmpty() && i >= timeline.getWindowCount())) {
            throw new IllegalSeekPositionException(timeline, i, j);
        }
        this.hasPendingSeek = true;
        this.pendingOperationAcks++;
        if (isPlayingAd()) {
            Log.m17586w(TAG, "seekTo ignored because an ad is playing");
            this.eventHandler.obtainMessage(0, 1, -1, this.playbackInfo).sendToTarget();
            return;
        }
        this.maskingWindowIndex = i;
        if (timeline.isEmpty()) {
            this.maskingWindowPositionMs = j == C3219C.TIME_UNSET ? 0L : j;
            this.maskingPeriodIndex = 0;
        } else {
            long defaultPositionUs = j == C3219C.TIME_UNSET ? timeline.getWindow(i, this.window).getDefaultPositionUs() : C3219C.msToUs(j);
            Pair<Object, Long> periodPosition = timeline.getPeriodPosition(this.window, this.period, i, defaultPositionUs);
            this.maskingWindowPositionMs = C3219C.usToMs(defaultPositionUs);
            this.maskingPeriodIndex = timeline.getIndexOfPeriod(periodPosition.first);
        }
        this.internalPlayer.seekTo(timeline, i, C3219C.msToUs(j));
        notifyListeners(new BasePlayer.ListenerInvocation() { // from class: com.google.android.exoplayer2.g
            @Override // com.google.android.exoplayer2.BasePlayer.ListenerInvocation
            public final void invokeListener(Player.EventListener eventListener) {
                eventListener.onPositionDiscontinuity(1);
            }
        });
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setForegroundMode(boolean z) {
        if (this.foregroundMode != z) {
            this.foregroundMode = z;
            this.internalPlayer.setForegroundMode(z);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlayWhenReady(boolean z) {
        setPlayWhenReady(z, 0);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaybackParameters(@Nullable final PlaybackParameters playbackParameters) {
        if (playbackParameters == null) {
            playbackParameters = PlaybackParameters.DEFAULT;
        }
        if (this.playbackParameters.equals(playbackParameters)) {
            return;
        }
        this.pendingSetPlaybackParametersAcks++;
        this.playbackParameters = playbackParameters;
        this.internalPlayer.setPlaybackParameters(playbackParameters);
        notifyListeners(new BasePlayer.ListenerInvocation() { // from class: com.google.android.exoplayer2.h
            @Override // com.google.android.exoplayer2.BasePlayer.ListenerInvocation
            public final void invokeListener(Player.EventListener eventListener) {
                eventListener.onPlaybackParametersChanged(playbackParameters);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player
    public void setRepeatMode(final int i) {
        if (this.repeatMode != i) {
            this.repeatMode = i;
            this.internalPlayer.setRepeatMode(i);
            notifyListeners(new BasePlayer.ListenerInvocation() { // from class: com.google.android.exoplayer2.f
                @Override // com.google.android.exoplayer2.BasePlayer.ListenerInvocation
                public final void invokeListener(Player.EventListener eventListener) {
                    eventListener.onRepeatModeChanged(i);
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setSeekParameters(@Nullable SeekParameters seekParameters) {
        if (seekParameters == null) {
            seekParameters = SeekParameters.DEFAULT;
        }
        if (this.seekParameters.equals(seekParameters)) {
            return;
        }
        this.seekParameters = seekParameters;
        this.internalPlayer.setSeekParameters(seekParameters);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setShuffleModeEnabled(final boolean z) {
        if (this.shuffleModeEnabled != z) {
            this.shuffleModeEnabled = z;
            this.internalPlayer.setShuffleModeEnabled(z);
            notifyListeners(new BasePlayer.ListenerInvocation() { // from class: com.google.android.exoplayer2.c
                @Override // com.google.android.exoplayer2.BasePlayer.ListenerInvocation
                public final void invokeListener(Player.EventListener eventListener) {
                    eventListener.onShuffleModeEnabledChanged(z);
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public void stop(boolean z) {
        if (z) {
            this.mediaSource = null;
        }
        PlaybackInfo resetPlaybackInfo = getResetPlaybackInfo(z, z, z, 1);
        this.pendingOperationAcks++;
        this.internalPlayer.stop(z);
        updatePlaybackInfo(resetPlaybackInfo, false, 4, 1, false);
    }

    private void notifyListeners(Runnable runnable) {
        boolean z = !this.pendingListenerNotifications.isEmpty();
        this.pendingListenerNotifications.addLast(runnable);
        if (z) {
            return;
        }
        while (!this.pendingListenerNotifications.isEmpty()) {
            this.pendingListenerNotifications.peekFirst().run();
            this.pendingListenerNotifications.removeFirst();
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void prepare(MediaSource mediaSource, boolean z, boolean z2) {
        this.mediaSource = mediaSource;
        PlaybackInfo resetPlaybackInfo = getResetPlaybackInfo(z, z2, true, 2);
        this.hasPendingPrepare = true;
        this.pendingOperationAcks++;
        this.internalPlayer.prepare(mediaSource, z, z2);
        updatePlaybackInfo(resetPlaybackInfo, false, 4, 1, false);
    }

    public void setPlayWhenReady(final boolean z, final int i) {
        boolean zIsPlaying = isPlaying();
        boolean z2 = this.playWhenReady && this.playbackSuppressionReason == 0;
        boolean z3 = z && i == 0;
        if (z2 != z3) {
            this.internalPlayer.setPlayWhenReady(z3);
        }
        final boolean z4 = this.playWhenReady != z;
        final boolean z5 = this.playbackSuppressionReason != i;
        this.playWhenReady = z;
        this.playbackSuppressionReason = i;
        final boolean zIsPlaying2 = isPlaying();
        final boolean z6 = zIsPlaying != zIsPlaying2;
        if (z4 || z5 || z6) {
            final int i2 = this.playbackInfo.playbackState;
            notifyListeners(new BasePlayer.ListenerInvocation() { // from class: com.google.android.exoplayer2.e
                @Override // com.google.android.exoplayer2.BasePlayer.ListenerInvocation
                public final void invokeListener(Player.EventListener eventListener) {
                    ExoPlayerImpl.lambda$setPlayWhenReady$0(z4, z, i2, z5, i, z6, zIsPlaying2, eventListener);
                }
            });
        }
    }
}
