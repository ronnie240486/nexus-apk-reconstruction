package tv.danmaku.ijk.media.player.misc;

import android.annotation.TargetApi;
import android.media.MediaFormat;

/* JADX INFO: loaded from: classes3.dex */
public class AndroidMediaFormat implements IMediaFormat {
    private final MediaFormat mMediaFormat;

    /* JADX WARN: Invalid debug info offset */
    public AndroidMediaFormat(MediaFormat mediaFormat) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.misc.IMediaFormat
    @TargetApi(16)
    public int getInteger(String str) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.misc.IMediaFormat
    @TargetApi(16)
    public String getString(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(16)
    public String toString() {
        return null;
    }
}
