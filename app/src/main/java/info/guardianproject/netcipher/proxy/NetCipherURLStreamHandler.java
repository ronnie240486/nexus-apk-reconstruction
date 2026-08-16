package info.guardianproject.netcipher.proxy;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/* JADX INFO: loaded from: classes2.dex */
public class NetCipherURLStreamHandler extends URLStreamHandler {
    private URLStreamHandler defaultHandler;

    /* JADX WARN: Invalid debug info offset */
    public NetCipherURLStreamHandler(URLStreamHandler uRLStreamHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.net.URLStreamHandler
    public URLConnection openConnection(URL url) throws IOException {
        return null;
    }
}
