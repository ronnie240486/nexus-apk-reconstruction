package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class RevReqContent extends ASN1Encodable {
    private ASN1Sequence content;

    /* JADX WARN: Invalid debug info offset */
    private RevReqContent(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RevReqContent(RevDetails revDetails) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RevReqContent(RevDetails[] revDetailsArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static RevReqContent getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RevDetails[] toRevDetailsArray() {
        return null;
    }
}
