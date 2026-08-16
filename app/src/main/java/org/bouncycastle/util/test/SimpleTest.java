package org.bouncycastle.util.test;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SimpleTest implements Test {
    /* JADX WARN: Invalid debug info offset */
    public static void runTest(Test test) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void runTest(Test test, PrintStream printStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    private TestResult success() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean areEqual(byte[] bArr, byte[] bArr2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void fail(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void fail(String str, Object obj, Object obj2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void fail(String str, Throwable th) {
    }

    @Override // org.bouncycastle.util.test.Test
    public abstract String getName();

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x000a
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @Override // org.bouncycastle.util.test.Test
    public org.bouncycastle.util.test.TestResult perform() {
        /*
            r3 = this;
            r0 = 0
            return r0
        L8:
        La:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.util.test.SimpleTest.perform():org.bouncycastle.util.test.TestResult");
    }

    public abstract void performTest() throws Exception;
}
