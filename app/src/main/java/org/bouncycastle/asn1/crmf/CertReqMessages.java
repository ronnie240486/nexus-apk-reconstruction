package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class CertReqMessages extends ASN1Encodable {
    private ASN1Sequence content;

    /* JADX WARN: Invalid debug info offset */
    private CertReqMessages(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertReqMessages(CertReqMsg certReqMsg) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertReqMessages(CertReqMsg[] certReqMsgArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertReqMessages getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertReqMsg[] toCertReqMsgArray() {
        return null;
    }
}
