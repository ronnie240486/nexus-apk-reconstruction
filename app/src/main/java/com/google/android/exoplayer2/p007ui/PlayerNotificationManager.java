package com.google.android.exoplayer2.p007ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.ControlDispatcher;
import com.google.android.exoplayer2.DefaultControlDispatcher;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.PlaybackPreparer;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.p007ui.PlayerNotificationManager;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.NotificationUtil;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.C1502XJ;

/* JADX INFO: loaded from: classes2.dex */
public class PlayerNotificationManager {
    private static final String ACTION_DISMISS = "com.google.android.exoplayer.dismiss";
    public static final String ACTION_FAST_FORWARD = "com.google.android.exoplayer.ffwd";
    public static final String ACTION_NEXT = "com.google.android.exoplayer.next";
    public static final String ACTION_PAUSE = "com.google.android.exoplayer.pause";
    public static final String ACTION_PLAY = "com.google.android.exoplayer.play";
    public static final String ACTION_PREVIOUS = "com.google.android.exoplayer.prev";
    public static final String ACTION_REWIND = "com.google.android.exoplayer.rewind";
    public static final String ACTION_STOP = "com.google.android.exoplayer.stop";
    public static final int DEFAULT_FAST_FORWARD_MS = 15000;
    public static final int DEFAULT_REWIND_MS = 5000;
    public static final String EXTRA_INSTANCE_ID = "INSTANCE_ID";
    private static final long MAX_POSITION_FOR_SEEK_TO_PREVIOUS = 3000;
    private static final int MSG_START_OR_UPDATE_NOTIFICATION = 0;
    private static final int MSG_UPDATE_NOTIFICATION_BITMAP = 1;
    private static int instanceIdCounter;
    private int badgeIconType;

    @Nullable
    private NotificationCompat.Builder builder;

    @Nullable
    private ArrayList<NotificationCompat.Action> builderActions;
    private final String channelId;
    private int color;
    private boolean colorized;
    private final Context context;
    private ControlDispatcher controlDispatcher;
    private int currentNotificationTag;

    @Nullable
    private final CustomActionReceiver customActionReceiver;
    private final Map<String, NotificationCompat.Action> customActions;
    private int defaults;
    private final PendingIntent dismissPendingIntent;
    private long fastForwardMs;
    private final int instanceId;
    private final IntentFilter intentFilter;
    private boolean isNotificationStarted;
    private final Handler mainHandler;
    private final MediaDescriptionAdapter mediaDescriptionAdapter;

    @Nullable
    private MediaSessionCompat.Token mediaSessionToken;
    private final NotificationBroadcastReceiver notificationBroadcastReceiver;
    private final int notificationId;

    @Nullable
    private NotificationListener notificationListener;
    private final NotificationManagerCompat notificationManager;
    private final Map<String, NotificationCompat.Action> playbackActions;

    @Nullable
    private PlaybackPreparer playbackPreparer;

    @Nullable
    private Player player;
    private final Player.EventListener playerListener;
    private int priority;
    private long rewindMs;

    @DrawableRes
    private int smallIconResourceId;
    private boolean useChronometer;
    private boolean useNavigationActions;
    private boolean useNavigationActionsInCompactView;
    private boolean usePlayPauseActions;
    private boolean useStopAction;
    private int visibility;
    private final Timeline.Window window;

    public final class BitmapCallback {
        private final int notificationTag;

        private BitmapCallback(int i) {
            this.notificationTag = i;
        }

        public void onBitmap(Bitmap bitmap) {
            if (bitmap != null) {
                PlayerNotificationManager.this.postUpdateNotificationBitmap(bitmap, this.notificationTag);
            }
        }
    }

    public interface CustomActionReceiver {
        Map<String, NotificationCompat.Action> createCustomActions(Context context, int i);

        List<String> getCustomActions(Player player);

        void onCustomAction(Player player, String str, Intent intent);
    }

    public interface MediaDescriptionAdapter {
        @Nullable
        PendingIntent createCurrentContentIntent(Player player);

        @Nullable
        CharSequence getCurrentContentText(Player player);

