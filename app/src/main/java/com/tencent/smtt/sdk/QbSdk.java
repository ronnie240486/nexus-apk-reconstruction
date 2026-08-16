package com.tencent.smtt.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.smtt.utils.TbsLogClient;
import com.tencent.smtt.utils.Timer;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"NewApi"})
public class QbSdk {

    /* JADX INFO: renamed from: A */
    private static int f12693A = 170;

    /* JADX INFO: renamed from: B */
    private static String f12694B = null;

    /* JADX INFO: renamed from: C */
    private static String f12695C = null;

    @Deprecated
    public static final int CORE_VER_ENABLE_202112 = 45912;
    public static final int CORE_VER_ENABLE_202207 = 46110;

    /* JADX INFO: renamed from: D */
    private static boolean f12696D = false;

    /* JADX INFO: renamed from: E */
    private static boolean f12697E = false;
    public static final int EXTENSION_INIT_FAILURE = -99999;

    /* JADX INFO: renamed from: F */
    private static boolean f12698F = false;

    /* JADX INFO: renamed from: G */
    private static TbsListener f12699G = null;

    /* JADX INFO: renamed from: H */
    private static TbsListener f12700H = null;

    /* JADX INFO: renamed from: I */
    private static boolean f12701I = false;

    /* JADX INFO: renamed from: J */
    private static boolean f12702J = false;
    public static final String KEY_SET_SENDREQUEST_AND_UPLOAD = "SET_SENDREQUEST_AND_UPLOAD";
    public static final String KEY_THIRD_PARTY_TURING = "turing";
    public static final String LOGIN_TYPE_KEY_PARTNER_CALL_POS = "PosID";
    public static final String LOGIN_TYPE_KEY_PARTNER_ID = "ChannelID";
    public static final int QBMODE = 2;
    public static final String SHARE_PREFERENCES_NAME = "tbs_file_open_dialog_config";
    public static final String SVNVERSION = "jnizz";
    public static final int TBSMODE = 1;
    public static final String TID_QQNumber_Prefix = "QQ:";
    public static final int VERSION = 1;

    /* JADX INFO: renamed from: a */
    static boolean f12709a = false;

    /* JADX INFO: renamed from: b */
    static boolean f12710b = false;

    /* JADX INFO: renamed from: c */
    static boolean f12711c = true;

    /* JADX INFO: renamed from: d */
    static String f12712d = null;

    /* JADX INFO: renamed from: e */
    static boolean f12713e = false;

    /* JADX INFO: renamed from: f */
    static long f12714f = 0;

    /* JADX INFO: renamed from: g */
    static long f12715g = 0;

    /* JADX INFO: renamed from: i */
    static boolean f12717i = true;

    /* JADX INFO: renamed from: j */
    static boolean f12718j = true;

    /* JADX INFO: renamed from: k */
    static boolean f12719k = false;

    /* JADX INFO: renamed from: l */
    static boolean f12720l = false;

    /* JADX INFO: renamed from: m */
    static volatile boolean f12721m = false;
    public static boolean mDisableUseHostBackupCore = false;

    /* JADX INFO: renamed from: p */
    private static int f12724p = 0;

    /* JADX INFO: renamed from: q */
    private static String f12725q = "";

    /* JADX INFO: renamed from: r */
    private static Class<?> f12726r = null;

    /* JADX INFO: renamed from: s */
    private static Object f12727s = null;
    public static boolean sIsVersionPrinted = false;

    /* JADX INFO: renamed from: t */
    private static boolean f12728t = false;

    /* JADX INFO: renamed from: u */
    private static String[] f12729u = null;

    /* JADX INFO: renamed from: v */
    private static String f12730v = "NULL";

    /* JADX INFO: renamed from: w */
    private static String f12731w = "UNKNOWN";

    /* JADX INFO: renamed from: x */
    private static boolean f12732x = false;

    /* JADX INFO: renamed from: y */
    private static int f12733y = -1;

    /* JADX INFO: renamed from: z */
    private static int f12734z;

    /* JADX INFO: renamed from: h */
    static Object f12716h = new Object();

