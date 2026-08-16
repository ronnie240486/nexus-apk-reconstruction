package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DERGenerator extends ASN1Generator {
    private boolean _isExplicit;
    private int _tagNo;
    private boolean _tagged;

    /* JADX WARN: Invalid debug info offset */
    public DERGenerator(OutputStream outputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DERGenerator(OutputStream outputStream, int i, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void writeLength(OutputStream outputStream, int i) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeDEREncoded(int i, byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeDEREncoded(OutputStream outputStream, int i, InputStream inputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeDEREncoded(OutputStream outputStream, int i, byte[] bArr) throws IOException {
    }
}
