package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class CertConfirmContent extends ASN1Encodable {
    private ASN1Sequence content;

    /* JADX WARN: Invalid debug info offset */
    private CertConfirmContent(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertConfirmContent getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertStatus[] toCertStatusArray() {
        return null;
    }
}
