package com.p2pengine.core.segment;

import com.p2pengine.core.p2p.LoaderCallback;
import java.io.IOException;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C1181SM;
import p000.C4934oO;
import p000.InterfaceC0322Et;
import p000.InterfaceC0401G8;
import p000.InterfaceC0591J8;
import p000.InterfaceC5884zs;

/* JADX INFO: renamed from: com.p2pengine.core.segment.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C3984f {

    /* JADX INFO: renamed from: com.p2pengine.core.segment.f$a */
    public static final class a implements InterfaceC0591J8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LoaderCallback f12067a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SegmentBase f12068b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f12069c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C1181SM.h<C3983e> f12070d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ long f12071e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f12072f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f12073g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ long f12074h;

        /* JADX WARN: Invalid debug info offset */
        public a(LoaderCallback loaderCallback, SegmentBase segmentBase, boolean z, C1181SM.h<C3983e> hVar, long j, int i, String str, long j2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0591J8
        public void onFailure(@NotNull InterfaceC0401G8 interfaceC0401G8, @NotNull IOException iOException) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0031
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // p000.InterfaceC0591J8
        public void onResponse(@org.jetbrains.annotations.NotNull p000.InterfaceC0401G8 r18, @org.jetbrains.annotations.NotNull p000.C4934oO r19) {
            /*
                r17 = this;
                return
            L62:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.segment.C3984f.a.onResponse(G8, oO):void");
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.segment.f$b */
    public static final class b implements ProgressListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1181SM.h<C3983e> f12075a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LoaderCallback f12076b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f12077c;

        /* JADX WARN: Invalid debug info offset */
        public b(C1181SM.h<C3983e> hVar, LoaderCallback loaderCallback, long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.segment.ProgressListener
        public void bodyComplete(@NotNull byte[] bArr, @NotNull String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.segment.ProgressListener
        public void onError(@NotNull String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000f
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // com.p2pengine.core.segment.ProgressListener
        public void update(@org.jetbrains.annotations.NotNull java.nio.ByteBuffer r6, boolean r7) {
            /*
                r5 = this;
                return
            L21:
            L4c:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.segment.C3984f.b.update(java.nio.ByteBuffer, boolean):void");
        }
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0322Et
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0401G8 m18332a(@NotNull SegmentBase segmentBase, @Nullable Map<String, String> map, @NotNull LoaderCallback loaderCallback, @Nullable InterfaceC0401G8.a aVar, boolean z, @Nullable Long l) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0401G8 m18333a(SegmentBase segmentBase, Map map, LoaderCallback loaderCallback, InterfaceC0401G8.a aVar, boolean z, Long l, int i, Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static final C4934oO m18334a(LoaderCallback loaderCallback, boolean z, ProgressListener progressListener, InterfaceC5884zs.a aVar) {
        return null;
    }
}
