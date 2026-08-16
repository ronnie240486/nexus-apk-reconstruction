package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamCipher;

/* JADX INFO: loaded from: classes2.dex */
public class Grain128Engine implements StreamCipher {
    private static final int STATE_SIZE = 4;
    private int index;
    private boolean initialised;
    private int[] lfsr;
    private int[] nfsr;
    private byte[] out;
    private int output;
    private byte[] workingIV;
    private byte[] workingKey;

    /* JADX WARN: Invalid debug info offset */
    private byte getKeyStream() {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int getOutput() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int getOutputLFSR() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int getOutputNFSR() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private void initGrain() {
    }

    /* JADX WARN: Invalid debug info offset */
    private void oneRound() {
    }

    /* JADX WARN: Invalid debug info offset */
    private void setKey(byte[] bArr, byte[] bArr2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private int[] shift(int[] iArr, int i) {
        return null;
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
