package p000;

import android.os.MessageQueue;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: Fh */
/* JADX INFO: loaded from: classes.dex */
public class C0373Fh implements InterfaceC0500Hh, InterfaceC4660kC.a, C0691Kh.a {

    /* JADX INFO: renamed from: i */
    public static final String f807i = "Engine";

    /* JADX INFO: renamed from: a */
    public final Map<InterfaceC4903nu, C0436Gh> f808a;

    /* JADX INFO: renamed from: b */
    public final C0626Jh f809b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4660kC f810c;

    /* JADX INFO: renamed from: d */
    public final a f811d;

    /* JADX INFO: renamed from: e */
    public final Map<InterfaceC4903nu, WeakReference<C0691Kh<?>>> f812e;

    /* JADX INFO: renamed from: f */
    public final C4537iO f813f;

    /* JADX INFO: renamed from: g */
    public final b f814g;

    /* JADX INFO: renamed from: h */
    public ReferenceQueue<C0691Kh<?>> f815h;

    /* JADX INFO: renamed from: Fh$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final ExecutorService f816a;

        /* JADX INFO: renamed from: b */
        public final ExecutorService f817b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC0500Hh f818c;

        /* JADX WARN: Invalid debug info offset */
        public a(ExecutorService executorService, ExecutorService executorService2, InterfaceC0500Hh interfaceC0500Hh) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public C0436Gh m1910a(InterfaceC4903nu interfaceC4903nu, boolean z) {
            return null;
        }
    }

    /* JADX INFO: renamed from: Fh$b */
    public static class b implements C0369Fd.a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1721af.a f819a;

        /* JADX INFO: renamed from: b */
        public volatile InterfaceC1721af f820b;

        /* JADX WARN: Invalid debug info offset */
        public b(InterfaceC1721af.a aVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // p000.C0369Fd.a
        /* JADX INFO: renamed from: a */
        public p000.InterfaceC1721af mo1880a() {
            /*
                r1 = this;
                r0 = 0
                return r0
            L12:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0373Fh.b.mo1880a():af");
        }
    }

    /* JADX INFO: renamed from: Fh$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final C0436Gh f821a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC4218dO f822b;

        /* JADX WARN: Invalid debug info offset */
        public c(InterfaceC4218dO interfaceC4218dO, C0436Gh c0436Gh) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m1911a() {
        }
    }

    /* JADX INFO: renamed from: Fh$d */
    public static class d implements MessageQueue.IdleHandler {

        /* JADX INFO: renamed from: a */
        public final Map<InterfaceC4903nu, WeakReference<C0691Kh<?>>> f823a;

        /* JADX INFO: renamed from: b */
        public final ReferenceQueue<C0691Kh<?>> f824b;

        /* JADX WARN: Invalid debug info offset */
        public d(Map<InterfaceC4903nu, WeakReference<C0691Kh<?>>> map, ReferenceQueue<C0691Kh<?>> referenceQueue) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            return false;
        }
    }

    /* JADX INFO: renamed from: Fh$e */
    public static class e extends WeakReference<C0691Kh<?>> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC4903nu f825a;

        /* JADX WARN: Invalid debug info offset */
        public e(InterfaceC4903nu interfaceC4903nu, C0691Kh<?> c0691Kh, ReferenceQueue<? super C0691Kh<?>> referenceQueue) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ InterfaceC4903nu m1912a(e eVar) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C0373Fh(InterfaceC4660kC interfaceC4660kC, InterfaceC1721af.a aVar, ExecutorService executorService, ExecutorService executorService2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public C0373Fh(InterfaceC4660kC interfaceC4660kC, InterfaceC1721af.a aVar, ExecutorService executorService, ExecutorService executorService2, Map<InterfaceC4903nu, C0436Gh> map, C0626Jh c0626Jh, Map<InterfaceC4903nu, WeakReference<C0691Kh<?>>> map2, a aVar2, C4537iO c4537iO) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static void m1898k(String str, long j, InterfaceC4903nu interfaceC4903nu) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.C0691Kh.a
    /* JADX INFO: renamed from: a */
    public void mo1899a(InterfaceC4903nu interfaceC4903nu, C0691Kh c0691Kh) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0500Hh
    /* JADX INFO: renamed from: b */
    public void mo1900b(InterfaceC4903nu interfaceC4903nu, C0691Kh<?> c0691Kh) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0500Hh
    /* JADX INFO: renamed from: c */
    public void mo1901c(C0436Gh c0436Gh, InterfaceC4903nu interfaceC4903nu) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4660kC.a
    /* JADX INFO: renamed from: d */
    public void mo1902d(InterfaceC3034cO<?> interfaceC3034cO) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public void m1903e() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public final C0691Kh<?> m1904f(InterfaceC4903nu interfaceC4903nu) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public final ReferenceQueue<C0691Kh<?>> m1905g() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public <T, Z, R> c m1906h(InterfaceC4903nu interfaceC4903nu, int i, int i2, InterfaceC4750ld<T> interfaceC4750ld, InterfaceC4814md<T, Z> interfaceC4814md, InterfaceC1320UW<Z> interfaceC1320UW, InterfaceC4608jO<Z, R> interfaceC4608jO, EnumC5369sL enumC5369sL, boolean z, EnumC3051cf enumC3051cf, InterfaceC4218dO interfaceC4218dO) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public final C0691Kh<?> m1907i(InterfaceC4903nu interfaceC4903nu, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final C0691Kh<?> m1908j(InterfaceC4903nu interfaceC4903nu, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public void m1909l(InterfaceC3034cO interfaceC3034cO) {
    }
}
