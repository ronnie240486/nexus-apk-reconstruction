package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: renamed from: ey */
/* JADX INFO: loaded from: classes2.dex */
public class C4320ey extends Drawable implements Animatable {

    /* JADX INFO: renamed from: A */
    public static final float f13808A = 5.0f;

    /* JADX INFO: renamed from: B */
    public static final int f13809B = 10;

    /* JADX INFO: renamed from: C */
    public static final int f13810C = 5;

    /* JADX INFO: renamed from: D */
    public static final float f13811D = 5.0f;

    /* JADX INFO: renamed from: E */
    public static final int f13812E = 12;

    /* JADX INFO: renamed from: F */
    public static final int f13813F = 6;

    /* JADX INFO: renamed from: G */
    public static final float f13814G = 0.8f;

    /* JADX INFO: renamed from: n */
    public static final Interpolator f13815n = new LinearInterpolator();

    /* JADX INFO: renamed from: o */
    public static final Interpolator f13816o = new f(null);

    /* JADX INFO: renamed from: p */
    public static final Interpolator f13817p = new i(null);

    /* JADX INFO: renamed from: q */
    public static final Interpolator f13818q = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: r */
    public static final int f13819r = 0;

    /* JADX INFO: renamed from: s */
    public static final int f13820s = 1;

    /* JADX INFO: renamed from: t */
    public static final int f13821t = 40;

    /* JADX INFO: renamed from: u */
    public static final float f13822u = 8.75f;

    /* JADX INFO: renamed from: v */
    public static final float f13823v = 2.5f;

    /* JADX INFO: renamed from: w */
    public static final int f13824w = 56;

    /* JADX INFO: renamed from: x */
    public static final float f13825x = 12.5f;

    /* JADX INFO: renamed from: y */
    public static final float f13826y = 3.0f;

    /* JADX INFO: renamed from: z */
    public static final int f13827z = 1333;

    /* JADX INFO: renamed from: a */
    public boolean f13828a;

    /* JADX INFO: renamed from: b */
    public final int[] f13829b;

    /* JADX INFO: renamed from: c */
    public final ArrayList<Animation> f13830c;

    /* JADX INFO: renamed from: d */
    public final h f13831d;

    /* JADX INFO: renamed from: e */
    public float f13832e;

    /* JADX INFO: renamed from: f */
    public Resources f13833f;

    /* JADX INFO: renamed from: g */
    public View f13834g;

    /* JADX INFO: renamed from: h */
    public Animation f13835h;

    /* JADX INFO: renamed from: i */
    public float f13836i;

    /* JADX INFO: renamed from: j */
    public double f13837j;

    /* JADX INFO: renamed from: k */
    public double f13838k;

    /* JADX INFO: renamed from: l */
    public Animation f13839l;

    /* JADX INFO: renamed from: m */
    public final Drawable.Callback f13840m;

    /* JADX INFO: renamed from: ey$a */
    public class a extends Animation {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ h f13841a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4320ey f13842b;

        /* JADX WARN: Invalid debug info offset */
        public a(C4320ey c4320ey, h hVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
        }
    }

    /* JADX INFO: renamed from: ey$c */
    public class c extends Animation {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ h f13845a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4320ey f13846b;

        /* JADX WARN: Invalid debug info offset */
        public c(C4320ey c4320ey, h hVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
        }
    }

    /* JADX INFO: renamed from: ey$e */
    public class e implements Drawable.Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C4320ey f13849a;

