package org.apache.commons.p013io.output;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public class NullWriter extends Writer {

    /* JADX INFO: renamed from: a */
    public static final NullWriter f15948a = new NullWriter();

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) {
        return this;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(char c) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        return null;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    @Override // java.io.Writer
    public void write(int i) {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) {
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
    }
}
