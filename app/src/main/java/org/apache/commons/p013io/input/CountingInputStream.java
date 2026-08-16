package org.apache.commons.p013io.input;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class CountingInputStream extends ProxyInputStream {

    /* JADX INFO: renamed from: a */
    public long f15808a;

    /* JADX WARN: Invalid debug info offset */
    public CountingInputStream(InputStream inputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public synchronized long m23262P() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public int m23263R() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.apache.commons.p013io.input.ProxyInputStream
    /* JADX INFO: renamed from: j */
    public synchronized void mo23250j(int r5) {
        /*
            r4 = this;
            return
        Lb:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.CountingInputStream.mo23250j(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public synchronized long m23264w() {
        return 0L;
    }
}
