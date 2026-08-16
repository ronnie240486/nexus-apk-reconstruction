package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class KeyAgreeRecipientIdentifier extends ASN1Encodable implements ASN1Choice {
    private IssuerAndSerialNumber issuerSerial;
    private RecipientKeyIdentifier rKeyID;

    /* JADX WARN: Invalid debug info offset */
    public KeyAgreeRecipientIdentifier(IssuerAndSerialNumber issuerAndSerialNumber) {
    }

    /* JADX WARN: Invalid debug info offset */
    public KeyAgreeRecipientIdentifier(RecipientKeyIdentifier recipientKeyIdentifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static KeyAgreeRecipientIdentifier getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static KeyAgreeRecipientIdentifier getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public IssuerAndSerialNumber getIssuerAndSerialNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RecipientKeyIdentifier getRKeyID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
