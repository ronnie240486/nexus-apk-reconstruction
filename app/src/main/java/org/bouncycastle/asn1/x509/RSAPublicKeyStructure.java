package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class RSAPublicKeyStructure extends ASN1Encodable {
    private BigInteger modulus;
    private BigInteger publicExponent;

    /* JADX WARN: Invalid debug info offset */
    public RSAPublicKeyStructure(BigInteger bigInteger, BigInteger bigInteger2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RSAPublicKeyStructure(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static RSAPublicKeyStructure getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static RSAPublicKeyStructure getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getModulus() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getPublicExponent() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
