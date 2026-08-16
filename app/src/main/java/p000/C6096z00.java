package p000;

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: z00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6096z00 implements InterfaceC5838z8 {

    /* JADX INFO: renamed from: b */
    public static ExecutorService f19634b = Executors.newFixedThreadPool(2, new ThreadFactoryC1458Wc("VdCache"));

    /* JADX INFO: renamed from: c */
    public static volatile C6096z00 f19635c;

    /* JADX INFO: renamed from: a */
    public C4183cq f19636a;

    /* JADX INFO: renamed from: z00$a */
    public class AsyncTaskC5824a extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f19637a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C6096z00 f19638b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC5824a(C6096z00 c6096z00, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x001f
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
            */
        /* JADX INFO: renamed from: a */
        public java.lang.Boolean m29923a(java.lang.Void... r3) {
            /*
                r2 = this;
                r0 = 0
                return r0
            L1d:
            L1f:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C6096z00.AsyncTaskC5824a.m29923a(java.lang.Void[]):java.lang.Boolean");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C6096z00(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public static p000.C6096z00 m29919b(android.content.Context r2) {
        /*
            r0 = 0
            return r0
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6096z00.m29919b(android.content.Context):z00");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public String m29920c(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public void m29921d() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public void m29922e(String str) {
    }

    @Override // p000.InterfaceC5838z8
    /* JADX INFO: renamed from: a */
    public void mo19989a(File file, String str, int i) {
    }
}
