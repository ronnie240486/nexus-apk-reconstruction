package com.google.android.exoplayer2.video.spherical;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import p000.C5516uN;

/* JADX INFO: loaded from: classes2.dex */
public class CameraMotionRenderer extends BaseRenderer {
    private static final int SAMPLE_WINDOW_DURATION_US = 100000;
    private final DecoderInputBuffer buffer;
    private long lastTimestampUs;

    @Nullable
    private CameraMotionListener listener;
    private long offsetUs;
    private final ParsableByteArray scratch;

    public CameraMotionRenderer() {
        super(5);
        this.buffer = new DecoderInputBuffer(1);
        this.scratch = new ParsableByteArray();
    }

    @Nullable
    private float[] parseMetadata(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.scratch.reset(byteBuffer.array(), byteBuffer.limit());
        this.scratch.setPosition(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.scratch.readLittleEndianInt());
        }
        return fArr;
    }

    private void resetListener() {
        this.lastTimestampUs = 0L;
        CameraMotionListener cameraMotionListener = this.listener;
        if (cameraMotionListener != null) {
            cameraMotionListener.onCameraMotionReset();
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int i, @Nullable Object obj) throws ExoPlaybackException {
        if (i == 7) {
            this.listener = (CameraMotionListener) obj;
        } else {
            super.handleMessage(i, obj);
        }
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onDisabled() {
        resetListener();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onPositionReset(long j, boolean z) throws ExoPlaybackException {
        resetListener();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStreamChanged(Format[] formatArr, long j) throws ExoPlaybackException {
        this.offsetUs = j;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long j, long j2) throws ExoPlaybackException {
        float[] metadata;
        while (!hasReadStreamToEnd() && this.lastTimestampUs < 100000 + j) {
            this.buffer.clear();
            if (readSource(getFormatHolder(), this.buffer, false) != -4 || this.buffer.isEndOfStream()) {
                return;
            }
            this.buffer.flip();
            DecoderInputBuffer decoderInputBuffer = this.buffer;
            this.lastTimestampUs = decoderInputBuffer.timeUs;
            if (this.listener != null && (metadata = parseMetadata((ByteBuffer) Util.castNonNull(decoderInputBuffer.data))) != null) {
                ((CameraMotionListener) Util.castNonNull(this.listener)).onCameraMotion(this.lastTimestampUs - this.offsetUs, metadata);
            }
        }
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsFormat(Format format) {
        return C5516uN.m28604a(MimeTypes.APPLICATION_CAMERA_MOTION.equals(format.sampleMimeType) ? 4 : 0);
    }
}
