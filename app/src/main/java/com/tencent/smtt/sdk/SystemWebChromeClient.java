package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import com.tencent.smtt.export.external.interfaces.ConsoleMessage;
import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.export.external.interfaces.JsPromptResult;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.export.external.interfaces.PermissionRequest;

/* JADX INFO: loaded from: classes2.dex */
class SystemWebChromeClient extends android.webkit.WebChromeClient {

    /* JADX INFO: renamed from: a */
    protected WebChromeClient f12747a;

    /* JADX INFO: renamed from: b */
    private WebView f12748b;

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.SystemWebChromeClient$1 */
    public class C40741 implements ValueCallback<String[]> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ android.webkit.ValueCallback f12749a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SystemWebChromeClient f12750b;

        /* JADX WARN: Invalid debug info offset */
        public C40741(SystemWebChromeClient systemWebChromeClient, android.webkit.ValueCallback valueCallback) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m18890a(String[] strArr) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.ValueCallback, android.webkit.ValueCallback
        public /* synthetic */ void onReceiveValue(Object obj) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.SystemWebChromeClient$2 */
    public class RunnableC40752 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebView.WebViewTransport f12751a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Message f12752b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ SystemWebChromeClient f12753c;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC40752(SystemWebChromeClient systemWebChromeClient, WebView.WebViewTransport webViewTransport, Message message) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.SystemWebChromeClient$3 */
    public class C40763 implements ValueCallback<Uri> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ android.webkit.ValueCallback f12754a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SystemWebChromeClient f12755b;

        /* JADX WARN: Invalid debug info offset */
        public C40763(SystemWebChromeClient systemWebChromeClient, android.webkit.ValueCallback valueCallback) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m18891a(Uri uri) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.ValueCallback, android.webkit.ValueCallback
        public /* synthetic */ void onReceiveValue(Object obj) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.SystemWebChromeClient$4 */
    public class C40774 implements ValueCallback<Uri[]> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ android.webkit.ValueCallback f12756a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SystemWebChromeClient f12757b;

        /* JADX WARN: Invalid debug info offset */
        public C40774(SystemWebChromeClient systemWebChromeClient, android.webkit.ValueCallback valueCallback) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m18892a(Uri[] uriArr) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.ValueCallback, android.webkit.ValueCallback
        public /* synthetic */ void onReceiveValue(Object obj) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.SystemWebChromeClient$5 */
    public class C40785 extends WebChromeClient.FileChooserParams {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ android.webkit.WebChromeClient.FileChooserParams f12758a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SystemWebChromeClient f12759b;

