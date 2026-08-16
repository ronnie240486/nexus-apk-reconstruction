package org.apache.commons.p013io.output;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public class ChunkedWriter extends FilterWriter {

    /* JADX INFO: renamed from: b */
    public static final int f15931b = 4096;

    /* JADX INFO: renamed from: a */
    public final int f15932a;

    /* JADX WARN: Invalid debug info offset */
    public ChunkedWriter(Writer writer) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ChunkedWriter(Writer writer, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
    }
}
