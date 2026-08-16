package com.tencent.smtt.sdk;

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
import com.tencent.smtt.export.external.proxy.X5ProxyWebViewClient;

/* JADX INFO: renamed from: com.tencent.smtt.sdk.i */
/* JADX INFO: loaded from: classes2.dex */
class C4125i extends X5ProxyWebViewClient {

    /* JADX INFO: renamed from: c */
    private static String f13050c;

    /* JADX INFO: renamed from: a */
    private WebViewClient f13051a;

    /* JADX INFO: renamed from: b */
    private WebView f13052b;

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.i$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C4125i f13053a;

        /* JADX WARN: Invalid debug info offset */
        public AnonymousClass1(C4125i c4125i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.i$2, reason: invalid class name */
    public class AnonymousClass2 implements WebViewClient.RenderProcessGoneDetail {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f13054a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f13055b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C4125i f13056c;

        /* JADX WARN: Invalid debug info offset */
        public AnonymousClass2(C4125i c4125i, boolean z, int i) {
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

    /* JADX WARN: Invalid debug info offset */
    public C4125i(IX5WebViewClient iX5WebViewClient, WebView webView, WebViewClient webViewClient) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ WebView m19061a(C4125i c4125i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m19062a(WebView webView, String str, Bitmap bitmap) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0010
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public void m19063a(java.lang.String r3) {
        /*
            r2 = this;
            return
        L22:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4125i.m19063a(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient
    public void countPVContentCacheCallBack(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void doUpdateVisitedHistory(IX5WebViewBase iX5WebViewBase, String str, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onDetectedBlankScreen(IX5WebViewBase iX5WebViewBase, String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onFormResubmission(IX5WebViewBase iX5WebViewBase, Message message, Message message2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onLoadResource(IX5WebViewBase iX5WebViewBase, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageCommitVisible(IX5WebViewBase iX5WebViewBase, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0037
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageFinished(com.tencent.smtt.export.external.interfaces.IX5WebViewBase r4, int r5, int r6, java.lang.String r7) {
        /*
            r3 = this;
            return
        L3b:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4125i.onPageFinished(com.tencent.smtt.export.external.interfaces.IX5WebViewBase, int, int, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageFinished(IX5WebViewBase iX5WebViewBase, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageStarted(IX5WebViewBase iX5WebViewBase, int i, int i2, String str, Bitmap bitmap) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageStarted(IX5WebViewBase iX5WebViewBase, String str, Bitmap bitmap) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedClientCertRequest(IX5WebViewBase iX5WebViewBase, ClientCertRequest clientCertRequest) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedError(IX5WebViewBase iX5WebViewBase, int i, String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedError(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedHttpAuthRequest(IX5WebViewBase iX5WebViewBase, HttpAuthHandler httpAuthHandler, String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedHttpError(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedLoginRequest(IX5WebViewBase iX5WebViewBase, String str, String str2, String str3) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedSslError(IX5WebViewBase iX5WebViewBase, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public boolean onRenderProcessGone(IX5WebViewBase iX5WebViewBase, boolean z, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onScaleChanged(IX5WebViewBase iX5WebViewBase, float f, float f2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onTooManyRedirects(IX5WebViewBase iX5WebViewBase, Message message, Message message2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onUnhandledKeyEvent(IX5WebViewBase iX5WebViewBase, KeyEvent keyEvent) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public WebResourceResponse shouldInterceptRequest(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public WebResourceResponse shouldInterceptRequest(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest, Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public WebResourceResponse shouldInterceptRequest(IX5WebViewBase iX5WebViewBase, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public boolean shouldOverrideKeyEvent(IX5WebViewBase iX5WebViewBase, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public boolean shouldOverrideUrlLoading(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public boolean shouldOverrideUrlLoading(IX5WebViewBase iX5WebViewBase, String str) {
        return false;
    }
}
