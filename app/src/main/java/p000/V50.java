package p000;

import java.io.File;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public class V50 implements Runnable {

    /* JADX INFO: renamed from: a */
    public T50 f3560a;

    /* JADX INFO: renamed from: b */
    public URL f3561b;

    /* JADX INFO: renamed from: c */
    public HttpURLConnection f3562c;

    /* JADX INFO: renamed from: d */
    public long f3563d;

    /* JADX INFO: renamed from: e */
    public String f3564e;

    /* JADX INFO: renamed from: f */
    public boolean f3565f;

    /* JADX INFO: renamed from: g */
    public boolean f3566g;

    /* JADX INFO: renamed from: h */
    public boolean f3567h;

    /* JADX INFO: renamed from: i */
    public boolean f3568i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f3569j;

    /* JADX INFO: renamed from: k */
    public String f3570k;

    /* JADX INFO: renamed from: l */
    public C1358b f3571l;

    /* JADX INFO: renamed from: m */
    public ExecutorService f3572m;

    /* JADX INFO: renamed from: n */
    public ArrayList<Future<Boolean>> f3573n;

    /* JADX INFO: renamed from: o */
    public ArrayList<C1361e> f3574o;

    /* JADX INFO: renamed from: p */
    public ArrayList<Object> f3575p;

    /* JADX INFO: renamed from: q */
    public W50.C1425a f3576q;

    /* JADX INFO: renamed from: V50$a */
    public static class C1357a {

        /* JADX INFO: renamed from: a */
        public boolean f3577a;

        /* JADX INFO: renamed from: b */
        public byte[] f3578b;

        /* JADX INFO: renamed from: c */
        public File f3579c;

        /* JADX WARN: Invalid debug info offset */
        public String toString() {
            return null;
        }
    }

    /* JADX INFO: renamed from: V50$b */
    public static class C1358b {

        /* JADX INFO: renamed from: a */
        public String f3580a;

        /* JADX INFO: renamed from: b */
        public String f3581b;

        /* JADX INFO: renamed from: c */
        public long f3582c;

        /* JADX INFO: renamed from: d */
        public long f3583d;

        /* JADX INFO: renamed from: e */
        public boolean f3584e;

        /* JADX INFO: renamed from: f */
        public boolean f3585f;

        /* JADX INFO: renamed from: g */
        public boolean f3586g;

        /* JADX INFO: renamed from: h */
        public C1357a f3587h;

        /* JADX WARN: Invalid debug info offset */
        public C1358b() {
        }

        /* JADX WARN: Invalid debug info offset */
        public C1358b(String str, String str2, long j, long j2, boolean z, boolean z2, boolean z3) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public C1357a m6462a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public long m6463b() {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public String m6464c() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public long m6465d() {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public String m6466e() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public boolean m6467f() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g */
        public boolean m6468g() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public boolean m6469h() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: i */
        public void m6470i(C1357a c1357a) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: j */
        public void m6471j(long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public void m6472k(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: l */
        public void m6473l(long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: m */
        public void m6474m(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: n */
        public void m6475n(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: o */
        public void m6476o(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: p */
        public void m6477p(boolean z) {
        }
    }

    /* JADX INFO: renamed from: V50$c */
    public class CallableC1359c implements Callable<Boolean> {

        /* JADX INFO: renamed from: a */
        public URL f3588a;

        /* JADX INFO: renamed from: b */
        public File f3589b;

        /* JADX INFO: renamed from: c */
        public int f3590c;

        /* JADX INFO: renamed from: d */
        public C1361e f3591d;

        /* JADX INFO: renamed from: e */
        public int f3592e;

        /* JADX INFO: renamed from: f */
        public OutputStream f3593f;

        /* JADX INFO: renamed from: g */
        public EnumC1360d f3594g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ V50 f3595h;

        /* JADX WARN: Invalid debug info offset */
        public CallableC1359c(V50 v50, URL url, File file, int i, C1361e c1361e) {
        }

        /* JADX WARN: Invalid debug info offset */
        public CallableC1359c(V50 v50, URL url, OutputStream outputStream, int i, C1361e c1361e) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x006c
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.lang.Boolean m6478a() throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 262
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.V50.CallableC1359c.m6478a():java.lang.Boolean");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Boolean call() throws Exception {
            return null;
        }
    }

    /* JADX INFO: renamed from: V50$d */
    public enum EnumC1360d {
        STREAM,
        FILE
    }

    /* JADX INFO: renamed from: V50$e */
    public static class C1361e {

        /* JADX INFO: renamed from: a */
        public long f3596a;

        /* JADX INFO: renamed from: b */
        public long f3597b;

        /* JADX WARN: Invalid debug info offset */
        public C1361e() {
        }

        /* JADX WARN: Invalid debug info offset */
        public C1361e(long j, long j2) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public V50(T50 t50, URL url) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ W50.C1425a m6446b(V50 v50) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static boolean m6447c(V50 v50) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final boolean m6448a(HttpURLConnection httpURLConnection) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public C1358b m6449d() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public long m6450e() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public String m6451f() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public long m6452g() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final long m6453h(HttpURLConnection httpURLConnection) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public final String m6454i(HttpURLConnection httpURLConnection) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public String m6455j() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public boolean m6456k() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x00bf
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: l */
    public final p000.V50.C1357a m6457l(java.net.URL r18, java.lang.String r19, int r20) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.V50.m6457l(java.net.URL, java.lang.String, int):V50$a");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public void m6458m() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public boolean m6459n() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public final boolean m6460o() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public boolean m6461p() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.lang.Runnable
    public void run() {
        /*
            r8 = this;
            return
        L56:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.V50.run():void");
    }
}
