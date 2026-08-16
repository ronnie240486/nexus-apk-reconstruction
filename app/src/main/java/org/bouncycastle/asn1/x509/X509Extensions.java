package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class X509Extensions extends ASN1Encodable {
    private Hashtable extensions;
    private Vector ordering;
    public static final ASN1ObjectIdentifier SubjectDirectoryAttributes = new ASN1ObjectIdentifier("2.5.29.9");
    public static final ASN1ObjectIdentifier SubjectKeyIdentifier = new ASN1ObjectIdentifier("2.5.29.14");
    public static final ASN1ObjectIdentifier KeyUsage = new ASN1ObjectIdentifier("2.5.29.15");
    public static final ASN1ObjectIdentifier PrivateKeyUsagePeriod = new ASN1ObjectIdentifier("2.5.29.16");
    public static final ASN1ObjectIdentifier SubjectAlternativeName = new ASN1ObjectIdentifier("2.5.29.17");
    public static final ASN1ObjectIdentifier IssuerAlternativeName = new ASN1ObjectIdentifier("2.5.29.18");
    public static final ASN1ObjectIdentifier BasicConstraints = new ASN1ObjectIdentifier("2.5.29.19");
    public static final ASN1ObjectIdentifier CRLNumber = new ASN1ObjectIdentifier("2.5.29.20");
    public static final ASN1ObjectIdentifier ReasonCode = new ASN1ObjectIdentifier("2.5.29.21");
    public static final ASN1ObjectIdentifier InstructionCode = new ASN1ObjectIdentifier("2.5.29.23");
    public static final ASN1ObjectIdentifier InvalidityDate = new ASN1ObjectIdentifier("2.5.29.24");
    public static final ASN1ObjectIdentifier DeltaCRLIndicator = new ASN1ObjectIdentifier("2.5.29.27");
    public static final ASN1ObjectIdentifier IssuingDistributionPoint = new ASN1ObjectIdentifier("2.5.29.28");
    public static final ASN1ObjectIdentifier CertificateIssuer = new ASN1ObjectIdentifier("2.5.29.29");
    public static final ASN1ObjectIdentifier NameConstraints = new ASN1ObjectIdentifier("2.5.29.30");
    public static final ASN1ObjectIdentifier CRLDistributionPoints = new ASN1ObjectIdentifier("2.5.29.31");
    public static final ASN1ObjectIdentifier CertificatePolicies = new ASN1ObjectIdentifier("2.5.29.32");
    public static final ASN1ObjectIdentifier PolicyMappings = new ASN1ObjectIdentifier("2.5.29.33");
    public static final ASN1ObjectIdentifier AuthorityKeyIdentifier = new ASN1ObjectIdentifier("2.5.29.35");
    public static final ASN1ObjectIdentifier PolicyConstraints = new ASN1ObjectIdentifier("2.5.29.36");
    public static final ASN1ObjectIdentifier ExtendedKeyUsage = new ASN1ObjectIdentifier("2.5.29.37");
    public static final ASN1ObjectIdentifier FreshestCRL = new ASN1ObjectIdentifier("2.5.29.46");
    public static final ASN1ObjectIdentifier InhibitAnyPolicy = new ASN1ObjectIdentifier("2.5.29.54");
    public static final ASN1ObjectIdentifier AuthorityInfoAccess = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.1");
    public static final ASN1ObjectIdentifier SubjectInfoAccess = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.11");
    public static final ASN1ObjectIdentifier LogoType = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.12");
    public static final ASN1ObjectIdentifier BiometricInfo = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.2");
    public static final ASN1ObjectIdentifier QCStatements = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.3");
    public static final ASN1ObjectIdentifier AuditIdentity = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.4");
    public static final ASN1ObjectIdentifier NoRevAvail = new ASN1ObjectIdentifier("2.5.29.56");
    public static final ASN1ObjectIdentifier TargetInformation = new ASN1ObjectIdentifier("2.5.29.55");

    /* JADX WARN: Invalid debug info offset */
    public X509Extensions(Hashtable hashtable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Extensions(Vector vector, Hashtable hashtable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Extensions(Vector vector, Vector vector2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Extensions(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    private ASN1ObjectIdentifier[] getExtensionOIDs(boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static X509Extensions getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static X509Extensions getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private ASN1ObjectIdentifier[] toOidArray(Vector vector) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equivalent(X509Extensions x509Extensions) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1ObjectIdentifier[] getCriticalExtensionOIDs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Extension getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Extension getExtension(DERObjectIdentifier dERObjectIdentifier) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1ObjectIdentifier[] getExtensionOIDs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1ObjectIdentifier[] getNonCriticalExtensionOIDs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Enumeration oids() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
