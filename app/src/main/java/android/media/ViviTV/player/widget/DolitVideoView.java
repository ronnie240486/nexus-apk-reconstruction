package android.media.ViviTV.player.widget;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import java.util.Map;
import p000.EnumC6006m10;
import p000.InterfaceC0635Jq;
import p000.InterfaceC4313er;

/* JADX INFO: loaded from: classes.dex */
public class DolitVideoView extends SurfaceView implements InterfaceC0635Jq, InterfaceC4313er {

    /* JADX INFO: renamed from: h1 */
    public static final String f9309h1 = "android.media.ViviTV.player.widget.DolitVideoView";

    /* JADX INFO: renamed from: i1 */
    public static final boolean f9310i1 = false;

    /* JADX INFO: renamed from: j1 */
    public static int f9311j1 = 0;

    /* JADX INFO: renamed from: k1 */
    public static boolean f9312k1 = false;

    /* JADX INFO: renamed from: l1 */
    public static final int f9313l1 = -1;

    /* JADX INFO: renamed from: m1 */
    public static final int f9314m1 = 0;

    /* JADX INFO: renamed from: n1 */
    public static final int f9315n1 = 1;

    /* JADX INFO: renamed from: o1 */
    public static final int f9316o1 = 2;

    /* JADX INFO: renamed from: p1 */
    public static final int f9317p1 = 3;

    /* JADX INFO: renamed from: q1 */
    public static final int f9318q1 = 4;

    /* JADX INFO: renamed from: r1 */
    public static final int f9319r1 = 5;

    /* JADX INFO: renamed from: s1 */
    public static final int f9320s1 = 6;

    /* JADX INFO: renamed from: t1 */
    public static final int f9321t1 = 7;

    /* JADX INFO: renamed from: u1 */
    public static final int f9322u1 = 8;

    /* JADX INFO: renamed from: v1 */
    public static final int f9323v1 = 0;

    /* JADX INFO: renamed from: w1 */
    public static final int f9324w1 = 1;

    /* JADX INFO: renamed from: x1 */
    public static final int f9325x1 = 2;

    /* JADX INFO: renamed from: y1 */
    public static final int f9326y1 = 3;

    /* JADX INFO: renamed from: z1 */
    public static final int f9327z1 = 30000;

    /* JADX INFO: renamed from: A */
    public long f9328A;

    /* JADX INFO: renamed from: B */
    public boolean f9329B;

    /* JADX INFO: renamed from: C */
    public boolean f9330C;

    /* JADX INFO: renamed from: D */
    public boolean f9331D;

    /* JADX INFO: renamed from: E */
    public Context f9332E;

    /* JADX INFO: renamed from: F */
    public boolean f9333F;

    /* JADX INFO: renamed from: G */
    public boolean f9334G;

    /* JADX INFO: renamed from: H */
    public String f9335H;

    /* JADX INFO: renamed from: I */
    public String f9336I;

    /* JADX INFO: renamed from: J */
    public String f9337J;

    /* JADX INFO: renamed from: K */
    public String f9338K;

    /* JADX INFO: renamed from: L */
    public String f9339L;

    /* JADX INFO: renamed from: M */
    public String f9340M;

    /* JADX INFO: renamed from: N */
    public String f9341N;

    /* JADX INFO: renamed from: O */
    public String f9342O;

    /* JADX INFO: renamed from: P */
    public String f9343P;

    /* JADX INFO: renamed from: Q */
    public boolean f9344Q;

    /* JADX INFO: renamed from: R */
    public boolean f9345R;

    /* JADX INFO: renamed from: R0 */
    public boolean f9346R0;

    /* JADX INFO: renamed from: S */
    public boolean f9347S;

    /* JADX INFO: renamed from: S0 */
    public boolean f9348S0;

    /* JADX INFO: renamed from: T */
    public boolean f9349T;

    /* JADX INFO: renamed from: T0 */
    public boolean f9350T0;

    /* JADX INFO: renamed from: U */
    public long f9351U;

    /* JADX INFO: renamed from: U0 */
    public String f9352U0;

    /* JADX INFO: renamed from: V */
    public long f9353V;

    /* JADX INFO: renamed from: V0 */
    public AbstractC2308a.e f9354V0;

    /* JADX INFO: renamed from: W */
    public boolean f9355W;

    /* JADX INFO: renamed from: W0 */
    public AbstractC2308a.f f9356W0;

    /* JADX INFO: renamed from: X0 */
    public Handler f9357X0;

