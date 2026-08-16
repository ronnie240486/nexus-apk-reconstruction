package org.bouncycastle.crypto.p016io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.Signer;

/* JADX INFO: loaded from: classes2.dex */
public class SignerOutputStream extends FilterOutputStream {
    protected Signer signer;

    /* JADX WARN: Invalid debug info offset */
    public SignerOutputStream(OutputStream outputStream, Signer signer) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Signer getSigner() {
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
