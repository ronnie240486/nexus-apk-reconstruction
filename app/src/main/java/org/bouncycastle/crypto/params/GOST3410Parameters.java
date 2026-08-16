package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes2.dex */
public class GOST3410Parameters implements CipherParameters {

    /* JADX INFO: renamed from: a */
    private BigInteger f16335a;

    /* JADX INFO: renamed from: p */
    private BigInteger f16336p;

    /* JADX INFO: renamed from: q */
    private BigInteger f16337q;
    private GOST3410ValidationParameters validation;

    /* JADX WARN: Invalid debug info offset */
    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
    }

    /* JADX WARN: Invalid debug info offset */
    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getA() {
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
    public GOST3410ValidationParameters getValidationParameters() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }
}
