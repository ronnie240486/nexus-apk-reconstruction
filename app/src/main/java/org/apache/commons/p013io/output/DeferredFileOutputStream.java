package org.apache.commons.p013io.output;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class DeferredFileOutputStream extends ThresholdingOutputStream {

    /* JADX INFO: renamed from: d */
    public ByteArrayOutputStream f15935d;

    /* JADX INFO: renamed from: e */
    public OutputStream f15936e;

    /* JADX INFO: renamed from: f */
    public File f15937f;

    /* JADX INFO: renamed from: g */
    public final String f15938g;

    /* JADX INFO: renamed from: h */
    public final String f15939h;

    /* JADX INFO: renamed from: i */
    public final File f15940i;

    /* JADX INFO: renamed from: j */
    public boolean f15941j;

    /* JADX WARN: Invalid debug info offset */
    public DeferredFileOutputStream(int i, File file) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DeferredFileOutputStream(int i, File file, String str, String str2, File file2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DeferredFileOutputStream(int i, String str, String str2, File file) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0015
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.apache.commons.p013io.output.ThresholdingOutputStream
    /* JADX INFO: renamed from: V */
    public void mo23400V() throws java.io.IOException {
        /*
            r3 = this;
            return
        L20:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.output.DeferredFileOutputStream.mo23400V():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public byte[] m23401b0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.output.ThresholdingOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public File m23402g0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public boolean m23403k0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0017
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: l0 */
    public void m23404l0(java.io.OutputStream r3) throws java.io.IOException {
        /*
            r2 = this;
            return
        L1e:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.output.DeferredFileOutputStream.m23404l0(java.io.OutputStream):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.output.ThresholdingOutputStream
    /* JADX INFO: renamed from: p */
    public OutputStream mo23405p() throws IOException {
        return null;
    }
}
