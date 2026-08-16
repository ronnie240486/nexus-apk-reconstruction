package org.bouncycastle.jce.provider;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.x509.ExtendedPKIXParameters;

/* JADX INFO: loaded from: classes2.dex */
public class CertPathValidatorUtilities {
    protected static final String ANY_POLICY = "2.5.29.32.0";
    protected static final int CRL_SIGN = 6;
    protected static final int KEY_CERT_SIGN = 5;
    protected static final PKIXCRLUtil CRL_UTIL = new PKIXCRLUtil();
    protected static final String CERTIFICATE_POLICIES = X509Extensions.CertificatePolicies.getId();
    protected static final String BASIC_CONSTRAINTS = X509Extensions.BasicConstraints.getId();
    protected static final String POLICY_MAPPINGS = X509Extensions.PolicyMappings.getId();
    protected static final String SUBJECT_ALTERNATIVE_NAME = X509Extensions.SubjectAlternativeName.getId();
    protected static final String NAME_CONSTRAINTS = X509Extensions.NameConstraints.getId();
    protected static final String KEY_USAGE = X509Extensions.KeyUsage.getId();
    protected static final String INHIBIT_ANY_POLICY = X509Extensions.InhibitAnyPolicy.getId();
    protected static final String ISSUING_DISTRIBUTION_POINT = X509Extensions.IssuingDistributionPoint.getId();
    protected static final String DELTA_CRL_INDICATOR = X509Extensions.DeltaCRLIndicator.getId();
    protected static final String POLICY_CONSTRAINTS = X509Extensions.PolicyConstraints.getId();
    protected static final String FRESHEST_CRL = X509Extensions.FreshestCRL.getId();
    protected static final String CRL_DISTRIBUTION_POINTS = X509Extensions.CRLDistributionPoints.getId();
    protected static final String AUTHORITY_KEY_IDENTIFIER = X509Extensions.AuthorityKeyIdentifier.getId();
    protected static final String CRL_NUMBER = X509Extensions.CRLNumber.getId();
    protected static final String[] crlReasons = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void addAdditionalStoreFromLocation(java.lang.String r4, org.bouncycastle.x509.ExtendedPKIXParameters r5) {
        /*
            return
        L75:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.CertPathValidatorUtilities.addAdditionalStoreFromLocation(java.lang.String, org.bouncycastle.x509.ExtendedPKIXParameters):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static void addAdditionalStoresFromAltNames(X509Certificate x509Certificate, ExtendedPKIXParameters extendedPKIXParameters) throws CertificateParsingException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void addAdditionalStoresFromCRLDistributionPoint(org.bouncycastle.asn1.x509.CRLDistPoint r6, org.bouncycastle.x509.ExtendedPKIXParameters r7) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            return
        L49:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.CertPathValidatorUtilities.addAdditionalStoresFromCRLDistributionPoint(org.bouncycastle.asn1.x509.CRLDistPoint, org.bouncycastle.x509.ExtendedPKIXParameters):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0019
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.util.Collection findCertificates(org.bouncycastle.x509.X509AttributeCertStoreSelector r3, java.util.List r4) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            r0 = 0
            return r0
        L21:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.CertPathValidatorUtilities.findCertificates(org.bouncycastle.x509.X509AttributeCertStoreSelector, java.util.List):java.util.Collection");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0019
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.util.Collection findCertificates(org.bouncycastle.x509.X509CertStoreSelector r3, java.util.List r4) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            r0 = 0
            return r0
        L21:
        L34:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.CertPathValidatorUtilities.findCertificates(org.bouncycastle.x509.X509CertStoreSelector, java.util.List):java.util.Collection");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.util.Collection findIssuerCerts(java.security.cert.X509Certificate r3, org.bouncycastle.x509.ExtendedPKIXBuilderParameters r4) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            r0 = 0
            return r0
        L50:
        L59:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.CertPathValidatorUtilities.findIssuerCerts(java.security.cert.X509Certificate, org.bouncycastle.x509.ExtendedPKIXBuilderParameters):java.util.Collection");
    }

    /* JADX WARN: Invalid debug info offset */
    public static TrustAnchor findTrustAnchor(X509Certificate x509Certificate, Set set) throws AnnotatedException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.security.cert.TrustAnchor findTrustAnchor(java.security.cert.X509Certificate r8, java.util.Set r9, java.lang.String r10) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            r0 = 0
            return r0
        L61:
        L69:
        L7a:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.CertPathValidatorUtilities.findTrustAnchor(java.security.cert.X509Certificate, java.util.Set, java.lang.String):java.security.cert.TrustAnchor");
    }

