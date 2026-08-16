package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class PollRepContent extends ASN1Encodable {
    private DERInteger certReqId;
    private DERInteger checkAfter;
    private PKIFreeText reason;

    /* JADX WARN: Invalid debug info offset */
    private PollRepContent(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static PollRepContent getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getCertReqId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getCheckAfter() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIFreeText getReason() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
