package com.bifan.txtreaderlib.main;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;
import androidx.annotation.Nullable;
import java.util.List;
import p000.AbstractC5521uS;
import p000.C0100BX;
import p000.C0614JV;
import p000.C1040Q6;
import p000.C1074Qe;
import p000.C5444tX;
import p000.C5661wX;
import p000.EnumC5863zX;
import p000.InterfaceC0509Hq;
import p000.InterfaceC0765Lq;
import p000.InterfaceC0828Mq;
import p000.InterfaceC0955Oq;
import p000.InterfaceC1472Wq;
import p000.InterfaceC2937ar;
import p000.InterfaceC4184cr;
import p000.InterfaceC5329rq;

/* JADX INFO: loaded from: classes.dex */
public abstract class TxtReaderBaseView extends View implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: A */
    public static int f10745A = 40;

    /* JADX INFO: renamed from: B */
    public static int f10746B = 40;

    /* JADX INFO: renamed from: a */
    public String f10747a;

    /* JADX INFO: renamed from: b */
    public C0100BX f10748b;

    /* JADX INFO: renamed from: c */
    public Scroller f10749c;

    /* JADX INFO: renamed from: d */
    public GestureDetector f10750d;

    /* JADX INFO: renamed from: e */
    public PointF f10751e;

    /* JADX INFO: renamed from: f */
    public PointF f10752f;

    /* JADX INFO: renamed from: g */
    public C5444tX f10753g;

    /* JADX INFO: renamed from: h */
    public C5444tX f10754h;

    /* JADX INFO: renamed from: i */
    public AbstractC5521uS f10755i;

    /* JADX INFO: renamed from: j */
    public AbstractC5521uS f10756j;

    /* JADX INFO: renamed from: k */
    public Bitmap f10757k;

    /* JADX INFO: renamed from: l */
    public Bitmap f10758l;

    /* JADX INFO: renamed from: m */
    public EnumC3114g f10759m;

    /* JADX INFO: renamed from: n */
    public boolean f10760n;

    /* JADX INFO: renamed from: o */
    public InterfaceC0955Oq f10761o;

    /* JADX INFO: renamed from: p */
    public InterfaceC0828Mq f10762p;

    /* JADX INFO: renamed from: q */
    public InterfaceC1472Wq f10763q;

    /* JADX INFO: renamed from: r */
    public InterfaceC5329rq f10764r;

    /* JADX INFO: renamed from: s */
    public C1074Qe f10765s;

    /* JADX INFO: renamed from: t */
    public C1074Qe f10766t;

    /* JADX INFO: renamed from: u */
    public C5661wX f10767u;

    /* JADX INFO: renamed from: v */
    public Path f10768v;

    /* JADX INFO: renamed from: w */
    public final List<InterfaceC2937ar> f10769w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC4184cr f10770x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC4184cr f10771y;

    /* JADX INFO: renamed from: z */
    public final C1040Q6 f10772z;

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.main.TxtReaderBaseView$a */
    public class C3108a implements C1074Qe.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C5661wX f10773a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TxtReaderBaseView f10774b;

        /* JADX WARN: Invalid debug info offset */
        public C3108a(TxtReaderBaseView txtReaderBaseView, C5661wX c5661wX) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C1074Qe.b
        /* JADX INFO: renamed from: a */
        public void mo4802a() {
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.main.TxtReaderBaseView$b */
    public class RunnableC3109b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C5661wX f10775a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f10776b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0509Hq f10777c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ TxtReaderBaseView f10778d;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC3109b(TxtReaderBaseView txtReaderBaseView, C5661wX c5661wX, String str, InterfaceC0509Hq interfaceC0509Hq) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.main.TxtReaderBaseView$c */
    public class RunnableC3110c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0614JV f10779a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f10780b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0509Hq f10781c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ TxtReaderBaseView f10782d;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC3110c(TxtReaderBaseView txtReaderBaseView, C0614JV c0614jv, String str, InterfaceC0509Hq interfaceC0509Hq) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.main.TxtReaderBaseView$d */
    public class RunnableC3111d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f10783a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0509Hq f10784b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ TxtReaderBaseView f10785c;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC3111d(TxtReaderBaseView txtReaderBaseView, String str, InterfaceC0509Hq interfaceC0509Hq) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.main.TxtReaderBaseView$e */
    public class RunnableC3112e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f10786a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0509Hq f10787b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ TxtReaderBaseView f10788c;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC3112e(TxtReaderBaseView txtReaderBaseView, String str, InterfaceC0509Hq interfaceC0509Hq) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.main.TxtReaderBaseView$f */
    public class C3113f implements InterfaceC0509Hq {

        /* JADX INFO: renamed from: a */
        public InterfaceC0509Hq f10789a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TxtReaderBaseView f10790b;

        /* JADX INFO: renamed from: com.bifan.txtreaderlib.main.TxtReaderBaseView$f$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C3113f f10791a;

            /* JADX WARN: Invalid debug info offset */
            public a(C3113f c3113f) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public C3113f(TxtReaderBaseView txtReaderBaseView, InterfaceC0509Hq interfaceC0509Hq) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0509Hq
        /* JADX INFO: renamed from: a */
        public void mo2398a() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0509Hq
        /* JADX INFO: renamed from: b */
        public void mo2399b(EnumC5863zX enumC5863zX) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0509Hq
        /* JADX INFO: renamed from: c */
        public void mo2400c(String str) {
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.main.TxtReaderBaseView$g */
    public enum EnumC3114g {
        Normal,
        PagePreIng,
        PageNextIng,
        PressSelectText,
        PressUnSelectText,
        SelectMoveForward,
        SelectMoveBack
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.main.TxtReaderBaseView$h */
    public class C3115h implements InterfaceC4184cr {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TxtReaderBaseView f10792a;

        /* JADX INFO: renamed from: com.bifan.txtreaderlib.main.TxtReaderBaseView$h$a */
        public class a implements InterfaceC0509Hq {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C0100BX f10793a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3115h f10794b;

            /* JADX INFO: renamed from: com.bifan.txtreaderlib.main.TxtReaderBaseView$h$a$a, reason: collision with other inner class name */
            public class RunnableC5900a implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ a f10795a;

                /* JADX WARN: Invalid debug info offset */
                public RunnableC5900a(a aVar) {
                }

                /* JADX WARN: Invalid debug info offset */
                @Override // java.lang.Runnable
                public void run() {
                }
            }

            /* JADX WARN: Invalid debug info offset */
            public a(C3115h c3115h, C0100BX c0100bx) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // p000.InterfaceC0509Hq
            /* JADX INFO: renamed from: a */
            public void mo2398a() {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // p000.InterfaceC0509Hq
            /* JADX INFO: renamed from: b */
            public void mo2399b(EnumC5863zX enumC5863zX) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // p000.InterfaceC0509Hq
            /* JADX INFO: renamed from: c */
            public void mo2400c(String str) {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public C3115h(TxtReaderBaseView txtReaderBaseView) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ C3115h(TxtReaderBaseView txtReaderBaseView, C3108a c3108a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4184cr
        /* JADX INFO: renamed from: a */
        public void mo177a(InterfaceC0509Hq interfaceC0509Hq, C0100BX c0100bx) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public final void m17149b() {
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.main.TxtReaderBaseView$i */
    public class C3116i implements InterfaceC4184cr {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TxtReaderBaseView f10796a;

        /* JADX INFO: renamed from: com.bifan.txtreaderlib.main.TxtReaderBaseView$i$a */
        public class a implements InterfaceC0509Hq {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C0100BX f10797a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3116i f10798b;

            /* JADX INFO: renamed from: com.bifan.txtreaderlib.main.TxtReaderBaseView$i$a$a, reason: collision with other inner class name */
            public class RunnableC5901a implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ a f10799a;

                /* JADX WARN: Invalid debug info offset */
                public RunnableC5901a(a aVar) {
                }

                /* JADX WARN: Invalid debug info offset */
                @Override // java.lang.Runnable
                public void run() {
                }
            }

            /* JADX WARN: Invalid debug info offset */
            public a(C3116i c3116i, C0100BX c0100bx) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // p000.InterfaceC0509Hq
            /* JADX INFO: renamed from: a */
            public void mo2398a() {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // p000.InterfaceC0509Hq
            /* JADX INFO: renamed from: b */
            public void mo2399b(EnumC5863zX enumC5863zX) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // p000.InterfaceC0509Hq
            /* JADX INFO: renamed from: c */
            public void mo2400c(String str) {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public C3116i(TxtReaderBaseView txtReaderBaseView) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ C3116i(TxtReaderBaseView txtReaderBaseView, C3108a c3108a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4184cr
        /* JADX INFO: renamed from: a */
        public void mo177a(InterfaceC0509Hq interfaceC0509Hq, C0100BX c0100bx) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public final void m17150b() {
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.main.TxtReaderBaseView$j */
    public class C3117j extends Scroller {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TxtReaderBaseView f10800a;

        /* JADX WARN: Invalid debug info offset */
        public C3117j(TxtReaderBaseView txtReaderBaseView, Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.Scroller
        public void abortAnimation() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public TxtReaderBaseView(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public TxtReaderBaseView(Context context, @Nullable AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m17084c(TxtReaderBaseView txtReaderBaseView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m17085d(TxtReaderBaseView txtReaderBaseView, InterfaceC0765Lq interfaceC0765Lq, InterfaceC0765Lq interfaceC0765Lq2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m17086e(TxtReaderBaseView txtReaderBaseView) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m17087f(TxtReaderBaseView txtReaderBaseView, String str, InterfaceC0509Hq interfaceC0509Hq) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m17088g(TxtReaderBaseView txtReaderBaseView, String str, InterfaceC0509Hq interfaceC0509Hq) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public String m17089A() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public Path m17090B() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public synchronized float m17091C() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public float m17092D(int i, int i2) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public Path m17093E() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public Bitmap m17094F() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public void mo17095G() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public final void m17096H() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public synchronized Boolean m17097I() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public synchronized Boolean m17098J() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public Boolean m17099K() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public Boolean m17100L() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public final boolean m17101M(InterfaceC0765Lq interfaceC0765Lq, InterfaceC0765Lq interfaceC0765Lq2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public final void m17102N(String str, InterfaceC0509Hq interfaceC0509Hq) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public void m17103O(String str, InterfaceC0509Hq interfaceC0509Hq) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public final void m17104P(String str, InterfaceC0509Hq interfaceC0509Hq) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q */
    public void m17105Q(String str, InterfaceC0509Hq interfaceC0509Hq) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public void m17106R(MotionEvent motionEvent) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public void mo17107S(MotionEvent motionEvent) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T */
    public void m17108T() {
    }

    /* JADX INFO: renamed from: U */
    public abstract void mo17109U(MotionEvent motionEvent);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public void m17110V(InterfaceC0765Lq interfaceC0765Lq) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W */
    public void m17111W(MotionEvent motionEvent) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X */
    public void m17112X(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y */
    public void m17113Y() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z */
    public void m17114Z() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final boolean m17115a(float f, float f2) {
        return false;
    }

    /* JADX INFO: renamed from: a0 */
    public abstract void mo17116a0(MotionEvent motionEvent);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final boolean m17117b(float f, float f2) {
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public abstract void mo17118b0(MotionEvent motionEvent);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c0 */
    public void m17119c0(int i, int i2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d0 */
    public void m17120d0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e0 */
    public void m17121e0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f0 */
    public final void m17122f0(C5444tX c5444tX) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public final void m17123g0(C5444tX c5444tX) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public void m17124h() {
    }

    /* JADX INFO: renamed from: h0 */
    public abstract void mo17125h0();

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: i */
    public synchronized void m17126i() {
        /*
            r9 = this;
            return
        L7f:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bifan.txtreaderlib.main.TxtReaderBaseView.m17126i():void");
    }

    /* JADX INFO: renamed from: i0 */
    public abstract void mo17127i0();

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final Region m17128j(Path path) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public abstract void mo17129j0();

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final boolean m17130k(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public void m17131k0(MotionEvent motionEvent) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public final void m17132l() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l0 */
    public void m17133l0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public final void m17134m() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m0 */
    public void m17135m0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public void m17136n() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public void m17137o() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onDetachedFromWindow() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo17138p(Canvas canvas);

    /* JADX INFO: renamed from: q */
    public abstract void mo17139q(Canvas canvas);

    /* JADX INFO: renamed from: r */
    public abstract void mo17140r(Canvas canvas);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public final C5444tX m17141s(float f, float f2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLeftSlider(AbstractC5521uS abstractC5521uS) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOnCenterAreaClickListener(InterfaceC5329rq interfaceC5329rq) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOnPageEdgeListener(InterfaceC0955Oq interfaceC0955Oq) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOnSliderListener(InterfaceC1472Wq interfaceC1472Wq) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPageChangeListener(InterfaceC0828Mq interfaceC0828Mq) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setRightSlider(AbstractC5521uS abstractC5521uS) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public final C5444tX m17142t(float f, float f2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public final C5444tX m17143u(float f, float f2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public final C5444tX m17144v(float f, float f2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public Bitmap m17145w() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public C5444tX m17146x() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public InterfaceC2937ar m17147y() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public synchronized List<InterfaceC2937ar> m17148z() {
        return null;
    }
}
