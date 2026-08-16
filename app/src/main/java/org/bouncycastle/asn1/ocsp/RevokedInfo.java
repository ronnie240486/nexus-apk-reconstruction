package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.CRLReason;

/* JADX INFO: loaded from: classes2.dex */
public class RevokedInfo extends ASN1Encodable {
    private CRLReason revocationReason;
    private DERGeneralizedTime revocationTime;

    /* JADX WARN: Invalid debug info offset */
    public RevokedInfo(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RevokedInfo(DERGeneralizedTime dERGeneralizedTime, CRLReason cRLReason) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static RevokedInfo getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static RevokedInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CRLReason getRevocationReason() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERGeneralizedTime getRevocationTime() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
