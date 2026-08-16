package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public class CMac implements Mac {
    private static final byte CONSTANT_128 = -121;
    private static final byte CONSTANT_64 = 27;

    /* JADX INFO: renamed from: L */
    private byte[] f16278L;

    /* JADX INFO: renamed from: Lu */
    private byte[] f16279Lu;
    private byte[] Lu2;
    private byte[] ZEROES;
    private byte[] buf;
    private int bufOff;
    private BlockCipher cipher;
    private byte[] mac;
    private int macSize;

    /* JADX WARN: Invalid debug info offset */
    public CMac(BlockCipher blockCipher) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CMac(BlockCipher blockCipher, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] doubleLu(byte[] bArr) {
        return null;
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
