package com.tencent.smtt.sdk;

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
public class WebChromeClient {

    public static abstract class FileChooserParams {
        public static final int MODE_OPEN = 0;
        public static final int MODE_OPEN_FOLDER = 2;
        public static final int MODE_OPEN_MULTIPLE = 1;
        public static final int MODE_SAVE = 3;

        /* JADX WARN: Invalid debug info offset */
        public static Uri[] parseResult(int i, Intent intent) {
            return null;
        }

        public abstract Intent createIntent();

        public abstract String[] getAcceptTypes();

        public abstract String getFilenameHint();

        public abstract int getMode();

        public abstract CharSequence getTitle();

        public abstract boolean isCaptureEnabled();
    }

    public Bitmap getDefaultVideoPoster() {
        return null;
    }

    public View getVideoLoadingProgressView() {
        return null;
    }

    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
    }

    public void onCloseWindow(WebView webView) {
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return false;
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
    }

    public void onGeolocationPermissionsHidePrompt() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissionsCallback geolocationPermissionsCallback) {
    }

    public void onHideCustomView() {
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return false;
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return false;
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return false;
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return false;
    }

    @Deprecated
    public boolean onJsTimeout() {
        return true;
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
    }

    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
    }

    public void onProgressChanged(WebView webView, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
    }

    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
    }

    public void onReceivedTitle(WebView webView, String str) {
    }

    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
    }

    public void onRequestFocus(WebView webView) {
    }

    @Deprecated
    public void onShowCustomView(View view, int i, IX5WebChromeClient.CustomViewCallback customViewCallback) {
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, FileChooserParams fileChooserParams) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
    }

    public void onShowCustomView(View view, IX5WebChromeClient.CustomViewCallback customViewCallback) {
    }
}
