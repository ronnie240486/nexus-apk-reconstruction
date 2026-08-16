package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertStoreException;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertStoreSpi;
import java.security.cert.X509CertSelector;
import java.util.Set;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import org.bouncycastle.jce.X509LDAPCertStoreParameters;

/* JADX INFO: loaded from: classes2.dex */
public class X509LDAPCertStoreSpi extends CertStoreSpi {
    private static String LDAP_PROVIDER = "com.sun.jndi.ldap.LdapCtxFactory";
    private static String REFERRALS_IGNORE = "ignore";
    private static final String SEARCH_SECURITY_LEVEL = "none";
    private static final String URL_CONTEXT_PREFIX = "com.sun.jndi.url";
    private X509LDAPCertStoreParameters params;

    /* JADX WARN: Invalid debug info offset */
    public X509LDAPCertStoreSpi(CertStoreParameters certStoreParameters) throws InvalidAlgorithmParameterException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private java.util.Set certSubjectSerialSearch(java.security.cert.X509CertSelector r6, java.lang.String[] r7, java.lang.String r8, java.lang.String r9) throws java.security.cert.CertStoreException {
        /*
            r5 = this;
            r0 = 0
            return r0
        L23:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.X509LDAPCertStoreSpi.certSubjectSerialSearch(java.security.cert.X509CertSelector, java.lang.String[], java.lang.String, java.lang.String):java.util.Set");
    }

    /* JADX WARN: Invalid debug info offset */
    private DirContext connectLDAP() throws NamingException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private Set getCACertificates(X509CertSelector x509CertSelector) throws CertStoreException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private Set getCrossCertificates(X509CertSelector x509CertSelector) throws CertStoreException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private Set getEndCertificates(X509CertSelector x509CertSelector) throws CertStoreException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private String parseDN(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private java.util.Set search(java.lang.String r8, java.lang.String r9, java.lang.String[] r10) throws java.security.cert.CertStoreException {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.X509LDAPCertStoreSpi.search(java.lang.String, java.lang.String, java.lang.String[]):java.util.Set");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x007e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.cert.CertStoreSpi
    public java.util.Collection engineGetCRLs(java.security.cert.CRLSelector r10) throws java.security.cert.CertStoreException {
        /*
            r9 = this;
            r0 = 0
            return r0
        La5:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.X509LDAPCertStoreSpi.engineGetCRLs(java.security.cert.CRLSelector):java.util.Collection");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0021
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.cert.CertStoreSpi
    public java.util.Collection engineGetCertificates(java.security.cert.CertSelector r7) throws java.security.cert.CertStoreException {
        /*
            r6 = this;
            r0 = 0
            return r0
        L65:
        L78:
        L7c:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.X509LDAPCertStoreSpi.engineGetCertificates(java.security.cert.CertSelector):java.util.Collection");
    }
}
