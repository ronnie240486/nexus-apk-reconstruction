package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;

/* JADX INFO: loaded from: classes2.dex */
public class CBCBlockCipherMac implements Mac {
    private byte[] buf;
    private int bufOff;
    private BlockCipher cipher;
    private byte[] mac;
    private int macSize;
    private BlockCipherPadding padding;

    /* JADX WARN: Invalid debug info offset */
    public CBCBlockCipherMac(BlockCipher blockCipher) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CBCBlockCipherMac(BlockCipher blockCipher, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CBCBlockCipherMac(BlockCipher blockCipher, int i, BlockCipherPadding blockCipherPadding) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CBCBlockCipherMac(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) {
    }
}
