package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class OtherRecipientInfo extends ASN1Encodable {
    private DERObjectIdentifier oriType;
    private DEREncodable oriValue;

    /* JADX WARN: Invalid debug info offset */
    public OtherRecipientInfo(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OtherRecipientInfo(DERObjectIdentifier dERObjectIdentifier, DEREncodable dEREncodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static OtherRecipientInfo getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static OtherRecipientInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DEREncodable getValue() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
