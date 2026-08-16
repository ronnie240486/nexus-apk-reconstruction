package p000;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: U5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1293U5 {

    /* JADX INFO: renamed from: g */
    public static final int f3399g = 600000;

    /* JADX INFO: renamed from: h */
    public static Handler f3400h = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: i */
    public static AbstractRunnableC0406GD f3401i = new d();

    /* JADX INFO: renamed from: a */
    public C5176pP f3402a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f3403b;

    /* JADX INFO: renamed from: c */
    public InterfaceC4763lq f3404c;

    /* JADX INFO: renamed from: d */
    public boolean f3405d;

    /* JADX INFO: renamed from: e */
    public boolean f3406e;

    /* JADX INFO: renamed from: f */
    public g f3407f;

    /* JADX INFO: renamed from: U5$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC4834mq f3408a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f3409b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC1293U5 f3410c;

        /* JADX WARN: Invalid debug info offset */
        public a(AbstractC1293U5 abstractC1293U5, InterfaceC4834mq interfaceC4834mq, Runnable runnable) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: U5$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC4834mq f3411a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f3412b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC1293U5 f3413c;

        /* JADX WARN: Invalid debug info offset */
        public b(AbstractC1293U5 abstractC1293U5, InterfaceC4834mq interfaceC4834mq, Runnable runnable) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: U5$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC1293U5 f3415a;

        /* JADX WARN: Invalid debug info offset */
        public e(AbstractC1293U5 abstractC1293U5) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: U5$f */
    public static final class f {

        /* JADX INFO: renamed from: f */
        public static SimpleDateFormat f3416f = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss Z", Locale.US);

        /* JADX INFO: renamed from: a */
        public String f3417a;

        /* JADX INFO: renamed from: b */
        public String f3418b;

        /* JADX INFO: renamed from: c */
        public String f3419c;

        /* JADX INFO: renamed from: d */
        public String f3420d;

        /* JADX INFO: renamed from: e */
        public String f3421e;

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public String m6181a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public String m6182b() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public String m6183c() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public String m6184d() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public String m6185e() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public void m6186f(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g */
        public void m6187g(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public void m6188h(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: i */
        public void m6189i(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: j */
        public void m6190j(String str) {
        }
    }

    /* JADX INFO: renamed from: U5$g */
    public interface g {
        /* JADX INFO: renamed from: b0 */
        f mo6191b0(AbstractC1293U5 abstractC1293U5);
    }

    /* JADX WARN: Invalid debug info offset */
    public AbstractC1293U5(InterfaceC4763lq interfaceC4763lq) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6163a(AbstractC1293U5 abstractC1293U5, InterfaceC4834mq interfaceC4834mq) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static void m6164b() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static final void m6165e(InterfaceC4834mq interfaceC4834mq, f fVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static final void m6166g() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static void m6167i(AbstractC1293U5 abstractC1293U5, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public static void m6168q(AbstractC1293U5 abstractC1293U5) {
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo2182c();

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public boolean m6169d() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0011
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: f */
    public final void m6170f(p000.InterfaceC4834mq r2) {
        /*
            r1 = this;
            return
        L1a:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC1293U5.m6170f(mq):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public void m6171h(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public void m6172j(g gVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public void m6173k(InterfaceC4834mq interfaceC4834mq) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public void m6174l(InterfaceC4834mq interfaceC4834mq, Runnable runnable) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public final void m6175m() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: n */
    public synchronized void m6176n() {
        /*
            r3 = this;
            return
        L1e:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC1293U5.m6176n():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public void m6177o(InterfaceC4834mq interfaceC4834mq) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public void m6178p(InterfaceC4834mq interfaceC4834mq, Runnable runnable) {
    }

    /* JADX INFO: renamed from: U5$c */
    public class c extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public long f3414a;

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0016
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.lang.Boolean m6179a(java.lang.Void... r2) {
            /*
                r1 = this;
                r0 = 0
                return r0
            L25:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC1293U5.c.m6179a(java.lang.Void[]):java.lang.Boolean");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        }

        /* JADX INFO: renamed from: b */
        public void m6180b(Boolean bool) {
        }
    }

    /* JADX INFO: renamed from: U5$d */
    public class d extends AbstractRunnableC0406GD {
        @Override // p000.AbstractRunnableC0406GD
        /* JADX INFO: renamed from: x */
        public void mo2032x(Exception exc, String str) {
        }
    }
}
