package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509Name;

/* JADX INFO: loaded from: classes2.dex */
public class CertificationRequestInfo extends ASN1Encodable {
    ASN1Set attributes;
    X509Name subject;
    SubjectPublicKeyInfo subjectPKInfo;
    DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    public CertificationRequestInfo(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertificationRequestInfo(X500Name x500Name, SubjectPublicKeyInfo subjectPublicKeyInfo, ASN1Set aSN1Set) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertificationRequestInfo(X509Name x509Name, SubjectPublicKeyInfo subjectPublicKeyInfo, ASN1Set aSN1Set) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertificationRequestInfo getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Set getAttributes() {
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
    public DERInteger getVersion() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
