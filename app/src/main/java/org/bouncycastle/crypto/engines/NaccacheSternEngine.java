package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import java.util.Vector;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.NaccacheSternKeyParameters;

/* JADX INFO: loaded from: classes2.dex */
public class NaccacheSternEngine implements AsymmetricBlockCipher {
    private boolean debug;
    private boolean forEncryption;
    private NaccacheSternKeyParameters key;
    private Vector[] lookup;
    private static BigInteger ZERO = BigInteger.valueOf(0);
    private static BigInteger ONE = BigInteger.valueOf(1);

    /* JADX WARN: Invalid debug info offset */
    private static BigInteger chineseRemainder(Vector vector, Vector vector2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] addCryptedBlocks(byte[] bArr, byte[] bArr2) throws InvalidCipherTextException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] encrypt(BigInteger bigInteger) {
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
    public byte[] processBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] processData(byte[] bArr) throws InvalidCipherTextException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDebug(boolean z) {
    }
}
