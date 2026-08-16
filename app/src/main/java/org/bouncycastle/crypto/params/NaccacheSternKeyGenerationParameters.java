package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes2.dex */
public class NaccacheSternKeyGenerationParameters extends KeyGenerationParameters {
    private int certainty;
    private int cntSmallPrimes;
    private boolean debug;

    /* JADX WARN: Invalid debug info offset */
    public NaccacheSternKeyGenerationParameters(SecureRandom secureRandom, int i, int i2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    public NaccacheSternKeyGenerationParameters(SecureRandom secureRandom, int i, int i2, int i3, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public int getCertainty() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getCntSmallPrimes() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isDebug() {
        return false;
    }
}
