package tv.danmaku.ijk.media.player;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.android.exoplayer2.PlaybackParameters;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
import tv.danmaku.ijk.media.player.annotations.AccessedByNative;
import tv.danmaku.ijk.media.player.annotations.CalledByNative;
import tv.danmaku.ijk.media.player.misc.IAndroidIO;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;
import tv.danmaku.ijk.media.player.misc.IjkTrackInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class IjkMediaPlayer extends AbstractMediaPlayer {
    public static final int FFP_PROPV_DECODER_AVCODEC = 1;
    public static final int FFP_PROPV_DECODER_MEDIACODEC = 2;
    public static final int FFP_PROPV_DECODER_UNKNOWN = 0;
    public static final int FFP_PROPV_DECODER_VIDEOTOOLBOX = 3;
    public static final int FFP_PROP_FLOAT_DROP_FRAME_RATE = 10007;
    public static final int FFP_PROP_FLOAT_PLAYBACK_RATE = 10003;
    public static final int FFP_PROP_INT64_ASYNC_STATISTIC_BUF_BACKWARDS = 20201;
    public static final int FFP_PROP_INT64_ASYNC_STATISTIC_BUF_CAPACITY = 20203;
    public static final int FFP_PROP_INT64_ASYNC_STATISTIC_BUF_FORWARDS = 20202;
    public static final int FFP_PROP_INT64_AUDIO_CACHED_BYTES = 20008;
    public static final int FFP_PROP_INT64_AUDIO_CACHED_DURATION = 20006;
    public static final int FFP_PROP_INT64_AUDIO_CACHED_PACKETS = 20010;
    public static final int FFP_PROP_INT64_AUDIO_DECODER = 20004;
    public static final int FFP_PROP_INT64_BIT_RATE = 20100;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_COUNT_BYTES = 20208;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_FILE_FORWARDS = 20206;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_FILE_POS = 20207;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_PHYSICAL_POS = 20205;
    public static final int FFP_PROP_INT64_LATEST_SEEK_LOAD_DURATION = 20300;
    public static final int FFP_PROP_INT64_LOGICAL_FILE_SIZE = 20209;
    public static final int FFP_PROP_INT64_SELECTED_AUDIO_STREAM = 20002;
    public static final int FFP_PROP_INT64_SELECTED_TIMEDTEXT_STREAM = 20011;
    public static final int FFP_PROP_INT64_SELECTED_VIDEO_STREAM = 20001;
    public static final int FFP_PROP_INT64_SHARE_CACHE_DATA = 20210;
    public static final int FFP_PROP_INT64_TCP_SPEED = 20200;
    public static final int FFP_PROP_INT64_TRAFFIC_STATISTIC_BYTE_COUNT = 20204;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_BYTES = 20007;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_DURATION = 20005;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_PACKETS = 20009;
    public static final int FFP_PROP_INT64_VIDEO_DECODER = 20003;
    public static final int IJK_LOG_DEBUG = 3;
    public static final int IJK_LOG_DEFAULT = 1;
    public static final int IJK_LOG_ERROR = 6;
    public static final int IJK_LOG_FATAL = 7;
    public static final int IJK_LOG_INFO = 4;
    public static final int IJK_LOG_SILENT = 8;
    public static final int IJK_LOG_UNKNOWN = 0;
    public static final int IJK_LOG_VERBOSE = 2;
    public static final int IJK_LOG_WARN = 5;
    private static final int MEDIA_BUFFERING_UPDATE = 3;
    private static final int MEDIA_ERROR = 100;
    private static final int MEDIA_INFO = 200;
    private static final int MEDIA_NOP = 0;
    private static final int MEDIA_PLAYBACK_COMPLETE = 2;
    private static final int MEDIA_PREPARED = 1;
    private static final int MEDIA_SEEK_COMPLETE = 4;
    protected static final int MEDIA_SET_VIDEO_SAR = 10001;
    private static final int MEDIA_SET_VIDEO_SIZE = 5;
    private static final int MEDIA_TIMED_TEXT = 99;
    public static final int OPT_CATEGORY_CODEC = 2;
    public static final int OPT_CATEGORY_FORMAT = 1;
    public static final int OPT_CATEGORY_PLAYER = 4;
    public static final int OPT_CATEGORY_SWS = 3;
    public static final int PROP_FLOAT_VIDEO_DECODE_FRAMES_PER_SECOND = 10001;
    public static final int PROP_FLOAT_VIDEO_OUTPUT_FRAMES_PER_SECOND = 10002;
    public static final int SDL_FCC_RV16 = 909203026;
    public static final int SDL_FCC_RV32 = 842225234;
    public static final int SDL_FCC_YV12 = 842094169;
    private static final String TAG = "tv.danmaku.ijk.media.player.IjkMediaPlayer";
    private String mDataSource;
    private EventHandler mEventHandler;

    @AccessedByNative
    private int mListenerContext;

    @AccessedByNative
    private long mNativeAndroidIO;

    @AccessedByNative
    private long mNativeMediaDataSource;

    @AccessedByNative
    private long mNativeMediaPlayer;

    @AccessedByNative
    private int mNativeSurfaceTexture;
    private OnControlMessageListener mOnControlMessageListener;
    private OnMediaCodecSelectListener mOnMediaCodecSelectListener;
    private OnNativeInvokeListener mOnNativeInvokeListener;
    private boolean mScreenOnWhilePlaying;
    private boolean mStayAwake;
    private SurfaceHolder mSurfaceHolder;
    private int mVideoHeight;
    private int mVideoSarDen;
    private int mVideoSarNum;
    private int mVideoWidth;
    private PowerManager.WakeLock mWakeLock;
    private static final IjkLibLoader sLocalLibLoader = new IjkLibLoader() { // from class: tv.danmaku.ijk.media.player.IjkMediaPlayer.1
        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.IjkLibLoader
        public void loadLibrary(String str) throws SecurityException, UnsatisfiedLinkError {
        }
    };
    private static volatile boolean mIsLibLoaded = false;
    private static volatile boolean mIsNativeInitialized = false;

    public static class DefaultMediaCodecSelector implements OnMediaCodecSelectListener {
        public static final DefaultMediaCodecSelector sInstance = new DefaultMediaCodecSelector();

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.OnMediaCodecSelectListener
        @TargetApi(16)
        public String onMediaCodecSelect(IMediaPlayer iMediaPlayer, String str, int i, int i2) {
            return null;
        }
    }

    public static class EventHandler extends Handler {
        private final WeakReference<IjkMediaPlayer> mWeakPlayer;

        /* JADX WARN: Invalid debug info offset */
        public EventHandler(IjkMediaPlayer ijkMediaPlayer, Looper looper) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    public interface OnControlMessageListener {
        String onControlResolveSegmentUrl(int i);
    }

    public interface OnMediaCodecSelectListener {
        String onMediaCodecSelect(IMediaPlayer iMediaPlayer, String str, int i, int i2);
    }

    public interface OnNativeInvokeListener {
        public static final String ARG_ERROR = "error";
        public static final String ARG_FAMILIY = "family";
        public static final String ARG_FD = "fd";
        public static final String ARG_HTTP_CODE = "http_code";
        public static final String ARG_IP = "ip";
        public static final String ARG_OFFSET = "offset";
        public static final String ARG_PORT = "port";
        public static final String ARG_RETRY_COUNTER = "retry_counter";
        public static final String ARG_SEGMENT_INDEX = "segment_index";
        public static final String ARG_URL = "url";
        public static final int CTRL_DID_TCP_OPEN = 131074;
        public static final int CTRL_WILL_CONCAT_RESOLVE_SEGMENT = 131079;
        public static final int CTRL_WILL_HTTP_OPEN = 131075;
        public static final int CTRL_WILL_LIVE_OPEN = 131077;
        public static final int CTRL_WILL_TCP_OPEN = 131073;
        public static final int EVENT_DID_HTTP_OPEN = 2;
        public static final int EVENT_DID_HTTP_SEEK = 4;
        public static final int EVENT_WILL_HTTP_OPEN = 1;
        public static final int EVENT_WILL_HTTP_SEEK = 3;

        boolean onNativeInvoke(int i, Bundle bundle);
    }

    /* JADX WARN: Invalid debug info offset */
    public IjkMediaPlayer() {
    }

    /* JADX WARN: Invalid debug info offset */
    public IjkMediaPlayer(IjkLibLoader ijkLibLoader) {
    }

    private native String _getAudioCodecInfo();

    private static native String _getColorFormatName(int i);

    private native int _getLoopCount();

    private native Bundle _getMediaMeta();

    private native float _getPropertyFloat(int i, float f);

    private native long _getPropertyLong(int i, long j);

    private native String _getVideoCodecInfo();

    private native void _pause() throws IllegalStateException;

    private native void _release();

    private native void _reset();

    private native void _setAndroidIOCallback(IAndroidIO iAndroidIO) throws IllegalStateException, SecurityException, IllegalArgumentException;

    private native void _setDataSource(String str, String[] strArr, String[] strArr2) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException;

    private native void _setDataSource(IMediaDataSource iMediaDataSource) throws IllegalStateException, SecurityException, IllegalArgumentException;

    private native void _setDataSourceFd(int i) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException;

    private native void _setFrameAtTime(String str, long j, long j2, int i, int i2) throws IllegalStateException, IllegalArgumentException;

    private native void _setLoopCount(int i);

    private native void _setOption(int i, String str, long j);

    private native void _setOption(int i, String str, String str2);

    private native void _setPropertyFloat(int i, float f);

    private native void _setPropertyLong(int i, long j);

    private native void _setStreamSelected(int i, boolean z);

    private native void _setVideoSurface(Surface surface);

    private native void _start() throws IllegalStateException;

    private native void _stop() throws IllegalStateException;

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ long access$000(IjkMediaPlayer ijkMediaPlayer) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ String access$100() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ void access$200(IjkMediaPlayer ijkMediaPlayer, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ int access$300(IjkMediaPlayer ijkMediaPlayer) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ int access$302(IjkMediaPlayer ijkMediaPlayer, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ int access$400(IjkMediaPlayer ijkMediaPlayer) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ int access$402(IjkMediaPlayer ijkMediaPlayer, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ int access$500(IjkMediaPlayer ijkMediaPlayer) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ int access$502(IjkMediaPlayer ijkMediaPlayer, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ int access$600(IjkMediaPlayer ijkMediaPlayer) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ int access$602(IjkMediaPlayer ijkMediaPlayer, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getColorFormatName(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private static void initNativeOnce() {
        /*
            return
        Le:
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.IjkMediaPlayer.initNativeOnce():void");
    }

    /* JADX WARN: Invalid debug info offset */
    private void initPlayer(IjkLibLoader ijkLibLoader) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void loadLibrariesOnce(tv.danmaku.ijk.media.player.IjkLibLoader r2) {
        /*
            return
        Lc:
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.IjkMediaPlayer.loadLibrariesOnce(tv.danmaku.ijk.media.player.IjkLibLoader):void");
    }

    private final native int native_KeyInit(String str, String str2, Context context);

    private native void native_finalize();

    private static native void native_init();

    private native void native_message_loop(Object obj);

    public static native void native_profileBegin(String str);

    public static native void native_profileEnd();

    public static native void native_setLogLevel(int i);

    private native void native_setup(Object obj);

    /* JADX WARN: Invalid debug info offset */
    @CalledByNative
    private static boolean onNativeInvoke(Object obj, int i, Bundle bundle) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @CalledByNative
    private static String onSelectCodec(Object obj, String str, int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @CalledByNative
    private static void postEventFromNative(Object obj, int i, int i2, int i3, Object obj2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IOException, IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    @SuppressLint({"Wakelock"})
    private void stayAwake(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void updateSurfaceScreenOn() {
    }

    /* JADX WARN: Invalid debug info offset */
    public int Init(String str, String str2, Context context) {
        return 0;
    }

    public native void _prepareAsync() throws IllegalStateException;

    /* JADX WARN: Invalid debug info offset */
    public void deselectTrack(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void finalize() throws Throwable {
    }

    /* JADX WARN: Invalid debug info offset */
    public long getAsyncStatisticBufBackwards() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getAsyncStatisticBufCapacity() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getAsyncStatisticBufForwards() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getAudioCachedBytes() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getAudioCachedDuration() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getAudioCachedPackets() {
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public native int getAudioSessionId();

    /* JADX WARN: Invalid debug info offset */
    public long getBitRate() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getCacheStatisticCountBytes() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getCacheStatisticFileForwards() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getCacheStatisticFilePos() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getCacheStatisticPhysicalPos() {
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public native long getCurrentPosition();

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public String getDataSource() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public float getDropFrameRate() {
        return 0.0f;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public native long getDuration();

    /* JADX WARN: Invalid debug info offset */
    public long getFileSize() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0056
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public tv.danmaku.ijk.media.player.MediaInfo getMediaInfo() {
        /*
            r8 = this;
            r0 = 0
            return r0
        L61:
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.IjkMediaPlayer.getMediaInfo():tv.danmaku.ijk.media.player.MediaInfo");
    }

    /* JADX WARN: Invalid debug info offset */
    public Bundle getMediaMeta() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getSeekLoadDuration() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getSelectedTrack(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public float getSpeed(float f) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getTcpSpeed() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public /* bridge */ /* synthetic */ ITrackInfo[] getTrackInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public IjkTrackInfo[] getTrackInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getTrafficStatisticByteCount() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getVideoCachedBytes() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getVideoCachedDuration() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getVideoCachedPackets() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public float getVideoDecodeFramesPerSecond() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getVideoDecoder() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoHeight() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public float getVideoOutputFramesPerSecond() {
        return 0.0f;
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
        return true;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public native boolean isPlaying();

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
    @Override // tv.danmaku.ijk.media.player.AbstractMediaPlayer
    public void resetListeners() {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public native void seekTo(long j) throws IllegalStateException;

    /* JADX WARN: Invalid debug info offset */
    public void selectTrack(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setAndroidIOCallback(IAndroidIO iAndroidIO) throws IllegalStateException, SecurityException, IllegalArgumentException {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setAudioStreamType(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCacheShare(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(Context context, Uri uri) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x003c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    @android.annotation.TargetApi(14)
    public void setDataSource(android.content.Context r8, android.net.Uri r9, java.util.Map<java.lang.String, java.lang.String> r10) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {
        /*
            r7 = this;
            return
        L60:
        L62:
        L64:
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.IjkMediaPlayer.setDataSource(android.content.Context, android.net.Uri, java.util.Map):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    @android.annotation.TargetApi(13)
    public void setDataSource(java.io.FileDescriptor r2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {
        /*
            r1 = this;
            return
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.IjkMediaPlayer.setDataSource(java.io.FileDescriptor):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDataSource(String str, Map<String, String> map) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.AbstractMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalStateException, SecurityException, IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
    }

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
    public void setOnControlMessageListener(OnControlMessageListener onControlMessageListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOnMediaCodecSelectListener(OnMediaCodecSelectListener onMediaCodecSelectListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOnNativeInvokeListener(OnNativeInvokeListener onNativeInvokeListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOption(int i, String str, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOption(int i, String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSpeed(float f) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public native void setSpeed(PlaybackParameters playbackParameters);

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setSurface(Surface surface) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public native void setVolume(float f, float f2);

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    @SuppressLint({"Wakelock"})
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
