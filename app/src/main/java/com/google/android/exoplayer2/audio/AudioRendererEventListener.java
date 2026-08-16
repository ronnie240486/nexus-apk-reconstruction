package com.google.android.exoplayer2.audio;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
public interface AudioRendererEventListener {

    public static final class EventDispatcher {

        @Nullable
        private final Handler handler;

        @Nullable
        private final AudioRendererEventListener listener;

        public EventDispatcher(@Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener) {
            this.handler = audioRendererEventListener != null ? (Handler) Assertions.checkNotNull(handler) : null;
            this.listener = audioRendererEventListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$audioSessionId$5(int i) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioSessionId(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$audioTrackUnderrun$3(int i, long j, long j2) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioSinkUnderrun(i, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$decoderInitialized$1(String str, long j, long j2) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioDecoderInitialized(str, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$disabled$4(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioDisabled(decoderCounters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$enabled$0(DecoderCounters decoderCounters) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioEnabled(decoderCounters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$inputFormatChanged$2(Format format) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioInputFormatChanged(format);
        }

        public void audioSessionId(final int i) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable(this, i) { // from class: I5

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f1156a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ int f1157b;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        }

        public void audioTrackUnderrun(final int i, final long j, final long j2) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable(this, i, j, j2) { // from class: L5

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f1740a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ int f1741b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ long f1742c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ long f1743d;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        }

        public void decoderInitialized(final String str, final long j, final long j2) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable(this, str, j, j2) { // from class: H5

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f1049a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ String f1050b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ long f1051c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ long f1052d;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        }

        public void disabled(final DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable(this, decoderCounters) { // from class: K5

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f1542a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ DecoderCounters f1543b;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        }

        public void enabled(final DecoderCounters decoderCounters) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable(this, decoderCounters) { // from class: J5

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f1446a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ DecoderCounters f1447b;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        }

        public void inputFormatChanged(final Format format) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable(this, format) { // from class: G5

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f860a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ Format f861b;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        }
    }

    void onAudioDecoderInitialized(String str, long j, long j2);

    void onAudioDisabled(DecoderCounters decoderCounters);

    void onAudioEnabled(DecoderCounters decoderCounters);

    void onAudioInputFormatChanged(Format format);

    void onAudioSessionId(int i);

    void onAudioSinkUnderrun(int i, long j, long j2);
}
