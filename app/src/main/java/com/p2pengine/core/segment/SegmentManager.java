package com.p2pengine.core.segment;

import android.util.LruCache;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p2pengine.core.utils.libcore.p009io.C4019a;
import com.p2pengine.core.utils.libcore.p009io.DiskLruCacheListener;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C4744lX;

/* JADX INFO: loaded from: classes2.dex */
public final class SegmentManager implements DiskLruCacheListener {

    /* JADX INFO: renamed from: a */
    public LruCache<String, SegmentBase> f12045a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public volatile C4019a f12046b;

    /* JADX INFO: renamed from: c */
    public final boolean f12047c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public AtomicInteger f12048d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Observer f12049e;

    /* JADX INFO: renamed from: f */
    public boolean f12050f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final ConcurrentHashMap<String, C4744lX<Long, String, Integer>> f12051g;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/p2pengine/core/segment/SegmentManager$Observer;", "", "", "SN", "", "segId", "", FirebaseAnalytics.Param.LEVEL, "LPY;", "onMemorySegmentRemoved", "(JLjava/lang/String;I)V", "onDiskSegmentRemoved", "Lcom/p2pengine/core/segment/SegmentBase;", "segment", "onSegmentAdded", "(Ljava/lang/String;Lcom/p2pengine/core/segment/SegmentBase;)V", "sdk_release"}, k = 1, mv = {1, 5, 1})
    public interface Observer {
        void onDiskSegmentRemoved(long SN, @NotNull String segId, int level);

        void onMemorySegmentRemoved(long SN, @NotNull String segId, int level);

        void onSegmentAdded(@NotNull String segId, @NotNull SegmentBase segment);
    }

    /* JADX INFO: renamed from: com.p2pengine.core.segment.SegmentManager$a */
    public static final class C3978a extends LruCache<String, SegmentBase> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SegmentManager f12052a;

        /* JADX WARN: Invalid debug info offset */
        public C3978a(SegmentManager segmentManager, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.util.LruCache
        public void entryRemoved(boolean z, String str, SegmentBase segmentBase, SegmentBase segmentBase2) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public SegmentManager(int i, long j, @Nullable File file) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0013
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static final void m18322a(com.p2pengine.core.segment.SegmentManager r3) {
        /*
            return
        L2d:
        L2f:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.segment.SegmentManager.m18322a(com.p2pengine.core.segment.SegmentManager):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18323a() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18324a(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0020
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public final void m18325a(java.io.File r3, int r4, long r5) {
        /*
            r2 = this;
            return
        L2e:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.segment.SegmentManager.m18325a(java.io.File, int, long):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x009c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public final void m18326a(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull com.p2pengine.core.segment.SegmentBase r9) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.segment.SegmentManager.m18326a(java.lang.String, com.p2pengine.core.segment.SegmentBase):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final boolean m18327a(@NotNull String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x003d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: b */
    public final com.p2pengine.core.segment.SegmentBase m18328b(@org.jetbrains.annotations.NotNull java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.segment.SegmentManager.m18328b(java.lang.String):com.p2pengine.core.segment.SegmentBase");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.utils.libcore.p009io.DiskLruCacheListener
    public void onEntryRemoved(@NotNull String str) {
    }
}
