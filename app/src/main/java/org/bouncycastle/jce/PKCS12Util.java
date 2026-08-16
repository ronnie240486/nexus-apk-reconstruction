package org.bouncycastle.jce;

import java.io.IOException;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class PKCS12Util {
    /* JADX WARN: Invalid debug info offset */
    private static byte[] calculatePbeMac(DERObjectIdentifier dERObjectIdentifier, byte[] bArr, int i, char[] cArr, byte[] bArr2, String str) throws Exception {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static byte[] convertToDefiniteLength(byte[] bArr) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0049
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static byte[] convertToDefiniteLength(byte[] r10, char[] r11, java.lang.String r12) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        La8:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.PKCS12Util.convertToDefiniteLength(byte[], char[], java.lang.String):byte[]");
    }
}
