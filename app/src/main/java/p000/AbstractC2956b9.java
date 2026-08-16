package p000;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: b9 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2956b9 {
    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static AbstractC2956b9 m14600b(X509TrustManager x509TrustManager) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static AbstractC2956b9 m14601c(X509Certificate... x509CertificateArr) {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public abstract List<Certificate> mo2454a(List<Certificate> list, String str) throws SSLPeerUnverifiedException;
}
