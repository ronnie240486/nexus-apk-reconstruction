package org.apache.commons.p013io.input;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class BoundedInputStream extends InputStream {

    /* JADX INFO: renamed from: a */
    public final InputStream f15783a;

    /* JADX INFO: renamed from: b */
    public final long f15784b;

    /* JADX INFO: renamed from: c */
    public long f15785c;

    /* JADX INFO: renamed from: d */
    public long f15786d;

    /* JADX INFO: renamed from: e */
    public boolean f15787e;

    /* JADX WARN: Invalid debug info offset */
    public BoundedInputStream(InputStream inputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BoundedInputStream(InputStream inputStream, long j) {
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
    public boolean m23259j() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public void m23260k(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.InputStream
    public synchronized void mark(int r3) {
        /*
            r2 = this;
            return
        Lc:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.BoundedInputStream.mark(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
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
            r2 = this;
            return
        Lc:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.BoundedInputStream.reset():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
