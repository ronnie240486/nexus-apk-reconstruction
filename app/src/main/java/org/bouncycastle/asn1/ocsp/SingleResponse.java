package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.X509Extensions;

/* JADX INFO: loaded from: classes2.dex */
public class SingleResponse extends ASN1Encodable {
    private CertID certID;
    private CertStatus certStatus;
    private DERGeneralizedTime nextUpdate;
    private X509Extensions singleExtensions;
    private DERGeneralizedTime thisUpdate;

    /* JADX WARN: Invalid debug info offset */
    public SingleResponse(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SingleResponse(CertID certID, CertStatus certStatus, DERGeneralizedTime dERGeneralizedTime, DERGeneralizedTime dERGeneralizedTime2, X509Extensions x509Extensions) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static SingleResponse getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static SingleResponse getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertID getCertID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertStatus getCertStatus() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERGeneralizedTime getNextUpdate() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Extensions getSingleExtensions() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERGeneralizedTime getThisUpdate() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
