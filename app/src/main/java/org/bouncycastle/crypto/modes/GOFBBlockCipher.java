package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;

/* JADX INFO: loaded from: classes2.dex */
public class GOFBBlockCipher implements BlockCipher {

    /* JADX INFO: renamed from: C1 */
    static final int f16297C1 = 16843012;

    /* JADX INFO: renamed from: C2 */
    static final int f16298C2 = 16843009;

    /* JADX INFO: renamed from: IV */
    private byte[] f16299IV;

    /* JADX INFO: renamed from: N3 */
    int f16300N3;

    /* JADX INFO: renamed from: N4 */
    int f16301N4;
    private final int blockSize;
    private final BlockCipher cipher;
    boolean firstStep;
    private byte[] ofbOutV;
    private byte[] ofbV;

    /* JADX WARN: Invalid debug info offset */
    public GOFBBlockCipher(BlockCipher blockCipher) {
    }

    /* JADX WARN: Invalid debug info offset */
    private int bytesToint(byte[] bArr, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private void intTobytes(int i, byte[] bArr, int i2) {
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
    public BlockCipher getUnderlyingCipher() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
