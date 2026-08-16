package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509Extensions;

/* JADX INFO: loaded from: classes2.dex */
public class CertTemplateBuilder {
    private X509Extensions extensions;
    private X500Name issuer;
    private DERBitString issuerUID;
    private SubjectPublicKeyInfo publicKey;
    private DERInteger serialNumber;
    private AlgorithmIdentifier signingAlg;
    private X500Name subject;
    private DERBitString subjectUID;
    private OptionalValidity validity;
    private DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    private void addOptional(ASN1EncodableVector aSN1EncodableVector, int i, boolean z, ASN1Encodable aSN1Encodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertTemplate build() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertTemplateBuilder setExtensions(X509Extensions x509Extensions) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertTemplateBuilder setIssuer(X500Name x500Name) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertTemplateBuilder setIssuerUID(DERBitString dERBitString) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertTemplateBuilder setPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertTemplateBuilder setSerialNumber(DERInteger dERInteger) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertTemplateBuilder setSigningAlg(AlgorithmIdentifier algorithmIdentifier) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertTemplateBuilder setSubject(X500Name x500Name) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertTemplateBuilder setSubjectUID(DERBitString dERBitString) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertTemplateBuilder setValidity(OptionalValidity optionalValidity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertTemplateBuilder setVersion(int i) {
        return null;
    }
}
