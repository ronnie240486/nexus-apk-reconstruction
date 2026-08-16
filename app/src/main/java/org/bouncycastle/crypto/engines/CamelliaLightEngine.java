package org.bouncycastle.crypto.engines;

import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.dom4j.p020io.SAXEventRecorder;
import p000.C4783m8;

/* JADX INFO: loaded from: classes2.dex */
public class CamelliaLightEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;
    private static final int MASK8 = 255;
    private boolean _keyis128;
    private boolean initialized;

    /* JADX INFO: renamed from: ke */
    private int[] f16229ke;

    /* JADX INFO: renamed from: kw */
    private int[] f16230kw;
    private int[] state;
    private int[] subkey;
    private static final int[] SIGMA = {-1600231809, 1003262091, -1233459112, 1286239154, -957401297, -380665154, 1426019237, -237801700, 283453434, -563598051, -1336506174, -1276722691};
    private static final byte[] SBOX1 = {112, -126, 44, -20, -77, 39, -64, -27, -28, -123, 87, 53, -22, SAXEventRecorder.SAXEvent.f16646o, -82, 65, 35, -17, 107, -109, 69, 25, -91, PublicSuffixDatabase.f15556i, -19, SAXEventRecorder.SAXEvent.f16648q, 79, 78, 29, 101, -110, -67, -122, -72, -81, -113, 124, -21, 31, -50, 62, 48, -36, 95, 94, -59, SAXEventRecorder.SAXEvent.f16645n, 26, -90, -31, 57, -54, -43, 71, 93, 61, -39, 1, 90, -42, 81, 86, 108, 77, -117, 13, -102, 102, -5, -52, -80, 45, 116, SAXEventRecorder.SAXEvent.f16652u, 43, 32, -16, -79, -124, -103, -33, 76, -53, -62, 52, 126, 118, 5, 109, -73, -87, 49, -47, 23, 4, -41, 20, 88, 58, 97, -34, 27, SAXEventRecorder.SAXEvent.f16651t, 28, 50, SAXEventRecorder.SAXEvent.f16649r, -100, 22, 83, 24, -14, 34, -2, 68, -49, -78, -61, -75, 122, -111, 36, 8, -24, -88, 96, -4, 105, 80, -86, -48, -96, 125, -95, -119, 98, -105, 84, 91, 30, -107, -32, -1, 100, -46, 16, -60, 0, 72, -93, -9, 117, -37, -118, 3, -26, -38, 9, 63, -35, -108, -121, 92, -125, 2, -51, 74, -112, 51, 115, 103, -10, -13, -99, C4783m8.f15111c, -65, -30, 82, -101, -40, 38, -56, 55, -58, 59, -127, -106, 111, 75, SAXEventRecorder.SAXEvent.f16653v, -66, 99, 46, -23, 121, -89, -116, -97, 110, PSSSigner.TRAILER_IMPLICIT, -114, 41, -11, -7, -74, 47, -3, -76, 89, 120, -104, 6, 106, -25, 70, 113, -70, -44, 37, -85, 66, -120, -94, -115, -6, 114, 7, -71, 85, -8, -18, -84, 10, 54, 73, 42, 104, 60, 56, -15, -92, 64, 40, -45, 123, -69, -55, 67, -63, 21, -29, -83, -12, 119, -57, C4783m8.f15110b, -98};

    /* JADX WARN: Invalid debug info offset */
    private int bytes2int(byte[] bArr, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private void camelliaF2(int[] iArr, int[] iArr2, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void camelliaFLs(int[] iArr, int[] iArr2, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static void decroldq(int i, int[] iArr, int i2, int[] iArr2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static void decroldqo32(int i, int[] iArr, int i2, int[] iArr2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void int2bytes(int i, byte[] bArr, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private byte lRot8(byte b, int i) {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private static int leftRotate(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int processBlock128(byte[] bArr, int i, byte[] bArr2, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int processBlock192or256(byte[] bArr, int i, byte[] bArr2, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private static int rightRotate(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private static void roldq(int i, int[] iArr, int i2, int[] iArr2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static void roldqo32(int i, int[] iArr, int i2, int[] iArr2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    private int sbox2(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int sbox3(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int sbox4(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private void setKey(boolean z, byte[] bArr) {
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
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException {
        return 0;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
