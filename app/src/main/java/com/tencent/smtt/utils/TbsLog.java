package com.tencent.smtt.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class TbsLog {
    public static final int MSG_PV_REPORT = 501;
    public static final String X5LOGTAG = "x5logtag";

    /* JADX INFO: renamed from: a */
    private static boolean f13204a = true;

    /* JADX INFO: renamed from: b */
    private static Handler f13205b;

    /* JADX INFO: renamed from: c */
    private static TbsLogClient f13206c;

    /* JADX INFO: renamed from: com.tencent.smtt.utils.TbsLog$1 */
    public static class HandlerC41511 extends Handler {
        /* JADX WARN: Invalid debug info offset */
        public HandlerC41511(Looper looper) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ TbsLogClient m19378a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static void m19379d(String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static void m19381d(String str, String str2, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static void m19382e(String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static void m19383e(String str, String str2, String str3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static void m19384e(String str, String str2, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getTbsLogFilePath() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Handler getTbsLogHandler() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static void m19385i(String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static void m19386i(String str, String str2, String str3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static void m19387i(String str, String str2, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static void m19388i(Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static synchronized void initIfNeed(android.content.Context r2) {
        /*
            return
        L10:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.TbsLog.initIfNeed(android.content.Context):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setLogView(TextView textView) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean setTbsLogClient(TbsLogClient tbsLogClient) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static void setWriteLogJIT(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public static void m19389v(String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public static void m19391v(String str, String str2, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static void m19392w(String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static void m19393w(String str, String str2, String str3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static void m19394w(String str, String str2, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static synchronized void writeLogToDisk() {
        /*
            return
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.TbsLog.writeLogToDisk():void");
    }

    /* JADX INFO: renamed from: d */
    public static void m19380d(String str, String str2, String str3) {
    }

    /* JADX INFO: renamed from: v */
    public static void m19390v(String str, String str2, String str3) {
    }
}
