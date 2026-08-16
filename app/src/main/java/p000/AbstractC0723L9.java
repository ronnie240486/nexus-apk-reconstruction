package p000;

import java.io.IOException;
import java.io.OutputStream;
import p000.InterfaceC0046Ah;

/* JADX INFO: renamed from: L9 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0723L9<T extends InterfaceC0046Ah> extends OutputStream {

    /* JADX INFO: renamed from: a */
    public C5946d60 f1747a;

    /* JADX INFO: renamed from: b */
    public T f1748b;

    /* JADX WARN: Invalid debug info offset */
    public AbstractC0723L9(C5946d60 c5946d60, C5997k60 c5997k60, char[] cArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public void m3423P(byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public void mo3424j() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public T m3425k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public long m3426p() {
        return 0L;
    }

    /* JADX INFO: renamed from: w */
    public abstract T mo3427w(OutputStream outputStream, C5997k60 c5997k60, char[] cArr) throws IOException;

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
