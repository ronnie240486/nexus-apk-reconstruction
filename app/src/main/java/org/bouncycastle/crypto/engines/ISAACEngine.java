package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.StreamCipher;

/* JADX INFO: loaded from: classes2.dex */
public class ISAACEngine implements StreamCipher {

    /* JADX INFO: renamed from: a */
    private int f16239a;

    /* JADX INFO: renamed from: b */
    private int f16240b;

    /* JADX INFO: renamed from: c */
    private int f16241c;
    private int[] engineState;
    private int index;
    private boolean initialised;
    private byte[] keyStream;
    private int[] results;
    private final int sizeL;
    private final int stateArraySize;
    private byte[] workingKey;

    /* JADX WARN: Invalid debug info offset */
    private int byteToIntLittle(byte[] bArr, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] intToByteLittle(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] intToByteLittle(int[] iArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private void isaac() {
    }

    /* JADX WARN: Invalid debug info offset */
    private void mix(int[] iArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void setKey(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z, CipherParameters cipherParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.StreamCipher
    public void processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
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
