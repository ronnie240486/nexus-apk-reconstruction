package org.bouncycastle.jce.provider;

import java.security.AlgorithmParameterGeneratorSpi;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JDKAlgorithmParameterGenerator extends AlgorithmParameterGeneratorSpi {
    protected SecureRandom random;
    protected int strength;

    public static class DES extends JDKAlgorithmParameterGenerator {
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
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator.DES.engineGenerateParameters():java.security.AlgorithmParameters");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        }
    }

    /* JADX INFO: renamed from: org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator$DH */
    public static class C5044DH extends JDKAlgorithmParameterGenerator {

        /* JADX INFO: renamed from: l */
        private int f16372l;

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001f
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public java.security.AlgorithmParameters engineGenerateParameters() {
            /*
                r5 = this;
                r0 = 0
                return r0
            L3a:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator.C5044DH.engineGenerateParameters():java.security.AlgorithmParameters");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        }
    }

    public static class DSA extends JDKAlgorithmParameterGenerator {
        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001f
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public java.security.AlgorithmParameters engineGenerateParameters() {
            /*
                r5 = this;
                r0 = 0
                return r0
            L3c:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator.DSA.engineGenerateParameters():java.security.AlgorithmParameters");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator, java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(int i, SecureRandom secureRandom) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        }
    }

    public static class ElGamal extends JDKAlgorithmParameterGenerator {

        /* JADX INFO: renamed from: l */
        private int f16373l;

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001f
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public java.security.AlgorithmParameters engineGenerateParameters() {
            /*
                r5 = this;
                r0 = 0
                return r0
            L3a:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator.ElGamal.engineGenerateParameters():java.security.AlgorithmParameters");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        }
    }

    public static class GOST3410 extends JDKAlgorithmParameterGenerator {
        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001e
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public java.security.AlgorithmParameters engineGenerateParameters() {
            /*
                r6 = this;
                r0 = 0
                return r0
            L40:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator.GOST3410.engineGenerateParameters():java.security.AlgorithmParameters");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        }
    }

    public static class RC2 extends JDKAlgorithmParameterGenerator {
        RC2ParameterSpec spec;

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001a
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public java.security.AlgorithmParameters engineGenerateParameters() {
            /*
                r3 = this;
                r0 = 0
                return r0
            L29:
            L40:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator.RC2.engineGenerateParameters():java.security.AlgorithmParameters");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
    }
}
