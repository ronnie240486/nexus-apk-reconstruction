package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import org.bouncycastle.crypto.CipherKeyGenerator;

/* JADX INFO: loaded from: classes2.dex */
public class JCEKeyGenerator extends KeyGeneratorSpi {
    protected String algName;
    protected int defaultKeySize;
    protected CipherKeyGenerator engine;
    protected int keySize;
    protected boolean uninitialised;

    public static class DES extends JCEKeyGenerator {
    }

    public static class GOST28147 extends JCEKeyGenerator {
    }

    public static class HMACSHA1 extends JCEKeyGenerator {
    }

    public static class HMACSHA224 extends JCEKeyGenerator {
    }

    public static class HMACSHA256 extends JCEKeyGenerator {
    }

    public static class HMACSHA384 extends JCEKeyGenerator {
    }

    public static class HMACSHA512 extends JCEKeyGenerator {
    }

    public static class HMACTIGER extends JCEKeyGenerator {
    }

    public static class MD2HMAC extends JCEKeyGenerator {
    }

    public static class MD4HMAC extends JCEKeyGenerator {
    }

    public static class MD5HMAC extends JCEKeyGenerator {
    }

    public static class RC2 extends JCEKeyGenerator {
    }

    public static class RIPEMD128HMAC extends JCEKeyGenerator {
    }

    public static class RIPEMD160HMAC extends JCEKeyGenerator {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEKeyGenerator(String str, int i, CipherKeyGenerator cipherKeyGenerator) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.KeyGeneratorSpi
    public SecretKey engineGenerateKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(SecureRandom secureRandom) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
    }
}
