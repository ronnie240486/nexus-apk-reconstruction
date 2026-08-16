package org.apache.commons.p013io.output;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: loaded from: classes2.dex */
public class FileWriterWithEncoding extends Writer {

    /* JADX INFO: renamed from: a */
    public final Writer f15943a;

    /* JADX WARN: Invalid debug info offset */
    public FileWriterWithEncoding(File file, String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public FileWriterWithEncoding(File file, String str, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public FileWriterWithEncoding(File file, Charset charset) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public FileWriterWithEncoding(File file, Charset charset, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public FileWriterWithEncoding(File file, CharsetEncoder charsetEncoder) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public FileWriterWithEncoding(File file, CharsetEncoder charsetEncoder, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public FileWriterWithEncoding(String str, String str2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public FileWriterWithEncoding(String str, String str2, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public FileWriterWithEncoding(String str, Charset charset) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public FileWriterWithEncoding(String str, Charset charset, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public FileWriterWithEncoding(String str, CharsetEncoder charsetEncoder) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public FileWriterWithEncoding(String str, CharsetEncoder charsetEncoder, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: j */
    public static java.io.Writer m23407j(java.io.File r3, java.lang.Object r4, boolean r5) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        L1a:
        L1c:
        L32:
        L35:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.output.FileWriterWithEncoding.m23407j(java.io.File, java.lang.Object, boolean):java.io.Writer");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer
    public void write(int i) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer
    public void write(String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
    }
}
