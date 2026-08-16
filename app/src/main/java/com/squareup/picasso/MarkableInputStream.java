package com.squareup.picasso;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
final class MarkableInputStream extends InputStream {

    /* JADX INFO: renamed from: f */
    public static final int f12450f = 4096;

    /* JADX INFO: renamed from: a */
    public final InputStream f12451a;

    /* JADX INFO: renamed from: b */
    public long f12452b;

    /* JADX INFO: renamed from: c */
    public long f12453c;

    /* JADX INFO: renamed from: d */
    public long f12454d;

    /* JADX INFO: renamed from: e */
    public long f12455e;

    /* JADX WARN: Invalid debug info offset */
    public MarkableInputStream(InputStream inputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    public MarkableInputStream(InputStream inputStream, int i) {
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
    /* JADX INFO: renamed from: j */
    public void m18654j(long j) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public long m18655k(int i) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public void mark(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public final void m18656p(long j) {
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
    public void reset() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public final void m18657w(long j, long j2) throws IOException {
    }
}
