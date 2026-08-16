package tv.danmaku.ijk.media.player.misc;

import android.annotation.TargetApi;
import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes3.dex */
public class AndroidTrackInfo implements ITrackInfo {
    private final MediaPlayer.TrackInfo mTrackInfo;

    /* JADX WARN: Invalid debug info offset */
    private AndroidTrackInfo(MediaPlayer.TrackInfo trackInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static AndroidTrackInfo[] fromMediaPlayer(MediaPlayer mediaPlayer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static AndroidTrackInfo[] fromTrackInfo(MediaPlayer.TrackInfo[] trackInfoArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    @TargetApi(19)
    public IMediaFormat getFormat() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    @TargetApi(16)
    public String getInfoInline() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    @TargetApi(16)
    public String getLanguage() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    @TargetApi(16)
    public int getTrackType() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(16)
    public String toString() {
        return null;
    }
}
