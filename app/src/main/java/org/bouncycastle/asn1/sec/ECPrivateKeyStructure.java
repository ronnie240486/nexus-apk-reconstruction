package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class ECPrivateKeyStructure extends ASN1Encodable {
    private ASN1Sequence seq;

    /* JADX WARN: Invalid debug info offset */
    public ECPrivateKeyStructure(BigInteger bigInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ECPrivateKeyStructure(BigInteger bigInteger, ASN1Encodable aSN1Encodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ECPrivateKeyStructure(BigInteger bigInteger, DERBitString dERBitString, ASN1Encodable aSN1Encodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ECPrivateKeyStructure(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    private ASN1Object getObjectInTag(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Object getParameters() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBitString getPublicKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
