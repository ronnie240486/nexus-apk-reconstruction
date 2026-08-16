package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class RSAPrivateKeyStructure extends ASN1Encodable {
    private BigInteger coefficient;
    private BigInteger exponent1;
    private BigInteger exponent2;
    private BigInteger modulus;
    private ASN1Sequence otherPrimeInfos;
    private BigInteger prime1;
    private BigInteger prime2;
    private BigInteger privateExponent;
    private BigInteger publicExponent;
    private int version;

    /* JADX WARN: Invalid debug info offset */
    public RSAPrivateKeyStructure(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RSAPrivateKeyStructure(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static RSAPrivateKeyStructure getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static RSAPrivateKeyStructure getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getCoefficient() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getExponent1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getExponent2() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getModulus() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getPrime1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getPrime2() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getPrivateExponent() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getPublicExponent() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getVersion() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
