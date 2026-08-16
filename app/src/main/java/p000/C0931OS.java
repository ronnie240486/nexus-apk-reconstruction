package p000;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: OS */
/* JADX INFO: loaded from: classes2.dex */
public class C0931OS extends OutputStream implements InterfaceC1113RH {

    /* JADX INFO: renamed from: a */
    public RandomAccessFile f2384a;

    /* JADX INFO: renamed from: b */
    public long f2385b;

    /* JADX INFO: renamed from: c */
    public File f2386c;

    /* JADX INFO: renamed from: d */
    public int f2387d;

    /* JADX INFO: renamed from: e */
    public long f2388e;

    /* JADX INFO: renamed from: f */
    public C5782yM f2389f;

    /* JADX WARN: Invalid debug info offset */
    public C0931OS(File file) throws FileNotFoundException, C5953e60 {
    }

    /* JADX WARN: Invalid debug info offset */
    public C0931OS(File file, long j) throws FileNotFoundException, C5953e60 {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public final boolean m4289P(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public final boolean m4290R(byte[] bArr) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public boolean m4291S() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public void m4292V(long j) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public int m4293b0(int i) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public final void m4294g0() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1113RH
    /* JADX INFO: renamed from: j */
    public int mo1024j() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1113RH
    /* JADX INFO: renamed from: k */
    public long mo1025k() throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: p */
    public boolean m4295p(int r3) throws p000.C5953e60 {
        /*
            r2 = this;
            r0 = 0
            return r0
        L11:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0931OS.m4295p(int):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public long m4296w() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
    }
}
