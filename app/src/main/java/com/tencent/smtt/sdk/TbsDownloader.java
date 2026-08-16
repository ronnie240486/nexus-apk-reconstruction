package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.smtt.utils.C4160g;
import com.tencent.smtt.utils.Timer;
import java.nio.channels.FileChannel;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TbsDownloader {
    public static final boolean DEBUG_DISABLE_DOWNLOAD = false;
    public static boolean DOWNLOAD_OVERSEA_TBS = false;
    public static final String LOGTAG = "TbsDownload";
    public static final String TBS_METADATA = "com.tencent.mm.BuildInfo.CLIENT_VERSION";

    /* JADX INFO: renamed from: a */
    static boolean f12804a = false;

    /* JADX INFO: renamed from: b */
    private static String f12805b = null;

    /* JADX INFO: renamed from: c */
    private static Context f12806c = null;

    /* JADX INFO: renamed from: d */
    private static Handler f12807d = null;

    /* JADX INFO: renamed from: e */
    private static String f12808e = null;

    /* JADX INFO: renamed from: f */
    private static final Object f12809f = new byte[0];

    /* JADX INFO: renamed from: g */
    private static C4127k f12810g = null;

    /* JADX INFO: renamed from: h */
    private static HandlerThread f12811h = null;

    /* JADX INFO: renamed from: i */
    private static int f12812i = 0;

    /* JADX INFO: renamed from: j */
    private static boolean f12813j = false;

    /* JADX INFO: renamed from: k */
    private static String f12814k = "";

    /* JADX INFO: renamed from: l */
    private static String f12815l = "";

    /* JADX INFO: renamed from: m */
    private static boolean f12816m = false;

    /* JADX INFO: renamed from: n */
    private static boolean f12817n = false;

    /* JADX INFO: renamed from: o */
    private static JSONObject f12818o = null;

    /* JADX INFO: renamed from: p */
    private static JSONObject f12819p = null;

    /* JADX INFO: renamed from: q */
    private static boolean f12820q = false;

    /* JADX INFO: renamed from: r */
    private static int f12821r = 0;

    /* JADX INFO: renamed from: s */
    private static int f12822s = 0;

    /* JADX INFO: renamed from: t */
    private static JSONObject f12823t = null;

    /* JADX INFO: renamed from: u */
    private static long f12824u = -1;

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.TbsDownloader$1 */
    public static class HandlerC40971 extends Handler {

        /* JADX INFO: renamed from: com.tencent.smtt.sdk.TbsDownloader$1$1, reason: invalid class name */
        public class AnonymousClass1 implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ HandlerC40971 f12825a;

            /* JADX WARN: Invalid debug info offset */
            public AnonymousClass1(HandlerC40971 handlerC40971) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public HandlerC40971(Looper looper) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.TbsDownloader$2 */
    public static class C40982 implements C4160g.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TbsDownloadConfig f12826a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f12827b;

        /* JADX WARN: Invalid debug info offset */
        public C40982(TbsDownloadConfig tbsDownloadConfig, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.utils.C4160g.a
        /* JADX INFO: renamed from: a */
        public void mo18920a(int i) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.TbsDownloader$3 */
    public static class C40993 extends Thread {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f12828a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Runnable f12829b;

        /* JADX INFO: renamed from: com.tencent.smtt.sdk.TbsDownloader$3$1, reason: invalid class name */
        public class AnonymousClass1 extends TimerTask {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ FileChannel f12830a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Timer f12831b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C40993 f12832c;

            /* JADX WARN: Invalid debug info offset */
            public AnonymousClass1(C40993 c40993, FileChannel fileChannel, Timer timer) {
            }

            /* JADX WARN: Invalid debug info offset */
            /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
                jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000a
                	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
                	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
                */
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                /*
                    r2 = this;
                    return
                L1c:
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.C40993.AnonymousClass1.run():void");
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public C40993(Context context, Runnable runnable) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0007
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            /*
                r11 = this;
                return
            L3b:
            L3d:
            L3f:
            L42:
            L53:
            L57:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.C40993.run():void");
        }
    }

    public interface TbsDownloaderCallback {
        void onNeedDownloadFinish(boolean z, int i);
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Context m18897a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private static String m18898a(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0050
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    private static org.json.JSONObject m18899a(boolean r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.m18899a(boolean, boolean, boolean):org.json.JSONObject");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0019
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    private static void m18900a(int r3) {
        /*
            return
        L2f:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.m18900a(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static void m18901a(Context context, Runnable runnable) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private static void m18902a(boolean z, TbsDownloaderCallback tbsDownloaderCallback, boolean z2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static boolean m18903a(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static boolean m18904a(Context context, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private static boolean m18905a(Context context, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private static boolean m18906a(Context context, boolean z, boolean z2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x00e2
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @android.annotation.TargetApi(11)
    /* JADX INFO: renamed from: a */
    private static boolean m18907a(java.lang.String r29, int r30, boolean r31, boolean r32, boolean r33) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1121
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.m18907a(java.lang.String, int, boolean, boolean, boolean):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m18908a(boolean z, boolean z2, boolean z3, boolean z4) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C4127k m18909b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public static java.lang.String m18910b(android.content.Context r7) {
        /*
            r0 = 0
            return r0
        L25:
        L77:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.m18910b(android.content.Context):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0156
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    private static boolean m18911b(boolean r23, boolean r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.m18911b(boolean, boolean, boolean, boolean):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: c */
    private static synchronized void m18912c() {
        /*
            return
        L26:
        L28:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.m18912c():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(11)
    /* JADX INFO: renamed from: c */
    public static void m18913c(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    private static boolean m18914d() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    private static JSONArray m18915e() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    private static boolean m18916f() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    private static void m18917g() {
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getBackupFileName(boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getBackupFileName(boolean z, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static int getCoreShareDecoupleCoreVersion() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static int getCoreShareDecoupleCoreVersionByContext(Context context) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static int getNextPostInterval(Context context) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static synchronized boolean getOverSea(android.content.Context r5) {
        /*
            r0 = 0
            return r0
        L3b:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.getOverSea(android.content.Context):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    public static long getRetryIntervalInSeconds() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public static HandlerThread getsTbsHandlerThread() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0017
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: h */
    private static void m18918h() {
        /*
            return
        L2b:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.m18918h():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    private static void m18919i() {
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isDownloadForeground() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static synchronized boolean isDownloading() {
        /*
            r0 = 0
            return r0
        L1c:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.isDownloading():boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isTbsCoreDisabledBySwitch(Context context, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean needDownload(Context context, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean needDownload(Context context, boolean z, boolean z2, TbsDownloaderCallback tbsDownloaderCallback) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean needDownload(Context context, boolean z, boolean z2, boolean z3, TbsDownloaderCallback tbsDownloaderCallback) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean needDownloadDecoupleCore() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void pauseDownload() {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void resumeDownload() {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setAppContext(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setRetryIntervalInSeconds(Context context, long j) {
    }

    @Deprecated
    public static boolean startDecoupleCoreIfNeeded() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void startDownload(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static synchronized void startDownload(android.content.Context r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.startDownload(android.content.Context, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static void stopDownload() {
    }
}
