package com.tencent.smtt.utils;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class PropertyUtils {

    /* JADX INFO: renamed from: a */
    private static Class f13202a;

    /* JADX INFO: renamed from: b */
    private static Method f13203b;

    static {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            f13202a = cls;
            f13203b = cls.getDeclaredMethod("get", String.class, String.class);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    private static java.lang.String m19377a(java.lang.String r4, java.lang.String r5) {
        /*
            r0 = 0
            return r0
        L1a:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.PropertyUtils.m19377a(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getQuickly(String str, String str2) {
        return null;
    }
}
