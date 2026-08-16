package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class OCSPRequest extends ASN1Encodable {
    Signature optionalSignature;
    TBSRequest tbsRequest;

    /* JADX WARN: Invalid debug info offset */
    public OCSPRequest(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OCSPRequest(TBSRequest tBSRequest, Signature signature) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static OCSPRequest getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static OCSPRequest getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Signature getOptionalSignature() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public TBSRequest getTbsRequest() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
