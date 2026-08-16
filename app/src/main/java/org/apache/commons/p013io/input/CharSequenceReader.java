package org.apache.commons.p013io.input;

import java.io.Reader;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class CharSequenceReader extends Reader implements Serializable {

    /* JADX INFO: renamed from: d */
    public static final long f15802d = 3724187752191401220L;

    /* JADX INFO: renamed from: a */
    public final CharSequence f15803a;

    /* JADX INFO: renamed from: b */
    public int f15804b;

    /* JADX INFO: renamed from: c */
    public int f15805c;

    /* JADX WARN: Invalid debug info offset */
    public CharSequenceReader(CharSequence charSequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Reader
    public void mark(int i) {
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Reader
    public int read() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Reader
    public void reset() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Reader
    public long skip(long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
