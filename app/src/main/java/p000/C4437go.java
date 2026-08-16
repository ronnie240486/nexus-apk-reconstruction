package p000;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: renamed from: go */
/* JADX INFO: loaded from: classes2.dex */
public final class C4437go implements InterfaceC4803mS {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1103R7 f14214a;

    /* JADX INFO: renamed from: b */
    public final Deflater f14215b;

    /* JADX INFO: renamed from: c */
    public final C0497He f14216c;

    /* JADX INFO: renamed from: d */
    public boolean f14217d;

    /* JADX INFO: renamed from: e */
    public final CRC32 f14218e;

    /* JADX WARN: Invalid debug info offset */
    public C4437go(InterfaceC4803mS interfaceC4803mS) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4803mS
    /* JADX INFO: renamed from: X */
    public void mo943X(C0910O7 c0910o7, long j) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // p000.InterfaceC4803mS, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws java.io.IOException {
        /*
            r2 = this;
            return
        Lf:
        L16:
        L20:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4437go.close():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4803mS, java.io.Flushable
    public void flush() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final Deflater m20867j() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final void m20868k(C0910O7 c0910o7, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public final void m20869p() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4803mS
    public C5660wW timeout() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public final void m20870w() {
    }
}
