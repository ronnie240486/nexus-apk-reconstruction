package org.bouncycastle.asn1.cmp;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class PKIStatusInfo extends ASN1Encodable {
    DERBitString failInfo;
    DERInteger status;
    PKIFreeText statusString;

    /* JADX WARN: Invalid debug info offset */
    public PKIStatusInfo(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIStatusInfo(int i, PKIFreeText pKIFreeText) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIStatusInfo(int i, PKIFreeText pKIFreeText, PKIFailureInfo pKIFailureInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIStatusInfo(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIStatusInfo(PKIStatus pKIStatus) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIStatusInfo(PKIStatus pKIStatus, PKIFreeText pKIFreeText) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static PKIStatusInfo getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static PKIStatusInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBitString getFailInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getStatus() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIFreeText getStatusString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
