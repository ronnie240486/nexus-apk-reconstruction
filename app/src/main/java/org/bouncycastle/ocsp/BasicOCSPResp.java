package org.bouncycastle.ocsp;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertStore;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.util.Date;
import java.util.Set;
import org.bouncycastle.asn1.ocsp.BasicOCSPResponse;
import org.bouncycastle.asn1.ocsp.ResponseData;
import org.bouncycastle.asn1.x509.X509Extensions;

/* JADX INFO: loaded from: classes2.dex */
public class BasicOCSPResp implements X509Extension {
    X509Certificate[] chain;
    ResponseData data;
    BasicOCSPResponse resp;

    /* JADX WARN: Invalid debug info offset */
    public BasicOCSPResp(BasicOCSPResponse basicOCSPResponse) {
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
        L42:
        L44:
        L53:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.ocsp.BasicOCSPResp.getCertList(java.lang.String):java.util.List");
    }

    /* JADX WARN: Invalid debug info offset */
    private Set getExtensionOIDs(boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertStore getCertificates(String str, String str2) throws OCSPException, NoSuchAlgorithmException, NoSuchProviderException {
        return null;
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
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.ocsp.BasicOCSPResp.getExtensionValue(java.lang.String):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Date getProducedAt() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RespID getResponderId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RespData getResponseData() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Extensions getResponseExtensions() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public SingleResp[] getResponses() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getSignature() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getSignatureAlgName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getSignatureAlgOID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getTBSResponseData() throws OCSPException {
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
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0025
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public boolean verify(java.security.PublicKey r3, java.lang.String r4) throws org.bouncycastle.ocsp.OCSPException, java.security.NoSuchProviderException {
        /*
            r2 = this;
            r0 = 0
            return r0
        L23:
        L25:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.ocsp.BasicOCSPResp.verify(java.security.PublicKey, java.lang.String):boolean");
    }
}
