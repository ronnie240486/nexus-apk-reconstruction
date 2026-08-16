package p000;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: zS */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5858zS extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    void close() throws IOException;

    long read(C0910O7 c0910o7, long j) throws IOException;

    C5660wW timeout();
}
