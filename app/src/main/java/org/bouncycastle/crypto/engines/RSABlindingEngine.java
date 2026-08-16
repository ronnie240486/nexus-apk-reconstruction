package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;

/* JADX INFO: loaded from: classes2.dex */
public class RSABlindingEngine implements AsymmetricBlockCipher {
    private BigInteger blindingFactor;
    private RSACoreEngine core;
    private boolean forEncryption;
    private RSAKeyParameters key;

    /* JADX WARN: Invalid debug info offset */
    private BigInteger blindMessage(BigInteger bigInteger) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private BigInteger unblindMessage(BigInteger bigInteger) {
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
    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i, int i2) {
        return null;
    }
}
