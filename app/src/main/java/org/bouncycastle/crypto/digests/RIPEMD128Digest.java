package org.bouncycastle.crypto.digests;

/* JADX INFO: loaded from: classes2.dex */
public class RIPEMD128Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 16;

    /* JADX INFO: renamed from: H0 */
    private int f16102H0;

    /* JADX INFO: renamed from: H1 */
    private int f16103H1;

    /* JADX INFO: renamed from: H2 */
    private int f16104H2;

    /* JADX INFO: renamed from: H3 */
    private int f16105H3;

    /* JADX INFO: renamed from: X */
    private int[] f16106X;
    private int xOff;

    /* JADX WARN: Invalid debug info offset */
    public RIPEMD128Digest() {
    }

    /* JADX WARN: Invalid debug info offset */
    public RIPEMD128Digest(RIPEMD128Digest rIPEMD128Digest) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F1 */
    private int m23458F1(int i, int i2, int i3, int i4, int i5, int i6) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F2 */
    private int m23459F2(int i, int i2, int i3, int i4, int i5, int i6) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F3 */
    private int m23460F3(int i, int i2, int i3, int i4, int i5, int i6) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F4 */
    private int m23461F4(int i, int i2, int i3, int i4, int i5, int i6) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int FF1(int i, int i2, int i3, int i4, int i5, int i6) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int FF2(int i, int i2, int i3, int i4, int i5, int i6) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int FF3(int i, int i2, int i3, int i4, int i5, int i6) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int FF4(int i, int i2, int i3, int i4, int i5, int i6) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: RL */
    private int m23462RL(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    private int m23463f1(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f2 */
    private int m23464f2(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f3 */
    private int m23465f3(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f4 */
    private int m23466f4(int i, int i2, int i3) {
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
