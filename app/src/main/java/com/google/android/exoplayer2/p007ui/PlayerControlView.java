package com.google.android.exoplayer2.p007ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.ControlDispatcher;
import com.google.android.exoplayer2.DefaultControlDispatcher;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.PlaybackPreparer;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.p007ui.PlayerControlView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.RepeatModeUtil;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.C1502XJ;

/* JADX INFO: loaded from: classes2.dex */
public class PlayerControlView extends FrameLayout {
    public static final int DEFAULT_FAST_FORWARD_MS = 15000;
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_REWIND_MS = 5000;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final long MAX_POSITION_FOR_SEEK_TO_PREVIOUS = 3000;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private long[] adGroupTimesMs;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final ComponentListener componentListener;
    private ControlDispatcher controlDispatcher;
    private long currentWindowOffset;

    @Nullable
    private final TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;

    @Nullable
    private final View fastForwardButton;
    private int fastForwardMs;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;
    private final Runnable hideAction;
    private long hideAtMs;
    private boolean isAttachedToWindow;
    private boolean multiWindowTimeBar;

    @Nullable
    private final View nextButton;

    @Nullable
    private final View pauseButton;
    private final Timeline.Period period;

    @Nullable
    private final View playButton;

    @Nullable
    private PlaybackPreparer playbackPreparer;
    private boolean[] playedAdGroups;

    @Nullable
    private Player player;

    @Nullable
    private final TextView positionView;

    @Nullable
    private final View previousButton;

    @Nullable
    private ProgressUpdateListener progressUpdateListener;
    private final String repeatAllButtonContentDescription;
    private final Drawable repeatAllButtonDrawable;
    private final String repeatOffButtonContentDescription;
    private final Drawable repeatOffButtonDrawable;
    private final String repeatOneButtonContentDescription;
    private final Drawable repeatOneButtonDrawable;

    @Nullable
    private final ImageView repeatToggleButton;
    private int repeatToggleModes;

    @Nullable
    private final View rewindButton;
    private int rewindMs;
    private boolean scrubbing;
    private boolean showMultiWindowTimeBar;
    private boolean showShuffleButton;
    private int showTimeoutMs;

    @Nullable
    private final ImageView shuffleButton;
    private final Drawable shuffleOffButtonDrawable;
    private final String shuffleOffContentDescription;
    private final Drawable shuffleOnButtonDrawable;
    private final String shuffleOnContentDescription;

    @Nullable
    private final TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private final Runnable updateProgressAction;
    private final CopyOnWriteArrayList<VisibilityListener> visibilityListeners;

    @Nullable
    private final View vrButton;
    private final Timeline.Window window;

