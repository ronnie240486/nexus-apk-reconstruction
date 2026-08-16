package org.dom4j.util;

/* JADX INFO: loaded from: classes2.dex */
public class PerThreadSingleton implements SingletonStrategy {

    /* JADX INFO: renamed from: a */
    public String f16925a;

    /* JADX INFO: renamed from: b */
    public ThreadLocal f16926b;

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.util.SingletonStrategy
    /* JADX INFO: renamed from: a */
    public void mo24820a(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0016
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.dom4j.util.SingletonStrategy
    /* JADX INFO: renamed from: b */
    public java.lang.Object mo24821b() {
        /*
            r3 = this;
            r0 = 0
            return r0
        L29:
        L34:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.util.PerThreadSingleton.mo24821b():java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.util.SingletonStrategy
    public void reset() {
    }
}
