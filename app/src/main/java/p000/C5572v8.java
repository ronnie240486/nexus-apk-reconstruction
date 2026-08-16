package p000;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: v8 */
/* JADX INFO: loaded from: classes.dex */
public final class C5572v8 implements Closeable, Flushable {

    /* JADX INFO: renamed from: h */
    public static final int f19069h = 201105;

    /* JADX INFO: renamed from: i */
    public static final int f19070i = 0;

    /* JADX INFO: renamed from: j */
    public static final int f19071j = 1;

    /* JADX INFO: renamed from: k */
    public static final int f19072k = 2;

    /* JADX INFO: renamed from: a */
    public final InterfaceC0193Cs f19073a;

    /* JADX INFO: renamed from: b */
    public final C4491hf f19074b;

    /* JADX INFO: renamed from: c */
    public int f19075c;

    /* JADX INFO: renamed from: d */
    public int f19076d;

    /* JADX INFO: renamed from: e */
    public int f19077e;

    /* JADX INFO: renamed from: f */
    public int f19078f;

    /* JADX INFO: renamed from: g */
    public int f19079g;

    /* JADX INFO: renamed from: v8$a */
    public class a implements Iterator<String> {

        /* JADX INFO: renamed from: a */
        public final Iterator<C4491hf.f> f19080a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public String f19081b;

        /* JADX INFO: renamed from: c */
        public boolean f19082c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C5572v8 f19083d;

