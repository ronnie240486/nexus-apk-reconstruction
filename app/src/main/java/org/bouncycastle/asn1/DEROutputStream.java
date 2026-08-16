package org.bouncycastle.asn1;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class DEROutputStream extends FilterOutputStream implements DERTags {
    /* JADX WARN: Invalid debug info offset */
    public DEROutputStream(OutputStream outputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void writeLength(int i) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeEncoded(int i, int i2, byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeEncoded(int i, byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeNull() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeObject(Object obj) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeTag(int i, int i2) throws IOException {
    }
}
