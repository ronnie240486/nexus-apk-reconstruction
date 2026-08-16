package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.Signer;

/* JADX INFO: loaded from: classes2.dex */
class TlsECDHEKeyExchange extends TlsECDHKeyExchange {
    /* JADX WARN: Invalid debug info offset */
    public TlsECDHEKeyExchange(TlsClientContext tlsClientContext, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Signer initSigner(TlsSigner tlsSigner, SecurityParameters securityParameters) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsECDHKeyExchange, org.bouncycastle.crypto.tls.TlsKeyExchange
    public void processClientCredentials(TlsCredentials tlsCredentials) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsECDHKeyExchange, org.bouncycastle.crypto.tls.TlsKeyExchange
    public void processServerKeyExchange(InputStream inputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsECDHKeyExchange, org.bouncycastle.crypto.tls.TlsKeyExchange
    public void skipServerKeyExchange() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsECDHKeyExchange, org.bouncycastle.crypto.tls.TlsKeyExchange
    public void validateCertificateRequest(CertificateRequest certificateRequest) throws IOException {
    }
}
