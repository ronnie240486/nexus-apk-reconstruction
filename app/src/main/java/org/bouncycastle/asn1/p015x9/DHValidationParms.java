package org.bouncycastle.asn1.p015x9;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class DHValidationParms extends ASN1Encodable {
    private DERInteger pgenCounter;
    private DERBitString seed;

    /* JADX WARN: Invalid debug info offset */
    private DHValidationParms(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DHValidationParms(DERBitString dERBitString, DERInteger dERInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static DHValidationParms getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static DHValidationParms getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getPgenCounter() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBitString getSeed() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
