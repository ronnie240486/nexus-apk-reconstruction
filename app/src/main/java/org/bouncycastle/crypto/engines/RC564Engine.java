package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes2.dex */
public class RC564Engine implements BlockCipher {
    private static final long P64 = -5196783011329398165L;
    private static final long Q64 = -7046029254386353131L;
    private static final int bytesPerWord = 8;
    private static final int wordSize = 64;

    /* JADX INFO: renamed from: _S */
    private long[] f16247_S;
    private int _noRounds;
    private boolean forEncryption;

    /* JADX WARN: Invalid debug info offset */
    private long bytesToWord(byte[] bArr, int i) {
        return 0L;
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
    private long rotateLeft(long j, long j2) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    private long rotateRight(long j, long j2) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    private void setKey(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void wordToBytes(long j, byte[] bArr, int i) {
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
