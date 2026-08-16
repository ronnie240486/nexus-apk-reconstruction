package org.bouncycastle.asn1.tsp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.cmp.PKIStatusInfo;
import org.bouncycastle.asn1.cms.ContentInfo;

/* JADX INFO: loaded from: classes2.dex */
public class TimeStampResp extends ASN1Encodable {
    PKIStatusInfo pkiStatusInfo;
    ContentInfo timeStampToken;

    /* JADX WARN: Invalid debug info offset */
    public TimeStampResp(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public TimeStampResp(PKIStatusInfo pKIStatusInfo, ContentInfo contentInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static TimeStampResp getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIStatusInfo getStatus() {
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
