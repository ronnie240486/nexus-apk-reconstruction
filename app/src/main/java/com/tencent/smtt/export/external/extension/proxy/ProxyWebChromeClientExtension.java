package com.tencent.smtt.export.external.extension.proxy;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewExtension;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.export.external.interfaces.MediaAccessPermissionsCallback;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ProxyWebChromeClientExtension implements IX5WebChromeClientExtension {
    private static boolean sCompatibleNewOnSavePassword = true;
    private static boolean sCompatibleOpenFileChooser = true;
    protected IX5WebChromeClientExtension mWebChromeClient;

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public void acquireWakeLock() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public void addFlashView(View view, ViewGroup.LayoutParams layoutParams) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public void exitFullScreenFlash() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public Context getApplicationContex() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public View getVideoLoadingProgressView() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public Object getX5WebChromeClientInstance() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public IX5WebChromeClientExtension getmWebChromeClient() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public void h5videoExitFullScreen(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public void h5videoRequestFullScreen(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public void jsExitFullScreen() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public void jsRequestFullScreen() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public boolean onAddFavorite(IX5WebViewExtension iX5WebViewExtension, String str, String str2, JsResult jsResult) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public void onAllMetaDataFinished(IX5WebViewExtension iX5WebViewExtension, HashMap<String, String> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public void onBackforwardFinished(int i) {
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public void onColorModeChanged(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public void onHitTestResultFinished(IX5WebViewExtension iX5WebViewExtension, IX5WebViewBase.HitTestResult hitTestResult) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public void onHitTestResultForPluginFinished(IX5WebViewExtension iX5WebViewExtension, IX5WebViewBase.HitTestResult hitTestResult, Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public Object onMiscCallBack(String str, Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public boolean onPageNotResponding(Runnable runnable) {
        return false;
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public boolean onPermissionRequest(String str, long j, MediaAccessPermissionsCallback mediaAccessPermissionsCallback) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public void onPrepareX5ReadPageDataFinished(IX5WebViewExtension iX5WebViewExtension, HashMap<String, String> map) {
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public void onPrintPage() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public void onPromptNotScalable(IX5WebViewExtension iX5WebViewExtension) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public void onPromptScaleSaved(IX5WebViewExtension iX5WebViewExtension) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0014
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public boolean onSavePassword(android.webkit.ValueCallback<java.lang.String> r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, boolean r18) {
        /*
            r11 = this;
            r0 = 0
            return r0
        L19:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.export.external.extension.proxy.ProxyWebChromeClientExtension.onSavePassword(android.webkit.ValueCallback, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public boolean onSavePassword(java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10, android.os.Message r11) {
        /*
            r6 = this;
            r0 = 0
            return r0
        Le:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.export.external.extension.proxy.ProxyWebChromeClientExtension.onSavePassword(java.lang.String, java.lang.String, java.lang.String, boolean, android.os.Message):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public void onX5ReadModeAvailableChecked(HashMap<String, String> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public void openFileChooser(android.webkit.ValueCallback<android.net.Uri[]> r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            return
        Lc:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.export.external.extension.proxy.ProxyWebChromeClientExtension.openFileChooser(android.webkit.ValueCallback, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public void releaseWakeLock() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension
    public void requestFullScreenFlash() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setWebChromeClientExtend(IX5WebChromeClientExtension iX5WebChromeClientExtension) {
    }
}
