package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.CertificateList;

/* JADX INFO: loaded from: classes2.dex */
public class TimeStampAndCRL extends ASN1Encodable {
    private CertificateList crl;
    private ContentInfo timeStamp;

    /* JADX WARN: Invalid debug info offset */
    private TimeStampAndCRL(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public TimeStampAndCRL(ContentInfo contentInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static TimeStampAndCRL getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertificateList getCertificateList() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ContentInfo getTimeStampToken() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
