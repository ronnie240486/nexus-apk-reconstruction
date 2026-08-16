package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
class TlsOutputStream extends OutputStream {
    private byte[] buf;
    private TlsProtocolHandler handler;

    /* JADX WARN: Invalid debug info offset */
    public TlsOutputStream(TlsProtocolHandler tlsProtocolHandler) {
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
    public void write(byte[] bArr, int i, int i2) throws IOException {
    }
}
