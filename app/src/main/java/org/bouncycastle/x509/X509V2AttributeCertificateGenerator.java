package org.bouncycastle.x509;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.util.Date;
import java.util.Iterator;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.V2AttributeCertificateInfoGenerator;
import org.bouncycastle.asn1.x509.X509ExtensionsGenerator;

/* JADX INFO: loaded from: classes2.dex */
public class X509V2AttributeCertificateGenerator {
    private V2AttributeCertificateInfoGenerator acInfoGen;
    private X509ExtensionsGenerator extGenerator;
    private AlgorithmIdentifier sigAlgId;
    private DERObjectIdentifier sigOID;
    private String signatureAlgorithm;

    /* JADX WARN: Invalid debug info offset */
    public void addAttribute(X509Attribute x509Attribute) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addExtension(String str, boolean z, ASN1Encodable aSN1Encodable) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addExtension(String str, boolean z, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509AttributeCertificate generate(PrivateKey privateKey, String str) throws IllegalStateException, SignatureException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, CertificateEncodingException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0026
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public org.bouncycastle.x509.X509AttributeCertificate generate(java.security.PrivateKey r9, java.lang.String r10, java.security.SecureRandom r11) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        /*
            r8 = this;
            r0 = 0
            return r0
        L49:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509V2AttributeCertificateGenerator.generate(java.security.PrivateKey, java.lang.String, java.security.SecureRandom):org.bouncycastle.x509.X509AttributeCertificate");
    }

    /* JADX WARN: Invalid debug info offset */
    public X509AttributeCertificate generateCertificate(PrivateKey privateKey, String str) throws SignatureException, SecurityException, InvalidKeyException, NoSuchProviderException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x001a
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public org.bouncycastle.x509.X509AttributeCertificate generateCertificate(java.security.PrivateKey r2, java.lang.String r3, java.security.SecureRandom r4) throws java.security.NoSuchProviderException, java.lang.SecurityException, java.security.SignatureException, java.security.InvalidKeyException {
        /*
            r1 = this;
            r0 = 0
            return r0
        L5:
        L1a:
        L1c:
        L1e:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509V2AttributeCertificateGenerator.generateCertificate(java.security.PrivateKey, java.lang.String, java.security.SecureRandom):org.bouncycastle.x509.X509AttributeCertificate");
    }

    /* JADX WARN: Invalid debug info offset */
    public Iterator getSignatureAlgNames() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void reset() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setHolder(AttributeCertificateHolder attributeCertificateHolder) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setIssuer(AttributeCertificateIssuer attributeCertificateIssuer) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setIssuerUniqueId(boolean[] zArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setNotAfter(Date date) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setNotBefore(Date date) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509V2AttributeCertificateGenerator.setSignatureAlgorithm(java.lang.String):void");
    }
}
