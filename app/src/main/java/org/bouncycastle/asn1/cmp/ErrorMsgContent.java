package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class ErrorMsgContent extends ASN1Encodable {
    private DERInteger errorCode;
    private PKIFreeText errorDetails;
    private PKIStatusInfo pkiStatusInfo;

    /* JADX WARN: Invalid debug info offset */
    private ErrorMsgContent(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ErrorMsgContent(PKIStatusInfo pKIStatusInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ErrorMsgContent(PKIStatusInfo pKIStatusInfo, DERInteger dERInteger, PKIFreeText pKIFreeText) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void addOptional(ASN1EncodableVector aSN1EncodableVector, ASN1Encodable aSN1Encodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static ErrorMsgContent getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getErrorCode() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIFreeText getErrorDetails() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIStatusInfo getPKIStatusInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
