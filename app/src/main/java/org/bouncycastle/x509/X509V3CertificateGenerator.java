package org.bouncycastle.x509;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Iterator;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.TBSCertificateStructure;
import org.bouncycastle.asn1.x509.V3TBSCertificateGenerator;
import org.bouncycastle.asn1.x509.X509ExtensionsGenerator;
import org.bouncycastle.asn1.x509.X509Name;

/* JADX INFO: loaded from: classes2.dex */
public class X509V3CertificateGenerator {
    private X509ExtensionsGenerator extGenerator;
    private AlgorithmIdentifier sigAlgId;
    private DERObjectIdentifier sigOID;
    private String signatureAlgorithm;
    private V3TBSCertificateGenerator tbsGen;

    /* JADX WARN: Invalid debug info offset */
    private DERBitString booleanToBitString(boolean[] zArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private X509Certificate generateJcaObject(TBSCertificateStructure tBSCertificateStructure, byte[] bArr) throws CertificateParsingException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private TBSCertificateStructure generateTbsCert() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void addExtension(String str, boolean z, DEREncodable dEREncodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addExtension(String str, boolean z, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addExtension(DERObjectIdentifier dERObjectIdentifier, boolean z, DEREncodable dEREncodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addExtension(DERObjectIdentifier dERObjectIdentifier, boolean z, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void copyAndAddExtension(java.lang.String r2, boolean r3, java.security.cert.X509Certificate r4) throws java.security.cert.CertificateParsingException {
        /*
            r1 = this;
            return
        Le:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509V3CertificateGenerator.copyAndAddExtension(java.lang.String, boolean, java.security.cert.X509Certificate):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public void copyAndAddExtension(DERObjectIdentifier dERObjectIdentifier, boolean z, X509Certificate x509Certificate) throws CertificateParsingException {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Certificate generate(PrivateKey privateKey) throws IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateEncodingException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Certificate generate(PrivateKey privateKey, String str) throws IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException, CertificateEncodingException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public java.security.cert.X509Certificate generate(java.security.PrivateKey r8, java.lang.String r9, java.security.SecureRandom r10) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        /*
            r7 = this;
            r0 = 0
            return r0
        L15:
        L1e:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509V3CertificateGenerator.generate(java.security.PrivateKey, java.lang.String, java.security.SecureRandom):java.security.cert.X509Certificate");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public java.security.cert.X509Certificate generate(java.security.PrivateKey r4, java.security.SecureRandom r5) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        /*
            r3 = this;
            r0 = 0
            return r0
        L11:
        L1a:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509V3CertificateGenerator.generate(java.security.PrivateKey, java.security.SecureRandom):java.security.cert.X509Certificate");
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Certificate generateX509Certificate(PrivateKey privateKey) throws SignatureException, SecurityException, InvalidKeyException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Certificate generateX509Certificate(PrivateKey privateKey, String str) throws SignatureException, SecurityException, InvalidKeyException, NoSuchProviderException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x001a
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public java.security.cert.X509Certificate generateX509Certificate(java.security.PrivateKey r2, java.lang.String r3, java.security.SecureRandom r4) throws java.security.NoSuchProviderException, java.lang.SecurityException, java.security.SignatureException, java.security.InvalidKeyException {
        /*
            r1 = this;
            r0 = 0
            return r0
        L5:
        L1a:
        L1c:
        L1e:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509V3CertificateGenerator.generateX509Certificate(java.security.PrivateKey, java.lang.String, java.security.SecureRandom):java.security.cert.X509Certificate");
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Certificate generateX509Certificate(PrivateKey privateKey, SecureRandom secureRandom) throws SignatureException, SecurityException, InvalidKeyException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Iterator getSignatureAlgNames() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void reset() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setIssuerDN(X500Principal x500Principal) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setIssuerDN(X509Name x509Name) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setIssuerUniqueID(boolean[] zArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setNotAfter(Date date) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setNotBefore(Date date) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPublicKey(PublicKey publicKey) throws IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSerialNumber(BigInteger bigInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void setSignatureAlgorithm(java.lang.String r3) {
        /*
            r2 = this;
            return
        L14:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509V3CertificateGenerator.setSignatureAlgorithm(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSubjectDN(X500Principal x500Principal) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSubjectDN(X509Name x509Name) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSubjectUniqueID(boolean[] zArr) {
    }
}
