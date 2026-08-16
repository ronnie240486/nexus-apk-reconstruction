package org.bouncycastle.crypto.paddings;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;

/* JADX INFO: loaded from: classes2.dex */
public class PaddedBufferedBlockCipher extends BufferedBlockCipher {
    BlockCipherPadding padding;

    /* JADX WARN: Invalid debug info offset */
    public PaddedBufferedBlockCipher(BlockCipher blockCipher) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PaddedBufferedBlockCipher(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0051
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] r6, int r7) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException, org.bouncycastle.crypto.InvalidCipherTextException {
        /*
            r5 = this;
            r0 = 0
            return r0
        L64:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher.doFinal(byte[], int):int");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b, byte[] bArr, int i) throws IllegalStateException, DataLengthException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalStateException, DataLengthException {
        return 0;
    }
}
