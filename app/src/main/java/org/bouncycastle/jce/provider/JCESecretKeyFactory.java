package org.bouncycastle.jce.provider;

import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class JCESecretKeyFactory extends SecretKeyFactorySpi implements PBE {
    protected String algName;
    protected DERObjectIdentifier algOid;

    public static class DES extends JCESecretKeyFactory {
        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JCESecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            return null;
        }
    }

    public static class DESPBEKeyFactory extends JCESecretKeyFactory {
        private int digest;
        private boolean forCipher;
        private int ivSize;
        private int keySize;
        private int scheme;

        /* JADX WARN: Invalid debug info offset */
        public DESPBEKeyFactory(String str, DERObjectIdentifier dERObjectIdentifier, boolean z, int i, int i2, int i3, int i4) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JCESecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            return null;
        }
    }

    public static class PBEKeyFactory extends JCESecretKeyFactory {
        private int digest;
        private boolean forCipher;
        private int ivSize;
        private int keySize;
        private int scheme;

        /* JADX WARN: Invalid debug info offset */
        public PBEKeyFactory(String str, DERObjectIdentifier dERObjectIdentifier, boolean z, int i, int i2, int i3, int i4) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JCESecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            return null;
        }
    }

    public static class PBEWithMD2AndDES extends DESPBEKeyFactory {
    }

    public static class PBEWithMD2AndRC2 extends PBEKeyFactory {
    }

    public static class PBEWithMD5And128BitAESCBCOpenSSL extends PBEKeyFactory {
    }

    public static class PBEWithMD5And192BitAESCBCOpenSSL extends PBEKeyFactory {
    }

    public static class PBEWithMD5And256BitAESCBCOpenSSL extends PBEKeyFactory {
    }

    public static class PBEWithMD5AndDES extends DESPBEKeyFactory {
    }

    public static class PBEWithMD5AndRC2 extends PBEKeyFactory {
    }

    public static class PBEWithRIPEMD160 extends PBEKeyFactory {
    }

    public static class PBEWithSHA extends PBEKeyFactory {
    }

    public static class PBEWithSHA1AndDES extends DESPBEKeyFactory {
    }

    public static class PBEWithSHA1AndRC2 extends PBEKeyFactory {
    }

    public static class PBEWithSHA256And128BitAESBC extends PBEKeyFactory {
    }

    public static class PBEWithSHA256And192BitAESBC extends PBEKeyFactory {
    }

    public static class PBEWithSHA256And256BitAESBC extends PBEKeyFactory {
    }

    public static class PBEWithSHAAnd128BitAESBC extends PBEKeyFactory {
    }

    public static class PBEWithSHAAnd128BitRC2 extends PBEKeyFactory {
    }

    public static class PBEWithSHAAnd128BitRC4 extends PBEKeyFactory {
    }

    public static class PBEWithSHAAnd192BitAESBC extends PBEKeyFactory {
    }

    public static class PBEWithSHAAnd256BitAESBC extends PBEKeyFactory {
    }

    public static class PBEWithSHAAnd40BitRC2 extends PBEKeyFactory {
    }

    public static class PBEWithSHAAnd40BitRC4 extends PBEKeyFactory {
    }

    public static class PBEWithSHAAndDES2Key extends DESPBEKeyFactory {
    }

    public static class PBEWithSHAAndDES3Key extends DESPBEKeyFactory {
    }

    public static class PBEWithSHAAndTwofish extends PBEKeyFactory {
    }

    public static class PBEWithTiger extends PBEKeyFactory {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCESecretKeyFactory(String str, DERObjectIdentifier dERObjectIdentifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // javax.crypto.SecretKeyFactorySpi
    public java.security.spec.KeySpec engineGetKeySpec(javax.crypto.SecretKey r5, java.lang.Class r6) throws java.security.spec.InvalidKeySpecException {
        /*
            r4 = this;
            r0 = 0
            return r0
        L33:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCESecretKeyFactory.engineGetKeySpec(javax.crypto.SecretKey, java.lang.Class):java.security.spec.KeySpec");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineTranslateKey(SecretKey secretKey) throws InvalidKeyException {
        return null;
    }
}
