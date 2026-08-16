package org.bouncycastle.crypto.p016io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes2.dex */
public class DigestOutputStream extends FilterOutputStream {
    protected Digest digest;

    /* JADX WARN: Invalid debug info offset */
    public DigestOutputStream(OutputStream outputStream, Digest digest) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Digest getDigest() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
    }
}
