package org.bouncycastle.x509;

import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.X509CRLSelector;
import org.bouncycastle.util.Selector;

/* JADX INFO: loaded from: classes2.dex */
public class X509CRLStoreSelector extends X509CRLSelector implements Selector {
    private X509AttributeCertificate attrCertChecking;
    private boolean completeCRLEnabled;
    private boolean deltaCRLIndicator;
    private byte[] issuingDistributionPoint;
    private boolean issuingDistributionPointEnabled;
    private BigInteger maxBaseCRLNumber;

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0015
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static org.bouncycastle.x509.X509CRLStoreSelector getInstance(java.security.cert.X509CRLSelector r2) {
        /*
            r0 = 0
            return r0
        L32:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509CRLStoreSelector.getInstance(java.security.cert.X509CRLSelector):org.bouncycastle.x509.X509CRLStoreSelector");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector, org.bouncycastle.util.Selector
    public Object clone() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509AttributeCertificate getAttrCertificateChecking() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getIssuingDistributionPoint() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getMaxBaseCRLNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isCompleteCRLEnabled() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isDeltaCRLIndicatorEnabled() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isIssuingDistributionPointEnabled() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.util.Selector
    public boolean match(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            return r0
        L65:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509CRLStoreSelector.match(java.lang.Object):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector
    public boolean match(CRL crl) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setAttrCertificateChecking(X509AttributeCertificate x509AttributeCertificate) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCompleteCRLEnabled(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDeltaCRLIndicatorEnabled(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setIssuingDistributionPoint(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setIssuingDistributionPointEnabled(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setMaxBaseCRLNumber(BigInteger bigInteger) {
    }
}
