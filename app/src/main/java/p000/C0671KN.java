package p000;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: renamed from: KN */
/* JADX INFO: loaded from: classes.dex */
public class C0671KN implements InterfaceC4317ev {

    /* JADX INFO: renamed from: a */
    public final Context f1592a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4253dv f1593b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0862NN f1594c;

    /* JADX INFO: renamed from: d */
    public final C0992PN f1595d;

    /* JADX INFO: renamed from: e */
    public final C4896nn f1596e;

    /* JADX INFO: renamed from: f */
    public final e f1597f;

    /* JADX INFO: renamed from: g */
    public b f1598g;

    /* JADX INFO: renamed from: KN$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC4253dv f1599a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0671KN f1600b;

        /* JADX WARN: Invalid debug info offset */
        public a(C0671KN c0671kn, InterfaceC4253dv interfaceC4253dv) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: KN$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        <T> void m3178a(C0824Mm<T, ?, ?, ?> c0824Mm);
    }

    /* JADX INFO: renamed from: KN$c */
    public final class c<A, T> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0915OC<A, T> f1601a;

        /* JADX INFO: renamed from: b */
        public final Class<T> f1602b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0671KN f1603c;

        /* JADX INFO: renamed from: KN$c$a */
        public final class a {

            /* JADX INFO: renamed from: a */
            public final A f1604a;

            /* JADX INFO: renamed from: b */
            public final Class<A> f1605b;

            /* JADX INFO: renamed from: c */
            public final boolean f1606c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ c f1607d;

            /* JADX WARN: Invalid debug info offset */
            public a(c cVar, Class<A> cls) {
            }

            /* JADX WARN: Invalid debug info offset */
            public a(c cVar, A a) {
            }

            /* JADX WARN: Invalid debug info offset */
            /* JADX INFO: renamed from: a */
            public <Z> C0887Nm<A, T, Z> m3183a(Class<Z> cls) {
                return null;
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public c(C0671KN c0671kn, InterfaceC0915OC<A, T> interfaceC0915OC, Class<T> cls) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ InterfaceC0915OC m3179a(c cVar) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Class m3180b(c cVar) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public c<A, T>.a m3181c(Class<A> cls) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public c<A, T>.a m3182d(A a2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: KN$d */
    public final class d<T> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0915OC<T, InputStream> f1608a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0671KN f1609b;

        /* JADX WARN: Invalid debug info offset */
        public d(C0671KN c0671kn, InterfaceC0915OC<T, InputStream> interfaceC0915OC) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public C5453tg<T> m3184a(Class<T> cls) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public C5453tg<T> m3185b(T t) {
            return null;
        }
    }

    /* JADX INFO: renamed from: KN$e */
    public class e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0671KN f1610a;

        /* JADX WARN: Invalid debug info offset */
        public e(C0671KN c0671kn) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public <A, X extends C0824Mm<A, ?, ?, ?>> X m3186a(X x) {
            return null;
        }
    }

    /* JADX INFO: renamed from: KN$f */
    public static class f implements InterfaceC0240Db.a {

        /* JADX INFO: renamed from: a */
        public final C0992PN f1611a;

        /* JADX WARN: Invalid debug info offset */
        public f(C0992PN c0992pn) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0240Db.a
        /* JADX INFO: renamed from: a */
        public void mo1402a(boolean z) {
        }
    }

    /* JADX INFO: renamed from: KN$g */
    public final class g<T> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0915OC<T, ParcelFileDescriptor> f1612a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0671KN f1613b;

        /* JADX WARN: Invalid debug info offset */
        public g(C0671KN c0671kn, InterfaceC0915OC<T, ParcelFileDescriptor> interfaceC0915OC) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public C5453tg<T> m3187a(T t) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C0671KN(Context context, InterfaceC4253dv interfaceC4253dv, InterfaceC0862NN interfaceC0862NN) {
    }

    /* JADX WARN: Invalid debug info offset */
    public C0671KN(Context context, InterfaceC4253dv interfaceC4253dv, InterfaceC0862NN interfaceC0862NN, C0992PN c0992pn, C0304Eb c0304Eb) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Class m3139d(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Context m3140f(C0671KN c0671kn) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ C4896nn m3141j(C0671KN c0671kn) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ C0992PN m3142k(C0671KN c0671kn) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ InterfaceC4253dv m3143l(C0671KN c0671kn) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ e m3144m(C0671KN c0671kn) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ b m3145n(C0671KN c0671kn) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static <T> Class<T> m3146w(T t) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public C5453tg<Integer> m3147A(Integer num) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public <T> C5453tg<T> m3148B(T t) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public C5453tg<String> m3149C(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: D */
    public C5453tg<URL> m3150D(URL url) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public C5453tg<byte[]> m3151E(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: F */
    public C5453tg<byte[]> m3152F(byte[] bArr, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public C5453tg<Uri> m3153G(Uri uri) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: H */
    public C5453tg<Uri> m3154H(Uri uri, String str, long j, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public final <T> C5453tg<T> m3155I(Class<T> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public void m3156J() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public void m3157K(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public void m3158L() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public void m3159M() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public void m3160N() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public void m3161O() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public void m3162P(b bVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q */
    public <A, T> c<A, T> m3163Q(InterfaceC0915OC<A, T> interfaceC0915OC, Class<T> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public d<byte[]> m3164R(C5440tT c5440tT) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public <T> d<T> m3165S(InterfaceC5789yT<T> interfaceC5789yT) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T */
    public <T> g<T> m3166T(InterfaceC1464Wi<T> interfaceC1464Wi) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public <T> C5453tg<T> m3167o(Class<T> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4317ev
    public void onDestroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4317ev
    public void onStart() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4317ev
    public void onStop() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public C5453tg<byte[]> m3168p() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public C5453tg<File> m3169q() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public C5453tg<Uri> m3170r() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public C5453tg<Integer> m3171s() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public C5453tg<String> m3172t() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public C5453tg<Uri> m3173u() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: v */
    public C5453tg<URL> m3174v() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public boolean m3175x() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public C5453tg<Uri> m3176y(Uri uri) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public C5453tg<File> m3177z(File file) {
        return null;
    }
}
