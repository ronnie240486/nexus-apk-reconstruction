package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import org.bouncycastle.math.p018ec.ECCurve;

/* JADX INFO: loaded from: classes2.dex */
public class ECNamedCurveSpec extends java.security.spec.ECParameterSpec {
    private String name;

    /* JADX WARN: Invalid debug info offset */
    public ECNamedCurveSpec(String str, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ECNamedCurveSpec(String str, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ECNamedCurveSpec(String str, ECCurve eCCurve, org.bouncycastle.math.p018ec.ECPoint eCPoint, BigInteger bigInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ECNamedCurveSpec(String str, ECCurve eCCurve, org.bouncycastle.math.p018ec.ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ECNamedCurveSpec(String str, ECCurve eCCurve, org.bouncycastle.math.p018ec.ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static EllipticCurve convertCurve(ECCurve eCCurve, byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static ECPoint convertPoint(org.bouncycastle.math.p018ec.ECPoint eCPoint) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getName() {
        return null;
    }
}
