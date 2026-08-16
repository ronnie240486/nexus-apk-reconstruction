package org.bouncycastle.crypto.tls;

import java.io.IOException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultTlsSignerCredentials implements TlsSignerCredentials {
    protected Certificate clientCert;
    protected AsymmetricKeyParameter clientPrivateKey;
    protected TlsSigner clientSigner;
    protected TlsClientContext context;

    /* JADX WARN: Invalid debug info offset */
    public DefaultTlsSignerCredentials(TlsClientContext tlsClientContext, Certificate certificate, AsymmetricKeyParameter asymmetricKeyParameter) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsSignerCredentials
    public byte[] generateCertificateSignature(byte[] bArr) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsCredentials
    public Certificate getCertificate() {
        return null;
    }
}
