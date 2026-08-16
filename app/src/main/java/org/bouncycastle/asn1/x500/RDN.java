package org.bouncycastle.asn1.x500;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class RDN extends ASN1Encodable {
    private ASN1Set values;

    /* JADX WARN: Invalid debug info offset */
    public RDN(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    private RDN(ASN1Set aSN1Set) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RDN(AttributeTypeAndValue attributeTypeAndValue) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RDN(AttributeTypeAndValue[] attributeTypeAndValueArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static RDN getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AttributeTypeAndValue getFirst() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AttributeTypeAndValue[] getTypesAndValues() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isMultiValued() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
