package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class AttributeCertificate extends ASN1Encodable {
    AttributeCertificateInfo acinfo;
    AlgorithmIdentifier signatureAlgorithm;
    DERBitString signatureValue;

    /* JADX WARN: Invalid debug info offset */
    public AttributeCertificate(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AttributeCertificate(AttributeCertificateInfo attributeCertificateInfo, AlgorithmIdentifier algorithmIdentifier, DERBitString dERBitString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static AttributeCertificate getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AttributeCertificateInfo getAcinfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getSignatureAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBitString getSignatureValue() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
