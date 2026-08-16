package tv.danmaku.ijk.media.player;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(14)
public class TextureMediaPlayer extends MediaPlayerProxy implements IMediaPlayer, ISurfaceTextureHolder {
    private SurfaceTexture mSurfaceTexture;
    private ISurfaceTextureHost mSurfaceTextureHost;

    /* JADX WARN: Invalid debug info offset */
    public TextureMediaPlayer(IMediaPlayer iMediaPlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.ISurfaceTextureHolder
    public SurfaceTexture getSurfaceTexture() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.MediaPlayerProxy, tv.danmaku.ijk.media.player.IMediaPlayer
    public void release() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void releaseSurfaceTexture() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.MediaPlayerProxy, tv.danmaku.ijk.media.player.IMediaPlayer
    public void reset() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.MediaPlayerProxy, tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.MediaPlayerProxy, tv.danmaku.ijk.media.player.IMediaPlayer
    public void setSurface(Surface surface) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.ISurfaceTextureHolder
    public void setSurfaceTexture(SurfaceTexture surfaceTexture) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.ISurfaceTextureHolder
    public void setSurfaceTextureHost(ISurfaceTextureHost iSurfaceTextureHost) {
    }
}
