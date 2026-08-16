package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;

/* JADX INFO: loaded from: classes2.dex */
class RSACoreEngine {
    private boolean forEncryption;
    private RSAKeyParameters key;

    /* JADX WARN: Invalid debug info offset */
    public BigInteger convertInput(byte[] bArr, int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] convertOutput(BigInteger bigInteger) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getInputBlockSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getOutputBlockSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void init(boolean z, CipherParameters cipherParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger processBlock(BigInteger bigInteger) {
        return null;
    }
}
