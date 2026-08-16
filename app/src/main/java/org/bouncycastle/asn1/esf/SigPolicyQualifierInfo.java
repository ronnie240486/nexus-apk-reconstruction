package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class SigPolicyQualifierInfo extends ASN1Encodable {
    private DERObjectIdentifier sigPolicyQualifierId;
    private DEREncodable sigQualifier;

    /* JADX WARN: Invalid debug info offset */
    public SigPolicyQualifierInfo(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SigPolicyQualifierInfo(DERObjectIdentifier dERObjectIdentifier, DEREncodable dEREncodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static SigPolicyQualifierInfo getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1ObjectIdentifier getSigPolicyQualifierId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DEREncodable getSigQualifier() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
