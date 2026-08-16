package com.tencent.smtt.export.external.extension.proxy;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ValueCallback;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewExtension;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ProxyWebViewClientExtension implements IX5WebViewClientExtension {
    private static boolean sCompatibleOnMetricsSavedCountReceived = true;
    private static boolean sCompatibleOnPageLoadingStartedAndFinished = true;
    protected IX5WebViewClientExtension mWebViewClientExt;

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public boolean allowJavaScriptOpenWindowAutomatically(String str, String str2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void computeScroll(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void didFirstVisuallyNonEmptyPaint() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public boolean dispatchTouchEvent(MotionEvent motionEvent, View view) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void documentAvailableInMainFrame() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public int getHostByName(java.lang.String r3, java.util.List<java.lang.String> r4) {
        /*
            r2 = this;
            r0 = 0
            return r0
        La:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.export.external.extension.proxy.ProxyWebViewClientExtension.getHostByName(java.lang.String, java.util.List):int");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void handlePluginTag(String str, String str2, boolean z, String str3) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void hideAddressBar() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void invalidate() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public boolean notifyAutoAudioPlay(java.lang.String r2, com.tencent.smtt.export.external.interfaces.JsResult r3) {
        /*
            r1 = this;
            r0 = 0
            return r0
        L9:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.export.external.extension.proxy.ProxyWebViewClientExtension.notifyAutoAudioPlay(java.lang.String, com.tencent.smtt.export.external.interfaces.JsResult):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public boolean notifyJavaScriptOpenWindowsBlocked(String str, String[] strArr, ValueCallback<Boolean> valueCallback, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onCreateInputConnectionSetEditInfo(android.view.inputmethod.EditorInfo r2) {
        /*
            r1 = this;
            return
        L7:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.export.external.extension.proxy.ProxyWebViewClientExtension.onCreateInputConnectionSetEditInfo(android.view.inputmethod.EditorInfo):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onDoubleTapStart() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onFakeLoginRecognised(Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onFlingScrollBegin(int i, int i2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onFlingScrollEnd() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onHideListBox() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onHistoryItemChanged() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onInputBoxTextChanged(IX5WebViewExtension iX5WebViewExtension, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, View view) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onMetricsSavedCountReceived(java.lang.String r8, boolean r9, long r10, java.lang.String r12, int r13) {
        /*
            r7 = this;
            return
        L11:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.export.external.extension.proxy.ProxyWebViewClientExtension.onMetricsSavedCountReceived(java.lang.String, boolean, long, java.lang.String, int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public Object onMiscCallBack(String str, Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public Object onMiscCallBack(String str, Bundle bundle, Object obj, Object obj2, Object obj3, Object obj4) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onMissingPluginClicked(String str, String str2, String str3, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onNativeCrashReport(int i, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onOverScrolled(int i, int i2, boolean z, boolean z2, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onPinchToZoomStart() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onPreReadFinished() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onPrefetchResourceHit(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onPreloadCallback(int i, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onPromptScaleSaved() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onReceivedSslErrorCancel() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onReceivedViewSource(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onReportAdFilterInfo(int i, int i2, String str, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onReportHtmlInfo(int i, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onReportMemoryCachedResponse(String str, int i, HashMap<String, String> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onReportResponseHeaders(String str, int i, HashMap<String, String> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onResponseReceived(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onScrollChanged(int i, int i2, int i3, int i4, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onSetButtonStatus(boolean z, boolean z2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onShowListBox(String[] strArr, int[] iArr, int[] iArr2, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public boolean onShowLongClickPopupMenu() {
        /*
            r1 = this;
            r0 = 0
            return r0
        L9:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.export.external.extension.proxy.ProxyWebViewClientExtension.onShowLongClickPopupMenu():boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onShowMutilListBox(String[] strArr, int[] iArr, int[] iArr2, int[] iArr3) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onSlidingTitleOffScreen(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onSoftKeyBoardHide(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onSoftKeyBoardShow() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public boolean onTouchEvent(MotionEvent motionEvent, View view) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onTransitionToCommitted() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onUploadProgressChange(int i, int i2, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onUploadProgressStart(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onUrlChange(String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, View view) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public boolean preShouldOverrideUrlLoading(IX5WebViewExtension iX5WebViewExtension, String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void showTranslateBubble(int i, String str, String str2, int i2) {
    }
}
