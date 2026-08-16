package com.example.x5web;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;
import com.tencent.smtt.export.external.interfaces.JsPromptResult;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.export.external.interfaces.SslError;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;
import com.tencent.smtt.sdk.ValueCallback;
import com.tencent.smtt.sdk.WebChromeClient;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;
import p000.V30;

/* JADX INFO: loaded from: classes.dex */
public class BaseWebViewActivity extends Activity {

    /* JADX INFO: renamed from: g */
    public static final int f10910g = 100;

    /* JADX INFO: renamed from: a */
    public String f10911a;

    /* JADX INFO: renamed from: b */
    public WebView f10912b;

    /* JADX INFO: renamed from: c */
    public ValueCallback<Uri[]> f10913c;

    /* JADX INFO: renamed from: d */
    public ImageView f10914d;

    /* JADX INFO: renamed from: e */
    public TextView f10915e;

    /* JADX INFO: renamed from: f */
    public View f10916f;

    /* JADX INFO: renamed from: com.example.x5web.BaseWebViewActivity$a */
    public class ViewOnClickListenerC3149a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseWebViewActivity f10917a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC3149a(BaseWebViewActivity baseWebViewActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.example.x5web.BaseWebViewActivity$b */
    public class C3150b extends WebViewClient {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseWebViewActivity f10918a;

        /* JADX WARN: Invalid debug info offset */
        public C3150b(BaseWebViewActivity baseWebViewActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.WebViewClient
        public void onPageFinished(WebView webView, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0017
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // com.tencent.smtt.sdk.WebViewClient
        public com.tencent.smtt.export.external.interfaces.WebResourceResponse shouldInterceptRequest(com.tencent.smtt.sdk.WebView r3, com.tencent.smtt.export.external.interfaces.WebResourceRequest r4) {
            /*
                r2 = this;
                r0 = 0
                return r0
            L24:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.x5web.BaseWebViewActivity.C3150b.shouldInterceptRequest(com.tencent.smtt.sdk.WebView, com.tencent.smtt.export.external.interfaces.WebResourceRequest):com.tencent.smtt.export.external.interfaces.WebResourceResponse");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.example.x5web.BaseWebViewActivity$c */
    public class C3151c extends WebChromeClient {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f10919a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseWebViewActivity f10920b;

        /* JADX WARN: Invalid debug info offset */
        public C3151c(BaseWebViewActivity baseWebViewActivity, Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m17256a(JsPromptResult jsPromptResult, EditText editText, DialogInterface dialogInterface, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m17257b(JsResult jsResult, DialogInterface dialogInterface, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m17258c(JsResult jsResult, DialogInterface dialogInterface, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m17259d(JsResult jsResult, DialogInterface dialogInterface, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m17260e(JsResult jsResult, DialogInterface dialogInterface, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m17261f(JsResult jsResult, DialogInterface dialogInterface, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m17262g(JsResult jsResult, DialogInterface dialogInterface, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m17263h(JsResult jsResult, DialogInterface dialogInterface, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: i */
        public static /* synthetic */ void m17264i(JsResult jsResult, DialogInterface dialogInterface, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: j */
        public static /* synthetic */ void m17265j(JsResult jsResult, DialogInterface dialogInterface, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public static /* synthetic */ void m17266k(JsResult jsResult, DialogInterface dialogInterface, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: l */
        public static /* synthetic */ void m17267l(JsPromptResult jsPromptResult, EditText editText, DialogInterface dialogInterface, int i) {
        }

        @Override // com.tencent.smtt.sdk.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissionsCallback geolocationPermissionsCallback) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.WebChromeClient
        public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.example.x5web.BaseWebViewActivity$d */
    public class C3152d implements V30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseWebViewActivity f10921a;

        /* JADX WARN: Invalid debug info offset */
        public C3152d(BaseWebViewActivity baseWebViewActivity) {
        }

        @Override // p000.V30
        /* JADX INFO: renamed from: a */
        public void mo6439a(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @JavascriptInterface
        /* JADX INFO: renamed from: b */
        public void m17268b() {
        }

        @JavascriptInterface
        /* JADX INFO: renamed from: c */
        public void m17269c() {
        }

        @JavascriptInterface
        /* JADX INFO: renamed from: d */
        public void m17270d() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m17246a(BaseWebViewActivity baseWebViewActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ValueCallback m17247b(BaseWebViewActivity baseWebViewActivity, ValueCallback valueCallback) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m17248c(BaseWebViewActivity baseWebViewActivity, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final void m17249d() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public final void m17250e() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public void mo17251f() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public final void m17252g() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final void m17253h(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public void m17254i(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public void m17255j(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Activity
    public void onDestroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }
}
