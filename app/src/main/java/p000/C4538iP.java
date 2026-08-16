package p000;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: iP */
/* JADX INFO: loaded from: classes.dex */
public class C4538iP {

    /* JADX INFO: renamed from: iP$a */
    public class a implements HostnameVerifier {
        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    /* JADX INFO: renamed from: iP$c */
    public static class c extends SSLSocketFactory {

        /* JADX INFO: renamed from: b */
        public static final String[] f14525b = {"TLSv1.2"};

        /* JADX INFO: renamed from: a */
        public final SSLSocketFactory f14526a;

        /* JADX WARN: Invalid debug info offset */
        public c(SSLSocketFactory sSLSocketFactory) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public final Socket m21365a(Socket socket) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.SocketFactory
        public Socket createSocket(String str, int i) throws IOException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.SocketFactory
        public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.SocketFactory
        public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.SocketFactory
        public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.SSLSocketFactory
        public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.SSLSocketFactory
        public String[] getDefaultCipherSuites() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.SSLSocketFactory
        public String[] getSupportedCipherSuites() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0010
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static final javax.net.ssl.SSLSocketFactory m21360a() {
        /*
            r0 = 0
            return r0
        L1e:
        L20:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4538iP.m21360a():javax.net.ssl.SSLSocketFactory");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static HostnameVerifier m21361b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x001b
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    /* JADX INFO: renamed from: c */
    public static info.guardianproject.netcipher.client.TlsOnlySocketFactory m21362c() {
        /*
            r0 = 0
            return r0
        L19:
        L1b:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4538iP.m21362c():info.guardianproject.netcipher.client.TlsOnlySocketFactory");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static final TrustManager[] m21363d() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static final void m21364e() {
    }

    /* JADX INFO: renamed from: iP$b */
    public class b implements X509TrustManager {
        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }
    }
}
