package org.bouncycastle.crypto.digests;

/* JADX INFO: loaded from: classes2.dex */
public class RIPEMD320Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 40;

    /* JADX INFO: renamed from: H0 */
    private int f16122H0;

    /* JADX INFO: renamed from: H1 */
    private int f16123H1;

    /* JADX INFO: renamed from: H2 */
    private int f16124H2;

    /* JADX INFO: renamed from: H3 */
    private int f16125H3;

    /* JADX INFO: renamed from: H4 */
    private int f16126H4;

    /* JADX INFO: renamed from: H5 */
    private int f16127H5;

    /* JADX INFO: renamed from: H6 */
    private int f16128H6;

    /* JADX INFO: renamed from: H7 */
    private int f16129H7;

    /* JADX INFO: renamed from: H8 */
    private int f16130H8;

    /* JADX INFO: renamed from: H9 */
    private int f16131H9;

    /* JADX INFO: renamed from: X */
    private int[] f16132X;
    private int xOff;

    /* JADX WARN: Invalid debug info offset */
    public RIPEMD320Digest() {
    }

    /* JADX WARN: Invalid debug info offset */
    public RIPEMD320Digest(RIPEMD320Digest rIPEMD320Digest) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: RL */
    private int m23482RL(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    private int m23483f1(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f2 */
    private int m23484f2(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f3 */
    private int m23485f3(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f4 */
    private int m23486f4(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f5 */
    private int m23487f5(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private void unpackWord(int i, byte[] bArr, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
    }
}
