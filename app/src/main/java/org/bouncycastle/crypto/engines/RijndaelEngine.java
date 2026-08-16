package org.bouncycastle.crypto.engines;

import com.afollestad.materialdialogs.BuildConfig;
import com.tencent.smtt.sdk.TbsListener;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.dom4j.p020io.SAXEventRecorder;
import p000.C4783m8;

/* JADX INFO: loaded from: classes2.dex */
public class RijndaelEngine implements BlockCipher {
    private static final int MAXKC = 64;
    private static final int MAXROUNDS = 14;

    /* JADX INFO: renamed from: A0 */
    private long f16252A0;

    /* JADX INFO: renamed from: A1 */
    private long f16253A1;

    /* JADX INFO: renamed from: A2 */
    private long f16254A2;

    /* JADX INFO: renamed from: A3 */
    private long f16255A3;

    /* JADX INFO: renamed from: BC */
    private int f16256BC;
    private long BC_MASK;
    private int ROUNDS;
    private int blockBits;
    private boolean forEncryption;
    private byte[] shifts0SC;
    private byte[] shifts1SC;
    private long[][] workingKey;
    private static final byte[] logtable = {0, 0, 25, 1, 50, 2, 26, -58, 75, -57, 27, 104, 51, -18, -33, 3, 100, 4, -32, SAXEventRecorder.SAXEvent.f16648q, 52, -115, -127, -17, 76, 113, 8, -56, -8, 105, 28, -63, 125, -62, 29, -75, -7, -71, 39, 106, 77, -28, -90, 114, -102, -55, 9, 120, 101, 47, -118, 5, PublicSuffixDatabase.f15556i, SAXEventRecorder.SAXEvent.f16649r, -31, 36, SAXEventRecorder.SAXEvent.f16652u, -16, -126, 69, 53, -109, -38, -114, -106, -113, -37, -67, 54, -48, -50, -108, SAXEventRecorder.SAXEvent.f16653v, 92, -46, -15, 64, 70, -125, 56, 102, -35, -3, 48, -65, 6, -117, 98, -77, 37, -30, -104, 34, -120, -111, 16, 126, 110, 72, -61, -93, -74, 30, 66, 58, 107, 40, 84, -6, -123, 61, -70, 43, 121, 10, 21, -101, -97, 94, -54, 78, -44, -84, -27, -13, 115, -89, 87, -81, 88, -88, 80, -12, -22, -42, 116, 79, -82, -23, -43, -25, -26, -83, -24, 44, -41, 117, 122, -21, 22, SAXEventRecorder.SAXEvent.f16645n, -11, 89, -53, 95, -80, -100, -87, 81, -96, C4783m8.f15111c, SAXEventRecorder.SAXEvent.f16646o, -10, 111, 23, -60, 73, -20, -40, 67, 31, 45, -92, 118, 123, -73, -52, -69, 62, 90, -5, 96, -79, -122, 59, 82, -95, 108, -86, 85, 41, -99, -105, -78, -121, -112, 97, -66, -36, -4, PSSSigner.TRAILER_IMPLICIT, -107, -49, -51, 55, 63, 91, -47, 83, 57, -124, 60, 65, -94, 109, 71, 20, 42, -98, 93, 86, -14, -45, -85, 68, SAXEventRecorder.SAXEvent.f16651t, -110, -39, 35, 32, 46, -119, -76, 124, -72, 38, 119, -103, -29, -91, 103, 74, -19, -34, -59, 49, -2, 24, 13, 99, -116, C4783m8.f15110b, -64, -9, 112, 7};
    private static final byte[] aLogtable = {0, 3, 5, SAXEventRecorder.SAXEvent.f16649r, SAXEventRecorder.SAXEvent.f16651t, 51, 85, -1, 26, 46, 114, -106, -95, -8, SAXEventRecorder.SAXEvent.f16653v, 53, 95, -31, 56, 72, -40, 115, -107, -92, -9, 2, 6, 10, 30, 34, 102, -86, -27, 52, 92, -28, 55, 89, -21, 38, 106, -66, -39, 112, -112, -85, -26, 49, 83, -11, 4, SAXEventRecorder.SAXEvent.f16646o, 20, 60, 68, -52, 79, -47, 104, -72, -45, 110, -78, -51, 76, -44, 103, -87, -32, 59, 77, -41, 98, -90, -15, 8, 24, 40, 120, -120, -125, -98, -71, -48, 107, -67, -36, C4783m8.f15111c, -127, -104, -77, -50, 73, -37, 118, -102, -75, -60, 87, -7, 16, 48, 80, -16, SAXEventRecorder.SAXEvent.f16645n, 29, 39, 105, -69, -42, 97, -93, -2, 25, 43, 125, -121, -110, -83, -20, 47, 113, -109, -82, -23, 32, 96, -96, -5, 22, 58, 78, -46, 109, -73, -62, 93, -25, 50, 86, -6, 21, 63, 65, -61, 94, -30, 61, 71, -55, 64, -64, 91, -19, 44, 116, -100, -65, -38, 117, -97, -70, -43, 100, -84, -17, 42, 126, -126, -99, PSSSigner.TRAILER_IMPLICIT, -33, 122, -114, -119, C4783m8.f15110b, -101, -74, -63, 88, -24, 35, 101, -81, -22, 37, 111, -79, -56, 67, -59, 84, -4, 31, PublicSuffixDatabase.f15556i, 99, -91, -12, 7, 9, 27, 45, 119, -103, -80, -53, 70, -54, 69, -49, 74, -34, 121, -117, -122, -111, -88, -29, 62, 66, -58, 81, -13, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16652u, 54, 90, -18, 41, 123, -115, -116, -113, -118, -123, -108, -89, -14, 13, 23, 57, 75, -35, 124, -124, -105, -94, -3, 28, 36, 108, -76, -57, 82, -10, 1, 3, 5, SAXEventRecorder.SAXEvent.f16649r, SAXEventRecorder.SAXEvent.f16651t, 51, 85, -1, 26, 46, 114, -106, -95, -8, SAXEventRecorder.SAXEvent.f16653v, 53, 95, -31, 56, 72, -40, 115, -107, -92, -9, 2, 6, 10, 30, 34, 102, -86, -27, 52, 92, -28, 55, 89, -21, 38, 106, -66, -39, 112, -112, -85, -26, 49, 83, -11, 4, SAXEventRecorder.SAXEvent.f16646o, 20, 60, 68, -52, 79, -47, 104, -72, -45, 110, -78, -51, 76, -44, 103, -87, -32, 59, 77, -41, 98, -90, -15, 8, 24, 40, 120, -120, -125, -98, -71, -48, 107, -67, -36, C4783m8.f15111c, -127, -104, -77, -50, 73, -37, 118, -102, -75, -60, 87, -7, 16, 48, 80, -16, SAXEventRecorder.SAXEvent.f16645n, 29, 39, 105, -69, -42, 97, -93, -2, 25, 43, 125, -121, -110, -83, -20, 47, 113, -109, -82, -23, 32, 96, -96, -5, 22, 58, 78, -46, 109, -73, -62, 93, -25, 50, 86, -6, 21, 63, 65, -61, 94, -30, 61, 71, -55, 64, -64, 91, -19, 44, 116, -100, -65, -38, 117, -97, -70, -43, 100, -84, -17, 42, 126, -126, -99, PSSSigner.TRAILER_IMPLICIT, -33, 122, -114, -119, C4783m8.f15110b, -101, -74, -63, 88, -24, 35, 101, -81, -22, 37, 111, -79, -56, 67, -59, 84, -4, 31, PublicSuffixDatabase.f15556i, 99, -91, -12, 7, 9, 27, 45, 119, -103, -80, -53, 70, -54, 69, -49, 74, -34, 121, -117, -122, -111, -88, -29, 62, 66, -58, 81, -13, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16652u, 54, 90, -18, 41, 123, -115, -116, -113, -118, -123, -108, -89, -14, 13, 23, 57, 75, -35, 124, -124, -105, -94, -3, 28, 36, 108, -76, -57, 82, -10, 1};

