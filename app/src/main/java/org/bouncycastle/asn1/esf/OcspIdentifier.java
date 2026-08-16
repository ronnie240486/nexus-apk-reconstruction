package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.ocsp.ResponderID;

/* JADX INFO: loaded from: classes2.dex */
public class OcspIdentifier extends ASN1Encodable {
    private ResponderID ocspResponderID;
    private DERGeneralizedTime producedAt;

    /* JADX WARN: Invalid debug info offset */
    private OcspIdentifier(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OcspIdentifier(ResponderID responderID, DERGeneralizedTime dERGeneralizedTime) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static OcspIdentifier getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ResponderID getOcspResponderID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERGeneralizedTime getProducedAt() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
