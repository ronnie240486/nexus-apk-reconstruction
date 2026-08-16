package org.bouncycastle.crypto.engines;

import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.dom4j.p020io.SAXEventRecorder;
import p000.C4783m8;

/* JADX INFO: loaded from: classes2.dex */
public class RC2Engine implements BlockCipher {
    private static final int BLOCK_SIZE = 8;
    private static byte[] piTable = {-39, 120, -7, -60, 25, -35, -75, -19, 40, -23, -3, 121, 74, -96, -40, -99, -58, 126, 55, -125, 43, 118, 83, -114, 98, 76, 100, -120, 68, -117, -5, -94, 23, -102, 89, -11, -121, -77, 79, SAXEventRecorder.SAXEvent.f16653v, 97, 69, 109, -115, 9, -127, 125, 50, -67, -113, 64, -21, -122, -73, 123, SAXEventRecorder.SAXEvent.f16645n, -16, -107, PublicSuffixDatabase.f15556i, 34, 92, 107, 78, -126, 84, -42, 101, -109, -50, 96, -78, 28, 115, 86, -64, 20, -89, -116, -15, -36, SAXEventRecorder.SAXEvent.f16652u, 117, -54, 31, 59, -66, -28, -47, 66, 61, -44, 48, -93, 60, -74, 38, 111, -65, SAXEventRecorder.SAXEvent.f16648q, -38, 70, 105, 7, 87, 39, -14, 29, -101, PSSSigner.TRAILER_IMPLICIT, -108, 67, 3, -8, SAXEventRecorder.SAXEvent.f16651t, -57, -10, -112, -17, 62, -25, 6, -61, -43, 47, -56, 102, 30, -41, 8, -24, -22, -34, C4783m8.f15110b, 82, -18, -9, -124, -86, 114, -84, 53, 77, 106, 42, -106, 26, -46, 113, 90, 21, 73, 116, 75, -97, -48, 94, 4, 24, -92, -20, -62, -32, 65, 110, SAXEventRecorder.SAXEvent.f16649r, 81, -53, -52, 36, -111, -81, 80, -95, -12, 112, 57, -103, 124, 58, -123, 35, -72, -76, 122, -4, 2, 54, 91, 37, 85, -105, 49, 45, 93, -6, -104, -29, -118, -110, -82, 5, -33, 41, 16, 103, 108, -70, -55, -45, 0, -26, -49, -31, -98, -88, 44, 99, 22, 1, 63, 88, -30, -119, -87, 13, 56, 52, 27, -85, 51, -1, -80, -69, 72, SAXEventRecorder.SAXEvent.f16646o, 95, -71, -79, -51, 46, -59, -13, -37, 71, -27, -91, -100, 119, 10, -90, 32, 104, -2, C4783m8.f15111c, -63, -83};
    private boolean encrypting;
    private int[] workingKey;

    /* JADX WARN: Invalid debug info offset */
    private void decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private int[] generateWorkingKey(byte[] bArr, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private int rotateWordLeft(int i, int i2) {
        return 0;
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
