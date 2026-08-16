package com.p2pengine.core.utils;

import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.jetbrains.annotations.NotNull;
import p000.C4927oH;

/* JADX INFO: renamed from: com.p2pengine.core.utils.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C4013f {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final a f12248b = new a();

    /* JADX INFO: renamed from: c */
    public static volatile C4013f f12249c;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final C4927oH f12250a;

    /* JADX INFO: renamed from: com.p2pengine.core.utils.f$a */
    public static final class a {
        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static final SSLSocketFactory m18438a(a aVar) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.utils.f$b */
    public static final class b implements X509TrustManager {
        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(@NotNull X509Certificate[] x509CertificateArr, @NotNull String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(@NotNull X509Certificate[] x509CertificateArr, @NotNull String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.X509TrustManager
        @NotNull
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.utils.f$c */
    public static final class c implements HostnameVerifier {
        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(@NotNull String str, @NotNull SSLSession sSLSession) {
            return false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C4013f(int i) {
    }
}
