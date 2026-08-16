package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
class TlsInputStream extends InputStream {
    private byte[] buf;
    private TlsProtocolHandler handler;

    /* JADX WARN: Invalid debug info offset */
    public TlsInputStream(TlsProtocolHandler tlsProtocolHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public int read() throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return 0;
    }
}
