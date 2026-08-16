package android.media.ViviTV.service;

import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class MainService extends Service implements Runnable {

    /* JADX INFO: renamed from: e */
    public static final String f9621e = "ViviTV/MainSvc";

    /* JADX INFO: renamed from: a */
    public boolean f9622a;

    /* JADX INFO: renamed from: b */
    public int f9623b;

    /* JADX INFO: renamed from: c */
    public Handler f9624c;

    /* JADX INFO: renamed from: d */
    public Runnable f9625d;

    /* JADX INFO: renamed from: android.media.ViviTV.service.MainService$a */
    public class RunnableC2316a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MainService f9626a;

        /* JADX INFO: renamed from: android.media.ViviTV.service.MainService$a$a */
        public class a extends AsyncTask<Void, Integer, Boolean> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ RunnableC2316a f9627a;

            /* JADX WARN: Invalid debug info offset */
            public a(RunnableC2316a runnableC2316a) {
            }

            /* JADX WARN: Invalid debug info offset */
            /* JADX INFO: renamed from: a */
            public Boolean m14100a(Void... voidArr) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.AsyncTask
            public /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
                return null;
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2316a(MainService mainService) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14094a(MainService mainService) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final void m14095b() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: c */
    public final void m14096c() {
        /*
            r4 = this;
            return
        L20:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.service.MainService.m14096c():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final void m14097d() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public final void m14098e() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: f */
    public final boolean m14099f() {
        /*
            r4 = this;
            r0 = 0
            return r0
        L1d:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.service.MainService.m14099f():boolean");
    }

    /* JADX WARN: Invalid debug info offset */
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

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0029
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.lang.Runnable
    public void run() {
        /*
            r2 = this;
            return
        L2d:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.service.MainService.run():void");
    }
}
