package org.bouncycastle.crypto.signers;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;

/* JADX INFO: loaded from: classes2.dex */
public class PSSSigner implements Signer {
    public static final byte TRAILER_IMPLICIT = -68;
    private byte[] block;
    private AsymmetricBlockCipher cipher;
    private Digest contentDigest;
    private int emBits;
    private int hLen;
    private byte[] mDash;
    private Digest mgfDigest;
    private int mgfhLen;
    private SecureRandom random;
    private int sLen;
    private byte[] salt;
    private byte trailer;

    /* JADX WARN: Invalid debug info offset */
    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i, byte b) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, int i, byte b) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void ItoOSP(int i, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void clearBlock(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] maskGeneratorFunction1(byte[] bArr, int i, int i2, int i3) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws DataLengthException, CryptoException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, CipherParameters cipherParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] r7) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.signers.PSSSigner.verifySignature(byte[]):boolean");
    }
}
