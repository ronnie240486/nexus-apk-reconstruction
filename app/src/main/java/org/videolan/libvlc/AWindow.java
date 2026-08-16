package org.videolan.libvlc;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.MainThread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.videolan.libvlc.interfaces.IVLCVout;

/* JADX INFO: loaded from: classes.dex */
public class AWindow implements IVLCVout {

    /* JADX INFO: renamed from: q */
    public static final String f17254q = "AWindow";

    /* JADX INFO: renamed from: r */
    public static final int f17255r = 0;

    /* JADX INFO: renamed from: s */
    public static final int f17256s = 1;

    /* JADX INFO: renamed from: t */
    public static final int f17257t = 2;

    /* JADX INFO: renamed from: u */
    public static final int f17258u = 0;

    /* JADX INFO: renamed from: v */
    public static final int f17259v = 1;

    /* JADX INFO: renamed from: w */
    public static final int f17260w = 2;

    /* JADX INFO: renamed from: x */
    public static final int f17261x = 0;

    /* JADX INFO: renamed from: y */
    public static final int f17262y = 1;

    /* JADX INFO: renamed from: z */
    public static final int f17263z = 2;

    /* JADX INFO: renamed from: a */
    public final SurfaceHelper[] f17264a;

    /* JADX INFO: renamed from: b */
    public final SurfaceCallback f17265b;

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f17266c;

    /* JADX INFO: renamed from: d */
    public IVLCVout.OnNewVideoLayoutListener f17267d;

    /* JADX INFO: renamed from: e */
    public ArrayList<IVLCVout.Callback> f17268e;

    /* JADX INFO: renamed from: f */
    public final Handler f17269f;

    /* JADX INFO: renamed from: g */
    public final Surface[] f17270g;

    /* JADX INFO: renamed from: h */
    public long f17271h;

    /* JADX INFO: renamed from: i */
    public int f17272i;

    /* JADX INFO: renamed from: j */
    public int f17273j;

    /* JADX INFO: renamed from: k */
    public int f17274k;

    /* JADX INFO: renamed from: l */
    public int f17275l;

    /* JADX INFO: renamed from: m */
    public int f17276m;

    /* JADX INFO: renamed from: n */
    public int f17277n;

    /* JADX INFO: renamed from: o */
    public SurfaceTextureThread f17278o;

    /* JADX INFO: renamed from: p */
    public final NativeLock f17279p;

    /* JADX INFO: renamed from: org.videolan.libvlc.AWindow$1 */
    public class RunnableC50841 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f17280a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f17281b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f17282c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f17283d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f17284e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f17285f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ AWindow f17286g;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC50841(AWindow aWindow, int i, int i2, int i3, int i4, int i5, int i6) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static class NativeLock {

        /* JADX INFO: renamed from: a */
        public boolean f17287a;

        /* JADX INFO: renamed from: b */
        public boolean f17288b;

        /* JADX WARN: Invalid debug info offset */
        private NativeLock() {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ NativeLock(RunnableC50841 runnableC50841) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m25188a(NativeLock nativeLock, boolean z) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ boolean m25189b(NativeLock nativeLock, boolean z) {
            return false;
        }
    }

    public interface SurfaceCallback {
        @MainThread
        /* JADX INFO: renamed from: a */
        void mo25190a(AWindow aWindow);

        @MainThread
        /* JADX INFO: renamed from: b */
        void mo25191b(AWindow aWindow);
    }

    public class SurfaceHelper {

        /* JADX INFO: renamed from: a */
        public final int f17289a;

        /* JADX INFO: renamed from: b */
        public final SurfaceView f17290b;

        /* JADX INFO: renamed from: c */
        public final TextureView f17291c;

        /* JADX INFO: renamed from: d */
        public final SurfaceHolder f17292d;

        /* JADX INFO: renamed from: e */
        public Surface f17293e;

        /* JADX INFO: renamed from: f */
        public final SurfaceHolder.Callback f17294f;

        /* JADX INFO: renamed from: g */
        public final TextureView.SurfaceTextureListener f17295g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ AWindow f17296h;

        /* JADX INFO: renamed from: org.videolan.libvlc.AWindow$SurfaceHelper$1 */
        public class SurfaceHolderCallbackC50851 implements SurfaceHolder.Callback {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ SurfaceHelper f17297a;

            /* JADX WARN: Invalid debug info offset */
            public SurfaceHolderCallbackC50851(SurfaceHelper surfaceHelper) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            }
        }

        /* JADX INFO: renamed from: org.videolan.libvlc.AWindow$SurfaceHelper$2 */
        public class TextureViewSurfaceTextureListenerC50862 implements TextureView.SurfaceTextureListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ SurfaceHelper f17298a;

