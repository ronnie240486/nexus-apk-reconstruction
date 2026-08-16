package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.math.p018ec.ECConstants;
import org.bouncycastle.math.p018ec.ECCurve;
import org.bouncycastle.math.p018ec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public class ECDomainParameters implements ECConstants {

    /* JADX INFO: renamed from: G */
    ECPoint f16325G;
    ECCurve curve;

    /* JADX INFO: renamed from: h */
    BigInteger f16326h;

    /* JADX INFO: renamed from: n */
    BigInteger f16327n;
    byte[] seed;

    /* JADX WARN: Invalid debug info offset */
    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ECCurve getCurve() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ECPoint getG() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getH() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getN() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getSeed() {
        return null;
    }
}
