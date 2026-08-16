package com.p2pengine.core.signaling;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.p2pengine.core.utils.WsManager.AbstractC4007c;
import com.p2pengine.core.utils.WsManager.C4005a;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C4934oO;
import p000.C5222q8;

/* JADX INFO: renamed from: com.p2pengine.core.signaling.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C3989d implements Signaling {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f12091a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public SignalListener f12092b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final C4005a f12093c;

    /* JADX INFO: renamed from: d */
    public boolean f12094d;

    /* JADX INFO: renamed from: e */
    public boolean f12095e;

    /* JADX INFO: renamed from: f */
    public volatile int f12096f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final C3988c f12097g;

    /* JADX INFO: renamed from: com.p2pengine.core.signaling.d$a */
    public static final class a extends AbstractC4007c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3989d f12098a;

        /* JADX WARN: Invalid debug info offset */
        public a(C3989d c3989d) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.utils.WsManager.AbstractC4007c
        /* JADX INFO: renamed from: a */
        public void mo18340a() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.utils.WsManager.AbstractC4007c
        /* JADX INFO: renamed from: a */
        public void mo18341a(int i, @NotNull String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000a
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // com.p2pengine.core.utils.WsManager.AbstractC4007c
        /* JADX INFO: renamed from: a */
        public void mo18342a(@org.jetbrains.annotations.NotNull java.lang.String r6) {
            /*
                r5 = this;
                return
            L48:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.signaling.C3989d.a.mo18342a(java.lang.String):void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.utils.WsManager.AbstractC4007c
        /* JADX INFO: renamed from: a */
        public void mo18343a(@NotNull Throwable th) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.utils.WsManager.AbstractC4007c
        /* JADX INFO: renamed from: a */
        public void mo18344a(@NotNull C4934oO c4934oO) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.utils.WsManager.AbstractC4007c
        /* JADX INFO: renamed from: a */
        public void mo18345a(@NotNull C5222q8 c5222q8) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C3989d(@NotNull String str, @NotNull String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18339a(Map<String, ? extends Object> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.Signaling
    public void close() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.Signaling
    public void connect() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.Signaling
    public void destroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.Signaling
    @NotNull
    public String getName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.Signaling
    public boolean getNormalClosed() {
        return false;
    }

    @Override // com.p2pengine.core.signaling.Signaling
    public boolean isBackupConnected() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.p2pengine.core.signaling.Signaling
    public boolean isClosed() {
        /*
            r2 = this;
            r0 = 0
            return r0
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.signaling.C3989d.isClosed():boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.p2pengine.core.signaling.Signaling
    public boolean isOpen() {
        /*
            r3 = this;
            r0 = 0
            return r0
        L12:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.signaling.C3989d.isOpen():boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.p2pengine.core.signaling.Signaling
    public void reconnect() {
        /*
            r2 = this;
            return
        L18:
        L1c:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.signaling.C3989d.reconnect():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.Signaling
    public void sendReject(@NotNull String str, @Nullable String str2, boolean z, @Nullable String str3) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.Signaling
    public void sendSignal(@NotNull String str, @NotNull JsonObject jsonObject, @Nullable String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.Signaling
    public void sendSignalBatch(@NotNull String str, @NotNull JsonArray jsonArray, @Nullable String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.Signaling
    public void setListener(@Nullable SignalListener signalListener) {
    }
}
