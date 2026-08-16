package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class AttCertValidityPeriod extends ASN1Encodable {
    DERGeneralizedTime notAfterTime;
    DERGeneralizedTime notBeforeTime;

    /* JADX WARN: Invalid debug info offset */
    public AttCertValidityPeriod(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AttCertValidityPeriod(DERGeneralizedTime dERGeneralizedTime, DERGeneralizedTime dERGeneralizedTime2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static AttCertValidityPeriod getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERGeneralizedTime getNotAfterTime() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERGeneralizedTime getNotBeforeTime() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
