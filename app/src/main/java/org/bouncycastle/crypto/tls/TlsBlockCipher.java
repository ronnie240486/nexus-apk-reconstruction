package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes2.dex */
public class TlsBlockCipher implements TlsCipher {
    protected TlsClientContext context;
    protected BlockCipher decryptCipher;
    protected BlockCipher encryptCipher;
    protected TlsMac readMac;
    protected TlsMac writeMac;

    /* JADX WARN: Invalid debug info offset */
    public TlsBlockCipher(TlsClientContext tlsClientContext, BlockCipher blockCipher, BlockCipher blockCipher2, Digest digest, Digest digest2, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public int chooseExtraPadBlocks(SecureRandom secureRandom, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsCipher
    public byte[] decodeCiphertext(short s2, byte[] bArr, int i, int i2) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsCipher
    public byte[] encodePlaintext(short s2, byte[] bArr, int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void initCipher(boolean z, BlockCipher blockCipher, byte[] bArr, int i, int i2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    public int lowestBitSet(int i) {
        return 0;
    }
}
