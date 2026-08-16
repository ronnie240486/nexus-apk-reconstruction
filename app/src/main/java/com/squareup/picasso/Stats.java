package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
class Stats {

    /* JADX INFO: renamed from: o */
    public static final int f12567o = 0;

    /* JADX INFO: renamed from: p */
    public static final int f12568p = 1;

    /* JADX INFO: renamed from: q */
    public static final int f12569q = 2;

    /* JADX INFO: renamed from: r */
    public static final int f12570r = 3;

    /* JADX INFO: renamed from: s */
    public static final int f12571s = 4;

    /* JADX INFO: renamed from: t */
    public static final String f12572t = "Picasso-Stats";

    /* JADX INFO: renamed from: a */
    public final HandlerThread f12573a;

    /* JADX INFO: renamed from: b */
    public final Cache f12574b;

    /* JADX INFO: renamed from: c */
    public final Handler f12575c;

    /* JADX INFO: renamed from: d */
    public long f12576d;

    /* JADX INFO: renamed from: e */
    public long f12577e;

    /* JADX INFO: renamed from: f */
    public long f12578f;

    /* JADX INFO: renamed from: g */
    public long f12579g;

    /* JADX INFO: renamed from: h */
    public long f12580h;

    /* JADX INFO: renamed from: i */
    public long f12581i;

    /* JADX INFO: renamed from: j */
    public long f12582j;

    /* JADX INFO: renamed from: k */
    public long f12583k;

    /* JADX INFO: renamed from: l */
    public int f12584l;

    /* JADX INFO: renamed from: m */
    public int f12585m;

    /* JADX INFO: renamed from: n */
    public int f12586n;

    public static class StatsHandler extends Handler {

        /* JADX INFO: renamed from: a */
        public final Stats f12587a;

        /* JADX INFO: renamed from: com.squareup.picasso.Stats$StatsHandler$1 */
        public class RunnableC40481 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Message f12588a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ StatsHandler f12589b;

            /* JADX WARN: Invalid debug info offset */
            public RunnableC40481(StatsHandler statsHandler, Message message) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public StatsHandler(Looper looper, Stats stats) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public Stats(Cache cache) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static long m18797g(int i, long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public StatsSnapshot m18798a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public void m18799b(Bitmap bitmap) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public void m18800c(Bitmap bitmap) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public void m18801d() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public void m18802e() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public void m18803f(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public void m18804h(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public void m18805i(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public void m18806j() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public void m18807k() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public void m18808l(Long l) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public final void m18809m(Bitmap bitmap, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public void m18810n() {
    }
}
