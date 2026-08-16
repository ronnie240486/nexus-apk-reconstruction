package android.media.ViviTV.player;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.media.ViviTV.activity.BaseActivity;
import android.media.ViviTV.fragmens.PasswordVerifyFragment;
import android.media.ViviTV.model.persistent.EpgItemInfo;
import android.media.ViviTV.model.persistent.EpgItemReviewInfo;
import android.media.ViviTV.model.persistent.LiveChannelInfo;
import android.media.ViviTV.model.persistent.LiveTypeInfo;
import android.media.ViviTV.player.widget.AbstractC2308a;
import android.media.ViviTV.player.widget.DolitVideoView;
import android.media.ViviTV.widget.EnhancedMarqueeTextView;
import android.media.dialog.CommonDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.afollestad.materialdialogs.MaterialDialog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import p000.AbstractAsyncTaskC0387Fv;
import p000.AbstractC1293U5;
import p000.AsyncTaskC5649wL;
import p000.C0124Bv;
import p000.C0324Ev;
import p000.C0447Gs;
import p000.C0511Hs;
import p000.C0544IO;
import p000.C0893Ns;
import p000.C0994PP;
import p000.C1091Qv;
import p000.C1671Zv;
import p000.C4649k2;
import p000.C5621vv;
import p000.DialogC1326Uc;
import p000.DialogC1413Vv;
import p000.EnumC6006m10;
import p000.InterfaceC0319Eq;
import p000.InterfaceC4763lq;
import p000.InterfaceC4834mq;
import p000.Z30;

/* JADX INFO: loaded from: classes.dex */
public class LivePlayer extends BaseActivity implements AbstractC2308a.c, AbstractC2308a.g, AbstractC2308a.b, BaseActivity.InterfaceC1768i, AbstractC2308a.d, AbstractC1293U5.g, View.OnClickListener, AbstractC2308a.e, AbstractC2308a.f {

    /* JADX INFO: renamed from: A2 */
    public static final int f8936A2 = 0;

    /* JADX INFO: renamed from: B2 */
    public static final int f8937B2 = 0;

    /* JADX INFO: renamed from: C2 */
    public static final int f8938C2 = 1;

    /* JADX INFO: renamed from: D2 */
    public static final int f8939D2 = 2;

    /* JADX INFO: renamed from: E2 */
    public static final int f8940E2 = 6;

    /* JADX INFO: renamed from: F2 */
    public static final int f8941F2 = 7;

    /* JADX INFO: renamed from: G2 */
    public static final int f8942G2 = 8;

    /* JADX INFO: renamed from: H2 */
    public static final int f8943H2 = 10;

    /* JADX INFO: renamed from: I2 */
    public static final int f8944I2 = 11;

    /* JADX INFO: renamed from: J2 */
    public static final int f8945J2 = 12;

    /* JADX INFO: renamed from: K2 */
    public static final int f8946K2 = 50;

    /* JADX INFO: renamed from: L2 */
    public static final int f8947L2 = 51;

    /* JADX INFO: renamed from: M2 */
    public static final int f8948M2 = 52;

    /* JADX INFO: renamed from: N2 */
    public static final int f8949N2 = 53;

    /* JADX INFO: renamed from: O2 */
    public static final int f8950O2 = 54;

    /* JADX INFO: renamed from: P2 */
    public static final int f8951P2 = 99;

    /* JADX INFO: renamed from: n2 */
    public static final String f8952n2 = "ViviTV/LivePlayer";

    /* JADX INFO: renamed from: o2 */
    public static final int f8953o2 = 10000;

    /* JADX INFO: renamed from: p2 */
    public static final int f8954p2 = 0;

    /* JADX INFO: renamed from: q2 */
    public static final int f8955q2 = 3456;

    /* JADX INFO: renamed from: r2 */
    public static final int f8956r2 = 3457;

    /* JADX INFO: renamed from: s2 */
    public static final int f8957s2 = 3458;

    /* JADX INFO: renamed from: t2 */
    public static final int f8958t2 = 0;

    /* JADX INFO: renamed from: u2 */
    public static final int f8959u2 = 1;

    /* JADX INFO: renamed from: v2 */
    public static final int f8960v2 = 2;

    /* JADX INFO: renamed from: w2 */
    public static final int f8961w2 = 3;

    /* JADX INFO: renamed from: x2 */
    public static final int f8962x2 = 4;

    /* JADX INFO: renamed from: y2 */
    public static final int f8963y2 = 5;

    /* JADX INFO: renamed from: z2 */
    public static final int f8964z2 = 1;

    /* JADX INFO: renamed from: A */
    public int f8965A;

    /* JADX INFO: renamed from: A1 */
    public long f8966A1;

    /* JADX INFO: renamed from: B */
    public C0124Bv f8967B;

    /* JADX INFO: renamed from: B1 */
    public long f8968B1;

    /* JADX INFO: renamed from: C */
    public LiveControl f8969C;

    /* JADX INFO: renamed from: C1 */
    public float f8970C1;

    /* JADX INFO: renamed from: D */
    public DialogC2292a f8971D;

    /* JADX INFO: renamed from: D1 */
    public boolean f8972D1;

    /* JADX INFO: renamed from: E */
    public ViewOnKeyListenerC2293b f8973E;

    /* JADX INFO: renamed from: E1 */
    public long f8974E1;

    /* JADX INFO: renamed from: F */
    public WindowManager f8975F;

    /* JADX INFO: renamed from: F1 */
    public long f8976F1;

    /* JADX INFO: renamed from: G */
    public WindowManager.LayoutParams f8977G;

    /* JADX INFO: renamed from: G1 */
    public String f8978G1;

    /* JADX INFO: renamed from: H */
    public EnumC6006m10 f8979H;

    /* JADX INFO: renamed from: H1 */
    public TextView f8980H1;

    /* JADX INFO: renamed from: I */
    public long f8981I;

    /* JADX INFO: renamed from: I1 */
    public long f8982I1;

    /* JADX INFO: renamed from: J */
    public long f8983J;

    /* JADX INFO: renamed from: J1 */
    public boolean f8984J1;

    /* JADX INFO: renamed from: K */
    public long f8985K;

    /* JADX INFO: renamed from: K1 */
    public boolean f8986K1;

    /* JADX INFO: renamed from: L */
    public boolean f8987L;

    /* JADX INFO: renamed from: L1 */
    public long f8988L1;

    /* JADX INFO: renamed from: M */
    public int f8989M;

    /* JADX INFO: renamed from: M1 */
    public Timer f8990M1;

