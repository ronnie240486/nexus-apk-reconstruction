package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;

/* JADX INFO: loaded from: classes2.dex */
class TlsECDHKeyExchange implements TlsKeyExchange {
    protected TlsAgreementCredentials agreementCredentials;
    protected TlsClientContext context;
    protected ECPrivateKeyParameters ecAgreeClientPrivateKey;
    protected ECPublicKeyParameters ecAgreeServerPublicKey;
    protected int keyExchange;
    protected AsymmetricKeyParameter serverPublicKey;
    protected TlsSigner tlsSigner;

    /* JADX WARN: Invalid debug info offset */
    public TlsECDHKeyExchange(TlsClientContext tlsClientContext, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean areOnSameCurve(ECDomainParameters eCDomainParameters, ECDomainParameters eCDomainParameters2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] calculateECDHBasicAgreement(ECPublicKeyParameters eCPublicKeyParameters, ECPrivateKeyParameters eCPrivateKeyParameters) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] externalizeKey(ECPublicKeyParameters eCPublicKeyParameters) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public void generateClientKeyExchange(OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public AsymmetricCipherKeyPair generateECKeyPair(ECDomainParameters eCDomainParameters) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void generateEphemeralClientKeyExchange(ECDomainParameters eCDomainParameters, OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public byte[] generatePremasterSecret() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public void processClientCredentials(TlsCredentials tlsCredentials) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public void processServerCertificate(org.bouncycastle.crypto.tls.Certificate r4) throws java.io.IOException {
        /*
            r3 = this;
            return
        L23:
        L39:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.tls.TlsECDHKeyExchange.processServerCertificate(org.bouncycastle.crypto.tls.Certificate):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public void processServerKeyExchange(InputStream inputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public void skipClientCredentials() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public void skipServerCertificate() throws IOException {
    }

    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public void skipServerKeyExchange() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public void validateCertificateRequest(CertificateRequest certificateRequest) throws IOException {
    }

    public ECPublicKeyParameters validateECPublicKey(ECPublicKeyParameters eCPublicKeyParameters) throws IOException {
        return eCPublicKeyParameters;
    }
}
