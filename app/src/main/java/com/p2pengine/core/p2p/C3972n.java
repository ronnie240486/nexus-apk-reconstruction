package com.p2pengine.core.p2p;

import com.p2pengine.core.segment.SegmentBase;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.InterfaceC0401G8;

/* JADX INFO: renamed from: com.p2pengine.core.p2p.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C3972n implements StreamListenerAdder, Destroyer {

    /* JADX INFO: renamed from: A */
    public volatile int f12002A;

    /* JADX INFO: renamed from: B */
    public long f12003B;

    /* JADX INFO: renamed from: C */
    public volatile boolean f12004C;

    /* JADX INFO: renamed from: D */
    public volatile boolean f12005D;

    /* JADX INFO: renamed from: E */
    public volatile boolean f12006E;

    /* JADX INFO: renamed from: F */
    @Nullable
    public InterfaceC0401G8 f12007F;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final C3959a f12008a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final P2pConfig f12009b;

    /* JADX INFO: renamed from: c */
    public final long f12010c;

    /* JADX INFO: renamed from: d */
    public final int f12011d;

    /* JADX INFO: renamed from: e */
    public final boolean f12012e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public volatile SynthesizerListener f12013f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final List<StreamListener> f12014g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final List<StreamListener> f12015h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<ByteBuffer> f12016i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final List<ByteBuffer> f12017j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public SegmentBase f12018k;

    /* JADX INFO: renamed from: l */
    public long f12019l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public C3961c f12020m;

    /* JADX INFO: renamed from: n */
    public long f12021n;

    /* JADX INFO: renamed from: o */
    public long f12022o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public DataChannel f12023p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public DataChannel f12024q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public volatile ByteBuffer[] f12025r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final Timer f12026s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public TimerTask f12027t;

    /* JADX INFO: renamed from: u */
    public volatile boolean f12028u;

    /* JADX INFO: renamed from: v */
    public volatile int f12029v;

    /* JADX INFO: renamed from: w */
    public volatile int f12030w;

    /* JADX INFO: renamed from: x */
    public volatile boolean f12031x;

    /* JADX INFO: renamed from: y */
    public boolean f12032y;

    /* JADX INFO: renamed from: z */
    public volatile int f12033z;

    /* JADX WARN: Invalid debug info offset */
    public C3972n(@NotNull C3959a c3959a, @NotNull P2pConfig p2pConfig, long j, int i, @Nullable String str, boolean z, @NotNull SynthesizerListener synthesizerListener, @Nullable C3973o c3973o) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static void m18287a(C3972n c3972n, DataChannel dataChannel, boolean z, int i, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18288a(C3972n c3972n, boolean z, boolean z2, int i, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x002c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static final void m18289a(java.lang.String r3, com.p2pengine.core.p2p.C3972n r4, java.util.List<com.p2pengine.core.p2p.StreamListener> r5) {
        /*
            return
        L52:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.p2p.C3972n.m18289a(java.lang.String, com.p2pengine.core.p2p.n, java.util.List):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final long m18290a(long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18291a() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18292a(long j, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18293a(@NotNull DataChannel dataChannel, @NotNull C3961c c3961c) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18294a(@NotNull C3973o c3973o) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18295a(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0019
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public final void m18296a(boolean r5, java.nio.ByteBuffer r6, int r7) {
        /*
            r4 = this;
            return
        L1f:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.p2p.C3972n.m18296a(boolean, java.nio.ByteBuffer, int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0125
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public final void m18297a(boolean r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.p2p.C3972n.m18297a(boolean, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final boolean m18298a(@NotNull DataChannel dataChannel) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final boolean m18299a(@NotNull String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x002e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public final boolean m18300a(boolean r12, int r13, java.nio.ByteBuffer r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.p2p.C3972n.m18300a(boolean, int, java.nio.ByteBuffer, boolean):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0040
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.p2pengine.core.p2p.StreamListenerAdder
    public void addStreamListener(boolean r5, @org.jetbrains.annotations.NotNull com.p2pengine.core.p2p.StreamListener r6) {
        /*
            r4 = this;
            return
        L45:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.p2p.C3972n.addStreamListener(boolean, com.p2pengine.core.p2p.StreamListener):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m18301b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public final void m18302b(long r4, boolean r6) {
        /*
            r3 = this;
            return
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.p2p.C3972n.m18302b(long, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final void m18303b(@NotNull DataChannel dataChannel) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final boolean m18304b(long j) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: c */
    public final String m18305c() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final void m18306c(@NotNull DataChannel dataChannel) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final void m18307d(@NotNull DataChannel dataChannel) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final boolean m18308d() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.p2pengine.core.p2p.Destroyer
    public synchronized void destroy() {
        /*
            r4 = this;
            return
        L67:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.p2p.C3972n.destroy():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public final boolean m18309e() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public final boolean m18310f() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public final boolean m18311g() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final boolean m18312h() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public final boolean m18313i() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final boolean m18314j() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final int m18315k() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0010
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: l */
    public final void m18316l() {
        /*
            r5 = this;
            return
        L2a:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.p2p.C3972n.m18316l():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public final int m18317m() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public final void m18318n() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public final boolean m18319o() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public final int m18320p() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.StreamListenerAdder
    public void removeStreamListener(@NotNull String str) {
    }
}
