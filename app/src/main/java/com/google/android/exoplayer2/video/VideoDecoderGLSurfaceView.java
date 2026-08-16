package com.google.android.exoplayer2.video;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class VideoDecoderGLSurfaceView extends GLSurfaceView {
    private final VideoDecoderRenderer renderer;

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }

    public VideoDecoderOutputBufferRenderer getVideoDecoderOutputBufferRenderer() {
        return this.renderer;
    }

    public VideoDecoderGLSurfaceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        VideoDecoderRenderer videoDecoderRenderer = new VideoDecoderRenderer(this);
        this.renderer = videoDecoderRenderer;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(videoDecoderRenderer);
        setRenderMode(0);
    }
}
