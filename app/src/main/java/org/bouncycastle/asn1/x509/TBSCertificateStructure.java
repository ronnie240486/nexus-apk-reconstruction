package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

/* JADX INFO: loaded from: classes2.dex */
public class TBSCertificateStructure extends ASN1Encodable implements X509ObjectIdentifiers, PKCSObjectIdentifiers {
    Time endDate;
    X509Extensions extensions;
    X509Name issuer;
    DERBitString issuerUniqueId;
    ASN1Sequence seq;
    DERInteger serialNumber;
    AlgorithmIdentifier signature;
    Time startDate;
    X509Name subject;
    SubjectPublicKeyInfo subjectPublicKeyInfo;
    DERBitString subjectUniqueId;
    DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    public TBSCertificateStructure(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static TBSCertificateStructure getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static TBSCertificateStructure getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Time getEndDate() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Extensions getExtensions() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Name getIssuer() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBitString getIssuerUniqueId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getSerialNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getSignature() {
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
    public DERBitString getSubjectUniqueId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getVersion() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getVersionNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
