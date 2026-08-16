package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class KEKIdentifier extends ASN1Encodable {
    private DERGeneralizedTime date;
    private ASN1OctetString keyIdentifier;
    private OtherKeyAttribute other;

    /* JADX WARN: Invalid debug info offset */
    public KEKIdentifier(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public KEKIdentifier(byte[] bArr, DERGeneralizedTime dERGeneralizedTime, OtherKeyAttribute otherKeyAttribute) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static KEKIdentifier getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static KEKIdentifier getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERGeneralizedTime getDate() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getKeyIdentifier() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public OtherKeyAttribute getOther() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
