package p000;

import java.net.Socket;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: wb */
/* JADX INFO: loaded from: classes.dex */
public final class C5665wb {

    /* JADX INFO: renamed from: g */
    public static final Executor f19321g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C1194SZ.m5628H("OkHttp ConnectionPool", true));

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ boolean f19322h = false;

    /* JADX INFO: renamed from: a */
    public final int f19323a;

    /* JADX INFO: renamed from: b */
    public final long f19324b;

    /* JADX INFO: renamed from: c */
    public final Runnable f19325c;

    /* JADX INFO: renamed from: d */
    public final Deque<C0352FM> f19326d;

    /* JADX INFO: renamed from: e */
    public final C0993PO f19327e;

    /* JADX INFO: renamed from: f */
    public boolean f19328f;

    /* JADX INFO: renamed from: wb$a */
    /* JADX INFO: loaded from: classes2.dex */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C5665wb f19329a;

        /* JADX WARN: Invalid debug info offset */
        public a(C5665wb c5665wb) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0022
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.lang.Runnable
        public void run() {
            /*
                r6 = this;
                return
            L29:
            L2b:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C5665wb.a.run():void");
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C5665wb() {
    }

    /* JADX WARN: Invalid debug info offset */
    public C5665wb(int i, long j, TimeUnit timeUnit) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public long m29289a(long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public boolean m29290b(C0352FM c0352fm) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public synchronized int m29291c() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: d */
    public Socket m29292d(C3012c2 c3012c2, C5180pT c5180pT) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: e */
    public void m29293e() {
        /*
            r4 = this;
            return
        L2a:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5665wb.m29293e():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: f */
    public C0352FM m29294f(C3012c2 c3012c2, C5180pT c5180pT, C0927OO c0927oo) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public synchronized int m29295g() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final int m29296h(C0352FM c0352fm, long j) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public void m29297i(C0352FM c0352fm) {
    }
}
