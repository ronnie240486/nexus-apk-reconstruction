package org.bouncycastle.util.p019io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class TeeInputStream extends InputStream {
    private final InputStream input;
    private final OutputStream output;

    /* JADX WARN: Invalid debug info offset */
    public TeeInputStream(InputStream inputStream, OutputStream outputStream) {
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
    public int read(byte[] bArr) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return 0;
    }
}
