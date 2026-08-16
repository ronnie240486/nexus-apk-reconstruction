package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes2.dex */
public class ParametersWithRandom implements CipherParameters {
    private CipherParameters parameters;
    private SecureRandom random;

    /* JADX WARN: Invalid debug info offset */
    public ParametersWithRandom(CipherParameters cipherParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ParametersWithRandom(CipherParameters cipherParameters, SecureRandom secureRandom) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CipherParameters getParameters() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public SecureRandom getRandom() {
        return null;
    }
}
