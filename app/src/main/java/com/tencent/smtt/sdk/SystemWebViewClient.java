package com.tencent.smtt.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.RenderProcessGoneDetail;
import com.tencent.smtt.export.external.interfaces.ClientCertRequest;
import com.tencent.smtt.export.external.interfaces.HttpAuthHandler;
import com.tencent.smtt.export.external.interfaces.SslError;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;
import com.tencent.smtt.export.external.interfaces.WebResourceError;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import java.io.InputStream;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"NewApi", "Override"})
class SystemWebViewClient extends android.webkit.WebViewClient {

    /* JADX INFO: renamed from: c */
    private static String f12778c;

    /* JADX INFO: renamed from: a */
    private WebViewClient f12779a;

    /* JADX INFO: renamed from: b */
    private WebView f12780b;

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.SystemWebViewClient$1 */
    public class RunnableC40871 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ SystemWebViewClient f12781a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC40871(SystemWebViewClient systemWebViewClient) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.SystemWebViewClient$2 */
    public class C40882 extends WebResourceError {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ android.webkit.WebResourceError f12782a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SystemWebViewClient f12783b;

        /* JADX WARN: Invalid debug info offset */
        public C40882(SystemWebViewClient systemWebViewClient, android.webkit.WebResourceError webResourceError) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceError
        public CharSequence getDescription() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceError
        public int getErrorCode() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.SystemWebViewClient$3 */
    public class C40893 implements WebViewClient.RenderProcessGoneDetail {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ RenderProcessGoneDetail f12784a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SystemWebViewClient f12785b;

        /* JADX WARN: Invalid debug info offset */
        public C40893(SystemWebViewClient systemWebViewClient, RenderProcessGoneDetail renderProcessGoneDetail) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.WebViewClient.RenderProcessGoneDetail
        public boolean didCrash() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.WebViewClient.RenderProcessGoneDetail
        public int rendererPriorityAtExit() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.SystemWebViewClient$a */
    public static class C4090a extends ClientCertRequest {

        /* JADX INFO: renamed from: a */
        private android.webkit.ClientCertRequest f12786a;

        /* JADX WARN: Invalid debug info offset */
        public C4090a(android.webkit.ClientCertRequest clientCertRequest) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.ClientCertRequest
        public void cancel() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.ClientCertRequest
        public String getHost() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.ClientCertRequest
        public String[] getKeyTypes() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.ClientCertRequest
        public int getPort() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.ClientCertRequest
        public Principal[] getPrincipals() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.ClientCertRequest
        public void ignore() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.ClientCertRequest
        public void proceed(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.SystemWebViewClient$b */
    public static class C4091b implements HttpAuthHandler {

        /* JADX INFO: renamed from: a */
        private android.webkit.HttpAuthHandler f12787a;

        /* JADX WARN: Invalid debug info offset */
        public C4091b(android.webkit.HttpAuthHandler httpAuthHandler) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.HttpAuthHandler
        public void cancel() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.HttpAuthHandler
        public void proceed(String str, String str2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.HttpAuthHandler
        public boolean useHttpAuthUsernamePassword() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.SystemWebViewClient$c */
    public static class C4092c implements SslErrorHandler {

        /* JADX INFO: renamed from: a */
        android.webkit.SslErrorHandler f12788a;

        /* JADX WARN: Invalid debug info offset */
        public C4092c(android.webkit.SslErrorHandler sslErrorHandler) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.SslErrorHandler
        public void cancel() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.SslErrorHandler
        public void proceed() {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.SystemWebViewClient$d */
    public static class C4093d implements SslError {

        /* JADX INFO: renamed from: a */
        android.net.http.SslError f12789a;

        /* JADX WARN: Invalid debug info offset */
        public C4093d(android.net.http.SslError sslError) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.SslError
        public boolean addError(int i) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.SslError
        public SslCertificate getCertificate() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.SslError
        public int getPrimaryError() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.SslError
        public String getUrl() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.SslError
        public boolean hasError(int i) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.SystemWebViewClient$e */
    public static class C4094e implements WebResourceRequest {

        /* JADX INFO: renamed from: a */
        private String f12790a;

        /* JADX INFO: renamed from: b */
        private boolean f12791b;

        /* JADX INFO: renamed from: c */
        private boolean f12792c;

        /* JADX INFO: renamed from: d */
        private boolean f12793d;

        /* JADX INFO: renamed from: e */
        private String f12794e;

        /* JADX INFO: renamed from: f */
        private Map<String, String> f12795f;

        /* JADX WARN: Invalid debug info offset */
        public C4094e(String str, boolean z, boolean z2, boolean z3, String str2, Map<String, String> map) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public String getMethod() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public Map<String, String> getRequestHeaders() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public Uri getUrl() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public boolean hasGesture() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public boolean isForMainFrame() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public boolean isRedirect() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.SystemWebViewClient$f */
    public static class C4095f implements WebResourceRequest {

        /* JADX INFO: renamed from: a */
        android.webkit.WebResourceRequest f12796a;

        /* JADX WARN: Invalid debug info offset */
        public C4095f(android.webkit.WebResourceRequest webResourceRequest) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public String getMethod() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public Map<String, String> getRequestHeaders() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public Uri getUrl() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public boolean hasGesture() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public boolean isForMainFrame() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public boolean isRedirect() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.SystemWebViewClient$g */
    public static class C4096g extends WebResourceResponse {

        /* JADX INFO: renamed from: a */
        android.webkit.WebResourceResponse f12797a;

        /* JADX WARN: Invalid debug info offset */
        public C4096g(android.webkit.WebResourceResponse webResourceResponse) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public InputStream getData() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public String getEncoding() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public String getMimeType() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public String getReasonPhrase() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public Map<String, String> getResponseHeaders() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public int getStatusCode() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public void setData(InputStream inputStream) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public void setEncoding(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public void setMimeType(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public void setResponseHeaders(Map<String, String> map) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public void setStatusCodeAndReasonPhrase(int i, String str) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public SystemWebViewClient(WebView webView, WebViewClient webViewClient) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ WebView m18893a(SystemWebViewClient systemWebViewClient) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(android.webkit.WebView webView, String str, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebViewClient
    public void onFormResubmission(android.webkit.WebView webView, Message message, Message message2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebViewClient
    public void onLoadResource(android.webkit.WebView webView, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(android.webkit.WebView webView, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, String str, Bitmap bitmap) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(android.webkit.WebView webView, android.webkit.ClientCertRequest clientCertRequest) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView webView, int i, String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(android.webkit.WebView webView, android.webkit.HttpAuthHandler httpAuthHandler, String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebViewClient
    @TargetApi(12)
    public void onReceivedLoginRequest(android.webkit.WebView webView, String str, String str2, String str3) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebViewClient
    @TargetApi(8)
    public void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(android.webkit.WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebViewClient
    public void onScaleChanged(android.webkit.WebView webView, float f, float f2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(android.webkit.WebView webView, Message message, Message message2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(android.webkit.WebView webView, KeyEvent keyEvent) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebViewClient
    @TargetApi(11)
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(android.webkit.WebView webView, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, String str) {
        return false;
    }
}
