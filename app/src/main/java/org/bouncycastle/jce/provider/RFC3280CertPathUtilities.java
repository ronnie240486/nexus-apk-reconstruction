package org.bouncycastle.jce.provider;

import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.x509.ExtendedPKIXParameters;

/* JADX INFO: loaded from: classes2.dex */
public class RFC3280CertPathUtilities {
    protected static final String ANY_POLICY = "2.5.29.32.0";
    protected static final int CRL_SIGN = 6;
    protected static final int KEY_CERT_SIGN = 5;
    private static final PKIXCRLUtil CRL_UTIL = new PKIXCRLUtil();
    protected static final String CERTIFICATE_POLICIES = X509Extensions.CertificatePolicies.getId();
    protected static final String POLICY_MAPPINGS = X509Extensions.PolicyMappings.getId();
    protected static final String INHIBIT_ANY_POLICY = X509Extensions.InhibitAnyPolicy.getId();
    protected static final String ISSUING_DISTRIBUTION_POINT = X509Extensions.IssuingDistributionPoint.getId();
    protected static final String FRESHEST_CRL = X509Extensions.FreshestCRL.getId();
    protected static final String DELTA_CRL_INDICATOR = X509Extensions.DeltaCRLIndicator.getId();
    protected static final String POLICY_CONSTRAINTS = X509Extensions.PolicyConstraints.getId();
    protected static final String BASIC_CONSTRAINTS = X509Extensions.BasicConstraints.getId();
    protected static final String CRL_DISTRIBUTION_POINTS = X509Extensions.CRLDistributionPoints.getId();
    protected static final String SUBJECT_ALTERNATIVE_NAME = X509Extensions.SubjectAlternativeName.getId();
    protected static final String NAME_CONSTRAINTS = X509Extensions.NameConstraints.getId();
    protected static final String AUTHORITY_KEY_IDENTIFIER = X509Extensions.AuthorityKeyIdentifier.getId();
    protected static final String KEY_USAGE = X509Extensions.KeyUsage.getId();
    protected static final String CRL_NUMBER = X509Extensions.CRLNumber.getId();
    protected static final String[] crlReasons = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0041
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private static void checkCRL(org.bouncycastle.asn1.x509.DistributionPoint r21, org.bouncycastle.x509.ExtendedPKIXParameters r22, java.security.cert.X509Certificate r23, java.util.Date r24, java.security.cert.X509Certificate r25, java.security.PublicKey r26, org.bouncycastle.jce.provider.CertStatus r27, org.bouncycastle.jce.provider.ReasonsMask r28, java.util.List r29) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.checkCRL(org.bouncycastle.asn1.x509.DistributionPoint, org.bouncycastle.x509.ExtendedPKIXParameters, java.security.cert.X509Certificate, java.util.Date, java.security.cert.X509Certificate, java.security.PublicKey, org.bouncycastle.jce.provider.CertStatus, org.bouncycastle.jce.provider.ReasonsMask, java.util.List):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void checkCRLs(org.bouncycastle.x509.ExtendedPKIXParameters r19, java.security.cert.X509Certificate r20, java.util.Date r21, java.security.cert.X509Certificate r22, java.security.PublicKey r23, java.util.List r24) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.checkCRLs(org.bouncycastle.x509.ExtendedPKIXParameters, java.security.cert.X509Certificate, java.util.Date, java.security.cert.X509Certificate, java.security.PublicKey, java.util.List):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0015
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static org.bouncycastle.jce.provider.PKIXPolicyNode prepareCertB(java.security.cert.CertPath r18, int r19, java.util.List[] r20, org.bouncycastle.jce.provider.PKIXPolicyNode r21, int r22) throws java.security.cert.CertPathValidatorException {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareCertB(java.security.cert.CertPath, int, java.util.List[], org.bouncycastle.jce.provider.PKIXPolicyNode, int):org.bouncycastle.jce.provider.PKIXPolicyNode");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void prepareNextCertA(java.security.cert.CertPath r7, int r8) throws java.security.cert.CertPathValidatorException {
        /*
            return
        L61:
        L6b:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertA(java.security.cert.CertPath, int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void prepareNextCertG(java.security.cert.CertPath r2, int r3, org.bouncycastle.jce.provider.PKIXNameConstraintValidator r4) throws java.security.cert.CertPathValidatorException {
        /*
            return
        L1c:
        L2b:
        L50:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertG(java.security.cert.CertPath, int, org.bouncycastle.jce.provider.PKIXNameConstraintValidator):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static int prepareNextCertH1(CertPath certPath, int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static int prepareNextCertH2(CertPath certPath, int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static int prepareNextCertH3(CertPath certPath, int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static int prepareNextCertI1(java.security.cert.CertPath r3, int r4, int r5) throws java.security.cert.CertPathValidatorException {
        /*
            r0 = 0
            return r0
        L3e:
        L48:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertI1(java.security.cert.CertPath, int, int):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static int prepareNextCertI2(java.security.cert.CertPath r4, int r5, int r6) throws java.security.cert.CertPathValidatorException {
        /*
            r0 = 0
            return r0
        L3f:
        L49:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertI2(java.security.cert.CertPath, int, int):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static int prepareNextCertJ(java.security.cert.CertPath r2, int r3, int r4) throws java.security.cert.CertPathValidatorException {
        /*
            r0 = 0
            return r0
        L22:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertJ(java.security.cert.CertPath, int, int):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void prepareNextCertK(java.security.cert.CertPath r3, int r4) throws java.security.cert.CertPathValidatorException {
        /*
            return
        L2d:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertK(java.security.cert.CertPath, int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static int prepareNextCertL(CertPath certPath, int i, int i2) throws CertPathValidatorException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static int prepareNextCertM(java.security.cert.CertPath r2, int r3, int r4) throws java.security.cert.CertPathValidatorException {
        /*
            r0 = 0
            return r0
        L24:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertM(java.security.cert.CertPath, int, int):int");
    }

    /* JADX WARN: Invalid debug info offset */
    public static void prepareNextCertN(CertPath certPath, int i) throws CertPathValidatorException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0014
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void prepareNextCertO(java.security.cert.CertPath r2, int r3, java.util.Set r4, java.util.List r5) throws java.security.cert.CertPathValidatorException {
        /*
            return
        L1e:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertO(java.security.cert.CertPath, int, java.util.Set, java.util.List):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.util.Set processCRLA1i(java.util.Date r2, org.bouncycastle.x509.ExtendedPKIXParameters r3, java.security.cert.X509Certificate r4, java.security.cert.X509CRL r5) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            r0 = 0
            return r0
        L20:
        L36:
        L3f:
        L48:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.processCRLA1i(java.util.Date, org.bouncycastle.x509.ExtendedPKIXParameters, java.security.cert.X509Certificate, java.security.cert.X509CRL):java.util.Set");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.util.Set[] processCRLA1ii(java.util.Date r3, org.bouncycastle.x509.ExtendedPKIXParameters r4, java.security.cert.X509Certificate r5, java.security.cert.X509CRL r6) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            r0 = 0
            return r0
        L30:
        L42:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.processCRLA1ii(java.util.Date, org.bouncycastle.x509.ExtendedPKIXParameters, java.security.cert.X509Certificate, java.security.cert.X509CRL):java.util.Set[]");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x003a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void processCRLB1(org.bouncycastle.asn1.x509.DistributionPoint r5, java.lang.Object r6, java.security.cert.X509CRL r7) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            return
        L50:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.processCRLB1(org.bouncycastle.asn1.x509.DistributionPoint, java.lang.Object, java.security.cert.X509CRL):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x004a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void processCRLB2(org.bouncycastle.asn1.x509.DistributionPoint r9, java.lang.Object r10, java.security.cert.X509CRL r11) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.processCRLB2(org.bouncycastle.asn1.x509.DistributionPoint, java.lang.Object, java.security.cert.X509CRL):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void processCRLC(java.security.cert.X509CRL r3, java.security.cert.X509CRL r4, org.bouncycastle.x509.ExtendedPKIXParameters r5) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            return
        L61:
        L6a:
        L7b:
        L8d:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.processCRLC(java.security.cert.X509CRL, java.security.cert.X509CRL, org.bouncycastle.x509.ExtendedPKIXParameters):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static ReasonsMask processCRLD(X509CRL x509crl, DistributionPoint distributionPoint) throws AnnotatedException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.util.Set processCRLF(java.security.cert.X509CRL r6, java.lang.Object r7, java.security.cert.X509Certificate r8, java.security.PublicKey r9, org.bouncycastle.x509.ExtendedPKIXParameters r10, java.util.List r11) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.processCRLF(java.security.cert.X509CRL, java.lang.Object, java.security.cert.X509Certificate, java.security.PublicKey, org.bouncycastle.x509.ExtendedPKIXParameters, java.util.List):java.util.Set");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0011
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.security.PublicKey processCRLG(java.security.cert.X509CRL r2, java.util.Set r3) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            r0 = 0
            return r0
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.processCRLG(java.security.cert.X509CRL, java.util.Set):java.security.PublicKey");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0012
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.security.cert.X509CRL processCRLH(java.util.Set r3, java.security.PublicKey r4) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            r0 = 0
            return r0
        L16:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.processCRLH(java.util.Set, java.security.PublicKey):java.security.cert.X509CRL");
    }

    /* JADX WARN: Invalid debug info offset */
    public static void processCRLI(Date date, X509CRL x509crl, Object obj, CertStatus certStatus, ExtendedPKIXParameters extendedPKIXParameters) throws AnnotatedException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void processCRLJ(Date date, X509CRL x509crl, Object obj, CertStatus certStatus) throws AnnotatedException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void processCertA(java.security.cert.CertPath r8, org.bouncycastle.x509.ExtendedPKIXParameters r9, int r10, java.security.PublicKey r11, boolean r12, javax.security.auth.x500.X500Principal r13, java.security.cert.X509Certificate r14) throws org.bouncycastle.jce.exception.ExtCertPathValidatorException {
        /*
            return
        L17:
        L39:
        L81:
        L83:
        L85:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.processCertA(java.security.cert.CertPath, org.bouncycastle.x509.ExtendedPKIXParameters, int, java.security.PublicKey, boolean, javax.security.auth.x500.X500Principal, java.security.cert.X509Certificate):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0025
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void processCertBC(java.security.cert.CertPath r5, int r6, org.bouncycastle.jce.provider.PKIXNameConstraintValidator r7) throws java.security.cert.CertPathValidatorException {
        /*
            return
        L65:
        L85:
        L8e:
        L98:
        La1:
        Laa:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.processCertBC(java.security.cert.CertPath, int, org.bouncycastle.jce.provider.PKIXNameConstraintValidator):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0018
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static org.bouncycastle.jce.provider.PKIXPolicyNode processCertD(java.security.cert.CertPath r18, int r19, java.util.Set r20, org.bouncycastle.jce.provider.PKIXPolicyNode r21, java.util.List[] r22, int r23) throws java.security.cert.CertPathValidatorException {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.processCertD(java.security.cert.CertPath, int, java.util.Set, org.bouncycastle.jce.provider.PKIXPolicyNode, java.util.List[], int):org.bouncycastle.jce.provider.PKIXPolicyNode");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static org.bouncycastle.jce.provider.PKIXPolicyNode processCertE(java.security.cert.CertPath r2, int r3, org.bouncycastle.jce.provider.PKIXPolicyNode r4) throws java.security.cert.CertPathValidatorException {
        /*
            r0 = 0
            return r0
        L18:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.processCertE(java.security.cert.CertPath, int, org.bouncycastle.jce.provider.PKIXPolicyNode):org.bouncycastle.jce.provider.PKIXPolicyNode");
    }

    /* JADX WARN: Invalid debug info offset */
    public static void processCertF(CertPath certPath, int i, PKIXPolicyNode pKIXPolicyNode, int i2) throws CertPathValidatorException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static int wrapupCertA(int i, X509Certificate x509Certificate) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static int wrapupCertB(java.security.cert.CertPath r3, int r4, int r5) throws java.security.cert.CertPathValidatorException {
        /*
            r0 = 0
            return r0
        L3d:
        L47:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.wrapupCertB(java.security.cert.CertPath, int, int):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0014
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void wrapupCertF(java.security.cert.CertPath r2, int r3, java.util.List r4, java.util.Set r5) throws java.security.cert.CertPathValidatorException {
        /*
            return
        L1e:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.wrapupCertF(java.security.cert.CertPath, int, java.util.List, java.util.Set):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static PKIXPolicyNode wrapupCertG(CertPath certPath, ExtendedPKIXParameters extendedPKIXParameters, Set set, int i, List[] listArr, PKIXPolicyNode pKIXPolicyNode, Set set2) throws CertPathValidatorException {
        return null;
    }
}
