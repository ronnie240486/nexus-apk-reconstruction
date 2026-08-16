package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JDKKeyFactory extends KeyFactorySpi {
    protected boolean elGamalFactory;

    /* JADX INFO: renamed from: org.bouncycastle.jce.provider.JDKKeyFactory$DH */
    public static class C5046DH extends JDKKeyFactory {
        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKKeyFactory, java.security.KeyFactorySpi
        public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKKeyFactory, java.security.KeyFactorySpi
        public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
            return null;
        }
    }

    public static class DSA extends JDKKeyFactory {
        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKKeyFactory, java.security.KeyFactorySpi
        public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKKeyFactory, java.security.KeyFactorySpi
        public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
            return null;
        }
    }

    public static class ElGamal extends JDKKeyFactory {
        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKKeyFactory, java.security.KeyFactorySpi
        public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKKeyFactory, java.security.KeyFactorySpi
        public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
            return null;
        }
    }

    public static class GOST3410 extends JDKKeyFactory {
        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKKeyFactory, java.security.KeyFactorySpi
        public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKKeyFactory, java.security.KeyFactorySpi
        public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
            return null;
        }
    }

    public static class RSA extends JDKKeyFactory {
        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // org.bouncycastle.jce.provider.JDKKeyFactory, java.security.KeyFactorySpi
        public java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec r3) throws java.security.spec.InvalidKeySpecException {
            /*
                r2 = this;
                r0 = 0
                return r0
            L10:
            L27:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKKeyFactory.RSA.engineGeneratePrivate(java.security.spec.KeySpec):java.security.PrivateKey");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKKeyFactory, java.security.KeyFactorySpi
        public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
            return null;
        }
    }

    public static class X509 extends JDKKeyFactory {
    }

    /* JADX WARN: Invalid debug info offset */
    public static PrivateKey createPrivateKeyFromDERStream(byte[] bArr) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static PrivateKey createPrivateKeyFromPrivateKeyInfo(PrivateKeyInfo privateKeyInfo) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static PublicKey createPublicKeyFromDERStream(byte[] bArr) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static PublicKey createPublicKeyFromPublicKeyInfo(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.KeyFactorySpi
    public java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec r3) throws java.security.spec.InvalidKeySpecException {
        /*
            r2 = this;
            r0 = 0
            return r0
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKKeyFactory.engineGeneratePrivate(java.security.spec.KeySpec):java.security.PrivateKey");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.KeyFactorySpi
    public java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec r3) throws java.security.spec.InvalidKeySpecException {
        /*
            r2 = this;
            r0 = 0
            return r0
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKKeyFactory.engineGeneratePublic(java.security.spec.KeySpec):java.security.PublicKey");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        return null;
    }
}
