package com.tencent.smtt.export.external.proxy;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import com.tencent.smtt.export.external.interfaces.ClientCertRequest;
import com.tencent.smtt.export.external.interfaces.HttpAuthHandler;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.IX5WebViewClient;
import com.tencent.smtt.export.external.interfaces.SslError;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;
import com.tencent.smtt.export.external.interfaces.WebResourceError;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ProxyWebViewClient implements IX5WebViewClient {
    private boolean mCompatibleOnPageStartedOrFinishedMethod;
    protected IX5WebViewClient mWebViewClient;

    public void countPVContentCacheCallBack(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void doUpdateVisitedHistory(IX5WebViewBase iX5WebViewBase, String str, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onContentSizeChanged(IX5WebViewBase iX5WebViewBase, int i, int i2) {
    }

    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onDetectedBlankScreen(IX5WebViewBase iX5WebViewBase, String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onFormResubmission(IX5WebViewBase iX5WebViewBase, Message message, Message message2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onLoadResource(IX5WebViewBase iX5WebViewBase, String str) {
    }

    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageCommitVisible(IX5WebViewBase iX5WebViewBase, String str) {
    }

    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageFinished(IX5WebViewBase iX5WebViewBase, int i, int i2, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageFinished(IX5WebViewBase iX5WebViewBase, String str) {
    }

    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageStarted(IX5WebViewBase iX5WebViewBase, int i, int i2, String str, Bitmap bitmap) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageStarted(IX5WebViewBase iX5WebViewBase, String str, Bitmap bitmap) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedClientCertRequest(IX5WebViewBase iX5WebViewBase, ClientCertRequest clientCertRequest) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedError(IX5WebViewBase iX5WebViewBase, int i, String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedError(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedHttpAuthRequest(IX5WebViewBase iX5WebViewBase, HttpAuthHandler httpAuthHandler, String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedHttpError(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedLoginRequest(IX5WebViewBase iX5WebViewBase, String str, String str2, String str3) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedSslError(IX5WebViewBase iX5WebViewBase, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onScaleChanged(IX5WebViewBase iX5WebViewBase, float f, float f2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onTooManyRedirects(IX5WebViewBase iX5WebViewBase, Message message, Message message2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onUnhandledKeyEvent(IX5WebViewBase iX5WebViewBase, KeyEvent keyEvent) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setWebViewClient(IX5WebViewClient iX5WebViewClient) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public WebResourceResponse shouldInterceptRequest(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public WebResourceResponse shouldInterceptRequest(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest, Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public WebResourceResponse shouldInterceptRequest(IX5WebViewBase iX5WebViewBase, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public boolean shouldOverrideKeyEvent(IX5WebViewBase iX5WebViewBase, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public boolean shouldOverrideUrlLoading(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public boolean shouldOverrideUrlLoading(IX5WebViewBase iX5WebViewBase, String str) {
        return false;
    }
}
