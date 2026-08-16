package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;

/* JADX INFO: loaded from: classes2.dex */
public class RSABlindingFactorGenerator {
    private RSAKeyParameters key;
    private SecureRandom random;
    private static BigInteger ZERO = BigInteger.valueOf(0);
    private static BigInteger ONE = BigInteger.valueOf(1);

    /* JADX WARN: Invalid debug info offset */
    public BigInteger generateBlindingFactor() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void init(CipherParameters cipherParameters) {
    }
}
