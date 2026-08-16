package com.tencent.smtt.sdk;

import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class CacheManager {
    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static boolean cacheDisabled() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static InputStream getCacheFile(String str, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0018
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.lang.Object getCacheFile(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            r0 = 0
            return r0
        L35:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.CacheManager.getCacheFile(java.lang.String, java.util.Map):java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static File getCacheFileBaseDir() {
        return null;
    }
}
