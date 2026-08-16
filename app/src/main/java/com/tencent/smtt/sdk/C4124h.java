package com.tencent.smtt.sdk;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import com.tencent.smtt.export.external.interfaces.ConsoleMessage;
import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.JsPromptResult;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.export.external.interfaces.QuotaUpdater;
import com.tencent.smtt.export.external.proxy.X5ProxyWebChromeClient;

/* JADX INFO: renamed from: com.tencent.smtt.sdk.h */
/* JADX INFO: loaded from: classes2.dex */
class C4124h extends X5ProxyWebChromeClient {

    /* JADX INFO: renamed from: a */
    private WebView f13037a;

    /* JADX INFO: renamed from: b */
    private WebChromeClient f13038b;

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.h$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebView.WebViewTransport f13039a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Message f13040b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C4124h f13041c;

        /* JADX WARN: Invalid debug info offset */
        public AnonymousClass1(C4124h c4124h, WebView.WebViewTransport webViewTransport, Message message) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.h$2, reason: invalid class name */
    public class AnonymousClass2 implements ValueCallback<Uri> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ android.webkit.ValueCallback f13042a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C4124h f13043b;

        /* JADX WARN: Invalid debug info offset */
        public AnonymousClass2(C4124h c4124h, android.webkit.ValueCallback valueCallback) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m19059a(Uri uri) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.ValueCallback, android.webkit.ValueCallback
        public /* synthetic */ void onReceiveValue(Object obj) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.h$3, reason: invalid class name */
    public class AnonymousClass3 implements ValueCallback<Uri[]> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ android.webkit.ValueCallback f13044a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C4124h f13045b;

        /* JADX WARN: Invalid debug info offset */
        public AnonymousClass3(C4124h c4124h, android.webkit.ValueCallback valueCallback) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m19060a(Uri[] uriArr) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.ValueCallback, android.webkit.ValueCallback
        public /* synthetic */ void onReceiveValue(Object obj) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.h$4, reason: invalid class name */
    public class AnonymousClass4 extends WebChromeClient.FileChooserParams {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ IX5WebChromeClient.FileChooserParams f13046a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C4124h f13047b;

        /* JADX WARN: Invalid debug info offset */
        public AnonymousClass4(C4124h c4124h, IX5WebChromeClient.FileChooserParams fileChooserParams) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
        public Intent createIntent() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
        public String[] getAcceptTypes() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
        public String getFilenameHint() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
        public int getMode() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
        public CharSequence getTitle() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
        public boolean isCaptureEnabled() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.h$a */
    public class a implements WebStorage.QuotaUpdater {

        /* JADX INFO: renamed from: a */
        QuotaUpdater f13048a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C4124h f13049b;

        /* JADX WARN: Invalid debug info offset */
        public a(C4124h c4124h, QuotaUpdater quotaUpdater) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.WebStorage.QuotaUpdater
        public void updateQuota(long j) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C4124h(IX5WebChromeClient iX5WebChromeClient, WebView webView, WebChromeClient webChromeClient) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        return null;
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void getVisitedHistory(android.webkit.ValueCallback<String[]> valueCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onCloseWindow(IX5WebViewBase iX5WebViewBase) {
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onConsoleMessage(String str, int i, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onCreateWindow(IX5WebViewBase iX5WebViewBase, boolean z, boolean z2, Message message) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissionsCallback geolocationPermissionsCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onHideCustomView() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onJsAlert(IX5WebViewBase iX5WebViewBase, String str, String str2, JsResult jsResult) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onJsBeforeUnload(IX5WebViewBase iX5WebViewBase, String str, String str2, JsResult jsResult) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onJsConfirm(IX5WebViewBase iX5WebViewBase, String str, String str2, JsResult jsResult) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onJsPrompt(IX5WebViewBase iX5WebViewBase, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onJsTimeout() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onProgressChanged(IX5WebViewBase iX5WebViewBase, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onReachedMaxAppCacheSize(long j, long j2, QuotaUpdater quotaUpdater) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onReceivedIcon(IX5WebViewBase iX5WebViewBase, Bitmap bitmap) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onReceivedTitle(IX5WebViewBase iX5WebViewBase, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onReceivedTouchIconUrl(IX5WebViewBase iX5WebViewBase, String str, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onRequestFocus(IX5WebViewBase iX5WebViewBase) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onShowCustomView(View view, int i, IX5WebChromeClient.CustomViewCallback customViewCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onShowCustomView(View view, IX5WebChromeClient.CustomViewCallback customViewCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onShowFileChooser(IX5WebViewBase iX5WebViewBase, android.webkit.ValueCallback<Uri[]> valueCallback, IX5WebChromeClient.FileChooserParams fileChooserParams) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void openFileChooser(android.webkit.ValueCallback<Uri[]> valueCallback, String str, String str2, boolean z) {
    }
}
