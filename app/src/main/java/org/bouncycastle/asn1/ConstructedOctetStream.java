package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
class ConstructedOctetStream extends InputStream {
    private InputStream _currentStream;
    private boolean _first;
    private final ASN1StreamParser _parser;

    /* JADX WARN: Invalid debug info offset */
    public ConstructedOctetStream(ASN1StreamParser aSN1StreamParser) {
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
}
