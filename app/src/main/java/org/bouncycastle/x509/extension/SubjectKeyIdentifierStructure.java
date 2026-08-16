package org.bouncycastle.x509.extension;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.SubjectKeyIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class SubjectKeyIdentifierStructure extends SubjectKeyIdentifier {
    /* JADX WARN: Invalid debug info offset */
    public SubjectKeyIdentifierStructure(PublicKey publicKey) throws InvalidKeyException {
    }

    /* JADX WARN: Invalid debug info offset */
    public SubjectKeyIdentifierStructure(byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    private static ASN1OctetString fromPublicKey(PublicKey publicKey) throws InvalidKeyException {
        return null;
    }
}
