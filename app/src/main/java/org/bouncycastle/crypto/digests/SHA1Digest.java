package org.bouncycastle.crypto.digests;

/* JADX INFO: loaded from: classes2.dex */
public class SHA1Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 20;

    /* JADX INFO: renamed from: Y1 */
    private static final int f16133Y1 = 1518500249;

    /* JADX INFO: renamed from: Y2 */
    private static final int f16134Y2 = 1859775393;

    /* JADX INFO: renamed from: Y3 */
    private static final int f16135Y3 = -1894007588;

    /* JADX INFO: renamed from: Y4 */
    private static final int f16136Y4 = -899497514;

    /* JADX INFO: renamed from: H1 */
    private int f16137H1;

    /* JADX INFO: renamed from: H2 */
    private int f16138H2;

    /* JADX INFO: renamed from: H3 */
    private int f16139H3;

    /* JADX INFO: renamed from: H4 */
    private int f16140H4;

    /* JADX INFO: renamed from: H5 */
    private int f16141H5;

    /* JADX INFO: renamed from: X */
    private int[] f16142X;
    private int xOff;

    /* JADX WARN: Invalid debug info offset */
    public SHA1Digest() {
    }

    /* JADX WARN: Invalid debug info offset */
    public SHA1Digest(SHA1Digest sHA1Digest) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    private int m23488f(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    private int m23489g(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    private int m23490h(int i, int i2, int i3) {
        return 0;
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
