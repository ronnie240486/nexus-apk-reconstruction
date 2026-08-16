package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class CertBag extends ASN1Encodable {
    DERObjectIdentifier certId;
    DERObject certValue;
    ASN1Sequence seq;

    /* JADX WARN: Invalid debug info offset */
    public CertBag(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertBag(DERObjectIdentifier dERObjectIdentifier, DERObject dERObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getCertId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObject getCertValue() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
