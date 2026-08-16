package org.bouncycastle.crypto.signers;

import java.util.Hashtable;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SignerWithRecovery;
import p000.C4572io;

/* JADX INFO: loaded from: classes2.dex */
public class ISO9796d2Signer implements SignerWithRecovery {
    public static final int TRAILER_IMPLICIT = 188;
    public static final int TRAILER_RIPEMD128 = 13004;
    public static final int TRAILER_RIPEMD160 = 12748;
    public static final int TRAILER_SHA1 = 13260;
    public static final int TRAILER_SHA256 = 13516;
    public static final int TRAILER_SHA384 = 14028;
    public static final int TRAILER_SHA512 = 13772;
    public static final int TRAILER_WHIRLPOOL = 14284;
    private static Hashtable trailerMap;
    private byte[] block;
    private AsymmetricBlockCipher cipher;
    private Digest digest;
    private boolean fullMessage;
    private int keyBits;
    private byte[] mBuf;
    private int messageLength;
    private byte[] preBlock;
    private byte[] preSig;
    private byte[] recoveredMessage;
    private int trailer;

    static {
        Hashtable hashtable = new Hashtable();
        trailerMap = hashtable;
        C4572io.m21440a(13004, hashtable, "RIPEMD128");
        C4572io.m21440a(12748, trailerMap, "RIPEMD160");
        C4572io.m21440a(13260, trailerMap, "SHA-1");
        C4572io.m21440a(TRAILER_SHA256, trailerMap, "SHA-256");
        C4572io.m21440a(TRAILER_SHA384, trailerMap, "SHA-384");
        C4572io.m21440a(TRAILER_SHA512, trailerMap, "SHA-512");
        C4572io.m21440a(TRAILER_WHIRLPOOL, trailerMap, "Whirlpool");
    }

    /* JADX WARN: Invalid debug info offset */
    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void clearBlock(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean isSameAs(byte[] bArr, byte[] bArr2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean returnFalse(byte[] bArr) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws CryptoException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public byte[] getRecoveredMessage() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public boolean hasFullMessage() {
        return false;
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
    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public void updateWithRecoveredMessage(byte[] bArr) throws InvalidCipherTextException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] r14) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.signers.ISO9796d2Signer.verifySignature(byte[]):boolean");
    }
}
