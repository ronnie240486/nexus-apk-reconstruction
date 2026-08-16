package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes2.dex */
public class BaseKDFBytesGenerator implements DerivationFunction {
    private int counterStart;
    private Digest digest;

    /* JADX INFO: renamed from: iv */
    private byte[] f16273iv;
    private byte[] shared;

    /* JADX WARN: Invalid debug info offset */
    public BaseKDFBytesGenerator(int i, Digest digest) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.DerivationFunction
    public Digest getDigest() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
    }
}
