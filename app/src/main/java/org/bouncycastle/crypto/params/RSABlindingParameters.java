package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes2.dex */
public class RSABlindingParameters implements CipherParameters {
    private BigInteger blindingFactor;
    private RSAKeyParameters publicKey;

    /* JADX WARN: Invalid debug info offset */
    public RSABlindingParameters(RSAKeyParameters rSAKeyParameters, BigInteger bigInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getBlindingFactor() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RSAKeyParameters getPublicKey() {
        return null;
    }
}