    /* JADX INFO: renamed from: Y0 */
    public AbstractC2308a.i f9358Y0;

    /* JADX INFO: renamed from: Z0 */
    public AbstractC2308a.g f9359Z0;

    /* JADX INFO: renamed from: a */
    public Uri f9360a;

    /* JADX INFO: renamed from: a1 */
    public AbstractC2308a.b f9361a1;

    /* JADX INFO: renamed from: b */
    public long f9362b;

    /* JADX INFO: renamed from: b1 */
    public AbstractC2308a.c f9363b1;

    /* JADX INFO: renamed from: c */
    public String f9364c;

    /* JADX INFO: renamed from: c1 */
    public AbstractC2308a.a f9365c1;

    /* JADX INFO: renamed from: d */
    public Map<String, String> f9366d;

    /* JADX INFO: renamed from: d1 */
    public AbstractC2308a.d f9367d1;

    /* JADX INFO: renamed from: e */
    public int f9368e;

    /* JADX INFO: renamed from: e1 */
    public AbstractC2308a.h f9369e1;

    /* JADX INFO: renamed from: f */
    public int f9370f;

    /* JADX INFO: renamed from: f1 */
    public SurfaceHolder.Callback f9371f1;

    /* JADX INFO: renamed from: g */
    public int f9372g;

    /* JADX INFO: renamed from: g1 */
    public Runnable f9373g1;

    /* JADX INFO: renamed from: h */
    public SurfaceHolder f9374h;

    /* JADX INFO: renamed from: i */
    public AbstractC2308a f9375i;

    /* JADX INFO: renamed from: j */
    public int f9376j;

    /* JADX INFO: renamed from: k */
    public int f9377k;

    /* JADX INFO: renamed from: l */
    public int f9378l;

    /* JADX INFO: renamed from: m */
    public int f9379m;

    /* JADX INFO: renamed from: n */
    public int f9380n;

    /* JADX INFO: renamed from: o */
    public int f9381o;

    /* JADX INFO: renamed from: p */
    public WindowManager f9382p;

    /* JADX INFO: renamed from: q */
    public MediaController f9383q;

    /* JADX INFO: renamed from: r */
    public View f9384r;

    /* JADX INFO: renamed from: s */
    public AbstractC2308a.b f9385s;

    /* JADX INFO: renamed from: t */
    public AbstractC2308a.g f9386t;

    /* JADX INFO: renamed from: u */
    public AbstractC2308a.c f9387u;

    /* JADX INFO: renamed from: v */
    public AbstractC2308a.h f9388v;

    /* JADX INFO: renamed from: w */
    public AbstractC2308a.d f9389w;

    /* JADX INFO: renamed from: x */
    public AbstractC2308a.a f9390x;

    /* JADX INFO: renamed from: y */
    public AbstractC2308a.i f9391y;

    /* JADX INFO: renamed from: z */
    public int f9392z;

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.DolitVideoView$a */
    public class C2294a implements AbstractC2308a.i {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DolitVideoView f9393a;

