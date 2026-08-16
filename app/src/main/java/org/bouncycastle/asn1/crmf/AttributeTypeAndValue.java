package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class AttributeTypeAndValue extends ASN1Encodable {
    private DERObjectIdentifier type;
    private ASN1Encodable value;

    /* JADX WARN: Invalid debug info offset */
    public AttributeTypeAndValue(String str, ASN1Encodable aSN1Encodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    private AttributeTypeAndValue(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AttributeTypeAndValue(DERObjectIdentifier dERObjectIdentifier, ASN1Encodable aSN1Encodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static AttributeTypeAndValue getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Encodable getValue() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
