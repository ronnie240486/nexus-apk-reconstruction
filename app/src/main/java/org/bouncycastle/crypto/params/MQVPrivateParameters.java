package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes2.dex */
public class MQVPrivateParameters implements CipherParameters {
    private ECPrivateKeyParameters ephemeralPrivateKey;
    private ECPublicKeyParameters ephemeralPublicKey;
    private ECPrivateKeyParameters staticPrivateKey;

    /* JADX WARN: Invalid debug info offset */
    public MQVPrivateParameters(ECPrivateKeyParameters eCPrivateKeyParameters, ECPrivateKeyParameters eCPrivateKeyParameters2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public MQVPrivateParameters(ECPrivateKeyParameters eCPrivateKeyParameters, ECPrivateKeyParameters eCPrivateKeyParameters2, ECPublicKeyParameters eCPublicKeyParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ECPrivateKeyParameters getEphemeralPrivateKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ECPublicKeyParameters getEphemeralPublicKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ECPrivateKeyParameters getStaticPrivateKey() {
        return null;
    }
}
