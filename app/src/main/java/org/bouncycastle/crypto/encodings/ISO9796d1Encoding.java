package org.bouncycastle.crypto.encodings;

import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.dom4j.p020io.SAXEventRecorder;

/* JADX INFO: loaded from: classes2.dex */
public class ISO9796d1Encoding implements AsymmetricBlockCipher {
    private int bitSize;
    private AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private BigInteger modulus;
    private int padBits;
    private static final BigInteger SIXTEEN = BigInteger.valueOf(16);
    private static final BigInteger SIX = BigInteger.valueOf(6);
    private static byte[] shadows = {SAXEventRecorder.SAXEvent.f16648q, 3, 5, 8, 9, 4, 2, SAXEventRecorder.SAXEvent.f16649r, 0, 13, SAXEventRecorder.SAXEvent.f16645n, 6, 7, 10, SAXEventRecorder.SAXEvent.f16646o, 1};
    private static byte[] inverse = {8, SAXEventRecorder.SAXEvent.f16649r, 6, 1, 5, 2, SAXEventRecorder.SAXEvent.f16645n, SAXEventRecorder.SAXEvent.f16646o, 3, 4, 13, 10, SAXEventRecorder.SAXEvent.f16648q, 9, 0, 7};

    /* JADX WARN: Invalid debug info offset */
    public ISO9796d1Encoding(AsymmetricBlockCipher asymmetricBlockCipher) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static byte[] convertOutputDecryptOnly(BigInteger bigInteger) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] decodeBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] encodeBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
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
    public int getPadBits() {
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

    /* JADX WARN: Invalid debug info offset */
    public void setPadBits(int i) {
    }
}
