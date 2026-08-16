package org.bouncycastle.jce.provider.symmetric;

import java.util.HashMap;
import org.bouncycastle.jce.provider.JCEBlockCipher;
import org.bouncycastle.jce.provider.JCEKeyGenerator;
import org.bouncycastle.jce.provider.JDKAlgorithmParameters;

/* JADX INFO: loaded from: classes2.dex */
public final class Blowfish {

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

    /* JADX WARN: Invalid debug info offset */
    private Blowfish() {
    }
}
