package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes2.dex */
public class SRP6Util {
    private static BigInteger ZERO = BigInteger.valueOf(0);
    private static BigInteger ONE = BigInteger.valueOf(1);

    /* JADX WARN: Invalid debug info offset */
    public static BigInteger calculateK(Digest digest, BigInteger bigInteger, BigInteger bigInteger2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static BigInteger calculateU(Digest digest, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static BigInteger calculateX(Digest digest, BigInteger bigInteger, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static BigInteger generatePrivateValue(Digest digest, BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static byte[] getPadded(BigInteger bigInteger, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static BigInteger hashPaddedPair(Digest digest, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static BigInteger validatePublicValue(BigInteger bigInteger, BigInteger bigInteger2) throws CryptoException {
        return null;
    }
}
