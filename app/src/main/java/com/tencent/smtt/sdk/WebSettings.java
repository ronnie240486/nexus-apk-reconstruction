package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import com.tencent.smtt.export.external.interfaces.IX5WebSettings;

/* JADX INFO: loaded from: classes2.dex */
public class WebSettings {
    public static final int LOAD_CACHE_ELSE_NETWORK = 1;
    public static final int LOAD_CACHE_ONLY = 3;
    public static final int LOAD_DEFAULT = -1;
    public static final int LOAD_NORMAL = 0;
    public static final int LOAD_NO_CACHE = 2;

    /* JADX INFO: renamed from: a */
    private IX5WebSettings f12930a;

    /* JADX INFO: renamed from: b */
    private android.webkit.WebSettings f12931b;

    /* JADX INFO: renamed from: c */
    private boolean f12932c;

    public enum LayoutAlgorithm {
        NORMAL,
        SINGLE_COLUMN,
        NARROW_COLUMNS
    }

    public enum PluginState {
        ON,
        ON_DEMAND,
        OFF
    }

    public enum RenderPriority {
        NORMAL,
        HIGH,
        LOW
    }

    public enum TextSize {
        SMALLEST(50),
        SMALLER(75),
        NORMAL(100),
        LARGER(TbsListener.ErrorCode.DOWNLOAD_THROWABLE),
        LARGEST(150);

        int value;

        TextSize(int i) {
            this.value = i;
        }
    }

    public enum ZoomDensity {
        FAR(150),
        MEDIUM(100),
        CLOSE(75);

        int value;