    public final class ComponentListener implements Player.EventListener, TimeBar.OnScrubListener, View.OnClickListener {
        private ComponentListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Player player = PlayerControlView.this.player;
            if (player == null) {
                return;
            }
            if (PlayerControlView.this.nextButton == view) {
                PlayerControlView.this.next(player);
                return;
            }
            if (PlayerControlView.this.previousButton == view) {
                PlayerControlView.this.previous(player);
                return;
            }
            if (PlayerControlView.this.fastForwardButton == view) {
                PlayerControlView.this.fastForward(player);
                return;
            }
            if (PlayerControlView.this.rewindButton == view) {
                PlayerControlView.this.rewind(player);
                return;
            }
            if (PlayerControlView.this.playButton == view) {
                if (player.getPlaybackState() == 1) {
                    if (PlayerControlView.this.playbackPreparer != null) {
                        PlayerControlView.this.playbackPreparer.preparePlayback();
                    }
                } else if (player.getPlaybackState() == 4) {
                    PlayerControlView.this.seekTo(player, player.getCurrentWindowIndex(), C3219C.TIME_UNSET);
                }
                PlayerControlView.this.controlDispatcher.dispatchSetPlayWhenReady(player, true);
                return;
            }
            if (PlayerControlView.this.pauseButton == view) {
                PlayerControlView.this.controlDispatcher.dispatchSetPlayWhenReady(player, false);
            } else if (PlayerControlView.this.repeatToggleButton == view) {
                PlayerControlView.this.controlDispatcher.dispatchSetRepeatMode(player, RepeatModeUtil.getNextRepeatMode(player.getRepeatMode(), PlayerControlView.this.repeatToggleModes));
            } else if (PlayerControlView.this.shuffleButton == view) {
                PlayerControlView.this.controlDispatcher.dispatchSetShuffleModeEnabled(player, !player.getShuffleModeEnabled());
            }
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onIsPlayingChanged(boolean z) {
            PlayerControlView.this.updateProgress();
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
        public void onPlayerStateChanged(boolean z, int i) {
            PlayerControlView.this.updatePlayPauseButton();
            PlayerControlView.this.updateProgress();
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPositionDiscontinuity(int i) {
            PlayerControlView.this.updateNavigation();
            PlayerControlView.this.updateTimeline();
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onRepeatModeChanged(int i) {
            PlayerControlView.this.updateRepeatModeButton();
            PlayerControlView.this.updateNavigation();
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubMove(TimeBar timeBar, long j) {
            if (PlayerControlView.this.positionView != null) {
                PlayerControlView.this.positionView.setText(Util.getStringForTime(PlayerControlView.this.formatBuilder, PlayerControlView.this.formatter, j));
            }
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStart(TimeBar timeBar, long j) {
            PlayerControlView.this.scrubbing = true;
            if (PlayerControlView.this.positionView != null) {
                PlayerControlView.this.positionView.setText(Util.getStringForTime(PlayerControlView.this.formatBuilder, PlayerControlView.this.formatter, j));
            }
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStop(TimeBar timeBar, long j, boolean z) {
            PlayerControlView.this.scrubbing = false;
            if (z || PlayerControlView.this.player == null) {
                return;
            }
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.seekToTimeBarPosition(playerControlView.player, j);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekProcessed() {
            C1502XJ.m7049i(this);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onShuffleModeEnabledChanged(boolean z) {
            PlayerControlView.this.updateShuffleButton();
            PlayerControlView.this.updateNavigation();
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onTimelineChanged(Timeline timeline, int i) {
            PlayerControlView.this.updateNavigation();
            PlayerControlView.this.updateTimeline();
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            C1502XJ.m7053m(this, trackGroupArray, trackSelectionArray);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onTimelineChanged(Timeline timeline, Object obj, int i) {
            C1502XJ.m7052l(this, timeline, obj, i);
        }
    }

    public interface ProgressUpdateListener {
        void onProgressUpdate(long j, long j2);
    }

    public interface VisibilityListener {
        void onVisibilityChange(int i);
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.ui");
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    private static boolean canShowMultiWindowTimeBar(Timeline timeline, Timeline.Window window) {
        if (timeline.getWindowCount() > 100) {
            return false;
        }
        int windowCount = timeline.getWindowCount();
        for (int i = 0; i < windowCount; i++) {
            if (timeline.getWindow(i, window).durationUs == C3219C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fastForward(Player player) {
        int i;
        if (!player.isCurrentWindowSeekable() || (i = this.fastForwardMs) <= 0) {
            return;
        }
        seekToOffset(player, i);
    }

    private void hideAfterTimeout() {
        removeCallbacks(this.hideAction);
        if (this.showTimeoutMs <= 0) {
            this.hideAtMs = C3219C.TIME_UNSET;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i = this.showTimeoutMs;
        this.hideAtMs = jUptimeMillis + ((long) i);
        if (this.isAttachedToWindow) {
            postDelayed(this.hideAction, i);
        }
    }

    @SuppressLint({"InlinedApi"})
    private static boolean isHandledMediaKey(int i) {
        return i == 90 || i == 89 || i == 85 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void next(Player player) {
        Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.isEmpty() || player.isPlayingAd()) {
            return;
        }
        int currentWindowIndex = player.getCurrentWindowIndex();
        int nextWindowIndex = player.getNextWindowIndex();
        if (nextWindowIndex != -1) {
            seekTo(player, nextWindowIndex, C3219C.TIME_UNSET);
        } else if (currentTimeline.getWindow(currentWindowIndex, this.window).isDynamic) {
            seekTo(player, currentWindowIndex, C3219C.TIME_UNSET);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r2.isSeekable == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void previous(Player player) {
        Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.isEmpty() || player.isPlayingAd()) {
            return;
        }
        int currentWindowIndex = player.getCurrentWindowIndex();
        currentTimeline.getWindow(currentWindowIndex, this.window);
        int previousWindowIndex = player.getPreviousWindowIndex();
        if (previousWindowIndex != -1) {
            if (player.getCurrentPosition() > MAX_POSITION_FOR_SEEK_TO_PREVIOUS) {
                Timeline.Window window = this.window;
                if (window.isDynamic) {
                }
            }
            seekTo(player, previousWindowIndex, C3219C.TIME_UNSET);
            return;
        }
        seekTo(player, currentWindowIndex, 0L);
    }

    private void requestPlayPauseFocus() {
        View view;
        View view2;
        boolean zShouldShowPauseButton = shouldShowPauseButton();
        if (!zShouldShowPauseButton && (view2 = this.playButton) != null) {
            view2.requestFocus();
        } else {
            if (!zShouldShowPauseButton || (view = this.pauseButton) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rewind(Player player) {
        int i;
        if (!player.isCurrentWindowSeekable() || (i = this.rewindMs) <= 0) {
            return;
        }
        seekToOffset(player, -i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean seekTo(Player player, int i, long j) {
        return this.controlDispatcher.dispatchSeekTo(player, i, j);
    }

    private void seekToOffset(Player player, long j) {
        long currentPosition = player.getCurrentPosition() + j;
        long duration = player.getDuration();
        if (duration != C3219C.TIME_UNSET) {
            currentPosition = Math.min(currentPosition, duration);
        }
        seekTo(player, player.getCurrentWindowIndex(), Math.max(currentPosition, 0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekToTimeBarPosition(Player player, long j) {
        int currentWindowIndex;
        Timeline currentTimeline = player.getCurrentTimeline();
        if (this.multiWindowTimeBar && !currentTimeline.isEmpty()) {
            int windowCount = currentTimeline.getWindowCount();
            currentWindowIndex = 0;
            while (true) {
                long durationMs = currentTimeline.getWindow(currentWindowIndex, this.window).getDurationMs();
                if (j < durationMs) {
                    break;
                }
                if (currentWindowIndex == windowCount - 1) {
                    j = durationMs;
                    break;
                } else {
                    j -= durationMs;
                    currentWindowIndex++;
                }
            }
        } else {
            currentWindowIndex = player.getCurrentWindowIndex();
        }
        if (seekTo(player, currentWindowIndex, j)) {
            return;
        }
        updateProgress();
    }

    private void setButtonEnabled(boolean z, @Nullable View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
        view.setVisibility(0);
    }

    private boolean shouldShowPauseButton() {
        Player player = this.player;
        return (player == null || player.getPlaybackState() == 4 || this.player.getPlaybackState() == 1 || !this.player.getPlayWhenReady()) ? false : true;
    }

    private void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateTimeline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    public void updateNavigation() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            boolean z5 = false;
            if (player != null) {
                Timeline currentTimeline = player.getCurrentTimeline();
                if (currentTimeline.isEmpty() || player.isPlayingAd()) {
                    z = false;
                    z2 = false;
                    z3 = false;
                    z4 = false;
                } else {
                    currentTimeline.getWindow(player.getCurrentWindowIndex(), this.window);
                    Timeline.Window window = this.window;
                    z2 = window.isSeekable;
                    boolean z6 = z2 || !window.isDynamic || player.hasPrevious();
                    z3 = z2 && this.rewindMs > 0;
                    z4 = z2 && this.fastForwardMs > 0;
                    z = this.window.isDynamic || player.hasNext();
                    z5 = z6;
                }
            } else {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            setButtonEnabled(z5, this.previousButton);
            setButtonEnabled(z3, this.rewindButton);
            setButtonEnabled(z4, this.fastForwardButton);
            setButtonEnabled(z, this.nextButton);
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setEnabled(z2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayPauseButton() {
        boolean z;
        if (isVisible() && this.isAttachedToWindow) {
            boolean zShouldShowPauseButton = shouldShowPauseButton();
            View view = this.playButton;
            if (view != null) {
                z = zShouldShowPauseButton && view.isFocused();
                this.playButton.setVisibility(zShouldShowPauseButton ? 8 : 0);
            } else {
                z = false;
            }
            View view2 = this.pauseButton;
            if (view2 != null) {
                z |= !zShouldShowPauseButton && view2.isFocused();
                this.pauseButton.setVisibility(zShouldShowPauseButton ? 0 : 8);
            }
            if (z) {
                requestPlayPauseFocus();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateProgress() {
        long contentPosition;
        long contentBufferedPosition;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            if (player != null) {
                contentPosition = player.getContentPosition() + this.currentWindowOffset;
                contentBufferedPosition = player.getContentBufferedPosition() + this.currentWindowOffset;
            } else {
                contentPosition = 0;
                contentBufferedPosition = 0;
            }
            TextView textView = this.positionView;
            if (textView != null && !this.scrubbing) {
                textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, contentPosition));
            }
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setPosition(contentPosition);
                this.timeBar.setBufferedPosition(contentBufferedPosition);
            }
            ProgressUpdateListener progressUpdateListener = this.progressUpdateListener;
            if (progressUpdateListener != null) {
                progressUpdateListener.onProgressUpdate(contentPosition, contentBufferedPosition);
            }
            removeCallbacks(this.updateProgressAction);
            int playbackState = player == null ? 1 : player.getPlaybackState();
            if (player == null || !player.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.updateProgressAction, 1000L);
                return;
            }
            TimeBar timeBar2 = this.timeBar;
            long jMin = Math.min(timeBar2 != null ? timeBar2.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
            float f = player.getPlaybackParameters().speed;
            postDelayed(this.updateProgressAction, Util.constrainValue(f > 0.0f ? (long) (jMin / f) : 1000L, this.timeBarMinUpdateIntervalMs, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRepeatModeButton() {
        ImageView imageView;
        ImageView imageView2;
        String str;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.repeatToggleButton) != null) {
            if (this.repeatToggleModes == 0) {
                imageView.setVisibility(8);
                return;
            }
            Player player = this.player;
            if (player == null) {
                setButtonEnabled(false, imageView);
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                return;
            }
            setButtonEnabled(true, imageView);
            int repeatMode = player.getRepeatMode();
            if (repeatMode == 0) {
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                imageView2 = this.repeatToggleButton;
                str = this.repeatOffButtonContentDescription;
            } else {
                if (repeatMode != 1) {
                    if (repeatMode == 2) {
                        this.repeatToggleButton.setImageDrawable(this.repeatAllButtonDrawable);
                        imageView2 = this.repeatToggleButton;
                        str = this.repeatAllButtonContentDescription;
                    }
                    this.repeatToggleButton.setVisibility(0);
                }
                this.repeatToggleButton.setImageDrawable(this.repeatOneButtonDrawable);
                imageView2 = this.repeatToggleButton;
                str = this.repeatOneButtonContentDescription;
            }
            imageView2.setContentDescription(str);
            this.repeatToggleButton.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateShuffleButton() {
        ImageView imageView;
        ImageView imageView2;
        String str;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            Player player = this.player;
            if (!this.showShuffleButton) {
                imageView.setVisibility(8);
                return;
            }
            if (player != null) {
                setButtonEnabled(true, imageView);
                this.shuffleButton.setImageDrawable(player.getShuffleModeEnabled() ? this.shuffleOnButtonDrawable : this.shuffleOffButtonDrawable);
                imageView2 = this.shuffleButton;
                if (player.getShuffleModeEnabled()) {
                    str = this.shuffleOnContentDescription;
                }
                imageView2.setContentDescription(str);
            }
            setButtonEnabled(false, imageView);
            this.shuffleButton.setImageDrawable(this.shuffleOffButtonDrawable);
            imageView2 = this.shuffleButton;
            str = this.shuffleOffContentDescription;
            imageView2.setContentDescription(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce A[SYNTHETIC] */
    public void updateTimeline() {
        long j;
        int i;
        Timeline.Window window;
        long positionInWindowUs;
        long[] jArr;
        int length;
        Player player = this.player;
        if (player == null) {
            return;
        }
        boolean z = true;
        this.multiWindowTimeBar = this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player.getCurrentTimeline(), this.window);
        long j2 = 0;
        this.currentWindowOffset = 0L;
        Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            j = 0;
            i = 0;
        } else {
            int currentWindowIndex = player.getCurrentWindowIndex();
            boolean z2 = this.multiWindowTimeBar;
            int i2 = z2 ? 0 : currentWindowIndex;
            int windowCount = z2 ? currentTimeline.getWindowCount() - 1 : currentWindowIndex;
            long j3 = 0;
            i = 0;
            while (i2 <= windowCount) {
                if (i2 == currentWindowIndex) {
                    this.currentWindowOffset = C3219C.usToMs(j3);
                }
                currentTimeline.getWindow(i2, this.window);
                Timeline.Window window2 = this.window;
                if (window2.durationUs == C3219C.TIME_UNSET) {
                    Assertions.checkState(this.multiWindowTimeBar ^ z);
                    break;
                }
                int i3 = window2.firstPeriodIndex;
                while (true) {
                    window = this.window;
                    if (i3 <= window.lastPeriodIndex) {
                        currentTimeline.getPeriod(i3, this.period);
                        int adGroupCount = this.period.getAdGroupCount();
                        int i4 = 0;
                        while (i4 < adGroupCount) {
                            long adGroupTimeUs = this.period.getAdGroupTimeUs(i4);
                            if (adGroupTimeUs == Long.MIN_VALUE) {
                                long j4 = this.period.durationUs;
                                if (j4 != C3219C.TIME_UNSET) {
                                    adGroupTimeUs = j4;
                                    positionInWindowUs = this.period.getPositionInWindowUs() + adGroupTimeUs;
                                    if (positionInWindowUs >= j2) {
                                        jArr = this.adGroupTimesMs;
                                        if (i == jArr.length) {
                                            if (jArr.length == 0) {
                                                length = 1;
                                            } else {
                                                length = jArr.length * 2;
                                            }
                                            this.adGroupTimesMs = Arrays.copyOf(jArr, length);
                                            this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, length);
                                        }
                                        this.adGroupTimesMs[i] = C3219C.usToMs(positionInWindowUs + j3);
                                        this.playedAdGroups[i] = this.period.hasPlayedAdGroup(i4);
                                        i++;
                                    }
                                }
                            } else {
                                positionInWindowUs = this.period.getPositionInWindowUs() + adGroupTimeUs;
                                if (positionInWindowUs >= j2) {
                                    jArr = this.adGroupTimesMs;
                                    if (i == jArr.length) {
                                        if (jArr.length == 0) {
                                            length = 1;
                                        } else {
                                            length = jArr.length * 2;
                                        }
                                        this.adGroupTimesMs = Arrays.copyOf(jArr, length);
                                        this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, length);
                                    }
                                    this.adGroupTimesMs[i] = C3219C.usToMs(positionInWindowUs + j3);
                                    this.playedAdGroups[i] = this.period.hasPlayedAdGroup(i4);
                                    i++;
                                }
                            }
                            i4++;
                            j2 = 0;
                        }
                        i3++;
                        j2 = 0;
                    }
                }
                j3 += window.durationUs;
                i2++;
                z = true;
                j2 = 0;
            }
            j = j3;
        }
        long jUsToMs = C3219C.usToMs(j);
        TextView textView = this.durationView;
        if (textView != null) {
            textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, jUsToMs));
        }
        TimeBar timeBar = this.timeBar;
        if (timeBar != null) {
            timeBar.setDuration(jUsToMs);
            int length2 = this.extraAdGroupTimesMs.length;
            int i5 = i + length2;
            long[] jArr2 = this.adGroupTimesMs;
            if (i5 > jArr2.length) {
                this.adGroupTimesMs = Arrays.copyOf(jArr2, i5);
                this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, i5);
            }
            System.arraycopy(this.extraAdGroupTimesMs, 0, this.adGroupTimesMs, i, length2);
            System.arraycopy(this.extraPlayedAdGroups, 0, this.playedAdGroups, i, length2);
            this.timeBar.setAdGroupTimesMs(this.adGroupTimesMs, this.playedAdGroups, i5);
        }
        updateProgress();
    }

    public void addVisibilityListener(VisibilityListener visibilityListener) {
        this.visibilityListeners.add(visibilityListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.player;
        if (player == null || !isHandledMediaKey(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                fastForward(player);
            } else if (keyCode == 89) {
                rewind(player);
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 85) {
                    this.controlDispatcher.dispatchSetPlayWhenReady(player, !player.getPlayWhenReady());
                } else if (keyCode == 87) {
                    next(player);
                } else if (keyCode == 88) {
                    previous(player);
                } else if (keyCode == 126) {
                    this.controlDispatcher.dispatchSetPlayWhenReady(player, true);
                } else if (keyCode == 127) {
                    this.controlDispatcher.dispatchSetPlayWhenReady(player, false);
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.hideAction);
        } else if (motionEvent.getAction() == 1) {
            hideAfterTimeout();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public Player getPlayer() {
        return this.player;
    }

    public int getRepeatToggleModes() {
        return this.repeatToggleModes;
    }

    public boolean getShowShuffleButton() {
        return this.showShuffleButton;
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public boolean getShowVrButton() {
        View view = this.vrButton;
        return view != null && view.getVisibility() == 0;
    }

    public void hide() {
        if (isVisible()) {
            setVisibility(8);
            Iterator<VisibilityListener> it = this.visibilityListeners.iterator();
            while (it.hasNext()) {
                it.next().onVisibilityChange(getVisibility());
            }
            removeCallbacks(this.updateProgressAction);
            removeCallbacks(this.hideAction);
            this.hideAtMs = C3219C.TIME_UNSET;
        }
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        long j = this.hideAtMs;
        if (j != C3219C.TIME_UNSET) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                hide();
            } else {
                postDelayed(this.hideAction, jUptimeMillis);
            }
        } else if (isVisible()) {
            hideAfterTimeout();
        }
        updateAll();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        removeCallbacks(this.hideAction);
    }

    public void removeVisibilityListener(VisibilityListener visibilityListener) {
        this.visibilityListeners.remove(visibilityListener);
    }

    public void setControlDispatcher(@Nullable ControlDispatcher controlDispatcher) {
        if (controlDispatcher == null) {
            controlDispatcher = new DefaultControlDispatcher();
        }
        this.controlDispatcher = controlDispatcher;
    }

    public void setExtraAdGroupMarkers(@Nullable long[] jArr, @Nullable boolean[] zArr) {
        if (jArr == null) {
            this.extraAdGroupTimesMs = new long[0];
            this.extraPlayedAdGroups = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) Assertions.checkNotNull(zArr);
            Assertions.checkArgument(jArr.length == zArr2.length);
            this.extraAdGroupTimesMs = jArr;
            this.extraPlayedAdGroups = zArr2;
        }
        updateTimeline();
    }

    public void setFastForwardIncrementMs(int i) {
        this.fastForwardMs = i;
        updateNavigation();
    }

    public void setPlaybackPreparer(@Nullable PlaybackPreparer playbackPreparer) {
        this.playbackPreparer = playbackPreparer;
    }

    public void setPlayer(@Nullable Player player) {
        Assertions.checkState(Looper.myLooper() == Looper.getMainLooper());
        Assertions.checkArgument(player == null || player.getApplicationLooper() == Looper.getMainLooper());
        Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.componentListener);
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.componentListener);
        }
        updateAll();
    }

    public void setProgressUpdateListener(@Nullable ProgressUpdateListener progressUpdateListener) {
        this.progressUpdateListener = progressUpdateListener;
    }

    public void setRepeatToggleModes(int i) {
        int i2;
        ControlDispatcher controlDispatcher;
        Player player;
        this.repeatToggleModes = i;
        Player player2 = this.player;
        if (player2 != null) {
            int repeatMode = player2.getRepeatMode();
            if (i != 0 || repeatMode == 0) {
                i2 = 2;
                if (i == 1 && repeatMode == 2) {
                    this.controlDispatcher.dispatchSetRepeatMode(this.player, 1);
                } else if (i == 2 && repeatMode == 1) {
                    controlDispatcher = this.controlDispatcher;
                    player = this.player;
                }
            } else {
                controlDispatcher = this.controlDispatcher;
                player = this.player;
                i2 = 0;
            }
            controlDispatcher.dispatchSetRepeatMode(player, i2);
        }
        updateRepeatModeButton();
    }

    public void setRewindIncrementMs(int i) {
        this.rewindMs = i;
        updateNavigation();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.showMultiWindowTimeBar = z;
        updateTimeline();
    }

    public void setShowShuffleButton(boolean z) {
        this.showShuffleButton = z;
        updateShuffleButton();
    }

    public void setShowTimeoutMs(int i) {
        this.showTimeoutMs = i;
        if (isVisible()) {
            hideAfterTimeout();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.vrButton;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.timeBarMinUpdateIntervalMs = Util.constrainValue(i, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.vrButton;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public void show() {
        if (!isVisible()) {
            setVisibility(0);
            Iterator<VisibilityListener> it = this.visibilityListeners.iterator();
            while (it.hasNext()) {
                it.next().onVisibilityChange(getVisibility());
            }
            updateAll();
            requestPlayPauseFocus();
        }
        hideAfterTimeout();
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static int getRepeatToggleModes(TypedArray typedArray, int i) {
        return typedArray.getInt(C3355R.styleable.PlayerControlView_repeat_toggle_modes, i);
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int resourceId = C3355R.layout.exo_player_control_view;
        this.rewindMs = 5000;
        this.fastForwardMs = 15000;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.timeBarMinUpdateIntervalMs = 200;
        this.hideAtMs = C3219C.TIME_UNSET;
        this.showShuffleButton = false;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C3355R.styleable.PlayerControlView, 0, 0);
            try {
                this.rewindMs = typedArrayObtainStyledAttributes.getInt(C3355R.styleable.PlayerControlView_rewind_increment, this.rewindMs);
                this.fastForwardMs = typedArrayObtainStyledAttributes.getInt(C3355R.styleable.PlayerControlView_fastforward_increment, this.fastForwardMs);
                this.showTimeoutMs = typedArrayObtainStyledAttributes.getInt(C3355R.styleable.PlayerControlView_show_timeout, this.showTimeoutMs);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(C3355R.styleable.PlayerControlView_controller_layout_id, resourceId);
                this.repeatToggleModes = getRepeatToggleModes(typedArrayObtainStyledAttributes, this.repeatToggleModes);
                this.showShuffleButton = typedArrayObtainStyledAttributes.getBoolean(C3355R.styleable.PlayerControlView_show_shuffle_button, this.showShuffleButton);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(C3355R.styleable.PlayerControlView_time_bar_min_update_interval, this.timeBarMinUpdateIntervalMs));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.visibilityListeners = new CopyOnWriteArrayList<>();
        this.period = new Timeline.Period();
        this.window = new Timeline.Window();
        StringBuilder sb = new StringBuilder();
        this.formatBuilder = sb;
        this.formatter = new Formatter(sb, Locale.getDefault());
        this.adGroupTimesMs = new long[0];
        this.playedAdGroups = new boolean[0];
        this.extraAdGroupTimesMs = new long[0];
        this.extraPlayedAdGroups = new boolean[0];
        ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        this.controlDispatcher = new DefaultControlDispatcher();
        this.updateProgressAction = new Runnable(this) { // from class: cK

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ PlayerControlView f10338a;

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public final void run() {
            }
        };
        this.hideAction = new Runnable(this) { // from class: dK

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ PlayerControlView f13597a;

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public final void run() {
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        TimeBar timeBar = (TimeBar) findViewById(C3355R.id.exo_progress);
        View viewFindViewById = findViewById(C3355R.id.exo_progress_placeholder);
        TimeBar timeBar2 = timeBar;
        if (timeBar != null) {
            this.timeBar = timeBar2;
        } else if (viewFindViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(C3355R.id.exo_progress);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            timeBar2 = defaultTimeBar;
            this.timeBar = timeBar2;
        } else {
            this.timeBar = null;
        }
        this.durationView = (TextView) findViewById(C3355R.id.exo_duration);
        this.positionView = (TextView) findViewById(C3355R.id.exo_position);
        TimeBar timeBar3 = this.timeBar;
        if (timeBar3 != null) {
            timeBar3.addListener(componentListener);
        }
        View viewFindViewById2 = findViewById(C3355R.id.exo_play);
        this.playButton = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(componentListener);
        }
        View viewFindViewById3 = findViewById(C3355R.id.exo_pause);
        this.pauseButton = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(componentListener);
        }
        View viewFindViewById4 = findViewById(C3355R.id.exo_prev);
        this.previousButton = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(componentListener);
        }
        View viewFindViewById5 = findViewById(C3355R.id.exo_next);
        this.nextButton = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(componentListener);
        }
        View viewFindViewById6 = findViewById(C3355R.id.exo_rew);
        this.rewindButton = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(componentListener);
        }
        View viewFindViewById7 = findViewById(C3355R.id.exo_ffwd);
        this.fastForwardButton = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(componentListener);
        }
        ImageView imageView = (ImageView) findViewById(C3355R.id.exo_repeat_toggle);
        this.repeatToggleButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(componentListener);
        }
        ImageView imageView2 = (ImageView) findViewById(C3355R.id.exo_shuffle);
        this.shuffleButton = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(componentListener);
        }
        this.vrButton = findViewById(C3355R.id.exo_vr);
        setShowVrButton(false);
        Resources resources = context.getResources();
        this.buttonAlphaEnabled = resources.getInteger(C3355R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.buttonAlphaDisabled = resources.getInteger(C3355R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.repeatOffButtonDrawable = resources.getDrawable(C3355R.drawable.exo_controls_repeat_off);
        this.repeatOneButtonDrawable = resources.getDrawable(C3355R.drawable.exo_controls_repeat_one);
        this.repeatAllButtonDrawable = resources.getDrawable(C3355R.drawable.exo_controls_repeat_all);
        this.shuffleOnButtonDrawable = resources.getDrawable(C3355R.drawable.exo_controls_shuffle_on);
        this.shuffleOffButtonDrawable = resources.getDrawable(C3355R.drawable.exo_controls_shuffle_off);
        this.repeatOffButtonContentDescription = resources.getString(C3355R.string.exo_controls_repeat_off_description);
        this.repeatOneButtonContentDescription = resources.getString(C3355R.string.exo_controls_repeat_one_description);
        this.repeatAllButtonContentDescription = resources.getString(C3355R.string.exo_controls_repeat_all_description);
        this.shuffleOnContentDescription = resources.getString(C3355R.string.exo_controls_shuffle_on_description);
        this.shuffleOffContentDescription = resources.getString(C3355R.string.exo_controls_shuffle_off_description);
    }
}
