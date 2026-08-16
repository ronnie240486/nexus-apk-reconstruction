package org.bouncycastle.crypto.prng;

/* JADX INFO: loaded from: classes2.dex */
public class ThreadedSeedGenerator {

    public class SeedGenerator implements Runnable {
        private volatile int counter;
        private volatile boolean stop;
        final /* synthetic */ ThreadedSeedGenerator this$0;

        /* JADX WARN: Invalid debug info offset */
        private SeedGenerator(ThreadedSeedGenerator threadedSeedGenerator) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ SeedGenerator(ThreadedSeedGenerator threadedSeedGenerator, C50411 c50411) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001e
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        public byte[] generateSeed(int r7, boolean r8) {
            /*
                r6 = this;
                r0 = 0
                return r0
            L22:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.prng.ThreadedSeedGenerator.SeedGenerator.generateSeed(int, boolean):byte[]");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] generateSeed(int i, boolean z) {
        return null;
    }
}
