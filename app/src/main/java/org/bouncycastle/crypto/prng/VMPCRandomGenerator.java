package org.bouncycastle.crypto.prng;

/* JADX INFO: loaded from: classes2.dex */
public class VMPCRandomGenerator implements RandomGenerator {

    /* JADX INFO: renamed from: P */
    private byte[] f16352P;

    /* JADX INFO: renamed from: n */
    private byte f16353n;

    /* JADX INFO: renamed from: s */
    private byte f16354s;

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] r8, int r9, int r10) {
        /*
            r7 = this;
            return
        L41:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.prng.VMPCRandomGenerator.nextBytes(byte[], int, int):void");
    }
}
