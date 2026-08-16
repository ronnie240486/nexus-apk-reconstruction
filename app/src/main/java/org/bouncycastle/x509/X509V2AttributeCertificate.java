package org.bouncycastle.x509;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.util.Date;
import java.util.Set;
import org.bouncycastle.asn1.x509.AttributeCertificate;

/* JADX INFO: loaded from: classes2.dex */
public class X509V2AttributeCertificate implements X509AttributeCertificate {
    private AttributeCertificate cert;
    private Date notAfter;
    private Date notBefore;

    /* JADX WARN: Invalid debug info offset */
    public X509V2AttributeCertificate(InputStream inputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public X509V2AttributeCertificate(org.bouncycastle.asn1.x509.AttributeCertificate r2) throws java.io.IOException {
        /*
            r1 = this;
            return
        L2a:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509V2AttributeCertificate.<init>(org.bouncycastle.asn1.x509.AttributeCertificate):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public X509V2AttributeCertificate(byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    private Set getExtensionOIDs(boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0010
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private static org.bouncycastle.asn1.x509.AttributeCertificate getObject(java.io.InputStream r3) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        Le:
        L10:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509V2AttributeCertificate.getObject(java.io.InputStream):org.bouncycastle.asn1.x509.AttributeCertificate");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            return r0
        L19:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509V2AttributeCertificate.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public X509Attribute[] getAttributes() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public X509Attribute[] getAttributes(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public byte[] getEncoded() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0017
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            return r0
        L22:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509V2AttributeCertificate.getExtensionValue(java.lang.String):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public AttributeCertificateHolder getHolder() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public AttributeCertificateIssuer getIssuer() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public boolean[] getIssuerUniqueID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public Date getNotAfter() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public Date getNotBefore() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public BigInteger getSerialNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public byte[] getSignature() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public int getVersion() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x002b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public final void verify(java.security.PublicKey r3, java.lang.String r4) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {
        /*
            r2 = this;
            return
        L4b:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509V2AttributeCertificate.verify(java.security.PublicKey, java.lang.String):void");
    }
}
