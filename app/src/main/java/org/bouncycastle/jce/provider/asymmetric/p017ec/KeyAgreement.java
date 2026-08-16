package org.bouncycastle.jce.provider.asymmetric.p017ec;

import com.google.android.exoplayer2.extractor.p006ts.PsExtractor;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.p015x9.X9IntegerConverter;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.params.ECDomainParameters;

/* JADX INFO: loaded from: classes2.dex */
public class KeyAgreement extends KeyAgreementSpi {
    private static final Hashtable algorithms;
    private static final X9IntegerConverter converter = new X9IntegerConverter();
    private BasicAgreement agreement;
    private String kaAlgorithm;
    private DerivationFunction kdf;
    private ECDomainParameters parameters;
    private BigInteger result;

    /* JADX INFO: renamed from: org.bouncycastle.jce.provider.asymmetric.ec.KeyAgreement$DH */
    public static class C5050DH extends KeyAgreement {
    }

    public static class DHC extends KeyAgreement {
    }

    public static class DHwithSHA1KDF extends KeyAgreement {
    }

    public static class MQV extends KeyAgreement {
    }

    public static class MQVwithSHA1KDF extends KeyAgreement {
    }

    static {
        Hashtable hashtable = new Hashtable();
        algorithms = hashtable;
        Integer num = new Integer(128);
        Integer num2 = new Integer(PsExtractor.AUDIO_STREAM);
        Integer num3 = new Integer(256);
        hashtable.put(NISTObjectIdentifiers.id_aes128_CBC.getId(), num);
        hashtable.put(NISTObjectIdentifiers.id_aes192_CBC.getId(), num2);
        hashtable.put(NISTObjectIdentifiers.id_aes256_CBC.getId(), num3);
        hashtable.put(NISTObjectIdentifiers.id_aes128_wrap.getId(), num);
        hashtable.put(NISTObjectIdentifiers.id_aes192_wrap.getId(), num2);
        hashtable.put(NISTObjectIdentifiers.id_aes256_wrap.getId(), num3);
        hashtable.put(PKCSObjectIdentifiers.id_alg_CMS3DESwrap.getId(), num2);
    }

    /* JADX WARN: Invalid debug info offset */
    public KeyAgreement(String str, BasicAgreement basicAgreement, DerivationFunction derivationFunction) {
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] bigIntToBytes(BigInteger bigInteger) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static String getSimpleName(Class cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private void initFromKey(Key key) throws InvalidKeyException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z) throws IllegalStateException, InvalidKeyException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i) throws IllegalStateException, ShortBufferException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.KeyAgreementSpi
    public SecretKey engineGenerateSecret(String str) throws NoSuchAlgorithmException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() throws IllegalStateException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
    }
}
