package org.bouncycastle.jce.provider;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import org.bouncycastle.crypto.generators.DHBasicKeyPairGenerator;
import org.bouncycastle.crypto.generators.DSAKeyPairGenerator;
import org.bouncycastle.crypto.generators.ElGamalKeyPairGenerator;
import org.bouncycastle.crypto.generators.GOST3410KeyPairGenerator;
import org.bouncycastle.crypto.generators.RSAKeyPairGenerator;
import org.bouncycastle.crypto.params.DHKeyGenerationParameters;
import org.bouncycastle.crypto.params.DSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.ElGamalKeyGenerationParameters;
import org.bouncycastle.crypto.params.GOST3410KeyGenerationParameters;
import org.bouncycastle.crypto.params.RSAKeyGenerationParameters;
import org.bouncycastle.jce.spec.GOST3410ParameterSpec;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JDKKeyPairGenerator extends KeyPairGenerator {

    /* JADX INFO: renamed from: org.bouncycastle.jce.provider.JDKKeyPairGenerator$DH */
    public static class C5047DH extends JDKKeyPairGenerator {
        private static Hashtable params = new Hashtable();
        int certainty;
        DHBasicKeyPairGenerator engine;
        boolean initialised;
        DHKeyGenerationParameters param;
        SecureRandom random;
        int strength;

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public KeyPair generateKeyPair() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(int i, SecureRandom secureRandom) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        }
    }

    public static class DSA extends JDKKeyPairGenerator {
        int certainty;
        DSAKeyPairGenerator engine;
        boolean initialised;
        DSAKeyGenerationParameters param;
        SecureRandom random;
        int strength;

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public KeyPair generateKeyPair() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(int i, SecureRandom secureRandom) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        }
    }

    public static class ElGamal extends JDKKeyPairGenerator {
        int certainty;
        ElGamalKeyPairGenerator engine;
        boolean initialised;
        ElGamalKeyGenerationParameters param;
        SecureRandom random;
        int strength;

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public KeyPair generateKeyPair() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(int i, SecureRandom secureRandom) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        }
    }

    public static class GOST3410 extends JDKKeyPairGenerator {
        GOST3410KeyPairGenerator engine;
        GOST3410ParameterSpec gost3410Params;
        boolean initialised;
        GOST3410KeyGenerationParameters param;
        SecureRandom random;
        int strength;

        /* JADX WARN: Invalid debug info offset */
        private void init(GOST3410ParameterSpec gOST3410ParameterSpec, SecureRandom secureRandom) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public KeyPair generateKeyPair() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(int i, SecureRandom secureRandom) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        }
    }

    public static class RSA extends JDKKeyPairGenerator {
        static final BigInteger defaultPublicExponent = BigInteger.valueOf(65537);
        static final int defaultTests = 12;
        RSAKeyPairGenerator engine;
        RSAKeyGenerationParameters param;

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public KeyPair generateKeyPair() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(int i, SecureRandom secureRandom) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public JDKKeyPairGenerator(String str) {
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public abstract KeyPair generateKeyPair();

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public abstract void initialize(int i, SecureRandom secureRandom);
}
