package p000;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* JADX INFO: renamed from: mS */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4803mS extends Closeable, Flushable {
    /* JADX INFO: renamed from: X */
    void mo943X(C0910O7 c0910o7, long j) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    void close() throws IOException;

    void flush() throws IOException;

    C5660wW timeout();
}
