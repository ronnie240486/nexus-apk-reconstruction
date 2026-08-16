package p000;

import java.io.IOException;
import java.net.Socket;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: Bs */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0121Bs {

    /* JADX INFO: renamed from: a */
    public static AbstractC0121Bs f349a;

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static void m723i() {
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo724a(C0189Co.a aVar, String str);

    /* JADX INFO: renamed from: b */
    public abstract void mo725b(C0189Co.a aVar, String str, String str2);

    /* JADX INFO: renamed from: c */
    public abstract void mo726c(C5797yb c5797yb, SSLSocket sSLSocket, boolean z);

    /* JADX INFO: renamed from: d */
    public abstract int mo727d(C4934oO.a aVar);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo728e(C5665wb c5665wb, C0352FM c0352fm);

    /* JADX INFO: renamed from: f */
    public abstract Socket mo729f(C5665wb c5665wb, C3012c2 c3012c2, C5180pT c5180pT);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo730g(C3012c2 c3012c2, C3012c2 c3012c3);

    /* JADX INFO: renamed from: h */
    public abstract C0352FM mo731h(C5665wb c5665wb, C3012c2 c3012c2, C5180pT c5180pT, C0927OO c0927oo);

    /* JADX INFO: renamed from: j */
    public abstract boolean mo732j(IllegalArgumentException illegalArgumentException);

    /* JADX INFO: renamed from: k */
    public abstract InterfaceC0401G8 mo733k(C4927oH c4927oH, C0162CN c0162cn);

    /* JADX INFO: renamed from: l */
    public abstract void mo734l(C5665wb c5665wb, C0352FM c0352fm);

    /* JADX INFO: renamed from: m */
    public abstract C0993PO mo735m(C5665wb c5665wb);

    /* JADX INFO: renamed from: n */
    public abstract void mo736n(C4927oH.b bVar, InterfaceC0193Cs interfaceC0193Cs);

    /* JADX INFO: renamed from: o */
    public abstract C5180pT mo737o(InterfaceC0401G8 interfaceC0401G8);

    @Nullable
    /* JADX INFO: renamed from: p */
    public abstract IOException mo738p(InterfaceC0401G8 interfaceC0401G8, @Nullable IOException iOException);
}
