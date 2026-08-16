package p000;

import java.text.DecimalFormat;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Sg */
/* JADX INFO: loaded from: classes2.dex */
public final class C1201Sg {

    /* JADX INFO: renamed from: a */
    public static final boolean f3195a = false;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final ThreadLocal<DecimalFormat>[] f3196b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new ThreadLocal<>();
        }
        f3196b = threadLocalArr;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static final DecimalFormat m5677a(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m5678b(double d, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m5679c(double d, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static final boolean m5680d() {
        return false;
    }
}
