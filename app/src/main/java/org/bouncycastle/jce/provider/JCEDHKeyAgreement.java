package org.bouncycastle.jce.provider;

import com.google.android.exoplayer2.extractor.p006ts.PsExtractor;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;

/* JADX INFO: loaded from: classes2.dex */
public class JCEDHKeyAgreement extends KeyAgreementSpi {
    private static final Hashtable algorithms;

    /* JADX INFO: renamed from: g */
    private BigInteger f16363g;

    /* JADX INFO: renamed from: p */
    private BigInteger f16364p;
    private BigInteger result;

    /* JADX INFO: renamed from: x */
    private BigInteger f16365x;

    static {
        Hashtable hashtable = new Hashtable();
        algorithms = hashtable;
        Integer num = new Integer(64);
        Integer num2 = new Integer(PsExtractor.AUDIO_STREAM);
        Integer num3 = new Integer(128);
        Integer num4 = new Integer(256);
        hashtable.put("DES", num);
        hashtable.put("DESEDE", num2);
        hashtable.put("BLOWFISH", num3);
        hashtable.put("AES", num4);
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] bigIntToBytes(BigInteger bigInteger) {
        return null;
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
    public SecretKey engineGenerateSecret(String str) {
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
