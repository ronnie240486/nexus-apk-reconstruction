package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class PolicyInformation extends ASN1Encodable {
    private DERObjectIdentifier policyIdentifier;
    private ASN1Sequence policyQualifiers;

    /* JADX WARN: Invalid debug info offset */
    public PolicyInformation(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PolicyInformation(DERObjectIdentifier dERObjectIdentifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PolicyInformation(DERObjectIdentifier dERObjectIdentifier, ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static PolicyInformation getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getPolicyIdentifier() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Sequence getPolicyQualifiers() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
