package p000;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: hf */
/* JADX INFO: loaded from: classes.dex */
public final class C4491hf implements Closeable, Flushable {

    /* JADX INFO: renamed from: A */
    public static final Pattern f14341A = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: B */
    public static final String f14342B = "CLEAN";

    /* JADX INFO: renamed from: C */
    public static final String f14343C = "DIRTY";

    /* JADX INFO: renamed from: D */
    public static final String f14344D = "REMOVE";

    /* JADX INFO: renamed from: E */
    public static final String f14345E = "READ";

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ boolean f14346F = false;

    /* JADX INFO: renamed from: u */
    public static final String f14347u = "journal";

    /* JADX INFO: renamed from: v */
    public static final String f14348v = "journal.tmp";

    /* JADX INFO: renamed from: w */
    public static final String f14349w = "journal.bkp";

    /* JADX INFO: renamed from: x */
    public static final String f14350x = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: y */
    public static final String f14351y = "1";

    /* JADX INFO: renamed from: z */
    public static final long f14352z = -1;

    /* JADX INFO: renamed from: a */
    public final InterfaceC5875zj f14353a;

    /* JADX INFO: renamed from: b */
    public final File f14354b;

    /* JADX INFO: renamed from: c */
    public final File f14355c;

    /* JADX INFO: renamed from: d */
    public final File f14356d;

    /* JADX INFO: renamed from: e */
    public final File f14357e;

    /* JADX INFO: renamed from: f */
    public final int f14358f;

    /* JADX INFO: renamed from: g */
    public long f14359g;

    /* JADX INFO: renamed from: h */
    public final int f14360h;

    /* JADX INFO: renamed from: i */
    public long f14361i;

    /* JADX INFO: renamed from: j */
    public InterfaceC1103R7 f14362j;

    /* JADX INFO: renamed from: k */
    public final LinkedHashMap<String, e> f14363k;

    /* JADX INFO: renamed from: l */
    public int f14364l;

    /* JADX INFO: renamed from: m */
    public boolean f14365m;

    /* JADX INFO: renamed from: n */
    public boolean f14366n;

    /* JADX INFO: renamed from: o */
    public boolean f14367o;

    /* JADX INFO: renamed from: p */
    public boolean f14368p;

    /* JADX INFO: renamed from: q */
    public boolean f14369q;

    /* JADX INFO: renamed from: r */
    public long f14370r;

    /* JADX INFO: renamed from: s */
    public final Executor f14371s;

    /* JADX INFO: renamed from: t */
    public final Runnable f14372t;

    /* JADX INFO: renamed from: hf$a */
    /* JADX INFO: loaded from: classes2.dex */
    public class a extends C0437Gi {

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ boolean f14373d = false;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C4491hf f14374c;

        /* JADX WARN: Invalid debug info offset */
        public a(C4491hf c4491hf, InterfaceC4803mS interfaceC4803mS) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C0437Gi
        /* JADX INFO: renamed from: k */
        public void mo2137k(IOException iOException) {
        }
    }

    /* JADX INFO: renamed from: hf$b */
    /* JADX INFO: loaded from: classes2.dex */
    public class b implements Iterator<f> {

        /* JADX INFO: renamed from: a */
        public final Iterator<e> f14375a;

        /* JADX INFO: renamed from: b */
        public f f14376b;

        /* JADX INFO: renamed from: c */
        public f f14377c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C4491hf f14378d;

