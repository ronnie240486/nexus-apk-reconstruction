package org.bouncycastle.crypto.engines;

/* JADX INFO: loaded from: classes2.dex */
public final class CAST6Engine extends CAST5Engine {
    protected static final int BLOCK_SIZE = 16;
    protected static final int ROUNDS = 12;
    protected int[] _Km;
    protected int[] _Kr;
    protected int[] _Tm;
    protected int[] _Tr;
    private int[] _workingKey;

    /* JADX WARN: Invalid debug info offset */
    public final void CAST_Decipher(int i, int i2, int i3, int i4, int[] iArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void CAST_Encipher(int i, int i2, int i3, int i4, int[] iArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.engines.CAST5Engine
    public int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.engines.CAST5Engine
    public int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.engines.CAST5Engine, org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.engines.CAST5Engine, org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 0;
    }

    @Override // org.bouncycastle.crypto.engines.CAST5Engine, org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.engines.CAST5Engine
    public void setKey(byte[] bArr) {
    }
}
