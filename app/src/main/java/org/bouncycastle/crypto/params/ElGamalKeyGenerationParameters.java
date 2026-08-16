package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes2.dex */
public class ElGamalKeyGenerationParameters extends KeyGenerationParameters {
    private ElGamalParameters params;

    /* JADX WARN: Invalid debug info offset */
    public ElGamalKeyGenerationParameters(SecureRandom secureRandom, ElGamalParameters elGamalParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static int getStrength(ElGamalParameters elGamalParameters) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public ElGamalParameters getParameters() {
        return null;
    }
}
