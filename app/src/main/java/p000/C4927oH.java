package p000;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: oH */
/* JADX INFO: loaded from: classes.dex */
public class C4927oH implements Cloneable, InterfaceC0401G8.a, Q30.InterfaceC1036a {

    /* JADX INFO: renamed from: C */
    public static final List<EnumC0669KL> f15446C = C1194SZ.m5653v(EnumC0669KL.HTTP_2, EnumC0669KL.HTTP_1_1);

    /* JADX INFO: renamed from: D */
    public static final List<C5797yb> f15447D = C1194SZ.m5653v(C5797yb.f19589h, C5797yb.f19591j);

    /* JADX INFO: renamed from: A */
    public final int f15448A;

    /* JADX INFO: renamed from: B */
    public final int f15449B;

    /* JADX INFO: renamed from: a */
    public final C4888nf f15450a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Proxy f15451b;

    /* JADX INFO: renamed from: c */
    public final List<EnumC0669KL> f15452c;

    /* JADX INFO: renamed from: d */
    public final List<C5797yb> f15453d;

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC5884zs> f15454e;

    /* JADX INFO: renamed from: f */
    public final List<InterfaceC5884zs> f15455f;

    /* JADX INFO: renamed from: g */
    public final AbstractC1657Zh.c f15456g;

    /* JADX INFO: renamed from: h */
    public final ProxySelector f15457h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5602vc f15458i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final C5572v8 f15459j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final InterfaceC0193Cs f15460k;

    /* JADX INFO: renamed from: l */
    public final SocketFactory f15461l;

    /* JADX INFO: renamed from: m */
    public final SSLSocketFactory f15462m;

    /* JADX INFO: renamed from: n */
    public final AbstractC2956b9 f15463n;

    /* JADX INFO: renamed from: o */
    public final HostnameVerifier f15464o;

    /* JADX INFO: renamed from: p */
    public final C3019c9 f15465p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC0781M5 f15466q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC0781M5 f15467r;

    /* JADX INFO: renamed from: s */
    public final C5665wb f15468s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC0044Af f15469t;

    /* JADX INFO: renamed from: u */
    public final boolean f15470u;

    /* JADX INFO: renamed from: v */
    public final boolean f15471v;

    /* JADX INFO: renamed from: w */
    public final boolean f15472w;

    /* JADX INFO: renamed from: x */
    public final int f15473x;

    /* JADX INFO: renamed from: y */
    public final int f15474y;

    /* JADX INFO: renamed from: z */
    public final int f15475z;

