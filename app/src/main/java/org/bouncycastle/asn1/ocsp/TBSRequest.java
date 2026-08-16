package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.X509Extensions;

/* JADX INFO: loaded from: classes2.dex */
public class TBSRequest extends ASN1Encodable {

    /* JADX INFO: renamed from: V1 */
    private static final DERInteger f15992V1 = new DERInteger(0);
    X509Extensions requestExtensions;
    ASN1Sequence requestList;
    GeneralName requestorName;
    DERInteger version;
    boolean versionSet;

    /* JADX WARN: Invalid debug info offset */
    public TBSRequest(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public TBSRequest(GeneralName generalName, ASN1Sequence aSN1Sequence, X509Extensions x509Extensions) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static TBSRequest getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static TBSRequest getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Extensions getRequestExtensions() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Sequence getRequestList() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralName getRequestorName() {
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
