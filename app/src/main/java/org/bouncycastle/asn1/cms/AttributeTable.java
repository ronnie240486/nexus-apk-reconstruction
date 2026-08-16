package org.bouncycastle.asn1.cms;

import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class AttributeTable {
    private Hashtable attributes;

    /* JADX WARN: Invalid debug info offset */
    public AttributeTable(Hashtable hashtable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AttributeTable(ASN1EncodableVector aSN1EncodableVector) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AttributeTable(ASN1Set aSN1Set) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AttributeTable(Attributes attributes) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void addAttribute(DERObjectIdentifier dERObjectIdentifier, Attribute attribute) {
    }

    /* JADX WARN: Invalid debug info offset */
    private Hashtable copyTable(Hashtable hashtable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AttributeTable add(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Attribute get(DERObjectIdentifier dERObjectIdentifier) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1EncodableVector getAll(DERObjectIdentifier dERObjectIdentifier) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AttributeTable remove(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int size() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1EncodableVector toASN1EncodableVector() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Attributes toAttributes() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Hashtable toHashtable() {
        return null;
    }
}
