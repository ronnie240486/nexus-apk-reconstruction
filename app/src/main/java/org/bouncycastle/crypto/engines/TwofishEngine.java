package org.bouncycastle.crypto.engines;

import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.dom4j.p020io.SAXEventRecorder;
import p000.C4783m8;

/* JADX INFO: loaded from: classes2.dex */
public final class TwofishEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;
    private static final int GF256_FDBK = 361;
    private static final int GF256_FDBK_2 = 180;
    private static final int GF256_FDBK_4 = 90;
    private static final int INPUT_WHITEN = 0;
    private static final int MAX_KEY_BITS = 256;
    private static final int MAX_ROUNDS = 16;
    private static final int OUTPUT_WHITEN = 4;

    /* JADX INFO: renamed from: P */
    private static final byte[][] f16267P = {new byte[]{-87, 103, -77, -24, 4, -3, -93, 118, -102, -110, C4783m8.f15110b, 120, -28, -35, -47, 56, 13, -58, 53, -104, 24, -9, -20, 108, 67, 117, 55, 38, -6, SAXEventRecorder.SAXEvent.f16653v, -108, 72, -14, -48, -117, 48, -124, 84, -33, 35, 25, 91, 61, 89, -13, -82, -94, -126, 99, 1, -125, 46, -39, 81, -101, 124, -90, -21, -91, -66, 22, SAXEventRecorder.SAXEvent.f16646o, -29, 97, -64, -116, 58, -11, 115, 44, 37, SAXEventRecorder.SAXEvent.f16645n, -69, 78, -119, 107, 83, 106, -76, -15, -31, -26, -67, 69, -30, -12, -74, 102, -52, -107, 3, 86, -44, 28, 30, -41, -5, -61, -114, -75, -23, -49, -65, -70, -22, 119, 57, -81, 51, -55, 98, 113, -127, 121, 9, -83, 36, -51, -7, -40, -27, -59, -71, 77, 68, 8, -122, -25, -95, 29, -86, -19, 6, 112, -78, -46, 65, 123, -96, SAXEventRecorder.SAXEvent.f16651t, 49, -62, 39, -112, 32, -10, 96, -1, -106, 92, -79, -85, -98, -100, 82, 27, 95, -109, 10, -17, -111, -123, 73, -18, 45, 79, -113, 59, 71, -121, 109, 70, -42, 62, 105, 100, 42, -50, -53, 47, -4, -105, 5, 122, -84, C4783m8.f15111c, -43, 26, 75, SAXEventRecorder.SAXEvent.f16648q, -89, 90, 40, 20, 63, 41, -120, 60, 76, 2, -72, -38, -80, 23, 85, 31, -118, 125, 87, -57, -115, 116, -73, -60, -97, 114, 126, 21, 34, SAXEventRecorder.SAXEvent.f16652u, 88, 7, -103, 52, 110, 80, -34, 104, 101, PSSSigner.TRAILER_IMPLICIT, -37, -8, -56, -88, 43, 64, -36, -2, 50, -92, -54, 16, PublicSuffixDatabase.f15556i, -16, -45, 93, SAXEventRecorder.SAXEvent.f16649r, 0, 111, -99, 54, 66, 74, 94, -63, -32}, new byte[]{117, -13, -58, -12, -37, 123, -5, -56, 74, -45, -26, 107, 69, 125, -24, 75, -42, 50, -40, -3, 55, 113, -15, -31, 48, SAXEventRecorder.SAXEvent.f16649r, -8, 27, -121, -6, 6, 63, 94, -70, -82, 91, -118, 0, PSSSigner.TRAILER_IMPLICIT, -99, 109, -63, -79, SAXEventRecorder.SAXEvent.f16648q, C4783m8.f15110b, 93, -46, -43, -96, -124, 7, 20, -75, -112, 44, -93, -78, 115, 76, 84, -110, 116, 54, 81, 56, -80, -67, 90, -4, 96, 98, -106, 108, 66, -9, 16, 124, 40, 39, -116, SAXEventRecorder.SAXEvent.f16653v, -107, -100, -57, 36, 70, 59, 112, -54, -29, -123, -53, SAXEventRecorder.SAXEvent.f16651t, -48, -109, -72, -90, -125, 32, -1, -97, 119, -61, -52, 3, 111, 8, -65, 64, -25, 43, -30, 121, SAXEventRecorder.SAXEvent.f16646o, -86, -126, 65, 58, -22, -71, -28, -102, -92, -105, 126, -38, 122, 23, 102, -108, -95, 29, 61, -16, -34, -77, SAXEventRecorder.SAXEvent.f16645n, 114, -89, 28, -17, -47, 83, 62, -113, 51, 38, 95, -20, 118, 42, 73, -127, -120, -18, PublicSuffixDatabase.f15556i, -60, 26, -21, -39, -59, 57, -103, -51, -83, 49, -117, 1, 24, 35, -35, 31, 78, 45, -7, 72, 79, -14, 101, -114, 120, 92, 88, 25, -115, -27, -104, 87, 103, C4783m8.f15111c, 5, 100, -81, 99, -74, -2, -11, -73, 60, -91, -50, -23, 104, 68, -32, 77, 67, 105, 41, 46, -84, 21, 89, -88, 10, -98, 110, 71, -33, 52, 53, 106, -49, -36, 34, -55, -64, -101, -119, -44, -19, -85, SAXEventRecorder.SAXEvent.f16652u, -94, 13, 82, -69, 2, 47, -87, -41, 97, 30, -76, 80, 4, -10, -62, 22, 37, -122, 86, 85, 9, -66, -111}};
    private static final int P_00 = 1;
    private static final int P_01 = 0;
    private static final int P_02 = 0;
    private static final int P_03 = 1;
    private static final int P_04 = 1;
    private static final int P_10 = 0;
    private static final int P_11 = 0;
    private static final int P_12 = 1;
    private static final int P_13 = 1;
    private static final int P_14 = 0;
    private static final int P_20 = 1;
    private static final int P_21 = 1;
    private static final int P_22 = 0;
    private static final int P_23 = 0;
    private static final int P_24 = 0;
    private static final int P_30 = 0;
    private static final int P_31 = 1;
    private static final int P_32 = 1;
    private static final int P_33 = 0;
    private static final int P_34 = 1;
    private static final int ROUNDS = 16;
    private static final int ROUND_SUBKEYS = 8;
    private static final int RS_GF_FDBK = 333;
    private static final int SK_BUMP = 16843009;
    private static final int SK_ROTL = 9;
    private static final int SK_STEP = 33686018;
    private static final int TOTAL_SUBKEYS = 40;
    private boolean encrypting;
    private int[] gMDS0;
    private int[] gMDS1;
    private int[] gMDS2;
    private int[] gMDS3;
    private int[] gSBox;
    private int[] gSubKeys;
    private int k64Cnt;
    private byte[] workingKey;

    /* JADX WARN: Invalid debug info offset */
    private void Bits32ToBytes(int i, byte[] bArr, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private int BytesTo32Bits(byte[] bArr, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int F32(int i, int[] iArr) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int Fe32_0(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int Fe32_3(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int LFSR1(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int LFSR2(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int Mx_X(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int Mx_Y(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int RS_MDS_Encode(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int RS_rem(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    private int m23508b0(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    private int m23509b1(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b2 */
    private int m23510b2(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b3 */
    private int m23511b3(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private void decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void setKey(byte[] bArr) {
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
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
