package org.bouncycastle.x509;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import java.util.Set;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.util.Selector;

/* JADX INFO: loaded from: classes2.dex */
public class X509AttributeCertStoreSelector implements Selector {
    private X509AttributeCertificate attributeCert;
    private Date attributeCertificateValid;
    private AttributeCertificateHolder holder;
    private AttributeCertificateIssuer issuer;
    private BigInteger serialNumber;
    private Collection targetGroups;
    private Collection targetNames;

    /* JADX WARN: Invalid debug info offset */
    private Set extractGeneralNames(Collection collection) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void addTargetGroup(GeneralName generalName) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addTargetGroup(byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addTargetName(GeneralName generalName) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addTargetName(byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.util.Selector
    public Object clone() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509AttributeCertificate getAttributeCert() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Date getAttributeCertificateValid() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AttributeCertificateHolder getHolder() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AttributeCertificateIssuer getIssuer() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getSerialNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Collection getTargetGroups() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Collection getTargetNames() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x004a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.util.Selector
    public boolean match(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509AttributeCertStoreSelector.match(java.lang.Object):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    public void setAttributeCert(X509AttributeCertificate x509AttributeCertificate) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setAttributeCertificateValid(Date date) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setHolder(AttributeCertificateHolder attributeCertificateHolder) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setIssuer(AttributeCertificateIssuer attributeCertificateIssuer) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSerialNumber(BigInteger bigInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTargetGroups(Collection collection) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTargetNames(Collection collection) throws IOException {
    }
}
