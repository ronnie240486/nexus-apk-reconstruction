package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.crmf.CertId;
import org.bouncycastle.asn1.x509.CertificateList;

/* JADX INFO: loaded from: classes2.dex */
public class RevRepContent extends ASN1Encodable {
    private ASN1Sequence crls;
    private ASN1Sequence revCerts;
    private ASN1Sequence status;

    /* JADX WARN: Invalid debug info offset */
    private RevRepContent(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void addOptional(ASN1EncodableVector aSN1EncodableVector, int i, ASN1Encodable aSN1Encodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static RevRepContent getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertificateList[] getCrls() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertId[] getRevCerts() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIStatusInfo[] getStatus() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
