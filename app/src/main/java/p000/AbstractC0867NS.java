package p000;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: NS */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0867NS extends InputStream {

    /* JADX INFO: renamed from: a */
    public RandomAccessFile f2246a;

    /* JADX INFO: renamed from: b */
    public File f2247b;

    /* JADX INFO: renamed from: c */
    public boolean f2248c;

    /* JADX INFO: renamed from: d */
    public int f2249d;

    /* JADX INFO: renamed from: e */
    public byte[] f2250e;

    /* JADX WARN: Invalid debug info offset */
    public AbstractC0867NS(File file, boolean z, int i) throws FileNotFoundException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX INFO: renamed from: j */
    public abstract File mo3989j(int i) throws IOException;

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public void m3990k(int i) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public void m3991p(C2992bj c2992bj) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public int read() throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return 0;
    }
}
