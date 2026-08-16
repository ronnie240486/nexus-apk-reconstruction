package org.bouncycastle.jce.provider.asymmetric.p017ec;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.bouncycastle.jce.provider.JDKKeyFactory;

/* JADX INFO: loaded from: classes2.dex */
public class KeyFactory extends JDKKeyFactory {
    String algorithm;

    /* JADX INFO: renamed from: org.bouncycastle.jce.provider.asymmetric.ec.KeyFactory$EC */
    public static class C5051EC extends KeyFactory {
    }

    public static class ECDH extends KeyFactory {
    }

    public static class ECDHC extends KeyFactory {
    }

    public static class ECDSA extends KeyFactory {
    }

    public static class ECGOST3410 extends KeyFactory {
    }

    public static class ECMQV extends KeyFactory {
    }

    /* JADX WARN: Invalid debug info offset */
    public KeyFactory(String str) {
    }

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
        L18:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.asymmetric.p017ec.KeyFactory.engineGeneratePrivate(java.security.spec.KeySpec):java.security.PrivateKey");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.jce.provider.JDKKeyFactory, java.security.KeyFactorySpi
    public java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec r3) throws java.security.spec.InvalidKeySpecException {
        /*
            r2 = this;
            r0 = 0
            return r0
        L18:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.asymmetric.p017ec.KeyFactory.engineGeneratePublic(java.security.spec.KeySpec):java.security.PublicKey");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.provider.JDKKeyFactory, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.provider.JDKKeyFactory, java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        return null;
    }
}
