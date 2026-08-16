package p000;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* JADX INFO: renamed from: OG */
/* JADX INFO: loaded from: classes2.dex */
public class C0919OG extends ProxySelector {
    /* JADX WARN: Invalid debug info offset */
    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        return null;
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
