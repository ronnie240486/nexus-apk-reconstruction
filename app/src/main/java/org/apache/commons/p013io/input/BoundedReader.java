package org.apache.commons.p013io.input;

import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes2.dex */
public class BoundedReader extends Reader {

    /* JADX INFO: renamed from: f */
    public static final int f15788f = -1;

    /* JADX INFO: renamed from: a */
    public final Reader f15789a;

    /* JADX INFO: renamed from: b */
    public int f15790b;

    /* JADX INFO: renamed from: c */
    public int f15791c;

    /* JADX INFO: renamed from: d */
    public int f15792d;

    /* JADX INFO: renamed from: e */
    public final int f15793e;

    /* JADX WARN: Invalid debug info offset */
    public BoundedReader(Reader reader, int i) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Reader
    public void mark(int i) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Reader
    public int read() throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Reader
    public void reset() throws IOException {
    }
}
