package p000;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: renamed from: kJ */
/* JADX INFO: loaded from: classes.dex */
public class C4667kJ {

    /* JADX INFO: renamed from: d */
    public static final Logger f14899d = LoggerFactory.m25035j("Pinger");

    /* JADX INFO: renamed from: e */
    public static final String f14900e = "ping";

    /* JADX INFO: renamed from: f */
    public static final String f14901f = "ping ok";

    /* JADX INFO: renamed from: a */
    public final ExecutorService f14902a;

    /* JADX INFO: renamed from: b */
    public final String f14903b;

    /* JADX INFO: renamed from: c */
    public final int f14904c;

    /* JADX INFO: renamed from: kJ$b */
    public class b implements Callable<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C4667kJ f14905a;

        /* JADX WARN: Invalid debug info offset */
        public b(C4667kJ c4667kJ) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ b(C4667kJ c4667kJ, a aVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Boolean m21775a() throws Exception {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Boolean call() throws Exception {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C4667kJ(String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m21768a(C4667kJ c4667kJ) throws C0860NL {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final List<Proxy> m21769b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final String m21770c() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public boolean m21771d(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0016
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: e */
    public boolean m21772e(int r9, int r10) {
        /*
            r8 = this;
            r0 = 0
            return r0
        L31:
        L33:
        L3c:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4667kJ.m21772e(int, int):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: f */
    public final boolean m21773f() throws p000.C0860NL {
        /*
            r6 = this;
            r0 = 0
            return r0
        L42:
        L44:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4667kJ.m21773f():boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public void m21774g(Socket socket) throws IOException {
    }
}
