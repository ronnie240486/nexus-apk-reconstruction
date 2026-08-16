package com.p2pengine.core.download;

import com.p2pengine.core.segment.SegmentBase;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.InterfaceC0322Et;

/* JADX INFO: renamed from: com.p2pengine.core.download.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C3932a {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final a f11729d = new a();

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Map<Object, List<C3932a>> f11730e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    @Nullable
    public SegmentBase f11731a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lock f11732b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Condition f11733c;

    /* JADX INFO: renamed from: com.p2pengine.core.download.a$a */
    public static final class a {
        /* JADX WARN: Invalid debug info offset */
        @InterfaceC0322Et
        @NotNull
        /* JADX INFO: renamed from: a */
        public final C3932a m18159a(@NotNull String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0031
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @p000.InterfaceC0322Et
        /* JADX INFO: renamed from: a */
        public final void m18160a(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull com.p2pengine.core.segment.SegmentBase r5) {
            /*
                r3 = this;
                return
            L3e:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.download.C3932a.a.m18160a(java.lang.String, com.p2pengine.core.segment.SegmentBase):void");
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a */
    public final com.p2pengine.core.segment.SegmentBase m18158a(long r3) {
        /*
            r2 = this;
            r0 = 0
            return r0
        L14:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.download.C3932a.m18158a(long):com.p2pengine.core.segment.SegmentBase");
    }
}
