package com.p2pengine.core.tracking;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.p2pengine.core.geoip.C3933a;
import com.p2pengine.core.logger.C3946e;
import com.p2pengine.core.p2p.AbstractC3968j;
import com.p2pengine.core.p2p.C3964f;
import com.p2pengine.core.p2p.DataChannel;
import com.p2pengine.core.p2p.DataChannelListener;
import com.p2pengine.core.p2p.P2pConfig;
import com.p2pengine.core.p2p.P2pStatisticsListener;
import com.p2pengine.core.signaling.Signaling;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C4927oH;
import p000.InterfaceC0401G8;
import p000.InterfaceC0591J8;

/* JADX INFO: renamed from: com.p2pengine.core.tracking.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C3995c implements DataChannelListener {

    /* JADX INFO: renamed from: P */
    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    public static Context f12123P = null;

    /* JADX INFO: renamed from: Q */
    @Nullable
    public static File f12124Q = null;

    /* JADX INFO: renamed from: R */
    public static long f12125R = -1;

    /* JADX INFO: renamed from: S */
    public static long f12126S = 0;

    /* JADX INFO: renamed from: T */
    public static long f12127T = 0;

    /* JADX INFO: renamed from: U */
    public static long f12128U = 0;

    /* JADX INFO: renamed from: V */
    public static int f12129V = 0;

    /* JADX INFO: renamed from: W */
    @Nullable
    public static C3933a f12130W = null;

    /* JADX INFO: renamed from: X */
    public static boolean f12131X = true;

    /* JADX INFO: renamed from: Y */
    public static boolean f12132Y;

    /* JADX INFO: renamed from: Z */
    public static boolean f12133Z;

    /* JADX INFO: renamed from: A */
    public int f12135A;

    /* JADX INFO: renamed from: B */
    public boolean f12136B;

    /* JADX INFO: renamed from: C */
    public int f12137C;

    /* JADX INFO: renamed from: D */
    @NotNull
    public final AtomicInteger f12138D;

    /* JADX INFO: renamed from: E */
    @NotNull
    public final AtomicInteger f12139E;

    /* JADX INFO: renamed from: F */
    @NotNull
    public Timer f12140F;

    /* JADX INFO: renamed from: G */
    public boolean f12141G;

    /* JADX INFO: renamed from: H */
    public double f12142H;

    /* JADX INFO: renamed from: I */
    public int f12143I;

    /* JADX INFO: renamed from: J */
    public int f12144J;

    /* JADX INFO: renamed from: K */
    public boolean f12145K;

    /* JADX INFO: renamed from: L */
    @Nullable
    public C3946e f12146L;

    /* JADX INFO: renamed from: M */
    @NotNull
    public String f12147M;

    /* JADX INFO: renamed from: N */
    public volatile boolean f12148N;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f12149a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f12150b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final P2pConfig f12151c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public P2pStatisticsListener f12152d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final String f12153e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final StreamingType f12154f;

    /* JADX INFO: renamed from: g */
    public final boolean f12155g;

    /* JADX INFO: renamed from: h */
    public final boolean f12156h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final AbstractC3968j f12157i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final String f12158j;

    /* JADX INFO: renamed from: k */
    public int f12159k;

    /* JADX INFO: renamed from: l */
    public final int f12160l;

    /* JADX INFO: renamed from: m */
    public volatile boolean f12161m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public String f12162n;

    /* JADX INFO: renamed from: o */
    public volatile boolean f12163o;

    /* JADX INFO: renamed from: p */
    public int f12164p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final ConcurrentLinkedQueue<C3994b> f12165q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final ConcurrentLinkedQueue<C3994b> f12166r;

    /* JADX INFO: renamed from: s */
    public final long f12167s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final ConcurrentHashMap<String, DataChannel> f12168t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public Set<String> f12169u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public Set<String> f12170v;

    /* JADX INFO: renamed from: w */
    @Nullable
    public Signaling f12171w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public final C4927oH f12172x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public C3964f f12173y;

    /* JADX INFO: renamed from: z */
    @Nullable
    public Runnable f12174z;

    /* JADX INFO: renamed from: O */
    @NotNull
    public static final a f12122O = new a();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static Handler f12134a0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.p2pengine.core.tracking.c$a */
    public static final class a {
        /* JADX WARN: Invalid debug info offset */
        @Nullable
        /* JADX INFO: renamed from: a */
        public final File m18377a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public final void m18378a(@Nullable Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Nullable
        /* JADX INFO: renamed from: b */
        public final Context m18379b() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public final long m18380c() {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public final long m18381d() {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public final long m18382e() {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.tracking.c$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12175a;

        static {
            int[] iArr = new int[StreamingType.values().length];
            iArr[StreamingType.HLS.ordinal()] = 1;
            iArr[StreamingType.DASH.ordinal()] = 2;
            f12175a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.tracking.c$c */
    public static final class c implements InterfaceC0591J8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3995c f12176a;

        /* JADX WARN: Invalid debug info offset */
        public c(C3995c c3995c) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static final void m18383a(C3995c c3995c) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0591J8
        public void onFailure(@NotNull InterfaceC0401G8 interfaceC0401G8, @NotNull IOException iOException) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0018
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // p000.InterfaceC0591J8
        public void onResponse(@org.jetbrains.annotations.NotNull p000.InterfaceC0401G8 r4, @org.jetbrains.annotations.NotNull p000.C4934oO r5) {
            /*
                r3 = this;
                return
            L43:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.tracking.C3995c.c.onResponse(G8, oO):void");
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.tracking.c$d */
    public static final class d implements InterfaceC0591J8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3995c f12177a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f12178b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f12179c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f12180d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f12181e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f12182f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f12183g;

        /* JADX WARN: Invalid debug info offset */
        public d(C3995c c3995c, int i, int i2, int i3, int i4, int i5, int i6) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0591J8
        public void onFailure(@NotNull InterfaceC0401G8 interfaceC0401G8, @NotNull IOException iOException) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x001e
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // p000.InterfaceC0591J8
        public void onResponse(@org.jetbrains.annotations.NotNull p000.InterfaceC0401G8 r3, @org.jetbrains.annotations.NotNull p000.C4934oO r4) {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.tracking.C3995c.d.onResponse(G8, oO):void");
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.tracking.c$e */
    public static final class e extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3995c f12184a;

        /* JADX WARN: Invalid debug info offset */
        public e(C3995c c3995c) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.tracking.c$f */
    public static final class f extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3995c f12185a;

        /* JADX WARN: Invalid debug info offset */
        public f(C3995c c3995c) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0035
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            /*
                r4 = this;
                return
            L3b:
            L4c:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.tracking.C3995c.f.run():void");
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.tracking.c$g */
    public static final class g extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3995c f12186a;

        /* JADX WARN: Invalid debug info offset */
        public g(C3995c c3995c) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C3995c(@NotNull String str, @NotNull String str2, @NotNull P2pConfig p2pConfig, @Nullable P2pStatisticsListener p2pStatisticsListener, @NotNull String str3, @NotNull StreamingType streamingType, boolean z, boolean z2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static final Long m18349a(C3995c c3995c) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static final String m18350a(C3995c c3995c, String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static final Set<String> m18351a(Set<String> set, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static final void m18352a(InterfaceC0401G8 interfaceC0401G8) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x00ab
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static void m18353a(com.p2pengine.core.tracking.C3995c r4, int r5, int r6, java.lang.Object r7) {
        /*
            return
        Lb0:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.tracking.C3995c.m18353a(com.p2pengine.core.tracking.c, int, int, java.lang.Object):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static final void m18354a(C3995c c3995c, JsonObject jsonObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static final void m18355b(C3995c c3995c) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static final void m18356c(C3995c c3995c) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static final void m18357d(C3995c c3995c) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static final void m18358e(C3995c c3995c) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final DataChannel m18359a(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final DataChannel m18360a(String str, boolean z, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final String m18361a(int i, int i2, int i3, int i4, long j, boolean z, int i5, int i6) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final List<C3994b> m18362a(List<C3994b> list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0073
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public final void m18363a() {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.tracking.C3995c.m18363a():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18364a(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x02dd
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public final void m18365a(com.google.gson.JsonObject r23) {
        /*
            Method dump skipped, instruction units count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.tracking.C3995c.m18365a(com.google.gson.JsonObject):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x010e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public final void m18366a(java.lang.String r14, com.google.gson.JsonObject r15, java.lang.String r16, java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.tracking.C3995c.m18366a(java.lang.String, com.google.gson.JsonObject, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18367a(String str, String str2, String str3, boolean z, String str4) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18368a(String str, String str2, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x007a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public final void m18369a(boolean r21) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.tracking.C3995c.m18369a(boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final void m18370b() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final boolean m18371b(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x004b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: c */
    public final p000.C1003PY m18372c() {
        /*
            r7 = this;
            r0 = 0
            return r0
        L59:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.tracking.C3995c.m18372c():PY");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0016
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: d */
    public final long m18373d() {
        /*
            r6 = this;
            r0 = 0
            return r0
        L2a:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.tracking.C3995c.m18373d():long");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: e */
    public final synchronized void m18374e() {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.tracking.C3995c.m18374e():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x002a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: f */
    public final void m18375f() {
        /*
            r8 = this;
            return
        L3a:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.tracking.C3995c.m18375f():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0023
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: g */
    public final void m18376g() {
        /*
            r9 = this;
            return
        Lbb:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.tracking.C3995c.m18376g():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.DataChannelListener
    public void onDataChannelClose(@NotNull DataChannel dataChannel, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.DataChannelListener
    public void onDataChannelFail(@NotNull DataChannel dataChannel, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.DataChannelListener
    public void onDataChannelGetPeers(@NotNull DataChannel dataChannel) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.DataChannelListener
    public void onDataChannelMetaData(@NotNull DataChannel dataChannel, @NotNull JsonObject jsonObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.DataChannelListener
    public void onDataChannelOpen(@NotNull DataChannel dataChannel) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.DataChannelListener
    public void onDataChannelPeerSignal(@NotNull DataChannel dataChannel, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable JsonObject jsonObject, @Nullable String str4, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.DataChannelListener
    public void onDataChannelPeers(@NotNull DataChannel dataChannel, @NotNull List<C3994b> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.DataChannelListener
    public void onDataChannelSignal(@NotNull DataChannel dataChannel, @NotNull JsonArray jsonArray) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.DataChannelListener
    public void onDataChannelTimeout(@NotNull DataChannel dataChannel) {
    }
}
