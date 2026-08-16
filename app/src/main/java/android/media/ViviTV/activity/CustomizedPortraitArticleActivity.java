package android.media.ViviTV.activity;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.ViviTV.databinding.ActivityCustomizedArticleBinding;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p000.DialogC1413Vv;

/* JADX INFO: loaded from: classes4.dex */
public class CustomizedPortraitArticleActivity extends BaseActivity {

    /* JADX INFO: renamed from: x */
    public static final String f4832x = "pageId";

    /* JADX INFO: renamed from: y */
    public static final String f4833y = "result";

    /* JADX INFO: renamed from: u */
    public ActivityCustomizedArticleBinding f4834u;

    /* JADX INFO: renamed from: v */
    public DialogC1413Vv f4835v;

    /* JADX INFO: renamed from: w */
    public View.OnClickListener f4836w;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.CustomizedPortraitArticleActivity$a */
    public class C1776a extends WebViewClient {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CustomizedPortraitArticleActivity f4837a;

        /* JADX WARN: Invalid debug info offset */
        public C1776a(CustomizedPortraitArticleActivity customizedPortraitArticleActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.CustomizedPortraitArticleActivity$b */
    public class ViewOnClickListenerC1777b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CustomizedPortraitArticleActivity f4838a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC1777b(CustomizedPortraitArticleActivity customizedPortraitArticleActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ DialogC1413Vv m9610P0(CustomizedPortraitArticleActivity customizedPortraitArticleActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ DialogC1413Vv m9611Q0(CustomizedPortraitArticleActivity customizedPortraitArticleActivity, DialogC1413Vv dialogC1413Vv) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    private void m9612R0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static void m9613T0(Context context, String str, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public final void m9614S0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }
}
