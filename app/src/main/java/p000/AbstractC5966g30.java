package p000;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: g30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5966g30<T extends View, Z> extends AbstractC5220q6<Z> {

    /* JADX INFO: renamed from: d */
    public static final String f14078d = "ViewTarget";

    /* JADX INFO: renamed from: e */
    public static boolean f14079e;

    /* JADX INFO: renamed from: f */
    public static Integer f14080f;

    /* JADX INFO: renamed from: b */
    public final T f14081b;

    /* JADX INFO: renamed from: c */
    public final C4390a f14082c;

    /* JADX INFO: renamed from: g30$a */
    public static class C4390a {

        /* JADX INFO: renamed from: e */
        public static final int f14083e = 0;

        /* JADX INFO: renamed from: a */
        public final View f14084a;

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC5179pS> f14085b;

        /* JADX INFO: renamed from: c */
        public a f14086c;

        /* JADX INFO: renamed from: d */
        public Point f14087d;

        /* JADX INFO: renamed from: g30$a$a */
        public static class a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a */
            public final WeakReference<C4390a> f14088a;

            /* JADX WARN: Invalid debug info offset */
            public a(C4390a c4390a) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                return false;
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public C4390a(View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m20713a(C4390a c4390a) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public final void m20714b() {
        }

        /* JADX WARN: Invalid debug info offset */
        @TargetApi(13)
        /* JADX INFO: renamed from: c */
        public final Point m20715c() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public void m20716d(InterfaceC5179pS interfaceC5179pS) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public final int m20717e(int i, boolean z) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public final int m20718f() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g */
        public final int m20719g() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public final boolean m20720h(int i) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: i */
        public final void m20721i(int i, int i2) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public AbstractC5966g30(T t) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static void m20710l(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4941oV
    /* JADX INFO: renamed from: a */
    public void mo2291a(InterfaceC5179pS interfaceC5179pS) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.AbstractC5220q6, p000.InterfaceC4941oV
    /* JADX INFO: renamed from: c */
    public void mo2293c(InterfaceC0226DN interfaceC0226DN) {
    }

    /* JADX WARN: Invalid debug info offset */
    public T getView() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.AbstractC5220q6, p000.InterfaceC4941oV
    /* JADX INFO: renamed from: h */
    public InterfaceC0226DN mo2297h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final Object m20711j() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final void m20712k(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
