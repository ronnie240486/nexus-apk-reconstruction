package com.tencent.smtt.sdk;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class TbsCoreLoadStat {
    public static final int ERROR_CODE_INIT = -1;

    /* JADX INFO: renamed from: a */
    private static TbsCoreLoadStat f12800a = null;
    public static String mErrorMessage = "";
    public static volatile int mLoadErrorCode = -1;

    /* JADX WARN: Invalid debug info offset */
    private TbsCoreLoadStat() {
    }

    /* JADX WARN: Invalid debug info offset */
    public static TbsCoreLoadStat getInstance() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static int getLoadErrorCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getLoadErrorMessage() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m18895a(Context context, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public synchronized void m18896a(android.content.Context r4, int r5, java.lang.Throwable r6) {
        /*
            r3 = this;
            return
        L4f:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsCoreLoadStat.m18896a(android.content.Context, int, java.lang.Throwable):void");
    }
}
