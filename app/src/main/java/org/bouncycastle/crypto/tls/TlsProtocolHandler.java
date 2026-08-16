package org.bouncycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes2.dex */
public class TlsProtocolHandler {
    private static final short CS_CERTIFICATE_REQUEST_RECEIVED = 5;
    private static final short CS_CERTIFICATE_VERIFY_SEND = 8;
    private static final short CS_CLIENT_CHANGE_CIPHER_SPEC_SEND = 9;
    private static final short CS_CLIENT_FINISHED_SEND = 10;
    private static final short CS_CLIENT_HELLO_SEND = 1;
    private static final short CS_CLIENT_KEY_EXCHANGE_SEND = 7;
    private static final short CS_DONE = 12;
    private static final short CS_SERVER_CERTIFICATE_RECEIVED = 3;
    private static final short CS_SERVER_CHANGE_CIPHER_SPEC_RECEIVED = 11;
    private static final short CS_SERVER_HELLO_DONE_RECEIVED = 6;
    private static final short CS_SERVER_HELLO_RECEIVED = 2;
    private static final short CS_SERVER_KEY_EXCHANGE_RECEIVED = 4;
    private static final String TLS_ERROR_MESSAGE = "Internal TLS error, this could be an attack";
    private ByteQueue alertQueue;
    private boolean appDataReady;
    private ByteQueue applicationDataQueue;
    private TlsAuthentication authentication;
    private CertificateRequest certificateRequest;
    private ByteQueue changeCipherSpecQueue;
    private Hashtable clientExtensions;
    private boolean closed;
    private short connection_state;
    private boolean failedWithError;
    private ByteQueue handshakeQueue;
    private TlsKeyExchange keyExchange;
    private int[] offeredCipherSuites;
    private short[] offeredCompressionMethods;
    private SecureRandom random;

    /* JADX INFO: renamed from: rs */
    private RecordStream f16357rs;
    private SecurityParameters securityParameters;
    private TlsClient tlsClient;
    private TlsClientContextImpl tlsClientContext;
    private TlsInputStream tlsInputStream;
    private TlsOutputStream tlsOutputStream;
    private static final Integer EXT_RenegotiationInfo = new Integer(65281);
    private static final byte[] emptybuf = new byte[0];

    /* JADX WARN: Invalid debug info offset */
    public TlsProtocolHandler(InputStream inputStream, OutputStream outputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    public TlsProtocolHandler(InputStream inputStream, OutputStream outputStream, SecureRandom secureRandom) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static boolean arrayContains(int[] iArr, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private static boolean arrayContains(short[] sArr, short s2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private static byte[] createRenegotiationInfo(byte[] bArr) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static SecureRandom createSecureRandom() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private void failWithError(short s2, short s3) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0029
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private void processAlert() throws java.io.IOException {
        /*
            r5 = this;
            return
        L2e:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.tls.TlsProtocolHandler.processAlert():void");
    }

    private void processApplicationData() {
    }

    /* JADX WARN: Invalid debug info offset */
    private void processChangeCipherSpec() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void processHandshake() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void processHandshakeMessage(short s2, byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private void safeReadData() throws java.io.IOException {
        /*
            r4 = this;
            return
        L9:
        Lb:
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.tls.TlsProtocolHandler.safeReadData():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private void safeWriteMessage(short r4, byte[] r5, int r6, int r7) throws java.io.IOException {
        /*
            r3 = this;
            return
        L9:
        Lb:
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.tls.TlsProtocolHandler.safeWriteMessage(short, byte[], int, int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    private void sendAlert(short s2, short s3) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void sendCertificateVerify(byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void sendClientCertificate(Certificate certificate) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void sendClientKeyExchange() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    private static void writeExtension(OutputStream outputStream, Integer num, byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void assertEmpty(ByteArrayInputStream byteArrayInputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void connect(CertificateVerifyer certificateVerifyer) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void connect(TlsClient tlsClient) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void flush() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public InputStream getInputStream() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public OutputStream getOutputStream() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void processData(short s2, byte[] bArr, int i, int i2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public int readApplicationData(byte[] bArr, int i, int i2) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeData(byte[] bArr, int i, int i2) throws IOException {
    }
}
