package org.bouncycastle.jce.provider;

import java.security.cert.CertPathValidatorException;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.x509.ExtendedPKIXParameters;
import org.bouncycastle.x509.X509AttributeCertificate;

/* JADX INFO: loaded from: classes2.dex */
class RFC3281CertPathUtilities {
    private static final String TARGET_INFORMATION = X509Extensions.TargetInformation.getId();
    private static final String NO_REV_AVAIL = X509Extensions.NoRevAvail.getId();
    private static final String CRL_DISTRIBUTION_POINTS = X509Extensions.CRLDistributionPoints.getId();
    private static final String AUTHORITY_INFO_ACCESS = X509Extensions.AuthorityInfoAccess.getId();

    /* JADX WARN: Invalid debug info offset */
    public static void additionalChecks(X509AttributeCertificate x509AttributeCertificate, ExtendedPKIXParameters extendedPKIXParameters) throws CertPathValidatorException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x004e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private static void checkCRL(org.bouncycastle.asn1.x509.DistributionPoint r20, org.bouncycastle.x509.X509AttributeCertificate r21, org.bouncycastle.x509.ExtendedPKIXParameters r22, java.util.Date r23, java.security.cert.X509Certificate r24, org.bouncycastle.jce.provider.CertStatus r25, org.bouncycastle.jce.provider.ReasonsMask r26, java.util.List r27) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3281CertPathUtilities.checkCRL(org.bouncycastle.asn1.x509.DistributionPoint, org.bouncycastle.x509.X509AttributeCertificate, org.bouncycastle.x509.ExtendedPKIXParameters, java.util.Date, java.security.cert.X509Certificate, org.bouncycastle.jce.provider.CertStatus, org.bouncycastle.jce.provider.ReasonsMask, java.util.List):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0010
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void checkCRLs(org.bouncycastle.x509.X509AttributeCertificate r18, org.bouncycastle.x509.ExtendedPKIXParameters r19, java.security.cert.X509Certificate r20, java.util.Date r21, java.util.List r22) throws java.security.cert.CertPathValidatorException {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3281CertPathUtilities.checkCRLs(org.bouncycastle.x509.X509AttributeCertificate, org.bouncycastle.x509.ExtendedPKIXParameters, java.security.cert.X509Certificate, java.util.Date, java.util.List):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0032
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.security.cert.CertPath processAttrCert1(org.bouncycastle.x509.X509AttributeCertificate r10, org.bouncycastle.x509.ExtendedPKIXParameters r11) throws java.security.cert.CertPathValidatorException {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3281CertPathUtilities.processAttrCert1(org.bouncycastle.x509.X509AttributeCertificate, org.bouncycastle.x509.ExtendedPKIXParameters):java.security.cert.CertPath");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.security.cert.CertPathValidatorResult processAttrCert2(java.security.cert.CertPath r3, org.bouncycastle.x509.ExtendedPKIXParameters r4) throws java.security.cert.CertPathValidatorException {
        /*
            r0 = 0
            return r0
        Lf:
        L1a:
        L23:
        L25:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3281CertPathUtilities.processAttrCert2(java.security.cert.CertPath, org.bouncycastle.x509.ExtendedPKIXParameters):java.security.cert.CertPathValidatorResult");
    }

    /* JADX WARN: Invalid debug info offset */
    public static void processAttrCert3(X509Certificate x509Certificate, ExtendedPKIXParameters extendedPKIXParameters) throws CertPathValidatorException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void processAttrCert4(X509Certificate x509Certificate, ExtendedPKIXParameters extendedPKIXParameters) throws CertPathValidatorException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void processAttrCert5(org.bouncycastle.x509.X509AttributeCertificate r1, org.bouncycastle.x509.ExtendedPKIXParameters r2) throws java.security.cert.CertPathValidatorException {
        /*
            return
        La:
        Lc:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3281CertPathUtilities.processAttrCert5(org.bouncycastle.x509.X509AttributeCertificate, org.bouncycastle.x509.ExtendedPKIXParameters):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void processAttrCert7(org.bouncycastle.x509.X509AttributeCertificate r4, java.security.cert.CertPath r5, java.security.cert.CertPath r6, org.bouncycastle.x509.ExtendedPKIXParameters r7) throws java.security.cert.CertPathValidatorException {
        /*
            return
        L16:
        L18:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3281CertPathUtilities.processAttrCert7(org.bouncycastle.x509.X509AttributeCertificate, java.security.cert.CertPath, java.security.cert.CertPath, org.bouncycastle.x509.ExtendedPKIXParameters):void");
    }
}
