package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes2.dex */
public class JDKDigestSignature extends SignatureSpi {
    private AlgorithmIdentifier algId;
    private AsymmetricBlockCipher cipher;
    private Digest digest;

    public static class MD2WithRSAEncryption extends JDKDigestSignature {
    }

    public static class MD4WithRSAEncryption extends JDKDigestSignature {
    }

    public static class MD5WithRSAEncryption extends JDKDigestSignature {
    }

    public static class RIPEMD128WithRSAEncryption extends JDKDigestSignature {
    }

    public static class RIPEMD160WithRSAEncryption extends JDKDigestSignature {
    }

    public static class RIPEMD256WithRSAEncryption extends JDKDigestSignature {
    }

    public static class SHA1WithRSAEncryption extends JDKDigestSignature {
    }

    public static class SHA224WithRSAEncryption extends JDKDigestSignature {
    }

    public static class SHA256WithRSAEncryption extends JDKDigestSignature {
    }

    public static class SHA384WithRSAEncryption extends JDKDigestSignature {
    }

    public static class SHA512WithRSAEncryption extends JDKDigestSignature {
    }

    public static class noneRSA extends JDKDigestSignature {
    }

    /* JADX WARN: Invalid debug info offset */
    public JDKDigestSignature(DERObjectIdentifier dERObjectIdentifier, Digest digest, AsymmetricBlockCipher asymmetricBlockCipher) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JDKDigestSignature(Digest digest, AsymmetricBlockCipher asymmetricBlockCipher) {
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] derEncode(byte[] bArr) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private String getType(Object obj) {
        return null;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        return null;
    }

    @Override // java.security.SignatureSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws java.security.SignatureException {
        /*
            r4 = this;
            r0 = 0
            return r0
        L1a:
        L25:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKDigestSignature.engineSign():byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) throws SignatureException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] r10) throws java.security.SignatureException {
        /*
            r9 = this;
            r0 = 0
            return r0
        L68:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKDigestSignature.engineVerify(byte[]):boolean");
    }
}
