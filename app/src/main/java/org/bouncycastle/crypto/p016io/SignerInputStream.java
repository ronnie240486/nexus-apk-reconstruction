package org.bouncycastle.crypto.p016io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.Signer;

/* JADX INFO: loaded from: classes2.dex */
public class SignerInputStream extends FilterInputStream {
    protected Signer signer;

    /* JADX WARN: Invalid debug info offset */
    public SignerInputStream(InputStream inputStream, Signer signer) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Signer getSigner() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return 0;
    }
}
