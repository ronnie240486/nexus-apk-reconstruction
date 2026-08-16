package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class OcspResponsesID extends ASN1Encodable {
    private OcspIdentifier ocspIdentifier;
    private OtherHash ocspRepHash;

    /* JADX WARN: Invalid debug info offset */
    private OcspResponsesID(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OcspResponsesID(OcspIdentifier ocspIdentifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OcspResponsesID(OcspIdentifier ocspIdentifier, OtherHash otherHash) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static OcspResponsesID getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public OcspIdentifier getOcspIdentifier() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public OtherHash getOcspRepHash() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
