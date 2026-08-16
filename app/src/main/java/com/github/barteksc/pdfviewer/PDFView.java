package com.github.barteksc.pdfviewer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.net.Uri;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.shockwave.pdfium.C4033a;
import com.shockwave.pdfium.PdfiumCore;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import p000.AsyncTaskC0432Gd;
import p000.C0021AI;
import p000.C0075B8;
import p000.C0656K8;
import p000.C1485X2;
import p000.C4602jI;
import p000.C4666kI;
import p000.C4863nI;
import p000.C4938oS;
import p000.EnumC4434gl;
import p000.EnumC5788yS;
import p000.GestureDetectorOnGestureListenerC1655Zf;
import p000.HandlerC5587vN;
import p000.InterfaceC0020AH;
import p000.InterfaceC0084BH;
import p000.InterfaceC0156CH;
import p000.InterfaceC0220DH;
import p000.InterfaceC0284EH;
import p000.InterfaceC0355FP;
import p000.InterfaceC0371Ff;
import p000.InterfaceC4578iv;
import p000.InterfaceC5581vH;
import p000.InterfaceC5712xH;
import p000.InterfaceC5777yH;
import p000.InterfaceC5847zH;

/* JADX INFO: loaded from: classes.dex */
public class PDFView extends RelativeLayout {

    /* JADX INFO: renamed from: R */
    public static final String f10926R = "PDFView";

    /* JADX INFO: renamed from: S */
    public static final float f10927S = 3.0f;

    /* JADX INFO: renamed from: T */
    public static final float f10928T = 1.75f;

    /* JADX INFO: renamed from: U */
    public static final float f10929U = 1.0f;

    /* JADX INFO: renamed from: V */
    public static final float f10930V = 2.0f;

    /* JADX INFO: renamed from: W */
    public static boolean f10931W;

    /* JADX INFO: renamed from: A */
    public boolean f10932A;

    /* JADX INFO: renamed from: B */
    public boolean f10933B;

    /* JADX INFO: renamed from: C */
    public boolean f10934C;

    /* JADX INFO: renamed from: D */
    public PdfiumCore f10935D;

    /* JADX INFO: renamed from: E */
    public InterfaceC0355FP f10936E;

    /* JADX INFO: renamed from: F */
    public boolean f10937F;

    /* JADX INFO: renamed from: G */
    public boolean f10938G;

    /* JADX INFO: renamed from: H */
    public boolean f10939H;

    /* JADX INFO: renamed from: I */
    public boolean f10940I;

    /* JADX INFO: renamed from: J */
    public boolean f10941J;

    /* JADX INFO: renamed from: K */
    public PaintFlagsDrawFilter f10942K;

    /* JADX INFO: renamed from: L */
    public int f10943L;

    /* JADX INFO: renamed from: M */
    public boolean f10944M;

    /* JADX INFO: renamed from: N */
    public boolean f10945N;

    /* JADX INFO: renamed from: O */
    public List<Integer> f10946O;

    /* JADX INFO: renamed from: P */
    public boolean f10947P;

    /* JADX INFO: renamed from: Q */
    public C3157b f10948Q;

    /* JADX INFO: renamed from: a */
    public float f10949a;

    /* JADX INFO: renamed from: b */
    public float f10950b;

    /* JADX INFO: renamed from: c */
    public float f10951c;

    /* JADX INFO: renamed from: d */
    public EnumC3158c f10952d;

    /* JADX INFO: renamed from: e */
    public C0075B8 f10953e;

    /* JADX INFO: renamed from: f */
    public C1485X2 f10954f;

    /* JADX INFO: renamed from: g */
    public GestureDetectorOnGestureListenerC1655Zf f10955g;

    /* JADX INFO: renamed from: h */
    public C0021AI f10956h;

    /* JADX INFO: renamed from: i */
    public int f10957i;

    /* JADX INFO: renamed from: j */
    public float f10958j;

    /* JADX INFO: renamed from: k */
    public float f10959k;

    /* JADX INFO: renamed from: l */
    public float f10960l;

    /* JADX INFO: renamed from: m */
    public boolean f10961m;

    /* JADX INFO: renamed from: n */
    public EnumC3159d f10962n;

    /* JADX INFO: renamed from: o */
    public AsyncTaskC0432Gd f10963o;

    /* JADX INFO: renamed from: p */
    public HandlerThread f10964p;

    /* JADX INFO: renamed from: q */
    public HandlerC5587vN f10965q;

    /* JADX INFO: renamed from: r */
    public C4863nI f10966r;

    /* JADX INFO: renamed from: s */
    public C0656K8 f10967s;

    /* JADX INFO: renamed from: t */
    public Paint f10968t;

    /* JADX INFO: renamed from: u */
    public Paint f10969u;

    /* JADX INFO: renamed from: v */
    public EnumC4434gl f10970v;