        /* JADX WARN: Invalid debug info offset */
        public e(C4320ey c4320ey) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }
    }

    /* JADX INFO: renamed from: ey$f */
    public static class f extends AccelerateDecelerateInterpolator {
        /* JADX WARN: Invalid debug info offset */
        public f() {
        }

        /* JADX WARN: Invalid debug info offset */
        public f(a aVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.animation.AccelerateDecelerateInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: ey$g */
    /* JADX INFO: loaded from: classes.dex */
    @Retention(RetentionPolicy.CLASS)
    public @interface g {
    }

    /* JADX INFO: renamed from: ey$h */
    public static class h {

        /* JADX INFO: renamed from: a */
        public final RectF f13850a;

        /* JADX INFO: renamed from: b */
        public final Paint f13851b;

        /* JADX INFO: renamed from: c */
        public final Paint f13852c;

        /* JADX INFO: renamed from: d */
        public final Drawable.Callback f13853d;

        /* JADX INFO: renamed from: e */
        public float f13854e;

        /* JADX INFO: renamed from: f */
        public float f13855f;

        /* JADX INFO: renamed from: g */
        public float f13856g;

        /* JADX INFO: renamed from: h */
        public float f13857h;

        /* JADX INFO: renamed from: i */
        public float f13858i;

        /* JADX INFO: renamed from: j */
        public int[] f13859j;

        /* JADX INFO: renamed from: k */
        public int f13860k;

        /* JADX INFO: renamed from: l */
        public float f13861l;

        /* JADX INFO: renamed from: m */
        public float f13862m;

        /* JADX INFO: renamed from: n */
        public float f13863n;

        /* JADX INFO: renamed from: o */
        public boolean f13864o;

        /* JADX INFO: renamed from: p */
        public Path f13865p;

        /* JADX INFO: renamed from: q */
        public float f13866q;

        /* JADX INFO: renamed from: r */
        public double f13867r;

        /* JADX INFO: renamed from: s */
        public int f13868s;

        /* JADX INFO: renamed from: t */
        public int f13869t;

        /* JADX INFO: renamed from: u */
        public int f13870u;

        /* JADX INFO: renamed from: v */
        public final Paint f13871v;

        /* JADX INFO: renamed from: w */
        public int f13872w;

        /* JADX WARN: Invalid debug info offset */
        public h(Drawable.Callback callback) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: A */
        public void m20183A(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: B */
        public void m20184B(float f) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: C */
        public void m20185C(float f) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: D */
        public void m20186D() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m20187a(Canvas canvas, Rect rect) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public final void m20188b(Canvas canvas, float f, float f2, Rect rect) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public int m20189c() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public double m20190d() {
            return 0.0d;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public float m20191e() {
            return 0.0f;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public float m20192f() {
            return 0.0f;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g */
        public float m20193g() {
            return 0.0f;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public float m20194h() {
            return 0.0f;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: i */
        public float m20195i() {
            return 0.0f;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: j */
        public float m20196j() {
            return 0.0f;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public float m20197k() {
            return 0.0f;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: l */
        public float m20198l() {
            return 0.0f;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: m */
        public void m20199m() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: n */
        public final void m20200n() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: o */
        public void m20201o() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: p */
        public void m20202p(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: q */
        public void m20203q(float f, float f2) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: r */
        public void m20204r(float f) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: s */
        public void m20205s(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: t */
        public void m20206t(double d) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: u */
        public void m20207u(ColorFilter colorFilter) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: v */
        public void m20208v(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: w */
        public void m20209w(@NonNull int[] iArr) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: x */
        public void m20210x(float f) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: y */
        public void m20211y(int i, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: z */
        public void m20212z(float f) {
        }
    }

    /* JADX INFO: renamed from: ey$i */
    public static class i extends AccelerateDecelerateInterpolator {
        /* JADX WARN: Invalid debug info offset */
        public i() {
        }

        /* JADX WARN: Invalid debug info offset */
        public i(a aVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.animation.AccelerateDecelerateInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return 0.0f;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C4320ey(Context context, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m20165a(C4320ey c4320ey) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Animation m20166b(C4320ey c4320ey) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ View m20167c(C4320ey c4320ey) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Interpolator m20168d() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Interpolator m20169e() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ float m20170f(C4320ey c4320ey) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ float m20171g(C4320ey c4320ey, float f2) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final float m20172h() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public void m20173i(float f2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public void m20174j(int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public void m20175k(int... iArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public void m20176l(float f2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public void m20177m(float f2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public final void m20178n(double d2, double d3, double d4, double d5, float f2, float f3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public void m20179o(float f2, float f3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public final void m20180p() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public void m20181q(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public void m20182r(@g int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }

    /* JADX INFO: renamed from: ey$b */
    public class b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ h f13843a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4320ey f13844b;

        /* JADX WARN: Invalid debug info offset */
        public b(C4320ey c4320ey, h hVar) {
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

    /* JADX INFO: renamed from: ey$d */
    public class d implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ h f13847a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4320ey f13848b;

        /* JADX WARN: Invalid debug info offset */
        public d(C4320ey c4320ey, h hVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }
    }
}
