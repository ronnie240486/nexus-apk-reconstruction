package org.bouncycastle.openssl;

import java.security.AlgorithmParameterGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.util.p019io.pem.PemObjectGenerator;

/* JADX INFO: loaded from: classes2.dex */
public class PKCS8Generator implements PemObjectGenerator {
    private String algorithm;
    private Cipher cipher;
    private int iterationCount;
    private PrivateKey key;
    private AlgorithmParameterGenerator paramGen;
    private char[] password;
    private SecureRandom random;
    private SecretKeyFactory secKeyFact;
    public static final String AES_128_CBC = NISTObjectIdentifiers.id_aes128_CBC.getId();
    public static final String AES_192_CBC = NISTObjectIdentifiers.id_aes192_CBC.getId();
    public static final String AES_256_CBC = NISTObjectIdentifiers.id_aes256_CBC.getId();
    public static final String DES3_CBC = PKCSObjectIdentifiers.des_EDE3_CBC.getId();
    public static final String PBE_SHA1_RC4_128 = PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4.getId();
    public static final String PBE_SHA1_RC4_40 = PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC4.getId();
    public static final String PBE_SHA1_3DES = PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC.getId();
    public static final String PBE_SHA1_2DES = PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC.getId();
    public static final String PBE_SHA1_RC2_128 = PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC2_CBC.getId();
    public static final String PBE_SHA1_RC2_40 = PKCSObjectIdentifiers.pbewithSHAAnd40BitRC2_CBC.getId();

    /* JADX WARN: Invalid debug info offset */
    public PKCS8Generator(PrivateKey privateKey) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PKCS8Generator(PrivateKey privateKey, String str, String str2) throws NoSuchAlgorithmException, NoSuchProviderException {
    }

    /* JADX WARN: Invalid debug info offset */
    public PKCS8Generator(PrivateKey privateKey, String str, Provider provider) throws NoSuchAlgorithmException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private void init(java.security.PrivateKey r2, java.lang.String r3, java.security.Provider r4) throws java.security.NoSuchAlgorithmException {
        /*
            r1 = this;
            return
        L27:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.openssl.PKCS8Generator.init(java.security.PrivateKey, java.lang.String, java.security.Provider):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0044
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.util.p019io.pem.PemObjectGenerator
    public org.bouncycastle.util.p019io.pem.PemObject generate() throws org.bouncycastle.util.p019io.pem.PemGenerationException {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.openssl.PKCS8Generator.generate():org.bouncycastle.util.io.pem.PemObject");
    }

    /* JADX WARN: Invalid debug info offset */
    public PKCS8Generator setIterationCount(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKCS8Generator setPassword(char[] cArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKCS8Generator setSecureRandom(SecureRandom secureRandom) {
        return null;
    }
}
