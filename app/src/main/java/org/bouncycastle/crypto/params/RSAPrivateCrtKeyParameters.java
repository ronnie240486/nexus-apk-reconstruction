package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class RSAPrivateCrtKeyParameters extends RSAKeyParameters {

    /* JADX INFO: renamed from: dP */
    private BigInteger f16347dP;

    /* JADX INFO: renamed from: dQ */
    private BigInteger f16348dQ;

    /* JADX INFO: renamed from: e */
    private BigInteger f16349e;

    /* JADX INFO: renamed from: p */
    private BigInteger f16350p;

    /* JADX INFO: renamed from: q */
    private BigInteger f16351q;
    private BigInteger qInv;

    /* JADX WARN: Invalid debug info offset */
    public RSAPrivateCrtKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getDP() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getDQ() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getP() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getPublicExponent() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getQ() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getQInv() {
        return null;
    }
}
