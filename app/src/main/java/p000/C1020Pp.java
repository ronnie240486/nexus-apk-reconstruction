package p000;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Pp */
/* JADX INFO: loaded from: classes2.dex */
public final class C1020Pp implements Closeable {

    /* JADX INFO: renamed from: u */
    public static final int f2549u = 16777216;

    /* JADX INFO: renamed from: v */
    public static final ExecutorService f2550v = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C1194SZ.m5628H("OkHttp Http2Connection", true));

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ boolean f2551w = false;

    /* JADX INFO: renamed from: a */
    public final boolean f2552a;

    /* JADX INFO: renamed from: b */
    public final h f2553b;

    /* JADX INFO: renamed from: c */
    public final Map<Integer, C1147Rp> f2554c;

    /* JADX INFO: renamed from: d */
    public final String f2555d;

    /* JADX INFO: renamed from: e */
    public int f2556e;

    /* JADX INFO: renamed from: f */
    public int f2557f;

    /* JADX INFO: renamed from: g */
    public boolean f2558g;

    /* JADX INFO: renamed from: h */
    public final ScheduledExecutorService f2559h;

    /* JADX INFO: renamed from: i */
    public final ExecutorService f2560i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC1567YL f2561j;

    /* JADX INFO: renamed from: k */
    public boolean f2562k;

    /* JADX INFO: renamed from: l */
    public long f2563l;

    /* JADX INFO: renamed from: m */
    public long f2564m;

    /* JADX INFO: renamed from: n */
    public C0483HQ f2565n;

    /* JADX INFO: renamed from: o */
    public final C0483HQ f2566o;

    /* JADX INFO: renamed from: p */
    public boolean f2567p;

    /* JADX INFO: renamed from: q */
    public final Socket f2568q;

    /* JADX INFO: renamed from: r */
    public final C1210Sp f2569r;

    /* JADX INFO: renamed from: s */
    public final j f2570s;

    /* JADX INFO: renamed from: t */
    public final Set<Integer> f2571t;

    /* JADX INFO: renamed from: Pp$a */
    public class a extends AbstractRunnableC5843zD {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f2572b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ EnumC1331Uh f2573c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C1020Pp f2574d;

        /* JADX WARN: Invalid debug info offset */
        public a(C1020Pp c1020Pp, String str, Object[] objArr, int i, EnumC1331Uh enumC1331Uh) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractRunnableC5843zD
        /* JADX INFO: renamed from: l */
        public void mo1564l() {
        }
    }

    /* JADX INFO: renamed from: Pp$b */
    public class b extends AbstractRunnableC5843zD {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f2575b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f2576c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C1020Pp f2577d;

        /* JADX WARN: Invalid debug info offset */
        public b(C1020Pp c1020Pp, String str, Object[] objArr, int i, long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractRunnableC5843zD
        /* JADX INFO: renamed from: l */
        public void mo1564l() {
        }
    }

    /* JADX INFO: renamed from: Pp$c */
    public class c extends AbstractRunnableC5843zD {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f2578b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ List f2579c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C1020Pp f2580d;

        /* JADX WARN: Invalid debug info offset */
        public c(C1020Pp c1020Pp, String str, Object[] objArr, int i, List list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000e
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // p000.AbstractRunnableC5843zD
        /* JADX INFO: renamed from: l */
        public void mo1564l() {
            /*
                r3 = this;
                return
            L2b:
            L2e:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C1020Pp.c.mo1564l():void");
        }
    }

    /* JADX INFO: renamed from: Pp$d */
    public class d extends AbstractRunnableC5843zD {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f2581b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ List f2582c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f2583d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C1020Pp f2584e;

        /* JADX WARN: Invalid debug info offset */
        public d(C1020Pp c1020Pp, String str, Object[] objArr, int i, List list, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0010
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // p000.AbstractRunnableC5843zD
        /* JADX INFO: renamed from: l */
        public void mo1564l() {
            /*
                r4 = this;
                return
            L33:
            L36:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C1020Pp.d.mo1564l():void");
        }
    }

    /* JADX INFO: renamed from: Pp$e */
    public class e extends AbstractRunnableC5843zD {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f2585b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0910O7 f2586c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f2587d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f2588e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C1020Pp f2589f;

        /* JADX WARN: Invalid debug info offset */
        public e(C1020Pp c1020Pp, String str, Object[] objArr, int i, C0910O7 c0910o7, int i2, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0026
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // p000.AbstractRunnableC5843zD
        /* JADX INFO: renamed from: l */
        public void mo1564l() {
            /*
                r5 = this;
                return
            L35:
            L38:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C1020Pp.e.mo1564l():void");
        }
    }

    /* JADX INFO: renamed from: Pp$f */
    public class f extends AbstractRunnableC5843zD {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f2590b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ EnumC1331Uh f2591c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C1020Pp f2592d;

        /* JADX WARN: Invalid debug info offset */
        public f(C1020Pp c1020Pp, String str, Object[] objArr, int i, EnumC1331Uh enumC1331Uh) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000e
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // p000.AbstractRunnableC5843zD
        /* JADX INFO: renamed from: l */
        public void mo1564l() {
            /*
                r3 = this;
                return
            L1d:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C1020Pp.f.mo1564l():void");
        }
    }

    /* JADX INFO: renamed from: Pp$g */
    public static class g {

        /* JADX INFO: renamed from: a */
        public Socket f2593a;

        /* JADX INFO: renamed from: b */
        public String f2594b;

        /* JADX INFO: renamed from: c */
        public InterfaceC1166S7 f2595c;

        /* JADX INFO: renamed from: d */
        public InterfaceC1103R7 f2596d;

        /* JADX INFO: renamed from: e */
        public h f2597e;

        /* JADX INFO: renamed from: f */
        public InterfaceC1567YL f2598f;

        /* JADX INFO: renamed from: g */
        public boolean f2599g;

        /* JADX INFO: renamed from: h */
        public int f2600h;

        /* JADX WARN: Invalid debug info offset */
        public g(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public C1020Pp m4519a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public g m4520b(h hVar) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public g m4521c(int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public g m4522d(InterfaceC1567YL interfaceC1567YL) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public g m4523e(Socket socket) throws IOException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public g m4524f(Socket socket, String str, InterfaceC1166S7 interfaceC1166S7, InterfaceC1103R7 interfaceC1103R7) {
            return null;
        }
    }

    /* JADX INFO: renamed from: Pp$i */
    public final class i extends AbstractRunnableC5843zD {

        /* JADX INFO: renamed from: b */
        public final boolean f2602b;

        /* JADX INFO: renamed from: c */
        public final int f2603c;

        /* JADX INFO: renamed from: d */
        public final int f2604d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C1020Pp f2605e;

        /* JADX WARN: Invalid debug info offset */
        public i(C1020Pp c1020Pp, boolean z, int i, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractRunnableC5843zD
        /* JADX INFO: renamed from: l */
        public void mo1564l() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C1020Pp(g gVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m4485j(C1020Pp c1020Pp) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ ExecutorService m4486k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ ScheduledExecutorService m4487p(C1020Pp c1020Pp) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ boolean m4488w(C1020Pp c1020Pp, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A0 */
    public void m4489A0(int i2, InterfaceC1166S7 interfaceC1166S7, int i3, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: J0 */
    public final synchronized void m4490J0(p000.AbstractRunnableC5843zD r2) {
        /*
            r1 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1020Pp.m4490J0(zD):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public void m4491L0(int i2, List<C5201po> list, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: P */
    public synchronized void m4492P() throws java.lang.InterruptedException {
        /*
            r1 = this;
            return
        L9:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1020Pp.m4492P():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: P0 */
    public void m4493P0(int r9, java.util.List<p000.C5201po> r10) {
        /*
            r8 = this;
            return
        L14:
        L3d:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1020Pp.m4493P0(int, java.util.List):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: R */
    public void m4494R(p000.EnumC1331Uh r5, p000.EnumC1331Uh r6) throws java.io.IOException {
        /*
            r4 = this;
            return
        L6:
        L2a:
        L39:
        L46:
        L50:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1020Pp.m4494R(Uh, Uh):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public final void m4495S() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public void m4496T0(int i2, EnumC1331Uh enumC1331Uh) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public C1147Rp m4497U0(int i2, List<C5201po> list, boolean z) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public EnumC0669KL m4498V() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public boolean m4499V0(int i2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public synchronized C1147Rp m4500W0(int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: X0 */
    public void m4501X0(p000.C0483HQ r3) throws java.io.IOException {
        /*
            r2 = this;
            return
        L15:
        L17:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1020Pp.m4501X0(HQ):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: Y0 */
    public void m4502Y0(p000.EnumC1331Uh r5) throws java.io.IOException {
        /*
            r4 = this;
            return
        Lb:
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1020Pp.m4502Y0(Uh):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public void m4503Z0() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public void m4504a1(boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public synchronized C1147Rp m4505b0(int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b1 */
    public synchronized void m4506b1(long r4) {
        /*
            r3 = this;
            return
        L1e:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1020Pp.m4506b1(long):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0012
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: c1 */
    public void m4507c1(int r9, boolean r10, p000.C0910O7 r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            return
        L28:
        L56:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1020Pp.m4507c1(int, boolean, O7, long):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: d1 */
    public void m4508d1(boolean r3, int r4, int r5) {
        /*
            r2 = this;
            return
        Lf:
        L18:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1020Pp.m4508d1(boolean, int, int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    public void m4509e1() throws InterruptedException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    public void m4510f1(int i2, boolean z, List<C5201po> list) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void flush() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public synchronized boolean m4511g0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g1 */
    public void m4512g1(int i2, EnumC1331Uh enumC1331Uh) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    public void m4513h1(int i2, EnumC1331Uh enumC1331Uh) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    public void m4514i1(int i2, long j2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public synchronized int m4515k0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: l0 */
    public final p000.C1147Rp m4516l0(int r11, java.util.List<p000.C5201po> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r0 = 0
            return r0
        L13:
        L56:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1020Pp.m4516l0(int, java.util.List, boolean):Rp");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r0 */
    public C1147Rp m4517r0(List<C5201po> list, boolean z) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u0 */
    public synchronized int m4518u0() {
        return 0;
    }

    /* JADX INFO: renamed from: Pp$h */
    public static abstract class h {

        /* JADX INFO: renamed from: a */
        public static final h f2601a = new a();

        /* JADX INFO: renamed from: Pp$h$a */
        public class a extends h {
            /* JADX WARN: Invalid debug info offset */
            @Override // p000.C1020Pp.h
            /* JADX INFO: renamed from: f */
            public void mo1815f(C1147Rp c1147Rp) throws IOException {
            }
        }

        /* JADX INFO: renamed from: f */
        public abstract void mo1815f(C1147Rp c1147Rp) throws IOException;

        /* JADX INFO: renamed from: e */
        public void mo1814e(C1020Pp c1020Pp) {
        }
    }

    /* JADX INFO: renamed from: Pp$j */
    public class j extends AbstractRunnableC5843zD implements C1085Qp.b {

        /* JADX INFO: renamed from: b */
        public final C1085Qp f2606b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1020Pp f2607c;

        /* JADX INFO: renamed from: Pp$j$a */
        public class a extends AbstractRunnableC5843zD {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C1147Rp f2608b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ j f2609c;

            /* JADX WARN: Invalid debug info offset */
            public a(j jVar, String str, Object[] objArr, C1147Rp c1147Rp) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // p000.AbstractRunnableC5843zD
            /* JADX INFO: renamed from: l */
            public void mo1564l() {
            }
        }

        /* JADX INFO: renamed from: Pp$j$b */
        public class b extends AbstractRunnableC5843zD {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ j f2610b;

            /* JADX WARN: Invalid debug info offset */
            public b(j jVar, String str, Object... objArr) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // p000.AbstractRunnableC5843zD
            /* JADX INFO: renamed from: l */
            public void mo1564l() {
            }
        }

        /* JADX INFO: renamed from: Pp$j$c */
        public class c extends AbstractRunnableC5843zD {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0483HQ f2611b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ j f2612c;

            /* JADX WARN: Invalid debug info offset */
            public c(j jVar, String str, Object[] objArr, C0483HQ c0483hq) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // p000.AbstractRunnableC5843zD
            /* JADX INFO: renamed from: l */
            public void mo1564l() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public j(C1020Pp c1020Pp, C1085Qp c1085Qp) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0006
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // p000.C1085Qp.b
        /* JADX INFO: renamed from: a */
        public void mo4525a(int r4, p000.EnumC1331Uh r5, p000.C5222q8 r6) {
            /*
                r3 = this;
                return
            L44:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C1020Pp.j.mo4525a(int, Uh, q8):void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C1085Qp.b
        /* JADX INFO: renamed from: c */
        public void mo4527c(int i, EnumC1331Uh enumC1331Uh) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0012
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // p000.C1085Qp.b
        /* JADX INFO: renamed from: e */
        public void mo4529e(boolean r8, int r9, int r10, java.util.List<p000.C5201po> r11) {
            /*
                r7 = this;
                return
            L22:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C1020Pp.j.mo4529e(boolean, int, int, java.util.List):void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C1085Qp.b
        /* JADX INFO: renamed from: f */
        public void mo4530f(boolean z, int i, InterfaceC1166S7 interfaceC1166S7, int i2) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // p000.C1085Qp.b
        /* JADX INFO: renamed from: g */
        public void mo4531g(int r4, long r5) {
            /*
                r3 = this;
                return
            L11:
            L20:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C1020Pp.j.mo4531g(int, long):void");
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // p000.C1085Qp.b
        /* JADX INFO: renamed from: h */
        public void mo4532h(boolean r4, int r5, int r6) {
            /*
                r3 = this;
                return
            L12:
            L26:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C1020Pp.j.mo4532h(boolean, int, int):void");
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // p000.C1085Qp.b
        /* JADX INFO: renamed from: j */
        public void mo4534j(boolean r12, p000.C0483HQ r13) {
            /*
                r11 = this;
                return
            L17:
            L88:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C1020Pp.j.mo4534j(boolean, HQ):void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C1085Qp.b
        /* JADX INFO: renamed from: k */
        public void mo4535k(int i, int i2, List<C5201po> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // p000.AbstractRunnableC5843zD
        /* JADX INFO: renamed from: l */
        public void mo1564l() {
            /*
                r4 = this;
                return
            L1a:
            L20:
            L22:
            L25:
            L26:
            L34:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C1020Pp.j.mo1564l():void");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: m */
        public final void m4536m(C0483HQ c0483hq) {
        }

        @Override // p000.C1085Qp.b
        /* JADX INFO: renamed from: b */
        public void mo4526b() {
        }

        @Override // p000.C1085Qp.b
        /* JADX INFO: renamed from: d */
        public void mo4528d(int i, String str, C5222q8 c5222q8, String str2, int i2, long j) {
        }

        @Override // p000.C1085Qp.b
        /* JADX INFO: renamed from: i */
        public void mo4533i(int i, int i2, int i3, boolean z) {
        }
    }
}
