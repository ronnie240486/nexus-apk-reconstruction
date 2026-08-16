package org.apache.commons.p013io.input;

import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class SwappedDataInputStream extends ProxyInputStream implements DataInput {
    /* JADX WARN: Invalid debug info offset */
    public SwappedDataInputStream(InputStream inputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.DataInput
    public boolean readBoolean() throws IOException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.DataInput
    public byte readByte() throws IOException {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.DataInput
    public char readChar() throws IOException {
        return (char) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.DataInput
    public double readDouble() throws IOException {
        return 0.0d;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.DataInput
    public float readFloat() throws IOException {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.DataInput
    public int readInt() throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.DataInput
    public String readLine() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.DataInput
    public long readLong() throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.DataInput
    public short readShort() throws IOException {
        return (short) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.DataInput
    public String readUTF() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.DataInput
    public int readUnsignedByte() throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.DataInput
    public int readUnsignedShort() throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.DataInput
    public int skipBytes(int i) throws IOException {
        return 0;
    }
}
