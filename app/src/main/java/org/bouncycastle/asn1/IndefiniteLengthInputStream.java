package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
class IndefiniteLengthInputStream extends LimitedInputStream {
    private int _b1;
    private int _b2;
    private boolean _eofOn00;
    private boolean _eofReached;

    /* JADX WARN: Invalid debug info offset */
    public IndefiniteLengthInputStream(InputStream inputStream, int i) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean checkForEof() {
        return false;
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
    public void setEofOn00(boolean z) {
    }
}
