package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamCipher;

/* JADX INFO: loaded from: classes2.dex */
public class HC128Engine implements StreamCipher {
    private byte[] buf;
    private int cnt;
    private int idx;
    private boolean initialised;

    /* JADX INFO: renamed from: iv */
    private byte[] f16233iv;
    private byte[] key;

    /* JADX INFO: renamed from: p */
    private int[] f16234p;

    /* JADX INFO: renamed from: q */
    private int[] f16235q;

    /* JADX WARN: Invalid debug info offset */
    private static int dim(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    private static int m23497f1(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f2 */
    private static int m23498f2(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g1 */
    private int m23499g1(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g2 */
    private int m23500g2(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte getByte() {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    private int m23501h1(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h2 */
    private int m23502h2(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private void init() {
    }

    /* JADX WARN: Invalid debug info offset */
    private static int mod1024(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private static int mod512(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private static int rotateLeft(int i, int i2) {
        return 0;
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
