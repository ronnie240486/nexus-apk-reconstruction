package org.bouncycastle.crypto.signers;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;

/* JADX INFO: loaded from: classes2.dex */
public class DSADigestSigner implements Signer {
    private final Digest digest;
    private final DSA dsaSigner;
    private boolean forSigning;

    /* JADX WARN: Invalid debug info offset */
    public DSADigestSigner(DSA dsa, Digest digest) {
    }

    /* JADX WARN: Invalid debug info offset */
    private BigInteger[] derDecode(byte[] bArr) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] derEncode(BigInteger bigInteger, BigInteger bigInteger2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
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
    public boolean verifySignature(byte[] r6) {
        /*
            r5 = this;
            r0 = 0
            return r0
        L22:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.signers.DSADigestSigner.verifySignature(byte[]):boolean");
    }
}
