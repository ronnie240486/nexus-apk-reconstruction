package org.apache.commons.p013io.input;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public class ReversedLinesFileReader implements Closeable {

    /* JADX INFO: renamed from: a */
    public final int f15831a;

    /* JADX INFO: renamed from: b */
    public final Charset f15832b;

    /* JADX INFO: renamed from: c */
    public final RandomAccessFile f15833c;

    /* JADX INFO: renamed from: d */
    public final long f15834d;

    /* JADX INFO: renamed from: e */
    public final long f15835e;

    /* JADX INFO: renamed from: f */
    public final byte[][] f15836f;

    /* JADX INFO: renamed from: g */
    public final int f15837g;

    /* JADX INFO: renamed from: h */
    public final int f15838h;

    /* JADX INFO: renamed from: i */
    public FilePart f15839i;

    /* JADX INFO: renamed from: j */
    public boolean f15840j;

    public class FilePart {

        /* JADX INFO: renamed from: a */
        public final long f15841a;

        /* JADX INFO: renamed from: b */
        public final byte[] f15842b;

        /* JADX INFO: renamed from: c */
        public byte[] f15843c;

        /* JADX INFO: renamed from: d */
        public int f15844d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ReversedLinesFileReader f15845e;

        /* JADX WARN: Invalid debug info offset */
        public FilePart(ReversedLinesFileReader reversedLinesFileReader, long j, int i, byte[] bArr) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ FilePart(ReversedLinesFileReader reversedLinesFileReader, long j, int i, byte[] bArr, C49661 c49661) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ String m23289a(FilePart filePart) throws IOException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ FilePart m23290b(FilePart filePart) throws IOException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public final void m23291c() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public final int m23292d(byte[] bArr, int i) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public final String m23293e() throws IOException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public final FilePart m23294f() throws IOException {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public ReversedLinesFileReader(File file) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public ReversedLinesFileReader(File file, int i, String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public ReversedLinesFileReader(File file, int i, Charset charset) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public ReversedLinesFileReader(File file, Charset charset) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public static /* synthetic */ int m23282P(ReversedLinesFileReader reversedLinesFileReader) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public static /* synthetic */ byte[][] m23283R(ReversedLinesFileReader reversedLinesFileReader) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m23284j(ReversedLinesFileReader reversedLinesFileReader) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ RandomAccessFile m23285k(ReversedLinesFileReader reversedLinesFileReader) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Charset m23286p(ReversedLinesFileReader reversedLinesFileReader) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ int m23287w(ReversedLinesFileReader reversedLinesFileReader) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public String m23288S() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
