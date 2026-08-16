package org.bouncycastle.jce.provider.symmetric;

import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.HashMap;
import javax.crypto.SecretKey;
import org.bouncycastle.jce.provider.JCEBlockCipher;
import org.bouncycastle.jce.provider.JCEKeyGenerator;
import org.bouncycastle.jce.provider.JCEMac;
import org.bouncycastle.jce.provider.JCESecretKeyFactory;
import org.bouncycastle.jce.provider.WrapCipherSpi;

/* JADX INFO: loaded from: classes2.dex */
public final class DESede {

    public static class CBC extends JCEBlockCipher {
    }

    public static class CBCMAC extends JCEMac {
    }

    public static class CMAC extends JCEMac {
    }

    public static class DESede64 extends JCEMac {
    }

    public static class DESede64with7816d4 extends JCEMac {
    }

    public static class DESedeCFB8 extends JCEMac {
    }

    public static class ECB extends JCEBlockCipher {
    }

    public static class KeyFactory extends JCESecretKeyFactory {
        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JCESecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0024
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // org.bouncycastle.jce.provider.JCESecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public java.security.spec.KeySpec engineGetKeySpec(javax.crypto.SecretKey r4, java.lang.Class r5) throws java.security.spec.InvalidKeySpecException {
            /*
                r3 = this;
                r0 = 0
                return r0
            L3c:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.symmetric.DESede.KeyFactory.engineGetKeySpec(javax.crypto.SecretKey, java.lang.Class):java.security.spec.KeySpec");
        }
    }

    public static class KeyGenerator extends JCEKeyGenerator {
        private boolean keySizeSet;

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JCEKeyGenerator, javax.crypto.KeyGeneratorSpi
        public SecretKey engineGenerateKey() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JCEKeyGenerator, javax.crypto.KeyGeneratorSpi
        public void engineInit(int i, SecureRandom secureRandom) {
        }
    }

    public static class KeyGenerator3 extends JCEKeyGenerator {
    }

    public static class Mappings extends HashMap {
    }

    public static class RFC3211 extends WrapCipherSpi {
    }

    public static class Wrap extends WrapCipherSpi {
    }

    /* JADX WARN: Invalid debug info offset */
    private DESede() {
    }
}
