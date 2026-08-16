package com.tencent.smtt.utils;

import android.content.Context;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes2.dex */
public class Apn {
    public static final int APN_2G = 1;
    public static final int APN_3G = 2;
    public static final int APN_4G = 4;
    public static final int APN_CELLULAR = 5;
    public static final int APN_ETHERNET = 6;
    public static final int APN_UNKNOWN = 0;
    public static final int APN_WIFI = 3;

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private static int m19331a(NetworkInfo networkInfo) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.lang.String getApnInfo(android.content.Context r5) {
        /*
            r0 = 0
            return r0
        L45:
        L64:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.Apn.getApnInfo(android.content.Context):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    public static int getApnType(Context context) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isNetworkAvailable(Context context) {
        return false;
    }
}
