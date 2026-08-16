package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes2.dex */
public class L30 {

    /* JADX INFO: renamed from: a */
    public final Handler.Callback f1721a;

    /* JADX INFO: renamed from: b */
    public final HandlerC0716b f1722b;

    /* JADX INFO: renamed from: c */
    public Lock f1723c;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public final C0715a f1724d;

    /* JADX INFO: renamed from: L30$a */
    public static class C0715a {

        /* JADX INFO: renamed from: a */
        @Nullable
        public C0715a f1725a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public C0715a f1726b;

        /* JADX INFO: renamed from: c */
        @NonNull
        public final Runnable f1727c;

        /* JADX INFO: renamed from: d */
        @NonNull
        public final RunnableC0717c f1728d;

        /* JADX INFO: renamed from: e */
        @NonNull
        public Lock f1729e;

        /* JADX WARN: Invalid debug info offset */
        public C0715a(@NonNull Lock lock, @NonNull Runnable runnable) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public void m3378a(@androidx.annotation.NonNull p000.L30.C0715a r2) {
            /*
                r1 = this;
                return
            Lc:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.L30.C0715a.m3378a(L30$a):void");
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: b */
        public p000.L30.RunnableC0717c m3379b() {
            /*
                r2 = this;
                r0 = 0
                return r0
            Le:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.L30.C0715a.m3379b():L30$c");
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @androidx.annotation.Nullable
        /* JADX INFO: renamed from: c */
        public p000.L30.RunnableC0717c m3380c(java.lang.Runnable r3) {
            /*
                r2 = this;
                r0 = 0
                return r0
            L17:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.L30.C0715a.m3380c(java.lang.Runnable):L30$c");
        }
    }

    /* JADX INFO: renamed from: L30$b */
    public static class HandlerC0716b extends Handler {

        /* JADX INFO: renamed from: a */
        public final WeakReference<Handler.Callback> f1730a;

        /* JADX WARN: Invalid debug info offset */
        public HandlerC0716b() {
        }

        /* JADX WARN: Invalid debug info offset */
        public HandlerC0716b(Looper looper) {
        }

        /* JADX WARN: Invalid debug info offset */
        public HandlerC0716b(Looper looper, WeakReference<Handler.Callback> weakReference) {
        }

        /* JADX WARN: Invalid debug info offset */
        public HandlerC0716b(WeakReference<Handler.Callback> weakReference) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
        }
    }

    /* JADX INFO: renamed from: L30$c */
    public static class RunnableC0717c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final WeakReference<Runnable> f1731a;

        /* JADX INFO: renamed from: b */
        public final WeakReference<C0715a> f1732b;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC0717c(WeakReference<Runnable> weakReference, WeakReference<C0715a> weakReference2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public L30() {
    }

    /* JADX WARN: Invalid debug info offset */
    public L30(@Nullable Handler.Callback callback) {
    }

    /* JADX WARN: Invalid debug info offset */
    public L30(@NonNull Looper looper) {
    }

    /* JADX WARN: Invalid debug info offset */
    public L30(@NonNull Looper looper, @NonNull Handler.Callback callback) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final Looper m3357a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final boolean m3358b(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final boolean m3359c(int i, Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final boolean m3360d(@NonNull Runnable runnable) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public final boolean m3361e(Runnable runnable) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public final boolean m3362f(@NonNull Runnable runnable, long j) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public final boolean m3363g(Runnable runnable, Object obj, long j) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final boolean m3364h(Runnable runnable, long j) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public final void m3365i(Runnable runnable) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final void m3366j(Runnable runnable, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final void m3367k(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public final void m3368l(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public final void m3369m(int i, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public final boolean m3370n(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public final boolean m3371o(int i, long j) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public final boolean m3372p(int i, long j) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public final boolean m3373q(Message message) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public final boolean m3374r(Message message) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public boolean m3375s(Message message, long j) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public final boolean m3376t(Message message, long j) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public final RunnableC0717c m3377u(@NonNull Runnable runnable) {
        return null;
    }
}
