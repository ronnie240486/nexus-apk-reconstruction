package com.p2pengine.core.p2p;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.p2pengine.core.abs.C3902b;
import com.p2pengine.core.geoip.C3933a;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C1003PY;
import p000.InterfaceC5459tm;
import p000.InterfaceC5750xt;

/* JADX INFO: loaded from: classes2.dex */
public class DataChannel implements PeerChannelListener, Comparable<DataChannel> {

    /* JADX INFO: renamed from: A */
    public volatile boolean f11794A;

    /* JADX INFO: renamed from: B */
    public volatile boolean f11795B;

    /* JADX INFO: renamed from: C */
    @NotNull
    public final ConcurrentLinkedQueue<Map<String, Object>> f11796C;

    /* JADX INFO: renamed from: D */
    public volatile int f11797D;

    /* JADX INFO: renamed from: E */
    public final int f11798E;

    /* JADX INFO: renamed from: F */
    @NotNull
    public volatile Queue<Object> f11799F;

    /* JADX INFO: renamed from: G */
    public volatile boolean f11800G;

    /* JADX INFO: renamed from: H */
    public int f11801H;

    /* JADX INFO: renamed from: I */
    @Nullable
    public C3966h f11802I;

    /* JADX INFO: renamed from: J */
    public int f11803J;

    /* JADX INFO: renamed from: K */
    public long f11804K;

    /* JADX INFO: renamed from: L */
    public long f11805L;

    /* JADX INFO: renamed from: M */
    public long f11806M;

    /* JADX INFO: renamed from: N */
    public int f11807N;

    /* JADX INFO: renamed from: O */
    @InterfaceC5750xt
    public final long f11808O;

    /* JADX INFO: renamed from: P */
    public long f11809P;

    /* JADX INFO: renamed from: Q */
    public int f11810Q;

    /* JADX INFO: renamed from: R */
    public int f11811R;

    /* JADX INFO: renamed from: S */
    @InterfaceC5750xt
    public long f11812S;

    /* JADX INFO: renamed from: T */
    @InterfaceC5750xt
    public long f11813T;

    /* JADX INFO: renamed from: U */
    public boolean f11814U;

    /* JADX INFO: renamed from: V */
    public volatile int f11815V;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f11816a;

    /* JADX INFO: renamed from: b */
    public final boolean f11817b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final P2pConfig f11818c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public volatile DataChannelListener f11819d;

    /* JADX INFO: renamed from: e */
    public final boolean f11820e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final String f11821f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public String f11822g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public InterfaceC5459tm<? super ByteBuffer, ? super Integer, ? super C3961c, C1003PY> f11823h;

    /* JADX INFO: renamed from: i */
    @Nullable
    @InterfaceC5750xt
    public String f11824i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f11825j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final List<JsonObject> f11826k;

    /* JADX INFO: renamed from: l */
    @InterfaceC5750xt
    public volatile boolean f11827l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final String f11828m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public String f11829n;

    /* JADX INFO: renamed from: o */
    public boolean f11830o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public String f11831p;

    /* JADX INFO: renamed from: q */
    public boolean f11832q;

    /* JADX INFO: renamed from: r */
    public boolean f11833r;

    /* JADX INFO: renamed from: s */
    @InterfaceC5750xt
    public boolean f11834s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final PeerChannel f11835t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public final Map<String, C3902b> f11836u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public volatile C3961c f11837v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public final CopyOnWriteArraySet<String> f11838w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public final Runnable f11839x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public volatile DataChannelMsgListener f11840y;

    /* JADX INFO: renamed from: z */
    public volatile boolean f11841z;

    /* JADX WARN: Invalid debug info offset */
    public DataChannel(@NotNull String str, @NotNull String str2, boolean z, @NotNull P2pConfig p2pConfig, @Nullable DataChannelListener dataChannelListener, boolean z2, @NotNull String str3, @Nullable String str4, @Nullable C3964f c3964f) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static final void m18204a(DataChannel dataChannel) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final int m18205a(@NotNull List<? extends ByteBuffer> list) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18206a() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18207a(String str, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18208a(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18209a(@NotNull byte[] bArr, @NotNull String str, long j, int i, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final boolean m18210a(long j, int i, @NotNull String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final boolean m18211a(long j, @NotNull String str, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final boolean m18212a(long j, @NotNull String str, int i, boolean z, boolean z2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final boolean m18213a(@NotNull C3961c c3961c) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final boolean m18214a(@NotNull Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final <T> boolean m18215a(@NotNull T t, boolean z, int i, @Nullable C3933a c3933a, boolean z2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final boolean m18216a(@Nullable String str, long j, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final boolean m18217a(@Nullable String str, long j, int i, boolean z, boolean z2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final boolean m18218a(@NotNull String str, @NotNull String str2, @Nullable JsonObject jsonObject) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final boolean m18219a(@NotNull String str, @NotNull String str2, @Nullable String str3, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final boolean m18220a(@NotNull String str, @Nullable String str2, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public final boolean m18221a(java.util.Map<java.lang.String, ? extends java.lang.Object> r3) {
        /*
            r2 = this;
            r0 = 0
            return r0
        L12:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.p2p.DataChannel.m18221a(java.util.Map):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final int m18222b() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final boolean m18223b(Map<String, ? extends Object> map) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final boolean m18224b(boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final void m18225c() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.Comparable
    public int compareTo(DataChannel dataChannel) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final synchronized boolean m18226d() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x005d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.p2pengine.core.p2p.PeerChannelListener
    public void didReceiveBinaryMessage(@org.jetbrains.annotations.NotNull java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.p2p.DataChannel.didReceiveBinaryMessage(java.nio.ByteBuffer):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0234
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.p2pengine.core.p2p.PeerChannelListener
    public void didReceiveJSONMessage(@org.jetbrains.annotations.NotNull com.google.gson.JsonObject r13) {
        /*
            Method dump skipped, instruction units count: 1414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.p2p.DataChannel.didReceiveJSONMessage(com.google.gson.JsonObject):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public final void m18227e() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public final boolean m18228f() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.PeerChannelListener
    public void onSignal(@NotNull JsonObject jsonObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.PeerChannelListener
    public void onSignalBatch(@NotNull JsonArray jsonArray) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0014
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.p2pengine.core.p2p.PeerChannelListener
    public void peerChannelDidClose() {
        /*
            r3 = this;
            return
        L1d:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.p2p.DataChannel.peerChannelDidClose():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.PeerChannelListener
    public void peerChannelDidDisconnect() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0014
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.p2pengine.core.p2p.PeerChannelListener
    public void peerChannelDidFail() {
        /*
            r3 = this;
            return
        L1f:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.p2p.DataChannel.peerChannelDidFail():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.PeerChannelListener
    public void peerChannelDidOpen() {
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public String toString() {
        return null;
    }
}
