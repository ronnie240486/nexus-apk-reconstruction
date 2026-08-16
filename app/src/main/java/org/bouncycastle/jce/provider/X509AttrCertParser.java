package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.x509.X509AttributeCertificate;
import org.bouncycastle.x509.X509StreamParserSpi;
import org.bouncycastle.x509.util.StreamParsingException;

/* JADX INFO: loaded from: classes2.dex */
public class X509AttrCertParser extends X509StreamParserSpi {
    private static final PEMUtil PEM_PARSER = new PEMUtil("ATTRIBUTE CERTIFICATE");
    private InputStream currentStream;
    private ASN1Set sData;
    private int sDataObjectCount;

    /* JADX WARN: Invalid debug info offset */
    private X509AttributeCertificate getCertificate() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private X509AttributeCertificate readDERCertificate(InputStream inputStream) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private X509AttributeCertificate readPEMCertificate(InputStream inputStream) throws IOException {
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
