package org.bouncycastle.crypto.digests;

/* JADX INFO: loaded from: classes2.dex */
public class SHA224Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 28;

    /* JADX INFO: renamed from: K */
    static final int[] f16143K = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* JADX INFO: renamed from: H1 */
    private int f16144H1;

    /* JADX INFO: renamed from: H2 */
    private int f16145H2;

    /* JADX INFO: renamed from: H3 */
    private int f16146H3;

    /* JADX INFO: renamed from: H4 */
    private int f16147H4;

    /* JADX INFO: renamed from: H5 */
    private int f16148H5;

    /* JADX INFO: renamed from: H6 */
    private int f16149H6;

    /* JADX INFO: renamed from: H7 */
    private int f16150H7;

    /* JADX INFO: renamed from: H8 */
    private int f16151H8;

    /* JADX INFO: renamed from: X */
    private int[] f16152X;
    private int xOff;

    /* JADX WARN: Invalid debug info offset */
    public SHA224Digest() {
    }

    /* JADX WARN: Invalid debug info offset */
    public SHA224Digest(SHA224Digest sHA224Digest) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Ch */
    private int m23491Ch(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int Maj(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int Sum0(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int Sum1(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int Theta0(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int Theta1(int i) {
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
