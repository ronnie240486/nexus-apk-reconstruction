package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes2.dex */
public interface VideoRendererEventListener {

    public static final class EventDispatcher {

        @Nullable
        private final Handler handler;

        @Nullable
        private final VideoRendererEventListener listener;

        public EventDispatcher(@Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener) {
            this.handler = videoRendererEventListener != null ? (Handler) Assertions.checkNotNull(handler) : null;
            this.listener = videoRendererEventListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$decoderInitialized$1(String str, long j, long j2) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoDecoderInitialized(str, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$disabled$6(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoDisabled(decoderCounters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$droppedFrames$3(int i, long j) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onDroppedFrames(i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$enabled$0(DecoderCounters decoderCounters) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoEnabled(decoderCounters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$inputFormatChanged$2(Format format) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoInputFormatChanged(format);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$renderedFirstFrame$5(Surface surface) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onRenderedFirstFrame(surface);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$videoSizeChanged$4(int i, int i2, int i3, float f) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoSizeChanged(i, i2, i3, f);
        }

        public void decoderInitialized(final String str, final long j, final long j2) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable(this, str, j, j2) { // from class: j10

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f14673a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ String f14674b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ long f14675c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ long f14676d;

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
                handler.post(new Runnable(this, decoderCounters) { // from class: i10

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f14457a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ DecoderCounters f14458b;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        }

        public void droppedFrames(final int i, final long j) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable(this, i, j) { // from class: g10

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f14073a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ int f14074b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ long f14075c;

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
                handler.post(new Runnable(this, decoderCounters) { // from class: k10

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f14840a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ DecoderCounters f14841b;

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
                handler.post(new Runnable(this, format) { // from class: l10

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f14982a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ Format f14983b;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        }

        public void renderedFirstFrame(@Nullable final Surface surface) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable(this, surface) { // from class: h10

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f14234a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ Surface f14235b;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        }

        public void videoSizeChanged(final int i, final int i2, final int i3, final float f) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable(this, i, i2, i3, f) { // from class: f10

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f13878a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ int f13879b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ int f13880c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ int f13881d;

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ float f13882e;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        }
    }

    void onDroppedFrames(int i, long j);

    void onRenderedFirstFrame(@Nullable Surface surface);

    void onVideoDecoderInitialized(String str, long j, long j2);

    void onVideoDisabled(DecoderCounters decoderCounters);

    void onVideoEnabled(DecoderCounters decoderCounters);

    void onVideoInputFormatChanged(Format format);

    void onVideoSizeChanged(int i, int i2, int i3, float f);
}
