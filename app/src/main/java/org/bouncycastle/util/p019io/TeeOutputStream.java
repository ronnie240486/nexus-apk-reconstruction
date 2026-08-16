package org.bouncycastle.util.p019io;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class TeeOutputStream extends OutputStream {
    private OutputStream output1;
    private OutputStream output2;

    /* JADX WARN: Invalid debug info offset */
    public TeeOutputStream(OutputStream outputStream, OutputStream outputStream2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
    }
}
