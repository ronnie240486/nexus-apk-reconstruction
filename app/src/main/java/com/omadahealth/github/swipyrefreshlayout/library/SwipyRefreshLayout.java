package com.omadahealth.github.swipyrefreshlayout.library;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import p000.C0912O9;
import p000.C4320ey;
import p000.EnumC5658wU;

/* JADX INFO: loaded from: classes2.dex */
public class SwipyRefreshLayout extends ViewGroup {

    /* JADX INFO: renamed from: K */
    public static final String f11490K = "SwipyRefreshLayout";

    /* JADX INFO: renamed from: L */
    public static final float f11491L = 0.6f;

    /* JADX INFO: renamed from: M */
    public static final int f11492M = 120;

    /* JADX INFO: renamed from: N */
    public static final int f11493N = 0;

    /* JADX INFO: renamed from: O */
    public static final int f11494O = 1;

    /* JADX INFO: renamed from: P */
    public static final String f11495P = "SwipyRefreshLayout";

    /* JADX INFO: renamed from: Q */
    public static final int f11496Q = 255;

    /* JADX INFO: renamed from: R */
    public static final int f11497R = 76;

    /* JADX INFO: renamed from: R0 */
    public static final float f11498R0 = 0.8f;

    /* JADX INFO: renamed from: S */
    public static final int f11499S = 40;

    /* JADX INFO: renamed from: S0 */
    public static final int f11500S0 = 150;

    /* JADX INFO: renamed from: T */
    public static final int f11501T = 56;

    /* JADX INFO: renamed from: T0 */
    public static final int f11502T0 = 300;

    /* JADX INFO: renamed from: U */
    public static final float f11503U = 2.0f;

    /* JADX INFO: renamed from: U0 */
    public static final int f11504U0 = 200;

    /* JADX INFO: renamed from: V */
    public static final int f11505V = -1;

    /* JADX INFO: renamed from: V0 */
    public static final int f11506V0 = 200;

    /* JADX INFO: renamed from: W */
    public static final float f11507W = 0.5f;

    /* JADX INFO: renamed from: W0 */
    public static final int f11508W0 = -328966;

    /* JADX INFO: renamed from: X0 */
    public static final int f11509X0 = 64;

    /* JADX INFO: renamed from: Y0 */
    public static final int[] f11510Y0 = {android.R.attr.enabled};

    /* JADX INFO: renamed from: A */
    public Animation f11511A;

    /* JADX INFO: renamed from: B */
    public Animation f11512B;

    /* JADX INFO: renamed from: C */
    public float f11513C;

    /* JADX INFO: renamed from: D */
    public boolean f11514D;

    /* JADX INFO: renamed from: E */
    public int f11515E;

    /* JADX INFO: renamed from: F */
    public int f11516F;

    /* JADX INFO: renamed from: G */
    public boolean f11517G;

    /* JADX INFO: renamed from: H */
    public Animation.AnimationListener f11518H;

    /* JADX INFO: renamed from: I */
    public final Animation f11519I;

    /* JADX INFO: renamed from: J */
    public final Animation f11520J;

    /* JADX INFO: renamed from: a */
    public View f11521a;

    /* JADX INFO: renamed from: b */
    public EnumC5658wU f11522b;

    /* JADX INFO: renamed from: c */
    public boolean f11523c;

    /* JADX INFO: renamed from: d */
    public InterfaceC3899j f11524d;

    /* JADX INFO: renamed from: e */
    public boolean f11525e;

    /* JADX INFO: renamed from: f */
    public int f11526f;

    /* JADX INFO: renamed from: g */
    public float f11527g;

    /* JADX INFO: renamed from: h */
    public int f11528h;

    /* JADX INFO: renamed from: i */
    public int f11529i;

    /* JADX INFO: renamed from: j */
    public boolean f11530j;

    /* JADX INFO: renamed from: k */
    public float f11531k;

    /* JADX INFO: renamed from: l */
    public float f11532l;

    /* JADX INFO: renamed from: m */
    public boolean f11533m;

    /* JADX INFO: renamed from: n */
    public int f11534n;

    /* JADX INFO: renamed from: o */
    public boolean f11535o;

    /* JADX INFO: renamed from: p */
    public boolean f11536p;

    /* JADX INFO: renamed from: q */
    public final DecelerateInterpolator f11537q;

    /* JADX INFO: renamed from: r */
    public C0912O9 f11538r;

    /* JADX INFO: renamed from: s */
    public int f11539s;

    /* JADX INFO: renamed from: t */
    public int f11540t;

    /* JADX INFO: renamed from: u */
    public float f11541u;

    /* JADX INFO: renamed from: v */
    public int f11542v;

    /* JADX INFO: renamed from: w */
    public C4320ey f11543w;

    /* JADX INFO: renamed from: x */
    public Animation f11544x;

    /* JADX INFO: renamed from: y */
    public Animation f11545y;

    /* JADX INFO: renamed from: z */
    public Animation f11546z;

    /* JADX INFO: renamed from: com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout$a */
    public class AnimationAnimationListenerC3890a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SwipyRefreshLayout f11547a;

        /* JADX WARN: Invalid debug info offset */
        public AnimationAnimationListenerC3890a(SwipyRefreshLayout swipyRefreshLayout) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout$b */
    public class C3891b extends Animation {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SwipyRefreshLayout f11548a;

