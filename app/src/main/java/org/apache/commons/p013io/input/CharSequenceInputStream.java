package org.apache.commons.p013io.input;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: loaded from: classes2.dex */
public class CharSequenceInputStream extends InputStream {

    /* JADX INFO: renamed from: f */
    public static final int f15795f = 2048;

    /* JADX INFO: renamed from: g */
    public static final int f15796g = -1;

    /* JADX INFO: renamed from: a */
    public final CharsetEncoder f15797a;

    /* JADX INFO: renamed from: b */
    public final CharBuffer f15798b;

    /* JADX INFO: renamed from: c */
    public final ByteBuffer f15799c;

    /* JADX INFO: renamed from: d */
    public int f15800d;

    /* JADX INFO: renamed from: e */
    public int f15801e;

    /* JADX WARN: Invalid debug info offset */
    public CharSequenceInputStream(CharSequence charSequence, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CharSequenceInputStream(CharSequence charSequence, String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CharSequenceInputStream(CharSequence charSequence, Charset charset) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CharSequenceInputStream(CharSequence charSequence, Charset charset, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public int available() throws IOException {
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final void m23261j() throws CharacterCodingException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.InputStream
    public synchronized void mark(int r1) {
        /*
            r0 = this;
            return
        L1d:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.CharSequenceInputStream.mark(int):void");
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
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
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.InputStream
    public synchronized void reset() throws java.io.IOException {
        /*
            r4 = this;
            return
        L3b:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.CharSequenceInputStream.reset():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return 0L;
    }
}
