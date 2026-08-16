package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes2.dex */
public class XTEAEngine implements BlockCipher {
    private static final int block_size = 8;
    private static final int delta = -1640531527;
    private static final int rounds = 32;

    /* JADX INFO: renamed from: _S */
    private int[] f16271_S;
    private boolean _forEncryption;
    private boolean _initialised;
    private int[] _sum0;
    private int[] _sum1;

    /* JADX WARN: Invalid debug info offset */
    private int bytesToInt(byte[] bArr, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private void setKey(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void unpackInt(int i, byte[] bArr, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        return 0;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
