package org.bouncycastle.ocsp;

import java.math.BigInteger;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.ocsp.CertID;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class CertificateID {
    public static final String HASH_SHA1 = "1.3.14.3.2.26";

    /* JADX INFO: renamed from: id */
    private final CertID f16432id;

    /* JADX WARN: Invalid debug info offset */
    public CertificateID(String str, X509Certificate x509Certificate, BigInteger bigInteger) throws OCSPException {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertificateID(String str, X509Certificate x509Certificate, BigInteger bigInteger, String str2) throws OCSPException {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertificateID(CertID certID) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static CertID createCertID(AlgorithmIdentifier algorithmIdentifier, X509Certificate x509Certificate, DERInteger dERInteger, String str) throws OCSPException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertificateID deriveCertificateID(CertificateID certificateID, BigInteger bigInteger) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getHashAlgOID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getIssuerKeyHash() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getIssuerNameHash() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getSerialNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean matchesIssuer(X509Certificate x509Certificate, String str) throws OCSPException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertID toASN1Object() {
        return null;
    }
}
