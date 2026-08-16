package org.bouncycastle.crypto.digests;

import com.afollestad.materialdialogs.BuildConfig;
import com.google.android.exoplayer2.extractor.p006ts.PsExtractor;
import com.google.android.exoplayer2.extractor.p006ts.TsExtractor;
import com.tencent.smtt.sdk.TbsListener;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.videolan.libvlc.util.VLCUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class WhirlpoolDigest implements ExtendedDigest {
    private static final int BITCOUNT_ARRAY_SIZE = 32;
    private static final int BYTE_LENGTH = 64;
    private static final int DIGEST_LENGTH_BYTES = 64;
    private static final short[] EIGHT;
    private static final int REDUCTION_POLYNOMIAL = 285;
    private static final int ROUNDS = 10;

    /* JADX INFO: renamed from: _K */
    private long[] f16179_K;

    /* JADX INFO: renamed from: _L */
    private long[] f16180_L;
    private short[] _bitCount;
    private long[] _block;
    private byte[] _buffer;
    private int _bufferPos;
    private long[] _hash;
    private final long[] _rc;
    private long[] _state;
    private static final int[] SBOX = {24, 35, 198, TbsListener.ErrorCode.INSTALL_SUCCESS_AND_RELEASE_LOCK, 135, 184, 1, 79, 54, 166, 210, 245, TbsListener.ErrorCode.THREAD_INIT_ERROR, 111, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, 82, 96, 188, TbsListener.ErrorCode.NO_NEED_STARTDOWNLOAD, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, 163, 12, TbsListener.ErrorCode.DOWNLOAD_RETRYTIMES302_EXCEED, 53, 29, 224, TbsListener.ErrorCode.COPY_EXCEPTION, 194, 46, 75, 254, 87, 21, 119, 55, TbsListener.ErrorCode.INSTALL_FROM_UNZIP, 159, 240, 74, 218, 88, 201, 41, 10, TbsListener.ErrorCode.NONEEDDOWNLOAD_OTHER_PROCESS_DOWNLOADING, 160, TbsListener.ErrorCode.UNKNOWN_ERROR, 133, PsExtractor.PRIVATE_STREAM_1, 93, 16, 244, 203, 62, 5, 103, TbsListener.ErrorCode.INCR_ERROR_DETAIL, 39, 65, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, 167, TbsListener.ErrorCode.DOWNLOAD_THROWABLE, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA, TbsListener.ErrorCode.INCR_UPDATE_ERROR, 251, TbsListener.ErrorCode.TPATCH_FAIL, TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY, 102, TbsListener.ErrorCode.INCRUPDATE_INSTALL_SUCCESS, 23, 71, 158, 202, 45, 191, 7, 173, 90, TbsListener.ErrorCode.DOWNLOAD_USER_CANCEL, 51, 99, 2, 170, TbsListener.ErrorCode.DOWNLOAD_FILE_CONTENTLENGTH_NOT_MATCH, 200, 25, 73, 217, TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION, TbsListener.ErrorCode.HOST_CONTEXT_IS_NULL, 91, 136, TbsListener.ErrorCode.STARTDOWNLOAD_NEEDDOWNLOAD_KEY_ERROR, 38, 50, 176, 233, 15, TbsListener.ErrorCode.COPY_SRCDIR_ERROR, 128, 190, 205, 52, 72, 255, 122, 144, 95, 32, 104, 26, 174, 180, 84, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, 34, 100, TbsListener.ErrorCode.TPATCH_BACKUP_NOT_VALID, 115, 18, 64, 8, 195, TbsListener.ErrorCode.TPATCH_INSTALL_SUCCESS, TbsListener.ErrorCode.RENAME_EXCEPTION, 161, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, 61, TbsListener.ErrorCode.NEEDDOWNLOAD_STATIC_INSTALLING, 0, TbsListener.ErrorCode.UNZIP_OTHER_ERROR, 43, 118, 130, TbsListener.ErrorCode.COPY_TMPDIR_ERROR, 27, 181, 175, TbsListener.ErrorCode.FILE_DELETED, 80, 69, 243, 48, TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL, 63, 85, 162, TbsListener.ErrorCode.DECOUPLE_INCURUPDATE_SUCCESS, 101, 186, 47, PsExtractor.AUDIO_STREAM, TbsListener.ErrorCode.UNLZMA_FAIURE, 28, 253, 77, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, 117, 6, 138, TbsListener.ErrorCode.APP_SET_MIN_CORE_VER, TbsListener.ErrorCode.RENAME_SUCCESS, 14, 31, 98, 212, 168, 150, 249, 197, 37, 89, TbsListener.ErrorCode.DOWNLOAD_CDN_URL_IS_NULL, TbsListener.ErrorCode.DOWNLOAD_NOT_WIFI_ERROR, 57, 76, 94, 120, 56, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA, TbsListener.ErrorCode.DEXOPT_EXCEPTION, 165, TbsListener.ErrorCode.DEXOAT_EXCEPTION, 97, BuildConfig.f10535e, 33, 156, 30, 67, 199, 252, 4, 81, TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED, 109, 13, 250, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, 126, 36, 59, 171, 206, 17, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, 78, VLCUtil.f17717i, TbsListener.ErrorCode.DECOUPLE_INCURUPDATE_FAIL, 60, 129, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA, 247, 185, 19, 44, TbsListener.ErrorCode.EXCEED_COPY_RETRY_NUM, TbsListener.ErrorCode.RENAME_FAIL, 110, 196, 3, 86, 68, 127, 169, 42, 187, 193, 83, TbsListener.ErrorCode.COPY_INSTALL_SUCCESS, 11, 157, 108, 49, 116, 246, 70, TsExtractor.TS_STREAM_TYPE_AC4, 137, 20, 225, 22, 58, TbsListener.ErrorCode.DISK_FULL, 9, TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW, 182, TbsListener.ErrorCode.EXCEED_DEXOPT_RETRY_NUM, TbsListener.ErrorCode.DECOUPLE_TPATCH_INSTALL_SUCCESS, 204, 66, TbsListener.ErrorCode.NEEDDOWNLOAD_TMPCORE_PREPARING, 164, 40, 92, 248, 134};

    /* JADX INFO: renamed from: C0 */
    private static final long[] f16171C0 = new long[256];

    /* JADX INFO: renamed from: C1 */
    private static final long[] f16172C1 = new long[256];

    /* JADX INFO: renamed from: C2 */
    private static final long[] f16173C2 = new long[256];

    /* JADX INFO: renamed from: C3 */
    private static final long[] f16174C3 = new long[256];

    /* JADX INFO: renamed from: C4 */
    private static final long[] f16175C4 = new long[256];

    /* JADX INFO: renamed from: C5 */
    private static final long[] f16176C5 = new long[256];

    /* JADX INFO: renamed from: C6 */
    private static final long[] f16177C6 = new long[256];

    /* JADX INFO: renamed from: C7 */
    private static final long[] f16178C7 = new long[256];

    static {
        short[] sArr = new short[32];
        EIGHT = sArr;
        sArr[31] = 8;
    }

    /* JADX WARN: Invalid debug info offset */
    public WhirlpoolDigest() {
    }

    /* JADX WARN: Invalid debug info offset */
    public WhirlpoolDigest(WhirlpoolDigest whirlpoolDigest) {
    }

    /* JADX WARN: Invalid debug info offset */
    private long bytesToLongFromBuffer(byte[] bArr, int i) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    private void convertLongToByteArray(long j, byte[] bArr, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] copyBitLength() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private void finish() {
    }

    /* JADX WARN: Invalid debug info offset */
    private void increment() {
    }

    /* JADX WARN: Invalid debug info offset */
    private int maskWithReductionPolynomial(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private long packIntoLong(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    private void processFilledBuffer(byte[] bArr, int i) {
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
    public void processBlock() {
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
