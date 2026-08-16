package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509Extensions;

/* JADX INFO: loaded from: classes2.dex */
public class CertTemplate extends ASN1Encodable {
    private X509Extensions extensions;
    private X500Name issuer;
    private DERBitString issuerUID;
    private SubjectPublicKeyInfo publicKey;
    private ASN1Sequence seq;
    private DERInteger serialNumber;
    private AlgorithmIdentifier signingAlg;
    private X500Name subject;
    private DERBitString subjectUID;
    private OptionalValidity validity;
    private DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    private CertTemplate(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertTemplate getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Extensions getExtensions() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X500Name getIssuer() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBitString getIssuerUID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public SubjectPublicKeyInfo getPublicKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getSerialNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getSigningAlg() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X500Name getSubject() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBitString getSubjectUID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public OptionalValidity getValidity() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getVersion() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
