package org.bouncycastle.asn1.x500;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class AttributeTypeAndValue extends ASN1Encodable {
    private ASN1ObjectIdentifier type;
    private ASN1Encodable value;

    /* JADX WARN: Invalid debug info offset */
    public AttributeTypeAndValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    private AttributeTypeAndValue(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static AttributeTypeAndValue getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1ObjectIdentifier getType() {
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
