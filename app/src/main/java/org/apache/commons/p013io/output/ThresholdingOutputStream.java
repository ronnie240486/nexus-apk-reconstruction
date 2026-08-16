package org.apache.commons.p013io.output;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ThresholdingOutputStream extends OutputStream {

    /* JADX INFO: renamed from: a */
    public final int f15953a;

    /* JADX INFO: renamed from: b */
    public long f15954b;

    /* JADX INFO: renamed from: c */
    public boolean f15955c;

    /* JADX WARN: Invalid debug info offset */
    public ThresholdingOutputStream(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public boolean m23419P() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public void m23420R() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public void m23421S(long j) {
    }

    /* JADX INFO: renamed from: V */
    public abstract void mo23400V() throws IOException;

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public void m23422j(int i) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public long m23423k() {
        return 0L;
    }

    /* JADX INFO: renamed from: p */
    public abstract OutputStream mo23405p() throws IOException;

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public int m23424w() {
        return 0;
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
