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
public class AESLightEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;

    /* JADX INFO: renamed from: m1 */
    private static final int f16206m1 = -2139062144;

    /* JADX INFO: renamed from: m2 */
    private static final int f16207m2 = 2139062143;

    /* JADX INFO: renamed from: m3 */
    private static final int f16208m3 = 27;

    /* JADX INFO: renamed from: C0 */
    private int f16209C0;

    /* JADX INFO: renamed from: C1 */
    private int f16210C1;

    /* JADX INFO: renamed from: C2 */
    private int f16211C2;

    /* JADX INFO: renamed from: C3 */
    private int f16212C3;
    private int ROUNDS;
    private int[][] WorkingKey;
    private boolean forEncryption;

    /* JADX INFO: renamed from: S */
    private static final byte[] f16204S = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, SAXEventRecorder.SAXEvent.f16652u, C4783m8.f15110b, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, C4783m8.f15111c, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, PublicSuffixDatabase.f15556i, 16, -1, -13, -46, -51, SAXEventRecorder.SAXEvent.f16646o, SAXEventRecorder.SAXEvent.f16653v, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, SAXEventRecorder.SAXEvent.f16645n, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, SAXEventRecorder.SAXEvent.f16648q, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, SAXEventRecorder.SAXEvent.f16651t, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, SAXEventRecorder.SAXEvent.f16649r, -80, 84, -69, 22};

    /* JADX INFO: renamed from: Si */
    private static final byte[] f16205Si = {82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, 61, -18, 76, -107, SAXEventRecorder.SAXEvent.f16645n, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, 63, SAXEventRecorder.SAXEvent.f16649r, 2, -63, -81, -67, 3, 1, SAXEventRecorder.SAXEvent.f16653v, -118, 107, 58, -111, SAXEventRecorder.SAXEvent.f16651t, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, SAXEventRecorder.SAXEvent.f16648q, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, SAXEventRecorder.SAXEvent.f16652u, 16, 89, 39, C4783m8.f15110b, -20, 95, 96, 81, C4783m8.f15111c, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, PublicSuffixDatabase.f15556i, SAXEventRecorder.SAXEvent.f16646o, 125};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, TbsListener.ErrorCode.INCR_UPDATE_ERROR, 171, 77, TbsListener.ErrorCode.STARTDOWNLOAD_NEEDDOWNLOAD_KEY_ERROR, 47, 94, 188, 99, 198, TbsListener.ErrorCode.NEEDDOWNLOAD_STATIC_INSTALLING, 53, TbsListener.ErrorCode.FILE_DELETED, 212, BuildConfig.f10535e, TbsListener.ErrorCode.DOWNLOAD_THROWABLE, 250, TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL, 197, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA};

    /* JADX WARN: Invalid debug info offset */
    private int FFmulX(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private void decryptBlock(int[][] iArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void encryptBlock(int[][] iArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private int[][] generateWorkingKey(byte[] bArr, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private int inv_mcol(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int mcol(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private void packBlock(byte[] bArr, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    private int shift(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int subWord(int i) {
        return 0;
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
