package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: Gh */
/* JADX INFO: loaded from: classes.dex */
public class C0436Gh implements RunnableC0756Lh.a {

    /* JADX INFO: renamed from: q */
    public static final b f932q = new b();

    /* JADX INFO: renamed from: r */
    public static final Handler f933r = new Handler(Looper.getMainLooper(), new c(null));

    /* JADX INFO: renamed from: s */
    public static final int f934s = 1;

    /* JADX INFO: renamed from: t */
    public static final int f935t = 2;

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC4218dO> f936a;

    /* JADX INFO: renamed from: b */
    public final b f937b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0500Hh f938c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4903nu f939d;

    /* JADX INFO: renamed from: e */
    public final ExecutorService f940e;

    /* JADX INFO: renamed from: f */
    public final ExecutorService f941f;

    /* JADX INFO: renamed from: g */
    public final boolean f942g;

    /* JADX INFO: renamed from: h */
    public boolean f943h;

    /* JADX INFO: renamed from: i */
    public InterfaceC3034cO<?> f944i;

    /* JADX INFO: renamed from: j */
    public boolean f945j;

    /* JADX INFO: renamed from: k */
    public Exception f946k;

    /* JADX INFO: renamed from: l */
    public boolean f947l;

    /* JADX INFO: renamed from: m */
    public Set<InterfaceC4218dO> f948m;

    /* JADX INFO: renamed from: n */
    public RunnableC0756Lh f949n;

    /* JADX INFO: renamed from: o */
    public C0691Kh<?> f950o;

    /* JADX INFO: renamed from: p */
    public volatile Future<?> f951p;

    /* JADX INFO: renamed from: Gh$b */
    public static class b {
        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public <R> C0691Kh<R> m2136a(InterfaceC3034cO<R> interfaceC3034cO, boolean z) {
            return null;
        }
    }

    /* JADX INFO: renamed from: Gh$c */
    public static class c implements Handler.Callback {
        /* JADX WARN: Invalid debug info offset */
        public c() {
        }

        /* JADX WARN: Invalid debug info offset */
        public c(a aVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            return false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C0436Gh(InterfaceC4903nu interfaceC4903nu, ExecutorService executorService, ExecutorService executorService2, boolean z, InterfaceC0500Hh interfaceC0500Hh) {
    }

    /* JADX WARN: Invalid debug info offset */
    public C0436Gh(InterfaceC4903nu interfaceC4903nu, ExecutorService executorService, ExecutorService executorService2, boolean z, InterfaceC0500Hh interfaceC0500Hh, b bVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2123c(C0436Gh c0436Gh) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m2124d(C0436Gh c0436Gh) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4218dO
    /* JADX INFO: renamed from: a */
    public void mo2125a(InterfaceC3034cO<?> interfaceC3034cO) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.RunnableC0756Lh.a
    /* JADX INFO: renamed from: b */
    public void mo2126b(RunnableC0756Lh runnableC0756Lh) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public void m2127e(InterfaceC4218dO interfaceC4218dO) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public final void m2128f(InterfaceC4218dO interfaceC4218dO) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public void m2129g() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final void m2130h() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public final void m2131i() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public boolean m2132j() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final boolean m2133k(InterfaceC4218dO interfaceC4218dO) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public void m2134l(InterfaceC4218dO interfaceC4218dO) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public void m2135m(RunnableC0756Lh runnableC0756Lh) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4218dO
    public void onException(Exception exc) {
    }
}
