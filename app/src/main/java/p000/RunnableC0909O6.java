package p000;

import android.graphics.Bitmap;
import android.os.Handler;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: O6 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0909O6 implements Runnable {

    /* JADX INFO: renamed from: i */
    public static final String f2318i = "PreFillRunner";

    /* JADX INFO: renamed from: k */
    public static final long f2320k = 32;

    /* JADX INFO: renamed from: l */
    public static final long f2321l = 40;

    /* JADX INFO: renamed from: m */
    public static final int f2322m = 4;

    /* JADX INFO: renamed from: a */
    public final InterfaceC0782M6 f2324a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4660kC f2325b;

    /* JADX INFO: renamed from: c */
    public final C5780yK f2326c;

    /* JADX INFO: renamed from: d */
    public final b f2327d;

    /* JADX INFO: renamed from: e */
    public final Set<C5850zK> f2328e;

    /* JADX INFO: renamed from: f */
    public final Handler f2329f;

    /* JADX INFO: renamed from: g */
    public long f2330g;

    /* JADX INFO: renamed from: h */
    public boolean f2331h;

    /* JADX INFO: renamed from: j */
    public static final b f2319j = new b();

    /* JADX INFO: renamed from: n */
    public static final long f2323n = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: O6$b */
    public static class b {
        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public long m4171a() {
            return 0L;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public RunnableC0909O6(InterfaceC0782M6 interfaceC0782M6, InterfaceC4660kC interfaceC4660kC, C5780yK c5780yK) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RunnableC0909O6(InterfaceC0782M6 interfaceC0782M6, InterfaceC4660kC interfaceC4660kC, C5780yK c5780yK, b bVar, Handler handler) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m4165a(C5850zK c5850zK, Bitmap bitmap) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final boolean m4166b() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public void m4167c() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final int m4168d() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public final long m4169e() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public final boolean m4170f(long j) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.Runnable
    public void run() {
    }

    /* JADX INFO: renamed from: O6$c */
    public static class c implements InterfaceC4903nu {
        /* JADX WARN: Invalid debug info offset */
        public c() {
        }

        /* JADX WARN: Invalid debug info offset */
        public c(a aVar) {
        }

        @Override // p000.InterfaceC4903nu
        /* JADX INFO: renamed from: a */
        public void mo2678a(MessageDigest messageDigest) throws UnsupportedEncodingException {
        }
    }
}
