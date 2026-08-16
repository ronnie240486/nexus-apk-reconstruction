package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public class BlockCipherMac implements Mac {
    private byte[] buf;
    private int bufOff;
    private BlockCipher cipher;
    private byte[] mac;
    private int macSize;

    /* JADX WARN: Invalid debug info offset */
    public BlockCipherMac(BlockCipher blockCipher) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BlockCipherMac(BlockCipher blockCipher, int i) {
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
