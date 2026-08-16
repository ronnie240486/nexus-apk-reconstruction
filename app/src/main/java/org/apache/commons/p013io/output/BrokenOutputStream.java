package org.apache.commons.p013io.output;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class BrokenOutputStream extends OutputStream {

    /* JADX INFO: renamed from: a */
    public final IOException f15921a;

    /* JADX WARN: Invalid debug info offset */
    public BrokenOutputStream() {
    }

    /* JADX WARN: Invalid debug info offset */
    public BrokenOutputStream(IOException iOException) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
    }
}
