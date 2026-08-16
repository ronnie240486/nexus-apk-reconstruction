package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class PolicyQualifierInfo extends ASN1Encodable {
    private DERObjectIdentifier policyQualifierId;
    private DEREncodable qualifier;

    /* JADX WARN: Invalid debug info offset */
    public PolicyQualifierInfo(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PolicyQualifierInfo(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PolicyQualifierInfo(DERObjectIdentifier dERObjectIdentifier, DEREncodable dEREncodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static PolicyQualifierInfo getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getPolicyQualifierId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DEREncodable getQualifier() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
