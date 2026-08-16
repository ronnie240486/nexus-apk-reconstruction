package org.xutils.cache;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;
import org.xutils.DbManager;

/* JADX INFO: loaded from: classes.dex */
public final class LruDiskCache {

    /* JADX INFO: renamed from: g */
    public static final HashMap<String, LruDiskCache> f17938g = new HashMap<>(5);

    /* JADX INFO: renamed from: h */
    public static final int f17939h = 5000;

    /* JADX INFO: renamed from: i */
    public static final long f17940i = 104857600;

    /* JADX INFO: renamed from: j */
    public static final int f17941j = 3000;

    /* JADX INFO: renamed from: k */
    public static final String f17942k = "xUtils_cache";

    /* JADX INFO: renamed from: l */
    public static final String f17943l = ".tmp";

    /* JADX INFO: renamed from: m */
    public static final long f17944m = 1000;

    /* JADX INFO: renamed from: a */
    public boolean f17945a;

    /* JADX INFO: renamed from: b */
    public DbManager f17946b;

    /* JADX INFO: renamed from: c */
    public File f17947c;

    /* JADX INFO: renamed from: d */
    public long f17948d;

    /* JADX INFO: renamed from: e */
    public final Executor f17949e;

    /* JADX INFO: renamed from: f */
    public long f17950f;

    /* JADX INFO: renamed from: org.xutils.cache.LruDiskCache$1 */
    public class RunnableC51101 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DiskCacheEntity f17951a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LruDiskCache f17952b;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC51101(LruDiskCache lruDiskCache, DiskCacheEntity diskCacheEntity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000f
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.lang.Runnable
        public void run() {
            /*
                r5 = this;
                return
            L23:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.xutils.cache.LruDiskCache.RunnableC51101.run():void");
        }
    }

    /* JADX INFO: renamed from: org.xutils.cache.LruDiskCache$2 */
    public class RunnableC51112 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LruDiskCache f17953a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC51112(LruDiskCache lruDiskCache) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0028
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.lang.Runnable
        public void run() {
            /*
                Method dump skipped, instruction units count: 288
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.xutils.cache.LruDiskCache.RunnableC51112.run():void");
        }
    }

    /* JADX INFO: renamed from: org.xutils.cache.LruDiskCache$3 */
    public class RunnableC51123 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LruDiskCache f17954a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC51123(LruDiskCache lruDiskCache) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0009
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.lang.Runnable
        public void run() {
            /*
                r9 = this;
                return
            L42:
            L4d:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.xutils.cache.LruDiskCache.RunnableC51123.run():void");
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0017
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public LruDiskCache(java.lang.String r6) {
        /*
            r5 = this;
            return
        L2e:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.cache.LruDiskCache.<init>(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ DbManager m26703a(LruDiskCache lruDiskCache) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m26704b(LruDiskCache lruDiskCache) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ long m26705c(LruDiskCache lruDiskCache) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ long m26706d(LruDiskCache lruDiskCache, long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m26707e(LruDiskCache lruDiskCache) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m26708f(LruDiskCache lruDiskCache, String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ File m26709g(LruDiskCache lruDiskCache) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ long m26710h(LruDiskCache lruDiskCache) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: p */
    public static synchronized org.xutils.cache.LruDiskCache m26711p(java.lang.String r3) {
        /*
            r0 = 0
            return r0
        Lc:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.cache.LruDiskCache.m26711p(java.lang.String):org.xutils.cache.LruDiskCache");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public void m26712i() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0019
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: j */
    public org.xutils.cache.DiskCacheFile m26713j(org.xutils.cache.DiskCacheFile r8) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 0
            return r0
        L3d:
        L50:
        L53:
        L6c:
        L6e:
        L71:
        L79:
        L7d:
        L8d:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.cache.LruDiskCache.m26713j(org.xutils.cache.DiskCacheFile):org.xutils.cache.DiskCacheFile");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public DiskCacheFile m26714k(DiskCacheEntity diskCacheEntity) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: l */
    public final void m26715l() {
        /*
            r5 = this;
            return
        L4c:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.cache.LruDiskCache.m26715l():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: m */
    public final boolean m26716m(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 0
            return r0
        L1c:
        L23:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.cache.LruDiskCache.m26716m(java.lang.String):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public final void m26717n() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: o */
    public org.xutils.cache.DiskCacheEntity m26718o(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            return r0
        L28:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.cache.LruDiskCache.m26718o(java.lang.String):org.xutils.cache.DiskCacheEntity");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x003f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: q */
    public org.xutils.cache.DiskCacheFile m26719q(java.lang.String r6) throws java.lang.InterruptedException {
        /*
            r5 = this;
            r0 = 0
            return r0
        L45:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.cache.LruDiskCache.m26719q(java.lang.String):org.xutils.cache.DiskCacheFile");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0019
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: r */
    public void m26720r(org.xutils.cache.DiskCacheEntity r6) {
        /*
            r5 = this;
            return
        L1f:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.cache.LruDiskCache.m26720r(org.xutils.cache.DiskCacheEntity):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public LruDiskCache m26721s(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public final void m26722t() {
    }
}
