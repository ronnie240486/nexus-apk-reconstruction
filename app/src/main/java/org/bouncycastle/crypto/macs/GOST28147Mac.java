package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public class GOST28147Mac implements Mac {

    /* JADX INFO: renamed from: S */
    private byte[] f16280S;
    private int blockSize;
    private byte[] buf;
    private int bufOff;
    private boolean firstStep;
    private byte[] mac;
    private int macSize;
    private int[] workingKey;

    /* JADX WARN: Invalid debug info offset */
    private byte[] CM5func(byte[] bArr, int i, byte[] bArr2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private int bytesToint(byte[] bArr, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int[] generateWorkingKey(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private void gost28147MacFunc(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private int gost28147_mainStep(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private void intTobytes(int i, byte[] bArr, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, DataLengthException {
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
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) throws IllegalStateException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) throws IllegalStateException, DataLengthException {
    }
}
