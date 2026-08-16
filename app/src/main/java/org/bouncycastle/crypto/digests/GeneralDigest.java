package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GeneralDigest implements ExtendedDigest {
    private static final int BYTE_LENGTH = 64;
    private long byteCount;
    private byte[] xBuf;
    private int xBufOff;

    /* JADX WARN: Invalid debug info offset */
    public GeneralDigest() {
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralDigest(GeneralDigest generalDigest) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void finish() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 0;
    }

    public abstract void processBlock();

    public abstract void processLength(long j);

    public abstract void processWord(byte[] bArr, int i);

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
