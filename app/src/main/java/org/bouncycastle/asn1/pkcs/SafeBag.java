package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class SafeBag extends ASN1Encodable {
    ASN1Set bagAttributes;
    DERObjectIdentifier bagId;
    DERObject bagValue;

    /* JADX WARN: Invalid debug info offset */
    public SafeBag(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SafeBag(DERObjectIdentifier dERObjectIdentifier, DERObject dERObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SafeBag(DERObjectIdentifier dERObjectIdentifier, DERObject dERObject, ASN1Set aSN1Set) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Set getBagAttributes() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getBagId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObject getBagValue() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
