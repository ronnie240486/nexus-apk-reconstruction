package p000;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: dU */
/* JADX INFO: loaded from: classes.dex */
public class AsyncTaskC4224dU extends AsyncTask<Void, Integer, Boolean> {

    /* JADX INFO: renamed from: a */
    public CountDownLatch f13601a;

    /* JADX INFO: renamed from: b */
    public Runnable f13602b;

    /* JADX WARN: Invalid debug info offset */
    public AsyncTaskC4224dU(CountDownLatch countDownLatch, Runnable runnable) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m19921a() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public java.lang.Boolean m19922b(java.lang.Void... r1) {
        /*
            r0 = this;
            r0 = 0
            return r0
        La:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AsyncTaskC4224dU.m19922b(java.lang.Void[]):java.lang.Boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public void m19923c(Boolean bool) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.os.AsyncTask
    public void onCancelled() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
    }
}
