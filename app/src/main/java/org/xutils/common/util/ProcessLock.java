package org.xutils.common.util;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.text.DecimalFormat;
import org.xutils.C5141x;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLock implements Closeable {

    /* JADX INFO: renamed from: f */
    public static final String f18017f = "process_lock";

    /* JADX INFO: renamed from: g */
    public static final DoubleKeyValueMap<String, Integer, ProcessLock> f18018g = new DoubleKeyValueMap<>();

    /* JADX INFO: renamed from: h */
    public static final DecimalFormat f18019h;

    /* JADX INFO: renamed from: a */
    public final String f18020a;

    /* JADX INFO: renamed from: b */
    public final FileLock f18021b;

    /* JADX INFO: renamed from: c */
    public final File f18022c;

    /* JADX INFO: renamed from: d */
    public final Closeable f18023d;

    /* JADX INFO: renamed from: e */
    public final boolean f18024e;

    static {
        FileUtil.m26787b(C5141x.m27314a().getDir(f18017f, 0));
        f18019h = new DecimalFormat("0.##################");
    }

    /* JADX WARN: Invalid debug info offset */
    public ProcessLock(String str, File file, FileLock fileLock, Closeable closeable, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: P */
    public static void m26825P(java.lang.String r2, java.nio.channels.FileLock r3, java.io.File r4, java.io.Closeable r5) {
        /*
            return
        L1d:
        L37:
        L45:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.common.util.ProcessLock.m26825P(java.lang.String, java.nio.channels.FileLock, java.io.File, java.io.Closeable):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public static ProcessLock m26826R(String str, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: S */
    public static org.xutils.common.util.ProcessLock m26827S(java.lang.String r5, boolean r6, long r7) throws java.lang.InterruptedException {
        /*
            r0 = 0
            return r0
        L1f:
        L21:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.common.util.ProcessLock.m26827S(java.lang.String, boolean, long):org.xutils.common.util.ProcessLock");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: V */
    public static org.xutils.common.util.ProcessLock m26828V(java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.common.util.ProcessLock.m26828V(java.lang.String, java.lang.String, boolean):org.xutils.common.util.ProcessLock");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static String m26829j(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static boolean m26830p(FileLock fileLock) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void finalize() throws Throwable {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public boolean m26831k() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public void m26832w() {
    }
}
