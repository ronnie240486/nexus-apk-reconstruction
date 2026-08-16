package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes2.dex */
public class DHKeyGenerationParameters extends KeyGenerationParameters {
    private DHParameters params;

    /* JADX WARN: Invalid debug info offset */
    public DHKeyGenerationParameters(SecureRandom secureRandom, DHParameters dHParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static int getStrength(DHParameters dHParameters) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public DHParameters getParameters() {
        return null;
    }
}
