package org.bouncycastle.crypto.generators;

import androidx.constraintlayout.solver.widgets.Optimizer;
import androidx.core.view.InputDeviceCompat;
import com.afollestad.materialdialogs.BuildConfig;
import com.tencent.smtt.sdk.TbsListener;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.NaccacheSternKeyGenerationParameters;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.videolan.libvlc.MediaPlayer;
import p000.C0727LD;

/* JADX INFO: loaded from: classes2.dex */
public class NaccacheSternKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NaccacheSternKeyGenerationParameters param;
    private static int[] smallPrimes = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, TbsListener.ErrorCode.UNKNOWN_ERROR, 109, TbsListener.ErrorCode.DOWNLOAD_FILE_CONTENTLENGTH_NOT_MATCH, 127, TbsListener.ErrorCode.DOWNLOAD_USER_CANCEL, 137, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA, TbsListener.ErrorCode.NEEDDOWNLOAD_STATIC_INSTALLING, 157, 163, 167, 173, BuildConfig.f10535e, 181, 191, 193, 197, 199, TbsListener.ErrorCode.EXCEED_COPY_RETRY_NUM, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, TbsListener.ErrorCode.HOST_CONTEXT_IS_NULL, TbsListener.ErrorCode.INSTALL_FROM_UNZIP, 233, TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL, TbsListener.ErrorCode.TPATCH_BACKUP_NOT_VALID, 251, InputDeviceCompat.SOURCE_KEYBOARD, Optimizer.OPTIMIZATION_STANDARD, MediaPlayer.Event.f17410p, 271, MediaPlayer.Event.f17415u, 281, 283, 293, 307, 311, TbsListener.ErrorCode.ERROR_CANLOADVIDEO_RETURN_FALSE, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, TbsListener.ErrorCode.INFO_FORCE_SYSTEM_WEBVIEW_INNER, TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_AVAILABLE, TbsListener.ErrorCode.INFO_CORE_CHECK_VALIDITY_FALSE, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, C0727LD.f1762m, C0727LD.f1761l, C0727LD.f1760k, 503, TbsListener.ErrorCode.INFO_CODE_FILEREADER_OPENFILEREADER_FILEPATHISNULL, 521, 523, 541, 547, 557};
    private static final BigInteger ONE = BigInteger.valueOf(1);

    /* JADX WARN: Invalid debug info offset */
    private static Vector findFirstPrimes(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static BigInteger generatePrime(int i, int i2, SecureRandom secureRandom) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static int getInt(SecureRandom secureRandom, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private static Vector permuteList(Vector vector, SecureRandom secureRandom) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
    }
}
