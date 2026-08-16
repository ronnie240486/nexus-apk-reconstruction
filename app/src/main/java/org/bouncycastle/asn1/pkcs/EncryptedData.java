package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class EncryptedData extends ASN1Encodable {
    DERObjectIdentifier bagId;
    DERObject bagValue;
    ASN1Sequence data;

    /* JADX WARN: Invalid debug info offset */
    public EncryptedData(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public EncryptedData(DERObjectIdentifier dERObjectIdentifier, AlgorithmIdentifier algorithmIdentifier, DEREncodable dEREncodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static EncryptedData getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getContent() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getContentType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getEncryptionAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
