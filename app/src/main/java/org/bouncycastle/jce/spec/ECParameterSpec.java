package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.math.p018ec.ECCurve;
import org.bouncycastle.math.p018ec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public class ECParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: G */
    private ECPoint f16388G;
    private ECCurve curve;

    /* JADX INFO: renamed from: h */
    private BigInteger f16389h;

    /* JADX INFO: renamed from: n */
    private BigInteger f16390n;
    private byte[] seed;

    /* JADX WARN: Invalid debug info offset */
    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
        return false;
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

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }
}
