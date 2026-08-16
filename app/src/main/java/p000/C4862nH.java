package p000;

import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: nH */
/* JADX INFO: loaded from: classes2.dex */
public final class C4862nH implements HostnameVerifier {

    /* JADX INFO: renamed from: a */
    public static final C4862nH f15259a = new C4862nH();

    /* JADX INFO: renamed from: b */
    public static final int f15260b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f15261c = 7;

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static List<String> m22328a(X509Certificate x509Certificate) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public static java.util.List<java.lang.String> m22329b(java.security.cert.X509Certificate r4, int r5) {
        /*
            r0 = 0
            return r0
        L48:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4862nH.m22329b(java.security.cert.X509Certificate, int):java.util.List");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public boolean m22330c(String str, X509Certificate x509Certificate) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public boolean m22331d(String str, String str2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public final boolean m22332e(String str, X509Certificate x509Certificate) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public final boolean m22333f(String str, X509Certificate x509Certificate) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        return false;
    }
}
