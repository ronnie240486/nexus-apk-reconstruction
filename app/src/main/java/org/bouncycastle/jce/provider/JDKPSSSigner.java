package org.bouncycastle.jce.provider;

import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.signers.PSSSigner;

/* JADX INFO: loaded from: classes2.dex */
public class JDKPSSSigner extends SignatureSpi {
    private Digest contentDigest;
    private AlgorithmParameters engineParams;
    private boolean isRaw;
    private Digest mgfDigest;
    private PSSParameterSpec originalSpec;
    private PSSParameterSpec paramSpec;
    private PSSSigner pss;
    private int saltLength;
    private AsymmetricBlockCipher signer;
    private byte trailer;

    public class NullPssDigest implements Digest {
        private ByteArrayOutputStream bOut;
        private Digest baseDigest;
        private boolean oddTime;
        final /* synthetic */ JDKPSSSigner this$0;

        /* JADX WARN: Invalid debug info offset */
        public NullPssDigest(JDKPSSSigner jDKPSSSigner, Digest digest) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.crypto.Digest
        public int doFinal(byte[] bArr, int i) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.crypto.Digest
        public String getAlgorithmName() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.crypto.Digest
        public int getDigestSize() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.crypto.Digest
        public void reset() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.crypto.Digest
        public void update(byte b) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.crypto.Digest
        public void update(byte[] bArr, int i, int i2) {
        }
    }

    public static class PSSwithRSA extends JDKPSSSigner {
    }

    public static class SHA1withRSA extends JDKPSSSigner {
    }

    public static class SHA224withRSA extends JDKPSSSigner {
    }

    public static class SHA256withRSA extends JDKPSSSigner {
    }

    public static class SHA384withRSA extends JDKPSSSigner {
    }

    public static class SHA512withRSA extends JDKPSSSigner {
    }

    public static class nonePSS extends JDKPSSSigner {
    }

    /* JADX WARN: Invalid debug info offset */
    public JDKPSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, PSSParameterSpec pSSParameterSpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JDKPSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, PSSParameterSpec pSSParameterSpec, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    private byte getTrailer(int i) {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private void setupContentDigest() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.SignatureSpi
    public java.security.AlgorithmParameters engineGetParameters() {
        /*
            r2 = this;
            r0 = 0
            return r0
        L18:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKPSSSigner.engineGetParameters():java.security.AlgorithmParameters");
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
    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        return null;
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
    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        return false;
    }
}
