package org.bouncycastle.jce.provider.asymmetric.p017ec;

import com.google.android.exoplayer2.extractor.p006ts.PsExtractor;
import com.tencent.smtt.sdk.TbsListener;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.ECGenParameterSpec;
import java.util.Hashtable;
import org.bouncycastle.crypto.generators.ECKeyPairGenerator;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.jce.provider.JDKKeyPairGenerator;
import p000.C4525iC;

/* JADX INFO: loaded from: classes2.dex */
public abstract class KeyPairGenerator extends JDKKeyPairGenerator {

    /* JADX INFO: renamed from: org.bouncycastle.jce.provider.asymmetric.ec.KeyPairGenerator$EC */
    public static class C5052EC extends KeyPairGenerator {
        private static Hashtable ecParameters;
        String algorithm;
        int certainty;
        Object ecParams;
        ECKeyPairGenerator engine;
        boolean initialised;
        ECKeyGenerationParameters param;
        SecureRandom random;
        int strength;

        static {
            Hashtable hashtable = new Hashtable();
            ecParameters = hashtable;
            hashtable.put(new Integer(PsExtractor.AUDIO_STREAM), new ECGenParameterSpec("prime192v1"));
            ecParameters.put(new Integer(TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL), new ECGenParameterSpec("prime239v1"));
            ecParameters.put(new Integer(256), new ECGenParameterSpec("prime256v1"));
            ecParameters.put(new Integer(224), new ECGenParameterSpec("P-224"));
            ecParameters.put(new Integer(C4525iC.f14486j), new ECGenParameterSpec("P-384"));
            ecParameters.put(new Integer(521), new ECGenParameterSpec("P-521"));
        }

        /* JADX WARN: Invalid debug info offset */
        public C5052EC() {
        }

        /* JADX WARN: Invalid debug info offset */
        public C5052EC(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public KeyPair generateKeyPair() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0013
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // org.bouncycastle.jce.provider.JDKKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(int r3, java.security.SecureRandom r4) {
            /*
                r2 = this;
                return
            L19:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.asymmetric.p017ec.KeyPairGenerator.C5052EC.initialize(int, java.security.SecureRandom):void");
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x00c2
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(java.security.spec.AlgorithmParameterSpec r12, java.security.SecureRandom r13) throws java.security.InvalidAlgorithmParameterException {
            /*
                Method dump skipped, instruction units count: 403
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.asymmetric.p017ec.KeyPairGenerator.C5052EC.initialize(java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
        }
    }

    public static class ECDH extends C5052EC {
    }

    public static class ECDHC extends C5052EC {
    }

    public static class ECDSA extends C5052EC {
    }

    public static class ECGOST3410 extends C5052EC {
    }

    public static class ECMQV extends C5052EC {
    }

    /* JADX WARN: Invalid debug info offset */
    public KeyPairGenerator(String str) {
    }
}
