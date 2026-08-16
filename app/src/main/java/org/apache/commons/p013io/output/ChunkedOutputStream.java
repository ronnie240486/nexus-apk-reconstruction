package org.apache.commons.p013io.output;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ChunkedOutputStream extends FilterOutputStream {

    /* JADX INFO: renamed from: b */
    public static final int f15929b = 4096;

    /* JADX INFO: renamed from: a */
    public final int f15930a;

    /* JADX WARN: Invalid debug info offset */
    public ChunkedOutputStream(OutputStream outputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ChunkedOutputStream(OutputStream outputStream, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
    }
}
