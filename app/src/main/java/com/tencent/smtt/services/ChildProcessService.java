package com.tencent.smtt.services;

import android.app.Service;
import com.tencent.smtt.export.external.interfaces.IX5ChildProcessService;

/* JADX INFO: loaded from: classes2.dex */
public class ChildProcessService extends Service {

    /* JADX INFO: renamed from: a */
    private IX5ChildProcessService f13176a;

    public static class Privileged extends ChildProcessService {
    }

    public static final class Privileged0 extends Privileged {
    }

    public static final class Privileged1 extends Privileged {
    }

    public static final class Privileged2 extends Privileged {
    }

    public static final class Privileged3 extends Privileged {
    }

    public static final class Privileged4 extends Privileged {
    }

    public static final class Privileged5 extends Privileged {
    }

    public static final class Privileged6 extends Privileged {
    }

    public static final class Privileged7 extends Privileged {
    }

    public static final class Privileged8 extends Privileged {
    }

    public static final class Privileged9 extends Privileged {
    }

    public static class Sandboxed extends ChildProcessService {
    }

    public static final class Sandboxed0 extends Sandboxed {
    }

    public static final class Sandboxed1 extends Sandboxed {
    }

    public static final class Sandboxed2 extends Sandboxed {
    }

    public static final class Sandboxed3 extends Sandboxed {
    }

    public static final class Sandboxed4 extends Sandboxed {
    }

    public static final class Sandboxed5 extends Sandboxed {
    }

    public static final class Sandboxed6 extends Sandboxed {
    }

    public static final class Sandboxed7 extends Sandboxed {
    }

    public static final class Sandboxed8 extends Sandboxed {
    }

    public static final class Sandboxed9 extends Sandboxed {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0022
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @android.annotation.SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    private void m19330a(android.content.Intent r5, java.lang.Throwable r6) {
        /*
            r4 = this;
            return
        L32:
        L35:
        L38:
        L3a:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.services.ChildProcessService.m19330a(android.content.Intent, java.lang.Throwable):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r10) {
        /*
            r9 = this;
            r0 = 0
            return r0
        L48:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.services.ChildProcessService.onBind(android.content.Intent):android.os.IBinder");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Service
    public void onCreate() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Service
    public void onDestroy() {
    }
}
