package p000;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: IM */
/* JADX INFO: loaded from: classes.dex */
public final class C0542IM implements Q30, T30.InterfaceC1226a {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ boolean f1191A = false;

    /* JADX INFO: renamed from: x */
    public static final List<EnumC0669KL> f1192x = Collections.singletonList(EnumC0669KL.HTTP_1_1);

    /* JADX INFO: renamed from: y */
    public static final long f1193y = 16777216;

    /* JADX INFO: renamed from: z */
    public static final long f1194z = 60000;

    /* JADX INFO: renamed from: a */
    public final C0162CN f1195a;

    /* JADX INFO: renamed from: b */
    public final R30 f1196b;

    /* JADX INFO: renamed from: c */
    public final Random f1197c;

    /* JADX INFO: renamed from: d */
    public final long f1198d;

    /* JADX INFO: renamed from: e */
    public final String f1199e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0401G8 f1200f;

    /* JADX INFO: renamed from: g */
    public final Runnable f1201g;

    /* JADX INFO: renamed from: h */
    public T30 f1202h;

    /* JADX INFO: renamed from: i */
    public U30 f1203i;

    /* JADX INFO: renamed from: j */
    public ScheduledExecutorService f1204j;

    /* JADX INFO: renamed from: k */
    public g f1205k;

    /* JADX INFO: renamed from: l */
    public final ArrayDeque<C5222q8> f1206l;

    /* JADX INFO: renamed from: m */
    public final ArrayDeque<Object> f1207m;

    /* JADX INFO: renamed from: n */
    public long f1208n;

    /* JADX INFO: renamed from: o */
    public boolean f1209o;

    /* JADX INFO: renamed from: p */
    public ScheduledFuture<?> f1210p;

    /* JADX INFO: renamed from: q */
    public int f1211q;

    /* JADX INFO: renamed from: r */
    public String f1212r;

    /* JADX INFO: renamed from: s */
    public boolean f1213s;

    /* JADX INFO: renamed from: t */
    public int f1214t;

    /* JADX INFO: renamed from: u */
    public int f1215u;

    /* JADX INFO: renamed from: v */
    public int f1216v;

    /* JADX INFO: renamed from: w */
    public boolean f1217w;

    /* JADX INFO: renamed from: IM$a */
    /* JADX INFO: loaded from: classes2.dex */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0542IM f1218a;

        /* JADX WARN: Invalid debug info offset */
        public a(C0542IM c0542im) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: IM$b */
    /* JADX INFO: loaded from: classes2.dex */
    public class b implements InterfaceC0591J8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0162CN f1219a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0542IM f1220b;

        /* JADX WARN: Invalid debug info offset */
        public b(C0542IM c0542im, C0162CN c0162cn) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0591J8
        public void onFailure(InterfaceC0401G8 interfaceC0401G8, IOException iOException) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // p000.InterfaceC0591J8
        public void onResponse(p000.InterfaceC0401G8 r5, p000.C4934oO r6) {
            /*
                r4 = this;
                return
            L48:
            L50:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0542IM.b.onResponse(G8, oO):void");
        }
    }

    /* JADX INFO: renamed from: IM$c */
    /* JADX INFO: loaded from: classes2.dex */
    public final class c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0542IM f1221a;

        /* JADX WARN: Invalid debug info offset */
        public c(C0542IM c0542im) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: IM$d */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final int f1222a;

        /* JADX INFO: renamed from: b */
        public final C5222q8 f1223b;

        /* JADX INFO: renamed from: c */
        public final long f1224c;

        /* JADX WARN: Invalid debug info offset */
        public d(int i, C5222q8 c5222q8, long j) {
        }
    }

    /* JADX INFO: renamed from: IM$e */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public final int f1225a;

        /* JADX INFO: renamed from: b */
        public final C5222q8 f1226b;

        /* JADX WARN: Invalid debug info offset */
        public e(int i, C5222q8 c5222q8) {
        }
    }

    /* JADX INFO: renamed from: IM$f */
    /* JADX INFO: loaded from: classes2.dex */
    public final class f implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0542IM f1227a;

        /* JADX WARN: Invalid debug info offset */
        public f(C0542IM c0542im) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: IM$g */
    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class g implements Closeable {

        /* JADX INFO: renamed from: a */
        public final boolean f1228a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC1166S7 f1229b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC1103R7 f1230c;

        /* JADX WARN: Invalid debug info offset */
        public g(boolean z, InterfaceC1166S7 interfaceC1166S7, InterfaceC1103R7 interfaceC1103R7) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C0542IM(C0162CN c0162cn, R30 r30, Random random, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.Q30
    /* JADX INFO: renamed from: a */
    public boolean mo2515a(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // p000.T30.InterfaceC1226a
    /* JADX INFO: renamed from: b */
    public synchronized void mo2516b(p000.C5222q8 r1) {
        /*
            r0 = this;
            return
        Lc:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0542IM.mo2516b(q8):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.T30.InterfaceC1226a
    /* JADX INFO: renamed from: c */
    public void mo2517c(String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.Q30
    public void cancel() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.Q30
    /* JADX INFO: renamed from: d */
    public boolean mo2518d(int i, String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.Q30
    /* JADX INFO: renamed from: e */
    public synchronized long mo2519e() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // p000.T30.InterfaceC1226a
    /* JADX INFO: renamed from: f */
    public synchronized void mo2520f(p000.C5222q8 r2) {
        /*
            r1 = this;
            return
        L12:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0542IM.mo2520f(q8):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.Q30
    /* JADX INFO: renamed from: g */
    public boolean mo2521g(C5222q8 c5222q8) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // p000.T30.InterfaceC1226a
    /* JADX INFO: renamed from: h */
    public void mo2522h(int r4, java.lang.String r5) {
        /*
            r3 = this;
            return
        L26:
        L3c:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0542IM.mo2522h(int, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.T30.InterfaceC1226a
    /* JADX INFO: renamed from: i */
    public void mo2523i(C5222q8 c5222q8) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public void m2524j(int i, TimeUnit timeUnit) throws InterruptedException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public void m2525k(C4934oO c4934oO) throws ProtocolException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: l */
    public synchronized boolean m2526l(int r8, java.lang.String r9, long r10) {
        /*
            r7 = this;
            r0 = 0
            return r0
        L22:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0542IM.m2526l(int, java.lang.String, long):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.Q30
    /* JADX INFO: renamed from: l0 */
    public C0162CN mo2527l0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public void m2528m(C4927oH c4927oH) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: n */
    public void m2529n(java.lang.Exception r4, @javax.annotation.Nullable p000.C4934oO r5) {
        /*
            r3 = this;
            return
        L7:
        L2a:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0542IM.m2529n(java.lang.Exception, oO):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: o */
    public void m2530o(java.lang.String r12, p000.C0542IM.g r13) throws java.io.IOException {
        /*
            r11 = this;
            return
        L33:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0542IM.m2530o(java.lang.String, IM$g):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public void m2531p() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public synchronized boolean m2532q(C5222q8 c5222q8) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public boolean m2533r() throws IOException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public synchronized int m2534s() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public synchronized int m2535t() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public final void m2536u() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public final synchronized boolean m2537v(C5222q8 c5222q8, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public synchronized int m2538w() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public void m2539x() throws InterruptedException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public boolean m2540y() throws IOException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: z */
    public void m2541z() {
        /*
            r7 = this;
            return
        L7:
        L47:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0542IM.m2541z():void");
    }
}
