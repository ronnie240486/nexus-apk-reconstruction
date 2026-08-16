package org.bouncycastle.asn1.ess;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.PolicyInformation;

/* JADX INFO: loaded from: classes2.dex */
public class OtherSigningCertificate extends ASN1Encodable {
    ASN1Sequence certs;
    ASN1Sequence policies;

    /* JADX WARN: Invalid debug info offset */
    public OtherSigningCertificate(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OtherSigningCertificate(OtherCertID otherCertID) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static OtherSigningCertificate getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public OtherCertID[] getCerts() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PolicyInformation[] getPolicies() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
