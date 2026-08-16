package p000;

import android.os.AsyncTask;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: Th */
/* JADX INFO: loaded from: classes.dex */
public class AsyncTaskC1267Th extends AsyncTask<Void, Integer, Boolean> {

    /* JADX INFO: renamed from: d */
    public static final String f3306d = "progress";

    /* JADX INFO: renamed from: e */
    public static final String f3307e = "error";

    /* JADX INFO: renamed from: g */
    public static final String f3309g = "last_update_time";

    /* JADX INFO: renamed from: h */
    public static final String f3310h = "last_update_language";

    /* JADX INFO: renamed from: a */
    public int f3312a;

    /* JADX INFO: renamed from: b */
    public static final ExecutorService f3304b = Executors.newSingleThreadExecutor(new ThreadFactoryC1458Wc(C5984j00.f14657k));

    /* JADX INFO: renamed from: c */
    public static final String f3305c = AsyncTaskC1267Th.class.getName().concat(".ACTION_EPG_UPDATE_EVENT");

    /* JADX INFO: renamed from: f */
    public static volatile boolean f3308f = false;

    /* JADX INFO: renamed from: i */
    public static final SimpleDateFormat f3311i = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static String m6022b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static boolean m6023c() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static final void m6024h() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0014
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Boolean m6025a(java.lang.Void... r8) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AsyncTaskC1267Th.m6025a(java.lang.Void[]):java.lang.Boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final void m6026d(Boolean bool) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: e */
    public void m6027e(java.lang.Integer... r4) {
        /*
            r3 = this;
            return
        L27:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AsyncTaskC1267Th.m6027e(java.lang.Integer[]):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: f */
    public final android.media.ViviTV.model.persistent.EpgItemInfo m6028f(android.util.JsonReader r5) throws java.lang.Exception {
        /*
            r4 = this;
            r0 = 0
            return r0
        L1f:
        L53:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AsyncTaskC1267Th.m6028f(android.util.JsonReader):android.media.ViviTV.model.persistent.EpgItemInfo");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: g */
    public final void m6029g() {
        /*
            r3 = this;
            return
        L21:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AsyncTaskC1267Th.m6029g():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: i */
    public final boolean m6030i(java.lang.String r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AsyncTaskC1267Th.m6030i(java.lang.String):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onProgressUpdate(Integer[] numArr) {
    }
}
