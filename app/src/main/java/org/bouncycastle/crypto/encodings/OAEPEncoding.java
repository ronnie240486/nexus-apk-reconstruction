package org.bouncycastle.crypto.encodings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* JADX INFO: loaded from: classes2.dex */
public class OAEPEncoding implements AsymmetricBlockCipher {
    private byte[] defHash;
    private AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private Digest hash;
    private Digest mgf1Hash;
    private SecureRandom random;

    /* JADX WARN: Invalid debug info offset */
    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void ItoOSP(int i, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] maskGeneratorFunction1(byte[] bArr, int i, int i2, int i3) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] decodeBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] encodeBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public AsymmetricBlockCipher getUnderlyingCipher() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        return null;
    }
}
