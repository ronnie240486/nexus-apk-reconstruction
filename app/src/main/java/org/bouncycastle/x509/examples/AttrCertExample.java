package org.bouncycastle.x509.examples;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.bouncycastle.x509.X509V1CertificateGenerator;
import org.bouncycastle.x509.X509V3CertificateGenerator;

/* JADX INFO: loaded from: classes2.dex */
public class AttrCertExample {
    static X509V1CertificateGenerator v1CertGen = new X509V1CertificateGenerator();
    static X509V3CertificateGenerator v3CertGen = new X509V3CertificateGenerator();

    /* JADX WARN: Invalid debug info offset */
    public static X509Certificate createAcIssuerCert(PublicKey publicKey, PrivateKey privateKey) throws Exception {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static X509Certificate createClientCert(PublicKey publicKey, PrivateKey privateKey, PublicKey publicKey2) throws Exception {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x01e4
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void main(java.lang.String[] r17) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.examples.AttrCertExample.main(java.lang.String[]):void");
    }
}
