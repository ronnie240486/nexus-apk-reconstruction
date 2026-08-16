package android.media.ViviTV;

import android.content.Context;
import android.media.ViviTV.activity.BaseActivity;
import android.media.ViviTV.databinding.PreLauncherBinding;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import p000.C0002A1;
import p000.C0987PI;
import p000.C4649k2;
import p000.C4898np;
import p000.C5176pP;
import p000.DialogC1326Uc;

/* JADX INFO: loaded from: classes.dex */
public class Pre_launcher extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: R */
    public static final int f4698R = 5000;

    /* JADX INFO: renamed from: S */
    public static final int f4699S = 15000;

    /* JADX INFO: renamed from: T */
    public static final int f4700T = 4329;

    /* JADX INFO: renamed from: U */
    public static final boolean f4701U = false;

    /* JADX INFO: renamed from: V */
    public static Integer f4702V = 0;

    /* JADX INFO: renamed from: A */
    public C4898np f4703A;

    /* JADX INFO: renamed from: B */
    public boolean f4704B;

    /* JADX INFO: renamed from: C */
    public boolean f4705C;

    /* JADX INFO: renamed from: D */
    public C5176pP f4706D;

    /* JADX INFO: renamed from: E */
    public long f4707E;

    /* JADX INFO: renamed from: F */
    public int f4708F;

    /* JADX INFO: renamed from: G */
    public boolean f4709G;

    /* JADX INFO: renamed from: H */
    public CountDownTimer f4710H;

    /* JADX INFO: renamed from: I */
    public CountDownTimer f4711I;

    /* JADX INFO: renamed from: J */
    public int f4712J;

    /* JADX INFO: renamed from: K */
    public PreLauncherBinding f4713K;

    /* JADX INFO: renamed from: L */
    public int f4714L;

    /* JADX INFO: renamed from: M */
    public DialogC1326Uc f4715M;

    /* JADX INFO: renamed from: N */
    public long f4716N;

    /* JADX INFO: renamed from: O */
    public HashSet<String> f4717O;

    /* JADX INFO: renamed from: P */
    public CountDownLatch f4718P;

    /* JADX INFO: renamed from: Q */
    public TimerTask f4719Q;

    /* JADX INFO: renamed from: u */
    public String f4720u;

    /* JADX INFO: renamed from: v */
    public Context f4721v;

    /* JADX INFO: renamed from: w */
    public ArrayList<C4649k2> f4722w;

    /* JADX INFO: renamed from: x */
    public C0002A1 f4723x;

    /* JADX INFO: renamed from: y */
    public String f4724y;

    /* JADX INFO: renamed from: z */
    public Toast f4725z;

    /* JADX INFO: renamed from: android.media.ViviTV.Pre_launcher$a */
    public class C1743a implements DialogC1326Uc.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Pre_launcher f4726a;

        /* JADX WARN: Invalid debug info offset */
        public C1743a(Pre_launcher pre_launcher) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.DialogC1326Uc.e
        /* JADX INFO: renamed from: a */
        public void mo933a(DialogC1326Uc dialogC1326Uc, View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.Pre_launcher$b */
    public class AsyncTaskC1744b extends AsyncTask<Void, Integer, List<String>> {

        /* JADX INFO: renamed from: a */
        public int f4727a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Pre_launcher f4728b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1744b(Pre_launcher pre_launcher) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0046
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.util.List<java.lang.String> m9499a(java.lang.Void... r6) {
            /*
                r5 = this;
                r0 = 0
                return r0
            L78:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.Pre_launcher.AsyncTaskC1744b.m9499a(java.lang.Void[]):java.util.List");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9500b(List<String> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ List<String> doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(List<String> list) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.Pre_launcher$c */
    public class C1745c extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Pre_launcher f4729a;

        /* JADX INFO: renamed from: android.media.ViviTV.Pre_launcher$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1745c f4730a;

            /* JADX WARN: Invalid debug info offset */
            public a(C1745c c1745c) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public C1745c(Pre_launcher pre_launcher) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.Pre_launcher$d */
    public class C1746d implements C0987PI.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Pre_launcher f4731a;

        /* JADX WARN: Invalid debug info offset */
        public C1746d(Pre_launcher pre_launcher) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C0987PI.c
        /* JADX INFO: renamed from: a */
        public void mo4389a() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C0987PI.c
        /* JADX INFO: renamed from: b */
        public void mo4390b() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.Pre_launcher$e */
    public class C1747e extends Thread {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Pre_launcher f4732a;

        /* JADX WARN: Invalid debug info offset */
        public C1747e(Pre_launcher pre_launcher, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0006
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            /*
                r4 = this;
                return
            L13:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.Pre_launcher.C1747e.run():void");
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.Pre_launcher$f */
    public class CountDownTimerC1748f extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f4733a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Pre_launcher f4734b;

        /* JADX WARN: Invalid debug info offset */
        public CountDownTimerC1748f(Pre_launcher pre_launcher, long j, long j2, List list) {
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.Pre_launcher$g */
    public class AsyncTaskC1749g extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Pre_launcher f4735a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1749g(Pre_launcher pre_launcher) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Boolean m9501a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            return null;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.Pre_launcher$h */
    public class CountDownTimerC1750h extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Pre_launcher f4736a;

        /* JADX WARN: Invalid debug info offset */
        public CountDownTimerC1750h(Pre_launcher pre_launcher, long j, long j2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.Pre_launcher$i */
    public class RunnableC1751i implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Pre_launcher f4737a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC1751i(Pre_launcher pre_launcher) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.Pre_launcher$j */
    public class C1752j implements DialogC1326Uc.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Pre_launcher f4738a;

        /* JADX WARN: Invalid debug info offset */
        public C1752j(Pre_launcher pre_launcher) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.DialogC1326Uc.e
        /* JADX INFO: renamed from: a */
        public void mo933a(DialogC1326Uc dialogC1326Uc, View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.Pre_launcher$k */
    public class RunnableC1753k implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Pre_launcher f4739a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC1753k(Pre_launcher pre_launcher) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.Pre_launcher$l */
    public class C1754l implements DialogC1326Uc.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Pre_launcher f4740a;

        /* JADX WARN: Invalid debug info offset */
        public C1754l(Pre_launcher pre_launcher) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.DialogC1326Uc.e
        /* JADX INFO: renamed from: a */
        public void mo933a(DialogC1326Uc dialogC1326Uc, View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.Pre_launcher$m */
    public class AsyncTaskC1755m extends AsyncTask<String, String, Boolean> {

        /* JADX INFO: renamed from: a */
        public long f4741a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Pre_launcher f4742b;

        /* JADX INFO: renamed from: android.media.ViviTV.Pre_launcher$m$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AsyncTaskC1755m f4743a;

            /* JADX WARN: Invalid debug info offset */
            public a(AsyncTaskC1755m asyncTaskC1755m) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1755m(Pre_launcher pre_launcher) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.lang.Boolean m9502a(java.lang.String... r2) {
            /*
                r1 = this;
                r0 = 0
                return r0
            L20:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.Pre_launcher.AsyncTaskC1755m.m9502a(java.lang.String[]):java.lang.Boolean");
        }

        /* JADX WARN: Invalid debug info offset */
        @Nullable
        /* JADX INFO: renamed from: b */
        public final boolean m9503b() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public void m9504c(Boolean bool) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public void m9505d(String... strArr) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(String[] strArr) {
            return null;
        }

        /* JADX INFO: renamed from: e */
        public final void m9506e(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onProgressUpdate(String[] strArr) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m9421P0(Pre_launcher pre_launcher, DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m9422Q0(Pre_launcher pre_launcher, Object obj, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m9423R0(Pre_launcher pre_launcher) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m9424S0(Pre_launcher pre_launcher, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S1 */
    public static /* synthetic */ void m9425S1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ void m9426T0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ String m9427U0(Pre_launcher pre_launcher) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ Context m9428V0(Pre_launcher pre_launcher) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m9429W0(Pre_launcher pre_launcher) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m9430X0(Pre_launcher pre_launcher) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ void m9431Y0(Pre_launcher pre_launcher) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ C0002A1 m9432Z0(Pre_launcher pre_launcher) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ C0002A1 m9433a1(Pre_launcher pre_launcher, C0002A1 c0002a1) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ boolean m9434b1(Pre_launcher pre_launcher) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ int m9435c1(Pre_launcher pre_launcher) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ int m9436d1(Pre_launcher pre_launcher, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ long m9437e1(Pre_launcher pre_launcher, long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ C4898np m9438f1(Pre_launcher pre_launcher) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ C4898np m9439g1(Pre_launcher pre_launcher, C4898np c4898np) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ int m9440h1(Pre_launcher pre_launcher, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ ArrayList m9441i1(Pre_launcher pre_launcher, ArrayList arrayList) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j1 */
    public static /* synthetic */ Integer m9442j1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k1 */
    public static /* synthetic */ boolean m9443k1(Pre_launcher pre_launcher, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ Integer m9444l1(Integer num) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m1 */
    public static /* synthetic */ void m9445m1(Pre_launcher pre_launcher) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n1 */
    public static /* synthetic */ void m9446n1(Pre_launcher pre_launcher) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o1 */
    public static /* synthetic */ CountDownTimer m9447o1(Pre_launcher pre_launcher) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p1 */
    public static /* synthetic */ void m9448p1(Pre_launcher pre_launcher) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q1 */
    public static /* synthetic */ C5176pP m9449q1(Pre_launcher pre_launcher) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r1 */
    public static /* synthetic */ PreLauncherBinding m9450r1(Pre_launcher pre_launcher) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s1 */
    public static /* synthetic */ HashSet m9451s1(Pre_launcher pre_launcher) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t1 */
    public static /* synthetic */ boolean m9452t1(Pre_launcher pre_launcher) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u1 */
    public static /* synthetic */ boolean m9453u1(Pre_launcher pre_launcher, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ boolean m9454v1(Pre_launcher pre_launcher) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w1 */
    public static /* synthetic */ boolean m9455w1(Pre_launcher pre_launcher, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ void m9456x1(Pre_launcher pre_launcher) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y1 */
    public static /* synthetic */ void m9457y1(Pre_launcher pre_launcher) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z1 */
    public static /* synthetic */ long m9458z1(Pre_launcher pre_launcher, long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A1 */
    public final void m9459A1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B1 */
    public final void m9460B1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C1 */
    public final void m9461C1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0015
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: D1 */
    public final void m9462D1() {
        /*
            r4 = this;
            return
        L28:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.Pre_launcher.m9462D1():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E1 */
    public final void m9463E1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: F1 */
    public void m9464F1() {
        /*
            r4 = this;
            return
        L16:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.Pre_launcher.m9464F1():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G1 */
    public final boolean m9465G1(String[] strArr) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H1 */
    public final void m9466H1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: I1 */
    public final int m9467I1() {
        /*
            r2 = this;
            r0 = 0
            return r0
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.Pre_launcher.m9467I1():int");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J1 */
    public final void m9468J1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K1 */
    public final void m9469K1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L1 */
    public final void m9470L1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M1 */
    public final void m9471M1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N1 */
    public final boolean m9472N1(Boolean bool) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O1 */
    public final boolean m9473O1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P1 */
    public final void m9474P1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q1 */
    public final void m9475Q1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R1 */
    public final void m9476R1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m9477T1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m9478U1(Object obj, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m9479V1(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m9480W1(DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X1 */
    public final void m9481X1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y1 */
    public final boolean m9482Y1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z1 */
    public final void m9483Z1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a2 */
    public final void m9484a2() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b2 */
    public final void m9485b2(List<String> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0034
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: c2 */
    public final void m9486c2() {
        /*
            r2 = this;
            return
        L67:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.Pre_launcher.m9486c2():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d2 */
    public final void m9487d2() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e2 */
    public final void m9488e2() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f2 */
    public final void m9489f2() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g2 */
    public final void m9490g2(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h2 */
    public final void m9491h2() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i2 */
    public final void m9492i2() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j2 */
    public void m9493j2(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k2 */
    public final void m9494k2() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l2 */
    public final void m9495l2() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m2 */
    public final void m9496m2() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n2 */
    public final void m9497n2() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o2 */
    public final void m9498o2() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
    }
}
