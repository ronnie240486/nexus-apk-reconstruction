package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.macs.HMac;

/* JADX INFO: loaded from: classes2.dex */
public class TlsMac {
    protected HMac mac;
    protected long seqNo;

    /* JADX WARN: Invalid debug info offset */
    public TlsMac(Digest digest, byte[] bArr, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public byte[] calculateMac(short r6, byte[] r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = 0
            return r0
        L38:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.tls.TlsMac.calculateMac(short, byte[], int, int):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    public int getSize() {
        return 0;
    }
}