        /* JADX WARN: Invalid debug info offset */
        public b(C4491hf c4491hf) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public f m21105a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0009
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.util.Iterator
        public boolean hasNext() {
            /*
                r4 = this;
                r0 = 0
                return r0
            L12:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C4491hf.b.hasNext():boolean");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ f next() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.util.Iterator
        public void remove() {
            /*
                r3 = this;
                return
            Lc:
            Lf:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C4491hf.b.remove():void");
        }
    }

    /* JADX INFO: renamed from: hf$c */
    /* JADX INFO: loaded from: classes2.dex */
    public final class c {

        /* JADX INFO: renamed from: a */
        public final e f14379a;

        /* JADX INFO: renamed from: b */
        public final boolean[] f14380b;

        /* JADX INFO: renamed from: c */
        public boolean f14381c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C4491hf f14382d;

        /* JADX INFO: renamed from: hf$c$a */
        public class a extends C0437Gi {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ c f14383c;

            /* JADX WARN: Invalid debug info offset */
            public a(c cVar, InterfaceC4803mS interfaceC4803mS) {
            }

            /* JADX WARN: Invalid debug info offset */
            /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
                jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
                	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
                	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
                */
            @Override // p000.C0437Gi
            /* JADX INFO: renamed from: k */
            public void mo2137k(java.io.IOException r2) {
                /*
                    r1 = this;
                    return
                Lc:
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.C4491hf.c.a.mo2137k(java.io.IOException):void");
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public c(C4491hf c4491hf, e eVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public void m21106a() throws java.io.IOException {
            /*
                r3 = this;
                return
            L14:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C4491hf.c.m21106a():void");
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: b */
        public void m21107b() {
            /*
                r3 = this;
                return
            L14:
            L16:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C4491hf.c.m21107b():void");
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: c */
        public void m21108c() throws java.io.IOException {
            /*
                r3 = this;
                return
            L14:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C4491hf.c.m21108c():void");
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000d
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: d */
        public void m21109d() {
            /*
                r3 = this;
                return
            L18:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C4491hf.c.m21109d():void");
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: e */
        public p000.InterfaceC4803mS m21110e(int r5) {
            /*
                r4 = this;
                r0 = 0
                return r0
            L13:
            L31:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C4491hf.c.m21110e(int):mS");
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: f */
        public p000.InterfaceC5858zS m21111f(int r5) {
            /*
                r4 = this;
                r0 = 0
                return r0
            L21:
            L23:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C4491hf.c.m21111f(int):zS");
        }
    }

    /* JADX INFO: renamed from: hf$d */
    /* JADX INFO: loaded from: classes2.dex */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C4491hf f14384a;

        /* JADX WARN: Invalid debug info offset */
        public d(C4491hf c4491hf) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.lang.Runnable
        public void run() {
            /*
                r6 = this;
                return
            L11:
            L17:
            L2d:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C4491hf.d.run():void");
        }
    }

    /* JADX INFO: renamed from: hf$e */
    /* JADX INFO: loaded from: classes2.dex */
    public final class e {

        /* JADX INFO: renamed from: a */
        public final String f14385a;

        /* JADX INFO: renamed from: b */
        public final long[] f14386b;

        /* JADX INFO: renamed from: c */
        public final File[] f14387c;

        /* JADX INFO: renamed from: d */
        public final File[] f14388d;

        /* JADX INFO: renamed from: e */
        public boolean f14389e;

        /* JADX INFO: renamed from: f */
        public c f14390f;

        /* JADX INFO: renamed from: g */
        public long f14391g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ C4491hf f14392h;

        /* JADX WARN: Invalid debug info offset */
        public e(C4491hf c4491hf, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public final IOException m21112a(String[] strArr) throws IOException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0008
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: b */
        public void m21113b(java.lang.String[] r5) throws java.io.IOException {
            /*
                r4 = this;
                return
            L19:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C4491hf.e.m21113b(java.lang.String[]):void");
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0019
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: c */
        public p000.C4491hf.f m21114c() {
            /*
                r10 = this;
                r0 = 0
                return r0
            L2e:
            L4f:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C4491hf.e.m21114c():hf$f");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public void m21115d(InterfaceC1103R7 interfaceC1103R7) throws IOException {
        }
    }

    /* JADX INFO: renamed from: hf$f */
    public final class f implements Closeable {

        /* JADX INFO: renamed from: a */
        public final String f14393a;

        /* JADX INFO: renamed from: b */
        public final long f14394b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC5858zS[] f14395c;

        /* JADX INFO: renamed from: d */
        public final long[] f14396d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C4491hf f14397e;

        /* JADX WARN: Invalid debug info offset */
        public f(C4491hf c4491hf, String str, long j, InterfaceC5858zS[] interfaceC5858zSArr, long[] jArr) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: j */
        public static /* synthetic */ String m21116j(f fVar) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: P */
        public String m21117P() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Nullable
        /* JADX INFO: renamed from: k */
        public c m21118k() throws IOException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: p */
        public long m21119p(int i) {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: w */
        public InterfaceC5858zS m21120w(int i) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C4491hf(InterfaceC5875zj interfaceC5875zj, File file, int i, int i2, long j, Executor executor) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static C4491hf m21082p(InterfaceC5875zj interfaceC5875zj, File file, int i, int i2, long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A0 */
    public final void m21083A0(String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: J0 */
    public synchronized void m21084J0() throws java.io.IOException {
        /*
            r6 = this;
            return
        L9:
        L71:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4491hf.m21084J0():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: L0 */
    public synchronized boolean m21085L0(String str) throws IOException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public synchronized c m21086P(String str, long j) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public boolean m21087P0(e eVar) throws IOException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: R */
    public synchronized void m21088R() throws java.io.IOException {
        /*
            r5 = this;
            return
        L25:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4491hf.m21088R():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: S */
    public synchronized f m21089S(String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: T0 */
    public synchronized void m21090T0(long r1) {
        /*
            r0 = this;
            return
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4491hf.m21090T0(long):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public synchronized long m21091U0() throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public File m21092V() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public synchronized Iterator<f> m21093V0() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public void m21094W0() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public final void m21095X0(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public synchronized long m21096b0() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
        /*
            r5 = this;
            return
        L2d:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4491hf.close():void");
    }

    /* JADX WARN: Invalid debug info offset */
    public void delete() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.Flushable
    public synchronized void flush() throws java.io.IOException {
        /*
            r1 = this;
            return
        L14:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4491hf.flush():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: g0 */
    public synchronized void m21097g0() throws java.io.IOException {
        /*
            r5 = this;
            return
        L25:
        L45:
        L74:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4491hf.m21097g0():void");
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized boolean isClosed() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: j */
    public final synchronized void m21098j() {
        /*
            r2 = this;
            return
        L11:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4491hf.m21098j():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: k */
    public synchronized void m21099k(p000.C4491hf.c r10, boolean r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4491hf.m21099k(hf$c, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public boolean m21100k0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l0 */
    public final InterfaceC1103R7 m21101l0() throws FileNotFoundException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r0 */
    public final void m21102r0() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0010
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: u0 */
    public final void m21103u0() throws java.io.IOException {
        /*
            r9 = this;
            return
        L5f:
        L61:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4491hf.m21103u0():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: w */
    public c m21104w(String str) throws IOException {
        return null;
    }
}
