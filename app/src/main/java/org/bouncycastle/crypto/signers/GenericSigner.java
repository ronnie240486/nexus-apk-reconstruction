package org.bouncycastle.crypto.signers;

import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;

/* JADX INFO: loaded from: classes2.dex */
public class GenericSigner implements Signer {
    private final Digest digest;
    private final AsymmetricBlockCipher engine;
    private boolean forSigning;

    /* JADX WARN: Invalid debug info offset */
    public GenericSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
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
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0012
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] r5) {
        /*
            r4 = this;
            r0 = 0
            return r0
        L1e:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.signers.GenericSigner.verifySignature(byte[]):boolean");
    }
}
