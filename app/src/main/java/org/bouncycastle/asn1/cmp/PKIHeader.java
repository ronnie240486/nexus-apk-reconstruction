package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;

/* JADX INFO: loaded from: classes2.dex */
public class PKIHeader extends ASN1Encodable {
    public static final int CMP_1999 = 1;
    public static final int CMP_2000 = 2;
    public static final GeneralName NULL_NAME = new GeneralName(X500Name.getInstance(new DERSequence()));
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
    public PKIHeader(int i, GeneralName generalName, GeneralName generalName2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private PKIHeader(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    private PKIHeader(DERInteger dERInteger, GeneralName generalName, GeneralName generalName2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void addOptional(ASN1EncodableVector aSN1EncodableVector, int i, ASN1Encodable aSN1Encodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static PKIHeader getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIFreeText getFreeText() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public InfoTypeAndValue[] getGeneralInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERGeneralizedTime getMessageTime() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getProtectionAlg() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getPvno() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getRecipKID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getRecipNonce() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralName getRecipient() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralName getSender() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getSenderKID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getSenderNonce() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getTransactionID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
