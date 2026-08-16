package org.apache.commons.p013io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* JADX INFO: loaded from: classes2.dex */
public class WriterOutputStream extends OutputStream {

    /* JADX INFO: renamed from: f */
    public static final int f15956f = 1024;

    /* JADX INFO: renamed from: a */
    public final Writer f15957a;

    /* JADX INFO: renamed from: b */
    public final CharsetDecoder f15958b;

    /* JADX INFO: renamed from: c */
    public final boolean f15959c;

    /* JADX INFO: renamed from: d */
    public final ByteBuffer f15960d;

    /* JADX INFO: renamed from: e */
    public final CharBuffer f15961e;

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public WriterOutputStream(Writer writer) {
    }

    /* JADX WARN: Invalid debug info offset */
    public WriterOutputStream(Writer writer, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public WriterOutputStream(Writer writer, String str, int i, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public WriterOutputStream(Writer writer, Charset charset) {
    }

    /* JADX WARN: Invalid debug info offset */
    public WriterOutputStream(Writer writer, Charset charset, int i, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public WriterOutputStream(Writer writer, CharsetDecoder charsetDecoder) {
    }

    /* JADX WARN: Invalid debug info offset */
    public WriterOutputStream(Writer writer, CharsetDecoder charsetDecoder, int i, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0038
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: j */
    public static void m23425j(java.nio.charset.Charset r9) {
        /*
            return
        L41:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.output.WriterOutputStream.m23425j(java.nio.charset.Charset):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final void m23426k() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public final void m23427p(boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
    }
}
