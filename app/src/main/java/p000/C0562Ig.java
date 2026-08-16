package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Ig */
/* JADX INFO: loaded from: classes2.dex */
public class C0562Ig extends AbstractC1356V5<AnimatorSet> {

    /* JADX INFO: renamed from: e */
    public int f1360e;

    /* JADX INFO: renamed from: f */
    public int f1361f;

    /* JADX INFO: renamed from: g */
    public int f1362g;

    /* JADX INFO: renamed from: h */
    public int f1363h;

    /* JADX INFO: renamed from: i */
    public int f1364i;

    /* JADX INFO: renamed from: j */
    public C0625Jg f1365j;

    /* JADX INFO: renamed from: Ig$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ c f1366a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0562Ig f1367b;

        /* JADX WARN: Invalid debug info offset */
        public a(C0562Ig c0562Ig, c cVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* JADX INFO: renamed from: Ig$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1368a;

        static {
            int[] iArr = new int[c.values().length];
            f1368a = iArr;
            try {
                iArr[c.Width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1368a[c.Height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1368a[c.Radius.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: Ig$c */
    public enum c {
        Width,
        Height,
        Radius
    }

    /* JADX WARN: Invalid debug info offset */
    public C0562Ig(@NonNull C6005m00.InterfaceC4775a interfaceC4775a) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m2668f(C0562Ig c0562Ig, ValueAnimator valueAnimator, c cVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.AbstractC1356V5
    @NonNull
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ Animator mo1117a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.AbstractC1356V5
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ AbstractC1356V5 mo2669b(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.AbstractC1356V5
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ AbstractC1356V5 mo2670d(float f) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    /* JADX INFO: renamed from: g */
    public AnimatorSet m2671g() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final ValueAnimator m2672h(int i, int i2, long j, c cVar) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public C0562Ig m2673i(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final boolean m2674j(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final void m2675k(@NonNull ValueAnimator valueAnimator, @NonNull c cVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public C0562Ig m2676l(float f) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public C0562Ig m2677m(int i, int i2, int i3, int i4, int i5) {
        return null;
    }
}
