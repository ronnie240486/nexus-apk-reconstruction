package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes2.dex */
public class JDKDSASigner extends SignatureSpi implements PKCSObjectIdentifiers, X509ObjectIdentifiers {
    private Digest digest;
    private SecureRandom random;
    private DSA signer;

    public static class dsa224 extends JDKDSASigner {
    }

    public static class dsa256 extends JDKDSASigner {
    }

    public static class dsa384 extends JDKDSASigner {
    }

    public static class dsa512 extends JDKDSASigner {
    }

    public static class noneDSA extends JDKDSASigner {
    }

    public static class stdDSA extends JDKDSASigner {
    }

    /* JADX WARN: Invalid debug info offset */
    public JDKDSASigner(Digest digest, DSA dsa) {
    }

    /* JADX WARN: Invalid debug info offset */
    private BigInteger[] derDecode(byte[] bArr) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] derEncode(BigInteger bigInteger, BigInteger bigInteger2) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0014
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.SignatureSpi
    public void engineInitVerify(java.security.PublicKey r3) throws java.security.InvalidKeyException {
        /*
            r2 = this;
            return
        L36:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKDSASigner.engineInitVerify(java.security.PublicKey):void");
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
            r3 = this;
            r0 = 0
            return r0
        L1e:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKDSASigner.engineSign():byte[]");
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
    public boolean engineVerify(byte[] r5) throws java.security.SignatureException {
        /*
            r4 = this;
            r0 = 0
            return r0
        L1e:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKDSASigner.engineVerify(byte[]):boolean");
    }
}
