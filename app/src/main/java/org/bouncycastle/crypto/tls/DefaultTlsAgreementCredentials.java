package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultTlsAgreementCredentials implements TlsAgreementCredentials {
    protected BasicAgreement basicAgreement;
    protected Certificate clientCert;
    protected AsymmetricKeyParameter clientPrivateKey;

    /* JADX WARN: Invalid debug info offset */
    public DefaultTlsAgreementCredentials(Certificate certificate, AsymmetricKeyParameter asymmetricKeyParameter) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsAgreementCredentials
    public byte[] generateAgreement(AsymmetricKeyParameter asymmetricKeyParameter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsCredentials
    public Certificate getCertificate() {
        return null;
    }
}
