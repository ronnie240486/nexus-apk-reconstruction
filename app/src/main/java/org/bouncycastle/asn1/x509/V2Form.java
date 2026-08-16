package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class V2Form extends ASN1Encodable {
    IssuerSerial baseCertificateID;
    GeneralNames issuerName;
    ObjectDigestInfo objectDigestInfo;

    /* JADX WARN: Invalid debug info offset */
    public V2Form(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public V2Form(GeneralNames generalNames) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static V2Form getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static V2Form getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public IssuerSerial getBaseCertificateID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralNames getIssuerName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ObjectDigestInfo getObjectDigestInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
