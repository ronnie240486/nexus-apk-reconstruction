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
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Iterator;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.V1TBSCertificateGenerator;
import org.bouncycastle.asn1.x509.X509Name;

/* JADX INFO: loaded from: classes2.dex */
public class X509V1CertificateGenerator {
    private AlgorithmIdentifier sigAlgId;
    private DERObjectIdentifier sigOID;
    private String signatureAlgorithm;
    private V1TBSCertificateGenerator tbsGen;

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0015
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private java.security.cert.X509Certificate generateJcaObject(org.bouncycastle.asn1.x509.TBSCertificateStructure r3, byte[] r4) throws java.security.cert.CertificateEncodingException {
        /*
            r2 = this;
            r0 = 0
            return r0
        L25:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509V1CertificateGenerator.generateJcaObject(org.bouncycastle.asn1.x509.TBSCertificateStructure, byte[]):java.security.cert.X509Certificate");
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
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public java.security.cert.X509Certificate generate(java.security.PrivateKey r8, java.lang.String r9, java.security.SecureRandom r10) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        /*
            r7 = this;
            r0 = 0
            return r0
        L17:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509V1CertificateGenerator.generate(java.security.PrivateKey, java.lang.String, java.security.SecureRandom):java.security.cert.X509Certificate");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public java.security.cert.X509Certificate generate(java.security.PrivateKey r4, java.security.SecureRandom r5) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        /*
            r3 = this;
            r0 = 0
            return r0
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509V1CertificateGenerator.generate(java.security.PrivateKey, java.security.SecureRandom):java.security.cert.X509Certificate");
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
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509V1CertificateGenerator.generateX509Certificate(java.security.PrivateKey, java.lang.String, java.security.SecureRandom):java.security.cert.X509Certificate");
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
    public void setNotAfter(Date date) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setNotBefore(Date date) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPublicKey(PublicKey publicKey) {
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
    public void setSignatureAlgorithm(java.lang.String r2) {
        /*
            r1 = this;
            return
        L14:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509V1CertificateGenerator.setSignatureAlgorithm(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSubjectDN(X500Principal x500Principal) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSubjectDN(X509Name x509Name) {
    }
}
