package p000;

import java.io.IOException;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: He */
/* JADX INFO: loaded from: classes2.dex */
public final class C0497He implements InterfaceC4803mS {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1103R7 f1106a;

    /* JADX INFO: renamed from: b */
    public final Deflater f1107b;

    /* JADX INFO: renamed from: c */
    public boolean f1108c;

    /* JADX WARN: Invalid debug info offset */
    public C0497He(InterfaceC1103R7 interfaceC1103R7, Deflater deflater) {
    }

    /* JADX WARN: Invalid debug info offset */
    public C0497He(InterfaceC4803mS interfaceC4803mS, Deflater deflater) {
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
        La:
        L11:
        L1b:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0497He.close():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4803mS, java.io.Flushable
    public void flush() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @IgnoreJRERequirement
    /* JADX INFO: renamed from: j */
    public final void m2384j(boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public void m2385k() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4803mS
    public C5660wW timeout() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
