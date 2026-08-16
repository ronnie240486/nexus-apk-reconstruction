package com.p2pengine.core.utils.libcore.p009io;

import java.io.Closeable;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.p2pengine.core.utils.libcore.io.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C4019a implements Closeable {

    /* JADX INFO: renamed from: p */
    public static final Pattern f12256p = Pattern.compile("[a-z0-9_-]{1,64}");

    /* JADX INFO: renamed from: q */
    public static final OutputStream f12257q = new b();

    /* JADX INFO: renamed from: a */
    public DiskLruCacheListener f12258a;

    /* JADX INFO: renamed from: b */
    public final File f12259b;

    /* JADX INFO: renamed from: c */
    public final File f12260c;

    /* JADX INFO: renamed from: d */
    public final File f12261d;

    /* JADX INFO: renamed from: e */
    public final File f12262e;

    /* JADX INFO: renamed from: f */
    public final int f12263f;

    /* JADX INFO: renamed from: g */
    public long f12264g;

    /* JADX INFO: renamed from: h */
    public final int f12265h;

    /* JADX INFO: renamed from: i */
    public long f12266i;

    /* JADX INFO: renamed from: j */
    public Writer f12267j;

    /* JADX INFO: renamed from: k */
    public final LinkedHashMap<String, d> f12268k;

    /* JADX INFO: renamed from: l */
    public int f12269l;

    /* JADX INFO: renamed from: m */
    public long f12270m;

    /* JADX INFO: renamed from: n */
    public final ThreadPoolExecutor f12271n;

    /* JADX INFO: renamed from: o */
    public final Callable<Void> f12272o;

    /* JADX INFO: renamed from: com.p2pengine.core.utils.libcore.io.a$a */
    public class a implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C4019a f12273a;

        /* JADX WARN: Invalid debug info offset */
        public a(C4019a c4019a) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.util.concurrent.Callable
        public java.lang.Void call() {
            /*
                r3 = this;
                r0 = 0
                return r0
            Lb:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.utils.libcore.p009io.C4019a.a.call():java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.utils.libcore.io.a$b */
    public class b extends OutputStream {
        @Override // java.io.OutputStream
        public void write(int i) {
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.utils.libcore.io.a$c */
    public final class c {

        /* JADX INFO: renamed from: a */
        public final d f12274a;

        /* JADX INFO: renamed from: b */
        public final boolean[] f12275b;

        /* JADX INFO: renamed from: c */
        public boolean f12276c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C4019a f12277d;

        /* JADX INFO: renamed from: com.p2pengine.core.utils.libcore.io.a$c$a */
        public class a extends FilterOutputStream {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ c f12278a;

            /* JADX WARN: Invalid debug info offset */
            public a(c cVar, OutputStream outputStream) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public c(C4019a c4019a, d dVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m18470a(c cVar, boolean z) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.io.OutputStream m18471a(int r5) {
            /*
                r4 = this;
                r0 = 0
                return r0
            L13:
            L1f:
            L32:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.utils.libcore.p009io.C4019a.c.m18471a(int):java.io.OutputStream");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m18472a() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m18473b() {
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.utils.libcore.io.a$d */
    public final class d {

        /* JADX INFO: renamed from: a */
        public final String f12279a;

        /* JADX INFO: renamed from: b */
        public final long[] f12280b;

        /* JADX INFO: renamed from: c */
        public boolean f12281c;

        /* JADX INFO: renamed from: d */
        public c f12282d;

        /* JADX INFO: renamed from: e */
        public long f12283e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C4019a f12284f;

        /* JADX WARN: Invalid debug info offset */
        public d(C4019a c4019a, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m18474a(d dVar) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m18475a(d dVar, boolean z) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public File m18476a(int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public String m18477a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public File m18478b(int i) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.utils.libcore.io.a$e */
    public final class e implements Closeable {

        /* JADX INFO: renamed from: a */
        public final InputStream[] f12285a;

        /* JADX WARN: Invalid debug info offset */
        public e(C4019a c4019a, String str, long j, InputStream[] inputStreamArr, long[] jArr) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C4019a(File file, int i, int i2, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m18452a(C4019a c4019a) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x003c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static com.p2pengine.core.utils.libcore.p009io.C4019a m18453a(java.io.File r9, int r10, int r11, long r12) {
        /*
            r0 = 0
            return r0
        L59:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.utils.libcore.p009io.C4019a.m18453a(java.io.File, int, int, long):com.p2pengine.core.utils.libcore.io.a");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static void m18454a(com.p2pengine.core.utils.libcore.p009io.C4019a r9, com.p2pengine.core.utils.libcore.p009io.C4019a.c r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.utils.libcore.p009io.C4019a.m18454a(com.p2pengine.core.utils.libcore.io.a, com.p2pengine.core.utils.libcore.io.a$c, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static void m18455a(File file) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static void m18456a(File file, File file2, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public com.p2pengine.core.utils.libcore.p009io.C4019a.c m18457a(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            return r0
        L1e:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.utils.libcore.p009io.C4019a.m18457a(java.lang.String):com.p2pengine.core.utils.libcore.io.a$c");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18458a() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: b */
    public synchronized e m18459b(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public synchronized void m18460b() {
        /*
            r1 = this;
            return
        Le:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.utils.libcore.p009io.C4019a.m18460b():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0067
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: c */
    public final void m18461c(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.utils.libcore.p009io.C4019a.m18461c(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public synchronized boolean m18462c() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        /*
            r2 = this;
            return
        L2a:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.utils.libcore.p009io.C4019a.close():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final boolean m18463d() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public synchronized boolean m18464d(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public final void m18465e() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public final void m18466e(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0014
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: f */
    public final void m18467f() {
        /*
            r9 = this;
            return
        L63:
        L65:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.utils.libcore.p009io.C4019a.m18467f():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: g */
    public final synchronized void m18468g() {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.utils.libcore.p009io.C4019a.m18468g():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final void m18469h() {
    }
}
