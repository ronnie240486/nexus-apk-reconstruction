package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes2.dex */
public class Salsa20Engine implements StreamCipher {
    private static final int stateSize = 16;
    private int cW0;
    private int cW1;
    private int cW2;
    private int[] engineState;
    private int index;
    private boolean initialised;
    private byte[] keyStream;
    private byte[] workingIV;
    private byte[] workingKey;

    /* JADX INFO: renamed from: x */
    private int[] f16258x;
    private static final byte[] sigma = Strings.toByteArray("expand 32-byte k");
    private static final byte[] tau = Strings.toByteArray("expand 16-byte k");

    /* JADX WARN: Invalid debug info offset */
    private int byteToIntLittle(byte[] bArr, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] intToByteLittle(int i, byte[] bArr, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean limitExceeded() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean limitExceeded(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private void resetCounter() {
    }

    /* JADX WARN: Invalid debug info offset */
    private int rotl(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private void salsa20WordToByte(int[] iArr, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void setKey(byte[] bArr, byte[] bArr2) {
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
