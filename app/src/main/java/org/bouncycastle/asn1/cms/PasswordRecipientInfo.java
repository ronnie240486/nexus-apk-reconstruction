package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class PasswordRecipientInfo extends ASN1Encodable {
    private ASN1OctetString encryptedKey;
    private AlgorithmIdentifier keyDerivationAlgorithm;
    private AlgorithmIdentifier keyEncryptionAlgorithm;
    private DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    public PasswordRecipientInfo(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PasswordRecipientInfo(AlgorithmIdentifier algorithmIdentifier, ASN1OctetString aSN1OctetString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PasswordRecipientInfo(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, ASN1OctetString aSN1OctetString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static PasswordRecipientInfo getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static PasswordRecipientInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getEncryptedKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getKeyDerivationAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getKeyEncryptionAlgorithm() {
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
