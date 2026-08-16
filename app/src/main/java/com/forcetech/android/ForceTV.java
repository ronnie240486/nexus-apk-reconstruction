package com.forcetech.android;

/* JADX INFO: loaded from: classes.dex */
public class ForceTV {

    /* JADX INFO: renamed from: a */
    public boolean f10924a;

    static {
        System.loadLibrary("forcetv");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0020
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public void m17276a() {
        /*
            r5 = this;
            return
        L4d:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forcetech.android.ForceTV.m17276a():void");
    }

    public native int start(int i, int i2);

    public native int stop();
}
