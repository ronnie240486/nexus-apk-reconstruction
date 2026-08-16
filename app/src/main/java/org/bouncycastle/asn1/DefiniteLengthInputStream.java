package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
class DefiniteLengthInputStream extends LimitedInputStream {
    private static final byte[] EMPTY_BYTES = new byte[0];
    private final int _originalLength;
    private int _remaining;

    /* JADX WARN: Invalid debug info offset */
    public DefiniteLengthInputStream(InputStream inputStream, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.LimitedInputStream
    public int getRemaining() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public int read() throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] toByteArray() throws IOException {
        return null;
    }
}
