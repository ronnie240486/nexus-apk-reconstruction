package org.apache.commons.p013io.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ProxyInputStream extends FilterInputStream {
    /* JADX WARN: Invalid debug info offset */
    public ProxyInputStream(InputStream inputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX INFO: renamed from: j */
    public void mo23250j(int i) throws IOException {
    }

    /* JADX INFO: renamed from: k */
    public void m23276k(int i) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int r2) {
        /*
            r1 = this;
            return
        L8:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.ProxyInputStream.mark(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public void mo23277p(IOException iOException) throws IOException {
        throw iOException;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        /*
            r3 = this;
            r0 = 0
            return r0
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.ProxyInputStream.read():int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r2) throws java.io.IOException {
        /*
            r1 = this;
            r0 = 0
            return r0
        L4:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.ProxyInputStream.read(byte[]):int");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws java.io.IOException {
        /*
            r1 = this;
            return
        L7:
        L9:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.ProxyInputStream.reset():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        return 0L;
    }
}
