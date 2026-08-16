package org.bouncycastle.jce.provider;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.crypto.Cipher;
import org.bouncycastle.jce.interfaces.BCKeyStore;

/* JADX INFO: loaded from: classes2.dex */
public class JDKKeyStore extends KeyStoreSpi implements BCKeyStore {
    static final int CERTIFICATE = 1;
    static final int KEY = 2;
    private static final String KEY_CIPHER = "PBEWithSHAAnd3-KeyTripleDES-CBC";
    static final int KEY_PRIVATE = 0;
    static final int KEY_PUBLIC = 1;
    private static final int KEY_SALT_SIZE = 20;
    static final int KEY_SECRET = 2;
    private static final int MIN_ITERATIONS = 1024;
    static final int NULL = 0;
    static final int SEALED = 4;
    static final int SECRET = 3;
    private static final String STORE_CIPHER = "PBEWithSHAAndTwofish-CBC";
    private static final int STORE_SALT_SIZE = 20;
    private static final int STORE_VERSION = 1;
    protected SecureRandom random;
    protected Hashtable table;

    public static class BouncyCastleStore extends JDKKeyStore {
        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKKeyStore, java.security.KeyStoreSpi
        public void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKKeyStore, java.security.KeyStoreSpi
        public void engineStore(OutputStream outputStream, char[] cArr) throws IOException {
        }
    }

    public class StoreEntry {
        String alias;
        Certificate[] certChain;
        Date date;
        Object obj;
        final /* synthetic */ JDKKeyStore this$0;
        int type;

        /* JADX WARN: Invalid debug info offset */
        public StoreEntry(JDKKeyStore jDKKeyStore, String str, Key key, char[] cArr, Certificate[] certificateArr) throws Exception {
        }

        /* JADX WARN: Invalid debug info offset */
        public StoreEntry(JDKKeyStore jDKKeyStore, String str, Certificate certificate) {
        }

        /* JADX WARN: Invalid debug info offset */
        public StoreEntry(JDKKeyStore jDKKeyStore, String str, Date date, int i, Object obj) {
        }

        /* JADX WARN: Invalid debug info offset */
        public StoreEntry(JDKKeyStore jDKKeyStore, String str, Date date, int i, Object obj, Certificate[] certificateArr) {
        }

        /* JADX WARN: Invalid debug info offset */
        public StoreEntry(JDKKeyStore jDKKeyStore, String str, byte[] bArr, Certificate[] certificateArr) {
        }

        /* JADX WARN: Invalid debug info offset */
        public String getAlias() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Certificate[] getCertificateChain() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Date getDate() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Object getObject() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0021
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        public java.lang.Object getObject(char[] r11) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException {
            /*
                Method dump skipped, instruction units count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKKeyStore.StoreEntry.getObject(char[]):java.lang.Object");
        }

        /* JADX WARN: Invalid debug info offset */
        public int getType() {
            return 0;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ void access$000(JDKKeyStore jDKKeyStore, Key key, DataOutputStream dataOutputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ Key access$100(JDKKeyStore jDKKeyStore, DataInputStream dataInputStream) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private java.security.cert.Certificate decodeCertificate(java.io.DataInputStream r3) throws java.io.IOException {
        /*
            r2 = this;
            r0 = 0
            return r0
        L1d:
        L1f:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKKeyStore.decodeCertificate(java.io.DataInputStream):java.security.cert.Certificate");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0068
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private java.security.Key decodeKey(java.io.DataInputStream r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            return r0
        L73:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKKeyStore.decodeKey(java.io.DataInputStream):java.security.Key");
    }

    /* JADX WARN: Invalid debug info offset */
    private void encodeCertificate(Certificate certificate, DataOutputStream dataOutputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void encodeKey(Key key, DataOutputStream dataOutputStream) throws IOException {
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
    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        return null;
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
    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(java.lang.String r9, java.security.Key r10, char[] r11, java.security.cert.Certificate[] r12) throws java.security.KeyStoreException {
        /*
            r8 = this;
            return
        L20:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKKeyStore.engineSetKeyEntry(java.lang.String, java.security.Key, char[], java.security.cert.Certificate[]):void");
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
    public void loadStore(InputStream inputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public Cipher makePBECipher(String str, int i, char[] cArr, byte[] bArr, int i2) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void saveStore(OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.BCKeyStore
    public void setRandom(SecureRandom secureRandom) {
    }
}