        /* JADX WARN: Invalid debug info offset */
        public C3891b(SwipyRefreshLayout swipyRefreshLayout) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
        }
    }

    /* JADX INFO: renamed from: com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout$c */
    public class C3892c extends Animation {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SwipyRefreshLayout f11549a;

        /* JADX WARN: Invalid debug info offset */
        public C3892c(SwipyRefreshLayout swipyRefreshLayout) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
        }
    }

    /* JADX INFO: renamed from: com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout$d */
    public class C3893d extends Animation {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f11550a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f11551b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ SwipyRefreshLayout f11552c;

        /* JADX WARN: Invalid debug info offset */
        public C3893d(SwipyRefreshLayout swipyRefreshLayout, int i, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
        }
    }

    /* JADX INFO: renamed from: com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout$e */
    public class AnimationAnimationListenerC3894e implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SwipyRefreshLayout f11553a;

        /* JADX WARN: Invalid debug info offset */
        public AnimationAnimationListenerC3894e(SwipyRefreshLayout swipyRefreshLayout) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout$f */
    public class C3895f extends Animation {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SwipyRefreshLayout f11554a;

        /* JADX WARN: Invalid debug info offset */
        public C3895f(SwipyRefreshLayout swipyRefreshLayout) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
        }
    }

    /* JADX INFO: renamed from: com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout$g */
    public class C3896g extends Animation {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SwipyRefreshLayout f11555a;

        /* JADX WARN: Invalid debug info offset */
        public C3896g(SwipyRefreshLayout swipyRefreshLayout) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
        }
    }

    /* JADX INFO: renamed from: com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout$h */
    public class C3897h extends Animation {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SwipyRefreshLayout f11556a;

        /* JADX WARN: Invalid debug info offset */
        public C3897h(SwipyRefreshLayout swipyRefreshLayout) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
        }
    }

    /* JADX INFO: renamed from: com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout$i */
    public static /* synthetic */ class C3898i {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11557a;

        static {
            int[] iArr = new int[EnumC5658wU.values().length];
            f11557a = iArr;
            try {
                iArr[EnumC5658wU.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11557a[EnumC5658wU.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout$j */
    public interface InterfaceC3899j {
        /* JADX INFO: renamed from: l0 */
        void mo10027l0(EnumC5658wU enumC5658wU);
    }

    /* JADX WARN: Invalid debug info offset */
    public SwipyRefreshLayout(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SwipyRefreshLayout(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m18008a(SwipyRefreshLayout swipyRefreshLayout) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C4320ey m18009b(SwipyRefreshLayout swipyRefreshLayout) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m18010c(SwipyRefreshLayout swipyRefreshLayout, int i, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m18011d(SwipyRefreshLayout swipyRefreshLayout, Animation.AnimationListener animationListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m18012e(SwipyRefreshLayout swipyRefreshLayout) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ float m18013f(SwipyRefreshLayout swipyRefreshLayout) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m18014g(SwipyRefreshLayout swipyRefreshLayout, float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ float m18015h(SwipyRefreshLayout swipyRefreshLayout) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ boolean m18016i(SwipyRefreshLayout swipyRefreshLayout) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InterfaceC3899j m18017j(SwipyRefreshLayout swipyRefreshLayout) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ EnumC5658wU m18018k(SwipyRefreshLayout swipyRefreshLayout) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ C0912O9 m18019l(SwipyRefreshLayout swipyRefreshLayout) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m18020m(SwipyRefreshLayout swipyRefreshLayout, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ boolean m18021n(SwipyRefreshLayout swipyRefreshLayout) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m18022o(SwipyRefreshLayout swipyRefreshLayout, float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ int m18023p(SwipyRefreshLayout swipyRefreshLayout) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ int m18024q(SwipyRefreshLayout swipyRefreshLayout, int i) {
        return 0;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m18025A() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public final boolean m18026B(Animation animation) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public boolean m18027C() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public final void m18028D(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public final void m18029E(MotionEvent motionEvent) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public final void m18030F(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public final void m18031G(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public final void m18032H(EnumC5658wU enumC5658wU) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public final void m18033I(boolean z, boolean z2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public final void m18034J(int i, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public final Animation m18035K(int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public final void m18036L() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public final void m18037M() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public final void m18038N(Animation.AnimationListener animationListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public final void m18039O(int i, Animation.AnimationListener animationListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public final void m18040P(Animation.AnimationListener animationListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public final void m18041r(int i, Animation.AnimationListener animationListener) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public final void m18042s(int i, Animation.AnimationListener animationListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void setColorScheme(int... iArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setColorSchemeColors(int... iArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setColorSchemeResources(int... iArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDirection(EnumC5658wU enumC5658wU) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDistanceToTriggerSync(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOnRefreshListener(InterfaceC3899j interfaceC3899j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setProgressBackgroundColor(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setRefreshing(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSize(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public boolean m18043t() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public boolean m18044u() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public final void m18045v() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public final void m18046w() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public C0912O9 m18047x() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public EnumC5658wU m18048y() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public final float m18049z(MotionEvent motionEvent, int i) {
        return 0.0f;
    }
}
