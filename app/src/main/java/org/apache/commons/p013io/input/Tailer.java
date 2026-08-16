package org.apache.commons.p013io.input;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public class Tailer implements Runnable {

    /* JADX INFO: renamed from: i */
    public static final int f15847i = 1000;

    /* JADX INFO: renamed from: j */
    public static final String f15848j = "r";

    /* JADX INFO: renamed from: k */
    public static final int f15849k = 4096;

    /* JADX INFO: renamed from: l */
    public static final Charset f15850l = Charset.defaultCharset();

    /* JADX INFO: renamed from: a */
    public final byte[] f15851a;

    /* JADX INFO: renamed from: b */
    public final File f15852b;

    /* JADX INFO: renamed from: c */
    public final Charset f15853c;

    /* JADX INFO: renamed from: d */
    public final long f15854d;

    /* JADX INFO: renamed from: e */
    public final boolean f15855e;

    /* JADX INFO: renamed from: f */
    public final TailerListener f15856f;

    /* JADX INFO: renamed from: g */
    public final boolean f15857g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f15858h;

    /* JADX WARN: Invalid debug info offset */
    public Tailer(File file, Charset charset, TailerListener tailerListener, long j, boolean z, boolean z2, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Tailer(File file, TailerListener tailerListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Tailer(File file, TailerListener tailerListener, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Tailer(File file, TailerListener tailerListener, long j, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Tailer(File file, TailerListener tailerListener, long j, boolean z, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Tailer(File file, TailerListener tailerListener, long j, boolean z, boolean z2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Tailer(File file, TailerListener tailerListener, long j, boolean z, boolean z2, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static Tailer m23297a(File file, Charset charset, TailerListener tailerListener, long j, boolean z, boolean z2, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static Tailer m23298b(File file, TailerListener tailerListener) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static Tailer m23299c(File file, TailerListener tailerListener, long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static Tailer m23300d(File file, TailerListener tailerListener, long j, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static Tailer m23301e(File file, TailerListener tailerListener, long j, boolean z, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static Tailer m23302f(File file, TailerListener tailerListener, long j, boolean z, boolean z2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static Tailer m23303g(File file, TailerListener tailerListener, long j, boolean z, boolean z2, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public long m23304h() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public File m23305i() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public boolean m23306j() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final long m23307k(RandomAccessFile randomAccessFile) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public void m23308l() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public final void m23309m(Exception exc) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.lang.Runnable
    public void run() {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.Tailer.run():void");
    }
}
