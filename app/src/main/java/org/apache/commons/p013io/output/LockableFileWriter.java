package org.apache.commons.p013io.output;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public class LockableFileWriter extends Writer {

    /* JADX INFO: renamed from: c */
    public static final String f15944c = ".lck";

    /* JADX INFO: renamed from: a */
    public final Writer f15945a;

    /* JADX INFO: renamed from: b */
    public final File f15946b;

    /* JADX WARN: Invalid debug info offset */
    public LockableFileWriter(File file) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public LockableFileWriter(File file, String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public LockableFileWriter(File file, String str, boolean z, String str2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public LockableFileWriter(File file, Charset charset) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public LockableFileWriter(File file, Charset charset, boolean z, String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public LockableFileWriter(File file, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public LockableFileWriter(File file, boolean z, String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public LockableFileWriter(String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public LockableFileWriter(String str, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public LockableFileWriter(String str, boolean z, String str2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: j */
    public final void m23408j() throws java.io.IOException {
        /*
            r4 = this;
            return
        L14:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.output.LockableFileWriter.m23408j():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: k */
    public final java.io.Writer m23409k(java.io.File r5, java.nio.charset.Charset r6, boolean r7) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 0
            return r0
        L18:
        L1a:
        L1c:
        L1f:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.output.LockableFileWriter.m23409k(java.io.File, java.nio.charset.Charset, boolean):java.io.Writer");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public final void m23410p(File file) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer
    public void write(int i) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer
    public void write(String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
    }
}
