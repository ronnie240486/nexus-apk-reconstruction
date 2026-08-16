package org.bouncycastle.jce.provider;

import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.x509.TBSCertList;

/* JADX INFO: loaded from: classes2.dex */
public class X509CRLEntryObject extends X509CRLEntry {

    /* JADX INFO: renamed from: c */
    private TBSCertList.CRLEntry f16384c;
    private X500Principal certificateIssuer;
    private int hashValue;
    private boolean isHashValueSet;
    private boolean isIndirect;
    private X500Principal previousCertificateIssuer;

    /* JADX WARN: Invalid debug info offset */
    public X509CRLEntryObject(TBSCertList.CRLEntry cRLEntry) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509CRLEntryObject(TBSCertList.CRLEntry cRLEntry, boolean z, X500Principal x500Principal) {
    }

    /* JADX WARN: Invalid debug info offset */
    private Set getExtensionOIDs(boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0015
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private javax.security.auth.x500.X500Principal loadCertificateIssuer() {
        /*
            r5 = this;
            r0 = 0
            return r0
        L45:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.X509CRLEntryObject.loadCertificateIssuer():javax.security.auth.x500.X500Principal");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CRLEntry
    public X500Principal getCertificateIssuer() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CRLEntry
    public byte[] getEncoded() throws CRLException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0013
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
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.X509CRLEntryObject.getExtensionValue(java.lang.String):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CRLEntry
    public Date getRevocationDate() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CRLEntry
    public BigInteger getSerialNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CRLEntry
    public boolean hasExtensions() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CRLEntry
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0083
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.cert.X509CRLEntry
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.X509CRLEntryObject.toString():java.lang.String");
    }
}
