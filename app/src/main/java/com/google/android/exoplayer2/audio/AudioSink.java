package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.PlaybackParameters;
import java.nio.ByteBuffer;
import p000.C1313UP;
import p000.C1469Wn;
import p000.C5630w2;

/* JADX INFO: loaded from: classes2.dex */
public interface AudioSink {
    public static final long CURRENT_POSITION_NOT_SET = Long.MIN_VALUE;

    public static final class ConfigurationException extends Exception {
        public ConfigurationException(String str) {
            super(str);
        }

        public ConfigurationException(Throwable th) {
            super(th);
        }
    }

    public static final class InitializationException extends Exception {
        public final int audioTrackState;

        /* JADX WARN: Illegal instructions before constructor call */
        public InitializationException(int i, int i2, int i3, int i4) {
            StringBuilder sbM6925a = C1469Wn.m6925a("AudioTrack init failed: ", i, ", Config(", i2, ", ");
            sbM6925a.append(i3);
            sbM6925a.append(", ");
            sbM6925a.append(i4);
            sbM6925a.append(C1313UP.f3459l);
            super(sbM6925a.toString());
            this.audioTrackState = i;
        }
    }

    public interface Listener {
        void onAudioSessionId(int i);

        void onPositionDiscontinuity();

        void onUnderrun(int i, long j, long j2);
    }

    public static final class WriteException extends Exception {
        public final int errorCode;

        public WriteException(int i) {
            super(C5630w2.m29215a("AudioTrack write failed: ", i));
            this.errorCode = i;
        }
    }

    void configure(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5, int i6) throws ConfigurationException;

    void disableTunneling();

    void enableTunnelingV21(int i);

    void flush();

    long getCurrentPositionUs(boolean z);

    PlaybackParameters getPlaybackParameters();

    boolean handleBuffer(ByteBuffer byteBuffer, long j) throws WriteException, InitializationException;

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream() throws WriteException;

    void reset();

    void setAudioAttributes(AudioAttributes audioAttributes);

    void setAudioSessionId(int i);

    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    void setListener(Listener listener);

    void setPlaybackParameters(PlaybackParameters playbackParameters);

    void setVolume(float f);

    boolean supportsOutput(int i, int i2);
}
