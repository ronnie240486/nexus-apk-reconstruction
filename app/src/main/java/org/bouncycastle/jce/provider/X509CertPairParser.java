package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateParsingException;
import java.util.Collection;
import org.bouncycastle.x509.X509CertificatePair;
import org.bouncycastle.x509.X509StreamParserSpi;
import org.bouncycastle.x509.util.StreamParsingException;

/* JADX INFO: loaded from: classes2.dex */
public class X509CertPairParser extends X509StreamParserSpi {
    private InputStream currentStream;

    /* JADX WARN: Invalid debug info offset */
    private X509CertificatePair readDERCrossCertificatePair(InputStream inputStream) throws CertificateParsingException, IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public void engineInit(InputStream inputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public Object engineRead() throws StreamParsingException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public Collection engineReadAll() throws StreamParsingException {
        return null;
    }
}
