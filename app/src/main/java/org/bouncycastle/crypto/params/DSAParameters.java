package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes2.dex */
public class DSAParameters implements CipherParameters {

    /* JADX INFO: renamed from: g */
    private BigInteger f16320g;

    /* JADX INFO: renamed from: p */
    private BigInteger f16321p;

    /* JADX INFO: renamed from: q */
    private BigInteger f16322q;
    private DSAValidationParameters validation;

    /* JADX WARN: Invalid debug info offset */
    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, DSAValidationParameters dSAValidationParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getG() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getP() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getQ() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DSAValidationParameters getValidationParameters() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }
}
