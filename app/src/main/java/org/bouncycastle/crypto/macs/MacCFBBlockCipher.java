package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;

/* JADX INFO: loaded from: classes2.dex */
class MacCFBBlockCipher {

    /* JADX INFO: renamed from: IV */
    private byte[] f16281IV;
    private int blockSize;
    private byte[] cfbOutV;
    private byte[] cfbV;
    private BlockCipher cipher;

    /* JADX WARN: Invalid debug info offset */
    public MacCFBBlockCipher(BlockCipher blockCipher, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public String getAlgorithmName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getBlockSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void getMacBlock(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void reset() {
    }
}
