package org.bouncycastle.crypto.tls;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class LegacyTlsAuthentication implements TlsAuthentication {
    protected CertificateVerifyer verifyer;

    /* JADX WARN: Invalid debug info offset */
    public LegacyTlsAuthentication(CertificateVerifyer certificateVerifyer) {
    }

    @Override // org.bouncycastle.crypto.tls.TlsAuthentication
    public TlsCredentials getClientCredentials(CertificateRequest certificateRequest) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsAuthentication
    public void notifyServerCertificate(Certificate certificate) throws IOException {
    }
}