        CharSequence getCurrentContentTitle(Player player);

        @Nullable
        Bitmap getCurrentLargeIcon(Player player, BitmapCallback bitmapCallback);

        @Nullable
        CharSequence getCurrentSubText(Player player);
    }

    public class NotificationBroadcastReceiver extends BroadcastReceiver {
        private NotificationBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Player player = PlayerNotificationManager.this.player;
            if (player != null && PlayerNotificationManager.this.isNotificationStarted && intent.getIntExtra(PlayerNotificationManager.EXTRA_INSTANCE_ID, PlayerNotificationManager.this.instanceId) == PlayerNotificationManager.this.instanceId) {
                String action = intent.getAction();
                if (PlayerNotificationManager.ACTION_PLAY.equals(action)) {
                    if (player.getPlaybackState() == 1) {
                        if (PlayerNotificationManager.this.playbackPreparer != null) {
                            PlayerNotificationManager.this.playbackPreparer.preparePlayback();
                        }
                    } else if (player.getPlaybackState() == 4) {
                        PlayerNotificationManager.this.seekTo(player, player.getCurrentWindowIndex(), C3219C.TIME_UNSET);
                    }
                    PlayerNotificationManager.this.controlDispatcher.dispatchSetPlayWhenReady(player, true);
                    return;
                }
                if (PlayerNotificationManager.ACTION_PAUSE.equals(action)) {
                    PlayerNotificationManager.this.controlDispatcher.dispatchSetPlayWhenReady(player, false);
                    return;
                }
                if (PlayerNotificationManager.ACTION_PREVIOUS.equals(action)) {
                    PlayerNotificationManager.this.previous(player);
                    return;
                }
                if (PlayerNotificationManager.ACTION_REWIND.equals(action)) {
                    PlayerNotificationManager.this.rewind(player);
                    return;
                }
                if (PlayerNotificationManager.ACTION_FAST_FORWARD.equals(action)) {
                    PlayerNotificationManager.this.fastForward(player);
                    return;
                }
                if (PlayerNotificationManager.ACTION_NEXT.equals(action)) {
                    PlayerNotificationManager.this.next(player);
                    return;
                }
                if (PlayerNotificationManager.ACTION_STOP.equals(action)) {
                    PlayerNotificationManager.this.controlDispatcher.dispatchStop(player, true);
                    return;
                }
                if (PlayerNotificationManager.ACTION_DISMISS.equals(action)) {
                    PlayerNotificationManager.this.stopNotification(true);
                } else {
                    if (action == null || PlayerNotificationManager.this.customActionReceiver == null || !PlayerNotificationManager.this.customActions.containsKey(action)) {
                        return;
                    }
                    PlayerNotificationManager.this.customActionReceiver.onCustomAction(player, action, intent);
                }
            }
        }
    }

    public interface NotificationListener {
        @Deprecated
        void onNotificationCancelled(int i);

        void onNotificationCancelled(int i, boolean z);

        void onNotificationPosted(int i, Notification notification, boolean z);

        @Deprecated
        void onNotificationStarted(int i, Notification notification);
    }

    public class PlayerListener implements Player.EventListener {
        private PlayerListener() {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onIsPlayingChanged(boolean z) {
            PlayerNotificationManager.this.postStartOrUpdateNotification();
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onLoadingChanged(boolean z) {
            C1502XJ.m7042b(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            PlayerNotificationManager.this.postStartOrUpdateNotification();
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
            PlayerNotificationManager.this.postStartOrUpdateNotification();
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPositionDiscontinuity(int i) {
            PlayerNotificationManager.this.postStartOrUpdateNotification();
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onRepeatModeChanged(int i) {
            PlayerNotificationManager.this.postStartOrUpdateNotification();
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekProcessed() {
            C1502XJ.m7049i(this);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onShuffleModeEnabledChanged(boolean z) {
            PlayerNotificationManager.this.postStartOrUpdateNotification();
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onTimelineChanged(Timeline timeline, int i) {
            PlayerNotificationManager.this.postStartOrUpdateNotification();
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

    /* JADX INFO: loaded from: classes.dex */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Priority {
    }

    /* JADX INFO: loaded from: classes.dex */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Visibility {
    }

    public PlayerNotificationManager(Context context, String str, int i, MediaDescriptionAdapter mediaDescriptionAdapter) {
        this(context, str, i, mediaDescriptionAdapter, null, null);
    }

    private static PendingIntent createBroadcastIntent(String str, Context context, int i) {
        Intent intent = new Intent(str).setPackage(context.getPackageName());
        intent.putExtra(EXTRA_INSTANCE_ID, i);
        return PendingIntent.getBroadcast(context, i, intent, 134217728);
    }

    private static Map<String, NotificationCompat.Action> createPlaybackActions(Context context, int i) {
        HashMap map = new HashMap();
        map.put(ACTION_PLAY, new NotificationCompat.Action(C3355R.drawable.exo_notification_play, context.getString(C3355R.string.exo_controls_play_description), createBroadcastIntent(ACTION_PLAY, context, i)));
        map.put(ACTION_PAUSE, new NotificationCompat.Action(C3355R.drawable.exo_notification_pause, context.getString(C3355R.string.exo_controls_pause_description), createBroadcastIntent(ACTION_PAUSE, context, i)));
        map.put(ACTION_STOP, new NotificationCompat.Action(C3355R.drawable.exo_notification_stop, context.getString(C3355R.string.exo_controls_stop_description), createBroadcastIntent(ACTION_STOP, context, i)));
        map.put(ACTION_REWIND, new NotificationCompat.Action(C3355R.drawable.exo_notification_rewind, context.getString(C3355R.string.exo_controls_rewind_description), createBroadcastIntent(ACTION_REWIND, context, i)));
        map.put(ACTION_FAST_FORWARD, new NotificationCompat.Action(C3355R.drawable.exo_notification_fastforward, context.getString(C3355R.string.exo_controls_fastforward_description), createBroadcastIntent(ACTION_FAST_FORWARD, context, i)));
        map.put(ACTION_PREVIOUS, new NotificationCompat.Action(C3355R.drawable.exo_notification_previous, context.getString(C3355R.string.exo_controls_previous_description), createBroadcastIntent(ACTION_PREVIOUS, context, i)));
        map.put(ACTION_NEXT, new NotificationCompat.Action(C3355R.drawable.exo_notification_next, context.getString(C3355R.string.exo_controls_next_description), createBroadcastIntent(ACTION_NEXT, context, i)));
        return map;
    }

    public static PlayerNotificationManager createWithNotificationChannel(Context context, String str, @StringRes int i, @StringRes int i2, int i3, MediaDescriptionAdapter mediaDescriptionAdapter) {
        NotificationUtil.createNotificationChannel(context, str, i, i2, 2);
        return new PlayerNotificationManager(context, str, i3, mediaDescriptionAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fastForward(Player player) {
        if (player.isCurrentWindowSeekable()) {
            long j = this.fastForwardMs;
            if (j > 0) {
                seekToOffset(player, j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleMessage, reason: merged with bridge method [inline-methods] */
    public boolean lambda$new$0(Message message) {
        int i = message.what;
        if (i == 0) {
            Player player = this.player;
            if (player != null) {
                startOrUpdateNotification(player, null);
            }
        } else {
            if (i != 1) {
                return false;
            }
            Player player2 = this.player;
            if (player2 != null && this.isNotificationStarted && this.currentNotificationTag == message.arg1) {
                startOrUpdateNotification(player2, (Bitmap) message.obj);
            }
        }
        return true;
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
    public void postStartOrUpdateNotification() {
        if (this.mainHandler.hasMessages(0)) {
            return;
        }
        this.mainHandler.sendEmptyMessage(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postUpdateNotificationBitmap(Bitmap bitmap, int i) {
        this.mainHandler.obtainMessage(1, i, -1, bitmap).sendToTarget();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void rewind(Player player) {
        if (player.isCurrentWindowSeekable()) {
            long j = this.rewindMs;
            if (j > 0) {
                seekToOffset(player, -j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekTo(Player player, int i, long j) {
        this.controlDispatcher.dispatchSeekTo(player, i, j);
    }

    private void seekToOffset(Player player, long j) {
        long currentPosition = player.getCurrentPosition() + j;
        long duration = player.getDuration();
        if (duration != C3219C.TIME_UNSET) {
            currentPosition = Math.min(currentPosition, duration);
        }
        seekTo(player, player.getCurrentWindowIndex(), Math.max(currentPosition, 0L));
    }

    private static void setLargeIcon(NotificationCompat.Builder builder, @Nullable Bitmap bitmap) {
        builder.setLargeIcon(bitmap);
    }

    private boolean shouldShowPauseButton(Player player) {
        return (player.getPlaybackState() == 4 || player.getPlaybackState() == 1 || !player.getPlayWhenReady()) ? false : true;
    }

    private void startOrUpdateNotification(Player player, @Nullable Bitmap bitmap) {
        boolean ongoing = getOngoing(player);
        NotificationCompat.Builder builderCreateNotification = createNotification(player, this.builder, ongoing, bitmap);
        this.builder = builderCreateNotification;
        if (builderCreateNotification == null) {
            stopNotification(false);
            return;
        }
        Notification notificationBuild = builderCreateNotification.build();
        this.notificationManager.notify(this.notificationId, notificationBuild);
        if (!this.isNotificationStarted) {
            this.isNotificationStarted = true;
            this.context.registerReceiver(this.notificationBroadcastReceiver, this.intentFilter);
            NotificationListener notificationListener = this.notificationListener;
            if (notificationListener != null) {
                notificationListener.onNotificationStarted(this.notificationId, notificationBuild);
            }
        }
        NotificationListener notificationListener2 = this.notificationListener;
        if (notificationListener2 != null) {
            notificationListener2.onNotificationPosted(this.notificationId, notificationBuild, ongoing);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopNotification(boolean z) {
        if (this.isNotificationStarted) {
            this.isNotificationStarted = false;
            this.mainHandler.removeMessages(0);
            this.notificationManager.cancel(this.notificationId);
            this.context.unregisterReceiver(this.notificationBroadcastReceiver);
            NotificationListener notificationListener = this.notificationListener;
            if (notificationListener != null) {
                notificationListener.onNotificationCancelled(this.notificationId, z);
                this.notificationListener.onNotificationCancelled(this.notificationId);
            }
        }
    }

    @Nullable
    public NotificationCompat.Builder createNotification(Player player, @Nullable NotificationCompat.Builder builder, boolean z, @Nullable Bitmap bitmap) {
        if (player.getPlaybackState() == 1 && (player.getCurrentTimeline().isEmpty() || this.playbackPreparer == null)) {
            this.builderActions = null;
            return null;
        }
        List<String> actions = getActions(player);
        ArrayList<NotificationCompat.Action> arrayList = new ArrayList<>(actions.size());
        for (int i = 0; i < actions.size(); i++) {
            String str = actions.get(i);
            NotificationCompat.Action action = (this.playbackActions.containsKey(str) ? this.playbackActions : this.customActions).get(str);
            if (action != null) {
                arrayList.add(action);
            }
        }
        if (builder == null || !arrayList.equals(this.builderActions)) {
            builder = new NotificationCompat.Builder(this.context, this.channelId);
            this.builderActions = arrayList;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                builder.addAction(arrayList.get(i2));
            }
        }
        androidx.media.app.NotificationCompat.MediaStyle mediaStyle = new androidx.media.app.NotificationCompat.MediaStyle();
        MediaSessionCompat.Token token = this.mediaSessionToken;
        if (token != null) {
            mediaStyle.setMediaSession(token);
        }
        mediaStyle.setShowActionsInCompactView(getActionIndicesForCompactView(actions, player));
        mediaStyle.setShowCancelButton(!z);
        mediaStyle.setCancelButtonIntent(this.dismissPendingIntent);
        builder.setStyle(mediaStyle);
        builder.setDeleteIntent(this.dismissPendingIntent);
        builder.setBadgeIconType(this.badgeIconType).setOngoing(z).setColor(this.color).setColorized(this.colorized).setSmallIcon(this.smallIconResourceId).setVisibility(this.visibility).setPriority(this.priority).setDefaults(this.defaults);
        if (Util.SDK_INT < 21 || !this.useChronometer || !player.isPlaying() || player.isPlayingAd() || player.isCurrentWindowDynamic() || player.getPlaybackParameters().speed != 1.0f) {
            builder.setShowWhen(false).setUsesChronometer(false);
        } else {
            builder.setWhen(System.currentTimeMillis() - player.getContentPosition()).setShowWhen(true).setUsesChronometer(true);
        }
        builder.setContentTitle(this.mediaDescriptionAdapter.getCurrentContentTitle(player));
        builder.setContentText(this.mediaDescriptionAdapter.getCurrentContentText(player));
        builder.setSubText(this.mediaDescriptionAdapter.getCurrentSubText(player));
        if (bitmap == null) {
            MediaDescriptionAdapter mediaDescriptionAdapter = this.mediaDescriptionAdapter;
            int i3 = this.currentNotificationTag + 1;
            this.currentNotificationTag = i3;
            bitmap = mediaDescriptionAdapter.getCurrentLargeIcon(player, new BitmapCallback(i3));
        }
        setLargeIcon(builder, bitmap);
        builder.setContentIntent(this.mediaDescriptionAdapter.createCurrentContentIntent(player));
        return builder;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    public int[] getActionIndicesForCompactView(List<String> list, Player player) {
        int i;
        int iIndexOf = list.indexOf(ACTION_PAUSE);
        int iIndexOf2 = list.indexOf(ACTION_PLAY);
        int iIndexOf3 = this.useNavigationActionsInCompactView ? list.indexOf(ACTION_PREVIOUS) : -1;
        int iIndexOf4 = this.useNavigationActionsInCompactView ? list.indexOf(ACTION_NEXT) : -1;
        int[] iArr = new int[3];
        int i2 = 0;
        if (iIndexOf3 != -1) {
            iArr[0] = iIndexOf3;
            i2 = 1;
        }
        boolean zShouldShowPauseButton = shouldShowPauseButton(player);
        if (iIndexOf == -1 || !zShouldShowPauseButton) {
            if (iIndexOf2 != -1 && !zShouldShowPauseButton) {
                i = i2 + 1;
                iArr[i2] = iIndexOf2;
            }
            if (iIndexOf4 != -1) {
                iArr[i2] = iIndexOf4;
                i2++;
            }
            return Arrays.copyOf(iArr, i2);
        }
        i = i2 + 1;
        iArr[i2] = iIndexOf;
        i2 = i;
        if (iIndexOf4 != -1) {
            iArr[i2] = iIndexOf4;
            i2++;
        }
        return Arrays.copyOf(iArr, i2);
    }

    public List<String> getActions(Player player) {
        boolean z;
        boolean z2;
        boolean z3;
        Timeline currentTimeline = player.getCurrentTimeline();
        boolean z4 = false;
        if (currentTimeline.isEmpty() || player.isPlayingAd()) {
            z = false;
            z2 = false;
            z3 = false;
        } else {
            currentTimeline.getWindow(player.getCurrentWindowIndex(), this.window);
            Timeline.Window window = this.window;
            boolean z5 = window.isSeekable || !window.isDynamic || player.hasPrevious();
            z2 = this.rewindMs > 0;
            z3 = this.fastForwardMs > 0;
            z4 = z5;
            z = this.window.isDynamic || player.hasNext();
        }
        ArrayList arrayList = new ArrayList();
        if (this.useNavigationActions && z4) {
            arrayList.add(ACTION_PREVIOUS);
        }
        if (z2) {
            arrayList.add(ACTION_REWIND);
        }
        if (this.usePlayPauseActions) {
            arrayList.add(shouldShowPauseButton(player) ? ACTION_PAUSE : ACTION_PLAY);
        }
        if (z3) {
            arrayList.add(ACTION_FAST_FORWARD);
        }
        if (this.useNavigationActions && z) {
            arrayList.add(ACTION_NEXT);
        }
        CustomActionReceiver customActionReceiver = this.customActionReceiver;
        if (customActionReceiver != null) {
            arrayList.addAll(customActionReceiver.getCustomActions(player));
        }
        if (this.useStopAction) {
            arrayList.add(ACTION_STOP);
        }
        return arrayList;
    }

    public boolean getOngoing(Player player) {
        int playbackState = player.getPlaybackState();
        return (playbackState == 2 || playbackState == 3) && player.getPlayWhenReady();
    }

    public void invalidate() {
        if (this.isNotificationStarted) {
            postStartOrUpdateNotification();
        }
    }

    public final void setBadgeIconType(int i) {
        if (this.badgeIconType == i) {
            return;
        }
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException();
        }
        this.badgeIconType = i;
        invalidate();
    }

    public final void setColor(int i) {
        if (this.color != i) {
            this.color = i;
            invalidate();
        }
    }

    public final void setColorized(boolean z) {
        if (this.colorized != z) {
            this.colorized = z;
            invalidate();
        }
    }

    public final void setControlDispatcher(ControlDispatcher controlDispatcher) {
        if (controlDispatcher == null) {
            controlDispatcher = new DefaultControlDispatcher();
        }
        this.controlDispatcher = controlDispatcher;
    }

    public final void setDefaults(int i) {
        if (this.defaults != i) {
            this.defaults = i;
            invalidate();
        }
    }

    public final void setFastForwardIncrementMs(long j) {
        if (this.fastForwardMs == j) {
            return;
        }
        this.fastForwardMs = j;
        invalidate();
    }

    public final void setMediaSessionToken(MediaSessionCompat.Token token) {
        if (Util.areEqual(this.mediaSessionToken, token)) {
            return;
        }
        this.mediaSessionToken = token;
        invalidate();
    }

    @Deprecated
    public final void setNotificationListener(NotificationListener notificationListener) {
        this.notificationListener = notificationListener;
    }

    public void setPlaybackPreparer(@Nullable PlaybackPreparer playbackPreparer) {
        this.playbackPreparer = playbackPreparer;
    }

    public final void setPlayer(@Nullable Player player) {
        boolean z = true;
        Assertions.checkState(Looper.myLooper() == Looper.getMainLooper());
        if (player != null && player.getApplicationLooper() != Looper.getMainLooper()) {
            z = false;
        }
        Assertions.checkArgument(z);
        Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.playerListener);
            if (player == null) {
                stopNotification(false);
            }
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.playerListener);
            postStartOrUpdateNotification();
        }
    }

    public final void setPriority(int i) {
        if (this.priority == i) {
            return;
        }
        if (i != -2 && i != -1 && i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException();
        }
        this.priority = i;
        invalidate();
    }

    public final void setRewindIncrementMs(long j) {
        if (this.rewindMs == j) {
            return;
        }
        this.rewindMs = j;
        invalidate();
    }

    public final void setSmallIcon(@DrawableRes int i) {
        if (this.smallIconResourceId != i) {
            this.smallIconResourceId = i;
            invalidate();
        }
    }

    public final void setUseChronometer(boolean z) {
        if (this.useChronometer != z) {
            this.useChronometer = z;
            invalidate();
        }
    }

    public final void setUseNavigationActions(boolean z) {
        if (this.useNavigationActions != z) {
            this.useNavigationActions = z;
            invalidate();
        }
    }

    public final void setUseNavigationActionsInCompactView(boolean z) {
        if (this.useNavigationActionsInCompactView != z) {
            this.useNavigationActionsInCompactView = z;
            invalidate();
        }
    }

    public final void setUsePlayPauseActions(boolean z) {
        if (this.usePlayPauseActions != z) {
            this.usePlayPauseActions = z;
            invalidate();
        }
    }

    public final void setUseStopAction(boolean z) {
        if (this.useStopAction == z) {
            return;
        }
        this.useStopAction = z;
        invalidate();
    }

    public final void setVisibility(int i) {
        if (this.visibility == i) {
            return;
        }
        if (i != -1 && i != 0 && i != 1) {
            throw new IllegalStateException();
        }
        this.visibility = i;
        invalidate();
    }

    public PlayerNotificationManager(Context context, String str, int i, MediaDescriptionAdapter mediaDescriptionAdapter, @Nullable CustomActionReceiver customActionReceiver) {
        this(context, str, i, mediaDescriptionAdapter, null, customActionReceiver);
    }

    public static PlayerNotificationManager createWithNotificationChannel(Context context, String str, @StringRes int i, @StringRes int i2, int i3, MediaDescriptionAdapter mediaDescriptionAdapter, @Nullable NotificationListener notificationListener) {
        NotificationUtil.createNotificationChannel(context, str, i, i2, 2);
        return new PlayerNotificationManager(context, str, i3, mediaDescriptionAdapter, notificationListener);
    }

    public PlayerNotificationManager(Context context, String str, int i, MediaDescriptionAdapter mediaDescriptionAdapter, @Nullable NotificationListener notificationListener) {
        this(context, str, i, mediaDescriptionAdapter, notificationListener, null);
    }

    @Deprecated
    public static PlayerNotificationManager createWithNotificationChannel(Context context, String str, @StringRes int i, int i2, MediaDescriptionAdapter mediaDescriptionAdapter) {
        return createWithNotificationChannel(context, str, i, 0, i2, mediaDescriptionAdapter);
    }

    public PlayerNotificationManager(Context context, String str, int i, MediaDescriptionAdapter mediaDescriptionAdapter, @Nullable NotificationListener notificationListener, @Nullable CustomActionReceiver customActionReceiver) {
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.channelId = str;
        this.notificationId = i;
        this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        this.notificationListener = notificationListener;
        this.customActionReceiver = customActionReceiver;
        this.controlDispatcher = new DefaultControlDispatcher();
        this.window = new Timeline.Window();
        int i2 = instanceIdCounter;
        instanceIdCounter = i2 + 1;
        this.instanceId = i2;
        this.mainHandler = Util.createHandler(Looper.getMainLooper(), new Handler.Callback(this) { // from class: hK

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ PlayerNotificationManager f14306a;

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return false;
            }
        });
        this.notificationManager = NotificationManagerCompat.from(applicationContext);
        this.playerListener = new PlayerListener();
        this.notificationBroadcastReceiver = new NotificationBroadcastReceiver();
        this.intentFilter = new IntentFilter();
        this.useNavigationActions = true;
        this.usePlayPauseActions = true;
        this.colorized = true;
        this.useChronometer = true;
        this.color = 0;
        this.smallIconResourceId = C3355R.drawable.exo_notification_small_icon;
        this.defaults = 0;
        this.priority = -1;
        this.fastForwardMs = 15000L;
        this.rewindMs = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
        this.badgeIconType = 1;
        this.visibility = 1;
        Map<String, NotificationCompat.Action> mapCreatePlaybackActions = createPlaybackActions(applicationContext, i2);
        this.playbackActions = mapCreatePlaybackActions;
        Iterator<String> it = mapCreatePlaybackActions.keySet().iterator();
        while (it.hasNext()) {
            this.intentFilter.addAction(it.next());
        }
        Map<String, NotificationCompat.Action> mapCreateCustomActions = customActionReceiver != null ? customActionReceiver.createCustomActions(applicationContext, this.instanceId) : Collections.emptyMap();
        this.customActions = mapCreateCustomActions;
        Iterator<String> it2 = mapCreateCustomActions.keySet().iterator();
        while (it2.hasNext()) {
            this.intentFilter.addAction(it2.next());
        }
        this.dismissPendingIntent = createBroadcastIntent(ACTION_DISMISS, applicationContext, this.instanceId);
        this.intentFilter.addAction(ACTION_DISMISS);
    }

    @Deprecated
    public static PlayerNotificationManager createWithNotificationChannel(Context context, String str, @StringRes int i, int i2, MediaDescriptionAdapter mediaDescriptionAdapter, @Nullable NotificationListener notificationListener) {
        return createWithNotificationChannel(context, str, i, 0, i2, mediaDescriptionAdapter, notificationListener);
    }
}
