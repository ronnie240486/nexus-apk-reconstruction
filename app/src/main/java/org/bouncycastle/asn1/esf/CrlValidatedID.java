package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class CrlValidatedID extends ASN1Encodable {
    private OtherHash crlHash;
    private CrlIdentifier crlIdentifier;

    /* JADX WARN: Invalid debug info offset */
    private CrlValidatedID(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CrlValidatedID(OtherHash otherHash) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CrlValidatedID(OtherHash otherHash, CrlIdentifier crlIdentifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CrlValidatedID getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public OtherHash getCrlHash() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CrlIdentifier getCrlIdentifier() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
