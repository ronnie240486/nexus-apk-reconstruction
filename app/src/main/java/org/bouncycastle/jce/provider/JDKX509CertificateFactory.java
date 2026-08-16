package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.CertificateParsingException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.x509.CertificateList;

/* JADX INFO: loaded from: classes2.dex */
public class JDKX509CertificateFactory extends CertificateFactorySpi {
    private static final PEMUtil PEM_CERT_PARSER = new PEMUtil("CERTIFICATE");
    private static final PEMUtil PEM_CRL_PARSER = new PEMUtil("CRL");
    private InputStream currentCrlStream;
    private InputStream currentStream;
    private ASN1Set sCrlData;
    private int sCrlDataObjectCount;
    private ASN1Set sData;
    private int sDataObjectCount;

    /* JADX WARN: Invalid debug info offset */
    private CRL getCRL() throws CRLException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private Certificate getCertificate() throws CertificateParsingException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private CRL readDERCRL(ASN1InputStream aSN1InputStream) throws IOException, CRLException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private Certificate readDERCertificate(ASN1InputStream aSN1InputStream) throws CertificateParsingException, IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private CRL readPEMCRL(InputStream inputStream) throws IOException, CRLException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private Certificate readPEMCertificate(InputStream inputStream) throws CertificateParsingException, IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CRL createCRL(CertificateList certificateList) throws CRLException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0010
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.cert.CertificateFactorySpi
    public java.security.cert.CRL engineGenerateCRL(java.io.InputStream r5) throws java.security.cert.CRLException {
        /*
            r4 = this;
            r0 = 0
            return r0
        L21:
        L23:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKX509CertificateFactory.engineGenerateCRL(java.io.InputStream):java.security.cert.CRL");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.CertificateFactorySpi
    public Collection engineGenerateCRLs(InputStream inputStream) throws CRLException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream) throws CertificateException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream, String str) throws CertificateException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(List list) throws CertificateException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0010
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.cert.CertificateFactorySpi
    public java.security.cert.Certificate engineGenerateCertificate(java.io.InputStream r5) throws java.security.cert.CertificateException {
        /*
            r4 = this;
            r0 = 0
            return r0
        L21:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKX509CertificateFactory.engineGenerateCertificate(java.io.InputStream):java.security.cert.Certificate");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.CertificateFactorySpi
    public Collection engineGenerateCertificates(InputStream inputStream) throws CertificateException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.CertificateFactorySpi
    public Iterator engineGetCertPathEncodings() {
        return null;
    }
}
