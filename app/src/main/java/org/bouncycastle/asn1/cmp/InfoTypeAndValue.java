package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class InfoTypeAndValue extends ASN1Encodable {
    private DERObjectIdentifier infoType;
    private ASN1Encodable infoValue;

    /* JADX WARN: Invalid debug info offset */
    private InfoTypeAndValue(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public InfoTypeAndValue(DERObjectIdentifier dERObjectIdentifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    public InfoTypeAndValue(DERObjectIdentifier dERObjectIdentifier, ASN1Encodable aSN1Encodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static InfoTypeAndValue getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getInfoType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Encodable getInfoValue() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
