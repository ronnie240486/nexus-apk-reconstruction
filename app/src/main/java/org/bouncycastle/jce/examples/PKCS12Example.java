package org.bouncycastle.jce.examples;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import org.bouncycastle.x509.X509V1CertificateGenerator;
import org.bouncycastle.x509.X509V3CertificateGenerator;

/* JADX INFO: loaded from: classes2.dex */
public class PKCS12Example {
    static char[] passwd = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
    static X509V1CertificateGenerator v1CertGen = new X509V1CertificateGenerator();
    static X509V3CertificateGenerator v3CertGen = new X509V3CertificateGenerator();

    /* JADX WARN: Invalid debug info offset */
    public static Certificate createCert(PublicKey publicKey, PrivateKey privateKey, PublicKey publicKey2) throws Exception {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Certificate createIntermediateCert(PublicKey publicKey, PrivateKey privateKey, X509Certificate x509Certificate) throws Exception {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Certificate createMasterCert(PublicKey publicKey, PrivateKey privateKey) throws Exception {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void main(String[] strArr) throws Exception {
    }
}
