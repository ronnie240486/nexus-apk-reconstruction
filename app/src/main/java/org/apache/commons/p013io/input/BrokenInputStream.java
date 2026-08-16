package org.apache.commons.p013io.input;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class BrokenInputStream extends InputStream {

    /* JADX INFO: renamed from: a */
    public final IOException f15794a;

    /* JADX WARN: Invalid debug info offset */
    public BrokenInputStream() {
    }

    /* JADX WARN: Invalid debug info offset */
    public BrokenInputStream(IOException iOException) {
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
    @Override // java.io.InputStream
    public int read() throws IOException {
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
            r1 = this;
            return
        L4:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.BrokenInputStream.reset():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return 0L;
    }
}
