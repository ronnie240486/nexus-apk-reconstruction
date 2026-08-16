package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.X509Extensions;

/* JADX INFO: loaded from: classes2.dex */
public class Request extends ASN1Encodable {
    CertID reqCert;
    X509Extensions singleRequestExtensions;

    /* JADX WARN: Invalid debug info offset */
    public Request(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Request(CertID certID, X509Extensions x509Extensions) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static Request getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Request getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertID getReqCert() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Extensions getSingleRequestExtensions() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
