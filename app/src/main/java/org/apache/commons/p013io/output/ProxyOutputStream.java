package org.apache.commons.p013io.output;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ProxyOutputStream extends FilterOutputStream {
    /* JADX WARN: Invalid debug info offset */
    public ProxyOutputStream(OutputStream outputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
    }

    /* JADX INFO: renamed from: j */
    public void m23411j(int i) throws IOException {
    }

    /* JADX INFO: renamed from: k */
    public void mo23398k(int i) throws IOException {
    }

    /* JADX INFO: renamed from: p */
    public void mo23412p(IOException iOException) throws IOException {
        throw iOException;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r3) throws java.io.IOException {
        /*
            r2 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.output.ProxyOutputStream.write(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r3) throws java.io.IOException {
        /*
            r2 = this;
            return
        L4:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.output.ProxyOutputStream.write(byte[]):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
    }
}
