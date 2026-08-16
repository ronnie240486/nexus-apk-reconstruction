package org.bouncycastle.jce.provider.symmetric;

import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import org.bouncycastle.jce.provider.JCEBlockCipher;
import org.bouncycastle.jce.provider.JCEKeyGenerator;
import org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator;
import org.bouncycastle.jce.provider.JDKAlgorithmParameters;
import org.bouncycastle.jce.provider.WrapCipherSpi;

/* JADX INFO: loaded from: classes2.dex */
public final class SEED {

    public static class AlgParamGen extends JDKAlgorithmParameterGenerator {
        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0014
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public java.security.AlgorithmParameters engineGenerateParameters() {
            /*
                r3 = this;
                r0 = 0
                return r0
            L25:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.symmetric.SEED.AlgParamGen.engineGenerateParameters():java.security.AlgorithmParameters");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        }
    }

    public static class AlgParams extends JDKAlgorithmParameters.IVAlgorithmParameters {
        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKAlgorithmParameters.IVAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return null;
        }
    }

    public static class CBC extends JCEBlockCipher {
    }

    public static class ECB extends JCEBlockCipher {
    }

    public static class KeyGen extends JCEKeyGenerator {
    }

    public static class Mappings extends HashMap {
    }

    public static class Wrap extends WrapCipherSpi {
    }

    /* JADX WARN: Invalid debug info offset */
    private SEED() {
    }
}
