package org.bouncycastle.asn1.ess;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.PolicyInformation;

/* JADX INFO: loaded from: classes2.dex */
public class SigningCertificate extends ASN1Encodable {
    ASN1Sequence certs;
    ASN1Sequence policies;

    /* JADX WARN: Invalid debug info offset */
    public SigningCertificate(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SigningCertificate(ESSCertID eSSCertID) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static SigningCertificate getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ESSCertID[] getCerts() {
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
