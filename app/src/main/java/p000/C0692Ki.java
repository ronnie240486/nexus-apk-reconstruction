package p000;

import android.util.Log;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: Ki */
/* JADX INFO: loaded from: classes.dex */
public class C0692Ki extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: c */
    public static final String f1667c = "PriorityExecutor";

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f1668a;

    /* JADX INFO: renamed from: b */
    public final d f1669b;

    /* JADX INFO: renamed from: Ki$b */
    public static class b implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public int f1670a;

        /* JADX INFO: renamed from: Ki$b$a */
        public class a extends Thread {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ b f1671a;

            /* JADX WARN: Invalid debug info offset */
            public a(b bVar, Runnable runnable, String str) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return null;
        }
    }

    /* JADX INFO: renamed from: Ki$c */
    public static class c<T> extends FutureTask<T> implements Comparable<c<?>> {

        /* JADX INFO: renamed from: a */
        public final int f1672a;

        /* JADX INFO: renamed from: b */
        public final int f1673b;

        /* JADX WARN: Invalid debug info offset */
        public c(Runnable runnable, T t, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public int m3268a(c<?> cVar) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(c<?> cVar) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public boolean equals(Object obj) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        public int hashCode() {
            return 0;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C0692Ki(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public C0692Ki(int i, int i2, long j, TimeUnit timeUnit, ThreadFactory threadFactory, d dVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    public C0692Ki(int i, d dVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0017
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(java.lang.Runnable r1, java.lang.Throwable r2) {
        /*
            r0 = this;
            return
        L1b:
        L22:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0692Ki.afterExecute(java.lang.Runnable, java.lang.Throwable):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.concurrent.AbstractExecutorService
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: Ki$d */
    public static class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d IGNORE;
        public static final d LOG;
        public static final d THROW;

        /* JADX INFO: renamed from: Ki$d$a */
        public static enum a extends d {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // p000.C0692Ki.d
            public void handle(Throwable th) {
                if (Log.isLoggable(C0692Ki.f1667c, 6)) {
                    Log.e(C0692Ki.f1667c, "Request threw uncaught throwable", th);
                }
            }
        }

        /* JADX INFO: renamed from: Ki$d$b */
        public static enum b extends d {
            public b(String str, int i) {
                super(str, i);
            }

            @Override // p000.C0692Ki.d
            public void handle(Throwable th) {
                super.handle(th);
                throw new RuntimeException(th);
            }
        }

        static {
            d dVar = new d("IGNORE", 0);
            IGNORE = dVar;
            a aVar = new a("LOG", 1);
            LOG = aVar;
            b bVar = new b("THROW", 2);
            THROW = bVar;
            $VALUES = new d[]{dVar, aVar, bVar};
        }

        private d(String str, int i) {
            super(str, i);
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }

        public void handle(Throwable th) {
        }
    }
}
