package p000;

import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: yb */
/* JADX INFO: loaded from: classes.dex */
public final class C5797yb {

    /* JADX INFO: renamed from: e */
    public static final C0785M9[] f19586e;

    /* JADX INFO: renamed from: f */
    public static final C0785M9[] f19587f;

    /* JADX INFO: renamed from: g */
    public static final C5797yb f19588g;

    /* JADX INFO: renamed from: h */
    public static final C5797yb f19589h;

    /* JADX INFO: renamed from: i */
    public static final C5797yb f19590i;

    /* JADX INFO: renamed from: j */
    public static final C5797yb f19591j;

    /* JADX INFO: renamed from: a */
    public final boolean f19592a;

    /* JADX INFO: renamed from: b */
    public final boolean f19593b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String[] f19594c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String[] f19595d;

    /* JADX INFO: renamed from: yb$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public boolean f19596a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public String[] f19597b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public String[] f19598c;

        /* JADX INFO: renamed from: d */
        public boolean f19599d;

        /* JADX WARN: Invalid debug info offset */
        public a(C5797yb c5797yb) {
        }

        /* JADX WARN: Invalid debug info offset */
        public a(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public a m29846a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public a m29847b() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public C5797yb m29848c() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public a m29849d(C0785M9... c0785m9Arr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public a m29850e(String... strArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public a m29851f(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g */
        public a m29852g(EnumC0099BW... enumC0099BWArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public a m29853h(String... strArr) {
            return null;
        }
    }

    static {
        C0785M9 c0785m9 = C0785M9.f2018n1;
        C0785M9 c0785m10 = C0785M9.f2021o1;
        C0785M9 c0785m11 = C0785M9.f2024p1;
        C0785M9 c0785m12 = C0785M9.f2027q1;
        C0785M9 c0785m13 = C0785M9.f2030r1;
        C0785M9 c0785m14 = C0785M9.f1977Z0;
        C0785M9 c0785m15 = C0785M9.f1988d1;
        C0785M9 c0785m16 = C0785M9.f1979a1;
        C0785M9 c0785m17 = C0785M9.f1991e1;
        C0785M9 c0785m18 = C0785M9.f2009k1;
        C0785M9 c0785m19 = C0785M9.f2006j1;
        C0785M9[] c0785m9Arr = {c0785m9, c0785m10, c0785m11, c0785m12, c0785m13, c0785m14, c0785m15, c0785m16, c0785m17, c0785m18, c0785m19};
        f19586e = c0785m9Arr;
        C0785M9[] c0785m9Arr2 = {c0785m9, c0785m10, c0785m11, c0785m12, c0785m13, c0785m14, c0785m15, c0785m16, c0785m17, c0785m18, c0785m19, C0785M9.f1947K0, C0785M9.f1949L0, C0785M9.f2002i0, C0785M9.f2005j0, C0785M9.f1938G, C0785M9.f1946K, C0785M9.f2007k};
        f19587f = c0785m9Arr2;
        a aVarM29849d = new a(true).m29849d(c0785m9Arr);
        EnumC0099BW enumC0099BW = EnumC0099BW.TLS_1_3;
        EnumC0099BW enumC0099BW2 = EnumC0099BW.TLS_1_2;
        a aVarM29851f = aVarM29849d.m29852g(enumC0099BW, enumC0099BW2).m29851f(true);
        aVarM29851f.getClass();
        f19588g = new C5797yb(aVarM29851f);
        a aVarM29849d2 = new a(true).m29849d(c0785m9Arr2);
        EnumC0099BW enumC0099BW3 = EnumC0099BW.TLS_1_0;
        a aVarM29851f2 = aVarM29849d2.m29852g(enumC0099BW, enumC0099BW2, EnumC0099BW.TLS_1_1, enumC0099BW3).m29851f(true);
        aVarM29851f2.getClass();
        f19589h = new C5797yb(aVarM29851f2);
        a aVarM29851f3 = new a(true).m29849d(c0785m9Arr2).m29852g(enumC0099BW3).m29851f(true);
        aVarM29851f3.getClass();
        f19590i = new C5797yb(aVarM29851f3);
        f19591j = new C5797yb(new a(false));
    }

    /* JADX WARN: Invalid debug info offset */
    public C5797yb(a aVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m29839a(SSLSocket sSLSocket, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: b */
    public List<C0785M9> m29840b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public boolean m29841c(SSLSocket sSLSocket) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public boolean m29842d() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public final C5797yb m29843e(SSLSocket sSLSocket, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(@Nullable Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public boolean m29844f() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: g */
    public List<EnumC0099BW> m29845g() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
