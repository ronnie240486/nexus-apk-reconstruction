package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class RecipientKeyIdentifier extends ASN1Encodable {
    private DERGeneralizedTime date;
    private OtherKeyAttribute other;
    private ASN1OctetString subjectKeyIdentifier;

    /* JADX WARN: Invalid debug info offset */
    public RecipientKeyIdentifier(ASN1OctetString aSN1OctetString, DERGeneralizedTime dERGeneralizedTime, OtherKeyAttribute otherKeyAttribute) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RecipientKeyIdentifier(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RecipientKeyIdentifier(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RecipientKeyIdentifier(byte[] bArr, DERGeneralizedTime dERGeneralizedTime, OtherKeyAttribute otherKeyAttribute) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static RecipientKeyIdentifier getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static RecipientKeyIdentifier getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERGeneralizedTime getDate() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public OtherKeyAttribute getOtherKeyAttribute() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getSubjectKeyIdentifier() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
