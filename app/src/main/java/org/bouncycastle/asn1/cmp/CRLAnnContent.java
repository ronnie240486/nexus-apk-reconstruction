package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.CertificateList;

/* JADX INFO: loaded from: classes2.dex */
public class CRLAnnContent extends ASN1Encodable {
    private ASN1Sequence content;

    /* JADX WARN: Invalid debug info offset */
    private CRLAnnContent(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CRLAnnContent getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertificateList[] toCertificateListArray() {
        return null;
    }
}
