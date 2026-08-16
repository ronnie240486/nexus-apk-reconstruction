package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class UrlBase64 {
    private static final Encoder encoder = new UrlBase64Encoder();

    /* JADX WARN: Invalid debug info offset */
    public static int decode(String str, OutputStream outputStream) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static int decode(byte[] bArr, OutputStream outputStream) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static byte[] decode(java.lang.String r2) {
        /*
            r0 = 0
            return r0
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.util.encoders.UrlBase64.decode(java.lang.String):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static byte[] decode(byte[] r4) {
        /*
            r0 = 0
            return r0
        L11:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.util.encoders.UrlBase64.decode(byte[]):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    public static int encode(byte[] bArr, OutputStream outputStream) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static byte[] encode(byte[] r4) {
        /*
            r0 = 0
            return r0
        L11:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.util.encoders.UrlBase64.encode(byte[]):byte[]");
    }
}
