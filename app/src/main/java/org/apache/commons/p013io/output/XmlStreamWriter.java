package org.apache.commons.p013io.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.regex.Pattern;
import org.apache.commons.p013io.input.XmlStreamReader;

/* JADX INFO: loaded from: classes2.dex */
public class XmlStreamWriter extends Writer {

    /* JADX INFO: renamed from: f */
    public static final int f15962f = 4096;

    /* JADX INFO: renamed from: g */
    public static final Pattern f15963g = XmlStreamReader.f15885q;

    /* JADX INFO: renamed from: a */
    public final OutputStream f15964a;

    /* JADX INFO: renamed from: b */
    public final String f15965b;

    /* JADX INFO: renamed from: c */
    public StringWriter f15966c;

    /* JADX INFO: renamed from: d */
    public Writer f15967d;

    /* JADX INFO: renamed from: e */
    public String f15968e;

    /* JADX WARN: Invalid debug info offset */
    public XmlStreamWriter(File file) throws FileNotFoundException {
    }

    /* JADX WARN: Invalid debug info offset */
    public XmlStreamWriter(File file, String str) throws FileNotFoundException {
    }

    /* JADX WARN: Invalid debug info offset */
    public XmlStreamWriter(OutputStream outputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    public XmlStreamWriter(OutputStream outputStream, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final void m23428j(char[] cArr, int i, int i2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public String m23429k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public String m23430p() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
    }
}
