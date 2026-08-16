package com.p2pengine.core.dash;

import com.google.gson.JsonObject;
import com.p2pengine.core.abs.mpd.manifest.C3911b;
import com.p2pengine.core.p2p.AbstractC3968j;
import com.p2pengine.core.p2p.C3961c;
import com.p2pengine.core.p2p.C3975q;
import com.p2pengine.core.p2p.DataChannel;
import com.p2pengine.core.p2p.P2pConfig;
import com.p2pengine.core.p2p.P2pStatisticsListener;
import com.p2pengine.core.p2p.SynthesizerListener;
import com.p2pengine.core.segment.C3983e;
import com.p2pengine.core.segment.SegmentBase;
import com.p2pengine.core.segment.SegmentLoaderCallback;
import com.p2pengine.core.segment.SegmentManager;
import com.p2pengine.core.segment.SegmentState;
import com.p2pengine.core.tracking.StreamingType;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.p2pengine.core.dash.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C3930e extends AbstractC3968j implements SynthesizerListener {

    /* JADX INFO: renamed from: A */
    @NotNull
    public C3926a f11719A;

    /* JADX INFO: renamed from: B */
    @NotNull
    public C3927b f11720B;

    /* JADX INFO: renamed from: C */
    @Nullable
    public Map<Integer, ? extends List<C3911b.a>> f11721C;

    /* JADX INFO: renamed from: D */
    @NotNull
    public String f11722D;

    /* JADX INFO: renamed from: com.p2pengine.core.dash.e$a */
    public static final class a implements SegmentLoaderCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SegmentBase f11723a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C3930e f11724b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f11725c;

        /* JADX WARN: Invalid debug info offset */
        public a(SegmentBase segmentBase, C3930e c3930e, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.p2p.LoaderCallback
        public void onFailure(@NotNull String str, int i, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.p2p.LoaderCallback
        public void onHeader(@NotNull String str, long j, long j2) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0062
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // com.p2pengine.core.p2p.LoaderCallback
        public void onResponse(@org.jetbrains.annotations.NotNull byte[] r4, @org.jetbrains.annotations.NotNull java.lang.String r5, long r6) {
            /*
                Method dump skipped, instruction units count: 218
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.dash.C3930e.a.onResponse(byte[], java.lang.String, long):void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.segment.SegmentLoaderCallback
        public void onResponseStream(@NotNull InputStream inputStream, @NotNull String str, long j, @Nullable C3983e c3983e) {
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.dash.e$b */
    public static final class b implements SegmentManager.Observer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3930e f11726a;

        /* JADX WARN: Invalid debug info offset */
        public b(C3930e c3930e) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.segment.SegmentManager.Observer
        public void onDiskSegmentRemoved(long j, @NotNull String str, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.segment.SegmentManager.Observer
        public void onMemorySegmentRemoved(long j, @NotNull String str, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.segment.SegmentManager.Observer
        public void onSegmentAdded(@NotNull String str, @NotNull SegmentBase segmentBase) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C3930e(@NotNull P2pConfig p2pConfig, @Nullable P2pStatisticsListener p2pStatisticsListener, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0027
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static final void m18142a(com.p2pengine.core.dash.C3930e r2, com.p2pengine.core.segment.SegmentBase r3) {
        /*
            return
        L2b:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.dash.C3930e.m18142a(com.p2pengine.core.dash.e, com.p2pengine.core.segment.SegmentBase):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.AbstractC3968j
    @Nullable
    /* JADX INFO: renamed from: a */
    public SegmentBase mo18143a(@NotNull SegmentBase segmentBase) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.p2pengine.core.p2p.AbstractC3968j
    /* JADX INFO: renamed from: a */
    public synchronized void mo18144a() {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.dash.C3930e.mo18144a():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.AbstractC3968j
    /* JADX INFO: renamed from: a */
    public void mo18145a(@NotNull DataChannel dataChannel) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.AbstractC3968j
    /* JADX INFO: renamed from: a */
    public void mo18146a(@NotNull DataChannel dataChannel, @NotNull JsonObject jsonObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.AbstractC3968j
    /* JADX INFO: renamed from: a */
    public void mo18147a(@NotNull String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18148a(String str, SegmentBase segmentBase, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18149a(String str, SegmentBase segmentBase, C3975q c3975q, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18150a(String str, SegmentState segmentState) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.AbstractC3968j
    /* JADX INFO: renamed from: b */
    public void mo18151b() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.AbstractC3968j
    /* JADX INFO: renamed from: b */
    public void mo18152b(@NotNull DataChannel dataChannel) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final void m18153b(SegmentBase segmentBase) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final void m18154b(String str, SegmentBase segmentBase, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final void m18155c(SegmentBase segmentBase) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.AbstractC3968j
    @NotNull
    /* JADX INFO: renamed from: e */
    public StreamingType mo18156e() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.AbstractC3968j
    /* JADX INFO: renamed from: h */
    public void mo18157h() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.DataChannelMsgListener
    public void onDataChannelDownloadError(@NotNull DataChannel dataChannel, @Nullable String str, long j, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0043
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.p2pengine.core.p2p.DataChannelMsgListener
    public void onDataChannelHave(@org.jetbrains.annotations.NotNull com.p2pengine.core.p2p.DataChannel r9, long r10, @org.jetbrains.annotations.NotNull java.lang.String r12, int r13, boolean r14, boolean r15) {
        /*
            r8 = this;
            return
        L7d:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.dash.C3930e.onDataChannelHave(com.p2pengine.core.p2p.DataChannel, long, java.lang.String, int, boolean, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.DataChannelMsgListener
    public void onDataChannelLost(@NotNull DataChannel dataChannel, long j, @Nullable String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.DataChannelMsgListener
    public void onDataChannelPiece(@NotNull DataChannel dataChannel, @NotNull C3961c c3961c) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.p2pengine.core.p2p.DataChannelMsgListener
    public void onDataChannelPieceCancel(@org.jetbrains.annotations.NotNull com.p2pengine.core.p2p.DataChannel r1, @org.jetbrains.annotations.Nullable java.lang.String r2, long r3, int r5) {
        /*
            r0 = this;
            return
        L37:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.dash.C3930e.onDataChannelPieceCancel(com.p2pengine.core.p2p.DataChannel, java.lang.String, long, int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.DataChannelMsgListener
    public void onDataChannelPieceNotFound(@NotNull DataChannel dataChannel, @Nullable String str, long j, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x00cb
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.p2pengine.core.p2p.DataChannelMsgListener
    public void onDataChannelRequest(@org.jetbrains.annotations.NotNull com.p2pengine.core.p2p.DataChannel r17, @org.jetbrains.annotations.Nullable java.lang.String r18, long r19, int r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.dash.C3930e.onDataChannelRequest(com.p2pengine.core.p2p.DataChannel, java.lang.String, long, int, boolean, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.SynthesizerListener
    public void onSynthesizerAbort(@NotNull C3961c c3961c) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.SynthesizerListener
    public void onSynthesizerError(@NotNull C3961c c3961c, @Nullable SegmentBase segmentBase) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0072
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.p2pengine.core.p2p.SynthesizerListener
    public void onSynthesizerOutput(@org.jetbrains.annotations.NotNull com.p2pengine.core.segment.SegmentBase r8, @org.jetbrains.annotations.NotNull com.p2pengine.core.p2p.C3974p r9) {
        /*
            r7 = this;
            return
        L84:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.dash.C3930e.onSynthesizerOutput(com.p2pengine.core.segment.SegmentBase, com.p2pengine.core.p2p.p):void");
    }
}