    /* JADX INFO: renamed from: w */
    public boolean f10971w;

    /* JADX INFO: renamed from: x */
    public int f10972x;

    /* JADX INFO: renamed from: y */
    public boolean f10973y;

    /* JADX INFO: renamed from: z */
    public boolean f10974z;

    /* JADX INFO: renamed from: com.github.barteksc.pdfviewer.PDFView$b */
    public class C3157b {

        /* JADX INFO: renamed from: A */
        public boolean f10975A;

        /* JADX INFO: renamed from: B */
        public boolean f10976B;

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ PDFView f10977C;

        /* JADX INFO: renamed from: a */
        public final InterfaceC0371Ff f10978a;

        /* JADX INFO: renamed from: b */
        public int[] f10979b;

        /* JADX INFO: renamed from: c */
        public boolean f10980c;

        /* JADX INFO: renamed from: d */
        public boolean f10981d;

        /* JADX INFO: renamed from: e */
        public InterfaceC5581vH f10982e;

        /* JADX INFO: renamed from: f */
        public InterfaceC5581vH f10983f;

        /* JADX INFO: renamed from: g */
        public InterfaceC5777yH f10984g;

        /* JADX INFO: renamed from: h */
        public InterfaceC5712xH f10985h;

        /* JADX INFO: renamed from: i */
        public InterfaceC0020AH f10986i;

        /* JADX INFO: renamed from: j */
        public InterfaceC0156CH f10987j;

        /* JADX INFO: renamed from: k */
        public InterfaceC0220DH f10988k;

        /* JADX INFO: renamed from: l */
        public InterfaceC0284EH f10989l;

        /* JADX INFO: renamed from: m */
        public InterfaceC5847zH f10990m;

        /* JADX INFO: renamed from: n */
        public InterfaceC0084BH f10991n;

        /* JADX INFO: renamed from: o */
        public InterfaceC4578iv f10992o;

        /* JADX INFO: renamed from: p */
        public int f10993p;

        /* JADX INFO: renamed from: q */
        public boolean f10994q;

        /* JADX INFO: renamed from: r */
        public boolean f10995r;

        /* JADX INFO: renamed from: s */
        public String f10996s;

        /* JADX INFO: renamed from: t */
        public InterfaceC0355FP f10997t;

        /* JADX INFO: renamed from: u */
        public boolean f10998u;

        /* JADX INFO: renamed from: v */
        public int f10999v;

        /* JADX INFO: renamed from: w */
        public boolean f11000w;

        /* JADX INFO: renamed from: x */
        public EnumC4434gl f11001x;

        /* JADX INFO: renamed from: y */
        public boolean f11002y;

        /* JADX INFO: renamed from: z */
        public boolean f11003z;

