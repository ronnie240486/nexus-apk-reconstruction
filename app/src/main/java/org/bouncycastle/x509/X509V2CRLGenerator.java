package org.bouncycastle.x509;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.X509CRL;
import java.util.Date;
import java.util.Iterator;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.asn1.x509.V2TBSCertListGenerator;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.asn1.x509.X509ExtensionsGenerator;
import org.bouncycastle.asn1.x509.X509Name;

/* JADX INFO: loaded from: classes2.dex */
public class X509V2CRLGenerator {
    private X509ExtensionsGenerator extGenerator;
    private AlgorithmIdentifier sigAlgId;
    private DERObjectIdentifier sigOID;
    private String signatureAlgorithm;
    private V2TBSCertListGenerator tbsGen;

    public static class ExtCRLException extends CRLException {
        Throwable cause;

        /* JADX WARN: Invalid debug info offset */
        public ExtCRLException(String str, Throwable th) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Throwable
        public Throwable getCause() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    private TBSCertList generateCertList() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private X509CRL generateJcaObject(TBSCertList tBSCertList, byte[] bArr) throws CRLException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x001f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void addCRL(java.security.cert.X509CRL r4) throws java.security.cert.CRLException {
        /*
            r3 = this;
            return
        L2d:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509V2CRLGenerator.addCRL(java.security.cert.X509CRL):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public void addCRLEntry(BigInteger bigInteger, Date date, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addCRLEntry(BigInteger bigInteger, Date date, int i, Date date2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addCRLEntry(BigInteger bigInteger, Date date, X509Extensions x509Extensions) {
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
    public X509CRL generate(PrivateKey privateKey) throws IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509CRL generate(PrivateKey privateKey, String str) throws IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException, NoSuchProviderException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public java.security.cert.X509CRL generate(java.security.PrivateKey r8, java.lang.String r9, java.security.SecureRandom r10) throws java.security.cert.CRLException, java.lang.IllegalStateException, java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        /*
            r7 = this;
            r0 = 0
            return r0
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509V2CRLGenerator.generate(java.security.PrivateKey, java.lang.String, java.security.SecureRandom):java.security.cert.X509CRL");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public java.security.cert.X509CRL generate(java.security.PrivateKey r4, java.security.SecureRandom r5) throws java.security.cert.CRLException, java.lang.IllegalStateException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        /*
            r3 = this;
            r0 = 0
            return r0
        L11:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509V2CRLGenerator.generate(java.security.PrivateKey, java.security.SecureRandom):java.security.cert.X509CRL");
    }

    /* JADX WARN: Invalid debug info offset */
    public X509CRL generateX509CRL(PrivateKey privateKey) throws SignatureException, SecurityException, InvalidKeyException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509CRL generateX509CRL(PrivateKey privateKey, String str) throws SignatureException, SecurityException, InvalidKeyException, NoSuchProviderException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x001a
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public java.security.cert.X509CRL generateX509CRL(java.security.PrivateKey r2, java.lang.String r3, java.security.SecureRandom r4) throws java.security.NoSuchProviderException, java.lang.SecurityException, java.security.SignatureException, java.security.InvalidKeyException {
        /*
            r1 = this;
            r0 = 0
            return r0
        L5:
        L1a:
        L1c:
        L1e:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509V2CRLGenerator.generateX509CRL(java.security.PrivateKey, java.lang.String, java.security.SecureRandom):java.security.cert.X509CRL");
    }

    /* JADX WARN: Invalid debug info offset */
    public X509CRL generateX509CRL(PrivateKey privateKey, SecureRandom secureRandom) throws SignatureException, SecurityException, InvalidKeyException {
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
    public void setNextUpdate(Date date) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509V2CRLGenerator.setSignatureAlgorithm(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public void setThisUpdate(Date date) {
    }
}
