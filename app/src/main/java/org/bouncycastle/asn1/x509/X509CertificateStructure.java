package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

/* JADX INFO: loaded from: classes2.dex */
public class X509CertificateStructure extends ASN1Encodable implements X509ObjectIdentifiers, PKCSObjectIdentifiers {
    ASN1Sequence seq;
    DERBitString sig;
    AlgorithmIdentifier sigAlgId;
    TBSCertificateStructure tbsCert;

    /* JADX WARN: Invalid debug info offset */
    public X509CertificateStructure(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static X509CertificateStructure getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static X509CertificateStructure getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Time getEndDate() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Name getIssuer() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getSerialNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBitString getSignature() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getSignatureAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Time getStartDate() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Name getSubject() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public TBSCertificateStructure getTBSCertificate() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getVersion() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
