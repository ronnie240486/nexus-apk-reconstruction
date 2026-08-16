package org.videolan.libvlc;

import android.annotation.TargetApi;
import android.os.Handler;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import org.videolan.libvlc.interfaces.IVLCVout;
import org.videolan.libvlc.util.DisplayManager;
import org.videolan.libvlc.util.VLCVideoLayout;

/* JADX INFO: loaded from: classes.dex */
class VideoHelper implements IVLCVout.OnNewVideoLayoutListener {

    /* JADX INFO: renamed from: p */
    public static final String f17464p = "LibVLC/VideoHelper";

    /* JADX INFO: renamed from: a */
    public MediaPlayer.ScaleType f17465a;

    /* JADX INFO: renamed from: b */
    public int f17466b;

    /* JADX INFO: renamed from: c */
    public int f17467c;

    /* JADX INFO: renamed from: d */
    public int f17468d;

    /* JADX INFO: renamed from: e */
    public int f17469e;

    /* JADX INFO: renamed from: f */
    public int f17470f;

    /* JADX INFO: renamed from: g */
    public int f17471g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f17472h;

    /* JADX INFO: renamed from: i */
    public SurfaceView f17473i;

    /* JADX INFO: renamed from: j */
    public SurfaceView f17474j;

    /* JADX INFO: renamed from: k */
    public TextureView f17475k;

    /* JADX INFO: renamed from: l */
    public final Handler f17476l;

    /* JADX INFO: renamed from: m */
    public View.OnLayoutChangeListener f17477m;

    /* JADX INFO: renamed from: n */
    public DisplayManager f17478n;

    /* JADX INFO: renamed from: o */
    public MediaPlayer f17479o;

    /* JADX INFO: renamed from: org.videolan.libvlc.VideoHelper$1 */
    public class ViewOnLayoutChangeListenerC50991 implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public final Runnable f17480a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VideoHelper f17481b;

        /* JADX INFO: renamed from: org.videolan.libvlc.VideoHelper$1$1, reason: invalid class name */
        public class AnonymousClass1 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ViewOnLayoutChangeListenerC50991 f17482a;

            /* JADX WARN: Invalid debug info offset */
            public AnonymousClass1(ViewOnLayoutChangeListenerC50991 viewOnLayoutChangeListenerC50991) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public ViewOnLayoutChangeListenerC50991(VideoHelper videoHelper) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        }
    }

    /* JADX INFO: renamed from: org.videolan.libvlc.VideoHelper$2 */
    public static /* synthetic */ class C51002 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17483a;

        static {
            int[] iArr = new int[MediaPlayer.ScaleType.values().length];
            f17483a = iArr;
            try {
                iArr[MediaPlayer.ScaleType.SURFACE_BEST_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17483a[MediaPlayer.ScaleType.SURFACE_FIT_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17483a[MediaPlayer.ScaleType.SURFACE_FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17483a[MediaPlayer.ScaleType.SURFACE_16_9.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17483a[MediaPlayer.ScaleType.SURFACE_4_3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17483a[MediaPlayer.ScaleType.SURFACE_ORIGINAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public VideoHelper(MediaPlayer mediaPlayer, VLCVideoLayout vLCVideoLayout, DisplayManager displayManager, boolean z, boolean z2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ FrameLayout m25426b(VideoHelper videoHelper) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ View.OnLayoutChangeListener m25427c(VideoHelper videoHelper) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Handler m25428d(VideoHelper videoHelper) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IVLCVout.OnNewVideoLayoutListener
    @TargetApi(17)
    /* JADX INFO: renamed from: a */
    public void mo14068a(IVLCVout iVLCVout, int i, int i2, int i3, int i4, int i5, int i6) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public void m25429e() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public final void m25430f(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public void m25431g() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public MediaPlayer.ScaleType m25432h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public final void m25433i(MediaPlayer mediaPlayer, VLCVideoLayout vLCVideoLayout, DisplayManager displayManager, boolean z, boolean z2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public void m25434j() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public void m25435k(MediaPlayer.ScaleType scaleType) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(24)
    /* JADX INFO: renamed from: l */
    public void m25436l() {
    }
}
