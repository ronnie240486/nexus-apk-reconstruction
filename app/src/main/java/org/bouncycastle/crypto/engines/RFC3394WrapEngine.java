package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes2.dex */
public class RFC3394WrapEngine implements Wrapper {
    private BlockCipher engine;
    private boolean forWrapping;

    /* JADX INFO: renamed from: iv */
    private byte[] f16249iv;
    private KeyParameter param;

    /* JADX WARN: Invalid debug info offset */
    public RFC3394WrapEngine(BlockCipher blockCipher) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z, CipherParameters cipherParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i, int i2) {
        return null;
    }
}
