package org.apache.commons.p013io.output;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class TeeOutputStream extends ProxyOutputStream {

    /* JADX INFO: renamed from: a */
    public OutputStream f15952a;

    /* JADX WARN: Invalid debug info offset */
    public TeeOutputStream(OutputStream outputStream, OutputStream outputStream2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.output.ProxyOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.output.ProxyOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.apache.commons.p013io.output.ProxyOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(int r2) throws java.io.IOException {
        /*
            r1 = this;
            return
        Lb:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.output.TeeOutputStream.write(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.apache.commons.p013io.output.ProxyOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] r2) throws java.io.IOException {
        /*
            r1 = this;
            return
        Lb:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.output.TeeOutputStream.write(byte[]):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.apache.commons.p013io.output.ProxyOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] r2, int r3, int r4) throws java.io.IOException {
        /*
            r1 = this;
            return
        Lb:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.output.TeeOutputStream.write(byte[], int, int):void");
    }
}
