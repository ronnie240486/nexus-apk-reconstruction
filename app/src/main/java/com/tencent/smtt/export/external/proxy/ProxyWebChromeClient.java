package com.tencent.smtt.export.external.proxy;

import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.webkit.ValueCallback;
import com.tencent.smtt.export.external.interfaces.ConsoleMessage;
import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.JsPromptResult;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.export.external.interfaces.QuotaUpdater;

/* JADX INFO: loaded from: classes2.dex */
public class ProxyWebChromeClient implements IX5WebChromeClient {
    protected IX5WebChromeClient mWebChromeClient;

    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    public IX5WebChromeClient getmWebChromeClient() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onCloseWindow(IX5WebViewBase iX5WebViewBase) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onConsoleMessage(String str, int i, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onCreateWindow(IX5WebViewBase iX5WebViewBase, boolean z, boolean z2, Message message) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissionsCallback geolocationPermissionsCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onGeolocationStartUpdating(ValueCallback<Location> valueCallback, ValueCallback<Bundle> valueCallback2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onGeolocationStopUpdating() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onHideCustomView() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onJsAlert(IX5WebViewBase iX5WebViewBase, String str, String str2, JsResult jsResult) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onJsBeforeUnload(IX5WebViewBase iX5WebViewBase, String str, String str2, JsResult jsResult) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onJsConfirm(IX5WebViewBase iX5WebViewBase, String str, String str2, JsResult jsResult) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onJsPrompt(IX5WebViewBase iX5WebViewBase, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onJsTimeout() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onProgressChanged(IX5WebViewBase iX5WebViewBase, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onReachedMaxAppCacheSize(long j, long j2, QuotaUpdater quotaUpdater) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onReceivedIcon(IX5WebViewBase iX5WebViewBase, Bitmap bitmap) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onReceivedTitle(IX5WebViewBase iX5WebViewBase, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onReceivedTouchIconUrl(IX5WebViewBase iX5WebViewBase, String str, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onRequestFocus(IX5WebViewBase iX5WebViewBase) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onShowCustomView(View view, int i, IX5WebChromeClient.CustomViewCallback customViewCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onShowCustomView(View view, IX5WebChromeClient.CustomViewCallback customViewCallback) {
    }

    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onShowFileChooser(IX5WebViewBase iX5WebViewBase, ValueCallback<Uri[]> valueCallback, IX5WebChromeClient.FileChooserParams fileChooserParams) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void openFileChooser(ValueCallback<Uri[]> valueCallback, String str, String str2, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setWebChromeClient(IX5WebChromeClient iX5WebChromeClient) {
    }
}