        /* JADX WARN: Invalid debug info offset */
        public a(C5572v8 c5572v8) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public String m28780a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0019
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.util.Iterator
        public boolean hasNext() {
            /*
                r4 = this;
                r0 = 0
                return r0
            L2b:
            L30:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C5572v8.a.hasNext():boolean");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ String next() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Iterator
        public void remove() {
        }
    }

    /* JADX INFO: renamed from: v8$b */
    /* JADX INFO: loaded from: classes2.dex */
    public final class b implements InterfaceC0147C8 {

        /* JADX INFO: renamed from: a */
        public final C4491hf.c f19084a;

        /* JADX INFO: renamed from: b */
        public InterfaceC4803mS f19085b;

        /* JADX INFO: renamed from: c */
        public InterfaceC4803mS f19086c;

        /* JADX INFO: renamed from: d */
        public boolean f19087d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C5572v8 f19088e;

        /* JADX INFO: renamed from: v8$b$a */
        public class a extends AbstractC0567Il {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C5572v8 f19089b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C4491hf.c f19090c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ b f19091d;

            /* JADX WARN: Invalid debug info offset */
            public a(b bVar, InterfaceC4803mS interfaceC4803mS, C5572v8 c5572v8, C4491hf.c cVar) {
            }

            /* JADX WARN: Invalid debug info offset */
            /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
                jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
                	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
                	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
                */
            @Override // p000.AbstractC0567Il, p000.InterfaceC4803mS, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
            public void close() throws java.io.IOException {
                /*
                    r4 = this;
                    return
                Ld:
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.C5572v8.b.a.close():void");
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public b(C5572v8 c5572v8, C4491hf.c cVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // p000.InterfaceC0147C8
        /* JADX INFO: renamed from: a */
        public void mo911a() {
            /*
                r4 = this;
                return
            L9:
            L20:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C5572v8.b.mo911a():void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0147C8
        /* JADX INFO: renamed from: b */
        public InterfaceC4803mS mo912b() {
            return null;
        }
    }

    /* JADX INFO: renamed from: v8$c */
    public static class c extends AbstractC5175pO {

        /* JADX INFO: renamed from: d */
        public final C4491hf.f f19092d;

        /* JADX INFO: renamed from: e */
        public final InterfaceC1166S7 f19093e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public final String f19094f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public final String f19095g;

        /* JADX INFO: renamed from: v8$c$a */
        /* JADX INFO: loaded from: classes2.dex */
        public class a extends AbstractC0630Jl {

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ C4491hf.f f19096g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ c f19097h;

            /* JADX WARN: Invalid debug info offset */
            public a(c cVar, InterfaceC5858zS interfaceC5858zS, C4491hf.f fVar) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // p000.AbstractC0630Jl, p000.InterfaceC5858zS, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
            public void close() throws IOException {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public c(C4491hf.f fVar, String str, String str2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC5175pO
        public long contentLength() {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC5175pO
        public C4596jC contentType() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC5175pO
        public InterfaceC1166S7 source() {
            return null;
        }
    }

    /* JADX INFO: renamed from: v8$d */
    /* JADX INFO: loaded from: classes2.dex */
    public class d implements InterfaceC0193Cs {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C5572v8 f19098a;

        /* JADX WARN: Invalid debug info offset */
        public d(C5572v8 c5572v8) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0193Cs
        /* JADX INFO: renamed from: a */
        public void mo1169a() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0193Cs
        /* JADX INFO: renamed from: b */
        public void mo1170b(C0211D8 c0211d8) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0193Cs
        /* JADX INFO: renamed from: c */
        public void mo1171c(C4934oO c4934oO, C4934oO c4934oO2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0193Cs
        /* JADX INFO: renamed from: d */
        public C4934oO mo1172d(C0162CN c0162cn) throws IOException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0193Cs
        /* JADX INFO: renamed from: e */
        public void mo1173e(C0162CN c0162cn) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0193Cs
        /* JADX INFO: renamed from: f */
        public InterfaceC0147C8 mo1174f(C4934oO c4934oO) throws IOException {
            return null;
        }
    }

    /* JADX INFO: renamed from: v8$e */
    public static final class e {

        /* JADX INFO: renamed from: k */
        public static final String f19099k = C4864nJ.m22345k().m22349l() + "-Sent-Millis";

        /* JADX INFO: renamed from: l */
        public static final String f19100l = C4864nJ.f15283a.m22349l() + "-Received-Millis";

        /* JADX INFO: renamed from: a */
        public final String f19101a;

        /* JADX INFO: renamed from: b */
        public final C0189Co f19102b;

        /* JADX INFO: renamed from: c */
        public final String f19103c;

        /* JADX INFO: renamed from: d */
        public final EnumC0669KL f19104d;

        /* JADX INFO: renamed from: e */
        public final int f19105e;

        /* JADX INFO: renamed from: f */
        public final String f19106f;

        /* JADX INFO: renamed from: g */
        public final C0189Co f19107g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public final C4761lo f19108h;

        /* JADX INFO: renamed from: i */
        public final long f19109i;

        /* JADX INFO: renamed from: j */
        public final long f19110j;

        /* JADX WARN: Invalid debug info offset */
        public e(C4934oO c4934oO) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        public e(p000.InterfaceC5858zS r9) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 235
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C5572v8.e.<init>(zS):void");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public final boolean m28781a() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public boolean m28782b(C0162CN c0162cn, C4934oO c4934oO) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000c
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: c */
        public final java.util.List<java.security.cert.Certificate> m28783c(p000.InterfaceC1166S7 r7) throws java.io.IOException {
            /*
                r6 = this;
                r0 = 0
                return r0
            L39:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C5572v8.e.m28783c(S7):java.util.List");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public C4934oO m28784d(C4491hf.f fVar) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public final void m28785e(InterfaceC1103R7 interfaceC1103R7, List<Certificate> list) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public void m28786f(C4491hf.c cVar) throws IOException {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C5572v8(File file, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public C5572v8(File file, long j, InterfaceC5875zj interfaceC5875zj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public static String m28760S(C4375fq c4375fq) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: k0 */
    public static int m28761k0(p000.InterfaceC1166S7 r6) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        L1f:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5572v8.m28761k0(S7):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: A0 */
    public synchronized void m28762A0() {
        /*
            r1 = this;
            return
        L9:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5572v8.m28762A0():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: J0 */
    public synchronized void m28763J0(p000.C0211D8 r2) {
        /*
            r1 = this;
            return
        L12:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5572v8.m28763J0(D8):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: L0 */
    public void m28764L0(p000.C4934oO r2, p000.C4934oO r3) {
        /*
            r1 = this;
            return
        L18:
        L19:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5572v8.m28764L0(oO, oO):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public synchronized int m28765P() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public Iterator<String> m28766P0() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public void m28767R() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public synchronized int m28768T0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public synchronized int m28769U0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public long m28770V() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public synchronized int m28771b0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void delete() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Flushable
    public void flush() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @javax.annotation.Nullable
    /* JADX INFO: renamed from: g0 */
    public p000.InterfaceC0147C8 m28772g0(p000.C4934oO r6) {
        /*
            r5 = this;
            r0 = 0
            return r0
        L10:
        L42:
        L43:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5572v8.m28772g0(oO):C8");
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isClosed() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: j */
    public final void m28773j(@javax.annotation.Nullable p000.C4491hf.c r1) {
        /*
            r0 = this;
            return
        L5:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5572v8.m28773j(hf$c):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public File m28774k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l0 */
    public void m28775l0(C0162CN c0162cn) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public void m28776p() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r0 */
    public synchronized int m28777r0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u0 */
    public long m28778u0() throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @javax.annotation.Nullable
    /* JADX INFO: renamed from: w */
    public p000.C4934oO m28779w(p000.C0162CN r6) {
        /*
            r5 = this;
            r0 = 0
            return r0
        L2b:
        L2e:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5572v8.m28779w(CN):oO");
    }
}
