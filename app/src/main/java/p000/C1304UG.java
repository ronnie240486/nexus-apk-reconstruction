package p000;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: UG */
/* JADX INFO: loaded from: classes2.dex */
public class C1304UG extends RandomAccessFile {

    /* JADX INFO: renamed from: a */
    public long f3433a;

    /* JADX INFO: renamed from: b */
    public File[] f3434b;

    /* JADX INFO: renamed from: c */
    public RandomAccessFile f3435c;

    /* JADX INFO: renamed from: d */
    public byte[] f3436d;

    /* JADX INFO: renamed from: e */
    public int f3437e;

    /* JADX INFO: renamed from: f */
    public String f3438f;

    /* JADX WARN: Invalid debug info offset */
    public C1304UG(File file, String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public C1304UG(File file, String str, File[] fileArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public C1304UG(String str, String str2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.RandomAccessFile
    public long getFilePointer() throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: j */
    public final void m6200j(java.io.File[] r6) throws java.io.IOException {
        /*
            r5 = this;
            return
        L32:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1304UG.m6200j(java.io.File[]):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public void m6201k() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.RandomAccessFile
    public long length() throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public final void m6202p(int i) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.RandomAccessFile
    public int read() throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.RandomAccessFile
    public int read(byte[] bArr) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.RandomAccessFile
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.RandomAccessFile
    public void seek(long j) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public void m6203w(long j) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public void write(int i) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public void write(byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public void write(byte[] bArr, int i, int i2) throws IOException {
    }
}
