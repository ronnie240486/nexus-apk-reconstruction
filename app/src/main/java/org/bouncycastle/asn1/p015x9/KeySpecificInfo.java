package org.bouncycastle.asn1.p015x9;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class KeySpecificInfo extends ASN1Encodable {
    private DERObjectIdentifier algorithm;
    private ASN1OctetString counter;

    /* JADX WARN: Invalid debug info offset */
    public KeySpecificInfo(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public KeySpecificInfo(DERObjectIdentifier dERObjectIdentifier, ASN1OctetString aSN1OctetString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getCounter() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
