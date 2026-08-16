package org.bouncycastle.crypto.modes;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* JADX INFO: loaded from: classes2.dex */
public class CCMBlockCipher implements AEADBlockCipher {
    private byte[] associatedText;
    private int blockSize;
    private BlockCipher cipher;
    private ByteArrayOutputStream data;
    private boolean forEncryption;
    private CipherParameters keyParam;
    private byte[] macBlock;
    private int macSize;
    private byte[] nonce;

    /* JADX WARN: Invalid debug info offset */
    public CCMBlockCipher(BlockCipher blockCipher) {
    }

    /* JADX WARN: Invalid debug info offset */
    private int calculateMac(byte[] bArr, int i, int i2, byte[] bArr2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean hasAssociatedText() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public int doFinal(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public String getAlgorithmName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public byte[] getMac() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public int getOutputSize(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return null;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public int getUpdateOutputSize(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public int processByte(byte b, byte[] bArr, int i) throws IllegalStateException, DataLengthException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalStateException, DataLengthException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] processPacket(byte[] bArr, int i, int i2) throws InvalidCipherTextException, IllegalStateException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public void reset() {
    }
}
