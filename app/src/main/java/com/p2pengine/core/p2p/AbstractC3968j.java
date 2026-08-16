package com.p2pengine.core.p2p;

import android.os.Handler;
import android.os.Looper;
import com.google.gson.JsonObject;
import com.p2pengine.core.segment.SegmentBase;
import com.p2pengine.core.segment.SegmentManager;
import com.p2pengine.core.segment.SegmentState;
import com.p2pengine.core.tracking.C3993a;
import com.p2pengine.core.tracking.StreamingType;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.InterfaceC5750xt;

/* JADX INFO: renamed from: com.p2pengine.core.p2p.j */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3968j implements DataChannelMsgListener {

    /* JADX INFO: renamed from: z */
    @NotNull
    @InterfaceC5750xt
    public static Handler f11964z = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    @NotNull
    public P2pConfig f11965a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public P2pStatisticsListener f11966b;

    /* JADX INFO: renamed from: c */
    public boolean f11967c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final ExecutorService f11968d;

    /* JADX INFO: renamed from: e */
    public long f11969e;

    /* JADX INFO: renamed from: f */
    public volatile long f11970f;

    /* JADX INFO: renamed from: g */
    public boolean f11971g;

    /* JADX INFO: renamed from: h */
    public int f11972h;

    /* JADX INFO: renamed from: i */
    public int f11973i;

    /* JADX INFO: renamed from: j */
    public int f11974j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public volatile SegmentManager f11975k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public volatile SegmentBase f11976l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public AtomicInteger f11977m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public AtomicInteger f11978n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public AtomicInteger f11979o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public AtomicInteger f11980p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final C3993a f11981q;

    /* JADX INFO: renamed from: r */
    public int f11982r;

    /* JADX INFO: renamed from: s */
    @NotNull
    @InterfaceC5750xt
    public final C3967i f11983s;

    /* JADX INFO: renamed from: t */
    @NotNull
    @InterfaceC5750xt
    public final C3967i f11984t;

    /* JADX INFO: renamed from: u */
    public int f11985u;

    /* JADX INFO: renamed from: v */
    @NotNull
    @InterfaceC5750xt
    public C3965g f11986v;

    /* JADX INFO: renamed from: w */
    @NotNull
    @InterfaceC5750xt
    public final Object f11987w;

    /* JADX INFO: renamed from: x */
    @InterfaceC5750xt
    public long f11988x;

    /* JADX INFO: renamed from: y */
    @NotNull
    public final C3959a f11989y;

    /* JADX INFO: renamed from: com.p2pengine.core.p2p.j$a */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC3968j f11990a;

        /* JADX WARN: Invalid debug info offset */
        public a(AbstractC3968j abstractC3968j) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static final void m18284a(AbstractC3968j abstractC3968j) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.p2p.j$b */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC3968j f11991a;

        /* JADX WARN: Invalid debug info offset */
        public b(AbstractC3968j abstractC3968j) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static final void m18285a(AbstractC3968j abstractC3968j) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public AbstractC3968j(@NotNull P2pConfig p2pConfig, @Nullable P2pStatisticsListener p2pStatisticsListener, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static final Long m18269a(AbstractC3968j abstractC3968j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static final void m18270a(AbstractC3968j abstractC3968j, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static final void m18271a(AbstractC3968j abstractC3968j, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static final void m18272a(AbstractC3968j abstractC3968j, ArrayList arrayList) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static final void m18273b(AbstractC3968j abstractC3968j, int i, int i2) {
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract SegmentBase mo18143a(@NotNull SegmentBase segmentBase);

    /* JADX INFO: renamed from: a */
    public abstract void mo18144a();

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18274a(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18275a(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void mo18145a(@NotNull DataChannel dataChannel) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void mo18146a(@NotNull DataChannel dataChannel, @NotNull JsonObject jsonObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18276a(@NotNull DataChannel dataChannel, @NotNull String str, @Nullable String str2, long j, int i, @NotNull SegmentState segmentState) {
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo18147a(@NotNull String str);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public void mo18151b() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final void m18277b(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final void m18278b(int i, int i2) {
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo18152b(@NotNull DataChannel dataChannel);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final int m18279c() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final void m18280c(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: d */
    public final long m18281d() {
        /*
            r4 = this;
            r0 = 0
            return r0
        L23:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.p2p.AbstractC3968j.m18281d():long");
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public abstract StreamingType mo18156e();

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public final boolean m18282f() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public final void m18283g() {
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo18157h();

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.DataChannelMsgListener
    public void onDataChannelDisconnect(@NotNull DataChannel dataChannel) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.DataChannelMsgListener
    public void onDataChannelPieceAbort(@NotNull DataChannel dataChannel, long j, @NotNull String str, int i, @Nullable String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.DataChannelMsgListener
    public void onDataChannelPieceAck(@NotNull DataChannel dataChannel, @NotNull String str, int i, int i2) {
    }
}
