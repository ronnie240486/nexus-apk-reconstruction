package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class CertificatePair extends ASN1Encodable {
    private X509CertificateStructure forward;
    private X509CertificateStructure reverse;

    /* JADX WARN: Invalid debug info offset */
    private CertificatePair(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertificatePair(X509CertificateStructure x509CertificateStructure, X509CertificateStructure x509CertificateStructure2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertificatePair getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509CertificateStructure getForward() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509CertificateStructure getReverse() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
