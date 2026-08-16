package org.apache.commons.p013io.input;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class NullInputStream extends InputStream {

    /* JADX INFO: renamed from: a */
    public final long f15810a;

    /* JADX INFO: renamed from: b */
    public long f15811b;

    /* JADX INFO: renamed from: c */
    public long f15812c;

    /* JADX INFO: renamed from: d */
    public long f15813d;

    /* JADX INFO: renamed from: e */
    public boolean f15814e;

    /* JADX INFO: renamed from: f */
    public final boolean f15815f;

    /* JADX INFO: renamed from: g */
    public final boolean f15816g;

    /* JADX WARN: Invalid debug info offset */
    public NullInputStream(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public NullInputStream(long j, boolean z, boolean z2) {
    }

    /* JADX INFO: renamed from: P */
    public void m23266P(byte[] bArr, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public int available() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final int m23267j() throws EOFException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public long m23268k() {
        return 0L;
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
        Le:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.NullInputStream.mark(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public long m23269p() {
        return 0L;
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
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.InputStream
    public synchronized void reset() throws java.io.IOException {
        /*
            r8 = this;
            return
        L1f:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.NullInputStream.reset():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return 0L;
    }

    /* JADX INFO: renamed from: w */
    public int m23270w() {
        return 0;
    }
}
