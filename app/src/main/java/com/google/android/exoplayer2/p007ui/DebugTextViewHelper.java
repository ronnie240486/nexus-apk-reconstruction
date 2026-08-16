package com.google.android.exoplayer2.p007ui;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.widget.TextView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Locale;
import org.apache.commons.p013io.IOUtils;
import p000.C0786MA;
import p000.C1313UP;
import p000.C1502XJ;

/* JADX INFO: loaded from: classes2.dex */
public class DebugTextViewHelper implements Player.EventListener, Runnable {
    private static final int REFRESH_INTERVAL_MS = 1000;
    private final SimpleExoPlayer player;
    private boolean started;
    private final TextView textView;

    public DebugTextViewHelper(SimpleExoPlayer simpleExoPlayer, TextView textView) {
        Assertions.checkArgument(simpleExoPlayer.getApplicationLooper() == Looper.getMainLooper());
        this.player = simpleExoPlayer;
        this.textView = textView;
    }

    private static String getDecoderCountersBufferCountString(DecoderCounters decoderCounters) {
        if (decoderCounters == null) {
            return "";
        }
        decoderCounters.ensureUpdated();
        return " sib:" + decoderCounters.skippedInputBufferCount + " sb:" + decoderCounters.skippedOutputBufferCount + " rb:" + decoderCounters.renderedOutputBufferCount + " db:" + decoderCounters.droppedBufferCount + " mcdb:" + decoderCounters.maxConsecutiveDroppedBufferCount + " dk:" + decoderCounters.droppedToKeyframeCount;
    }

    private static String getPixelAspectRatioString(float f) {
        return (f == -1.0f || f == 1.0f) ? "" : " par:".concat(String.format(Locale.US, "%.02f", Float.valueOf(f)));
    }

    public String getAudioString() {
        Format audioFormat = this.player.getAudioFormat();
        DecoderCounters audioDecoderCounters = this.player.getAudioDecoderCounters();
        if (audioFormat == null || audioDecoderCounters == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(IOUtils.f15646e);
        sb.append(audioFormat.sampleMimeType);
        sb.append("(id:");
        sb.append(audioFormat.f11055id);
        sb.append(" hz:");
        sb.append(audioFormat.sampleRate);
        sb.append(" ch:");
        sb.append(audioFormat.channelCount);
        return C0786MA.m3668a(sb, getDecoderCountersBufferCountString(audioDecoderCounters), C1313UP.f3459l);
    }

    public String getDebugString() {
        return getPlayerStateString() + getVideoString() + getAudioString();
    }

    public String getPlayerStateString() {
        String str;
        int playbackState = this.player.getPlaybackState();
        if (playbackState == 1) {
            str = "idle";
        } else if (playbackState == 2) {
            str = "buffering";
        } else if (playbackState != 3) {
            str = playbackState != 4 ? "unknown" : "ended";
        } else {
            str = "ready";
        }
        return String.format("playWhenReady:%s playbackState:%s window:%s", Boolean.valueOf(this.player.getPlayWhenReady()), str, Integer.valueOf(this.player.getCurrentWindowIndex()));
    }

    public String getVideoString() {
        Format videoFormat = this.player.getVideoFormat();
        DecoderCounters videoDecoderCounters = this.player.getVideoDecoderCounters();
        if (videoFormat == null || videoDecoderCounters == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(IOUtils.f15646e);
        sb.append(videoFormat.sampleMimeType);
        sb.append("(id:");
        sb.append(videoFormat.f11055id);
        sb.append(" r:");
        sb.append(videoFormat.width);
        sb.append("x");
        sb.append(videoFormat.height);
        sb.append(getPixelAspectRatioString(videoFormat.pixelWidthHeightRatio));
        return C0786MA.m3668a(sb, getDecoderCountersBufferCountString(videoDecoderCounters), C1313UP.f3459l);
    }

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
    public final void onPlayerStateChanged(boolean z, int i) {
        updateAndPost();
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onPositionDiscontinuity(int i) {
        updateAndPost();
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
    public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
        C1502XJ.m7051k(this, timeline, i);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        C1502XJ.m7053m(this, trackGroupArray, trackSelectionArray);
    }

    @Override // java.lang.Runnable
    public final void run() {
        updateAndPost();
    }

    public final void start() {
        if (this.started) {
            return;
        }
        this.started = true;
        this.player.addListener(this);
        updateAndPost();
    }

    public final void stop() {
        if (this.started) {
            this.started = false;
            this.player.removeListener(this);
            this.textView.removeCallbacks(this);
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void updateAndPost() {
        this.textView.setText(getDebugString());
        this.textView.removeCallbacks(this);
        this.textView.postDelayed(this, 1000L);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onTimelineChanged(Timeline timeline, Object obj, int i) {
        C1502XJ.m7052l(this, timeline, obj, i);
    }
}
