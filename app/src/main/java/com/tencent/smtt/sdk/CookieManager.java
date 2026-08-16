package com.tencent.smtt.sdk;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class CookieManager {
    public static String LOGTAG = "CookieManager";

    /* JADX INFO: renamed from: c */
    private static CookieManager f12648c;

    /* JADX INFO: renamed from: a */
    CopyOnWriteArrayList<C4060b> f12649a;

    /* JADX INFO: renamed from: b */
    EnumC4059a f12650b;

    /* JADX INFO: renamed from: d */
    private boolean f12651d;

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.CookieManager$a */
    public enum EnumC4059a {
        MODE_NONE,
        MODE_KEYS,
        MODE_ALL
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.CookieManager$b */
    public class C4060b {

        /* JADX INFO: renamed from: a */
        int f12656a;

        /* JADX INFO: renamed from: b */
        String f12657b;

        /* JADX INFO: renamed from: c */
        String f12658c;

        /* JADX INFO: renamed from: d */
        ValueCallback<Boolean> f12659d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ CookieManager f12660e;

        /* JADX WARN: Invalid debug info offset */
        public C4060b(CookieManager cookieManager) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    private CookieManager() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static boolean checkSysCoreNotExist() {
        /*
            r0 = 0
            return r0
        La:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.CookieManager.checkSysCoreNotExist():boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static com.tencent.smtt.sdk.CookieManager getInstance() {
        /*
            r0 = 0
            return r0
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.CookieManager.getInstance():com.tencent.smtt.sdk.CookieManager");
    }

    /* JADX WARN: Invalid debug info offset */
    public static int getROMCookieDBVersion(Context context) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setROMCookieDBVersion(Context context, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public synchronized void m18849a() {
        /*
            r12 = this;
            return
        L3e:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.CookieManager.m18849a():void");
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean acceptCookie() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized boolean acceptThirdPartyCookies(com.tencent.smtt.sdk.WebView r8) {
        /*
            r7 = this;
            r0 = 0
            return r0
        L37:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.CookieManager.acceptThirdPartyCookies(com.tencent.smtt.sdk.WebView):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    public void flush() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public java.lang.String getCookie(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 0
            return r0
        L26:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.CookieManager.getCookie(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean hasCookies() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void removeAllCookie() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void removeAllCookies(ValueCallback<Boolean> valueCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void removeExpiredCookie() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void removeSessionCookie() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void removeSessionCookies(ValueCallback<Boolean> valueCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void setAcceptCookie(boolean r8) {
        /*
            r7 = this;
            return
        L2d:
        L3f:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.CookieManager.setAcceptCookie(boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void setAcceptThirdPartyCookies(com.tencent.smtt.sdk.WebView r9, boolean r10) {
        /*
            r8 = this;
            return
        L38:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.CookieManager.setAcceptThirdPartyCookies(com.tencent.smtt.sdk.WebView, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void setCookie(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            return
        L7:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.CookieManager.setCookie(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void setCookie(java.lang.String r10, java.lang.String r11, com.tencent.smtt.sdk.ValueCallback<java.lang.Boolean> r12) {
        /*
            r9 = this;
            return
        L35:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.CookieManager.setCookie(java.lang.String, java.lang.String, com.tencent.smtt.sdk.ValueCallback):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void setCookie(java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            return
        L43:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.CookieManager.setCookie(java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCookies(Map<String, String[]> map) {
    }
}
