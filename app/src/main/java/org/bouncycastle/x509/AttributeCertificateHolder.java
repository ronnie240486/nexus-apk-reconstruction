package org.bouncycastle.x509;

import java.math.BigInteger;
import java.security.Principal;
import java.security.cert.CertSelector;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.Holder;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.util.Selector;

/* JADX INFO: loaded from: classes2.dex */
public class AttributeCertificateHolder implements CertSelector, Selector {
    final Holder holder;

    /* JADX WARN: Invalid debug info offset */
    public AttributeCertificateHolder(int i, String str, String str2, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public AttributeCertificateHolder(java.security.cert.X509Certificate r5) throws java.security.cert.CertificateParsingException {
        /*
            r4 = this;
            return
        L21:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.AttributeCertificateHolder.<init>(java.security.cert.X509Certificate):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public AttributeCertificateHolder(X500Principal x500Principal) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AttributeCertificateHolder(X500Principal x500Principal, BigInteger bigInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AttributeCertificateHolder(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AttributeCertificateHolder(X509Principal x509Principal) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AttributeCertificateHolder(X509Principal x509Principal, BigInteger bigInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    private GeneralNames generateGeneralNames(X509Principal x509Principal) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0013
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private java.lang.Object[] getNames(org.bouncycastle.asn1.x509.GeneralName[] r5) {
        /*
            r4 = this;
            r0 = 0
            return r0
        L28:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.AttributeCertificateHolder.getNames(org.bouncycastle.asn1.x509.GeneralName[]):java.lang.Object[]");
    }

    /* JADX WARN: Invalid debug info offset */
    private Principal[] getPrincipals(GeneralNames generalNames) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0012
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private boolean matchesDN(org.bouncycastle.jce.X509Principal r6, org.bouncycastle.asn1.x509.GeneralNames r7) {
        /*
            r5 = this;
            r0 = 0
            return r0
        L29:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.AttributeCertificateHolder.matchesDN(org.bouncycastle.jce.X509Principal, org.bouncycastle.asn1.x509.GeneralNames):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.CertSelector, org.bouncycastle.util.Selector
    public Object clone() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getDigestAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getDigestedObjectType() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public Principal[] getEntityNames() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Principal[] getIssuer() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getObjectDigest() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getOtherObjectTypeID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getSerialNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.util.Selector
    public boolean match(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.cert.CertSelector
    public boolean match(java.security.cert.Certificate r5) {
        /*
            r4 = this;
            r0 = 0
            return r0
        L92:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.AttributeCertificateHolder.match(java.security.cert.Certificate):boolean");
    }
}
