package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.crmf.CertId;
import org.bouncycastle.asn1.x509.X509Extensions;

/* JADX INFO: loaded from: classes2.dex */
public class RevAnnContent extends ASN1Encodable {
    private DERGeneralizedTime badSinceDate;
    private CertId certId;
    private X509Extensions crlDetails;
    private PKIStatus status;
    private DERGeneralizedTime willBeRevokedAt;

    /* JADX WARN: Invalid debug info offset */
    private RevAnnContent(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static RevAnnContent getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERGeneralizedTime getBadSinceDate() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertId getCertId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Extensions getCrlDetails() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIStatus getStatus() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERGeneralizedTime getWillBeRevokedAt() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