    /* JADX INFO: renamed from: n */
    static TbsListener f12722n = new TbsListener() { // from class: com.tencent.smtt.sdk.QbSdk.5
        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.TbsListener
        public void onDownloadFinish(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.TbsListener
        public void onDownloadProgress(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.TbsListener
        public void onInstallFinish(int i) {
        }
    };

    /* JADX INFO: renamed from: K */
    private static boolean f12703K = false;

    /* JADX INFO: renamed from: L */
    private static boolean f12704L = false;

    /* JADX INFO: renamed from: o */
    static Map<String, Object> f12723o = null;

    @Deprecated
    public static final String USER_ID_FROM_APP_IMSI = TbsPrivacyAccess.ConfigurablePrivacy.IMSI.f12873a;

    @Deprecated
    public static final String USER_ID_FROM_APP_ANDROID_ID = TbsPrivacyAccess.ConfigurablePrivacy.ANDROID_ID.f12873a;

    @Deprecated
    public static final String USER_ID_FROM_APP_MAC = TbsPrivacyAccess.ConfigurablePrivacy.MAC.f12873a;

    @Deprecated
    public static final String USER_ID_FROM_APP_ANDROID_VERSION = TbsPrivacyAccess.ConfigurablePrivacy.ANDROID_VERSION.f12873a;

    @Deprecated
    public static final String USER_ID_FROM_APP_DEVICE_MODEL = TbsPrivacyAccess.ConfigurablePrivacy.DEVICE_MODEL.f12873a;
    public static final String USER_ID_FROM_APP_QIMEI36 = TbsPrivacyAccess.ConfigurablePrivacy.QIMEI36.f12873a;

    /* JADX INFO: renamed from: M */
    private static int f12705M = -1;

    /* JADX INFO: renamed from: N */
    private static Timer f12706N = null;

    /* JADX INFO: renamed from: O */
    private static PrivateCDNMode f12707O = PrivateCDNMode.NOT_USE;

    /* JADX INFO: renamed from: P */
    private static SystemCoreProtector f12708P = null;

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.QbSdk$1 */
    public static class HandlerC40671 extends Handler {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ PreInitCallback f12735a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f12736b;

        /* JADX WARN: Invalid debug info offset */
        public HandlerC40671(Looper looper, PreInitCallback preInitCallback, Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.QbSdk$2 */
    public static class C40682 extends Thread {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f12737a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Handler f12738b;

        /* JADX WARN: Invalid debug info offset */
        public C40682(Context context, Handler handler) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.QbSdk$3 */
    public static class C40693 implements TbsListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f12739a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ PreInitCallback f12740b;

        /* JADX WARN: Invalid debug info offset */
        public C40693(Context context, PreInitCallback preInitCallback) {
        }

        @Override // com.tencent.smtt.sdk.TbsListener
        public void onDownloadFinish(int i) {
        }

        @Override // com.tencent.smtt.sdk.TbsListener
        public void onDownloadProgress(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.TbsListener
        public void onInstallFinish(int i) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.QbSdk$4 */
    public static class C40704 implements TbsDownloader.TbsDownloaderCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f12741a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ PreInitCallback f12742b;

        /* JADX INFO: renamed from: com.tencent.smtt.sdk.QbSdk$4$1, reason: invalid class name */
        public class AnonymousClass1 implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C40704 f12743a;

            /* JADX WARN: Invalid debug info offset */
            public AnonymousClass1(C40704 c40704) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public C40704(Context context, PreInitCallback preInitCallback) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.TbsDownloader.TbsDownloaderCallback
        public void onNeedDownloadFinish(boolean z, int i) {
        }
    }

    public interface PreInitCallback {
        void onCoreInitFinished();

        void onViewInitFinished(boolean z);
    }

    public enum PrivateCDNMode {
        OFFICIAL_IMPL,
        SELF_IMPL,
        NOT_USE
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.QbSdk$a */
    public interface InterfaceC4072a {
        /* JADX INFO: renamed from: a */
        void m18888a(File[] fileArr);
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static Bundle m18866a(Context context, Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static Object m18867a(Context context, String str, Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static String m18868a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static synchronized void m18869a(android.content.Context r5, java.lang.String r6) {
        /*
            return
        L1f:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.m18869a(android.content.Context, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static boolean m18870a(android.content.Context r12) {
        /*
            r0 = 0
            return r0
        L1b:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.m18870a(android.content.Context):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static boolean m18871a(Context context, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static boolean m18872a(Context context, int i, int i2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x00a0
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @android.annotation.SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    private static boolean m18873a(android.content.Context r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.m18873a(android.content.Context, boolean):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x00eb
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static boolean m18874a(android.content.Context r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.m18874a(android.content.Context, boolean, boolean):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static String m18875b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public static boolean m18876b(android.content.Context r7) {
        /*
            r0 = 0
            return r0
        L6b:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.m18876b(android.content.Context):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static boolean m18877b(Context context, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static Timer m18878c() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m18879c(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean canDownloadWithoutWifi() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static void canGetAndroidId(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static void canGetDeviceId(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static void canGetSubscriberId(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean canLoadVideo(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static boolean canLoadX5(Context context) {
        return false;
    }

    @Deprecated
    public static boolean canLoadX5FirstTimeThirdApp(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void canOpenFile(Context context, String str, ValueCallback<Boolean> valueCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean canOpenMimeFileType(Context context, String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x002d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static boolean canOpenWebPlus(android.content.Context r9) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.canOpenWebPlus(android.content.Context):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean canUseVideoFeatrue(Context context, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void checkTbsValidity(Context context) {
    }

    @Deprecated
    public static void clear(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0022
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void clearAllWebViewCache(android.content.Context r6, boolean r7) {
        /*
            return
        L41:
        L46:
        L8b:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.clearAllWebViewCache(android.content.Context, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static void closeFileReader(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0016
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.lang.String closeNetLogAndSavaToLocal() {
        /*
            r0 = 0
            return r0
        L2c:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.closeNetLogAndSavaToLocal():java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    public static void configurePrivacy(Context context, TbsPrivacyAccess.ConfigurablePrivacy configurablePrivacy, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean createMiniQBShortCut(Context context, String str, String str2, Drawable drawable) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static boolean m18880d() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: d */
    private static boolean m18881d(android.content.Context r14) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.m18881d(android.content.Context):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean deleteMiniQBShortCut(Context context, String str, String str2) {
        return false;
    }

    @Deprecated
    public static void deleteStableCore(Context context, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void disAllowThirdAppDownload() {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void disableAutoCreateX5Webview() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static void disableSensitiveApi() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static SystemCoreProtector m18882e() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0051
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: e */
    private static void m18883e(android.content.Context r7) {
        /*
            return
        L9a:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.m18883e(android.content.Context):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static void enableX5WithoutRestart() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ TbsListener m18884f() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    private static void m18885f(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0010
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void fileInfoDetect(android.content.Context r9, java.lang.String r10, android.webkit.ValueCallback<java.lang.String> r11) {
        /*
            return
        L36:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.fileInfoDetect(android.content.Context, java.lang.String, android.webkit.ValueCallback):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static void forceSysWebView() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ TbsListener m18886g() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: g */
    private static void m18887g(android.content.Context r5) {
        /*
            return
        L35:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.m18887g(android.content.Context):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static long getApkFileSize(Context context) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.lang.String getCurrentProcessName(android.content.Context r7) {
        /*
            r0 = 0
            return r0
        L1d:
        L2c:
        L35:
        L3a:
        L45:
        L4c:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.getCurrentProcessName(android.content.Context):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    public static String[] getDexLoaderFileList(Context context, Context context2, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static boolean getDownloadWithoutWifi() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean getIsInitX5Environment() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean getIsSysWebViewForcedByOuter() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean getJarFilesAndLibraryPath(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getMiniQBVersion(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean getOnlyDownload() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getQQBuildNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Map<String, Object> getSettings() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean getTBSInstalling() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getTID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static File getTbsFolderDir(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static String getTbsResourcesPath(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static int getTbsSdkVersion() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static int getTbsVersion(Context context) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static int getTbsVersionForCrash(Context context) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static int getTmpDirTbsVersion(Context context) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getX5CoreLoadHelp(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void initBuglyAsync(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void initForinitAndNotLoadSo(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void initTbsSettings(java.util.Map<java.lang.String, java.lang.Object> r1) {
        /*
            return
        Lb:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.initTbsSettings(java.util.Map):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static void initX5Environment(Context context, PreInitCallback preInitCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean installLocalQbApk(Context context, String str, String str2, Bundle bundle) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static void installLocalTbsCore(Context context, int i, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0026
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static boolean intentDispatch(com.tencent.smtt.sdk.WebView r7, android.content.Intent r8, java.lang.String r9, java.lang.String r10) {
        /*
            r0 = 0
            return r0
        L2d:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.intentDispatch(com.tencent.smtt.sdk.WebView, android.content.Intent, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static boolean isEnableCanGetSubscriberId() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static boolean isEnableGetAndroidID() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static boolean isEnableGetDeviceID() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static boolean isEnableSensitiveApi() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isEnableX5WithoutRestart() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isMiniQBShortCutExist(Context context, String str, String str2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isNeedInitX5FirstTime() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isStaticNeedDownload() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isTbsCoreInited() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isX5Core() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isX5DisabledSync(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0010
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void loadTBSSDKExtension(android.content.Context r12, java.lang.String r13) {
        /*
            return
        L16:
        L3d:
        L4a:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.loadTBSSDKExtension(android.content.Context, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0016
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void openNetLog(java.lang.String r7) {
        /*
            return
        L28:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.openNetLog(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static void pauseDownload() {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void preInit(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void preInit(Context context, PreInitCallback preInitCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static synchronized void preInit(android.content.Context r6, boolean r7, com.tencent.smtt.sdk.QbSdk.PreInitCallback r8) {
        /*
            return
        L59:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.preInit(android.content.Context, boolean, com.tencent.smtt.sdk.QbSdk$PreInitCallback):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean preinstallStaticTbs(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void reset(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static void reset(Context context, boolean z) {
    }

    @Deprecated
    public static void resetDecoupleCore(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void resumeDownload() {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setAppList(Context context, List<String> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setCoreMinVersion(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setCurrentID(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setDisableUnpreinitBySwitch(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setDisableUseHostBackupCoreBySwitch(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setDownloadWithoutWifi(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static void setEnableForThirdParty(Context context, Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setMultiProcessSyncInitTimer(Timer timer) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setNeedInitX5FirstTime(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setNeedStaticWithDownload(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0016
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void setNetLogEncryptionKey(java.lang.String r7) {
        /*
            return
        L28:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.setNetLogEncryptionKey(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0016
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void setNewDnsHostList(java.lang.String r7) {
        /*
            return
        L28:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.setNewDnsHostList(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setOnlyDownload(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setQQBuildNumber(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setSandboxExternalEnable(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setSystemCoreProtector(SystemCoreProtector systemCoreProtector) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setTBSInstallingStatus(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setTbsInstallerCallback(InterfaceC4072a interfaceC4072a) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setTbsListener(TbsListener tbsListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setTbsLogClient(TbsLogClient tbsLogClient) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setUUID(String str) {
    }

    @Deprecated
    public static void setUploadCode(Context context, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setUserID(Context context, Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static int startMiniQBToLoadUrl(Context context, String str, HashMap<String, String> map, android.webkit.ValueCallback<String> valueCallback) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean startQBForDoc(Context context, String str, int i, int i2, String str2, Bundle bundle) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean startQBForVideo(Context context, String str, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static boolean startQBToLoadurl(android.content.Context r6, java.lang.String r7, int r8, com.tencent.smtt.sdk.WebView r9) {
        /*
            r0 = 0
            return r0
        L33:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.startQBToLoadurl(android.content.Context, java.lang.String, int, com.tencent.smtt.sdk.WebView):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean startQbOrMiniQBToLoadUrl(Context context, String str, HashMap<String, String> map, ValueCallback<String> valueCallback) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void unForceSysWebView() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0016
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void uploadNetLog(java.lang.String r7) {
        /*
            return
        L28:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.uploadNetLog(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static void usePrivateCDN() {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void usePrivateCDN(PrivateCDNMode privateCDNMode) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean useSoftWare() {
        return false;
    }
}
