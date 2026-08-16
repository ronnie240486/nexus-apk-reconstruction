package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.crmf.CertTemplate;
import org.bouncycastle.asn1.x509.X509Extensions;

/* JADX INFO: loaded from: classes2.dex */
public class RevDetails extends ASN1Encodable {
    private CertTemplate certDetails;
    private X509Extensions crlEntryDetails;

    /* JADX WARN: Invalid debug info offset */
    private RevDetails(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RevDetails(CertTemplate certTemplate) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RevDetails(CertTemplate certTemplate, X509Extensions x509Extensions) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static RevDetails getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertTemplate getCertDetails() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Extensions getCrlEntryDetails() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
