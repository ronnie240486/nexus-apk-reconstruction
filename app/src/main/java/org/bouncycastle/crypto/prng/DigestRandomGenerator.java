package org.bouncycastle.crypto.prng;

import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes2.dex */
public class DigestRandomGenerator implements RandomGenerator {
    private static long CYCLE_COUNT = 10;
    private Digest digest;
    private byte[] seed;
    private long seedCounter;
    private byte[] state;
    private long stateCounter;

    /* JADX WARN: Invalid debug info offset */
    public DigestRandomGenerator(Digest digest) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void cycleSeed() {
    }

    /* JADX WARN: Invalid debug info offset */
    private void digestAddCounter(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void digestDoFinal(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void digestUpdate(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void generateState() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long r1) {
        /*
            r0 = this;
            return
        L10:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.prng.DigestRandomGenerator.addSeedMaterial(long):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] r1) {
        /*
            r0 = this;
            return
        L10:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.prng.DigestRandomGenerator.addSeedMaterial(byte[]):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] r5, int r6, int r7) {
        /*
            r4 = this;
            return
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.prng.DigestRandomGenerator.nextBytes(byte[], int, int):void");
    }
}