            /* JADX WARN: Invalid debug info offset */
            public TextureViewSurfaceTextureListenerC50862(SurfaceHelper surfaceHelper) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public SurfaceHelper(AWindow aWindow, int i, Surface surface, SurfaceHolder surfaceHolder) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ SurfaceHelper(AWindow aWindow, int i, Surface surface, SurfaceHolder surfaceHolder, RunnableC50841 runnableC50841) {
        }

        /* JADX WARN: Invalid debug info offset */
        public SurfaceHelper(AWindow aWindow, int i, SurfaceView surfaceView) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ SurfaceHelper(AWindow aWindow, int i, SurfaceView surfaceView, RunnableC50841 runnableC50841) {
        }

        /* JADX WARN: Invalid debug info offset */
        public SurfaceHelper(AWindow aWindow, int i, TextureView textureView) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ SurfaceHelper(AWindow aWindow, int i, TextureView textureView, RunnableC50841 runnableC50841) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ SurfaceHolder m25192a(SurfaceHelper surfaceHelper) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m25193b(SurfaceHelper surfaceHelper, Surface surface) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public void m25194c() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public final void m25195d() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public final void m25196e() {
        }

        /* JADX WARN: Invalid debug info offset */
        @TargetApi(14)
        /* JADX INFO: renamed from: f */
        public final void m25197f() {
        }

        /* JADX WARN: Invalid debug info offset */
        @TargetApi(14)
        /* JADX INFO: renamed from: g */
        public final TextureView.SurfaceTextureListener m25198g() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public Surface m25199h() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: i */
        public SurfaceHolder m25200i() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: j */
        public boolean m25201j() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public void m25202k() {
        }

        /* JADX WARN: Invalid debug info offset */
        @TargetApi(14)
        /* JADX INFO: renamed from: l */
        public final void m25203l() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: m */
        public final void m25204m(Surface surface) {
        }
    }

    @TargetApi(16)
    public static class SurfaceTextureThread implements Runnable, SurfaceTexture.OnFrameAvailableListener {

        /* JADX INFO: renamed from: a */
        public SurfaceTexture f17299a;

        /* JADX INFO: renamed from: b */
        public Surface f17300b;

        /* JADX INFO: renamed from: c */
        public boolean f17301c;

        /* JADX INFO: renamed from: d */
        public Looper f17302d;

        /* JADX INFO: renamed from: e */
        public Thread f17303e;

        /* JADX INFO: renamed from: f */
        public boolean f17304f;

        /* JADX INFO: renamed from: g */
        public boolean f17305g;

