package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DefaultTlsClient implements TlsClient {
    protected TlsCipherFactory cipherFactory;
    protected TlsClientContext context;
    protected int selectedCipherSuite;
    protected int selectedCompressionMethod;

    /* JADX WARN: Invalid debug info offset */
    public DefaultTlsClient() {
    }

    /* JADX WARN: Invalid debug info offset */
    public DefaultTlsClient(TlsCipherFactory tlsCipherFactory) {
    }

    /* JADX WARN: Invalid debug info offset */
    public TlsKeyExchange createDHEKeyExchange(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public TlsKeyExchange createDHKeyExchange(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public TlsKeyExchange createECDHEKeyExchange(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public TlsKeyExchange createECDHKeyExchange(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public TlsKeyExchange createRSAKeyExchange() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsClient
    public TlsCipher getCipher() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsClient
    public int[] getCipherSuites() {
        return null;
    }

    @Override // org.bouncycastle.crypto.tls.TlsClient
    public Hashtable getClientExtensions() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsClient
    public TlsCompression getCompression() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsClient
    public short[] getCompressionMethods() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsClient
    public TlsKeyExchange getKeyExchange() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsClient
    public void init(TlsClientContext tlsClientContext) {
    }

    @Override // org.bouncycastle.crypto.tls.TlsClient
    public void notifySecureRenegotiation(boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsClient
    public void notifySelectedCipherSuite(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsClient
    public void notifySelectedCompressionMethod(short s2) {
    }

    @Override // org.bouncycastle.crypto.tls.TlsClient
    public void notifySessionID(byte[] bArr) {
    }

    @Override // org.bouncycastle.crypto.tls.TlsClient
    public void processServerExtensions(Hashtable hashtable) {
    }
}
