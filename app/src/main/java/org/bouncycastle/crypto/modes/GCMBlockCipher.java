package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.modes.gcm.GCMMultiplier;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes2.dex */
public class GCMBlockCipher implements AEADBlockCipher {
    private static final int BLOCK_SIZE = 16;
    private static final byte[] ZEROES = new byte[16];

    /* JADX INFO: renamed from: A */
    private byte[] f16293A;

    /* JADX INFO: renamed from: H */
    private byte[] f16294H;

    /* JADX INFO: renamed from: J0 */
    private byte[] f16295J0;

    /* JADX INFO: renamed from: S */
    private byte[] f16296S;
    private byte[] bufBlock;
    private int bufOff;
    private BlockCipher cipher;
    private byte[] counter;
    private boolean forEncryption;
    private byte[] initS;
    private KeyParameter keyParam;
    private byte[] macBlock;
    private int macSize;
    private GCMMultiplier multiplier;
    private byte[] nonce;
    private long totalLength;

    /* JADX WARN: Invalid debug info offset */
    public GCMBlockCipher(BlockCipher blockCipher) {
    }

    /* JADX WARN: Invalid debug info offset */
    public GCMBlockCipher(BlockCipher blockCipher, GCMMultiplier gCMMultiplier) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void gCTRBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] gHASH(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static void packLength(long j, byte[] bArr, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    private int process(byte b, byte[] bArr, int i) throws DataLengthException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private void reset(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static void xor(byte[] bArr, byte[] bArr2) {
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

    /* JADX WARN: Invalid debug info offset */
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
    public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public void reset() {
    }
}
