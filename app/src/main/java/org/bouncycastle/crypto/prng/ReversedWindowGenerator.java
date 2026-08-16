package org.bouncycastle.crypto.prng;

/* JADX INFO: loaded from: classes2.dex */
public class ReversedWindowGenerator implements RandomGenerator {
    private final RandomGenerator generator;
    private byte[] window;
    private int windowCount;

    /* JADX WARN: Invalid debug info offset */
    public ReversedWindowGenerator(RandomGenerator randomGenerator, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private void doNextBytes(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            return
        L18:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.prng.ReversedWindowGenerator.doNextBytes(byte[], int, int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long r2) {
        /*
            r1 = this;
            return
        Lb:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.prng.ReversedWindowGenerator.addSeedMaterial(long):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] r2) {
        /*
            r1 = this;
            return
        Lb:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.prng.ReversedWindowGenerator.addSeedMaterial(byte[]):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i, int i2) {
    }
}
