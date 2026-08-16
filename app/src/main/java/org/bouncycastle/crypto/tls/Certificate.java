package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.x509.X509CertificateStructure;

/* JADX INFO: loaded from: classes2.dex */
public class Certificate {
    public static final Certificate EMPTY_CHAIN = new Certificate(new X509CertificateStructure[0]);
    protected X509CertificateStructure[] certs;

    /* JADX WARN: Invalid debug info offset */
    public Certificate(X509CertificateStructure[] x509CertificateStructureArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static Certificate parse(InputStream inputStream) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void encode(OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509CertificateStructure[] getCerts() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isEmpty() {
        return false;
    }
}
