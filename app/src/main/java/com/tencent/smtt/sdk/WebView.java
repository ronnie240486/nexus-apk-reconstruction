package com.tencent.smtt.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebSettingsExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewExtension;
import com.tencent.smtt.export.external.extension.proxy.X5ProxyWebViewClientExtension;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import java.io.BufferedWriter;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class WebView extends FrameLayout implements View.OnLongClickListener {
    public static int NIGHT_MODE_ALPHA = 153;
    public static final int NIGHT_MODE_COLOR = -16777216;
    public static final int NORMAL_MODE_ALPHA = 255;
    public static final String SCHEME_GEO = "geo:0,0?q=";
    public static final String SCHEME_MAILTO = "mailto:";
    public static final String SCHEME_TEL = "tel:";

    /* JADX INFO: renamed from: i */
    private static Context f12935i = null;

    /* JADX INFO: renamed from: l */
    private static Method f12936l = null;
    public static boolean mSysWebviewCreated = false;
    public static boolean mWebViewCreated = false;

    /* JADX INFO: renamed from: o */
    private static String f12937o = null;

    /* JADX INFO: renamed from: u */
    private static Paint f12938u = null;

    /* JADX INFO: renamed from: v */
    private static boolean f12939v = true;

    /* JADX INFO: renamed from: a */
    volatile int f12940a;

    /* JADX INFO: renamed from: b */
    private final String f12941b;

    /* JADX INFO: renamed from: c */
    private boolean f12942c;

    /* JADX INFO: renamed from: d */
    private IX5WebViewBase f12943d;

    /* JADX INFO: renamed from: e */
    private C4114a f12944e;

    /* JADX INFO: renamed from: f */
    private WebSettings f12945f;

    /* JADX INFO: renamed from: g */
    private Context f12946g;

    /* JADX INFO: renamed from: h */
    private TbsWebViewPerformanceRecorder f12947h;

    /* JADX INFO: renamed from: j */
    private volatile boolean f12948j;

    /* JADX INFO: renamed from: k */
    private boolean f12949k;

    /* JADX INFO: renamed from: m */
    private WebViewClient f12950m;
    public WebViewCallbackClient mWebViewCallbackClient;

    /* JADX INFO: renamed from: n */
    private WebChromeClient f12951n;

    /* JADX INFO: renamed from: p */
    private final int f12952p;

    /* JADX INFO: renamed from: q */
    private final int f12953q;

    /* JADX INFO: renamed from: r */
    private final int f12954r;

    /* JADX INFO: renamed from: s */
    private final String f12955s;

    /* JADX INFO: renamed from: t */
    private final String f12956t;

    /* JADX INFO: renamed from: w */
    private Object f12957w;

    /* JADX INFO: renamed from: x */
    private View.OnLongClickListener f12958x;

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.WebView$1 */
    public class C41061 extends X5ProxyWebViewClientExtension {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebView f12959a;

        /* JADX WARN: Invalid debug info offset */
        public C41061(WebView webView, IX5WebViewClientExtension iX5WebViewClientExtension) {
        }

        @Override // com.tencent.smtt.export.external.extension.proxy.ProxyWebViewClientExtension, com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
        public void invalidate() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.extension.proxy.ProxyWebViewClientExtension, com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
        public void onScrollChanged(int i, int i2, int i3, int i4) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.WebView$2 */
    public class C41072 extends Thread {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebView f12960a;

        /* JADX WARN: Invalid debug info offset */
        public C41072(WebView webView, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.WebView$3 */
    public class C41083 implements android.webkit.WebView.FindListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ IX5WebViewBase.FindListener f12961a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ WebView f12962b;

        /* JADX WARN: Invalid debug info offset */
        public C41083(WebView webView, IX5WebViewBase.FindListener findListener) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.webkit.WebView.FindListener
        public void onFindResultReceived(int i, int i2, boolean z) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.WebView$4 */
    public class C41094 implements android.webkit.DownloadListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ DownloadListener f12963a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ WebView f12964b;

        /* JADX WARN: Invalid debug info offset */
        public C41094(WebView webView, DownloadListener downloadListener) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.WebView$5 */
    public class C41105 implements android.webkit.WebView.PictureListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ PictureListener f12965a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ WebView f12966b;

        /* JADX WARN: Invalid debug info offset */
        public C41105(WebView webView, PictureListener pictureListener) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.webkit.WebView.PictureListener
        public void onNewPicture(android.webkit.WebView webView, Picture picture) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.WebView$6 */
    public class C41116 implements IX5WebViewBase.PictureListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ PictureListener f12967a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ WebView f12968b;

        /* JADX WARN: Invalid debug info offset */
        public C41116(WebView webView, PictureListener pictureListener) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewBase.PictureListener
        public void onNewPicture(IX5WebViewBase iX5WebViewBase, Picture picture, boolean z) {
        }

        @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewBase.PictureListener
        public void onNewPictureIfHaveContent(IX5WebViewBase iX5WebViewBase, Picture picture) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.WebView$7 */
    public class RunnableC41127 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebView f12969a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC41127(WebView webView) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0013
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.lang.Runnable
        public void run() {
            /*
                r12 = this;
                return
            L5d:
            L70:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.RunnableC41127.run():void");
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.WebView$8 */
    public static class RunnableC41138 implements Runnable {
        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static class HitTestResult {

        @Deprecated
        public static final int ANCHOR_TYPE = 1;
        public static final int EDIT_TEXT_TYPE = 9;
        public static final int EMAIL_TYPE = 4;
        public static final int GEO_TYPE = 3;

        @Deprecated
        public static final int IMAGE_ANCHOR_TYPE = 6;
        public static final int IMAGE_TYPE = 5;
        public static final int PHONE_TYPE = 2;
        public static final int SRC_ANCHOR_TYPE = 7;
        public static final int SRC_IMAGE_ANCHOR_TYPE = 8;
        public static final int UNKNOWN_TYPE = 0;

        /* JADX INFO: renamed from: a */
        private IX5WebViewBase.HitTestResult f12970a;

        /* JADX INFO: renamed from: b */
        private android.webkit.WebView.HitTestResult f12971b;

        /* JADX WARN: Invalid debug info offset */
        public HitTestResult() {
        }

        /* JADX WARN: Invalid debug info offset */
        public HitTestResult(android.webkit.WebView.HitTestResult hitTestResult) {
        }

        /* JADX WARN: Invalid debug info offset */
        public HitTestResult(IX5WebViewBase.HitTestResult hitTestResult) {
        }

        /* JADX WARN: Invalid debug info offset */
        public String getExtra() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public int getType() {
            return 0;
        }
    }

    @Deprecated
    public interface PictureListener {
        @Deprecated
        void onNewPicture(WebView webView, Picture picture);
    }

    public class WebViewTransport {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebView f12972a;

        /* JADX INFO: renamed from: b */
        private WebView f12973b;

        /* JADX WARN: Invalid debug info offset */
        public WebViewTransport(WebView webView) {
        }

        /* JADX WARN: Invalid debug info offset */
        public synchronized WebView getWebView() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        public synchronized void setWebView(com.tencent.smtt.sdk.WebView r1) {
            /*
                r0 = this;
                return
            L5:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.WebViewTransport.setWebView(com.tencent.smtt.sdk.WebView):void");
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.WebView$a */
    public class C4114a extends android.webkit.WebView {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebView f12974a;

        /* JADX WARN: Invalid debug info offset */
        public C4114a(WebView webView, Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0024
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        public C4114a(com.tencent.smtt.sdk.WebView r2, android.content.Context r3, android.util.AttributeSet r4) {
            /*
                r1 = this;
                return
            L4a:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.C4114a.<init>(com.tencent.smtt.sdk.WebView, android.content.Context, android.util.AttributeSet):void");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m19003a() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m19004a(int i, int i2, int i3, int i4) {
        }

        /* JADX WARN: Invalid debug info offset */
        @TargetApi(9)
        /* JADX INFO: renamed from: a */
        public void m19005a(int i, int i2, boolean z, boolean z2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @TargetApi(9)
        /* JADX INFO: renamed from: a */
        public boolean m19006a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public boolean m19007a(MotionEvent motionEvent) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public boolean m19008b(MotionEvent motionEvent) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public boolean m19009c(MotionEvent motionEvent) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.webkit.WebView, android.view.View
        public void computeScroll() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.webkit.WebView
        public android.webkit.WebSettings getSettings() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View
        public void invalidate() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.webkit.WebView, android.view.View
        @TargetApi(9)
        public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.webkit.WebView, android.view.View
        public void onScrollChanged(int i, int i2, int i3, int i4) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0014
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // android.webkit.WebView, android.view.View
        @android.annotation.SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(android.view.MotionEvent r2) {
            /*
                r1 = this;
                r0 = 0
                return r0
            L19:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.C4114a.onTouchEvent(android.view.MotionEvent):boolean");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View
        @TargetApi(9)
        public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.webkit.WebView, android.view.View
        public void setOverScrollMode(int i) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public WebView(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public WebView(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public WebView(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0063
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @android.annotation.TargetApi(11)
    public WebView(android.content.Context r10, android.util.AttributeSet r11, int r12, java.util.Map<java.lang.String, java.lang.Object> r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.<init>(android.content.Context, android.util.AttributeSet, int, java.util.Map, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public WebView(Context context, AttributeSet attributeSet, int i, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public WebView(Context context, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Context m18974a(WebView webView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Context m18975a(WebView webView, Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    private void m18976a(android.util.AttributeSet r7) {
        /*
            r6 = this;
            return
        L3e:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.m18976a(android.util.AttributeSet):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18977a(WebView webView, int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18978a(WebView webView, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0014
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    private void m18979a(boolean r9) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.m18979a(boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private boolean m18980a(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private boolean m18981a(View view) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0015
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    private boolean m18982a(com.tencent.smtt.sdk.WebChromeClient r8) {
        /*
            r7 = this;
            r0 = 0
            return r0
        L27:
        L31:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.m18982a(com.tencent.smtt.sdk.WebChromeClient):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    private void m18983b(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m18984b(WebView webView, int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m18985b(WebView webView) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m18986b(WebView webView, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    private Context m18987c(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: c */
    public static void m18988c() {
        /*
            return
        Le:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.m18988c():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m18989c(WebView webView) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ IX5WebViewBase m18990d(WebView webView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m18991d() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static void disablePlatformNotifications() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ long m18992e(WebView webView) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Paint m18993e() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static void enablePlatformNotifications() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Context m18994f() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static String findAddress(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0016
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: g */
    private void m18995g() {
        /*
            r5 = this;
            return
        L67:
        L6f:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.m18995g():void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getCrashExtraCacheInfo(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getCrashExtraMessage(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0012
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static android.content.pm.PackageInfo getCurrentWebViewPackage() {
        /*
            r0 = 0
            return r0
        L1d:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.getCurrentWebViewPackage():android.content.pm.PackageInfo");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @java.lang.Deprecated
    public static synchronized java.lang.Object getPluginList() {
        /*
            r0 = 0
            return r0
        L17:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.getPluginList():java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    public static int getTbsCoreVersion(Context context) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean getTbsNeedReboot() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static int getTbsSDKVersion(Context context) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: h */
    private void m18996h() {
        /*
            r3 = this;
            return
        L2f:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.m18996h():void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean hasCreatedSysWebViewInstance() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: i */
    private long m18997i() {
        /*
            r8 = this;
            r0 = 0
            return r0
        L29:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.m18997i():long");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    private void m18998j() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void setDataDirectorySuffix(java.lang.String r6) {
        /*
            return
        L1e:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.setDataDirectorySuffix(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static synchronized void setSysDayOrNight(boolean r3) {
        /*
            return
        L1c:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.setSysDayOrNight(boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0016
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void setWebContentsDebuggingEnabled(boolean r5) {
        /*
            return
        L3e:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.setWebContentsDebuggingEnabled(boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public android.webkit.WebView m18999a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m19001a(IX5WebViewBase iX5WebViewBase) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addJavascriptInterface(Object obj, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0012
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // android.view.ViewGroup
    public void addView(android.view.View r7) {
        /*
            r6 = this;
            return
        L28:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.addView(android.view.View):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public IX5WebViewBase m19002b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean canGoBack() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean canGoBackOrForward(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean canGoForward() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public boolean canZoomIn() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public boolean canZoomOut() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public Picture capturePicture() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void clearCache(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void clearFormData() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void clearHistory() {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(3)
    public void clearMatches() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void clearSslPreferences() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void clearView() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void computeScroll() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View
    public int computeVerticalScrollRange() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public WebBackForwardList copyBackForwardList() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public java.lang.Object createPrintDocumentAdapter(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            return r0
        Le:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.createPrintDocumentAdapter(java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    public void customDiskCachePathEnabled(boolean z, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void destroy() {
        /*
            r5 = this;
            return
        L24:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.destroy():void");
    }

    /* JADX WARN: Invalid debug info offset */
    public void documentHasImages(Message message) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void dumpViewHierarchyWithProperties(BufferedWriter bufferedWriter, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void evaluateJavascript(java.lang.String r9, com.tencent.smtt.sdk.ValueCallback<java.lang.String> r10) {
        /*
            r8 = this;
            return
        L30:
        L57:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.evaluateJavascript(java.lang.String, com.tencent.smtt.sdk.ValueCallback):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public int findAll(String str) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(16)
    public void findAllAsync(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public View findHierarchyView(String str, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(3)
    public void findNext(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void flingScroll(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void freeMemory() {
    }

    /* JADX WARN: Invalid debug info offset */
    public SslCertificate getCertificate() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getContentHeight() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getContentWidth() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public Bitmap getFavicon() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public HitTestResult getHitTestResult() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String[] getHttpAuthUsernamePassword(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean getIsX5Core() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(3)
    public String getOriginalUrl() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public TbsWebViewPerformanceRecorder getPerformanceRecorder() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getProgress() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean getRendererPriorityWaivedWhenNotVisible() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getRendererRequestedPriority() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public float getScale() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public int getScrollBarDefaultDelayBeforeFade() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public int getScrollBarFadeDuration() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public int getScrollBarSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public int getScrollBarStyle() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public WebSettings getSettings() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public IX5WebSettingsExtension getSettingsExtension() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getSysNightModeAlpha() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getTitle() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getUrl() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public View getView() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getVisibleTitleHeight() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public WebChromeClient getWebChromeClient() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public IX5WebChromeClientExtension getWebChromeClientExtension() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getWebScrollX() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getWebScrollY() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public WebViewClient getWebViewClient() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public IX5WebViewClientExtension getWebViewClientExtension() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public IX5WebViewBase.HitTestResult getX5HitTestResult() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public IX5WebViewExtension getX5WebViewExtension() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public View getZoomControls() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void goBack() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void goBackOrForward(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void goForward() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void invokeZoomPicker() {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isDayMode() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isPrivateBrowsingEnabled() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void loadData(String str, String str2, String str3) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void loadUrl(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(8)
    public void loadUrl(String str, Map<String, String> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void onPause() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void onResume() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    @TargetApi(11)
    public void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean overlayHorizontalScrollbar() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean overlayVerticalScrollbar() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean pageDown(boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean pageUp(boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void pauseTimers() {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(5)
    public void postUrl(String str, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void refreshPlugins(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void reload() {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(11)
    public void removeJavascriptInterface(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0012
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View r7) {
        /*
            r6 = this;
            return
        L28:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.removeView(android.view.View):void");
    }

    @Deprecated
    public JSONObject reportInitPerformance(long j, int i, long j2, long j3) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void requestFocusNodeHref(Message message) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void requestImageRef(Message message) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public boolean restorePicture(Bundle bundle, File file) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public WebBackForwardList restoreState(Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void resumeTimers() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void savePassword(String str, String str2, String str3) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public boolean savePicture(Bundle bundle, File file) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public WebBackForwardList saveState(Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(11)
    public void saveWebArchive(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(11)
    public void saveWebArchive(String str, boolean z, ValueCallback<String> valueCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setARModeEnable(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void setCertificate(SslCertificate sslCertificate) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDayOrNight(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDownloadListener(DownloadListener downloadListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(16)
    public void setFindListener(IX5WebViewBase.FindListener findListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setHorizontalScrollbarOverlay(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setInitialScale(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void setMapTrackballToArrowKeys(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setNetworkAvailable(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0010
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // android.view.View
    public void setOnLongClickListener(android.view.View.OnLongClickListener r5) {
        /*
            r4 = this;
            return
        L42:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.setOnLongClickListener(android.view.View$OnLongClickListener):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void setPictureListener(PictureListener pictureListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void setRendererPriorityPolicy(int r8, boolean r9) {
        /*
            r7 = this;
            return
        L2e:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.setRendererPriorityPolicy(int, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void setScrollBarStyle(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSysNightModeAlpha(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setVerticalScrollbarOverlay(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean setVideoFullScreen(Context context, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void setVisibility(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setWebChromeClient(WebChromeClient webChromeClient) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setWebChromeClientExtension(IX5WebChromeClientExtension iX5WebChromeClientExtension) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setWebViewCallbackClient(WebViewCallbackClient webViewCallbackClient) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setWebViewClient(WebViewClient webViewClient) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setWebViewClientExtension(IX5WebViewClientExtension iX5WebViewClientExtension) {
    }

    /* JADX WARN: Invalid debug info offset */
    @SuppressLint({"NewApi"})
    public boolean showDebugView(String str) {
        return false;
    }

    public boolean showFindDialog(String str, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void stopLoading() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0010
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void super_computeScroll() {
        /*
            r2 = this;
            return
        L16:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.super_computeScroll():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0013
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public boolean super_dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r0 = 0
            return r0
        L2c:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.super_dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0013
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public boolean super_onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r0 = 0
            return r0
        L2c:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.super_onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0015
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void super_onOverScrolled(int r10, int r11, boolean r12, boolean r13) {
        /*
            r9 = this;
            return
        L43:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.super_onOverScrolled(int, int, boolean, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0015
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void super_onScrollChanged(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            return
        L41:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.super_onScrollChanged(int, int, int, int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0013
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public boolean super_onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r0 = 0
            return r0
        L2c:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.super_onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0031
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public boolean super_overScrollBy(int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, boolean r32) {
        /*
            r23 = this;
            r0 = 0
            return r0
        L90:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebView.super_overScrollBy(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    public void switchNightMode(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void switchToNightMode() {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean zoomIn() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean zoomOut() {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m19000a(android.webkit.WebView webView) {
    }
}
