package com.tencent.smtt.sdk;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TbsBaseConfig {
    public static final String TAG = "TbsBaseConfig";

    /* JADX INFO: renamed from: a */
    Map<String, String> f12798a;

    /* JADX INFO: renamed from: b */
    private Context f12799b;

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0017
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    private static java.io.File m18894a(android.content.Context r2, java.lang.String r3) {
        /*
            r0 = 0
            return r0
        L1b:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsBaseConfig.m18894a(android.content.Context, java.lang.String):java.io.File");
    }

    /* JADX WARN: Invalid debug info offset */
    public void clear() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void commit() {
        /*
            r1 = this;
            return
        L6:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsBaseConfig.commit():void");
    }

    public abstract String getConfigFileName();

    /* JADX WARN: Invalid debug info offset */
    public Map<String, String> getPVCLocal() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void init(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void refreshSyncMap(android.content.Context r6) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsBaseConfig.refreshSyncMap(android.content.Context):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public void update(Map<String, String> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void writeTbsDownloadInfo() {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsBaseConfig.writeTbsDownloadInfo():void");
    }
}
