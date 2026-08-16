package org.bouncycastle.crypto.agreement.kdf;

import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes2.dex */
public class ECDHKEKGenerator implements DerivationFunction {
    private DERObjectIdentifier algorithm;
    private DerivationFunction kdf;
    private int keySize;

    /* JADX INFO: renamed from: z */
    private byte[] f16047z;

    /* JADX WARN: Invalid debug info offset */
    public ECDHKEKGenerator(Digest digest) {
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] integerToBytes(int i) {
        return null;
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
