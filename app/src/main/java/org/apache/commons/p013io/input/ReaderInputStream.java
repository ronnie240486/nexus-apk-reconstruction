package org.apache.commons.p013io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

/* JADX INFO: loaded from: classes2.dex */
public class ReaderInputStream extends InputStream {

    /* JADX INFO: renamed from: g */
    public static final int f15824g = 1024;

    /* JADX INFO: renamed from: a */
    public final Reader f15825a;

    /* JADX INFO: renamed from: b */
    public final CharsetEncoder f15826b;

    /* JADX INFO: renamed from: c */
    public final CharBuffer f15827c;

    /* JADX INFO: renamed from: d */
    public final ByteBuffer f15828d;

    /* JADX INFO: renamed from: e */
    public CoderResult f15829e;

    /* JADX INFO: renamed from: f */
    public boolean f15830f;

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public ReaderInputStream(Reader reader) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ReaderInputStream(Reader reader, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ReaderInputStream(Reader reader, String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ReaderInputStream(Reader reader, Charset charset) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ReaderInputStream(Reader reader, Charset charset, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ReaderInputStream(Reader reader, CharsetEncoder charsetEncoder) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ReaderInputStream(Reader reader, CharsetEncoder charsetEncoder, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final void m23281j() throws IOException {
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
