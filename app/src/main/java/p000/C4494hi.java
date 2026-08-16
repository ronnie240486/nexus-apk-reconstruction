package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.dom4j.p020io.SAXEventRecorder;

/* JADX INFO: renamed from: hi */
/* JADX INFO: loaded from: classes.dex */
public class C4494hi extends FilterInputStream {

    /* JADX INFO: renamed from: c */
    public static final int f14398c = 2;

    /* JADX INFO: renamed from: d */
    public static final byte[] f14399d;

    /* JADX INFO: renamed from: e */
    public static final int f14400e;

    /* JADX INFO: renamed from: f */
    public static final int f14401f;

    /* JADX INFO: renamed from: a */
    public final byte f14402a;

    /* JADX INFO: renamed from: b */
    public int f14403b;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, SAXEventRecorder.SAXEvent.f16652u, 0, 2, 0, 0, 0, 1, 0};
        f14399d = bArr;
        int length = bArr.length;
        f14400e = length;
        f14401f = length + 2;
    }

    /* JADX WARN: Invalid debug info offset */
    public C4494hi(InputStream inputStream, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        return 0L;
    }
}
