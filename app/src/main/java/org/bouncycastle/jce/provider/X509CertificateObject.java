package org.bouncycastle.jce.provider;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Enumeration;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.X509CertificateStructure;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;

/* JADX INFO: loaded from: classes2.dex */
public class X509CertificateObject extends X509Certificate implements PKCS12BagAttributeCarrier {
    private PKCS12BagAttributeCarrier attrCarrier;
    private BasicConstraints basicConstraints;

    /* JADX INFO: renamed from: c */
    private X509CertificateStructure f16386c;
    private int hashValue;
    private boolean hashValueSet;
    private boolean[] keyUsage;

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public X509CertificateObject(org.bouncycastle.asn1.x509.X509CertificateStructure r8) throws java.security.cert.CertificateParsingException {
        /*
            r7 = this;
            return
        L1f:
        L62:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.X509CertificateObject.<init>(org.bouncycastle.asn1.x509.X509CertificateStructure):void");
    }

    /* JADX WARN: Invalid debug info offset */
    private int calculateHashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private void checkSignature(PublicKey publicKey, Signature signature) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] getExtensionBytes(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean isAlgIdEqual(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Certificate
    public void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.cert.Certificate
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            return r0
        L19:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.X509CertificateObject.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public DEREncodable getBagAttribute(DERObjectIdentifier dERObjectIdentifier) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public Enumeration getBagAttributeKeys() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws CertificateEncodingException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.cert.X509Certificate
    public java.util.List getExtendedKeyUsage() throws java.security.cert.CertificateParsingException {
        /*
            r4 = this;
            r0 = 0
            return r0
        L34:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.X509CertificateObject.getExtendedKeyUsage():java.util.List");
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
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.X509CertificateObject.getExtensionValue(java.lang.String):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Certificate
    public Date getNotAfter() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() throws CertificateEncodingException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.Certificate
    public synchronized int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(DERObjectIdentifier dERObjectIdentifier, DEREncodable dEREncodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0117
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.cert.Certificate
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.X509CertificateObject.toString():java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.cert.Certificate
    public final void verify(java.security.PublicKey r3) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {
        /*
            r2 = this;
            return
        L11:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.X509CertificateObject.verify(java.security.PublicKey):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
    }
}
