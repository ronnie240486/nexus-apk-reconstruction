package com.google.android.exoplayer2;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioListener;
import com.google.android.exoplayer2.audio.AuxEffectInfo;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.video.VideoDecoderOutputBufferRenderer;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.VideoListener;
import com.google.android.exoplayer2.video.spherical.CameraMotionListener;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.C1502XJ;

/* JADX INFO: loaded from: classes2.dex */
public interface Player {
    public static final int DISCONTINUITY_REASON_AD_INSERTION = 3;
    public static final int DISCONTINUITY_REASON_INTERNAL = 4;
    public static final int DISCONTINUITY_REASON_PERIOD_TRANSITION = 0;
    public static final int DISCONTINUITY_REASON_SEEK = 1;
    public static final int DISCONTINUITY_REASON_SEEK_ADJUSTMENT = 2;
    public static final int PLAYBACK_SUPPRESSION_REASON_NONE = 0;
    public static final int PLAYBACK_SUPPRESSION_REASON_TRANSIENT_AUDIO_FOCUS_LOSS = 1;
    public static final int REPEAT_MODE_ALL = 2;
    public static final int REPEAT_MODE_OFF = 0;
    public static final int REPEAT_MODE_ONE = 1;
    public static final int STATE_BUFFERING = 2;
    public static final int STATE_ENDED = 4;
    public static final int STATE_IDLE = 1;
    public static final int STATE_READY = 3;
    public static final int TIMELINE_CHANGE_REASON_DYNAMIC = 2;
    public static final int TIMELINE_CHANGE_REASON_PREPARED = 0;
    public static final int TIMELINE_CHANGE_REASON_RESET = 1;

    public interface AudioComponent {
        void addAudioListener(AudioListener audioListener);

        void clearAuxEffectInfo();

        AudioAttributes getAudioAttributes();

        int getAudioSessionId();

        float getVolume();

        void removeAudioListener(AudioListener audioListener);

        @Deprecated
        void setAudioAttributes(AudioAttributes audioAttributes);

        void setAudioAttributes(AudioAttributes audioAttributes, boolean z);

        void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

        void setVolume(float f);
    }

    @Deprecated
    public static abstract class DefaultEventListener implements EventListener {
        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
            C1502XJ.m7041a(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onLoadingChanged(boolean z) {
            C1502XJ.m7042b(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            C1502XJ.m7043c(this, playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            C1502XJ.m7044d(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerError(ExoPlaybackException exoPlaybackException) {
            C1502XJ.m7045e(this, exoPlaybackException);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            C1502XJ.m7046f(this, z, i);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPositionDiscontinuity(int i) {
            C1502XJ.m7047g(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onRepeatModeChanged(int i) {
            C1502XJ.m7048h(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekProcessed() {
            C1502XJ.m7049i(this);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            C1502XJ.m7050j(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onTimelineChanged(Timeline timeline, int i) {
            onTimelineChanged(timeline, timeline.getWindowCount() == 1 ? timeline.getWindow(0, new Timeline.Window()).manifest : null, i);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            C1502XJ.m7053m(this, trackGroupArray, trackSelectionArray);
        }

        @Deprecated
        public void onTimelineChanged(Timeline timeline, @Nullable Object obj) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onTimelineChanged(Timeline timeline, @Nullable Object obj, int i) {
            onTimelineChanged(timeline, obj);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DiscontinuityReason {
    }

    public interface EventListener {
        void onIsPlayingChanged(boolean z);

        void onLoadingChanged(boolean z);

        void onPlaybackParametersChanged(PlaybackParameters playbackParameters);

        void onPlaybackSuppressionReasonChanged(int i);

        void onPlayerError(ExoPlaybackException exoPlaybackException);

        void onPlayerStateChanged(boolean z, int i);

        void onPositionDiscontinuity(int i);

        void onRepeatModeChanged(int i);

        void onSeekProcessed();

        void onShuffleModeEnabledChanged(boolean z);

        void onTimelineChanged(Timeline timeline, int i);

        @Deprecated
        void onTimelineChanged(Timeline timeline, @Nullable Object obj, int i);

        void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray);
    }

    public interface MetadataComponent {
        void addMetadataOutput(MetadataOutput metadataOutput);

        void removeMetadataOutput(MetadataOutput metadataOutput);
    }

    /* JADX INFO: loaded from: classes.dex */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackSuppressionReason {
    }

    /* JADX INFO: loaded from: classes.dex */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    /* JADX INFO: loaded from: classes.dex */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public interface TextComponent {
        void addTextOutput(TextOutput textOutput);

        void removeTextOutput(TextOutput textOutput);
    }

    /* JADX INFO: loaded from: classes.dex */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TimelineChangeReason {
    }

    public interface VideoComponent {
        void addVideoListener(VideoListener videoListener);

        void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

        void clearVideoDecoderOutputBufferRenderer();

        void clearVideoDecoderOutputBufferRenderer(@Nullable VideoDecoderOutputBufferRenderer videoDecoderOutputBufferRenderer);

        void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

        void clearVideoSurface();

        void clearVideoSurface(@Nullable Surface surface);

        void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

        void clearVideoSurfaceView(@Nullable SurfaceView surfaceView);

        void clearVideoTextureView(@Nullable TextureView textureView);

        int getVideoScalingMode();

        void removeVideoListener(VideoListener videoListener);

        void setCameraMotionListener(CameraMotionListener cameraMotionListener);

        void setVideoDecoderOutputBufferRenderer(@Nullable VideoDecoderOutputBufferRenderer videoDecoderOutputBufferRenderer);

        void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

        void setVideoScalingMode(int i);

        void setVideoSurface(@Nullable Surface surface);

        void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

        void setVideoSurfaceView(@Nullable SurfaceView surfaceView);

        void setVideoTextureView(@Nullable TextureView textureView);
    }

    void addListener(EventListener eventListener);

    Looper getApplicationLooper();

    @Nullable
    AudioComponent getAudioComponent();

    int getBufferedPercentage();

    long getBufferedPosition();

    long getContentBufferedPosition();

    long getContentDuration();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    @Nullable
    Object getCurrentManifest();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    @Nullable
    Object getCurrentTag();

    Timeline getCurrentTimeline();

    TrackGroupArray getCurrentTrackGroups();

    TrackSelectionArray getCurrentTrackSelections();

    int getCurrentWindowIndex();

    long getDuration();

    @Nullable
    MetadataComponent getMetadataComponent();

    int getNextWindowIndex();

    boolean getPlayWhenReady();

    @Nullable
    ExoPlaybackException getPlaybackError();

    PlaybackParameters getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    int getPreviousWindowIndex();

    int getRendererCount();

    int getRendererType(int i);

    int getRepeatMode();

    boolean getShuffleModeEnabled();

    @Nullable
    TextComponent getTextComponent();

    long getTotalBufferedDuration();

    @Nullable
    VideoComponent getVideoComponent();

    boolean hasNext();

    boolean hasPrevious();

    boolean isCurrentWindowDynamic();

    boolean isCurrentWindowLive();

    boolean isCurrentWindowSeekable();

    boolean isLoading();

    boolean isPlaying();

    boolean isPlayingAd();

    void next();

    void previous();

    void release();

    void removeListener(EventListener eventListener);

    void seekTo(int i, long j);

    void seekTo(long j);

    void seekToDefaultPosition();

    void seekToDefaultPosition(int i);

    void setPlayWhenReady(boolean z);

    void setPlaybackParameters(@Nullable PlaybackParameters playbackParameters);

    void setRepeatMode(int i);

    void setShuffleModeEnabled(boolean z);

    void stop();

    void stop(boolean z);
}