        /* JADX WARN: Invalid debug info offset */
        private SurfaceTextureThread() {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ SurfaceTextureThread(RunnableC50841 runnableC50841) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m25205a(SurfaceTextureThread surfaceTextureThread) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ boolean m25206b(SurfaceTextureThread surfaceTextureThread, int i) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m25207c(SurfaceTextureThread surfaceTextureThread) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public static /* synthetic */ boolean m25208d(SurfaceTextureThread surfaceTextureThread, float[] fArr) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public static /* synthetic */ Surface m25209e(SurfaceTextureThread surfaceTextureThread) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: f */
        public final synchronized boolean m25210f(int i) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0013
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: g */
        public final synchronized boolean m25211g() {
            /*
                r2 = this;
                r0 = 0
                return r0
            L17:
            L19:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.AWindow.SurfaceTextureThread.m25211g():boolean");
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: h */
        public final synchronized void m25212h() {
            /*
                r3 = this;
                return
            L14:
            L16:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.AWindow.SurfaceTextureThread.m25212h():void");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: i */
        public final synchronized Surface m25213i() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: j */
        public final synchronized void m25214j() {
            /*
                r2 = this;
                return
            Ld:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.AWindow.SurfaceTextureThread.m25214j():void");
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0008
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: k */
        public final boolean m25215k(float[] r5) {
            /*
                r4 = this;
                r0 = 0
            L1:
                return r0
            L11:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.AWindow.SurfaceTextureThread.m25215k(float[]):boolean");
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public synchronized void onFrameAvailable(android.graphics.SurfaceTexture r2) {
            /*
                r1 = this;
                return
            L10:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.AWindow.SurfaceTextureThread.onFrameAvailable(android.graphics.SurfaceTexture):void");
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.lang.Runnable
        public void run() {
            /*
                r2 = this;
                return
            L22:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.AWindow.SurfaceTextureThread.run():void");
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public AWindow(SurfaceCallback surfaceCallback) {
    }

    private static native void nativeOnMouseEvent(long j, int i, int i2, int i3, int i4);

    private static native void nativeOnWindowSize(long j, int i, int i2);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ Surface m25148u(AWindow aWindow, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m25149v(AWindow aWindow, int i, Surface surface) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ IVLCVout.OnNewVideoLayoutListener m25150w(AWindow aWindow) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m25151x(AWindow aWindow) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public static void m25152y(AWindow aWindow) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public final void m25153A() throws IllegalStateException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: B */
    public final android.view.Surface m25154B(int r3) {
        /*
            r2 = this;
            r0 = 0
            return r0
        L9:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.AWindow.m25154B(int):android.view.Surface");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public final Surface m25155C() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public final Surface m25156D() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @MainThread
    /* JADX INFO: renamed from: E */
    public final void m25157E() {
    }

    /* JADX WARN: Invalid debug info offset */
    @MainThread
    /* JADX INFO: renamed from: F */
    public final void m25158F() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: G */
    public final int m25159G(long r10) {
        /*
            r9 = this;
            r0 = 0
            return r0
        L12:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.AWindow.m25159G(long):int");
    }

    /* JADX INFO: renamed from: H */
    public final boolean m25160H(Surface surface, int i, int i2, int i3) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: I */
    public final void m25161I(int r3, android.view.Surface r4) {
        /*
            r2 = this;
            return
        L9:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.AWindow.m25161I(int, android.view.Surface):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public final void m25162J(int i, Surface surface, SurfaceHolder surfaceHolder) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public final void m25163K(int i, int i2, int i3, int i4, int i5, int i6) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public final void m25164L(int i, SurfaceView surfaceView) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public final void m25165M(int i, TextureView textureView) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: N */
    public final void m25166N() {
        /*
            r6 = this;
            return
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.AWindow.m25166N():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IVLCVout
    /* JADX INFO: renamed from: a */
    public void mo25167a(IVLCVout.Callback callback) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.videolan.libvlc.interfaces.IVLCVout
    /* JADX INFO: renamed from: b */
    public void mo25168b(int r8, int r9, int r10, int r11) {
        /*
            r7 = this;
            return
        L1c:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.AWindow.mo25168b(int, int, int, int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IVLCVout
    @MainThread
    /* JADX INFO: renamed from: c */
    public void mo25169c(SurfaceView surfaceView) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IVLCVout
    @MainThread
    /* JADX INFO: renamed from: d */
    public void mo25170d(SurfaceView surfaceView) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IVLCVout
    @MainThread
    /* JADX INFO: renamed from: e */
    public void mo25171e() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IVLCVout
    @TargetApi(14)
    /* JADX INFO: renamed from: f */
    public void mo25172f(SurfaceTexture surfaceTexture) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IVLCVout
    @MainThread
    /* JADX INFO: renamed from: g */
    public void mo25173g(TextureView textureView) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0018
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.videolan.libvlc.interfaces.IVLCVout
    @androidx.annotation.MainThread
    /* JADX INFO: renamed from: h */
    public void mo25174h() {
        /*
            r5 = this;
            return
        L59:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.AWindow.mo25174h():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IVLCVout
    /* JADX INFO: renamed from: i */
    public void mo25175i(IVLCVout.Callback callback) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IVLCVout
    /* JADX INFO: renamed from: j */
    public void mo25176j(Surface surface, SurfaceHolder surfaceHolder) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.videolan.libvlc.interfaces.IVLCVout
    /* JADX INFO: renamed from: k */
    public void mo25177k(int r7, int r8) {
        /*
            r6 = this;
            return
        L14:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.AWindow.mo25177k(int, int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0018
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.videolan.libvlc.interfaces.IVLCVout
    @androidx.annotation.MainThread
    /* JADX INFO: renamed from: l */
    public void mo25178l(org.videolan.libvlc.interfaces.IVLCVout.OnNewVideoLayoutListener r4) {
        /*
            r3 = this;
            return
        L31:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.AWindow.mo25178l(org.videolan.libvlc.interfaces.IVLCVout$OnNewVideoLayoutListener):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IVLCVout
    @MainThread
    /* JADX INFO: renamed from: m */
    public boolean mo25179m() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IVLCVout
    @TargetApi(14)
    /* JADX INFO: renamed from: n */
    public void mo25180n(SurfaceTexture surfaceTexture) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IVLCVout
    /* JADX INFO: renamed from: o */
    public void mo25181o(Surface surface, SurfaceHolder surfaceHolder) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IVLCVout
    @MainThread
    /* JADX INFO: renamed from: p */
    public void mo25182p(TextureView textureView) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public boolean m25183q(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public final void m25184r() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public final Surface m25185s() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public final boolean m25186t(float[] fArr) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public boolean m25187z() {
        return false;
    }
}
