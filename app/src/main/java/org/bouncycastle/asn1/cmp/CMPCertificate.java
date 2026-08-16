package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.AttributeCertificate;
import org.bouncycastle.asn1.x509.X509CertificateStructure;

/* JADX INFO: loaded from: classes2.dex */
public class CMPCertificate extends ASN1Encodable implements ASN1Choice {
    private AttributeCertificate x509v2AttrCert;
    private X509CertificateStructure x509v3PKCert;

    /* JADX WARN: Invalid debug info offset */
    public CMPCertificate(AttributeCertificate attributeCertificate) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CMPCertificate(X509CertificateStructure x509CertificateStructure) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CMPCertificate getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AttributeCertificate getX509v2AttrCert() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509CertificateStructure getX509v3PKCert() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isX509v3PKCert() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
