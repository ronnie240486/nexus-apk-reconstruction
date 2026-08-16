package org.httpd.protocols.http.sockets;

import java.io.IOException;
import java.net.ServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import org.httpd.util.IFactoryThrowing;

/* JADX INFO: loaded from: classes2.dex */
public class SecureServerSocketFactory implements IFactoryThrowing<ServerSocket, IOException> {

    /* JADX INFO: renamed from: a */
    public SSLServerSocketFactory f16998a;

    /* JADX INFO: renamed from: b */
    public String[] f16999b;

    /* JADX WARN: Invalid debug info offset */
    public SecureServerSocketFactory(SSLServerSocketFactory sSLServerSocketFactory, String[] strArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.httpd.util.IFactoryThrowing
    /* JADX INFO: renamed from: a */
    public ServerSocket mo24921a() {
        return null;
    }
}
