package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.X509Extensions;

/* JADX INFO: loaded from: classes2.dex */
public class ResponseData extends ASN1Encodable {

    /* JADX INFO: renamed from: V1 */
    private static final DERInteger f15991V1 = new DERInteger(0);
    private DERGeneralizedTime producedAt;
    private ResponderID responderID;
    private X509Extensions responseExtensions;
    private ASN1Sequence responses;
    private DERInteger version;
    private boolean versionPresent;

    /* JADX WARN: Invalid debug info offset */
    public ResponseData(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ResponseData(DERInteger dERInteger, ResponderID responderID, DERGeneralizedTime dERGeneralizedTime, ASN1Sequence aSN1Sequence, X509Extensions x509Extensions) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ResponseData(ResponderID responderID, DERGeneralizedTime dERGeneralizedTime, ASN1Sequence aSN1Sequence, X509Extensions x509Extensions) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static ResponseData getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static ResponseData getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERGeneralizedTime getProducedAt() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ResponderID getResponderID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Extensions getResponseExtensions() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Sequence getResponses() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getVersion() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
