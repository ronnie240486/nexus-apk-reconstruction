package org.bouncycastle.crypto.digests;

/* JADX INFO: loaded from: classes2.dex */
public class MD4Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 16;
    private static final int S11 = 3;
    private static final int S12 = 7;
    private static final int S13 = 11;
    private static final int S14 = 19;
    private static final int S21 = 3;
    private static final int S22 = 5;
    private static final int S23 = 9;
    private static final int S24 = 13;
    private static final int S31 = 3;
    private static final int S32 = 9;
    private static final int S33 = 11;
    private static final int S34 = 15;

    /* JADX INFO: renamed from: H1 */
    private int f16092H1;

    /* JADX INFO: renamed from: H2 */
    private int f16093H2;

    /* JADX INFO: renamed from: H3 */
    private int f16094H3;

    /* JADX INFO: renamed from: H4 */
    private int f16095H4;

    /* JADX INFO: renamed from: X */
    private int[] f16096X;
    private int xOff;

    /* JADX WARN: Invalid debug info offset */
    public MD4Digest() {
    }

    /* JADX WARN: Invalid debug info offset */
    public MD4Digest(MD4Digest mD4Digest) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    private int m23451F(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    private int m23452G(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    private int m23453H(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int rotateLeft(int i, int i2) {
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
