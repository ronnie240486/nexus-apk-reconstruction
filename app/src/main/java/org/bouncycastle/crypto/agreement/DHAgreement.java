package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;

/* JADX INFO: loaded from: classes2.dex */
public class DHAgreement {
    private DHParameters dhParams;
    private DHPrivateKeyParameters key;
    private BigInteger privateValue;
    private SecureRandom random;

    /* JADX WARN: Invalid debug info offset */
    public BigInteger calculateAgreement(DHPublicKeyParameters dHPublicKeyParameters, BigInteger bigInteger) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger calculateMessage() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void init(CipherParameters cipherParameters) {
    }
}
