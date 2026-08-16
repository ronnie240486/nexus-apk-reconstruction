package p000;

import java.io.IOException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: es */
/* JADX INFO: loaded from: classes2.dex */
public final class C4314es implements InterfaceC5858zS {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1166S7 f13804a;

    /* JADX INFO: renamed from: b */
    public final Inflater f13805b;

    /* JADX INFO: renamed from: c */
    public int f13806c;

    /* JADX INFO: renamed from: d */
    public boolean f13807d;

    /* JADX WARN: Invalid debug info offset */
    public C4314es(InterfaceC1166S7 interfaceC1166S7, Inflater inflater) {
    }

    /* JADX WARN: Invalid debug info offset */
    public C4314es(InterfaceC5858zS interfaceC5858zS, Inflater inflater) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC5858zS, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final boolean m20160j() throws IOException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final void m20161k() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0014
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // p000.InterfaceC5858zS
    public long read(p000.C0910O7 r7, long r8) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            return r0
        L3a:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4314es.read(O7, long):long");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC5858zS
    public C5660wW timeout() {
        return null;
    }
}
