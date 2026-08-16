package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes2.dex */
public class BufferedBlockCipher {
    protected byte[] buf;
    protected int bufOff;
    protected BlockCipher cipher;
    protected boolean forEncryption;
    protected boolean partialBlockOkay;
    protected boolean pgpCFB;

    /* JADX WARN: Invalid debug info offset */
    public BufferedBlockCipher() {
    }

    /* JADX WARN: Invalid debug info offset */
    public BufferedBlockCipher(BlockCipher blockCipher) {
    }

    /* JADX WARN: Invalid debug info offset */
    public int doFinal(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getBlockSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getOutputSize(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public BlockCipher getUnderlyingCipher() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getUpdateOutputSize(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    public int processByte(byte b, byte[] bArr, int i) throws IllegalStateException, DataLengthException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalStateException, DataLengthException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void reset() {
    }
}
