package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class KeyAgreeRecipientInfo extends ASN1Encodable {
    private AlgorithmIdentifier keyEncryptionAlgorithm;
    private OriginatorIdentifierOrKey originator;
    private ASN1Sequence recipientEncryptedKeys;
    private ASN1OctetString ukm;
    private DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    public KeyAgreeRecipientInfo(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public KeyAgreeRecipientInfo(OriginatorIdentifierOrKey originatorIdentifierOrKey, ASN1OctetString aSN1OctetString, AlgorithmIdentifier algorithmIdentifier, ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static KeyAgreeRecipientInfo getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static KeyAgreeRecipientInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getKeyEncryptionAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public OriginatorIdentifierOrKey getOriginator() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Sequence getRecipientEncryptedKeys() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getUserKeyingMaterial() {
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
