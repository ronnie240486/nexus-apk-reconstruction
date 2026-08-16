package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class CertReqMsg extends ASN1Encodable {
    private CertRequest certReq;
    private ProofOfPossession popo;
    private ASN1Sequence regInfo;

    /* JADX WARN: Invalid debug info offset */
    private CertReqMsg(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertReqMsg(CertRequest certRequest, ProofOfPossession proofOfPossession, AttributeTypeAndValue[] attributeTypeAndValueArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void addOptional(ASN1EncodableVector aSN1EncodableVector, ASN1Encodable aSN1Encodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertReqMsg getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertRequest getCertReq() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ProofOfPossession getPop() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ProofOfPossession getPopo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AttributeTypeAndValue[] getRegInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
