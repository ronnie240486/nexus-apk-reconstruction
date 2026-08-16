package org.apache.commons.p013io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class TeeInputStream extends ProxyInputStream {

    /* JADX INFO: renamed from: a */
    public final OutputStream f15859a;

    /* JADX INFO: renamed from: b */
    public final boolean f15860b;

    /* JADX WARN: Invalid debug info offset */
    public TeeInputStream(InputStream inputStream, OutputStream outputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    public TeeInputStream(InputStream inputStream, OutputStream outputStream, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return 0;
    }
}
