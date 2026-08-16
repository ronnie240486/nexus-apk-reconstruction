package p000;

import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;

/* JADX INFO: renamed from: bx */
/* JADX INFO: loaded from: classes.dex */
public class C3006bx {

    /* JADX INFO: renamed from: a */
    public static char[] f10224a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    public static MessageDigest f10225b;

    static {
        f10225b = null;
        try {
            f10225b = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            System.err.println(C3006bx.class.getName().concat("Failed to initialize，MessageDigest not support MD5Util。"));
            e.printStackTrace();
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static void m14703a(byte b, StringBuffer stringBuffer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static String m14704b(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static String m14705c(byte[] bArr, int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: d */
    public static boolean m14706d(java.lang.String r1, java.lang.String r2) {
        /*
            r0 = 0
            return r0
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3006bx.m14706d(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static String m14707e(File file) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @androidx.annotation.NonNull
    /* JADX INFO: renamed from: f */
    public static java.lang.String m14708f(java.io.InputStream r5, boolean r6) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        L14:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3006bx.m14708f(java.io.InputStream, boolean):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: g */
    public static java.lang.String m14709g(java.lang.String r1) {
        /*
            r0 = 0
            return r0
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3006bx.m14709g(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: h */
    public static java.lang.String m14710h(byte[] r3) {
        /*
            r0 = 0
            return r0
        L18:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3006bx.m14710h(byte[]):java.lang.String");
    }
}
