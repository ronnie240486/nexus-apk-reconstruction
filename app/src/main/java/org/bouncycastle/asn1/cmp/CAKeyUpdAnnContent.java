package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class CAKeyUpdAnnContent extends ASN1Encodable {
    private CMPCertificate newWithNew;
    private CMPCertificate newWithOld;
    private CMPCertificate oldWithNew;

    /* JADX WARN: Invalid debug info offset */
    private CAKeyUpdAnnContent(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CAKeyUpdAnnContent getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CMPCertificate getNewWithNew() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CMPCertificate getNewWithOld() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CMPCertificate getOldWithNew() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