    /* JADX INFO: renamed from: N */
    public TimerTask f8991N;

    /* JADX INFO: renamed from: N1 */
    public FrameLayout f8992N1;

    /* JADX INFO: renamed from: O */
    public Timer f8993O;

    /* JADX INFO: renamed from: O1 */
    public List<InterfaceC2259T> f8994O1;

    /* JADX INFO: renamed from: P */
    public C4649k2 f8995P;

    /* JADX INFO: renamed from: P1 */
    public ExecutorService f8996P1;

    /* JADX INFO: renamed from: Q */
    public boolean f8997Q;

    /* JADX INFO: renamed from: Q1 */
    public Timer f8998Q1;

    /* JADX INFO: renamed from: R */
    public boolean f8999R;

    /* JADX INFO: renamed from: R0 */
    public boolean f9000R0;

    /* JADX INFO: renamed from: R1 */
    public String f9001R1;

    /* JADX INFO: renamed from: S */
    public AudioManager f9002S;

    /* JADX INFO: renamed from: S0 */
    public String f9003S0;

    /* JADX INFO: renamed from: S1 */
    public C0994PP f9004S1;

    /* JADX INFO: renamed from: T */
    public int f9005T;

    /* JADX INFO: renamed from: T0 */
    public Runnable f9006T0;

    /* JADX INFO: renamed from: T1 */
    public long f9007T1;

    /* JADX INFO: renamed from: U */
    public int f9008U;

    /* JADX INFO: renamed from: U0 */
    public C1091Qv f9009U0;

    /* JADX INFO: renamed from: U1 */
    public Timer f9010U1;

    /* JADX INFO: renamed from: V */
    public int f9011V;

    /* JADX INFO: renamed from: V0 */
    public long f9012V0;

    /* JADX INFO: renamed from: V1 */
    public final boolean f9013V1;

    /* JADX INFO: renamed from: W */
    public float f9014W;

    /* JADX INFO: renamed from: W0 */
    public RelativeLayout f9015W0;

    /* JADX INFO: renamed from: W1 */
    public Map<String, LiveTypeInfo> f9016W1;

    /* JADX INFO: renamed from: X */
    public float f9017X;

    /* JADX INFO: renamed from: X0 */
    public RelativeLayout f9018X0;

    /* JADX INFO: renamed from: X1 */
    public View f9019X1;

    /* JADX INFO: renamed from: Y */
    public float f9020Y;

    /* JADX INFO: renamed from: Y0 */
    public C5621vv f9021Y0;

    /* JADX INFO: renamed from: Y1 */
    public C0544IO f9022Y1;

    /* JADX INFO: renamed from: Z */
    public boolean f9023Z;

    /* JADX INFO: renamed from: Z0 */
    public EnhancedMarqueeTextView f9024Z0;

    /* JADX INFO: renamed from: Z1 */
    public EpgItemInfo f9025Z1;

    /* JADX INFO: renamed from: a1 */
    public ImageView f9026a1;

    /* JADX INFO: renamed from: a2 */
    public String f9027a2;

    /* JADX INFO: renamed from: b1 */
    public ImageView f9028b1;

    /* JADX INFO: renamed from: b2 */
    public C0893Ns f9029b2;

    /* JADX INFO: renamed from: c1 */
    public View f9030c1;

    /* JADX INFO: renamed from: c2 */
    public int f9031c2;

    /* JADX INFO: renamed from: d1 */
    public ImageView f9032d1;

    /* JADX INFO: renamed from: d2 */
    public int f9033d2;

    /* JADX INFO: renamed from: e1 */
    public C0447Gs f9034e1;

    /* JADX INFO: renamed from: e2 */
    public long f9035e2;

    /* JADX INFO: renamed from: f1 */
    public C0511Hs f9036f1;

    /* JADX INFO: renamed from: f2 */
    public Handler f9037f2;

    /* JADX INFO: renamed from: g1 */
    public Z30 f9038g1;

    /* JADX INFO: renamed from: g2 */
    public Dialog f9039g2;

    /* JADX INFO: renamed from: h1 */
    public C0447Gs f9040h1;

    /* JADX INFO: renamed from: h2 */
    public TextView f9041h2;

    /* JADX INFO: renamed from: i1 */
    public int f9042i1;

    /* JADX INFO: renamed from: i2 */
    public boolean f9043i2;

    /* JADX INFO: renamed from: j1 */
    public Timer f9044j1;

    /* JADX INFO: renamed from: j2 */
    public Runnable f9045j2;

    /* JADX INFO: renamed from: k1 */
    public AsyncTask<Void, Integer, C5621vv> f9046k1;

    /* JADX INFO: renamed from: k2 */
    public ViewOnKeyListenerC2293b.b f9047k2;

    /* JADX INFO: renamed from: l1 */
    public String f9048l1;

    /* JADX INFO: renamed from: l2 */
    public BroadcastReceiver f9049l2;

    /* JADX INFO: renamed from: m1 */
    public boolean f9050m1;

    /* JADX INFO: renamed from: m2 */
    public View.OnKeyListener f9051m2;

    /* JADX INFO: renamed from: n1 */
    public boolean f9052n1;

    /* JADX INFO: renamed from: o1 */
    public DialogC1326Uc f9053o1;

    /* JADX INFO: renamed from: p1 */
    public DialogC1326Uc f9054p1;

    /* JADX INFO: renamed from: q1 */
    public C0893Ns f9055q1;

    /* JADX INFO: renamed from: r1 */
    public DialogC1326Uc f9056r1;

    /* JADX INFO: renamed from: s1 */
    public List<LiveTypeInfo> f9057s1;

    /* JADX INFO: renamed from: t1 */
    public LiveTypeInfo f9058t1;

    /* JADX INFO: renamed from: u */
    public DolitVideoView f9059u;

    /* JADX INFO: renamed from: u1 */
    public boolean f9060u1;

    /* JADX INFO: renamed from: v */
    public View f9061v;

    /* JADX INFO: renamed from: v1 */
    public HashSet<String> f9062v1;

    /* JADX INFO: renamed from: w */
    public List<LiveChannelInfo> f9063w;

    /* JADX INFO: renamed from: w1 */
    public TextView f9064w1;

    /* JADX INFO: renamed from: x */
    public int f9065x;

    /* JADX INFO: renamed from: x1 */
    public long f9066x1;

    /* JADX INFO: renamed from: y */
    public int f9067y;

    /* JADX INFO: renamed from: y1 */
    public Button f9068y1;

    /* JADX INFO: renamed from: z */
    public int f9069z;

