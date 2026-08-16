package info.guardianproject.netcipher.proxy;

import java.io.IOException;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ProxySelector extends java.net.ProxySelector {
    private ArrayList<Proxy> listProxies;

    /* JADX WARN: Invalid debug info offset */
    public void addProxy(Proxy.Type type, String str, int i) {
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
