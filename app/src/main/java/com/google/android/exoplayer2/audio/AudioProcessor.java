package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.C00;

/* JADX INFO: loaded from: classes2.dex */
public interface AudioProcessor {
    public static final ByteBuffer EMPTY_BUFFER = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class AudioFormat {
        public static final AudioFormat NOT_SET = new AudioFormat(-1, -1, -1);
        public final int bytesPerFrame;
        public final int channelCount;
        public final int encoding;
        public final int sampleRate;

        public AudioFormat(int i, int i2, int i3) {
            this.sampleRate = i;
            this.channelCount = i2;
            this.encoding = i3;
            this.bytesPerFrame = Util.isEncodingLinearPcm(i3) ? Util.getPcmFrameSize(i3, i2) : -1;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
            sb.append(this.sampleRate);
            sb.append(", channelCount=");
            sb.append(this.channelCount);
            sb.append(", encoding=");
            return C00.m823a(sb, this.encoding, ']');
        }
    }

    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(AudioFormat audioFormat) {
            super("Unhandled format: " + audioFormat);
        }
    }

    AudioFormat configure(AudioFormat audioFormat) throws UnhandledAudioFormatException;

    void flush();

    ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();
}
