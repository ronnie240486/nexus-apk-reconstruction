package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes2.dex */
public class RSAKeyGenerationParameters extends KeyGenerationParameters {
    private int certainty;
    private BigInteger publicExponent;

    /* JADX WARN: Invalid debug info offset */
    public RSAKeyGenerationParameters(BigInteger bigInteger, SecureRandom secureRandom, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public int getCertainty() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getPublicExponent() {
        return null;
    }
}
