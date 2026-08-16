package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.SubjectKeyIdentifier;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.jce.interfaces.BCKeyStore;

/* JADX INFO: loaded from: classes2.dex */
public class JDKPKCS12KeyStore extends KeyStoreSpi implements PKCSObjectIdentifiers, X509ObjectIdentifiers, BCKeyStore {
    static final int CERTIFICATE = 1;
    static final int KEY = 2;
    static final int KEY_PRIVATE = 0;
    static final int KEY_PUBLIC = 1;
    static final int KEY_SECRET = 2;
    private static final int MIN_ITERATIONS = 1024;
    static final int NULL = 0;
    private static final int SALT_SIZE = 20;
    static final int SEALED = 4;
    static final int SECRET = 3;
    private static final Provider bcProvider = new BouncyCastleProvider();
    private DERObjectIdentifier certAlgorithm;
    private CertificateFactory certFact;
    private IgnoresCaseHashtable certs;
    private Hashtable chainCerts;
    private DERObjectIdentifier keyAlgorithm;
    private Hashtable keyCerts;
    private IgnoresCaseHashtable keys;
    private Hashtable localIds;
    protected SecureRandom random;

    public static class BCPKCS12KeyStore extends JDKPKCS12KeyStore {
    }

    public static class BCPKCS12KeyStore3DES extends JDKPKCS12KeyStore {
    }

    public class CertId {

        /* JADX INFO: renamed from: id */
        byte[] f16380id;
        final /* synthetic */ JDKPKCS12KeyStore this$0;

        /* JADX WARN: Invalid debug info offset */
        public CertId(JDKPKCS12KeyStore jDKPKCS12KeyStore, PublicKey publicKey) {
        }

        /* JADX WARN: Invalid debug info offset */
        public CertId(JDKPKCS12KeyStore jDKPKCS12KeyStore, byte[] bArr) {
        }

        /* JADX WARN: Invalid debug info offset */
        public boolean equals(Object obj) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        public int hashCode() {
            return 0;
        }
    }

    public static class DefPKCS12KeyStore extends JDKPKCS12KeyStore {
    }

    public static class DefPKCS12KeyStore3DES extends JDKPKCS12KeyStore {
    }

    public static class IgnoresCaseHashtable {
        private Hashtable keys;
        private Hashtable orig;

        /* JADX WARN: Invalid debug info offset */
        private IgnoresCaseHashtable() {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ IgnoresCaseHashtable(C50481 c50481) {
        }

        /* JADX WARN: Invalid debug info offset */
        public Enumeration elements() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Object get(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Enumeration keys() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public void put(String str, Object obj) {
        }

        /* JADX WARN: Invalid debug info offset */
        public Object remove(String str) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0036
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public JDKPKCS12KeyStore(java.security.Provider r3, org.bouncycastle.asn1.DERObjectIdentifier r4, org.bouncycastle.asn1.DERObjectIdentifier r5) {
        /*
            r2 = this;
            return
        L3d:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKPKCS12KeyStore.<init>(java.security.Provider, org.bouncycastle.asn1.DERObjectIdentifier, org.bouncycastle.asn1.DERObjectIdentifier):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ SubjectKeyIdentifier access$100(JDKPKCS12KeyStore jDKPKCS12KeyStore, PublicKey publicKey) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ Provider access$200() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static byte[] calculatePbeMac(DERObjectIdentifier dERObjectIdentifier, byte[] bArr, int i, char[] cArr, boolean z, byte[] bArr2) throws Exception {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private SubjectKeyIdentifier createSubjectKeyId(PublicKey publicKey) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0158
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private void doStore(java.io.OutputStream r18, char[] r19, boolean r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKPKCS12KeyStore.doStore(java.io.OutputStream, char[], boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0018
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public byte[] cryptData(boolean r6, org.bouncycastle.asn1.x509.AlgorithmIdentifier r7, char[] r8, boolean r9, byte[] r10) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            return r0
        L49:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKPKCS12KeyStore.cryptData(boolean, org.bouncycastle.asn1.x509.AlgorithmIdentifier, char[], boolean, byte[]):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.KeyStoreSpi
    public Enumeration engineAliases() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) throws KeyStoreException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0026
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.KeyStoreSpi
    public java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKPKCS12KeyStore.engineGetCertificateChain(java.lang.String):java.security.cert.Certificate[]");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0063
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.KeyStoreSpi
    public void engineLoad(java.io.InputStream r21, char[] r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKPKCS12KeyStore.engineLoad(java.io.InputStream, char[]):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException, CertificateException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.BCKeyStore
    public void setRandom(SecureRandom secureRandom) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0018
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public java.security.PrivateKey unwrapKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier r6, byte[] r7, char[] r8, boolean r9) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            return r0
        L4b:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKPKCS12KeyStore.unwrapKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier, byte[], char[], boolean):java.security.PrivateKey");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public byte[] wrapKey(java.lang.String r5, java.security.Key r6, org.bouncycastle.asn1.pkcs.PKCS12PBEParams r7, char[] r8) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 0
            return r0
        L2d:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKPKCS12KeyStore.wrapKey(java.lang.String, java.security.Key, org.bouncycastle.asn1.pkcs.PKCS12PBEParams, char[]):byte[]");
    }
}