        ZoomDensity(int i) {
            this.value = i;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public WebSettings(android.webkit.WebSettings webSettings) {
    }

    /* JADX WARN: Invalid debug info offset */
    public WebSettings(IX5WebSettings iX5WebSettings) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(17)
    public static String getDefaultUserAgent(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public boolean enableSmoothTransition() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(11)
    public boolean getAllowContentAccess() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(3)
    public boolean getAllowFileAccess() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized boolean getBlockNetworkImage() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(8)
    public synchronized boolean getBlockNetworkLoads() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(3)
    public boolean getBuiltInZoomControls() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getCacheMode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized String getCursiveFontFamily() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(5)
    public synchronized boolean getDatabaseEnabled() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(5)
    @Deprecated
    public synchronized String getDatabasePath() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized int getDefaultFixedFontSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized int getDefaultFontSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized String getDefaultTextEncodingName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(7)
    @Deprecated
    public ZoomDensity getDefaultZoom() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(11)
    public boolean getDisplayZoomControls() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(7)
    public synchronized boolean getDomStorageEnabled() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized String getFantasyFontFamily() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized String getFixedFontFamily() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized boolean getJavaScriptCanOpenWindowsAutomatically() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized boolean getJavaScriptEnabled() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized LayoutAlgorithm getLayoutAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public boolean getLightTouchEnabled() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(7)
    public boolean getLoadWithOverviewMode() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized boolean getLoadsImagesAutomatically() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(17)
    public boolean getMediaPlaybackRequiresUserGesture() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized int getMinimumFontSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized int getMinimumLogicalFontSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized int getMixedContentMode() {
        /*
            r5 = this;
            r0 = 0
            return r0
        L10:
        L16:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebSettings.getMixedContentMode():int");
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public boolean getNavDump() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(8)
    @Deprecated
    public synchronized PluginState getPluginState() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(8)
    @Deprecated
    public synchronized boolean getPluginsEnabled() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public synchronized String getPluginsPath() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0019
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public boolean getSafeBrowsingEnabled() {
        /*
            r3 = this;
            r0 = 0
            return r0
        L1e:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebSettings.getSafeBrowsingEnabled():boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized String getSansSerifFontFamily() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public boolean getSaveFormData() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public boolean getSavePassword() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized String getSerifFontFamily() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized String getStandardFontFamily() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public TextSize getTextSize() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(14)
    public synchronized int getTextZoom() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public boolean getUseWebViewBackgroundForOverscrollBackground() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized boolean getUseWideViewPort() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(3)
    public String getUserAgentString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(11)
    public void setAllowContentAccess(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(3)
    public void setAllowFileAccess(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(16)
    public void setAllowFileAccessFromFileURLs(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(16)
    public void setAllowUniversalAccessFromFileURLs(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(7)
    public void setAppCacheEnabled(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(7)
    @Deprecated
    public void setAppCacheMaxSize(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(7)
    public void setAppCachePath(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setBlockNetworkImage(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @android.annotation.TargetApi(8)
    public synchronized void setBlockNetworkLoads(boolean r3) {
        /*
            r2 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebSettings.setBlockNetworkLoads(boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(3)
    public void setBuiltInZoomControls(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCacheMode(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void setCursiveFontFamily(java.lang.String r3) {
        /*
            r2 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebSettings.setCursiveFontFamily(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(5)
    public void setDatabaseEnabled(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(5)
    @Deprecated
    public void setDatabasePath(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void setDefaultFixedFontSize(int r3) {
        /*
            r2 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebSettings.setDefaultFixedFontSize(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void setDefaultFontSize(int r3) {
        /*
            r2 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebSettings.setDefaultFontSize(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void setDefaultTextEncodingName(java.lang.String r3) {
        /*
            r2 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebSettings.setDefaultTextEncodingName(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(7)
    @Deprecated
    public void setDefaultZoom(ZoomDensity zoomDensity) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(11)
    public void setDisplayZoomControls(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(7)
    public void setDomStorageEnabled(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(11)
    @Deprecated
    public void setEnableSmoothTransition(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void setFantasyFontFamily(java.lang.String r3) {
        /*
            r2 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebSettings.setFantasyFontFamily(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void setFixedFontFamily(java.lang.String r3) {
        /*
            r2 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebSettings.setFixedFontFamily(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(5)
    @Deprecated
    public void setGeolocationDatabasePath(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(5)
    public void setGeolocationEnabled(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void setJavaScriptCanOpenWindowsAutomatically(boolean r3) {
        /*
            r2 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebSettings.setJavaScriptCanOpenWindowsAutomatically(boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void setJavaScriptEnabled(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLayoutAlgorithm(LayoutAlgorithm layoutAlgorithm) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void setLightTouchEnabled(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(7)
    public void setLoadWithOverviewMode(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLoadsImagesAutomatically(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(17)
    public void setMediaPlaybackRequiresUserGesture(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void setMinimumFontSize(int r3) {
        /*
            r2 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebSettings.setMinimumFontSize(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void setMinimumLogicalFontSize(int r3) {
        /*
            r2 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebSettings.setMinimumLogicalFontSize(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(21)
    public void setMixedContentMode(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void setNavDump(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setNeedInitialFocus(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @android.annotation.TargetApi(8)
    @java.lang.Deprecated
    public synchronized void setPluginState(com.tencent.smtt.sdk.WebSettings.PluginState r7) {
        /*
            r6 = this;
            return
        L17:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebSettings.setPluginState(com.tencent.smtt.sdk.WebSettings$PluginState):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void setPluginsEnabled(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @java.lang.Deprecated
    public synchronized void setPluginsPath(java.lang.String r7) {
        /*
            r6 = this;
            return
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebSettings.setPluginsPath(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void setRenderPriority(RenderPriority renderPriority) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0018
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void setSafeBrowsingEnabled(boolean r4) {
        /*
            r3 = this;
            return
        L1c:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebSettings.setSafeBrowsingEnabled(boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void setSansSerifFontFamily(java.lang.String r3) {
        /*
            r2 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebSettings.setSansSerifFontFamily(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void setSaveFormData(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void setSavePassword(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void setSerifFontFamily(java.lang.String r3) {
        /*
            r2 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebSettings.setSerifFontFamily(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void setStandardFontFamily(java.lang.String r3) {
        /*
            r2 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebSettings.setStandardFontFamily(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSupportMultipleWindows(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSupportZoom(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void setTextSize(TextSize textSize) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @android.annotation.TargetApi(14)
    public synchronized void setTextZoom(int r7) {
        /*
            r6 = this;
            return
        Lf:
        L1b:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebSettings.setTextZoom(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void setUseWebViewBackgroundForOverscrollBackground(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setUseWideViewPort(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setUserAgent(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(3)
    public void setUserAgentString(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized boolean supportMultipleWindows() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean supportZoom() {
        return false;
    }
}
