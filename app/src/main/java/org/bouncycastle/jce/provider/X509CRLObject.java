package org.bouncycastle.jce.provider;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.x509.CertificateList;

/* JADX INFO: loaded from: classes2.dex */
public class X509CRLObject extends X509CRL {

    /* JADX INFO: renamed from: c */
    private CertificateList f16385c;
    private boolean isIndirect;
    private String sigAlgName;
    private byte[] sigAlgParams;

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public X509CRLObject(org.bouncycastle.asn1.x509.CertificateList r4) throws java.security.cert.CRLException {
        /*
            r3 = this;
            return
        L2a:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.X509CRLObject.<init>(org.bouncycastle.asn1.x509.CertificateList):void");
    }

    /* JADX WARN: Invalid debug info offset */
    private Set getExtensionOIDs(boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private boolean isIndirectCRL() throws java.security.cert.CRLException {
        /*
            r3 = this;
            r0 = 0
            return r0
        L19:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.X509CRLObject.isIndirectCRL():boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    private Set loadCRLEntries() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() throws CRLException {
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
        L20:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.X509CRLObject.getExtensionValue(java.lang.String):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CRL
    public Principal getIssuerDN() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CRL
    public X500Principal getIssuerX500Principal() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CRL
    public Date getNextUpdate() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CRL
    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CRL
    public Set getRevokedCertificates() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CRL
    public String getSigAlgName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CRL
    public String getSigAlgOID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CRL
    public byte[] getSigAlgParams() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CRL
    public byte[] getSignature() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CRL
    public byte[] getTBSCertList() throws CRLException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CRL
    public Date getThisUpdate() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CRL
    public int getVersion() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.CRL
    public boolean isRevoked(Certificate certificate) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x00ed
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.cert.CRL
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.X509CRLObject.toString():java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException, NoSuchProviderException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException, NoSuchProviderException {
    }
}
