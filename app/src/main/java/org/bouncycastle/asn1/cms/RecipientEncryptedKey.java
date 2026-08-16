package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class RecipientEncryptedKey extends ASN1Encodable {
    private ASN1OctetString encryptedKey;
    private KeyAgreeRecipientIdentifier identifier;

    /* JADX WARN: Invalid debug info offset */
    private RecipientEncryptedKey(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RecipientEncryptedKey(KeyAgreeRecipientIdentifier keyAgreeRecipientIdentifier, ASN1OctetString aSN1OctetString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static RecipientEncryptedKey getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static RecipientEncryptedKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getEncryptedKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public KeyAgreeRecipientIdentifier getIdentifier() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