    /* JADX INFO: renamed from: z1 */
    public C0994PP f9070z1;

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$A */
    public class RunnableC2240A implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9071a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2240A(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$B */
    public class C2241B extends PasswordVerifyFragment.AbstractC2083c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LiveChannelInfo f9072a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LivePlayer f9073b;

        /* JADX WARN: Invalid debug info offset */
        public C2241B(LivePlayer livePlayer, LiveChannelInfo liveChannelInfo) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.fragmens.PasswordVerifyFragment.AbstractC2083c, android.media.ViviTV.fragmens.PasswordVerifyFragment.InterfaceC2082b
        /* JADX INFO: renamed from: a */
        public void mo12484a(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.fragmens.PasswordVerifyFragment.InterfaceC2082b
        /* JADX INFO: renamed from: b */
        public void mo12400b(PasswordVerifyFragment passwordVerifyFragment) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$C */
    public class C2242C implements DialogC1326Uc.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9074a;

        /* JADX WARN: Invalid debug info offset */
        public C2242C(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.DialogC1326Uc.e
        /* JADX INFO: renamed from: a */
        public void mo933a(DialogC1326Uc dialogC1326Uc, View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$D */
    public class DialogInterfaceOnCancelListenerC2243D implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9075a;

        /* JADX WARN: Invalid debug info offset */
        public DialogInterfaceOnCancelListenerC2243D(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$E */
    public class DialogInterfaceOnShowListenerC2244E implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9076a;

        /* JADX WARN: Invalid debug info offset */
        public DialogInterfaceOnShowListenerC2244E(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$F */
    public class AsyncTaskC2245F extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f9077a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LivePlayer f9078b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2245F(LivePlayer livePlayer, Runnable runnable) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Boolean m13647a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m13648b(Boolean bool) {
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
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$G */
    public class RunnableC2246G implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9079a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2246G(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$H */
    public class C2247H implements ViewOnKeyListenerC2293b.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9080a;

        /* JADX WARN: Invalid debug info offset */
        public C2247H(LivePlayer livePlayer) {
        }

        @Override // android.media.ViviTV.player.ViewOnKeyListenerC2293b.b
        /* JADX INFO: renamed from: a */
        public void mo13073a(ArrayList<String> arrayList) {
        }

        @Override // android.media.ViviTV.player.ViewOnKeyListenerC2293b.b
        /* JADX INFO: renamed from: b */
        public void mo13074b() {
        }

        @Override // android.media.ViviTV.player.ViewOnKeyListenerC2293b.b
        /* JADX INFO: renamed from: c */
        public void mo13075c() {
        }

        @Override // android.media.ViviTV.player.ViewOnKeyListenerC2293b.b
        /* JADX INFO: renamed from: d */
        public String mo13076d() {
            return null;
        }

        @Override // android.media.ViviTV.player.ViewOnKeyListenerC2293b.b
        /* JADX INFO: renamed from: e */
        public String mo13077e(int i) {
            return null;
        }

        @Override // android.media.ViviTV.player.ViewOnKeyListenerC2293b.b
        /* JADX INFO: renamed from: f */
        public int mo13078f() {
            return 1;
        }

        @Override // android.media.ViviTV.player.ViewOnKeyListenerC2293b.b
        /* JADX INFO: renamed from: g */
        public ArrayList<String> mo13079g() {
            return null;
        }

        @Override // android.media.ViviTV.player.ViewOnKeyListenerC2293b.b
        public int getCurrentPosition() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.player.ViewOnKeyListenerC2293b.b
        /* JADX INFO: renamed from: h */
        public void mo13080h(ViewOnKeyListenerC2293b viewOnKeyListenerC2293b) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.player.ViewOnKeyListenerC2293b.b
        /* JADX INFO: renamed from: i */
        public void mo13081i() {
        }

        @Override // android.media.ViviTV.player.ViewOnKeyListenerC2293b.b
        /* JADX INFO: renamed from: j */
        public int mo13082j() {
            return 0;
        }

        @Override // android.media.ViviTV.player.ViewOnKeyListenerC2293b.b
        /* JADX INFO: renamed from: k */
        public void mo13083k(boolean z) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$I */
    public class C2248I extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9081a;

        /* JADX WARN: Invalid debug info offset */
        public C2248I(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$J */
    public class AsyncTaskC2249J extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public LiveChannelInfo f9082a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LivePlayer f9083b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2249J(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Boolean m13649a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m13650b(Boolean bool) {
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
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$K */
    public class ViewOnKeyListenerC2250K implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9084a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC2250K(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$L */
    public class AsyncTaskC2251L extends AsyncTaskC5649wL {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ EpgItemInfo f9085i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ LivePlayer f9086j;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2251L(LivePlayer livePlayer, Context context, String str, EpgItemInfo epgItemInfo, String str2, String str3, EpgItemInfo epgItemInfo2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AsyncTaskC5649wL
        /* JADX INFO: renamed from: b */
        public void mo13651b(Boolean bool) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AsyncTaskC5649wL, android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$M */
    public class AsyncTaskC2252M extends AsyncTask<Void, Integer, LiveChannelInfo> {

        /* JADX INFO: renamed from: a */
        public DialogC1413Vv f9087a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f9088b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f9089c;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2252M(Context context, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public android.media.ViviTV.model.persistent.LiveChannelInfo m13652a(java.lang.Void... r3) {
            /*
                r2 = this;
                r0 = 0
                return r0
            L15:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.LivePlayer.AsyncTaskC2252M.m13652a(java.lang.Void[]):android.media.ViviTV.model.persistent.LiveChannelInfo");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m13653b(LiveChannelInfo liveChannelInfo) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ LiveChannelInfo doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(LiveChannelInfo liveChannelInfo) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$N */
    public class AsyncTaskC2253N extends AsyncTask<Void, Integer, Integer> {

        /* JADX INFO: renamed from: a */
        public MaterialDialog f9090a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LivePlayer f9091b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2253N(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Integer m13654a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m13655b(Integer num) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Integer doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Integer num) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$O */
    public class RunnableC2254O implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9092a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2254O(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$P */
    public class C2255P implements DialogC2292a.F {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9093a;

        /* JADX WARN: Invalid debug info offset */
        public C2255P(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.player.DialogC2292a.F
        /* JADX INFO: renamed from: a */
        public void mo13656a(EpgItemInfo epgItemInfo) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.player.DialogC2292a.F
        /* JADX INFO: renamed from: b */
        public void mo13657b(LiveChannelInfo liveChannelInfo) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.player.DialogC2292a.F
        /* JADX INFO: renamed from: c */
        public boolean mo13658c(LiveTypeInfo liveTypeInfo) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.player.DialogC2292a.F
        /* JADX INFO: renamed from: d */
        public void mo13659d(LiveTypeInfo liveTypeInfo) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.player.DialogC2292a.F
        /* JADX INFO: renamed from: e */
        public void mo13660e(LiveTypeInfo liveTypeInfo) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$Q */
    public class RunnableC2256Q implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9094a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2256Q(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$R */
    public class AsyncTaskC2257R extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public int f9095a;

        /* JADX INFO: renamed from: b */
        public MaterialDialog f9096b;

        /* JADX INFO: renamed from: c */
        public long f9097c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f9098d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f9099e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ long f9100f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ LivePlayer f9101g;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2257R(LivePlayer livePlayer, String str, boolean z, long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0010
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.lang.Boolean m13661a(java.lang.Void... r5) {
            /*
                r4 = this;
                r0 = 0
                return r0
            L1d:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.LivePlayer.AsyncTaskC2257R.m13661a(java.lang.Void[]):java.lang.Boolean");
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x004a
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: b */
        public void m13662b(java.lang.Boolean r12) {
            /*
                r11 = this;
                return
            L72:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.LivePlayer.AsyncTaskC2257R.m13662b(java.lang.Boolean):void");
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

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$S */
    public class C2258S implements DialogC1326Uc.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f9102a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LivePlayer f9103b;

        /* JADX WARN: Invalid debug info offset */
        public C2258S(LivePlayer livePlayer, long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.DialogC1326Uc.e
        /* JADX INFO: renamed from: a */
        public void mo933a(DialogC1326Uc dialogC1326Uc, View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$T */
    public interface InterfaceC2259T {
        /* JADX INFO: renamed from: g */
        boolean mo13663g(LiveChannelInfo liveChannelInfo, boolean z);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$U */
    public static final class C2260U {

        /* JADX INFO: renamed from: a */
        public boolean f9104a;

        /* JADX INFO: renamed from: b */
        public int f9105b;

        /* JADX WARN: Invalid debug info offset */
        public C2260U(boolean z, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public int m13664a() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public boolean m13665b() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public void m13666c(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public void m13667d(boolean z) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$V */
    public class AsyncTaskC2261V extends AsyncTask<C1091Qv, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public C1091Qv f9106a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LivePlayer f9107b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2261V(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ AsyncTaskC2261V(LivePlayer livePlayer, C2273k c2273k) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0023
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.lang.Boolean m13668a(p000.C1091Qv... r5) {
            /*
                r4 = this;
                r0 = 0
                return r0
            L4a:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.LivePlayer.AsyncTaskC2261V.m13668a(Qv[]):java.lang.Boolean");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m13669b(Boolean bool) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(C1091Qv[] c1091QvArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$W */
    public static class C2262W {

        /* JADX INFO: renamed from: a */
        public int f9108a;

        /* JADX INFO: renamed from: b */
        public String f9109b;

        /* JADX INFO: renamed from: c */
        public List<LiveChannelInfo> f9110c;

        /* JADX WARN: Invalid debug info offset */
        public C2262W(int i, String str, List<LiveChannelInfo> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ List m13670a(C2262W c2262w) {
            return null;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$a */
    public class AsyncTaskC2263a extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public int f9111a;

        /* JADX INFO: renamed from: b */
        public String f9112b;

        /* JADX INFO: renamed from: c */
        public long f9113c;

        /* JADX INFO: renamed from: d */
        public String f9114d;

        /* JADX INFO: renamed from: e */
        public MaterialDialog f9115e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String f9116f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ LiveChannelInfo f9117g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ long f9118h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ LivePlayer f9119i;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2263a(LivePlayer livePlayer, String str, LiveChannelInfo liveChannelInfo, long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0027
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.lang.Boolean m13671a(java.lang.Void... r8) {
            /*
                r7 = this;
                r0 = 0
                return r0
            L34:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.LivePlayer.AsyncTaskC2263a.m13671a(java.lang.Void[]):java.lang.Boolean");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m13672b(Boolean bool) {
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

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$b */
    public class C2264b extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9120a;

        /* JADX WARN: Invalid debug info offset */
        public C2264b(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$c */
    public class AsyncTaskC2265c extends AsyncTask<Void, Integer, C5621vv> {

        /* JADX INFO: renamed from: a */
        public int f9121a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f9122b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Runnable f9123c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ LivePlayer f9124d;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2265c(LivePlayer livePlayer, String str, Runnable runnable) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public p000.C5621vv m13673a(java.lang.Void... r7) {
            /*
                r6 = this;
                r0 = 0
                return r0
            L7e:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.LivePlayer.AsyncTaskC2265c.m13673a(java.lang.Void[]):vv");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m13674b(C5621vv c5621vv) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ C5621vv doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(C5621vv c5621vv) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$d */
    public class RunnableC2266d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f9125a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LivePlayer f9126b;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2266d(LivePlayer livePlayer, Runnable runnable) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$f */
    public class C2268f implements InterfaceC4763lq {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9128a;

        /* JADX WARN: Invalid debug info offset */
        public C2268f(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4763lq
        /* JADX INFO: renamed from: X */
        public void mo9766X(InterfaceC4834mq interfaceC4834mq) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4763lq
        /* JADX INFO: renamed from: g */
        public void mo9767g() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4763lq
        /* JADX INFO: renamed from: v0 */
        public void mo9768v0(InterfaceC4834mq interfaceC4834mq) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$h */
    public class C2270h implements InterfaceC4763lq {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9130a;

        /* JADX WARN: Invalid debug info offset */
        public C2270h(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4763lq
        /* JADX INFO: renamed from: X */
        public void mo9766X(InterfaceC4834mq interfaceC4834mq) {
        }

        @Override // p000.InterfaceC4763lq
        /* JADX INFO: renamed from: g */
        public void mo9767g() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4763lq
        /* JADX INFO: renamed from: v0 */
        public void mo9768v0(InterfaceC4834mq interfaceC4834mq) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$i */
    public class C2271i implements CommonDialog.InterfaceC2374a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9131a;

        /* JADX WARN: Invalid debug info offset */
        public C2271i(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.dialog.CommonDialog.InterfaceC2374a
        /* JADX INFO: renamed from: a */
        public void mo9533a() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.dialog.CommonDialog.InterfaceC2374a
        /* JADX INFO: renamed from: b */
        public void mo9534b() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$j */
    public class C2272j extends PasswordVerifyFragment.AbstractC2083c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LiveChannelInfo f9132a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1091Qv f9133b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C2260U f9134c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ LivePlayer f9135d;

        /* JADX WARN: Invalid debug info offset */
        public C2272j(LivePlayer livePlayer, LiveChannelInfo liveChannelInfo, C1091Qv c1091Qv, C2260U c2260u) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.fragmens.PasswordVerifyFragment.AbstractC2083c, android.media.ViviTV.fragmens.PasswordVerifyFragment.InterfaceC2082b
        /* JADX INFO: renamed from: a */
        public void mo12484a(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.fragmens.PasswordVerifyFragment.InterfaceC2082b
        /* JADX INFO: renamed from: b */
        public void mo12400b(PasswordVerifyFragment passwordVerifyFragment) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$k */
    public class C2273k extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9136a;

        /* JADX WARN: Invalid debug info offset */
        public C2273k(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$l */
    public class C2274l implements DialogC1326Uc.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f9137a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LiveChannelInfo f9138b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1091Qv f9139c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C2260U f9140d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ LivePlayer f9141e;

        /* JADX WARN: Invalid debug info offset */
        public C2274l(LivePlayer livePlayer, String str, LiveChannelInfo liveChannelInfo, C1091Qv c1091Qv, C2260U c2260u) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.DialogC1326Uc.e
        /* JADX INFO: renamed from: a */
        public void mo933a(DialogC1326Uc dialogC1326Uc, View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$m */
    public class RunnableC2275m implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1091Qv f9142a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f9143b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LivePlayer f9144c;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2275m(LivePlayer livePlayer, C1091Qv c1091Qv, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$n */
    public class C2276n extends PasswordVerifyFragment.AbstractC2083c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2262W f9145a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LiveChannelInfo f9146b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LivePlayer f9147c;

        /* JADX WARN: Invalid debug info offset */
        public C2276n(LivePlayer livePlayer, C2262W c2262w, LiveChannelInfo liveChannelInfo) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.fragmens.PasswordVerifyFragment.AbstractC2083c, android.media.ViviTV.fragmens.PasswordVerifyFragment.InterfaceC2082b
        /* JADX INFO: renamed from: a */
        public void mo12484a(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.fragmens.PasswordVerifyFragment.InterfaceC2082b
        /* JADX INFO: renamed from: b */
        public void mo12400b(PasswordVerifyFragment passwordVerifyFragment) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$o */
    public class C2277o implements DialogC1326Uc.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LiveChannelInfo f9148a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LivePlayer f9149b;

        /* JADX WARN: Invalid debug info offset */
        public C2277o(LivePlayer livePlayer, LiveChannelInfo liveChannelInfo) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.DialogC1326Uc.e
        /* JADX INFO: renamed from: a */
        public void mo933a(DialogC1326Uc dialogC1326Uc, View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$p */
    public class DialogInterfaceOnCancelListenerC2278p implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9150a;

        /* JADX WARN: Invalid debug info offset */
        public DialogInterfaceOnCancelListenerC2278p(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$q */
    public class DialogInterfaceOnShowListenerC2279q implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9151a;

        /* JADX WARN: Invalid debug info offset */
        public DialogInterfaceOnShowListenerC2279q(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$r */
    public class RunnableC2280r implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9152a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2280r(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$s */
    public class RunnableC2281s implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9153a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2281s(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$t */
    public class AsyncTaskC2282t extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public boolean f9154a;

        /* JADX INFO: renamed from: b */
        public LiveChannelInfo f9155b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LivePlayer f9156c;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2282t(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Boolean m13675a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m13676b(Boolean bool) {
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
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$u */
    public class C2283u extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9157a;

        /* JADX WARN: Invalid debug info offset */
        public C2283u(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m13677a(C2283u c2283u) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m13678b() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$v */
    public class C2284v extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9158a;

        /* JADX WARN: Invalid debug info offset */
        public C2284v(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$w */
    public class C2285w extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9159a;

        /* JADX WARN: Invalid debug info offset */
        public C2285w(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$x */
    public class RunnableC2286x implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f9160a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f9161b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LivePlayer f9162c;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2286x(LivePlayer livePlayer, TextView textView, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$y */
    public class AsyncTaskC2287y extends AbstractAsyncTaskC0387Fv {

        /* JADX INFO: renamed from: k */
        public EpgItemInfo f9163k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ C0324Ev f9164l;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f9165m;

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ LivePlayer f9166n;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2287y(LivePlayer livePlayer, Context context, String str, String str2, C0324Ev c0324Ev, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractAsyncTaskC0387Fv
        /* JADX INFO: renamed from: d */
        public void mo1958d(List<EpgItemReviewInfo> list, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractAsyncTaskC0387Fv
        /* JADX INFO: renamed from: f */
        public void mo1960f(List<EpgItemReviewInfo> list) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$z */
    public class HandlerC2288z extends Handler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9167a;

        /* JADX WARN: Invalid debug info offset */
        public HandlerC2288z(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A1 */
    public static /* synthetic */ C5621vv m13374A1(LivePlayer livePlayer, C5621vv c5621vv) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A2 */
    public static /* synthetic */ LiveControl m13375A2(LivePlayer livePlayer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A3 */
    public static String m13376A3(Context context, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A5 */
    public static void m13377A5(FragmentActivity fragmentActivity, LiveTypeInfo liveTypeInfo, PasswordVerifyFragment.AbstractC2083c abstractC2083c) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B1 */
    public static /* synthetic */ boolean m13378B1(LivePlayer livePlayer) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B2 */
    public static /* synthetic */ boolean m13379B2(LivePlayer livePlayer) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ void m13380C1(LivePlayer livePlayer, Runnable runnable) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C2 */
    public static /* synthetic */ Dialog m13381C2(LivePlayer livePlayer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D1 */
    public static /* synthetic */ ImageView m13382D1(LivePlayer livePlayer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D2 */
    public static /* synthetic */ void m13383D2(LivePlayer livePlayer, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E1 */
    public static /* synthetic */ EnhancedMarqueeTextView m13384E1(LivePlayer livePlayer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E2 */
    public static /* synthetic */ boolean m13385E2(LivePlayer livePlayer) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F1 */
    public static /* synthetic */ void m13386F1(LivePlayer livePlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F2 */
    public static /* synthetic */ void m13387F2(LivePlayer livePlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F5 */
    private void m13388F5() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ ImageView m13389G1(LivePlayer livePlayer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G2 */
    public static /* synthetic */ TextView m13390G2(LivePlayer livePlayer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H1 */
    public static /* synthetic */ View m13391H1(LivePlayer livePlayer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H2 */
    public static /* synthetic */ boolean m13392H2(LivePlayer livePlayer, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H3 */
    public static Map<String, String> m13393H3(Context context, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ void m13394I1(LivePlayer livePlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I2 */
    public static /* synthetic */ boolean m13395I2(LivePlayer livePlayer) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J1 */
    public static /* synthetic */ ImageView m13396J1(LivePlayer livePlayer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J2 */
    public static /* synthetic */ int m13397J2(LivePlayer livePlayer) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K1 */
    public static /* synthetic */ void m13398K1(LivePlayer livePlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K2 */
    public static /* synthetic */ int m13399K2(LivePlayer livePlayer) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L1 */
    public static /* synthetic */ boolean m13400L1(LivePlayer livePlayer) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L2 */
    public static /* synthetic */ void m13401L2(LivePlayer livePlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M1 */
    public static /* synthetic */ int m13402M1(LivePlayer livePlayer) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M2 */
    public static /* synthetic */ void m13403M2(LivePlayer livePlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M3 */
    public static void m13404M3(Context context, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N1 */
    public static /* synthetic */ List m13405N1(LivePlayer livePlayer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N2 */
    public static /* synthetic */ boolean m13406N2(LivePlayer livePlayer, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N3 */
    public static void m13407N3(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N5 */
    public static final void m13408N5(Context context, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ int m13409O1(LivePlayer livePlayer) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O2 */
    public static /* synthetic */ void m13410O2(LivePlayer livePlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O5 */
    public static final void m13411O5(Context context, String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m13412P0(LivePlayer livePlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P1 */
    public static /* synthetic */ int m13413P1(LivePlayer livePlayer, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P2 */
    public static /* synthetic */ boolean m13414P2(LivePlayer livePlayer) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m13415Q0(LivePlayer livePlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q1 */
    public static /* synthetic */ C0124Bv m13416Q1(LivePlayer livePlayer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q2 */
    public static /* synthetic */ void m13417Q2(LivePlayer livePlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m13418R0(LivePlayer livePlayer, DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R1 */
    public static /* synthetic */ int m13419R1(LivePlayer livePlayer) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R2 */
    public static /* synthetic */ void m13420R2(LivePlayer livePlayer, EpgItemInfo epgItemInfo, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m13421S0(LivePlayer livePlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S1 */
    public static /* synthetic */ int m13422S1(LivePlayer livePlayer, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S2 */
    public static /* synthetic */ HashSet m13423S2(LivePlayer livePlayer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ void m13424T0(LivePlayer livePlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T1 */
    public static /* synthetic */ void m13425T1(LivePlayer livePlayer, String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T2 */
    public static /* synthetic */ void m13426T2(LivePlayer livePlayer, EpgItemInfo epgItemInfo, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m13427U0(LivePlayer livePlayer, DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U1 */
    public static /* synthetic */ C0893Ns m13428U1(LivePlayer livePlayer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m13429V0(LivePlayer livePlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ DialogC1326Uc m13430V1(LivePlayer livePlayer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V4 */
    private void m13431V4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m13432W0(LivePlayer livePlayer, C1091Qv c1091Qv) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W1 */
    public static /* synthetic */ Button m13433W1(LivePlayer livePlayer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m13434X1(LivePlayer livePlayer, C1091Qv c1091Qv, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X2 */
    public static final DialogC1326Uc m13435X2(Context context, Object obj, DialogC1326Uc.e eVar) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X5 */
    private void m13436X5(String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x002e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: Y0 */
    public static p000.C1671Zv m13437Y0(android.content.Context r4, p000.C1091Qv r5) {
        /*
            r0 = 0
            return r0
        L46:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.LivePlayer.m13437Y0(android.content.Context, Qv):Zv");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ String m13438Y1(LivePlayer livePlayer, LiveChannelInfo liveChannelInfo) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ DialogC2292a m13439Z1(LivePlayer livePlayer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z2 */
    private final boolean m13440Z2() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z5 */
    private void m13441Z5(C1671Zv c1671Zv) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m13442a2(LivePlayer livePlayer, LiveChannelInfo liveChannelInfo, C1091Qv c1091Qv, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ C1091Qv m13443b2(LivePlayer livePlayer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c2 */
    public static /* synthetic */ C1091Qv m13444c2(LivePlayer livePlayer, C1091Qv c1091Qv) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d2 */
    public static /* synthetic */ void m13445d2(LivePlayer livePlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d5 */
    private void m13446d5() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e2 */
    public static /* synthetic */ void m13447e2(LivePlayer livePlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f2 */
    public static /* synthetic */ void m13448f2(LivePlayer livePlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g2 */
    public static /* synthetic */ int m13449g2(LivePlayer livePlayer, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h2 */
    public static /* synthetic */ DolitVideoView m13450h2(LivePlayer livePlayer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ int m13451i1(LivePlayer livePlayer, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i2 */
    public static /* synthetic */ String m13452i2(LivePlayer livePlayer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j1 */
    public static /* synthetic */ int m13453j1(LivePlayer livePlayer) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j2 */
    public static /* synthetic */ String m13454j2(LivePlayer livePlayer, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j4 */
    private void m13455j4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k1 */
    public static /* synthetic */ void m13456k1(LivePlayer livePlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k2 */
    public static /* synthetic */ boolean m13457k2(LivePlayer livePlayer) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k4 */
    private void m13458k4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k5 */
    private void m13459k5() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ ExecutorService m13460l1(LivePlayer livePlayer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l2 */
    public static /* synthetic */ void m13461l2(LivePlayer livePlayer, LiveChannelInfo liveChannelInfo, C1091Qv c1091Qv, C2260U c2260u) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l3 */
    private void m13462l3(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m1 */
    public static /* synthetic */ long m13463m1(LivePlayer livePlayer) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m2 */
    public static /* synthetic */ int m13464m2(LivePlayer livePlayer) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n1 */
    public static /* synthetic */ long m13465n1(LivePlayer livePlayer, long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n2 */
    public static /* synthetic */ void m13466n2(LivePlayer livePlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n3 */
    private void m13467n3(float f, float f2, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n4 */
    private void m13468n4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n5 */
    private void m13469n5(C1091Qv c1091Qv) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o1 */
    public static /* synthetic */ long m13470o1(LivePlayer livePlayer) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o2 */
    public static /* synthetic */ void m13471o2(LivePlayer livePlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o3 */
    private void m13472o3(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o4 */
    private void m13473o4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p1 */
    public static /* synthetic */ long m13474p1(LivePlayer livePlayer, long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p2 */
    public static /* synthetic */ long m13475p2(LivePlayer livePlayer, long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p4 */
    private void m13476p4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q1 */
    public static /* synthetic */ void m13477q1(LivePlayer livePlayer, long j, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ void m13478q2(LivePlayer livePlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q4 */
    private void m13479q4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r1 */
    public static /* synthetic */ void m13480r1(LivePlayer livePlayer, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r2 */
    public static /* synthetic */ String m13481r2(LivePlayer livePlayer, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s1 */
    public static /* synthetic */ boolean m13482s1(LivePlayer livePlayer) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s2 */
    public static /* synthetic */ void m13483s2(LivePlayer livePlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s4 */
    private void m13484s4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t1 */
    public static /* synthetic */ boolean m13485t1(LivePlayer livePlayer, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t2 */
    public static /* synthetic */ void m13486t2(LivePlayer livePlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u1 */
    public static /* synthetic */ TextView m13487u1(LivePlayer livePlayer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u2 */
    public static /* synthetic */ LiveTypeInfo m13488u2(LivePlayer livePlayer, LiveTypeInfo liveTypeInfo) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u3 */
    public static String m13489u3(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ String m13490v1(LivePlayer livePlayer, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v2 */
    public static /* synthetic */ int m13491v2(LivePlayer livePlayer) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v3 */
    public static String m13492v3(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w1 */
    public static /* synthetic */ void m13493w1(LivePlayer livePlayer, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w2 */
    public static /* synthetic */ int m13494w2(LivePlayer livePlayer, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w3 */
    public static String m13495w3(long j, long j2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w4 */
    private void m13496w4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ Handler m13497x1(LivePlayer livePlayer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x2 */
    public static /* synthetic */ void m13498x2(LivePlayer livePlayer, C1671Zv c1671Zv) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y1 */
    public static /* synthetic */ void m13499y1(LivePlayer livePlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y2 */
    public static /* synthetic */ long m13500y2(LivePlayer livePlayer) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z1 */
    public static /* synthetic */ C5621vv m13501z1(LivePlayer livePlayer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z2 */
    public static /* synthetic */ long m13502z2(LivePlayer livePlayer, long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z4 */
    private final boolean m13503z4() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A4 */
    public boolean m13504A4() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a.d
    /* JADX INFO: renamed from: B0 */
    public boolean mo12401B0(Object obj, int i, int i2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B3 */
    public int mo13505B3() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B4 */
    public final boolean m13506B4() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B5 */
    public final void m13507B5() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C3 */
    public int m13508C3() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C4 */
    public boolean m13509C4(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C5 */
    public final void m13510C5() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: D3 */
    public final LiveTypeInfo m13511D3(LiveChannelInfo liveChannelInfo) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D4 */
    public final boolean m13512D4(LiveChannelInfo liveChannelInfo, LiveChannelInfo liveChannelInfo2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D5 */
    public final void m13513D5() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E3 */
    public final ViewOnKeyListenerC2293b m13514E3() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E4 */
    public final boolean m13515E4() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E5 */
    public final void m13516E5() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F3 */
    public final String m13517F3(C1091Qv c1091Qv) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F4 */
    public final boolean m13518F4() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G3 */
    public final String m13519G3(LiveChannelInfo liveChannelInfo) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G4 */
    public final boolean m13520G4() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G5 */
    public final void m13521G5(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H4 */
    public final boolean m13522H4() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H5 */
    public final void m13523H5() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I3 */
    public RelativeLayout m13524I3() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m13525I4(C1091Qv c1091Qv) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I5 */
    public final void m13526I5(long j, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J3 */
    public EnumC6006m10 m13527J3() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m13528J4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J5 */
    public final void m13529J5() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity.InterfaceC1768i
    /* JADX INFO: renamed from: K */
    public void mo9579K(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K3 */
    public final C0994PP m13530K3() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ void m13531K4(DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0010
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: K5 */
    public final void m13532K5(android.media.ViviTV.model.persistent.EpgItemInfo r3, java.lang.String r4) {
        /*
            r2 = this;
            return
        L56:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.LivePlayer.m13532K5(android.media.ViviTV.model.persistent.EpgItemInfo, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L3 */
    public DolitVideoView m13533L3() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m13534L4(DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L5 */
    public final void m13535L5(EpgItemInfo epgItemInfo, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ void m13536M4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M5 */
    public final void m13537M5(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m13538N4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O3 */
    public final void m13539O3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m13540O4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P3 */
    public final void m13541P3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m13542P4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P5 */
    public final void m13543P5() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q3 */
    public final void m13544Q3(KeyEvent keyEvent) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q4 */
    public final void m13545Q4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q5 */
    public final void m13546Q5(Runnable runnable) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R3 */
    public final void m13547R3(KeyEvent keyEvent) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R4 */
    public final void m13548R4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R5 */
    public final void m13549R5(LiveChannelInfo liveChannelInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S3 */
    public final void m13550S3(MotionEvent motionEvent, float f, float f2, float f3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S4 */
    public void m13551S4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S5 */
    public void m13552S5(LiveChannelInfo liveChannelInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x003b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: T3 */
    public final void m13553T3(android.view.KeyEvent r14) {
        /*
            r13 = this;
            return
        L52:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.LivePlayer.m13553T3(android.view.KeyEvent):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T4 */
    public final void m13554T4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T5 */
    public final void m13555T5(int i, List<LiveChannelInfo> list, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U2 */
    public final void m13556U2(InterfaceC2259T interfaceC2259T) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x005a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: U3 */
    public final void m13557U3(android.view.MotionEvent r8, float r9, float r10, float r11) {
        /*
            r7 = this;
            return
        L71:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.LivePlayer.m13557U3(android.view.MotionEvent, float, float, float):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: U4 */
    public final void m13558U4(C0324Ev c0324Ev) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U5 */
    public void m13559U5(String str, LiveChannelInfo liveChannelInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V2 */
    public final void m13560V2(Runnable runnable) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V3 */
    public boolean m13561V3(ViewOnKeyListenerC2293b viewOnKeyListenerC2293b) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V5 */
    public final void m13562V5(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W2 */
    public final void m13563W2(EpgItemInfo epgItemInfo, String str, String str2) {
    }

    /* JADX INFO: renamed from: W3 */
    public boolean mo13564W3() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W4 */
    public final void m13565W4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W5 */
    public final void m13566W5() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public void m13567X0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X3 */
    public final void m13568X3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X4 */
    public void m13569X4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y2 */
    public final void m13570Y2(int i) {
    }

    /* JADX INFO: renamed from: Y3 */
    public boolean mo13571Y3(DisplayMetrics displayMetrics) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y4 */
    public final void m13572Y4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y5 */
    public final void m13573Y5() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public boolean m13574Z0(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z3 */
    public final void m13575Z3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: Z4 */
    public final void m13576Z4(p000.C1091Qv r3) {
        /*
            r2 = this;
            return
        L14:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.LivePlayer.m13576Z4(Qv):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public final void m13577a1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a3 */
    public final boolean m13578a3(LiveChannelInfo liveChannelInfo) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a4 */
    public boolean mo13579a4() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a5 */
    public final void m13580a5(int i) {
    }

    /* JADX INFO: renamed from: a6 */
    public void mo13581a6(String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // p000.AbstractC1293U5.g
    /* JADX INFO: renamed from: b0 */
    public p000.AbstractC1293U5.f mo6191b0(p000.AbstractC1293U5 r3) {
        /*
            r2 = this;
            r0 = 0
            return r0
        L47:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.LivePlayer.mo6191b0(U5):U5$f");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    public final void m13582b1(C1091Qv c1091Qv, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b3 */
    public final void m13583b3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b4 */
    public boolean mo13584b4() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b5 */
    public final void m13585b5() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a.e
    /* JADX INFO: renamed from: c */
    public void mo13586c(AbstractC2308a abstractC2308a) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public final void m13587c1(C1091Qv c1091Qv, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c3 */
    public String m13588c3(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c4 */
    public boolean mo13589c4() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c5 */
    public final void m13590c5() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public final void m13591d1(C1091Qv c1091Qv, C2260U c2260u, LiveChannelInfo liveChannelInfo) {
    }

    /* JADX INFO: renamed from: d3 */
    public final void m13592d3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d4 */
    public boolean m13593d4() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    public final void m13594e1(LiveChannelInfo liveChannelInfo, C1091Qv c1091Qv, C2260U c2260u) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e3 */
    public final void m13595e3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e4 */
    public boolean m13596e4() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e5 */
    public final void m13597e5(LiveChannelInfo liveChannelInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    public final void m13598f1(LiveChannelInfo liveChannelInfo, C1091Qv c1091Qv, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f3 */
    public final void m13599f3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f4 */
    public final void m13600f4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f5 */
    public final void m13601f5() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g1 */
    public final void m13602g1(String str, float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g3 */
    public void m13603g3(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g4 */
    public final void m13604g4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g5 */
    public final void m13605g5(InterfaceC2259T interfaceC2259T) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a.b
    /* JADX INFO: renamed from: h0 */
    public void mo1548h0(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    public void m13606h1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h3 */
    public void m13607h3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h4 */
    public final void m13608h4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h5 */
    public final void m13609h5() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i3 */
    public void m13610i3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i4 */
    public final void m13611i4(Runnable runnable) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i5 */
    public final void m13612i5() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a.c
    /* JADX INFO: renamed from: j */
    public boolean mo10404j(Object obj, int i, int i2, long j) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: j3 */
    public final void m13613j3(p000.C0994PP r2) {
        /*
            r1 = this;
            return
        L12:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.LivePlayer.m13613j3(PP):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j5 */
    public final void m13614j5() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity.InterfaceC1768i
    /* JADX INFO: renamed from: k */
    public void mo9580k(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k3 */
    public final void m13615k3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l4 */
    public final void m13616l4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l5 */
    public final void m13617l5() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m3 */
    public final void m13618m3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m4 */
    public final void m13619m4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m5 */
    public void m13620m5(LiveChannelInfo liveChannelInfo, C1091Qv c1091Qv, C2260U c2260u) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a.f
    /* JADX INFO: renamed from: n0 */
    public void mo12390n0(AbstractC2308a abstractC2308a, String str, String str2, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o5 */
    public final void m13621o5() {
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
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0032
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.LivePlayer.onDestroy():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.app.Activity
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p3 */
    public void m13622p3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p5 */
    public void m13623p5(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q3 */
    public final void m13624q3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q5 */
    public void m13625q5(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r3 */
    public void m13626r3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r4 */
    public final void m13627r4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r5 */
    public void m13628r5(LiveTypeInfo liveTypeInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s3 */
    public void m13629s3(LiveChannelInfo liveChannelInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s5 */
    public final void m13630s5() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t3 */
    public final void m13631t3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t4 */
    public final void m13632t4(Runnable runnable) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t5 */
    public final void m13633t5(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a.g
    /* JADX INFO: renamed from: u */
    public void mo1331u(Object obj, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u4 */
    public final void m13634u4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u5 */
    public final void m13635u5(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity
    /* JADX INFO: renamed from: v0 */
    public boolean mo9573v0(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v4 */
    public final void m13636v4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v5 */
    public final void m13637v5() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w5 */
    public final void m13638w5() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x3 */
    public LiveControl m13639x3() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x4 */
    public final void m13640x4() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x5 */
    public final void m13641x5() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y3 */
    public int m13642y3() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y4 */
    public boolean m13643y4() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y5 */
    public final void m13644y5() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z3 */
    public Handler m13645z3() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z5 */
    public final void m13646z5(LiveChannelInfo liveChannelInfo, PasswordVerifyFragment.AbstractC2083c abstractC2083c) {
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$e */
    public class C2267e implements InterfaceC4763lq {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9127a;

        /* JADX WARN: Invalid debug info offset */
        public C2267e(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4763lq
        /* JADX INFO: renamed from: X */
        public void mo9766X(InterfaceC4834mq interfaceC4834mq) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4763lq
        /* JADX INFO: renamed from: g */
        public void mo9767g() {
        }

        @Override // p000.InterfaceC4763lq
        /* JADX INFO: renamed from: v0 */
        public void mo9768v0(InterfaceC4834mq interfaceC4834mq) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayer$g */
    public class C2269g implements InterfaceC0319Eq {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayer f9129a;

        /* JADX WARN: Invalid debug info offset */
        public C2269g(LivePlayer livePlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0319Eq
        /* JADX INFO: renamed from: C */
        public void mo1705C(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4763lq
        /* JADX INFO: renamed from: X */
        public void mo9766X(InterfaceC4834mq interfaceC4834mq) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4763lq
        /* JADX INFO: renamed from: g */
        public void mo9767g() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0319Eq
        /* JADX INFO: renamed from: w */
        public void mo1706w(int i) {
        }

        @Override // p000.InterfaceC4763lq
        /* JADX INFO: renamed from: v0 */
        public void mo9768v0(InterfaceC4834mq interfaceC4834mq) {
        }
    }
}
