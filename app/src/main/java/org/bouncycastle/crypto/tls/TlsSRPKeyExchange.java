package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.agreement.srp.SRP6Client;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes2.dex */
class TlsSRPKeyExchange implements TlsKeyExchange {

    /* JADX INFO: renamed from: B */
    protected BigInteger f16359B;
    protected TlsClientContext context;
    protected byte[] identity;
    protected int keyExchange;
    protected byte[] password;

    /* JADX INFO: renamed from: s */
    protected byte[] f16360s;
    protected AsymmetricKeyParameter serverPublicKey;
    protected SRP6Client srpClient;
    protected TlsSigner tlsSigner;

    /* JADX WARN: Invalid debug info offset */
    public TlsSRPKeyExchange(TlsClientContext tlsClientContext, int i, byte[] bArr, byte[] bArr2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public void generateClientKeyExchange(OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public byte[] generatePremasterSecret() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Signer initSigner(TlsSigner tlsSigner, SecurityParameters securityParameters) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public void processClientCredentials(TlsCredentials tlsCredentials) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public void processServerCertificate(org.bouncycastle.crypto.tls.Certificate r3) throws java.io.IOException {
        /*
            r2 = this;
            return
        L29:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.tls.TlsSRPKeyExchange.processServerCertificate(org.bouncycastle.crypto.tls.Certificate):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0048
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public void processServerKeyExchange(java.io.InputStream r6) throws java.io.IOException {
        /*
            r5 = this;
            return
        L64:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.tls.TlsSRPKeyExchange.processServerKeyExchange(java.io.InputStream):void");
    }

    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public void skipClientCredentials() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public void skipServerCertificate() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public void skipServerKeyExchange() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public void validateCertificateRequest(CertificateRequest certificateRequest) throws IOException {
    }
}
