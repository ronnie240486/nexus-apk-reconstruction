package com.p2pengine.core.tracking;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p000.InterfaceC0401G8;
import p000.InterfaceC0591J8;

/* JADX INFO: renamed from: com.p2pengine.core.tracking.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C3996d implements InterfaceC0591J8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3995c f12187a;

    /* JADX WARN: Invalid debug info offset */
    public C3996d(C3995c c3995c) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0591J8
    public void onFailure(@NotNull InterfaceC0401G8 interfaceC0401G8, @NotNull IOException iOException) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0024
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // p000.InterfaceC0591J8
    public void onResponse(@org.jetbrains.annotations.NotNull p000.InterfaceC0401G8 r3, @org.jetbrains.annotations.NotNull p000.C4934oO r4) {
        /*
            r2 = this;
            return
        L4d:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.tracking.C3996d.onResponse(G8, oO):void");
    }
}
