package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class CertRepMessage extends ASN1Encodable {
    private ASN1Sequence caPubs;
    private ASN1Sequence response;

    /* JADX WARN: Invalid debug info offset */
    private CertRepMessage(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertRepMessage(CMPCertificate[] cMPCertificateArr, CertResponse[] certResponseArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertRepMessage getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CMPCertificate[] getCaPubs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertResponse[] getResponse() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
