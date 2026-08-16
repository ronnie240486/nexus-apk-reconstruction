package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class CertResponse extends ASN1Encodable {
    private DERInteger certReqId;
    private CertifiedKeyPair certifiedKeyPair;
    private ASN1OctetString rspInfo;
    private PKIStatusInfo status;

    /* JADX WARN: Invalid debug info offset */
    private CertResponse(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertResponse(DERInteger dERInteger, PKIStatusInfo pKIStatusInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertResponse(DERInteger dERInteger, PKIStatusInfo pKIStatusInfo, CertifiedKeyPair certifiedKeyPair, ASN1OctetString aSN1OctetString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertResponse getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getCertReqId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertifiedKeyPair getCertifiedKeyPair() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIStatusInfo getStatus() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
