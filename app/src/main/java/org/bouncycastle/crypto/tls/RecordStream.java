package org.bouncycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
class RecordStream {
    private ByteArrayOutputStream buffer;
    private TlsProtocolHandler handler;
    private CombinedHash hash;

    /* JADX INFO: renamed from: is */
    private InputStream f16355is;

    /* JADX INFO: renamed from: os */
    private OutputStream f16356os;
    private TlsCipher readCipher;
    private TlsCompression readCompression;
    private TlsCipher writeCipher;
    private TlsCompression writeCompression;

    /* JADX WARN: Invalid debug info offset */
    public RecordStream(TlsProtocolHandler tlsProtocolHandler, InputStream inputStream, OutputStream outputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static byte[] doFinal(CombinedHash combinedHash) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] getBufferContents() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void clientCipherSpecDecided(TlsCompression tlsCompression, TlsCipher tlsCipher) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] decodeAndVerify(short s2, InputStream inputStream, int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void flush() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getCurrentHash() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void readData() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void serverClientSpecReceived() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void updateHandshakeData(byte[] bArr, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeMessage(short s2, byte[] bArr, int i, int i2) throws IOException {
    }
}
