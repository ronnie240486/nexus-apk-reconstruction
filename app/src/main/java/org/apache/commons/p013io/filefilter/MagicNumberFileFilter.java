package org.apache.commons.p013io.filefilter;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class MagicNumberFileFilter extends AbstractFileFilter implements Serializable {

    /* JADX INFO: renamed from: c */
    public static final long f15745c = -547733176983104172L;

    /* JADX INFO: renamed from: a */
    public final byte[] f15746a;

    /* JADX INFO: renamed from: b */
    public final long f15747b;

    /* JADX WARN: Invalid debug info offset */
    public MagicNumberFileFilter(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public MagicNumberFileFilter(String str, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public MagicNumberFileFilter(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public MagicNumberFileFilter(byte[] bArr, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0010
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.apache.commons.p013io.filefilter.AbstractFileFilter, org.apache.commons.p013io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(java.io.File r7) {
        /*
            r6 = this;
            r0 = 0
            return r0
        L36:
        L39:
        L3b:
        L40:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.filefilter.MagicNumberFileFilter.accept(java.io.File):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.filefilter.AbstractFileFilter
    public String toString() {
        return null;
    }
}
