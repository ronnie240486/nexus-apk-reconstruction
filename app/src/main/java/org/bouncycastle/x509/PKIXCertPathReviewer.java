package org.bouncycastle.x509;

import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import org.bouncycastle.asn1.x509.AuthorityInformationAccess;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.jce.provider.CertPathValidatorUtilities;

/* JADX INFO: loaded from: classes2.dex */
public class PKIXCertPathReviewer extends CertPathValidatorUtilities {
    private static final String RESOURCE_NAME = "org.bouncycastle.x509.CertPathReviewerMessages";
    protected CertPath certPath;
    protected List certs;
    protected List[] errors;
    private boolean initialized;

    /* JADX INFO: renamed from: n */
    protected int f16437n;
    protected List[] notifications;
    protected PKIXParameters pkixParams;
    protected PolicyNode policyTree;
    protected PublicKey subjectPublicKey;
    protected TrustAnchor trustAnchor;
    protected Date validDate;
    private static final String QC_STATEMENT = X509Extensions.QCStatements.getId();
    private static final String CRL_DIST_POINTS = X509Extensions.CRLDistributionPoints.getId();
    private static final String AUTH_INFO_ACCESS = X509Extensions.AuthorityInfoAccess.getId();

    /* JADX WARN: Invalid debug info offset */
    public PKIXCertPathReviewer() {
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIXCertPathReviewer(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
    }

    /* JADX WARN: Invalid debug info offset */
    private String IPtoString(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0010
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private void checkCriticalExtensions() {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.checkCriticalExtensions():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private void checkNameConstraints() {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.checkNameConstraints():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x002d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private void checkPathLength() {
        /*
            r9 = this;
            return
        L38:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.checkPathLength():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x006f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private void checkPolicy() {
        /*
            Method dump skipped, instruction units count: 1559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.checkPolicy():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x002c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private void checkSignatures() {
        /*
            Method dump skipped, instruction units count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.checkSignatures():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private java.security.cert.X509CRL getCRL(java.lang.String r8) throws org.bouncycastle.x509.CertPathReviewerException {
        /*
            r7 = this;
            r0 = 0
            return r0
        L22:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.getCRL(java.lang.String):java.security.cert.X509CRL");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private boolean processQcStatements(java.security.cert.X509Certificate r18, int r19) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.processQcStatements(java.security.cert.X509Certificate, int):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    public void addError(ErrorBundle errorBundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addError(ErrorBundle errorBundle, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addNotification(ErrorBundle errorBundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addNotification(ErrorBundle errorBundle, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0018
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void checkCRLs(java.security.cert.PKIXParameters r23, java.security.cert.X509Certificate r24, java.util.Date r25, java.security.cert.X509Certificate r26, java.security.PublicKey r27, java.util.Vector r28, int r29) throws org.bouncycastle.x509.CertPathReviewerException {
        /*
            Method dump skipped, instruction units count: 1193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.checkCRLs(java.security.cert.PKIXParameters, java.security.cert.X509Certificate, java.util.Date, java.security.cert.X509Certificate, java.security.PublicKey, java.util.Vector, int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public void checkRevocation(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, Vector vector2, int i) throws CertPathReviewerException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void doChecks() {
    }

    /* JADX WARN: Invalid debug info offset */
    public Vector getCRLDistUrls(CRLDistPoint cRLDistPoint) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertPath getCertPath() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getCertPathSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public List getErrors(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public List[] getErrors() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public List getNotifications(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public List[] getNotifications() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Vector getOCSPUrls(AuthorityInformationAccess authorityInformationAccess) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PolicyNode getPolicyTree() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PublicKey getSubjectPublicKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public TrustAnchor getTrustAnchor() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public java.util.Collection getTrustAnchors(java.security.cert.X509Certificate r7, java.util.Set r8) throws org.bouncycastle.x509.CertPathReviewerException {
        /*
            r6 = this;
            r0 = 0
            return r0
        L91:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.getTrustAnchors(java.security.cert.X509Certificate, java.util.Set):java.util.Collection");
    }

    /* JADX WARN: Invalid debug info offset */
    public void init(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isValidCertPath() {
        return false;
    }
}
