package org.bouncycastle.ocsp;

import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchProviderException;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.util.Set;
import org.bouncycastle.asn1.ocsp.OCSPRequest;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.X509Extensions;

/* JADX INFO: loaded from: classes2.dex */
public class OCSPReq implements X509Extension {
    private OCSPRequest req;

    /* JADX WARN: Invalid debug info offset */
    public OCSPReq(InputStream inputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private OCSPReq(org.bouncycastle.asn1.ASN1InputStream r4) throws java.io.IOException {
        /*
            r3 = this;
            return
        L10:
        L12:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.ocsp.OCSPReq.<init>(org.bouncycastle.asn1.ASN1InputStream):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public OCSPReq(OCSPRequest oCSPRequest) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OCSPReq(byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0011
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private java.util.List getCertList(java.lang.String r8) throws org.bouncycastle.ocsp.OCSPException, java.security.NoSuchProviderException {
        /*
            r7 = this;
            r0 = 0
            return r0
        L46:
        L48:
        L57:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.ocsp.OCSPReq.getCertList(java.lang.String):java.util.List");
    }

    /* JADX WARN: Invalid debug info offset */
    private Set getExtensionOIDs(boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public java.security.cert.CertStore getCertificates(java.lang.String r3, java.lang.String r4) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, org.bouncycastle.ocsp.OCSPException {
        /*
            r2 = this;
            r0 = 0
            return r0
        L16:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.ocsp.OCSPReq.getCertificates(java.lang.String, java.lang.String):java.security.cert.CertStore");
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Certificate[] getCerts(String str) throws OCSPException, NoSuchProviderException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getEncoded() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0011
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            return r0
        L1c:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.ocsp.OCSPReq.getExtensionValue(java.lang.String):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Extensions getRequestExtensions() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Req[] getRequestList() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralName getRequestorName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getSignature() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getSignatureAlgOID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getTBSRequest() throws OCSPException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getVersion() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isSigned() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public boolean verify(java.security.PublicKey r3, java.lang.String r4) throws org.bouncycastle.ocsp.OCSPException, java.security.NoSuchProviderException {
        /*
            r2 = this;
            r0 = 0
            return r0
        L34:
        L36:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.ocsp.OCSPReq.verify(java.security.PublicKey, java.lang.String):boolean");
    }
}
