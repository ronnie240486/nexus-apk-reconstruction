package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: ax */
/* JADX INFO: loaded from: classes.dex */
public class C2943ax {

    /* JADX INFO: renamed from: a */
    public static char[] f10135a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    public static MessageDigest f10136b;

    static {
        f10136b = null;
        try {
            f10136b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            System.err.println(C2943ax.class.getName().concat("Failed to initialize，MessageDigest not support MD5Util。"));
            e.printStackTrace();
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static void m14566a(byte b, StringBuffer stringBuffer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static String m14567b(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static String m14568c(byte[] bArr, int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: d */
    public static boolean m14569d(java.lang.String r1, java.lang.String r2) {
        /*
            r0 = 0
            return r0
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2943ax.m14569d(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: e */
    public static java.lang.String m14570e(java.io.File r5) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        L19:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2943ax.m14570e(java.io.File):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: f */
    public static java.lang.String m14571f(java.lang.String r1) {
        /*
            r0 = 0
            return r0
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2943ax.m14571f(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: g */
    public static java.lang.String m14572g(byte[] r3) {
        /*
            r0 = 0
            return r0
        L18:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2943ax.m14572g(byte[]):java.lang.String");
    }
}