    /* JADX INFO: renamed from: S */
    private static final byte[] f16250S = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, SAXEventRecorder.SAXEvent.f16652u, C4783m8.f15110b, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, C4783m8.f15111c, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, PublicSuffixDatabase.f15556i, 16, -1, -13, -46, -51, SAXEventRecorder.SAXEvent.f16646o, SAXEventRecorder.SAXEvent.f16653v, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, SAXEventRecorder.SAXEvent.f16645n, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, SAXEventRecorder.SAXEvent.f16648q, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, SAXEventRecorder.SAXEvent.f16651t, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, SAXEventRecorder.SAXEvent.f16649r, -80, 84, -69, 22};

    /* JADX INFO: renamed from: Si */
    private static final byte[] f16251Si = {82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, 61, -18, 76, -107, SAXEventRecorder.SAXEvent.f16645n, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, 63, SAXEventRecorder.SAXEvent.f16649r, 2, -63, -81, -67, 3, 1, SAXEventRecorder.SAXEvent.f16653v, -118, 107, 58, -111, SAXEventRecorder.SAXEvent.f16651t, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, SAXEventRecorder.SAXEvent.f16648q, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, SAXEventRecorder.SAXEvent.f16652u, 16, 89, 39, C4783m8.f15110b, -20, 95, 96, 81, C4783m8.f15111c, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, PublicSuffixDatabase.f15556i, SAXEventRecorder.SAXEvent.f16646o, 125};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, TbsListener.ErrorCode.INCR_UPDATE_ERROR, 171, 77, TbsListener.ErrorCode.STARTDOWNLOAD_NEEDDOWNLOAD_KEY_ERROR, 47, 94, 188, 99, 198, TbsListener.ErrorCode.NEEDDOWNLOAD_STATIC_INSTALLING, 53, TbsListener.ErrorCode.FILE_DELETED, 212, BuildConfig.f10535e, TbsListener.ErrorCode.DOWNLOAD_THROWABLE, 250, TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL, 197, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA};
    static byte[][] shifts0 = {new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, 32}, new byte[]{0, 8, 24, 32}};
    static byte[][] shifts1 = {new byte[]{0, 24, 16, 8}, new byte[]{0, 32, 24, 16}, new byte[]{0, 40, 32, 24}, new byte[]{0, 48, 40, 24}, new byte[]{0, 56, 40, 32}};

    /* JADX WARN: Invalid debug info offset */
    public RijndaelEngine() {
    }

    /* JADX WARN: Invalid debug info offset */
    public RijndaelEngine(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void InvMixColumn() {
    }

    /* JADX WARN: Invalid debug info offset */
    private void KeyAddition(long[] jArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void MixColumn() {
    }

    /* JADX WARN: Invalid debug info offset */
    private void ShiftRow(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void Substitution(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private long applyS(long j, byte[] bArr) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    private void decryptBlock(long[][] jArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void encryptBlock(long[][] jArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private long[][] generateWorkingKey(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte mul0x2(int i) {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte mul0x3(int i) {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte mul0x9(int i) {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte mul0xb(int i) {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte mul0xd(int i) {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte mul0xe(int i) {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private void packBlock(byte[] bArr, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    private long shift(long j, int i) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    private void unpackBlock(byte[] bArr, int i) {
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

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
