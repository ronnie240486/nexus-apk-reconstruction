package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import p000.C1579YX;

/* JADX INFO: loaded from: classes2.dex */
final class FloatResamplingAudioProcessor extends BaseAudioProcessor {
    private static final int FLOAT_NAN_AS_INT = Float.floatToIntBits(Float.NaN);
    private static final double PCM_32_BIT_INT_TO_PCM_32_BIT_FLOAT_FACTOR = 4.656612875245797E-10d;

    private static void writePcm32BitFloat(int i, ByteBuffer byteBuffer) {
        double d = i;
        Double.isNaN(d);
        int iFloatToIntBits = Float.floatToIntBits((float) (d * PCM_32_BIT_INT_TO_PCM_32_BIT_FLOAT_FACTOR));
        if (iFloatToIntBits == FLOAT_NAN_AS_INT) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i = audioFormat.encoding;
        if (Util.isEncodingHighResolutionPcm(i)) {
            return i != 4 ? new AudioProcessor.AudioFormat(audioFormat.sampleRate, audioFormat.channelCount, 4) : AudioProcessor.AudioFormat.NOT_SET;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferReplaceOutputBuffer;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.inputAudioFormat.encoding;
        if (i2 == 536870912) {
            byteBufferReplaceOutputBuffer = replaceOutputBuffer((i / 3) * 4);
            while (iPosition < iLimit) {
                writePcm32BitFloat(((byteBuffer.get(iPosition) & C1579YX.f3960d) << 8) | ((byteBuffer.get(iPosition + 1) & C1579YX.f3960d) << 16) | ((byteBuffer.get(iPosition + 2) & C1579YX.f3960d) << 24), byteBufferReplaceOutputBuffer);
                iPosition += 3;
            }
        } else {
            if (i2 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferReplaceOutputBuffer = replaceOutputBuffer(i);
            while (iPosition < iLimit) {
                writePcm32BitFloat((byteBuffer.get(iPosition) & C1579YX.f3960d) | ((byteBuffer.get(iPosition + 1) & C1579YX.f3960d) << 8) | ((byteBuffer.get(iPosition + 2) & C1579YX.f3960d) << 16) | ((byteBuffer.get(iPosition + 3) & C1579YX.f3960d) << 24), byteBufferReplaceOutputBuffer);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferReplaceOutputBuffer.flip();
    }
}
