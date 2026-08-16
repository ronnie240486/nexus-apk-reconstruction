package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.DSAParameters;

/* JADX INFO: loaded from: classes2.dex */
public class DSAParametersGenerator {

    /* JADX INFO: renamed from: L */
    private int f16274L;

    /* JADX INFO: renamed from: N */
    private int f16275N;
    private int certainty;
    private SecureRandom random;
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    /* JADX WARN: Invalid debug info offset */
    private static BigInteger calculateGenerator_FIPS186_2(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static BigInteger calculateGenerator_FIPS186_3_Unverifiable(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private DSAParameters generateParameters_FIPS186_2() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private DSAParameters generateParameters_FIPS186_3() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static int getDefaultN(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private static void hash(Digest digest, byte[] bArr, byte[] bArr2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static void inc(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void init(int i, int i2, int i3, SecureRandom secureRandom) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DSAParameters generateParameters() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void init(int i, int i2, SecureRandom secureRandom) {
    }
}
