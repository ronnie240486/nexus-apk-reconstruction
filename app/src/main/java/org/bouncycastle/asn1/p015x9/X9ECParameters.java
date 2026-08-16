package org.bouncycastle.asn1.p015x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.math.p018ec.ECCurve;
import org.bouncycastle.math.p018ec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public class X9ECParameters extends ASN1Encodable implements X9ObjectIdentifiers {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private ECCurve curve;
    private X9FieldID fieldID;

    /* JADX INFO: renamed from: g */
    private ECPoint f16039g;

    /* JADX INFO: renamed from: h */
    private BigInteger f16040h;

    /* JADX INFO: renamed from: n */
    private BigInteger f16041n;
    private byte[] seed;

    /* JADX WARN: Invalid debug info offset */
    public X9ECParameters(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X9ECParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X9ECParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X9ECParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
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
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
