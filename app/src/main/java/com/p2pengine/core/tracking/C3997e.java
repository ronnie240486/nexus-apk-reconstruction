package com.p2pengine.core.tracking;

import com.p2pengine.core.signaling.SignalListener;

/* JADX INFO: renamed from: com.p2pengine.core.tracking.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C3997e implements SignalListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3995c f12188a;

    /* JADX WARN: Invalid debug info offset */
    public C3997e(C3995c c3995c) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static final void m18384a(C3995c c3995c) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static final void m18385b(C3995c c3995c) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.SignalListener
    public void onClose() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x002a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.p2pengine.core.signaling.SignalListener
    public void onMessage(@org.jetbrains.annotations.NotNull com.google.gson.JsonObject r5, @org.jetbrains.annotations.Nullable java.lang.String r6) {
        /*
            r4 = this;
            return
        L32:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.tracking.C3997e.onMessage(com.google.gson.JsonObject, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.SignalListener
    public void onOpen() {
    }
}
