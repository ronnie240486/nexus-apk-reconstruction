package org.apache.commons.p013io;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class FileDeleteStrategy {

    /* JADX INFO: renamed from: b */
    public static final FileDeleteStrategy f15602b = new FileDeleteStrategy("Normal");

    /* JADX INFO: renamed from: c */
    public static final FileDeleteStrategy f15603c = new ForceFileDeleteStrategy();

    /* JADX INFO: renamed from: a */
    public final String f15604a;

    public static class ForceFileDeleteStrategy extends FileDeleteStrategy {
        /* JADX WARN: Invalid debug info offset */
        @Override // org.apache.commons.p013io.FileDeleteStrategy
        /* JADX INFO: renamed from: c */
        public boolean mo22879c(File file) throws IOException {
            return false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public FileDeleteStrategy(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m22877a(File file) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public boolean m22878b(java.io.File r2) {
        /*
            r1 = this;
            r0 = 0
            return r0
        Le:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileDeleteStrategy.m22878b(java.io.File):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public boolean mo22879c(File file) throws IOException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
