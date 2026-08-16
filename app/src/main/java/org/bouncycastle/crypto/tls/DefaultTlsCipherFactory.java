package org.bouncycastle.crypto.tls;

import java.io.IOException;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultTlsCipherFactory implements TlsCipherFactory {
    /* JADX WARN: Invalid debug info offset */
    public BlockCipher createAESBlockCipher() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public TlsCipher createAESCipher(TlsClientContext tlsClientContext, int i, int i2) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsCipherFactory
    public TlsCipher createCipher(TlsClientContext tlsClientContext, int i, int i2) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BlockCipher createDESedeBlockCipher() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public TlsCipher createDESedeCipher(TlsClientContext tlsClientContext, int i, int i2) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Digest createDigest(int i) throws IOException {
        return null;
    }
}
