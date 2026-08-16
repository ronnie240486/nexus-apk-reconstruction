package com.tencent.smtt.sdk.stat;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class MttLoader {
    public static final String CHANNEL_ID = "ChannelID";
    public static final String ENTRY_ID = "entryId";

    @Deprecated
    public static final String KEY_ACTIVITY_NAME = "KEY_ACT";

    @Deprecated
    public static final String KEY_APP_NAME = "KEY_APPNAME";
    public static final String KEY_EUSESTAT = "KEY_EUSESTAT";

    @Deprecated
    public static final String KEY_PACKAGE = "KEY_PKG";
    public static final String KEY_PID = "KEY_PID";
    public static final String MTT_ACTION = "com.tencent.QQBrowser.action.VIEW";
    public static final String MTT_ACTION_SP = "com.tencent.QQBrowser.action.VIEWSP";
    public static final String PID_ARTICLE_NEWS = "21272";
    public static final String PID_MOBILE_QQ = "50079";
    public static final String PID_QQPIM = "50190";
    public static final String PID_QZONE = "10494";
    public static final String PID_WECHAT = "10318";
    public static final String POS_ID = "PosID";
    public static final String QQBROWSER_DIRECT_DOWNLOAD_URL = "https://mdc.html5.qq.com/d/directdown.jsp?channel_id=50079";
    public static final String QQBROWSER_DOWNLOAD_URL = "https://mdc.html5.qq.com/mh?channel_id=50079&u=";
    public static final String QQBROWSER_PARAMS_FROME = ",from=";
    public static final String QQBROWSER_PARAMS_PACKAGENAME = ",packagename=";
    public static final String QQBROWSER_PARAMS_PD = ",product=";
    public static final String QQBROWSER_PARAMS_VERSION = ",version=";
    public static final String QQBROWSER_SCHEME = "mttbrowser://url=";
    public static final int RESULT_INVALID_CONTEXT = 3;
    public static final int RESULT_INVALID_URL = 2;
    public static final int RESULT_NOT_INSTALL_QQBROWSER = 4;
    public static final int RESULT_OK = 0;
    public static final int RESULT_QQBROWSER_LOW = 5;
    public static final int RESULT_UNKNOWN = 1;
    public static final String STAT_KEY = "StatKey";

    public static class BrowserInfo {
        public int browserType;
        public String packageName;
        public String quahead;
        public int ver;

        /* JADX INFO: renamed from: vn */
        public String f13136vn;
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.stat.MttLoader$a */
    public static class C4137a {

        /* JADX INFO: renamed from: a */
        public String f13137a;

        /* JADX INFO: renamed from: b */
        public String f13138b;

        /* JADX WARN: Invalid debug info offset */
        private C4137a() {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ C4137a(C41361 c41361) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private static int m19219a(Context context) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private static Uri m19220a(Context context, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private static C4137a m19221a(Context context, Uri uri) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private static String m19222a(Certificate certificate) throws CertificateEncodingException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private static boolean m19223a(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0027
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static com.tencent.smtt.sdk.stat.MttLoader.BrowserInfo getBrowserInfo(android.content.Context r14) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.stat.MttLoader.getBrowserInfo(android.content.Context):com.tencent.smtt.sdk.stat.MttLoader$BrowserInfo");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.lang.String getDownloadUrlWithQb(java.lang.String r3) {
        /*
            r0 = 0
            return r0
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.stat.MttLoader.getDownloadUrlWithQb(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getValidQBUrl(Context context, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isBrowserInstalled(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static boolean isBrowserInstalledEx(android.content.Context r7) {
        /*
            r0 = 0
            return r0
        L19:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.stat.MttLoader.isBrowserInstalledEx(android.content.Context):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static boolean isGreatBrowserVer(android.content.Context r5, long r6, long r8) {
        /*
            r0 = 0
            return r0
        L16:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.stat.MttLoader.isGreatBrowserVer(android.content.Context, long, long):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isSupportQBScheme(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isSupportingTbsTips(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0011
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static int loadUrl(android.content.Context r7, java.lang.String r8, java.util.HashMap<java.lang.String, java.lang.String> r9, com.tencent.smtt.sdk.WebView r10) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.stat.MttLoader.loadUrl(android.content.Context, java.lang.String, java.util.HashMap, com.tencent.smtt.sdk.WebView):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static int loadUrl(android.content.Context r4, java.lang.String r5, java.util.HashMap<java.lang.String, java.lang.String> r6, java.lang.String r7, com.tencent.smtt.sdk.WebView r8) {
        /*
            r0 = 0
            return r0
        L1f:
        L2b:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.stat.MttLoader.loadUrl(android.content.Context, java.lang.String, java.util.HashMap, java.lang.String, com.tencent.smtt.sdk.WebView):int");
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean openDocWithQb(Context context, String str, int i, String str2, String str3, HashMap<String, String> map, Bundle bundle) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean openDocWithQb(Context context, String str, int i, String str2, HashMap<String, String> map) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean openDocWithQb(Context context, String str, int i, String str2, HashMap<String, String> map, Bundle bundle) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x003d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static boolean openVideoWithQb(android.content.Context r4, java.lang.String r5, java.util.HashMap<java.lang.String, java.lang.String> r6) {
        /*
            r0 = 0
            return r0
        L56:
        L5f:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.stat.MttLoader.openVideoWithQb(android.content.Context, java.lang.String, java.util.HashMap):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static boolean verifySignature(java.io.File r7) {
        /*
            r0 = 0
            return r0
        L12:
        L31:
        L34:
        L48:
        L4b:
        L4c:
        L51:
        L55:
        L5d:
        L61:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.stat.MttLoader.verifySignature(java.io.File):boolean");
    }
}
