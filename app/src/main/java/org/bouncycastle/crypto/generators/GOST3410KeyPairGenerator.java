package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.GOST3410KeyGenerationParameters;

/* JADX INFO: loaded from: classes2.dex */
public class GOST3410KeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private GOST3410KeyGenerationParameters param;

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
