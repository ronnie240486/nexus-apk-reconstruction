package p000;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: wr */
/* JADX INFO: loaded from: classes.dex */
public class C5681wr extends ProxySelector {

    /* JADX INFO: renamed from: d */
    public static final List<Proxy> f19336d = Arrays.asList(Proxy.NO_PROXY);

    /* JADX INFO: renamed from: a */
    public final ProxySelector f19337a;

    /* JADX INFO: renamed from: b */
    public final String f19338b;

    /* JADX INFO: renamed from: c */
    public final int f19339c;

    /* JADX WARN: Invalid debug info offset */
    public C5681wr(ProxySelector proxySelector, String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static void m29330a(String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        return null;
    }
}
