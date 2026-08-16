package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.view.View;

/* JADX INFO: renamed from: com.tencent.smtt.sdk.c */
/* JADX INFO: loaded from: classes2.dex */
class C4119c extends SystemWebChromeClient {
    /* JADX WARN: Invalid debug info offset */
    public C4119c(WebView webView, WebChromeClient webChromeClient) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    @TargetApi(7)
    public void onHideCustomView() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    @TargetApi(14)
    @Deprecated
    public void onShowCustomView(View view, int i, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.webkit.WebChromeClient
    @TargetApi(7)
    public void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
    }
}
