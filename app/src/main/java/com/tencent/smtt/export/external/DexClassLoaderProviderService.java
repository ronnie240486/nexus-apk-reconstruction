package com.tencent.smtt.export.external;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
public class DexClassLoaderProviderService extends Service {
    private static final String LOGTAG = "dexloader";

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Service
    public void onCreate() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Service
    public void onDestroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r7, int r8, int r9) {
        /*
            r6 = this;
            r0 = 0
            return r0
        L65:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.export.external.DexClassLoaderProviderService.onStartCommand(android.content.Intent, int, int):int");
    }
}
