package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class SonicAudioProcessor implements AudioProcessor {
    private static final float CLOSE_THRESHOLD = 0.01f;
    public static final float MAXIMUM_PITCH = 8.0f;
    public static final float MAXIMUM_SPEED = 8.0f;
    public static final float MINIMUM_PITCH = 0.1f;
    public static final float MINIMUM_SPEED = 0.1f;
    private static final int MIN_BYTES_FOR_SPEEDUP_CALCULATION = 1024;
    public static final int SAMPLE_RATE_NO_CHANGE = -1;
    private ByteBuffer buffer;
    private AudioProcessor.AudioFormat inputAudioFormat;
    private long inputBytes;
    private boolean inputEnded;
    private AudioProcessor.AudioFormat outputAudioFormat;
    private ByteBuffer outputBuffer;
    private long outputBytes;
    private AudioProcessor.AudioFormat pendingInputAudioFormat;
    private AudioProcessor.AudioFormat pendingOutputAudioFormat;
    private int pendingOutputSampleRate;
    private boolean pendingSonicRecreation;
    private ShortBuffer shortBuffer;

    @Nullable
    private Sonic sonic;
    private float speed = 1.0f;
    private float pitch = 1.0f;

    public SonicAudioProcessor() {
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputAudioFormat = audioFormat;
        this.outputAudioFormat = audioFormat;
        ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.shortBuffer = byteBuffer.asShortBuffer();
        this.outputBuffer = byteBuffer;
        this.pendingOutputSampleRate = -1;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.encoding != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        int i = this.pendingOutputSampleRate;
        if (i == -1) {
            i = audioFormat.sampleRate;
        }
        this.pendingInputAudioFormat = audioFormat;
        AudioProcessor.AudioFormat audioFormat2 = new AudioProcessor.AudioFormat(i, audioFormat.channelCount, 2);
        this.pendingOutputAudioFormat = audioFormat2;
        this.pendingSonicRecreation = true;
        return audioFormat2;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void flush() {
        if (isActive()) {
            AudioProcessor.AudioFormat audioFormat = this.pendingInputAudioFormat;
            this.inputAudioFormat = audioFormat;
            AudioProcessor.AudioFormat audioFormat2 = this.pendingOutputAudioFormat;
            this.outputAudioFormat = audioFormat2;
            if (this.pendingSonicRecreation) {
                this.sonic = new Sonic(audioFormat.sampleRate, audioFormat.channelCount, this.speed, this.pitch, audioFormat2.sampleRate);
            } else {
                Sonic sonic = this.sonic;
                if (sonic != null) {
                    sonic.flush();
                }
            }
        }
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        this.inputBytes = 0L;
        this.outputBytes = 0L;
        this.inputEnded = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.outputBuffer;
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.pendingOutputAudioFormat.sampleRate != -1 && (Math.abs(this.speed - 1.0f) >= CLOSE_THRESHOLD || Math.abs(this.pitch - 1.0f) >= CLOSE_THRESHOLD || this.pendingOutputAudioFormat.sampleRate != this.pendingInputAudioFormat.sampleRate);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isEnded() {
        Sonic sonic;
        return this.inputEnded && ((sonic = this.sonic) == null || sonic.getOutputSize() == 0);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueEndOfStream() {
        Sonic sonic = this.sonic;
        if (sonic != null) {
            sonic.queueEndOfStream();
        }
        this.inputEnded = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        Sonic sonic = (Sonic) Assertions.checkNotNull(this.sonic);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.inputBytes += (long) iRemaining;
            sonic.queueInput(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int outputSize = sonic.getOutputSize();
        if (outputSize > 0) {
            if (this.buffer.capacity() < outputSize) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(outputSize).order(ByteOrder.nativeOrder());
                this.buffer = byteBufferOrder;
                this.shortBuffer = byteBufferOrder.asShortBuffer();
            } else {
                this.buffer.clear();
                this.shortBuffer.clear();
            }
            sonic.getOutput(this.shortBuffer);
            this.outputBytes += (long) outputSize;
            this.buffer.limit(outputSize);
            this.outputBuffer = this.buffer;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void reset() {
        this.speed = 1.0f;
        this.pitch = 1.0f;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputAudioFormat = audioFormat;
        this.outputAudioFormat = audioFormat;
        ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.shortBuffer = byteBuffer.asShortBuffer();
        this.outputBuffer = byteBuffer;
        this.pendingOutputSampleRate = -1;
        this.pendingSonicRecreation = false;
        this.sonic = null;
        this.inputBytes = 0L;
        this.outputBytes = 0L;
        this.inputEnded = false;
    }

    public long scaleDurationForSpeedup(long j) {
        long j2 = this.outputBytes;
        if (j2 >= 1024) {
            int i = this.outputAudioFormat.sampleRate;
            int i2 = this.inputAudioFormat.sampleRate;
            long j3 = this.inputBytes;
            return i == i2 ? Util.scaleLargeTimestamp(j, j3, j2) : Util.scaleLargeTimestamp(j, j3 * ((long) i), j2 * ((long) i2));
        }
        double d = this.speed;
        double d2 = j;
        Double.isNaN(d);
        Double.isNaN(d2);
        return (long) (d * d2);
    }

    public void setOutputSampleRateHz(int i) {
        this.pendingOutputSampleRate = i;
    }

    public float setPitch(float f) {
        float fConstrainValue = Util.constrainValue(f, 0.1f, 8.0f);
        if (this.pitch != fConstrainValue) {
            this.pitch = fConstrainValue;
            this.pendingSonicRecreation = true;
        }
        return fConstrainValue;
    }

    public float setSpeed(float f) {
        float fConstrainValue = Util.constrainValue(f, 0.1f, 8.0f);
        if (this.speed != fConstrainValue) {
            this.speed = fConstrainValue;
            this.pendingSonicRecreation = true;
        }
        return fConstrainValue;
    }
}
