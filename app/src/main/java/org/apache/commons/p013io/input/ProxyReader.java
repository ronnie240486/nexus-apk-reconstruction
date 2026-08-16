package org.apache.commons.p013io.input;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ProxyReader extends FilterReader {
    /* JADX WARN: Invalid debug info offset */
    public ProxyReader(Reader reader) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX INFO: renamed from: j */
    public void m23278j(int i) throws IOException {
    }

    /* JADX INFO: renamed from: k */
    public void m23279k(int i) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.FilterReader, java.io.Reader
    public synchronized void mark(int r2) throws java.io.IOException {
        /*
            r1 = this;
            return
        L7:
        L9:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.ProxyReader.mark(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterReader, java.io.Reader
    public boolean markSupported() {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public void m23280p(IOException iOException) throws IOException {
        throw iOException;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws java.io.IOException {
        /*
            r3 = this;
            r0 = 0
            return r0
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.ProxyReader.read():int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.Reader, java.lang.Readable
    public int read(java.nio.CharBuffer r2) throws java.io.IOException {
        /*
            r1 = this;
            r0 = 0
            return r0
        L7:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.ProxyReader.read(java.nio.CharBuffer):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.Reader
    public int read(char[] r2) throws java.io.IOException {
        /*
            r1 = this;
            r0 = 0
            return r0
        L4:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.ProxyReader.read(char[]):int");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterReader, java.io.Reader
    public boolean ready() throws IOException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.FilterReader, java.io.Reader
    public synchronized void reset() throws java.io.IOException {
        /*
            r1 = this;
            return
        L7:
        L9:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.ProxyReader.reset():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterReader, java.io.Reader
    public long skip(long j) throws IOException {
        return 0L;
    }
}
