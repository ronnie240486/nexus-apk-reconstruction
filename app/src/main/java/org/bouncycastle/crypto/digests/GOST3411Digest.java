package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.ExtendedDigest;

/* JADX INFO: loaded from: classes2.dex */
public class GOST3411Digest implements ExtendedDigest {

    /* JADX INFO: renamed from: C2 */
    private static final byte[] f16066C2 = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};
    private static final int DIGEST_LENGTH = 32;

    /* JADX INFO: renamed from: C */
    private byte[][] f16067C;

    /* JADX INFO: renamed from: H */
    private byte[] f16068H;

    /* JADX INFO: renamed from: K */
    private byte[] f16069K;

    /* JADX INFO: renamed from: L */
    private byte[] f16070L;

    /* JADX INFO: renamed from: M */
    private byte[] f16071M;

    /* JADX INFO: renamed from: S */
    byte[] f16072S;
    private byte[] Sum;

    /* JADX INFO: renamed from: U */
    byte[] f16073U;

    /* JADX INFO: renamed from: V */
    byte[] f16074V;

    /* JADX INFO: renamed from: W */
    byte[] f16075W;

    /* JADX INFO: renamed from: a */
    byte[] f16076a;
    private long byteCount;
    private BlockCipher cipher;
    private byte[] sBox;

    /* JADX INFO: renamed from: wS */
    short[] f16077wS;
    short[] w_S;
    private byte[] xBuf;
    private int xBufOff;

    /* JADX WARN: Invalid debug info offset */
    public GOST3411Digest() {
    }

    /* JADX WARN: Invalid debug info offset */
    public GOST3411Digest(GOST3411Digest gOST3411Digest) {
    }

    /* JADX WARN: Invalid debug info offset */
    public GOST3411Digest(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    private byte[] m23446A(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    private void m23447E(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    private byte[] m23448P(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private void cpyBytesToShort(byte[] bArr, short[] sArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void cpyShortToBytes(short[] sArr, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void finish() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: fw */
    private void m23449fw(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void sumByteArray(byte[] bArr) {
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
    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void processBlock(byte[] bArr, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
    }
}
