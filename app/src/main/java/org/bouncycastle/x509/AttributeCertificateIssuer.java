package org.bouncycastle.x509;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.x509.AttCertIssuer;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.util.Selector;

/* JADX INFO: loaded from: classes2.dex */
public class AttributeCertificateIssuer implements CertSelector, Selector {
    final ASN1Encodable form;

    /* JADX WARN: Invalid debug info offset */
    public AttributeCertificateIssuer(X500Principal x500Principal) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public AttributeCertificateIssuer(AttCertIssuer attCertIssuer) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AttributeCertificateIssuer(X509Principal x509Principal) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0026
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private java.lang.Object[] getNames() {
        /*
            r5 = this;
            r0 = 0
            return r0
        L3b:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.AttributeCertificateIssuer.getNames():java.lang.Object[]");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0012
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private boolean matchesDN(javax.security.auth.x500.X500Principal r6, org.bouncycastle.asn1.x509.GeneralNames r7) {
        /*
            r5 = this;
            r0 = 0
            return r0
        L29:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.AttributeCertificateIssuer.matchesDN(javax.security.auth.x500.X500Principal, org.bouncycastle.asn1.x509.GeneralNames):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.CertSelector, org.bouncycastle.util.Selector
    public Object clone() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public Principal[] getPrincipals() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.util.Selector
    public boolean match(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.CertSelector
    public boolean match(Certificate certificate) {
        return false;
    }
}
