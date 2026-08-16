package com.squareup.picasso;

import android.net.NetworkInfo;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
class PicassoExecutorService extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: a */
    public static final int f12505a = 3;

    public static final class PicassoFutureTask extends FutureTask<BitmapHunter> implements Comparable<PicassoFutureTask> {

        /* JADX INFO: renamed from: a */
        public final BitmapHunter f12506a;

        /* JADX WARN: Invalid debug info offset */
        public PicassoFutureTask(BitmapHunter bitmapHunter) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public int m18719a(PicassoFutureTask picassoFutureTask) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(PicassoFutureTask picassoFutureTask) {
            return 0;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m18717a(NetworkInfo networkInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final void m18718b(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return null;
    }
}
