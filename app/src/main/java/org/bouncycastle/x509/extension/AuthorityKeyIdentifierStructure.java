package org.bouncycastle.x509.extension;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.X509Extension;

/* JADX INFO: loaded from: classes2.dex */
public class AuthorityKeyIdentifierStructure extends AuthorityKeyIdentifier {
    /* JADX WARN: Invalid debug info offset */
    public AuthorityKeyIdentifierStructure(PublicKey publicKey) throws InvalidKeyException {
    }

    /* JADX WARN: Invalid debug info offset */
    public AuthorityKeyIdentifierStructure(X509Certificate x509Certificate) throws CertificateParsingException {
    }

    /* JADX WARN: Invalid debug info offset */
    public AuthorityKeyIdentifierStructure(X509Extension x509Extension) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AuthorityKeyIdentifierStructure(byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    private static ASN1Sequence fromCertificate(X509Certificate x509Certificate) throws CertificateParsingException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static ASN1Sequence fromKey(PublicKey publicKey) throws InvalidKeyException {
        return null;
    }
}
