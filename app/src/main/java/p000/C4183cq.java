package p000;

import android.content.Context;
import java.io.File;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: renamed from: cq */
/* JADX INFO: loaded from: classes.dex */
public class C4183cq {

    /* JADX INFO: renamed from: i */
    public static final Logger f13476i = LoggerFactory.m25035j("HttpProxyCacheServer");

    /* JADX INFO: renamed from: j */
    public static final String f13477j = "127.0.0.1";

    /* JADX INFO: renamed from: a */
    public final Object f13478a;

    /* JADX INFO: renamed from: b */
    public final ExecutorService f13479b;

    /* JADX INFO: renamed from: c */
    public final Map<String, C4248dq> f13480c;

    /* JADX INFO: renamed from: d */
    public final ServerSocket f13481d;

    /* JADX INFO: renamed from: e */
    public final int f13482e;

    /* JADX INFO: renamed from: f */
    public final Thread f13483f;

    /* JADX INFO: renamed from: g */
    public final C5251qb f13484g;

    /* JADX INFO: renamed from: h */
    public final C4667kJ f13485h;

    /* JADX INFO: renamed from: cq$b */
    public static final class b {

        /* JADX INFO: renamed from: f */
        public static final long f13486f = 536870912;

        /* JADX INFO: renamed from: a */
        public File f13487a;

        /* JADX INFO: renamed from: b */
        public InterfaceC4558ij f13488b;

        /* JADX INFO: renamed from: c */
        public InterfaceC4689kf f13489c;

        /* JADX INFO: renamed from: d */
        public InterfaceC0167CS f13490d;

        /* JADX INFO: renamed from: e */
        public InterfaceC5327ro f13491e;

        /* JADX WARN: Invalid debug info offset */
        public b(Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ C5251qb m19706a(b bVar) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public C4183cq m19707b() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public final C5251qb m19708c() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public b m19709d(File file) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public b m19710e(InterfaceC4689kf interfaceC4689kf) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public b m19711f(InterfaceC4558ij interfaceC4558ij) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g */
        public b m19712g(InterfaceC5327ro interfaceC5327ro) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public b m19713h(int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: i */
        public b m19714i(long j) {
            return null;
        }
    }

    /* JADX INFO: renamed from: cq$c */
    public final class c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final Socket f13492a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4183cq f13493b;

        /* JADX WARN: Invalid debug info offset */
        public c(C4183cq c4183cq, Socket socket) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: cq$d */
    public final class d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final CountDownLatch f13494a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4183cq f13495b;

        /* JADX WARN: Invalid debug info offset */
        public d(C4183cq c4183cq, CountDownLatch countDownLatch) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C4183cq(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0022
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public C4183cq(p000.C5251qb r6) {
        /*
            r5 = this;
            return
        L6c:
        L6e:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4183cq.<init>(qb):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public /* synthetic */ C4183cq(C5251qb c5251qb, a aVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19683a(C4183cq c4183cq) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m19684b(C4183cq c4183cq, Socket socket) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final String m19685c(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final void m19686d(Socket socket) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:4:0x0016
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    /* JADX INFO: renamed from: e */
    public final void m19687e(java.net.Socket r3) {
        /*
            r2 = this;
            return
        La:
        L16:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4183cq.m19687e(java.net.Socket):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public final void m19688f(Socket socket) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public final File m19689g(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: h */
    public final p000.C4248dq m19690h(java.lang.String r4) throws p000.C0860NL {
        /*
            r3 = this;
            r0 = 0
            return r0
        L1a:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4183cq.m19690h(java.lang.String):dq");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: i */
    public final int m19691i() {
        /*
            r4 = this;
            r0 = 0
            return r0
        L22:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4183cq.m19691i():int");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public String m19692j(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public String m19693k(String str, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public final boolean m19694l() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public boolean m19695m(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public final void m19696n(Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: o */
    public final void m19697o(java.net.Socket r6) {
        /*
            r5 = this;
            return
        L31:
        L33:
        L35:
        L78:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4183cq.m19697o(java.net.Socket):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: p */
    public void m19698p(p000.InterfaceC5838z8 r3, java.lang.String r4) {
        /*
            r2 = this;
            return
        L17:
        L19:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4183cq.m19698p(z8, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public final void m19699q(Socket socket) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0016
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: r */
    public void m19700r() {
        /*
            r3 = this;
            return
        L24:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4183cq.m19700r():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: s */
    public final void m19701s() {
        /*
            r3 = this;
            return
        L1d:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4183cq.m19701s():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public final void m19702t(File file) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: u */
    public void m19703u(p000.InterfaceC5838z8 r4) {
        /*
            r3 = this;
            return
        L20:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4183cq.m19703u(z8):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: v */
    public void m19704v(p000.InterfaceC5838z8 r3, java.lang.String r4) {
        /*
            r2 = this;
            return
        L17:
        L19:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4183cq.m19704v(z8, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public final void m19705w() {
    }
}
