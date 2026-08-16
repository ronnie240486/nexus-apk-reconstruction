package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class KeyTransRecipientInfo extends ASN1Encodable {
    private ASN1OctetString encryptedKey;
    private AlgorithmIdentifier keyEncryptionAlgorithm;
    private RecipientIdentifier rid;
    private DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    public KeyTransRecipientInfo(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public KeyTransRecipientInfo(RecipientIdentifier recipientIdentifier, AlgorithmIdentifier algorithmIdentifier, ASN1OctetString aSN1OctetString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static KeyTransRecipientInfo getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getEncryptedKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getKeyEncryptionAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RecipientIdentifier getRecipientIdentifier() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getVersion() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