        /* JADX WARN: Invalid debug info offset */
        public C2294a(DolitVideoView dolitVideoView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.player.widget.AbstractC2308a.i
        /* JADX INFO: renamed from: a */
        public void mo12402a(Object obj, int i, int i2, int i3, int i4, int i5, int i6) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.DolitVideoView$b */
    public class C2295b implements AbstractC2308a.g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DolitVideoView f9394a;

        /* JADX WARN: Invalid debug info offset */
        public C2295b(DolitVideoView dolitVideoView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.player.widget.AbstractC2308a.g
        /* JADX INFO: renamed from: u */
        public void mo1331u(Object obj, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.DolitVideoView$c */
    public class C2296c implements AbstractC2308a.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DolitVideoView f9395a;

        /* JADX WARN: Invalid debug info offset */
        public C2296c(DolitVideoView dolitVideoView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.player.widget.AbstractC2308a.b
        /* JADX INFO: renamed from: h0 */
        public void mo1548h0(Object obj) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.DolitVideoView$d */
    public class C2297d implements AbstractC2308a.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DolitVideoView f9396a;

        /* JADX WARN: Invalid debug info offset */
        public C2297d(DolitVideoView dolitVideoView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.player.widget.AbstractC2308a.c
        /* JADX INFO: renamed from: j */
        public boolean mo10404j(Object obj, int i, int i2, long j) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.DolitVideoView$e */
    public class C2298e implements AbstractC2308a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DolitVideoView f9397a;

        /* JADX WARN: Invalid debug info offset */
        public C2298e(DolitVideoView dolitVideoView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.player.widget.AbstractC2308a.a
        /* JADX INFO: renamed from: a */
        public void mo13911a(Object obj, int i) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.DolitVideoView$f */
    public class C2299f implements AbstractC2308a.d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DolitVideoView f9398a;

        /* JADX WARN: Invalid debug info offset */
        public C2299f(DolitVideoView dolitVideoView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.player.widget.AbstractC2308a.d
        /* JADX INFO: renamed from: B0 */
        public boolean mo12401B0(Object obj, int i, int i2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.DolitVideoView$g */
    public class C2300g implements AbstractC2308a.h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DolitVideoView f9399a;

        /* JADX WARN: Invalid debug info offset */
        public C2300g(DolitVideoView dolitVideoView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.player.widget.AbstractC2308a.h
        /* JADX INFO: renamed from: t */
        public void mo12403t(Object obj) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.DolitVideoView$h */
    public class SurfaceHolderCallbackC2301h implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DolitVideoView f9400a;

        /* JADX WARN: Invalid debug info offset */
        public SurfaceHolderCallbackC2301h(DolitVideoView dolitVideoView) {
        }

        /* JADX WARN: Invalid debug info offset */
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

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.DolitVideoView$i */
    public class RunnableC2302i implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DolitVideoView f9401a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2302i(DolitVideoView dolitVideoView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public DolitVideoView(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DolitVideoView(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DolitVideoView(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DolitVideoView(Context context, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ SurfaceHolder m13843A(DolitVideoView dolitVideoView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public static /* synthetic */ SurfaceHolder m13844B(DolitVideoView dolitVideoView, SurfaceHolder surfaceHolder) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public static /* synthetic */ boolean m13845C(DolitVideoView dolitVideoView) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m13846D(DolitVideoView dolitVideoView) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m13847E(DolitVideoView dolitVideoView, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public static /* synthetic */ int m13848F(DolitVideoView dolitVideoView, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public static /* synthetic */ Uri m13849G(DolitVideoView dolitVideoView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public static /* synthetic */ int m13850H(DolitVideoView dolitVideoView, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public static /* synthetic */ int m13851I(DolitVideoView dolitVideoView) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public static /* synthetic */ AbstractC2308a.i m13852J(DolitVideoView dolitVideoView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public static /* synthetic */ AbstractC2308a m13853K(DolitVideoView dolitVideoView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public static /* synthetic */ int m13854L(DolitVideoView dolitVideoView) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public static /* synthetic */ int m13855M(DolitVideoView dolitVideoView, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public static /* synthetic */ int m13856N(DolitVideoView dolitVideoView) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public static /* synthetic */ int m13857O(DolitVideoView dolitVideoView, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public static int m13858S(String str) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m13859c() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m13860d(DolitVideoView dolitVideoView) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m13861e(DolitVideoView dolitVideoView, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m13862f(DolitVideoView dolitVideoView, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ boolean m13863g(DolitVideoView dolitVideoView, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ boolean m13864h(DolitVideoView dolitVideoView, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Runnable m13865i(DolitVideoView dolitVideoView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ AbstractC2308a.g m13866j(DolitVideoView dolitVideoView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ MediaController m13867k(DolitVideoView dolitVideoView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ long m13868l(DolitVideoView dolitVideoView) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ int m13869m(DolitVideoView dolitVideoView) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ int m13870n(DolitVideoView dolitVideoView, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ int m13871o(DolitVideoView dolitVideoView) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ int m13872p(DolitVideoView dolitVideoView, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ AbstractC2308a.b m13873q(DolitVideoView dolitVideoView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ int m13874r(DolitVideoView dolitVideoView) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ AbstractC2308a.c m13875s(DolitVideoView dolitVideoView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setEnabledLogs(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ int m13876t(DolitVideoView dolitVideoView, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ int m13877u(DolitVideoView dolitVideoView, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ AbstractC2308a.a m13878v(DolitVideoView dolitVideoView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m13879w(DolitVideoView dolitVideoView) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m13880x(DolitVideoView dolitVideoView) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ AbstractC2308a.d m13881y(DolitVideoView dolitVideoView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public static /* synthetic */ AbstractC2308a.h m13882z(DolitVideoView dolitVideoView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public final void m13883P() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: Q */
    public final synchronized void m13884Q() {
        /*
            r1 = this;
            return
        L10:
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.widget.DolitVideoView.m13884Q():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public String m13885R() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T */
    public AbstractC2308a.e m13886T() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U */
    public AbstractC2308a.f m13887U() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public AbstractC2308a m13888V() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W */
    public Object m13889W() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X */
    public final C2309b.f m13890X() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y */
    public int m13891Y() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z */
    public int m13892Z() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4249dr
    /* JADX INFO: renamed from: a */
    public void mo13893a() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a0 */
    public final void m13894a0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4249dr
    /* JADX INFO: renamed from: b */
    public void mo13895b(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public final void m13896b0(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c0 */
    public final void m13897c0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0635Jq
    public boolean canPause() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0635Jq, p000.InterfaceC4249dr
    public boolean canSeekBackward() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0635Jq, p000.InterfaceC4249dr
    public boolean canSeekForward() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d0 */
    public boolean m13898d0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e0 */
    public boolean m13899e0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f0 */
    public boolean m13900f0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: g0 */
    public final void m13901g0(android.media.ViviTV.player.widget.AbstractC2308a r2) {
        /*
            r1 = this;
            return
        L8:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.widget.DolitVideoView.m13901g0(android.media.ViviTV.player.widget.a):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0635Jq, p000.InterfaceC4249dr
    public int getBufferPercentage() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0635Jq, p000.InterfaceC4249dr
    public int getCurrentPosition() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0635Jq, p000.InterfaceC4249dr
    public int getDuration() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0010
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: h0 */
    public final void m13902h0() {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.widget.DolitVideoView.m13902h0():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i0 */
    public final void m13903i0(AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0635Jq, p000.InterfaceC4249dr
    public boolean isPlaying() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j0 */
    public void m13904j0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public final void m13905k0(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l0 */
    public void m13906l0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m0 */
    public void m13907m0(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n0 */
    public void m13908n0(EnumC6006m10 enumC6006m10) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o0 */
    public final void m13909o0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p0 */
    public final void m13910p0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // p000.InterfaceC0635Jq, p000.InterfaceC4249dr
    public void pause() {
        /*
            r2 = this;
            return
        L17:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.widget.DolitVideoView.pause():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // p000.InterfaceC0635Jq, p000.InterfaceC4249dr
    public void seekTo(long r2) {
        /*
            r1 = this;
            return
        Lc:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.widget.DolitVideoView.seekTo(long):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public void setAnalyzeDuration(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setAutoPlayAfterSurfaceCreated(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setEnableHlsVodOptimize(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setExoBufferForPlayBackAfterReBufferMs(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setExoBufferForPlayBackMs(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setExoExtEnabled(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setExoExtRenderMode(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setExoMaxBufferMs(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setExoMinBufferMs(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4249dr
    public void setIsHardDecode(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setIsLivePlayback(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLayoutUseParentSize(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLive(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLiveCookie(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLiveEpg(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLiveKey(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLiveOptimizeEnabled(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLiveRange(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLiveReferer(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLiveSeek(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setMediaBufferingIndicator(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setMediaCodecEnabled(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setMediaController(MediaController mediaController) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOnBufferingUpdateListener(AbstractC2308a.a aVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4376fr
    public void setOnCompletionListener(AbstractC2308a.b bVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4376fr
    public void setOnErrorListener(AbstractC2308a.c cVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4376fr
    public void setOnInfoListener(AbstractC2308a.d dVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOnPlayCreatedListener(AbstractC2308a.e eVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOnPlayerEventListener(AbstractC2308a.f fVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4376fr
    public void setOnPreparedListener(AbstractC2308a.g gVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4376fr
    public void setOnSeekCompleteListener(AbstractC2308a.h hVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOnVideoSizeChangedListener(AbstractC2308a.i iVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setRequestWidthHeight(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setScale(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0635Jq
    public void setSpeed(float f) {
    }

    @Override // p000.InterfaceC4249dr
    public void setStartMillSeconds(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4249dr
    public void setTimeoutDuration(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setUserAgent(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setUserMac(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setVideoPath(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4249dr
    public void setVideoURI(Uri uri) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4249dr
    public void setVideoURI(Uri uri, Map<String, String> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setVodExoBufferForPlayBackAfterReBufferMs(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setVodExoBufferForPlayBackMs(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setVodExoMaxBufferMs(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setVodExoMinBufferMs(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // p000.InterfaceC0635Jq, p000.InterfaceC4249dr
    public void start() {
        /*
            r2 = this;
            return
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.widget.DolitVideoView.start():void");
    }
}
