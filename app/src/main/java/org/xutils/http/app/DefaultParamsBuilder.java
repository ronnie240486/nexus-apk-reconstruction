package org.xutils.http.app;

import java.security.cert.X509Certificate;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

/* JADX INFO: loaded from: classes.dex */
public class DefaultParamsBuilder implements ParamsBuilder {

    /* JADX INFO: renamed from: a */
    public static SSLSocketFactory f18159a;

    /* JADX INFO: renamed from: org.xutils.http.app.DefaultParamsBuilder$1 */
    public static class C51291 implements X509TrustManager {
        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: f */
    public static javax.net.ssl.SSLSocketFactory m27097f() {
        /*
            r0 = 0
            return r0
        L27:
        L30:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.http.app.DefaultParamsBuilder.m27097f():javax.net.ssl.SSLSocketFactory");
    }

    @Override // org.xutils.http.app.ParamsBuilder
    /* JADX INFO: renamed from: a */
    public void mo27098a(RequestParams requestParams, String[] strArr) throws Throwable {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.app.ParamsBuilder
    /* JADX INFO: renamed from: b */
    public String mo27099b(RequestParams requestParams, String[] strArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.app.ParamsBuilder
    /* JADX INFO: renamed from: c */
    public String mo27100c(RequestParams requestParams, HttpRequest httpRequest) throws Throwable {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.app.ParamsBuilder
    /* JADX INFO: renamed from: d */
    public SSLSocketFactory mo27101d() throws Throwable {
        return null;
    }

    @Override // org.xutils.http.app.ParamsBuilder
    /* JADX INFO: renamed from: e */
    public void mo27102e(RequestParams requestParams) throws Throwable {
    }
}
