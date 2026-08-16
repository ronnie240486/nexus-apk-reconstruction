package org.bouncycastle.x509;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.x509.CertificatePair;

/* JADX INFO: loaded from: classes2.dex */
public class X509CertificatePair {
    private X509Certificate forward;
    private X509Certificate reverse;

    /* JADX WARN: Invalid debug info offset */
    public X509CertificatePair(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509CertificatePair(CertificatePair certificatePair) throws CertificateParsingException {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0025
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public byte[] getEncoded() throws java.security.cert.CertificateEncodingException {
        /*
            r3 = this;
            r0 = 0
            return r0
        L23:
        L25:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509CertificatePair.getEncoded():byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Certificate getForward() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Certificate getReverse() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }
}
