package org.apache.commons.p013io.output;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class CountingOutputStream extends ProxyOutputStream {

    /* JADX INFO: renamed from: a */
    public long f15934a;

    /* JADX WARN: Invalid debug info offset */
    public CountingOutputStream(OutputStream outputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public synchronized long m23396P() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public int m23397R() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.apache.commons.p013io.output.ProxyOutputStream
    /* JADX INFO: renamed from: k */
    public synchronized void mo23398k(int r5) {
        /*
            r4 = this;
            return
        L9:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.output.CountingOutputStream.mo23398k(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public synchronized long m23399w() {
        return 0L;
    }
}
