package p000;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: A2 */
/* JADX INFO: loaded from: classes.dex */
public class C0003A2 implements X509TrustManager {

    /* JADX INFO: renamed from: a */
    public static TrustManager[] f29a;

    /* JADX INFO: renamed from: b */
    public static final X509Certificate[] f30b = new X509Certificate[0];

    /* JADX INFO: renamed from: A2$a */
    public class a implements HostnameVerifier {
        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static void m73a() {
    }

    /* JADX INFO: renamed from: b */
    public boolean m74b(X509Certificate[] x509CertificateArr) {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public boolean m75c(X509Certificate[] x509CertificateArr) {
        return true;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }
}
