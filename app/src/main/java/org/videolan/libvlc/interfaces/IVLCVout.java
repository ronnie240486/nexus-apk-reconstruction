package org.videolan.libvlc.interfaces;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.MainThread;

/* JADX INFO: loaded from: classes.dex */
public interface IVLCVout {

    public interface Callback {
        @MainThread
        /* JADX INFO: renamed from: a */
        void m25439a(IVLCVout iVLCVout);

        @MainThread
        /* JADX INFO: renamed from: b */
        void m25440b(IVLCVout iVLCVout);
    }

    public interface OnNewVideoLayoutListener {
        @MainThread
        /* JADX INFO: renamed from: a */
        void mo14068a(IVLCVout iVLCVout, int i, int i2, int i3, int i4, int i5, int i6);
    }

    @MainThread
    /* JADX INFO: renamed from: a */
    void mo25167a(Callback callback);

    @MainThread
    /* JADX INFO: renamed from: b */
    void mo25168b(int i, int i2, int i3, int i4);

    @MainThread
    /* JADX INFO: renamed from: c */
    void mo25169c(SurfaceView surfaceView);

    @MainThread
    /* JADX INFO: renamed from: d */
    void mo25170d(SurfaceView surfaceView);

    @MainThread
    /* JADX INFO: renamed from: e */
    void mo25171e();

    @TargetApi(14)
    @MainThread
    /* JADX INFO: renamed from: f */
    void mo25172f(SurfaceTexture surfaceTexture);

    @TargetApi(14)
    @MainThread
    /* JADX INFO: renamed from: g */
    void mo25173g(TextureView textureView);

    @MainThread
    /* JADX INFO: renamed from: h */
    void mo25174h();

    @MainThread
    /* JADX INFO: renamed from: i */
    void mo25175i(Callback callback);

    @MainThread
    /* JADX INFO: renamed from: j */
    void mo25176j(Surface surface, SurfaceHolder surfaceHolder);

    @MainThread
    /* JADX INFO: renamed from: k */
    void mo25177k(int i, int i2);

    @MainThread
    /* JADX INFO: renamed from: l */
    void mo25178l(OnNewVideoLayoutListener onNewVideoLayoutListener);

    @MainThread
    /* JADX INFO: renamed from: m */
    boolean mo25179m();

    @TargetApi(14)
    @MainThread
    /* JADX INFO: renamed from: n */
    void mo25180n(SurfaceTexture surfaceTexture);

    @MainThread
    /* JADX INFO: renamed from: o */
    void mo25181o(Surface surface, SurfaceHolder surfaceHolder);

    @TargetApi(14)
    @MainThread
    /* JADX INFO: renamed from: p */
    void mo25182p(TextureView textureView);
}
