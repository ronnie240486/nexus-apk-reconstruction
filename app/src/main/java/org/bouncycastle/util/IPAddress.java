package org.bouncycastle.util;

/* JADX INFO: loaded from: classes2.dex */
public class IPAddress {
    /* JADX WARN: Invalid debug info offset */
    private static boolean isMaskValue(String str, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isValid(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0022
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static boolean isValidIPv4(java.lang.String r5) {
        /*
            r0 = 0
            return r0
        L36:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.util.IPAddress.isValidIPv4(java.lang.String):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isValidIPv4WithNetmask(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0044
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static boolean isValidIPv6(java.lang.String r8) {
        /*
            r0 = 0
            return r0
        L55:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.util.IPAddress.isValidIPv6(java.lang.String):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isValidIPv6WithNetmask(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isValidWithNetMask(String str) {
        return false;
    }
}
