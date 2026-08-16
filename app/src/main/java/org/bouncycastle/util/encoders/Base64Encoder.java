package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class Base64Encoder implements Encoder {
    protected final byte[] decodingTable;
    protected final byte[] encodingTable;
    protected byte padding;

    /* JADX WARN: Invalid debug info offset */
    private int decodeLastBlock(OutputStream outputStream, char c, char c2, char c3, char c4) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean ignore(char c) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private int nextI(String str, int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int nextI(byte[] bArr, int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.util.encoders.Encoder
    public int encode(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void initialiseDecodingTable() {
    }
}
