package p000;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Kb */
/* JADX INFO: loaded from: classes2.dex */
public final class C0685Kb {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0685Kb f1642a = new C0685Kb();

    /* JADX INFO: renamed from: b */
    @InterfaceC5750xt
    public static final double f1643b = Math.log(2.0d);

    /* JADX INFO: renamed from: c */
    @InterfaceC5750xt
    public static final double f1644c;

    /* JADX INFO: renamed from: d */
    @InterfaceC5750xt
    public static final double f1645d;

    /* JADX INFO: renamed from: e */
    @InterfaceC5750xt
    public static final double f1646e;

    /* JADX INFO: renamed from: f */
    @InterfaceC5750xt
    public static final double f1647f;

    /* JADX INFO: renamed from: g */
    @InterfaceC5750xt
    public static final double f1648g;

    static {
        double dUlp = Math.ulp(1.0d);
        f1644c = dUlp;
        double dSqrt = Math.sqrt(dUlp);
        f1645d = dSqrt;
        double dSqrt2 = Math.sqrt(dSqrt);
        f1646e = dSqrt2;
        double d = 1;
        Double.isNaN(d);
        f1647f = d / dSqrt;
        Double.isNaN(d);
        f1648g = d / dSqrt2;
    }
}
