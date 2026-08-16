package org.apache.commons.p013io.input;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class AutoCloseInputStream extends ProxyInputStream {
    /* JADX WARN: Invalid debug info offset */
    public AutoCloseInputStream(InputStream inputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void finalize() throws Throwable {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.input.ProxyInputStream
    /* JADX INFO: renamed from: j */
    public void mo23250j(int i) throws IOException {
    }
}
