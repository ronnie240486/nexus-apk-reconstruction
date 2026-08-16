package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.DSAKeyGenerationParameters;

/* JADX INFO: loaded from: classes2.dex */
public class DSAKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private DSAKeyGenerationParameters param;

    /* JADX WARN: Invalid debug info offset */
    private static BigInteger calculatePublicKey(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static BigInteger generatePrivateKey(BigInteger bigInteger, SecureRandom secureRandom) {
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
