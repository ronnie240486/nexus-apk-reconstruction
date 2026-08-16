package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.IESParameters;
import org.bouncycastle.crypto.params.KDFParameters;

/* JADX INFO: loaded from: classes2.dex */
public class IESEngine {
    BasicAgreement agree;
    BufferedBlockCipher cipher;
    boolean forEncryption;
    DerivationFunction kdf;
    Mac mac;
    byte[] macBuf;
    IESParameters param;
    CipherParameters privParam;
    CipherParameters pubParam;

    /* JADX WARN: Invalid debug info offset */
    public IESEngine(BasicAgreement basicAgreement, DerivationFunction derivationFunction, Mac mac) {
    }

    /* JADX WARN: Invalid debug info offset */
    public IESEngine(BasicAgreement basicAgreement, DerivationFunction derivationFunction, Mac mac, BufferedBlockCipher bufferedBlockCipher) {
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] decryptBlock(byte[] bArr, int i, int i2, byte[] bArr2) throws InvalidCipherTextException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] encryptBlock(byte[] bArr, int i, int i2, byte[] bArr2) throws InvalidCipherTextException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] generateKdfBytes(KDFParameters kDFParameters, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void init(boolean z, CipherParameters cipherParameters, CipherParameters cipherParameters2, CipherParameters cipherParameters3) {
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] processBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        return null;
    }
}