        /* JADX WARN: Invalid debug info offset */
        public C3157b(PDFView pDFView, InterfaceC0371Ff interfaceC0371Ff) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ C3157b(PDFView pDFView, InterfaceC0371Ff interfaceC0371Ff, C3156a c3156a) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: A */
        public C3157b m17389A(InterfaceC0355FP interfaceC0355FP) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: B */
        public C3157b m17390B(int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: C */
        public C3157b m17391C(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public C3157b m17392a(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public C3157b m17393b(int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public C3157b m17394c() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public C3157b m17395d(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public C3157b m17396e(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public C3157b m17397f(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g */
        public C3157b m17398g(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public C3157b m17399h(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: i */
        public C3157b m17400i(InterfaceC4578iv interfaceC4578iv) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: j */
        public void m17401j() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public C3157b m17402k(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: l */
        public C3157b m17403l(InterfaceC5581vH interfaceC5581vH) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: m */
        public C3157b m17404m(InterfaceC5581vH interfaceC5581vH) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: n */
        public C3157b m17405n(InterfaceC5712xH interfaceC5712xH) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: o */
        public C3157b m17406o(InterfaceC5777yH interfaceC5777yH) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: p */
        public C3157b m17407p(InterfaceC5847zH interfaceC5847zH) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: q */
        public C3157b m17408q(InterfaceC0020AH interfaceC0020AH) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: r */
        public C3157b m17409r(InterfaceC0084BH interfaceC0084BH) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: s */
        public C3157b m17410s(InterfaceC0156CH interfaceC0156CH) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: t */
        public C3157b m17411t(InterfaceC0220DH interfaceC0220DH) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: u */
        public C3157b m17412u(InterfaceC0284EH interfaceC0284EH) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: v */
        public C3157b m17413v(EnumC4434gl enumC4434gl) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: w */
        public C3157b m17414w(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: x */
        public C3157b m17415x(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: y */
        public C3157b m17416y(int... iArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: z */
        public C3157b m17417z(String str) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.github.barteksc.pdfviewer.PDFView$c */
    public enum EnumC3158c {
        NONE,
        START,
        END
    }

    /* JADX INFO: renamed from: com.github.barteksc.pdfviewer.PDFView$d */
    public enum EnumC3159d {
        DEFAULT,
        LOADED,
        SHOWN,
        ERROR
    }

    static {
        try {
            System.loadLibrary("modpdfium");
            f10931W = true;
        } catch (Throwable unused) {
            f10931W = false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public PDFView(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ GestureDetectorOnGestureListenerC1655Zf m17293a(PDFView pDFView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static void m17294b(PDFView pDFView, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m17295c(PDFView pDFView, InterfaceC0371Ff interfaceC0371Ff, String str, int[] iArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static void m17296d(PDFView pDFView, InterfaceC0371Ff interfaceC0371Ff, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m17297e(PDFView pDFView) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C3157b m17298f(PDFView pDFView, C3157b c3157b) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static void m17299g(PDFView pDFView, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static void m17300h(PDFView pDFView, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static void m17301i(PDFView pDFView, InterfaceC0355FP interfaceC0355FP) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m17302j(PDFView pDFView, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static void m17303k(PDFView pDFView, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static void m17304l(PDFView pDFView, EnumC4434gl enumC4434gl) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public C3157b m17305A(InterfaceC0371Ff interfaceC0371Ff) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A0 */
    public final void m17306A0(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public C3157b m17307B(InputStream inputStream) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B0 */
    public final void m17308B0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public C3157b m17309C(Uri uri) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C0 */
    public final void m17310C0(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public int m17311D() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D0 */
    public final void m17312D0(EnumC4434gl enumC4434gl) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public float m17313E() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E0 */
    public final void m17314E0(InterfaceC0355FP interfaceC0355FP) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public float m17315F() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F0 */
    public final void m17316F0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public float m17317G() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G0 */
    public final void m17318G0(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public C4033a.c m17319H() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H0 */
    public void m17320H0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public List<C4033a.b> m17321I(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I0 */
    public float m17322I0(int i, EnumC5788yS enumC5788yS) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public float m17323J() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J0 */
    public void m17324J0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public float m17325K() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public float m17326K0(float f) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public float m17327L() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public float m17328L0(float f) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public int m17329M(float f) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M0 */
    public void m17330M0(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public int m17331N() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    public void m17332N0(float f, PointF pointF) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public EnumC4434gl m17333O() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O0 */
    public void m17334O0(float f, PointF pointF) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public C4938oS m17335P(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public void m17336P0(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q */
    public float m17337Q() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public void m17338Q0(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public InterfaceC0355FP m17339R() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public void m17340R0(float f, float f2, float f3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public int m17341S() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T */
    public List<C4033a.a> m17342T() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U */
    public float m17343U() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public boolean m17344V() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W */
    public boolean m17345W() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X */
    public boolean m17346X() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y */
    public boolean m17347Y() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z */
    public boolean m17348Z() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a0 */
    public boolean m17349a0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public boolean m17350b0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c0 */
    public boolean m17351c0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void computeScroll() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d0 */
    public boolean m17352d0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e0 */
    public boolean m17353e0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f0 */
    public boolean m17354f0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public boolean m17355g0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h0 */
    public void m17356h0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i0 */
    public void m17357i0(int i, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j0 */
    public final void m17358j0(InterfaceC0371Ff interfaceC0371Ff, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public final void m17359k0(InterfaceC0371Ff interfaceC0371Ff, String str, int[] iArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l0 */
    public void m17360l0(C0021AI c0021ai) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public boolean m17361m() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m0 */
    public void m17362m0(Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public boolean m17363n() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n0 */
    public void m17364n0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public final void m17365o(Canvas canvas, C4602jI c4602jI) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o0 */
    public void m17366o0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public final void m17367p(Canvas canvas, int i, InterfaceC5581vH interfaceC5581vH) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p0 */
    public void m17368p0(float f, float f2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public void m17369q(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q0 */
    public void m17370q0(float f, float f2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public void m17371r(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r0 */
    public void m17372r0(float f, float f2, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public void m17373s(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s0 */
    public void m17374s0(C4602jI c4602jI) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setMaxZoom(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setMidZoom(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setMinZoom(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setNightMode(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPageFling(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPageSnap(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPositionOffset(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPositionOffset(float f, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSwipeEnabled(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public void m17375t(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t0 */
    public void m17376t0(C4666kI c4666kI) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public int m17377u(float f, float f2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u0 */
    public boolean m17378u0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public EnumC5788yS m17379v(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v0 */
    public void m17380v0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public void m17381w(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w0 */
    public void m17382w0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public C3157b m17383x(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x0 */
    public void m17384x0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public C3157b m17385y(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y0 */
    public void m17386y0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public C3157b m17387z(File file) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z0 */
    public void m17388z0() {
    }
}
