package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.cmp.PBMParameter;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class PKMACValue extends ASN1Encodable {
    private AlgorithmIdentifier algId;
    private DERBitString value;

    /* JADX WARN: Invalid debug info offset */
    private PKMACValue(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PKMACValue(PBMParameter pBMParameter, DERBitString dERBitString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PKMACValue(AlgorithmIdentifier algorithmIdentifier, DERBitString dERBitString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static PKMACValue getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static PKMACValue getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getAlgId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBitString getValue() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
