package org.bouncycastle.jce.provider;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.signers.ISO9796d2Signer;

/* JADX INFO: loaded from: classes2.dex */
public class JDKISOSignature extends SignatureSpi {
    private ISO9796d2Signer signer;

    public static class MD5WithRSAEncryption extends JDKISOSignature {
    }

    public static class RIPEMD160WithRSAEncryption extends JDKISOSignature {
    }

    public static class SHA1WithRSAEncryption extends JDKISOSignature {
    }

    /* JADX WARN: Invalid debug info offset */
    public JDKISOSignature(Digest digest, AsymmetricBlockCipher asymmetricBlockCipher) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) throws SignatureException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        return false;
    }
}
