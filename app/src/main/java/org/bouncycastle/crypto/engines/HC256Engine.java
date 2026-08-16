package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamCipher;

/* JADX INFO: loaded from: classes2.dex */
public class HC256Engine implements StreamCipher {
    private byte[] buf;
    private int cnt;
    private int idx;
    private boolean initialised;

    /* JADX INFO: renamed from: iv */
    private byte[] f16236iv;
    private byte[] key;

    /* JADX INFO: renamed from: p */
    private int[] f16237p;

    /* JADX INFO: renamed from: q */
    private int[] f16238q;

    /* JADX WARN: Invalid debug info offset */
    private byte getByte() {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private void init() {
    }

    /* JADX WARN: Invalid debug info offset */
    private static int rotateRight(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int step() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.StreamCipher
    public void processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b) {
        return (byte) 0;
    }
}
