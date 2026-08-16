package p000;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: HN */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0480HN<T, R> implements InterfaceFutureC0505Hm<R>, Runnable {

    /* JADX INFO: renamed from: l */
    public static final a f1060l = new a();

    /* JADX INFO: renamed from: a */
    public final Handler f1061a;

    /* JADX INFO: renamed from: b */
    public final int f1062b;

    /* JADX INFO: renamed from: c */
    public final int f1063c;

    /* JADX INFO: renamed from: d */
    public final boolean f1064d;

    /* JADX INFO: renamed from: e */
    public final a f1065e;

    /* JADX INFO: renamed from: f */
    public R f1066f;

    /* JADX INFO: renamed from: g */
    public InterfaceC0226DN f1067g;

    /* JADX INFO: renamed from: h */
    public boolean f1068h;

    /* JADX INFO: renamed from: i */
    public Exception f1069i;

    /* JADX INFO: renamed from: j */
    public boolean f1070j;

    /* JADX INFO: renamed from: k */
    public boolean f1071k;

    /* JADX INFO: renamed from: HN$a */
    public static class a {
        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m2299a(Object obj) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m2300b(Object obj, long j) throws InterruptedException {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public RunnableC0480HN(Handler handler, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RunnableC0480HN(Handler handler, int i, int i2, boolean z, a aVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4941oV
    /* JADX INFO: renamed from: a */
    public void mo2291a(InterfaceC5179pS interfaceC5179pS) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // p000.InterfaceC4941oV
    /* JADX INFO: renamed from: b */
    public synchronized void mo2292b(R r1, p000.InterfaceC4959on<? super R> r2) {
        /*
            r0 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC0480HN.mo2292b(java.lang.Object, on):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4941oV
    /* JADX INFO: renamed from: c */
    public void mo2293c(InterfaceC0226DN interfaceC0226DN) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Future
    public synchronized boolean cancel(boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceFutureC0505Hm
    public void clear() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final synchronized R m2294d(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // p000.InterfaceC4941oV
    /* JADX INFO: renamed from: e */
    public synchronized void mo2295e(java.lang.Exception r1, android.graphics.drawable.Drawable r2) {
        /*
            r0 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC0480HN.mo2295e(java.lang.Exception, android.graphics.drawable.Drawable):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.concurrent.Future
    public R get() throws ExecutionException, InterruptedException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.concurrent.Future
    public R get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4941oV
    /* JADX INFO: renamed from: h */
    public InterfaceC0226DN mo2297h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.Runnable
    public void run() {
    }

    @Override // p000.InterfaceC4941oV
    /* JADX INFO: renamed from: g */
    public void mo2296g(Drawable drawable) {
    }

    @Override // p000.InterfaceC4941oV
    /* JADX INFO: renamed from: i */
    public void mo2298i(Drawable drawable) {
    }

    @Override // p000.InterfaceC4317ev
    public void onDestroy() {
    }

    @Override // p000.InterfaceC4317ev
    public void onStart() {
    }

    @Override // p000.InterfaceC4317ev
    public void onStop() {
    }
}
