package org.bouncycastle.crypto.digests;

import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.dom4j.p020io.SAXEventRecorder;
import p000.C4783m8;

/* JADX INFO: loaded from: classes2.dex */
public class MD2Digest implements ExtendedDigest {
    private static final int DIGEST_LENGTH = 16;

    /* JADX INFO: renamed from: S */
    private static final byte[] f16088S = {41, 46, 67, -55, -94, -40, 124, 1, 61, 54, 84, -95, -20, -16, 6, SAXEventRecorder.SAXEvent.f16653v, 98, -89, 5, -13, -64, -57, 115, -116, -104, -109, 43, -39, PSSSigner.TRAILER_IMPLICIT, 76, -126, -54, 30, -101, 87, 60, -3, -44, -32, 22, 103, 66, 111, 24, -118, 23, -27, SAXEventRecorder.SAXEvent.f16652u, -66, 78, -60, -42, -38, -98, -34, 73, -96, -5, -11, -114, -69, 47, -18, 122, -87, 104, 121, -111, 21, -78, 7, 63, -108, -62, 16, -119, SAXEventRecorder.SAXEvent.f16645n, 34, 95, PublicSuffixDatabase.f15556i, C4783m8.f15110b, C4783m8.f15111c, 93, -102, 90, -112, 50, 39, 53, 62, -52, -25, -65, -9, -105, 3, -1, 25, 48, -77, 72, -91, -75, -47, -41, 94, -110, 42, -84, 86, -86, -58, 79, -72, 56, -46, -106, -92, 125, -74, 118, -4, 107, -30, -100, 116, 4, -15, 69, -99, 112, 89, 100, 113, -121, 32, -122, 91, -49, 101, -26, 45, -88, 2, 27, 96, 37, -83, -82, -80, -71, -10, 28, 70, 97, 105, 52, 64, 126, SAXEventRecorder.SAXEvent.f16649r, 85, 71, -93, 35, -35, 81, -81, 58, -61, 92, -7, -50, -70, -59, -22, 38, 44, 83, 13, 110, -123, 40, -124, 9, -45, -33, -51, -12, 65, -127, 77, 82, 106, -36, 55, -56, 108, -63, -85, -6, 36, -31, 123, 8, SAXEventRecorder.SAXEvent.f16646o, -67, -79, 74, 120, -120, -107, -117, -29, 99, -24, 109, -23, -53, -43, -2, 59, 0, 29, 57, -14, -17, -73, SAXEventRecorder.SAXEvent.f16648q, 102, 88, -48, -28, -90, 119, 114, -8, -21, 117, 75, 10, 49, 68, 80, -76, -113, -19, 31, 26, -37, -103, -115, 51, -97, SAXEventRecorder.SAXEvent.f16651t, -125, 20};

    /* JADX INFO: renamed from: C */
    private byte[] f16089C;
    private int COff;

    /* JADX INFO: renamed from: M */
    private byte[] f16090M;

    /* JADX INFO: renamed from: X */
    private byte[] f16091X;
    private int mOff;
    private int xOff;

    /* JADX WARN: Invalid debug info offset */
    public MD2Digest() {
    }

    /* JADX WARN: Invalid debug info offset */
    public MD2Digest(MD2Digest mD2Digest) {
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
    public void processBlock(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void processCheckSum(byte[] bArr) {
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
