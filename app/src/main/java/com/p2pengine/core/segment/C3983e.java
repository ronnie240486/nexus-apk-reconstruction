package com.p2pengine.core.segment;

import com.p2pengine.core.p2p.C3961c;
import com.p2pengine.core.p2p.Destroyer;
import com.p2pengine.core.p2p.StreamListener;
import com.p2pengine.core.p2p.StreamListenerAdder;
import java.nio.ByteBuffer;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.p2pengine.core.segment.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C3983e implements Destroyer, StreamListenerAdder {

    /* JADX INFO: renamed from: a */
    @NotNull
    public C3961c f12063a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<ByteBuffer> f12064b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public List<StreamListener> f12065c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f12066d;

    /* JADX WARN: Invalid debug info offset */
    public C3983e(long j, int i, @NotNull String str, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0036
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.p2pengine.core.p2p.StreamListenerAdder
    public void addStreamListener(boolean r4, @org.jetbrains.annotations.NotNull com.p2pengine.core.p2p.StreamListener r5) {
        /*
            r3 = this;
            return
        L3d:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.segment.C3983e.addStreamListener(boolean, com.p2pengine.core.p2p.StreamListener):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.p2pengine.core.p2p.Destroyer
    public void destroy() {
        /*
            r5 = this;
            return
        L24:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.segment.C3983e.destroy():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0035
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.p2pengine.core.p2p.StreamListenerAdder
    public void removeStreamListener(@org.jetbrains.annotations.NotNull java.lang.String r4) {
        /*
            r3 = this;
            return
        L51:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.segment.C3983e.removeStreamListener(java.lang.String):void");
    }
}
