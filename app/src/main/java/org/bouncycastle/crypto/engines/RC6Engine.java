package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes2.dex */
public class RC6Engine implements BlockCipher {
    private static final int LGW = 5;
    private static final int P32 = -1209970333;
    private static final int Q32 = -1640531527;
    private static final int _noRounds = 20;
    private static final int bytesPerWord = 4;
    private static final int wordSize = 32;

    /* JADX INFO: renamed from: _S */
    private int[] f16248_S;
    private boolean forEncryption;

    /* JADX WARN: Invalid debug info offset */
    private int bytesToWord(byte[] bArr, int i) {
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
    private int rotateLeft(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int rotateRight(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private void setKey(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void wordToBytes(int i, byte[] bArr, int i2) {
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