        /* JADX WARN: Invalid debug info offset */
        public C40785(SystemWebChromeClient systemWebChromeClient, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
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

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.SystemWebChromeClient$6 */
    public class C40796 implements PermissionRequest {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ android.webkit.PermissionRequest f12760a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SystemWebChromeClient f12761b;

        /* JADX WARN: Invalid debug info offset */
        public C40796(SystemWebChromeClient systemWebChromeClient, android.webkit.PermissionRequest permissionRequest) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.PermissionRequest
        public void deny() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.PermissionRequest
        public Uri getOrigin() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.PermissionRequest
        public String[] getResources() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.PermissionRequest
        public void grant(String[] strArr) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.SystemWebChromeClient$7 */
    public class C40807 implements PermissionRequest {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ android.webkit.PermissionRequest f12762a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SystemWebChromeClient f12763b;

        /* JADX WARN: Invalid debug info offset */
        public C40807(SystemWebChromeClient systemWebChromeClient, android.webkit.PermissionRequest permissionRequest) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.PermissionRequest
        public void deny() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.PermissionRequest
        public Uri getOrigin() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.PermissionRequest
        public String[] getResources() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.PermissionRequest
        public void grant(String[] strArr) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.SystemWebChromeClient$a */
    public static class C4081a implements ConsoleMessage {

        /* JADX INFO: renamed from: a */
        private ConsoleMessage.MessageLevel f12764a;

        /* JADX INFO: renamed from: b */
        private String f12765b;

        /* JADX INFO: renamed from: c */
        private String f12766c;

        /* JADX INFO: renamed from: d */
        private int f12767d;

        /* JADX WARN: Invalid debug info offset */
        public C4081a(android.webkit.ConsoleMessage consoleMessage) {
        }

        /* JADX WARN: Invalid debug info offset */
        public C4081a(String str, String str2, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.ConsoleMessage
        public int lineNumber() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.ConsoleMessage
        public String message() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.ConsoleMessage
        public ConsoleMessage.MessageLevel messageLevel() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.ConsoleMessage
        public String sourceId() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.SystemWebChromeClient$b */
    public class C4082b implements IX5WebChromeClient.CustomViewCallback {

        /* JADX INFO: renamed from: a */
        android.webkit.WebChromeClient.CustomViewCallback f12768a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SystemWebChromeClient f12769b;

        /* JADX WARN: Invalid debug info offset */
        public C4082b(SystemWebChromeClient systemWebChromeClient, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient.CustomViewCallback
        public void onCustomViewHidden() {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.SystemWebChromeClient$c */
    public class C4083c implements GeolocationPermissionsCallback {

        /* JADX INFO: renamed from: a */
        android.webkit.GeolocationPermissions.Callback f12770a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SystemWebChromeClient f12771b;

        /* JADX WARN: Invalid debug info offset */
        public C4083c(SystemWebChromeClient systemWebChromeClient, android.webkit.GeolocationPermissions.Callback callback) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback
        public void invoke(String str, boolean z, boolean z2) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.SystemWebChromeClient$d */
    public class C4084d implements JsPromptResult {

        /* JADX INFO: renamed from: a */
        android.webkit.JsPromptResult f12772a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SystemWebChromeClient f12773b;

        /* JADX WARN: Invalid debug info offset */
        public C4084d(SystemWebChromeClient systemWebChromeClient, android.webkit.JsPromptResult jsPromptResult) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.JsResult
        public void cancel() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.JsResult
        public void confirm() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.JsPromptResult
        public void confirm(String str) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.SystemWebChromeClient$e */
    public class C4085e implements JsResult {

        /* JADX INFO: renamed from: a */
        android.webkit.JsResult f12774a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SystemWebChromeClient f12775b;

        /* JADX WARN: Invalid debug info offset */
        public C4085e(SystemWebChromeClient systemWebChromeClient, android.webkit.JsResult jsResult) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.JsResult
        public void cancel() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.JsResult
        public void confirm() {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.SystemWebChromeClient$f */
    public class C4086f implements WebStorage.QuotaUpdater {

        /* JADX INFO: renamed from: a */
        android.webkit.WebStorage.QuotaUpdater f12776a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SystemWebChromeClient f12777b;

        /* JADX WARN: Invalid debug info offset */
        public C4086f(SystemWebChromeClient systemWebChromeClient, android.webkit.WebStorage.QuotaUpdater quotaUpdater) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.WebStorage.QuotaUpdater
        public void updateQuota(long j) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public SystemWebChromeClient(WebView webView, WebChromeClient webChromeClient) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // android.webkit.WebChromeClient
    @android.annotation.TargetApi(7)
    public android.graphics.Bitmap getDefaultVideoPoster() {
        /*
            r3 = this;
            r0 = 0
            return r0
        L1b:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.SystemWebChromeClient.getDefaultVideoPoster():android.graphics.Bitmap");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    @TargetApi(7)
    public View getVideoLoadingProgressView() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    public void getVisitedHistory(android.webkit.ValueCallback<String[]> valueCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(android.webkit.WebView webView) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(android.webkit.WebView webView, boolean z, boolean z2, Message message) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    @TargetApi(5)
    @Deprecated
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, android.webkit.WebStorage.QuotaUpdater quotaUpdater) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    @TargetApi(5)
    public void onGeolocationPermissionsHidePrompt() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    @TargetApi(5)
    public void onGeolocationPermissionsShowPrompt(String str, android.webkit.GeolocationPermissions.Callback callback) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(android.webkit.WebView webView, String str, String str2, android.webkit.JsResult jsResult) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(android.webkit.WebView webView, String str, String str2, android.webkit.JsResult jsResult) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(android.webkit.WebView webView, String str, String str2, android.webkit.JsResult jsResult) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(android.webkit.WebView webView, String str, String str2, String str3, android.webkit.JsPromptResult jsPromptResult) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    @TargetApi(7)
    public boolean onJsTimeout() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(android.webkit.PermissionRequest permissionRequest) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    public void onPermissionRequestCanceled(android.webkit.PermissionRequest permissionRequest) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(android.webkit.WebView webView, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(7)
    @Deprecated
    public void onReachedMaxAppCacheSize(long j, long j2, android.webkit.WebStorage.QuotaUpdater quotaUpdater) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(android.webkit.WebView webView, Bitmap bitmap) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(android.webkit.WebView webView, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    @TargetApi(7)
    public void onReceivedTouchIconUrl(android.webkit.WebView webView, String str, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    public void onRequestFocus(android.webkit.WebView webView) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(android.webkit.WebView webView, android.webkit.ValueCallback<Uri[]> valueCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void openFileChooser(android.webkit.ValueCallback<Uri> valueCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void openFileChooser(android.webkit.ValueCallback<Uri> valueCallback, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void openFileChooser(android.webkit.ValueCallback<Uri> valueCallback, String str, String str2) {
    }

    public void setupAutoFill(Message message) {
    }
}
