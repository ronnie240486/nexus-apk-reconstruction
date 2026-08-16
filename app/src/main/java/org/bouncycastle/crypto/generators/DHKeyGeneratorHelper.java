package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: loaded from: classes2.dex */
class DHKeyGeneratorHelper {
    static final DHKeyGeneratorHelper INSTANCE = new DHKeyGeneratorHelper();
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    /* JADX WARN: Invalid debug info offset */
    private DHKeyGeneratorHelper() {
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger calculatePrivate(DHParameters dHParameters, SecureRandom secureRandom) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger calculatePublic(DHParameters dHParameters, BigInteger bigInteger) {
        return null;
    }
}
