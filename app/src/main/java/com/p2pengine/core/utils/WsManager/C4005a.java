package com.p2pengine.core.utils.WsManager;

import android.content.Context;
import java.util.concurrent.locks.Lock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C0162CN;
import p000.C4927oH;
import p000.C5222q8;
import p000.Q30;
import p000.R30;

/* JADX INFO: renamed from: com.p2pengine.core.utils.WsManager.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C4005a implements IWsManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f12214a;

    /* JADX INFO: renamed from: b */
    public int f12215b;

    /* JADX INFO: renamed from: c */
    public final int f12216c;

    /* JADX INFO: renamed from: d */
    public final double f12217d;

    /* JADX INFO: renamed from: e */
    public final int f12218e;

    /* JADX INFO: renamed from: f */
    public final int f12219f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final String f12220g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Q30 f12221h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public C4927oH f12222i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public C0162CN f12223j;

    /* JADX INFO: renamed from: k */
    public int f12224k;

    /* JADX INFO: renamed from: l */
    public final boolean f12225l;

    /* JADX INFO: renamed from: m */
    public boolean f12226m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public AbstractC4007c f12227n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final Lock f12228o;

    /* JADX INFO: renamed from: p */
    public int f12229p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final Runnable f12230q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final R30 f12231r;

    /* JADX INFO: renamed from: com.p2pengine.core.utils.WsManager.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Context f12232a;

        /* JADX INFO: renamed from: b */
        public String f12233b;

        /* JADX INFO: renamed from: c */
        public boolean f12234c;

        /* JADX INFO: renamed from: d */
        public int f12235d;

        /* JADX INFO: renamed from: e */
        public double f12236e;

        /* JADX INFO: renamed from: f */
        public int f12237f;

        /* JADX INFO: renamed from: g */
        public int f12238g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public C4927oH f12239h;

        /* JADX WARN: Invalid debug info offset */
        public a(@NotNull Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final a m18399a(double d) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final a m18400a(int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final a m18401a(@NotNull String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final a m18402a(@Nullable C4927oH c4927oH) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final a m18403a(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final C4005a m18404a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        /* JADX INFO: renamed from: b */
        public final Context m18405b() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Nullable
        /* JADX INFO: renamed from: c */
        public final C4927oH m18406c() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public final boolean m18407d() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public final int m18408e() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public final int m18409f() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g */
        public final int m18410g() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public final double m18411h() {
            return 0.0d;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        /* JADX INFO: renamed from: i */
        public final String m18412i() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.utils.WsManager.a$b */
    public static final class b extends R30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C4005a f12240a;

        /* JADX WARN: Invalid debug info offset */
        public b(C4005a c4005a) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000e
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // p000.R30
        public void onClosed(@org.jetbrains.annotations.NotNull p000.Q30 r2, int r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            /*
                r1 = this;
                return
            L1c:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.utils.WsManager.C4005a.b.onClosed(Q30, int, java.lang.String):void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.R30
        public void onClosing(@NotNull Q30 q30, int i, @NotNull String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000e
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // p000.R30
        public void onFailure(@org.jetbrains.annotations.NotNull p000.Q30 r1, @org.jetbrains.annotations.NotNull java.lang.Throwable r2, @org.jetbrains.annotations.Nullable p000.C4934oO r3) {
            /*
                r0 = this;
                return
            L21:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.utils.WsManager.C4005a.b.onFailure(Q30, java.lang.Throwable, oO):void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.R30
        public void onMessage(@NotNull Q30 q30, @NotNull String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.R30
        public void onMessage(@NotNull Q30 q30, @NotNull C5222q8 c5222q8) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0010
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // p000.R30
        public void onOpen(@org.jetbrains.annotations.NotNull p000.Q30 r3, @org.jetbrains.annotations.NotNull p000.C4934oO r4) {
            /*
                r2 = this;
                return
            L30:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.utils.WsManager.C4005a.b.onOpen(Q30, oO):void");
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C4005a(@NotNull a aVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static final void m18394a(C4005a c4005a) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public final synchronized void m18395a() {
        /*
            r3 = this;
            return
        L19:
        L26:
        L7e:
        L80:
        L8b:
        L90:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.utils.WsManager.C4005a.m18395a():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18396a(@Nullable AbstractC4007c abstractC4007c) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public final boolean m18397a(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            return r0
        L31:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.utils.WsManager.C4005a.m18397a(java.lang.Object):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0026
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public final void m18398b() {
        /*
            r5 = this;
            return
        L2a:
        L5f:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.utils.WsManager.C4005a.m18398b():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.utils.WsManager.IWsManager
    public synchronized int getCurrentStatus() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.utils.WsManager.IWsManager
    @NotNull
    public Q30 getWebSocket() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.p2pengine.core.utils.WsManager.IWsManager
    public synchronized boolean isWsConnected() {
        /*
            r2 = this;
            r0 = 0
            return r0
        Lc:
        Le:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.utils.WsManager.C4005a.isWsConnected():boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.utils.WsManager.IWsManager
    public boolean sendMessage(@NotNull String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.utils.WsManager.IWsManager
    public boolean sendMessage(@NotNull C5222q8 c5222q8) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.p2pengine.core.utils.WsManager.IWsManager
    public synchronized void setCurrentStatus(int r1) {
        /*
            r0 = this;
            return
        L5:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.utils.WsManager.C4005a.setCurrentStatus(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.utils.WsManager.IWsManager
    public void startConnect() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0011
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.p2pengine.core.utils.WsManager.IWsManager
    public void stopConnect() {
        /*
            r3 = this;
            return
        L3a:
        L3d:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.utils.WsManager.C4005a.stopConnect():void");
    }
}
