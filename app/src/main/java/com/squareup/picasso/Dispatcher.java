package com.squareup.picasso;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
class Dispatcher {

    /* JADX INFO: renamed from: A */
    public static final int f12394A = 8;

    /* JADX INFO: renamed from: B */
    public static final int f12395B = 9;

    /* JADX INFO: renamed from: C */
    public static final int f12396C = 10;

    /* JADX INFO: renamed from: D */
    public static final int f12397D = 11;

    /* JADX INFO: renamed from: E */
    public static final int f12398E = 12;

    /* JADX INFO: renamed from: F */
    public static final int f12399F = 13;

    /* JADX INFO: renamed from: G */
    public static final String f12400G = "Dispatcher";

    /* JADX INFO: renamed from: H */
    public static final int f12401H = 200;

    /* JADX INFO: renamed from: q */
    public static final int f12402q = 500;

    /* JADX INFO: renamed from: r */
    public static final int f12403r = 1;

    /* JADX INFO: renamed from: s */
    public static final int f12404s = 0;

    /* JADX INFO: renamed from: t */
    public static final int f12405t = 1;

    /* JADX INFO: renamed from: u */
    public static final int f12406u = 2;

    /* JADX INFO: renamed from: v */
    public static final int f12407v = 3;

    /* JADX INFO: renamed from: w */
    public static final int f12408w = 4;

    /* JADX INFO: renamed from: x */
    public static final int f12409x = 5;

    /* JADX INFO: renamed from: y */
    public static final int f12410y = 6;

    /* JADX INFO: renamed from: z */
    public static final int f12411z = 7;

    /* JADX INFO: renamed from: a */
    public final DispatcherThread f12412a;

    /* JADX INFO: renamed from: b */
    public final Context f12413b;

    /* JADX INFO: renamed from: c */
    public final ExecutorService f12414c;

    /* JADX INFO: renamed from: d */
    public final Downloader f12415d;

    /* JADX INFO: renamed from: e */
    public final Map<String, BitmapHunter> f12416e;

    /* JADX INFO: renamed from: f */
    public final Map<Object, Action> f12417f;

    /* JADX INFO: renamed from: g */
    public final Map<Object, Action> f12418g;

    /* JADX INFO: renamed from: h */
    public final Set<Object> f12419h;

    /* JADX INFO: renamed from: i */
    public final Handler f12420i;

    /* JADX INFO: renamed from: j */
    public final Handler f12421j;

    /* JADX INFO: renamed from: k */
    public final Cache f12422k;

    /* JADX INFO: renamed from: l */
    public final Stats f12423l;

    /* JADX INFO: renamed from: m */
    public final List<BitmapHunter> f12424m;

    /* JADX INFO: renamed from: n */
    public final NetworkBroadcastReceiver f12425n;

    /* JADX INFO: renamed from: o */
    public final boolean f12426o;

    /* JADX INFO: renamed from: p */
    public boolean f12427p;

    /* JADX INFO: renamed from: com.squareup.picasso.Dispatcher$1 */
    public class RunnableC40421 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Dispatcher f12428a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC40421(Dispatcher dispatcher) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static class DispatcherHandler extends Handler {

        /* JADX INFO: renamed from: a */
        public final Dispatcher f12429a;

        /* JADX INFO: renamed from: com.squareup.picasso.Dispatcher$DispatcherHandler$1 */
        public class RunnableC40431 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Message f12430a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ DispatcherHandler f12431b;

            /* JADX WARN: Invalid debug info offset */
            public RunnableC40431(DispatcherHandler dispatcherHandler, Message message) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public DispatcherHandler(Looper looper, Dispatcher dispatcher) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    public static class DispatcherThread extends HandlerThread {
    }

    public static class NetworkBroadcastReceiver extends BroadcastReceiver {

        /* JADX INFO: renamed from: b */
        public static final String f12432b = "state";

        /* JADX INFO: renamed from: a */
        public final Dispatcher f12433a;

        /* JADX WARN: Invalid debug info offset */
        public NetworkBroadcastReceiver(Dispatcher dispatcher) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m18641a() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m18642b() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public Dispatcher(Context context, ExecutorService executorService, Handler handler, Downloader downloader, Cache cache, Stats stats) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18615a(BitmapHunter bitmapHunter) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public void m18616b(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public void m18617c(Action action) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public void m18618d(BitmapHunter bitmapHunter) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public void m18619e(BitmapHunter bitmapHunter) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public void m18620f(NetworkInfo networkInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public void m18621g(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public void m18622h(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public void m18623i(BitmapHunter bitmapHunter) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public void m18624j(Action action) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final void m18625k() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public final void m18626l(List<BitmapHunter> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public final void m18627m(Action action) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public final void m18628n(BitmapHunter bitmapHunter) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public void m18629o(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public void m18630p() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public void m18631q(Action action) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public void m18632r(BitmapHunter bitmapHunter) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public void m18633s(BitmapHunter bitmapHunter, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public void m18634t(NetworkInfo networkInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public void m18635u(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public void m18636v(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public void m18637w(BitmapHunter bitmapHunter) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public void m18638x(Action action) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public void m18639y(Action action, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public void m18640z() {
    }
}
