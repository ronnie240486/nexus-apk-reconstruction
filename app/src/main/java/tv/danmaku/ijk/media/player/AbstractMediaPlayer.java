package tv.danmaku.ijk.media.player;

import tv.danmaku.ijk.media.player.misc.IMediaDataSource;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractMediaPlayer implements IMediaPlayer {
    private IMediaPlayer.OnBufferingUpdateListener mOnBufferingUpdateListener;
    private IMediaPlayer.OnCompletionListener mOnCompletionListener;
    private IMediaPlayer.OnErrorListener mOnErrorListener;
    private IMediaPlayer.OnInfoListener mOnInfoListener;
    private IMediaPlayer.OnPreparedListener mOnPreparedListener;
    private IMediaPlayer.OnSeekCompleteListener mOnSeekCompleteListener;
    private IMediaPlayer.OnTimedTextListener mOnTimedTextListener;
    private IMediaPlayer.OnVideoSizeChangedListener mOnVideoSizeChangedListener;

    /* JADX WARN: Invalid debug info offset */
    public final void notifyOnBufferingUpdate(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void notifyOnCompletion() {
    }

    /* JADX WARN: Invalid debug info offset */
    public final boolean notifyOnError(int i, int i2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public final boolean notifyOnInfo(int i, int i2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public final void notifyOnPrepared() {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void notifyOnSeekComplete() {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void notifyOnTimedText(IjkTimedText ijkTimedText) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void notifyOnVideoSizeChanged(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void resetListeners() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(IMediaDataSource iMediaDataSource) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnBufferingUpdateListener(IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnSeekCompleteListener(IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnTimedTextListener(IMediaPlayer.OnTimedTextListener onTimedTextListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnVideoSizeChangedListener(IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
    }
}
