package org.dom4j.util;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleSingleton implements SingletonStrategy {

    /* JADX INFO: renamed from: a */
    public String f16928a;

    /* JADX INFO: renamed from: b */
    public Object f16929b;

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.util.SingletonStrategy
    /* JADX INFO: renamed from: a */
    public void mo24820a(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.util.SingletonStrategy
    /* JADX INFO: renamed from: b */
    public Object mo24821b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.dom4j.util.SingletonStrategy
    public void reset() {
        /*
            r2 = this;
            return
        L19:
        L25:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.util.SimpleSingleton.reset():void");
    }
}
