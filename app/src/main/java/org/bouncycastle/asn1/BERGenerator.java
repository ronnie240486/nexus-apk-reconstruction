package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class BERGenerator extends ASN1Generator {
    private boolean _isExplicit;
    private int _tagNo;
    private boolean _tagged;

    /* JADX WARN: Invalid debug info offset */
    public BERGenerator(OutputStream outputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BERGenerator(OutputStream outputStream, int i, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void writeHdr(int i) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Generator
    public OutputStream getRawOutputStream() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeBERBody(InputStream inputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeBEREnd() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeBERHeader(int i) throws IOException {
    }
}
