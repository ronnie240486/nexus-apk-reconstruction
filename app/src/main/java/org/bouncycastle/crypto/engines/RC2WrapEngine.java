package org.bouncycastle.crypto.engines;

import java.security.SecureRandom;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes2.dex */
public class RC2WrapEngine implements Wrapper {
    private static final byte[] IV2 = {74, -35, -94, 44, 121, -24, PublicSuffixDatabase.f15556i, 5};
    byte[] digest;
    private CBCBlockCipher engine;
    private boolean forWrapping;

    /* JADX INFO: renamed from: iv */
    private byte[] f16242iv;
    private CipherParameters param;
    private ParametersWithIV paramPlusIV;
    Digest sha1;

    /* JADX INFO: renamed from: sr */
    private SecureRandom f16243sr;

    /* JADX WARN: Invalid debug info offset */
    private byte[] calculateCMSKeyChecksum(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean checkCMSKeyChecksum(byte[] bArr, byte[] bArr2) {
        return false;
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
