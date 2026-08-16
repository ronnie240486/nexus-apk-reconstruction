package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class ProtectedPart extends ASN1Encodable {
    private PKIBody body;
    private PKIHeader header;

    /* JADX WARN: Invalid debug info offset */
    private ProtectedPart(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ProtectedPart(PKIHeader pKIHeader, PKIBody pKIBody) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static ProtectedPart getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIBody getBody() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIHeader getHeader() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
