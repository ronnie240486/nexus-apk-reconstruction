package android.media.ViviTV.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class CircleProgressView extends View {

    /* JADX INFO: renamed from: A */
    public float f9679A;

    /* JADX INFO: renamed from: B */
    public float f9680B;

    /* JADX INFO: renamed from: C */
    public int f9681C;

    /* JADX INFO: renamed from: D */
    public boolean f9682D;

    /* JADX INFO: renamed from: E */
    public boolean f9683E;

    /* JADX INFO: renamed from: F */
    public boolean f9684F;

    /* JADX INFO: renamed from: G */
    public boolean f9685G;

    /* JADX INFO: renamed from: H */
    public boolean f9686H;

    /* JADX INFO: renamed from: I */
    public boolean f9687I;

    /* JADX INFO: renamed from: J */
    public InterfaceC2324b f9688J;

    /* JADX INFO: renamed from: a */
    public Paint f9689a;

    /* JADX INFO: renamed from: b */
    public TextPaint f9690b;

    /* JADX INFO: renamed from: c */
    public float f9691c;

    /* JADX INFO: renamed from: d */
    public int f9692d;

    /* JADX INFO: renamed from: e */
    public int f9693e;

    /* JADX INFO: renamed from: f */
    public float f9694f;

    /* JADX INFO: renamed from: g */
    public float f9695g;

    /* JADX INFO: renamed from: h */
    public int f9696h;

    /* JADX INFO: renamed from: i */
    public int f9697i;

    /* JADX INFO: renamed from: j */
    public boolean f9698j;

    /* JADX INFO: renamed from: k */
    public Shader f9699k;

    /* JADX INFO: renamed from: l */
    public int[] f9700l;

    /* JADX INFO: renamed from: m */
    public float f9701m;

    /* JADX INFO: renamed from: n */
    public float f9702n;

    /* JADX INFO: renamed from: o */
    public int f9703o;

    /* JADX INFO: renamed from: p */
    public int f9704p;

    /* JADX INFO: renamed from: q */
    public float f9705q;

    /* JADX INFO: renamed from: r */
    public int f9706r;

    /* JADX INFO: renamed from: s */
    public int f9707s;

    /* JADX INFO: renamed from: t */
    public int f9708t;

    /* JADX INFO: renamed from: u */
    public int f9709u;

    /* JADX INFO: renamed from: v */
    public String f9710v;

    /* JADX INFO: renamed from: w */
    public float f9711w;

    /* JADX INFO: renamed from: x */
    public int f9712x;

    /* JADX INFO: renamed from: y */
    public float f9713y;

    /* JADX INFO: renamed from: z */
    public float f9714z;

    /* JADX INFO: renamed from: android.media.ViviTV.view.CircleProgressView$a */
    public class C2323a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CircleProgressView f9715a;

        /* JADX WARN: Invalid debug info offset */
        public C2323a(CircleProgressView circleProgressView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.view.CircleProgressView$b */
    public interface InterfaceC2324b {
        /* JADX INFO: renamed from: a */
        void m14254a(float f, float f2);
    }

    /* JADX WARN: Invalid debug info offset */
    public CircleProgressView(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CircleProgressView(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CircleProgressView(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public void m14227A(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m14228a(Canvas canvas) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final void m14229b(Canvas canvas) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public float m14230c() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public float m14231d() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public final DisplayMetrics m14232e() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public String m14233f() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public int m14234g() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public int m14235h() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public int m14236i() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public int m14237j() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public float m14238k() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public final float m14239l() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public int m14240m() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public int m14241n() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public String m14242o() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public final void m14243p(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public boolean m14244q() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public boolean m14245r() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public boolean m14246s() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCapRound(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLabelPaddingBottom(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLabelPaddingLeft(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLabelPaddingRight(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLabelPaddingTop(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLabelText(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLabelTextColor(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLabelTextColorResource(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLabelTextSize(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLabelTextSize(int i, float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setMax(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setNormalColor(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOnChangeListener(InterfaceC2324b interfaceC2324b) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setProgress(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setProgressColor(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setProgressColor(int... iArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setProgressColorResource(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setShader(Shader shader) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setShowLabel(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setShowPercentText(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setShowTick(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTurn(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public boolean m14247t() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public boolean m14248u() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public final int m14249v(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public void m14250w(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public void m14251x(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public void m14252y(int i, int i2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public void m14253z(int i, int i2, int i3, Animator.AnimatorListener animatorListener) {
    }
}
