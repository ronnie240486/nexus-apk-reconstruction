package org.xutils.common.task;

import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class PriorityExecutor implements Executor {

    /* JADX INFO: renamed from: b */
    public static final int f17960b = 5;

    /* JADX INFO: renamed from: c */
    public static final int f17961c = 256;

    /* JADX INFO: renamed from: d */
    public static final int f17962d = 1;

    /* JADX INFO: renamed from: e */
    public static final AtomicLong f17963e = new AtomicLong(0);

    /* JADX INFO: renamed from: f */
    public static final ThreadFactory f17964f = new ThreadFactory() { // from class: org.xutils.common.task.PriorityExecutor.1

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f17968a;

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return null;
        }
    };

    /* JADX INFO: renamed from: g */
    public static final Comparator<Runnable> f17965g = new Comparator<Runnable>() { // from class: org.xutils.common.task.PriorityExecutor.2
        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public int m26761a(Runnable runnable, Runnable runnable2) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Runnable runnable, Runnable runnable2) {
            return 0;
        }
    };

    /* JADX INFO: renamed from: h */
    public static final Comparator<Runnable> f17966h = new Comparator<Runnable>() { // from class: org.xutils.common.task.PriorityExecutor.3
        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public int m26762a(Runnable runnable, Runnable runnable2) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Runnable runnable, Runnable runnable2) {
            return 0;
        }
    };

    /* JADX INFO: renamed from: a */
    public final ThreadPoolExecutor f17967a;

    /* JADX WARN: Invalid debug info offset */
    public PriorityExecutor(int i, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PriorityExecutor(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public int m26757a() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public ThreadPoolExecutor m26758b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public boolean m26759c() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public void m26760d(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
    }
}
