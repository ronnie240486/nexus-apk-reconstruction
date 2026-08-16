package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DERUTCTime;
import org.bouncycastle.asn1.x500.X500Name;

/* JADX INFO: loaded from: classes2.dex */
public class V3TBSCertificateGenerator {
    private boolean altNamePresentAndCritical;
    Time endDate;
    X509Extensions extensions;
    X509Name issuer;
    private DERBitString issuerUniqueID;
    DERInteger serialNumber;
    AlgorithmIdentifier signature;
    Time startDate;
    X509Name subject;
    SubjectPublicKeyInfo subjectPublicKeyInfo;
    private DERBitString subjectUniqueID;
    DERTaggedObject version;

    /* JADX WARN: Invalid debug info offset */
    public TBSCertificateStructure generateTBSCertificate() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setEndDate(DERUTCTime dERUTCTime) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setEndDate(Time time) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setExtensions(X509Extensions x509Extensions) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setIssuer(X500Name x500Name) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setIssuer(X509Name x509Name) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setIssuerUniqueID(DERBitString dERBitString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSerialNumber(DERInteger dERInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSignature(AlgorithmIdentifier algorithmIdentifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setStartDate(DERUTCTime dERUTCTime) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setStartDate(Time time) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSubject(X500Name x500Name) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSubject(X509Name x509Name) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSubjectPublicKeyInfo(SubjectPublicKeyInfo subjectPublicKeyInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSubjectUniqueID(DERBitString dERBitString) {
    }
}
