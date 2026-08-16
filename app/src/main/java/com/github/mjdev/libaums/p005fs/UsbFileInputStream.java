package com.github.mjdev.libaums.p005fs;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class UsbFileInputStream extends InputStream {
    private static final String TAG = "UsbFileInputStream";
    private long currentByteOffset;
    private UsbFile file;

    /* JADX WARN: Invalid debug info offset */
    public UsbFileInputStream(UsbFile usbFile) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public int available() throws IOException {
        return 0;
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

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return 0L;
    }
}
