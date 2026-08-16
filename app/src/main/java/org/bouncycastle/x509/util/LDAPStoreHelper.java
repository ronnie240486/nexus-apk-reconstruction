package org.bouncycastle.x509.util;

import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jce.X509LDAPCertStoreParameters;
import org.bouncycastle.util.StoreException;
import org.bouncycastle.x509.X509AttributeCertStoreSelector;
import org.bouncycastle.x509.X509CRLStoreSelector;
import org.bouncycastle.x509.X509CertPairStoreSelector;
import org.bouncycastle.x509.X509CertStoreSelector;

/* JADX INFO: loaded from: classes2.dex */
public class LDAPStoreHelper {
    private static String LDAP_PROVIDER = "com.sun.jndi.ldap.LdapCtxFactory";
    private static String REFERRALS_IGNORE = "ignore";
    private static final String SEARCH_SECURITY_LEVEL = "none";
    private static final String URL_CONTEXT_PREFIX = "com.sun.jndi.url";
    private static int cacheSize = 32;
    private static long lifeTime = 60000;
    private Map cacheMap;
    private X509LDAPCertStoreParameters params;

    /* JADX WARN: Invalid debug info offset */
    public LDAPStoreHelper(X509LDAPCertStoreParameters x509LDAPCertStoreParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private synchronized void addToCache(java.lang.String r9, java.util.List r10) {
        /*
            r8 = this;
            return
        L23:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.util.LDAPStoreHelper.addToCache(java.lang.String, java.util.List):void");
    }

    /* JADX WARN: Invalid debug info offset */
    private List attrCertSubjectSerialSearch(X509AttributeCertStoreSelector x509AttributeCertStoreSelector, String[] strArr, String[] strArr2, String[] strArr3) throws StoreException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private List cRLIssuerSearch(X509CRLStoreSelector x509CRLStoreSelector, String[] strArr, String[] strArr2, String[] strArr3) throws StoreException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private List certSubjectSerialSearch(X509CertStoreSelector x509CertStoreSelector, String[] strArr, String[] strArr2, String[] strArr3) throws StoreException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private DirContext connectLDAP() throws NamingException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0014
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private java.util.Set createAttributeCertificates(java.util.List r5, org.bouncycastle.x509.X509AttributeCertStoreSelector r6) throws org.bouncycastle.util.StoreException {
        /*
            r4 = this;
            r0 = 0
            return r0
        L32:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.util.LDAPStoreHelper.createAttributeCertificates(java.util.List, org.bouncycastle.x509.X509AttributeCertStoreSelector):java.util.Set");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0014
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private java.util.Set createCRLs(java.util.List r5, org.bouncycastle.x509.X509CRLStoreSelector r6) throws org.bouncycastle.util.StoreException {
        /*
            r4 = this;
            r0 = 0
            return r0
        L32:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.util.LDAPStoreHelper.createCRLs(java.util.List, org.bouncycastle.x509.X509CRLStoreSelector):java.util.Set");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0014
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private java.util.Set createCerts(java.util.List r5, org.bouncycastle.x509.X509CertStoreSelector r6) throws org.bouncycastle.util.StoreException {
        /*
            r4 = this;
            r0 = 0
            return r0
        L32:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.util.LDAPStoreHelper.createCerts(java.util.List, org.bouncycastle.x509.X509CertStoreSelector):java.util.Set");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private java.util.Set createCrossCertificatePairs(java.util.List r9, org.bouncycastle.x509.X509CertPairStoreSelector r10) throws org.bouncycastle.util.StoreException {
        /*
            r8 = this;
            r0 = 0
            return r0
        L26:
        L63:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.util.LDAPStoreHelper.createCrossCertificatePairs(java.util.List, org.bouncycastle.x509.X509CertPairStoreSelector):java.util.Set");
    }

    /* JADX WARN: Invalid debug info offset */
    private List crossCertificatePairSubjectSearch(X509CertPairStoreSelector x509CertPairStoreSelector, String[] strArr, String[] strArr2, String[] strArr3) throws StoreException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private X500Principal getCertificateIssuer(X509Certificate x509Certificate) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private List getFromCache(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private String getSubjectAsString(X509CertStoreSelector x509CertStoreSelector) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private String parseDN(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x007a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private java.util.List search(java.lang.String[] r10, java.lang.String r11, java.lang.String[] r12) throws org.bouncycastle.util.StoreException {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.util.LDAPStoreHelper.search(java.lang.String[], java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Invalid debug info offset */
    private String[] splitString(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Collection getAACertificates(X509AttributeCertStoreSelector x509AttributeCertStoreSelector) throws StoreException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Collection getAttributeAuthorityRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Collection getAttributeCertificateAttributes(X509AttributeCertStoreSelector x509AttributeCertStoreSelector) throws StoreException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Collection getAttributeCertificateRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Collection getAttributeDescriptorCertificates(X509AttributeCertStoreSelector x509AttributeCertStoreSelector) throws StoreException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Collection getAuthorityRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Collection getCACertificates(X509CertStoreSelector x509CertStoreSelector) throws StoreException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Collection getCertificateRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Collection getCrossCertificatePairs(X509CertPairStoreSelector x509CertPairStoreSelector) throws StoreException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Collection getDeltaCertificateRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Collection getUserCertificates(X509CertStoreSelector x509CertStoreSelector) throws StoreException {
        return null;
    }
}
