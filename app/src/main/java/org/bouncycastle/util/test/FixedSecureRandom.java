package org.bouncycastle.util.test;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public class FixedSecureRandom extends SecureRandom {
    private byte[] _data;
    private int _index;
    private int _intPad;

    /* JADX WARN: Invalid debug info offset */
    public FixedSecureRandom(boolean z, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public FixedSecureRandom(boolean r4, byte[][] r5) {
        /*
            r3 = this;
            return
        L14:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.util.test.FixedSecureRandom.<init>(boolean, byte[][]):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public FixedSecureRandom(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public FixedSecureRandom(byte[][] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private int nextValue() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isExhausted() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Random
    public int nextInt() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Random
    public long nextLong() {
        return 0L;
    }
}
