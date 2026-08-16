package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: NM */
/* JADX INFO: loaded from: classes.dex */
public class C0861NM extends FilterInputStream {

    /* JADX INFO: renamed from: f */
    public static final String f2233f = "BufferedIs";

    /* JADX INFO: renamed from: a */
    public volatile byte[] f2234a;

    /* JADX INFO: renamed from: b */
    public int f2235b;

    /* JADX INFO: renamed from: c */
    public int f2236c;

    /* JADX INFO: renamed from: d */
    public int f2237d;

    /* JADX INFO: renamed from: e */
    public int f2238e;

    /* JADX INFO: renamed from: NM$a */
    public static class a extends RuntimeException {

        /* JADX INFO: renamed from: a */
        public static final long f2239a = -4338378848813561757L;

        /* JADX WARN: Invalid debug info offset */
        public a(String str) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C0861NM(InputStream inputStream, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static IOException m3975p() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final int m3976j(InputStream inputStream, byte[] bArr) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: k */
    public synchronized void m3977k() {
        /*
            r1 = this;
            return
        L8:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0861NM.m3977k():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int r2) {
        /*
            r1 = this;
            return
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0861NM.mark(int):void");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws java.io.IOException {
        /*
            r2 = this;
            return
        Le:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0861NM.reset():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        return 0L;
    }
}
