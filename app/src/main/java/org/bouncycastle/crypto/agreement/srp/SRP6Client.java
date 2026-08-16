package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes2.dex */
public class SRP6Client {

    /* JADX INFO: renamed from: A */
    protected BigInteger f16048A;

    /* JADX INFO: renamed from: B */
    protected BigInteger f16049B;

    /* JADX INFO: renamed from: N */
    protected BigInteger f16050N;

    /* JADX INFO: renamed from: S */
    protected BigInteger f16051S;

    /* JADX INFO: renamed from: a */
    protected BigInteger f16052a;
    protected Digest digest;

    /* JADX INFO: renamed from: g */
    protected BigInteger f16053g;
    protected SecureRandom random;

    /* JADX INFO: renamed from: u */
    protected BigInteger f16054u;

    /* JADX INFO: renamed from: x */
    protected BigInteger f16055x;

    /* JADX WARN: Invalid debug info offset */
    private BigInteger calculateS() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger generateClientCredentials(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest, SecureRandom secureRandom) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger selectPrivateValue() {
        return null;
    }
}