    /* JADX WARN: Invalid debug info offset */
    public static AlgorithmIdentifier getAlgorithmIdentifier(PublicKey publicKey) throws CertPathValidatorException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0020
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void getCRLIssuersFromDistributionPoint(org.bouncycastle.asn1.x509.DistributionPoint r2, java.util.Collection r3, java.security.cert.X509CRLSelector r4, org.bouncycastle.x509.ExtendedPKIXParameters r5) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            return
        L37:
        L75:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.CertPathValidatorUtilities.getCRLIssuersFromDistributionPoint(org.bouncycastle.asn1.x509.DistributionPoint, java.util.Collection, java.security.cert.X509CRLSelector, org.bouncycastle.x509.ExtendedPKIXParameters):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0042
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void getCertStatus(java.util.Date r5, java.security.cert.X509CRL r6, java.lang.Object r7, org.bouncycastle.jce.provider.CertStatus r8) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            return
        L51:
        Lb0:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.CertPathValidatorUtilities.getCertStatus(java.util.Date, java.security.cert.X509CRL, java.lang.Object, org.bouncycastle.jce.provider.CertStatus):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.util.Set getCompleteCRLs(org.bouncycastle.asn1.x509.DistributionPoint r4, java.lang.Object r5, java.util.Date r6, org.bouncycastle.x509.ExtendedPKIXParameters r7) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            r0 = 0
            return r0
        L20:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.CertPathValidatorUtilities.getCompleteCRLs(org.bouncycastle.asn1.x509.DistributionPoint, java.lang.Object, java.util.Date, org.bouncycastle.x509.ExtendedPKIXParameters):java.util.Set");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.util.Set getDeltaCRLs(java.util.Date r4, org.bouncycastle.x509.ExtendedPKIXParameters r5, java.security.cert.X509CRL r6) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            r0 = 0
            return r0
        L11:
        L2b:
        L74:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.CertPathValidatorUtilities.getDeltaCRLs(java.util.Date, org.bouncycastle.x509.ExtendedPKIXParameters, java.security.cert.X509CRL):java.util.Set");
    }

    /* JADX WARN: Invalid debug info offset */
    public static X500Principal getEncodedIssuerPrincipal(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static DERObject getExtensionValue(X509Extension x509Extension, String str) throws AnnotatedException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static X500Principal getIssuerPrincipal(X509CRL x509crl) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0052
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.security.PublicKey getNextWorkingKey(java.util.List r4, int r5) throws java.security.cert.CertPathValidatorException {
        /*
            r0 = 0
            return r0
        L5f:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.CertPathValidatorUtilities.getNextWorkingKey(java.util.List, int):java.security.PublicKey");
    }

    /* JADX WARN: Invalid debug info offset */
    private static DERObject getObject(String str, byte[] bArr) throws AnnotatedException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static final java.util.Set getQualifierSet(org.bouncycastle.asn1.ASN1Sequence r5) throws java.security.cert.CertPathValidatorException {
        /*
            r0 = 0
            return r0
        L33:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.CertPathValidatorUtilities.getQualifierSet(org.bouncycastle.asn1.ASN1Sequence):java.util.Set");
    }

    /* JADX WARN: Invalid debug info offset */
    private static BigInteger getSerialNumber(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static X500Principal getSubjectPrincipal(X509Certificate x509Certificate) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0013
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.util.Date getValidCertDateFromValidityModel(org.bouncycastle.x509.ExtendedPKIXParameters r3, java.security.cert.CertPath r4, int r5) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            r0 = 0
            return r0
        L3a:
        L52:
        L58:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.CertPathValidatorUtilities.getValidCertDateFromValidityModel(org.bouncycastle.x509.ExtendedPKIXParameters, java.security.cert.CertPath, int):java.util.Date");
    }

    /* JADX WARN: Invalid debug info offset */
    public static Date getValidDate(PKIXParameters pKIXParameters) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isAnyPolicy(Set set) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private static boolean isDeltaCRL(X509CRL x509crl) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isSelfIssued(X509Certificate x509Certificate) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0044
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void prepareNextCertB1(int r11, java.util.List[] r12, java.lang.String r13, java.util.Map r14, java.security.cert.X509Certificate r15) throws org.bouncycastle.jce.provider.AnnotatedException, java.security.cert.CertPathValidatorException {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.CertPathValidatorUtilities.prepareNextCertB1(int, java.util.List[], java.lang.String, java.util.Map, java.security.cert.X509Certificate):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static PKIXPolicyNode prepareNextCertB2(int i, List[] listArr, String str, PKIXPolicyNode pKIXPolicyNode) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean processCertD1i(int i, List[] listArr, DERObjectIdentifier dERObjectIdentifier, Set set) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void processCertD1ii(int i, List[] listArr, DERObjectIdentifier dERObjectIdentifier, Set set) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static PKIXPolicyNode removePolicyNode(PKIXPolicyNode pKIXPolicyNode, List[] listArr, PKIXPolicyNode pKIXPolicyNode2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static void removePolicyNodeRecurse(List[] listArr, PKIXPolicyNode pKIXPolicyNode) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void verifyX509Certificate(X509Certificate x509Certificate, PublicKey publicKey, String str) throws GeneralSecurityException {
    }
}
