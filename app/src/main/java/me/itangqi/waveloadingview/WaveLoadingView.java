package me.itangqi.waveloadingview;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class WaveLoadingView extends View {

    /* JADX INFO: renamed from: G */
    public static final float f15142G = 0.1f;

    /* JADX INFO: renamed from: H */
    public static final float f15143H = 50.0f;

    /* JADX INFO: renamed from: I */
    public static final float f15144I = 0.5f;

    /* JADX INFO: renamed from: J */
    public static final float f15145J = 1.0f;

    /* JADX INFO: renamed from: K */
    public static final float f15146K = 0.0f;

    /* JADX INFO: renamed from: L */
    public static final int f15147L = 50;

    /* JADX INFO: renamed from: P */
    public static final int f15151P = 0;

    /* JADX INFO: renamed from: Q */
    public static final float f15152Q = 0.0f;

    /* JADX INFO: renamed from: R */
    public static final float f15153R = 0.0f;

    /* JADX INFO: renamed from: R0 */
    public static final float f15154R0 = 18.0f;

    /* JADX INFO: renamed from: U */
    public static final int f15157U = 30;

    /* JADX INFO: renamed from: V */
    public static final float f15158V = 18.0f;

    /* JADX INFO: renamed from: W */
    public static final float f15159W = 22.0f;

    /* JADX INFO: renamed from: A */
    public Paint f15160A;

    /* JADX INFO: renamed from: B */
    public Paint f15161B;

    /* JADX INFO: renamed from: C */
    public Paint f15162C;

    /* JADX INFO: renamed from: D */
    public ObjectAnimator f15163D;

    /* JADX INFO: renamed from: E */
    public AnimatorSet f15164E;

    /* JADX INFO: renamed from: F */
    public Context f15165F;

    /* JADX INFO: renamed from: a */
    public int f15166a;

    /* JADX INFO: renamed from: b */
    public int f15167b;

    /* JADX INFO: renamed from: c */
    public int f15168c;

    /* JADX INFO: renamed from: d */
    public float f15169d;

    /* JADX INFO: renamed from: e */
    public int f15170e;

    /* JADX INFO: renamed from: f */
    public int f15171f;

    /* JADX INFO: renamed from: g */
    public int f15172g;

    /* JADX INFO: renamed from: h */
    public int f15173h;

    /* JADX INFO: renamed from: i */
    public int f15174i;

    /* JADX INFO: renamed from: j */
    public String f15175j;

    /* JADX INFO: renamed from: k */
    public String f15176k;

    /* JADX INFO: renamed from: l */
    public String f15177l;

    /* JADX INFO: renamed from: m */
    public float f15178m;

    /* JADX INFO: renamed from: n */
    public float f15179n;

    /* JADX INFO: renamed from: o */
    public float f15180o;

    /* JADX INFO: renamed from: p */
    public int f15181p;

    /* JADX INFO: renamed from: q */
    public boolean f15182q;

    /* JADX INFO: renamed from: r */
    public BitmapShader f15183r;

    /* JADX INFO: renamed from: s */
    public Bitmap f15184s;

    /* JADX INFO: renamed from: t */
    public Matrix f15185t;

    /* JADX INFO: renamed from: u */
    public Paint f15186u;

    /* JADX INFO: renamed from: v */
    public Paint f15187v;

    /* JADX INFO: renamed from: w */
    public Paint f15188w;

    /* JADX INFO: renamed from: x */
    public Paint f15189x;

    /* JADX INFO: renamed from: y */
    public Paint f15190y;

    /* JADX INFO: renamed from: z */
    public Paint f15191z;

    /* JADX INFO: renamed from: M */
    public static final int f15148M = Color.parseColor("#212121");

    /* JADX INFO: renamed from: N */
    public static final int f15149N = Color.parseColor("#00000000");

    /* JADX INFO: renamed from: O */
    public static final int f15150O = Color.parseColor("#212121");

    /* JADX INFO: renamed from: S */
    public static final int f15155S = EnumC4817a.CIRCLE.ordinal();

    /* JADX INFO: renamed from: T */
    public static final int f15156T = EnumC4818b.NORTH.ordinal();

    /* JADX INFO: renamed from: me.itangqi.waveloadingview.WaveLoadingView$a */
    public enum EnumC4817a {
        TRIANGLE,
        CIRCLE,
        SQUARE,
        RECTANGLE
    }

    /* JADX INFO: renamed from: me.itangqi.waveloadingview.WaveLoadingView$b */
    public enum EnumC4818b {
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    /* JADX WARN: Invalid debug info offset */
    public WaveLoadingView(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public WaveLoadingView(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public WaveLoadingView(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public final int m22147A(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public final int m22148B(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(19)
    /* JADX INFO: renamed from: C */
    public void m22149C() {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(19)
    /* JADX INFO: renamed from: D */
    public void m22150D() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public final int m22151E(float f) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public void m22152F() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public final void m22153G() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final int m22154a(int i, float f) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public void m22155b() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final int m22156c(float f) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public void m22157d() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public float m22158e() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public int m22159f() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public float m22160g() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public String m22161h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public int m22162i() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public float m22163j() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public String m22164k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public int m22165l() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public float m22166m() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public final Path m22167n(Point point, int i, int i2, int i3) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public int m22168o() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onAttachedToWindow() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onDetachedFromWindow() {
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
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public int m22169p() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public String m22170q() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public int m22171r() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public float m22172s() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setAmplitudeRatio(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setAnimDuration(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setBorderColor(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setBorderWidth(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setBottomTitle(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setBottomTitleColor(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setBottomTitleSize(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setBottomTitleStrokeColor(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setBottomTitleStrokeWidth(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCenterTitle(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCenterTitleColor(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCenterTitleSize(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCenterTitleStrokeColor(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCenterTitleStrokeWidth(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setProgressValue(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setShapeType(EnumC4817a enumC4817a) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTopTitle(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTopTitleColor(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTopTitleSize(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTopTitleStrokeColor(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTopTitleStrokeWidth(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setWaterLevelRatio(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setWaveBgColor(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setWaveColor(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setWaveShiftRatio(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public int m22173t() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public int m22174u() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public float m22175v() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public float m22176w() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public final boolean m22177x() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public final void m22178y(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public final void m22179z() {
    }
}
