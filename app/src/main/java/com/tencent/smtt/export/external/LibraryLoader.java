package com.tencent.smtt.export.external;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class LibraryLoader {
    private static String[] sLibrarySearchPaths;

    /* JADX WARN: Invalid debug info offset */
    public static String[] getLibrarySearchPaths(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getNativeLibraryDir(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0022
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void loadLibrary(android.content.Context r5, java.lang.String r6) throws java.lang.UnsatisfiedLinkError {
        /*
            return
        L26:
        L2f:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.export.external.LibraryLoader.loadLibrary(android.content.Context, java.lang.String):void");
    }
}