    /* JADX INFO: renamed from: oH$a */
    public class a extends AbstractC0121Bs {
        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC0121Bs
        /* JADX INFO: renamed from: a */
        public void mo724a(C0189Co.a aVar, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC0121Bs
        /* JADX INFO: renamed from: b */
        public void mo725b(C0189Co.a aVar, String str, String str2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC0121Bs
        /* JADX INFO: renamed from: c */
        public void mo726c(C5797yb c5797yb, SSLSocket sSLSocket, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC0121Bs
        /* JADX INFO: renamed from: d */
        public int mo727d(C4934oO.a aVar) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC0121Bs
        /* JADX INFO: renamed from: e */
        public boolean mo728e(C5665wb c5665wb, C0352FM c0352fm) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC0121Bs
        /* JADX INFO: renamed from: f */
        public Socket mo729f(C5665wb c5665wb, C3012c2 c3012c2, C5180pT c5180pT) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC0121Bs
        /* JADX INFO: renamed from: g */
        public boolean mo730g(C3012c2 c3012c2, C3012c2 c3012c3) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC0121Bs
        /* JADX INFO: renamed from: h */
        public C0352FM mo731h(C5665wb c5665wb, C3012c2 c3012c2, C5180pT c5180pT, C0927OO c0927oo) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC0121Bs
        /* JADX INFO: renamed from: j */
        public boolean mo732j(IllegalArgumentException illegalArgumentException) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC0121Bs
        /* JADX INFO: renamed from: k */
        public InterfaceC0401G8 mo733k(C4927oH c4927oH, C0162CN c0162cn) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC0121Bs
        /* JADX INFO: renamed from: l */
        public void mo734l(C5665wb c5665wb, C0352FM c0352fm) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC0121Bs
        /* JADX INFO: renamed from: m */
        public C0993PO mo735m(C5665wb c5665wb) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC0121Bs
        /* JADX INFO: renamed from: n */
        public void mo736n(b bVar, InterfaceC0193Cs interfaceC0193Cs) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC0121Bs
        /* JADX INFO: renamed from: o */
        public C5180pT mo737o(InterfaceC0401G8 interfaceC0401G8) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC0121Bs
        @Nullable
        /* JADX INFO: renamed from: p */
        public IOException mo738p(InterfaceC0401G8 interfaceC0401G8, @Nullable IOException iOException) {
            return null;
        }
    }

    /* JADX INFO: renamed from: oH$b */
    public static final class b {

        /* JADX INFO: renamed from: A */
        public int f15476A;

        /* JADX INFO: renamed from: B */
        public int f15477B;

        /* JADX INFO: renamed from: a */
        public C4888nf f15478a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public Proxy f15479b;

        /* JADX INFO: renamed from: c */
        public List<EnumC0669KL> f15480c;

        /* JADX INFO: renamed from: d */
        public List<C5797yb> f15481d;

        /* JADX INFO: renamed from: e */
        public final List<InterfaceC5884zs> f15482e;

        /* JADX INFO: renamed from: f */
        public final List<InterfaceC5884zs> f15483f;

        /* JADX INFO: renamed from: g */
        public AbstractC1657Zh.c f15484g;

        /* JADX INFO: renamed from: h */
        public ProxySelector f15485h;

        /* JADX INFO: renamed from: i */
        public InterfaceC5602vc f15486i;

        /* JADX INFO: renamed from: j */
        @Nullable
        public C5572v8 f15487j;

        /* JADX INFO: renamed from: k */
        @Nullable
        public InterfaceC0193Cs f15488k;

        /* JADX INFO: renamed from: l */
        public SocketFactory f15489l;

        /* JADX INFO: renamed from: m */
        @Nullable
        public SSLSocketFactory f15490m;

        /* JADX INFO: renamed from: n */
        @Nullable
        public AbstractC2956b9 f15491n;

        /* JADX INFO: renamed from: o */
        public HostnameVerifier f15492o;

        /* JADX INFO: renamed from: p */
        public C3019c9 f15493p;

        /* JADX INFO: renamed from: q */
        public InterfaceC0781M5 f15494q;

        /* JADX INFO: renamed from: r */
        public InterfaceC0781M5 f15495r;

        /* JADX INFO: renamed from: s */
        public C5665wb f15496s;

        /* JADX INFO: renamed from: t */
        public InterfaceC0044Af f15497t;

        /* JADX INFO: renamed from: u */
        public boolean f15498u;

        /* JADX INFO: renamed from: v */
        public boolean f15499v;

        /* JADX INFO: renamed from: w */
        public boolean f15500w;

        /* JADX INFO: renamed from: x */
        public int f15501x;

        /* JADX INFO: renamed from: y */
        public int f15502y;

        /* JADX INFO: renamed from: z */
        public int f15503z;

        /* JADX WARN: Invalid debug info offset */
        public b() {
        }

        /* JADX WARN: Invalid debug info offset */
        public b(C4927oH c4927oH) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: A */
        public b m22643A(InterfaceC0781M5 interfaceC0781M5) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: B */
        public b m22644B(ProxySelector proxySelector) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: C */
        public b m22645C(long j, TimeUnit timeUnit) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @IgnoreJRERequirement
        /* JADX INFO: renamed from: D */
        public b m22646D(Duration duration) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: E */
        public b m22647E(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: F */
        public void m22648F(@Nullable InterfaceC0193Cs interfaceC0193Cs) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: G */
        public b m22649G(SocketFactory socketFactory) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: H */
        public b m22650H(SSLSocketFactory sSLSocketFactory) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: I */
        public b m22651I(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: J */
        public b m22652J(long j, TimeUnit timeUnit) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @IgnoreJRERequirement
        /* JADX INFO: renamed from: K */
        public b m22653K(Duration duration) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public b m22654a(InterfaceC5884zs interfaceC5884zs) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public b m22655b(InterfaceC5884zs interfaceC5884zs) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public b m22656c(InterfaceC0781M5 interfaceC0781M5) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public C4927oH m22657d() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public b m22658e(@Nullable C5572v8 c5572v8) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public b m22659f(long j, TimeUnit timeUnit) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @IgnoreJRERequirement
        /* JADX INFO: renamed from: g */
        public b m22660g(Duration duration) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public b m22661h(C3019c9 c3019c9) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: i */
        public b m22662i(long j, TimeUnit timeUnit) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @IgnoreJRERequirement
        /* JADX INFO: renamed from: j */
        public b m22663j(Duration duration) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public b m22664k(C5665wb c5665wb) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: l */
        public b m22665l(List<C5797yb> list) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: m */
        public b m22666m(InterfaceC5602vc interfaceC5602vc) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: n */
        public b m22667n(C4888nf c4888nf) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: o */
        public b m22668o(InterfaceC0044Af interfaceC0044Af) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: p */
        public b m22669p(AbstractC1657Zh abstractC1657Zh) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: q */
        public b m22670q(AbstractC1657Zh.c cVar) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: r */
        public b m22671r(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: s */
        public b m22672s(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: t */
        public b m22673t(HostnameVerifier hostnameVerifier) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: u */
        public List<InterfaceC5884zs> m22674u() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: v */
        public List<InterfaceC5884zs> m22675v() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: w */
        public b m22676w(long j, TimeUnit timeUnit) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @IgnoreJRERequirement
        /* JADX INFO: renamed from: x */
        public b m22677x(Duration duration) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: y */
        public b m22678y(List<EnumC0669KL> list) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: z */
        public b m22679z(@Nullable Proxy proxy) {
            return null;
        }
    }

    static {
        AbstractC0121Bs.f349a = new a();
    }

    /* JADX WARN: Invalid debug info offset */
    public C4927oH() {
    }

    /* JADX WARN: Invalid debug info offset */
    public C4927oH(b bVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public static SSLSocketFactory m22614y(X509TrustManager x509TrustManager) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public List<EnumC0669KL> m22615A() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: B */
    public Proxy m22616B() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public InterfaceC0781M5 m22617C() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public ProxySelector m22618D() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public int m22619E() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public boolean m22620F() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public SocketFactory m22621G() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public SSLSocketFactory m22622H() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public int m22623I() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.Q30.InterfaceC1036a
    /* JADX INFO: renamed from: a */
    public Q30 mo4580a(C0162CN c0162cn, R30 r30) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0401G8.a
    /* JADX INFO: renamed from: b */
    public InterfaceC0401G8 mo2000b(C0162CN c0162cn) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public InterfaceC0781M5 m22624c() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: d */
    public C5572v8 m22625d() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public int m22626e() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public C3019c9 m22627f() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public int m22628g() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public C5665wb m22629h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public List<C5797yb> m22630i() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public InterfaceC5602vc m22631l() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public C4888nf m22632m() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public InterfaceC0044Af m22633n() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public AbstractC1657Zh.c m22634o() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public boolean m22635q() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public boolean m22636r() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public HostnameVerifier m22637s() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public List<InterfaceC5884zs> m22638t() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public InterfaceC0193Cs m22639u() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public List<InterfaceC5884zs> m22640v() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public b m22641x() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public int m22642z() {
        return 0;
    }
}
