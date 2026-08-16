package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class Attribute extends ASN1Encodable {
    private DERObjectIdentifier attrType;
    private ASN1Set attrValues;

    /* JADX WARN: Invalid debug info offset */
    public Attribute(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Attribute(DERObjectIdentifier dERObjectIdentifier, ASN1Set aSN1Set) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static Attribute getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getAttrType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Set getAttrValues() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
