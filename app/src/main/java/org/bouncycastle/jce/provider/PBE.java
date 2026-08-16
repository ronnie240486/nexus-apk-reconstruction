package org.bouncycastle.jce.provider;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.PBEParametersGenerator;

/* JADX INFO: loaded from: classes2.dex */
public interface PBE {
    public static final int MD2 = 5;
    public static final int MD5 = 0;
    public static final int OPENSSL = 3;
    public static final int PKCS12 = 2;
    public static final int PKCS5S1 = 0;
    public static final int PKCS5S2 = 1;
    public static final int RIPEMD160 = 2;
    public static final int SHA1 = 1;
    public static final int SHA256 = 4;
    public static final int TIGER = 3;

    public static class Util {
        /* JADX WARN: Invalid debug info offset */
        private static PBEParametersGenerator makePBEGenerator(int i, int i2) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static CipherParameters makePBEMacParameters(PBEKeySpec pBEKeySpec, int i, int i2, int i3) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static CipherParameters makePBEMacParameters(JCEPBEKey jCEPBEKey, AlgorithmParameterSpec algorithmParameterSpec) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static CipherParameters makePBEParameters(PBEKeySpec pBEKeySpec, int i, int i2, int i3, int i4) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static CipherParameters makePBEParameters(JCEPBEKey jCEPBEKey, AlgorithmParameterSpec algorithmParameterSpec, String str) {
            return null;
        }
    }
}
