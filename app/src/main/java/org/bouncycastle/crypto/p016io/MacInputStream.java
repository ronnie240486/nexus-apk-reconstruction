package org.bouncycastle.crypto.p016io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public class MacInputStream extends FilterInputStream {
    protected Mac mac;

    /* JADX WARN: Invalid debug info offset */
    public MacInputStream(InputStream inputStream, Mac mac) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Mac getMac() {
        return null;
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
}
