package org.bouncycastle.crypto.tls;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class LegacyTlsClient extends DefaultTlsClient {
    protected CertificateVerifyer verifyer;

    /* JADX WARN: Invalid debug info offset */
    public LegacyTlsClient(CertificateVerifyer certificateVerifyer) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsClient
    public TlsAuthentication getAuthentication() throws IOException {
        return null;
    }
}
