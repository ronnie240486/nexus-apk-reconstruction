package tv.danmaku.ijk.media.player;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.android.exoplayer2.PlaybackParameters;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;

/* JADX INFO: loaded from: classes3.dex */
public class MediaPlayerProxy implements IMediaPlayer {
    protected final IMediaPlayer mBackEndMediaPlayer;

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.player.MediaPlayerProxy$1 */
    public class C54701 implements IMediaPlayer.OnPreparedListener {
        final /* synthetic */ MediaPlayerProxy this$0;
        final /* synthetic */ IMediaPlayer.OnPreparedListener val$finalListener;

        /* JADX WARN: Invalid debug info offset */
        public C54701(MediaPlayerProxy mediaPlayerProxy, IMediaPlayer.OnPreparedListener onPreparedListener) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
        }
    }

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.player.MediaPlayerProxy$2 */
    public class C54712 implements IMediaPlayer.OnCompletionListener {
        final /* synthetic */ MediaPlayerProxy this$0;
        final /* synthetic */ IMediaPlayer.OnCompletionListener val$finalListener;

        /* JADX WARN: Invalid debug info offset */
        public C54712(MediaPlayerProxy mediaPlayerProxy, IMediaPlayer.OnCompletionListener onCompletionListener) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
        }
    }

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.player.MediaPlayerProxy$3 */
    public class C54723 implements IMediaPlayer.OnBufferingUpdateListener {
        final /* synthetic */ MediaPlayerProxy this$0;
        final /* synthetic */ IMediaPlayer.OnBufferingUpdateListener val$finalListener;

        /* JADX WARN: Invalid debug info offset */
        public C54723(MediaPlayerProxy mediaPlayerProxy, IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
        }
    }

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.player.MediaPlayerProxy$4 */
    public class C54734 implements IMediaPlayer.OnSeekCompleteListener {
        final /* synthetic */ MediaPlayerProxy this$0;
        final /* synthetic */ IMediaPlayer.OnSeekCompleteListener val$finalListener;

        /* JADX WARN: Invalid debug info offset */
        public C54734(MediaPlayerProxy mediaPlayerProxy, IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
        }
    }

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.player.MediaPlayerProxy$5 */
    public class C54745 implements IMediaPlayer.OnVideoSizeChangedListener {
        final /* synthetic */ MediaPlayerProxy this$0;
        final /* synthetic */ IMediaPlayer.OnVideoSizeChangedListener val$finalListener;

        /* JADX WARN: Invalid debug info offset */
        public C54745(MediaPlayerProxy mediaPlayerProxy, IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
        }
    }

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.player.MediaPlayerProxy$6 */
    public class C54756 implements IMediaPlayer.OnErrorListener {
        final /* synthetic */ MediaPlayerProxy this$0;
        final /* synthetic */ IMediaPlayer.OnErrorListener val$finalListener;

        /* JADX WARN: Invalid debug info offset */
        public C54756(MediaPlayerProxy mediaPlayerProxy, IMediaPlayer.OnErrorListener onErrorListener) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.player.MediaPlayerProxy$7 */
    public class C54767 implements IMediaPlayer.OnInfoListener {
        final /* synthetic */ MediaPlayerProxy this$0;
        final /* synthetic */ IMediaPlayer.OnInfoListener val$finalListener;

        /* JADX WARN: Invalid debug info offset */
        public C54767(MediaPlayerProxy mediaPlayerProxy, IMediaPlayer.OnInfoListener onInfoListener) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.player.MediaPlayerProxy$8 */
    public class C54778 implements IMediaPlayer.OnTimedTextListener {
        final /* synthetic */ MediaPlayerProxy this$0;
        final /* synthetic */ IMediaPlayer.OnTimedTextListener val$finalListener;

        /* JADX WARN: Invalid debug info offset */
        public C54778(MediaPlayerProxy mediaPlayerProxy, IMediaPlayer.OnTimedTextListener onTimedTextListener) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public MediaPlayerProxy(IMediaPlayer iMediaPlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getAudioSessionId() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getCurrentPosition() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public String getDataSource() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getDuration() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public IMediaPlayer getInternalMediaPlayer() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public MediaInfo getMediaInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public ITrackInfo[] getTrackInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoHeight() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarDen() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarNum() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoWidth() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isLooping() {
        return false;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isPlayable() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isPlaying() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void pause() throws IllegalStateException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void prepareAsync() throws IllegalStateException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void release() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void reset() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void seekTo(long j) throws IllegalStateException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setAudioStreamType(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(Context context, Uri uri) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    @TargetApi(14)
    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(FileDescriptor fileDescriptor) throws IllegalStateException, IOException, IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(IMediaDataSource iMediaDataSource) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setKeepInBackground(boolean z) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setLogEnabled(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setLooping(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnBufferingUpdateListener(IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnSeekCompleteListener(IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnTimedTextListener(IMediaPlayer.OnTimedTextListener onTimedTextListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnVideoSizeChangedListener(IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setSpeed(PlaybackParameters playbackParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    @TargetApi(14)
    public void setSurface(Surface surface) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setVolume(float f, float f2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setWakeMode(Context context, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void start() throws IllegalStateException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void stop() throws IllegalStateException {
    }
}
