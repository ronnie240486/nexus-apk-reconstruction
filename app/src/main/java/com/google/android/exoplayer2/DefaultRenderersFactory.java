package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioCapabilities;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.MediaCodecAudioRenderer;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.metadata.MetadataRenderer;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.text.TextRenderer;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.video.MediaCodecVideoRenderer;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.spherical.CameraMotionRenderer;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultRenderersFactory implements RenderersFactory {
    public static final long DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS = 5000;
    public static final int EXTENSION_RENDERER_MODE_OFF = 0;
    public static final int EXTENSION_RENDERER_MODE_ON = 1;
    public static final int EXTENSION_RENDERER_MODE_PREFER = 2;
    protected static final int MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY = 50;
    private static final String TAG = "DefaultRenderersFactory";
    private long allowedVideoJoiningTimeMs;
    private final Context context;

    @Nullable
    private DrmSessionManager<FrameworkMediaCrypto> drmSessionManager;
    private boolean enableDecoderFallback;
    private int extensionRendererMode;
    private MediaCodecSelector mediaCodecSelector;
    private boolean playClearSamplesWithoutKeys;

    /* JADX INFO: loaded from: classes.dex */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ExtensionRendererMode {
    }

    public DefaultRenderersFactory(Context context) {
        this.context = context;
        this.extensionRendererMode = 0;
        this.allowedVideoJoiningTimeMs = DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
        this.mediaCodecSelector = MediaCodecSelector.DEFAULT;
    }

    public AudioProcessor[] buildAudioProcessors() {
        return new AudioProcessor[0];
    }

    public void buildAudioRenderers(Context context, int i, MediaCodecSelector mediaCodecSelector, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z, boolean z2, AudioProcessor[] audioProcessorArr, Handler handler, AudioRendererEventListener audioRendererEventListener, ArrayList<Renderer> arrayList) {
        String str;
        int i2;
        int i3;
        arrayList.add(new MediaCodecAudioRenderer(context, mediaCodecSelector, drmSessionManager, z, z2, handler, audioRendererEventListener, new DefaultAudioSink(AudioCapabilities.getCapabilities(context), audioProcessorArr)));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (Renderer) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioProcessor[].class).newInstance(handler, audioRendererEventListener, audioProcessorArr));
                    str = TAG;
                    try {
                        Log.m17584i(str, "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused) {
                        size = i2;
                        i2 = size;
                    }
                } catch (ClassNotFoundException unused2) {
                    str = TAG;
                }
            } catch (ClassNotFoundException unused3) {
                str = TAG;
            }
            try {
                try {
                    i3 = i2 + 1;
                    try {
                        arrayList.add(i2, (Renderer) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioProcessor[].class).newInstance(handler, audioRendererEventListener, audioProcessorArr));
                        Log.m17584i(str, "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused4) {
                        i2 = i3;
                        i3 = i2;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating FLAC extension", e);
                }
            } catch (ClassNotFoundException unused5) {
            }
            try {
                arrayList.add(i3, (Renderer) FfmpegAudioRenderer.class.getConstructor(Handler.class, AudioRendererEventListener.class, AudioProcessor[].class).newInstance(handler, audioRendererEventListener, audioProcessorArr));
                Log.m17584i(str, "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused6) {
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e2);
            }
        } catch (Exception e3) {
            throw new RuntimeException("Error instantiating Opus extension", e3);
        }
    }

    public void buildCameraMotionRenderers(Context context, int i, ArrayList<Renderer> arrayList) {
        arrayList.add(new CameraMotionRenderer());
    }

    public void buildMetadataRenderers(Context context, MetadataOutput metadataOutput, Looper looper, int i, ArrayList<Renderer> arrayList) {
        arrayList.add(new MetadataRenderer(metadataOutput, looper));
    }

    public void buildMiscellaneousRenderers(Context context, Handler handler, int i, ArrayList<Renderer> arrayList) {
    }

    public void buildTextRenderers(Context context, TextOutput textOutput, Looper looper, int i, ArrayList<Renderer> arrayList) {
        arrayList.add(new TextRenderer(textOutput, looper));
    }

    public void buildVideoRenderers(Context context, int i, MediaCodecSelector mediaCodecSelector, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z, boolean z2, Handler handler, VideoRendererEventListener videoRendererEventListener, long j, ArrayList<Renderer> arrayList) {
        String str;
        int i2;
        arrayList.add(new MediaCodecVideoRenderer(context, mediaCodecSelector, j, drmSessionManager, z, z2, handler, videoRendererEventListener, 50));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (Renderer) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, VideoRendererEventListener.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, videoRendererEventListener, 50));
                    str = TAG;
                    try {
                        Log.m17584i(str, "Loaded LibvpxVideoRenderer.");
                    } catch (ClassNotFoundException unused) {
                        size = i2;
                        i2 = size;
                    }
                } catch (ClassNotFoundException unused2) {
                    str = TAG;
                }
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating VP9 extension", e);
            }
        } catch (ClassNotFoundException unused3) {
            str = TAG;
        }
        try {
            arrayList.add(i2, (Renderer) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, VideoRendererEventListener.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, videoRendererEventListener, 50));
            Log.m17584i(str, "Loaded Libgav1VideoRenderer.");
        } catch (ClassNotFoundException unused4) {
        } catch (Exception e2) {
            throw new RuntimeException("Error instantiating AV1 extension", e2);
        }
    }

    @Override // com.google.android.exoplayer2.RenderersFactory
    public Renderer[] createRenderers(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager) {
        DrmSessionManager<FrameworkMediaCrypto> drmSessionManager2 = drmSessionManager == null ? this.drmSessionManager : drmSessionManager;
        ArrayList<Renderer> arrayList = new ArrayList<>();
        DrmSessionManager<FrameworkMediaCrypto> drmSessionManager3 = drmSessionManager2;
        buildVideoRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, drmSessionManager3, this.playClearSamplesWithoutKeys, this.enableDecoderFallback, handler, videoRendererEventListener, this.allowedVideoJoiningTimeMs, arrayList);
        buildAudioRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, drmSessionManager3, this.playClearSamplesWithoutKeys, this.enableDecoderFallback, buildAudioProcessors(), handler, audioRendererEventListener, arrayList);
        buildTextRenderers(this.context, textOutput, handler.getLooper(), this.extensionRendererMode, arrayList);
        buildMetadataRenderers(this.context, metadataOutput, handler.getLooper(), this.extensionRendererMode, arrayList);
        buildCameraMotionRenderers(this.context, this.extensionRendererMode, arrayList);
        buildMiscellaneousRenderers(this.context, handler, this.extensionRendererMode, arrayList);
        return (Renderer[]) arrayList.toArray(new Renderer[0]);
    }

    public DefaultRenderersFactory setAllowedVideoJoiningTimeMs(long j) {
        this.allowedVideoJoiningTimeMs = j;
        return this;
    }

    public DefaultRenderersFactory setEnableDecoderFallback(boolean z) {
        this.enableDecoderFallback = z;
        return this;
    }

    public DefaultRenderersFactory setExtensionRendererMode(int i) {
        this.extensionRendererMode = i;
        return this;
    }

    public DefaultRenderersFactory setMediaCodecSelector(MediaCodecSelector mediaCodecSelector) {
        this.mediaCodecSelector = mediaCodecSelector;
        return this;
    }

    public DefaultRenderersFactory setPlayClearSamplesWithoutKeys(boolean z) {
        this.playClearSamplesWithoutKeys = z;
        return this;
    }

    @Deprecated
    public DefaultRenderersFactory(Context context, int i) {
        this(context, i, DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    }

    @Deprecated
    public DefaultRenderersFactory(Context context, int i, long j) {
        this(context, null, i, j);
    }

    @Deprecated
    public DefaultRenderersFactory(Context context, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager) {
        this(context, drmSessionManager, 0);
    }

    @Deprecated
    public DefaultRenderersFactory(Context context, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, int i) {
        this(context, drmSessionManager, i, DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    }

    @Deprecated
    public DefaultRenderersFactory(Context context, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, int i, long j) {
        this.context = context;
        this.extensionRendererMode = i;
        this.allowedVideoJoiningTimeMs = j;
        this.drmSessionManager = drmSessionManager;
        this.mediaCodecSelector = MediaCodecSelector.DEFAULT;
    }
}
