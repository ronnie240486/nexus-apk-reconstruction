package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class OCSPResponse extends ASN1Encodable {
    ResponseBytes responseBytes;
    OCSPResponseStatus responseStatus;

    /* JADX WARN: Invalid debug info offset */
    public OCSPResponse(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OCSPResponse(OCSPResponseStatus oCSPResponseStatus, ResponseBytes responseBytes) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static OCSPResponse getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static OCSPResponse getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ResponseBytes getResponseBytes() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public OCSPResponseStatus getResponseStatus() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
