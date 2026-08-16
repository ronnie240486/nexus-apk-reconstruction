package org.bouncycastle.crypto.digests;

/* JADX INFO: loaded from: classes2.dex */
public class RIPEMD160Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 20;

    /* JADX INFO: renamed from: H0 */
    private int f16107H0;

    /* JADX INFO: renamed from: H1 */
    private int f16108H1;

    /* JADX INFO: renamed from: H2 */
    private int f16109H2;

    /* JADX INFO: renamed from: H3 */
    private int f16110H3;

    /* JADX INFO: renamed from: H4 */
    private int f16111H4;

    /* JADX INFO: renamed from: X */
    private int[] f16112X;
    private int xOff;

    /* JADX WARN: Invalid debug info offset */
    public RIPEMD160Digest() {
    }

    /* JADX WARN: Invalid debug info offset */
    public RIPEMD160Digest(RIPEMD160Digest rIPEMD160Digest) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: RL */
    private int m23467RL(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    private int m23468f1(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f2 */
    private int m23469f2(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f3 */
    private int m23470f3(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f4 */
    private int m23471f4(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f5 */
    private int m23472f5(int i, int i2, int i3) {
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
