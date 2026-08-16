package org.bouncycastle.jce;

import java.io.IOException;
import java.security.Principal;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.X509Name;

/* JADX INFO: loaded from: classes2.dex */
public class X509Principal extends X509Name implements Principal {
    /* JADX WARN: Invalid debug info offset */
    public X509Principal(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Principal(Hashtable hashtable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Principal(Vector vector, Hashtable hashtable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Principal(Vector vector, Vector vector2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Principal(X509Name x509Name) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Principal(boolean z, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Principal(boolean z, Hashtable hashtable, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Principal(byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    private static ASN1Sequence readSequence(ASN1InputStream aSN1InputStream) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public byte[] getEncoded() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.Principal
    public String getName() {
        return null;
    }
}
