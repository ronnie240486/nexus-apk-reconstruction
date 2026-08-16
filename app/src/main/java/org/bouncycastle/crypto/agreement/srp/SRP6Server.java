package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes2.dex */
public class SRP6Server {

    /* JADX INFO: renamed from: A */
    protected BigInteger f16056A;

    /* JADX INFO: renamed from: B */
    protected BigInteger f16057B;

    /* JADX INFO: renamed from: N */
    protected BigInteger f16058N;

    /* JADX INFO: renamed from: S */
    protected BigInteger f16059S;

    /* JADX INFO: renamed from: b */
    protected BigInteger f16060b;
    protected Digest digest;

    /* JADX INFO: renamed from: g */
    protected BigInteger f16061g;
    protected SecureRandom random;

    /* JADX INFO: renamed from: u */
    protected BigInteger f16062u;

    /* JADX INFO: renamed from: v */
    protected BigInteger f16063v;

    /* JADX WARN: Invalid debug info offset */
    private BigInteger calculateS() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger generateServerCredentials() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void init(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest, SecureRandom secureRandom) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger selectPrivateValue() {
        return null;
    }
}
