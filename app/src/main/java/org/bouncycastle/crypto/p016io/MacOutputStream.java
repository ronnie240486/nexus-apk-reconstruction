package org.bouncycastle.crypto.p016io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public class MacOutputStream extends FilterOutputStream {
    protected Mac mac;

    /* JADX WARN: Invalid debug info offset */
    public MacOutputStream(OutputStream outputStream, Mac mac) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Mac getMac() {
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
