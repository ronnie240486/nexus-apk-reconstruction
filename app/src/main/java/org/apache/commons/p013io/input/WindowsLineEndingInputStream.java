package org.apache.commons.p013io.input;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class WindowsLineEndingInputStream extends InputStream {

    /* JADX INFO: renamed from: a */
    public boolean f15866a;

    /* JADX INFO: renamed from: b */
    public boolean f15867b;

    /* JADX INFO: renamed from: c */
    public boolean f15868c;

    /* JADX INFO: renamed from: d */
    public boolean f15869d;

    /* JADX INFO: renamed from: e */
    public final InputStream f15870e;

    /* JADX INFO: renamed from: f */
    public final boolean f15871f;

    /* JADX WARN: Invalid debug info offset */
    public WindowsLineEndingInputStream(InputStream inputStream, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final int m23318j() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final int m23319k() throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.InputStream
    public synchronized void mark(int r2) {
        /*
            r1 = this;
            return
        L9:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.WindowsLineEndingInputStream.mark(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public int read() throws IOException {
        return 0;
    }
}
