package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes2.dex */
public class SerpentEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;
    static final int PHI = -1640531527;
    static final int ROUNDS = 32;

    /* JADX INFO: renamed from: X0 */
    private int f16259X0;

    /* JADX INFO: renamed from: X1 */
    private int f16260X1;

    /* JADX INFO: renamed from: X2 */
    private int f16261X2;

    /* JADX INFO: renamed from: X3 */
    private int f16262X3;
    private boolean encrypting;
    private int[] wKey;

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: LT */
    private void m23505LT() {
    }

    /* JADX WARN: Invalid debug info offset */
    private int bytesToWord(byte[] bArr, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private void decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void ib0(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void ib1(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void ib2(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void ib3(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void ib4(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void ib5(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void ib6(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void ib7(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void inverseLT() {
    }

    /* JADX WARN: Invalid debug info offset */
    private int[] makeWorkingKey(byte[] bArr) throws IllegalArgumentException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private int rotateLeft(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int rotateRight(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private void sb0(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void sb1(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void sb2(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void sb3(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void sb4(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void sb5(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void sb6(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void sb7(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void wordToBytes(int i, byte[] bArr, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BlockCipher
    public final int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        return 0;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
