package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;

/* JADX INFO: loaded from: classes2.dex */
public class PKIHeaderBuilder {
    private PKIFreeText freeText;
    private ASN1Sequence generalInfo;
    private DERGeneralizedTime messageTime;
    private AlgorithmIdentifier protectionAlg;
    private DERInteger pvno;
    private ASN1OctetString recipKID;
    private ASN1OctetString recipNonce;
    private GeneralName recipient;
    private GeneralName sender;
    private ASN1OctetString senderKID;
    private ASN1OctetString senderNonce;
    private ASN1OctetString transactionID;

    /* JADX WARN: Invalid debug info offset */
    public PKIHeaderBuilder(int i, GeneralName generalName, GeneralName generalName2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private PKIHeaderBuilder(DERInteger dERInteger, GeneralName generalName, GeneralName generalName2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void addOptional(ASN1EncodableVector aSN1EncodableVector, int i, ASN1Encodable aSN1Encodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static ASN1Sequence makeGeneralInfoSeq(InfoTypeAndValue infoTypeAndValue) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static ASN1Sequence makeGeneralInfoSeq(InfoTypeAndValue[] infoTypeAndValueArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIHeader build() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIHeaderBuilder setFreeText(PKIFreeText pKIFreeText) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIHeaderBuilder setGeneralInfo(ASN1Sequence aSN1Sequence) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIHeaderBuilder setGeneralInfo(InfoTypeAndValue infoTypeAndValue) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIHeaderBuilder setGeneralInfo(InfoTypeAndValue[] infoTypeAndValueArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIHeaderBuilder setMessageTime(DERGeneralizedTime dERGeneralizedTime) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIHeaderBuilder setProtectionAlg(AlgorithmIdentifier algorithmIdentifier) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIHeaderBuilder setRecipKID(DEROctetString dEROctetString) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIHeaderBuilder setRecipKID(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIHeaderBuilder setRecipNonce(ASN1OctetString aSN1OctetString) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIHeaderBuilder setRecipNonce(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIHeaderBuilder setSenderKID(ASN1OctetString aSN1OctetString) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIHeaderBuilder setSenderKID(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIHeaderBuilder setSenderNonce(ASN1OctetString aSN1OctetString) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIHeaderBuilder setSenderNonce(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIHeaderBuilder setTransactionID(ASN1OctetString aSN1OctetString) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIHeaderBuilder setTransactionID(byte[] bArr) {
        return null;
    }
}
