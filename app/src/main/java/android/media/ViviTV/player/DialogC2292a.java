package android.media.ViviTV.player;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.media.ViviTV.adapters.EpgInfoListAdapter;
import android.media.ViviTV.fragmens.PasswordVerifyFragment;
import android.media.ViviTV.model.persistent.EpgItemInfo;
import android.media.ViviTV.model.persistent.EpgItemReviewInfo;
import android.media.ViviTV.model.persistent.LiveChannelInfo;
import android.media.ViviTV.model.persistent.LiveTypeInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.LruCache;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.List;
import p000.AbstractAsyncTaskC0387Fv;
import p000.AbstractRunnableC5778yI;
import p000.AsyncTaskC4636jq;
import p000.C0124Bv;
import p000.C0893Ns;
import p000.C1202Sh;
import p000.C4273eD;
import p000.C5468tv;
import p000.DialogC1326Uc;
import p000.EnumC0260Dv;

/* JADX INFO: renamed from: android.media.ViviTV.player.a */
/* JADX INFO: loaded from: classes.dex */
public class DialogC2292a extends Dialog implements View.OnClickListener, LivePlayer.InterfaceC2259T, EpgInfoListAdapter.InterfaceC1948c, DialogInterface.OnKeyListener {

    /* JADX INFO: renamed from: Y0 */
    public static final int f9189Y0 = 600;

    /* JADX INFO: renamed from: Z0 */
    public static final boolean f9190Z0 = false;

    /* JADX INFO: renamed from: a1 */
    public static final String f9191a1 = "LiveChannelList";

    /* JADX INFO: renamed from: A */
    public TextView f9192A;

    /* JADX INFO: renamed from: B */
    public boolean f9193B;

    /* JADX INFO: renamed from: C */
    public HashMap<String, List<LiveChannelInfo>> f9194C;

    /* JADX INFO: renamed from: D */
    public ImageButton f9195D;

    /* JADX INFO: renamed from: E */
    public ImageButton f9196E;

    /* JADX INFO: renamed from: F */
    public RelativeLayout f9197F;

    /* JADX INFO: renamed from: G */
    public ListView f9198G;

    /* JADX INFO: renamed from: H */
    public RelativeLayout f9199H;

    /* JADX INFO: renamed from: I */
    public EpgInfoListAdapter f9200I;

    /* JADX INFO: renamed from: J */
    public C1202Sh f9201J;

    /* JADX INFO: renamed from: K */
    @Nullable
    public TextView f9202K;

    /* JADX INFO: renamed from: L */
    public List<EpgItemInfo> f9203L;

    /* JADX INFO: renamed from: M */
    public AsyncTask<Void, Integer, List<EpgItemReviewInfo>> f9204M;

    /* JADX INFO: renamed from: N */
    public Button f9205N;

    /* JADX INFO: renamed from: O */
    public TextView f9206O;

    /* JADX INFO: renamed from: P */
    public boolean f9207P;

    /* JADX INFO: renamed from: Q */
    public int f9208Q;

    /* JADX INFO: renamed from: R */
    public C4273eD f9209R;

    /* JADX INFO: renamed from: R0 */
    public Runnable f9210R0;

    /* JADX INFO: renamed from: S */
    public HashMap<String, Pair<Integer, Integer>> f9211S;

    /* JADX INFO: renamed from: S0 */
    public Runnable f9212S0;

    /* JADX INFO: renamed from: T */
    public int f9213T;

    /* JADX INFO: renamed from: T0 */
    public Runnable f9214T0;

    /* JADX INFO: renamed from: U */
    public EnumC0260Dv f9215U;

    /* JADX INFO: renamed from: U0 */
    public Runnable f9216U0;

    /* JADX INFO: renamed from: V */
    public EpgItemInfo f9217V;

    /* JADX INFO: renamed from: V0 */
    public AbstractRunnableC5778yI<LiveTypeInfo> f9218V0;

    /* JADX INFO: renamed from: W */
    public int f9219W;

    /* JADX INFO: renamed from: W0 */
    public AbstractRunnableC5778yI<C5468tv> f9220W0;

    /* JADX INFO: renamed from: X */
    public int f9221X;

    /* JADX INFO: renamed from: X0 */
    public AbstractRunnableC5778yI<C5468tv> f9222X0;

    /* JADX INFO: renamed from: Y */
    public HashMap<String, Integer> f9223Y;

    /* JADX INFO: renamed from: Z */
    public AdapterView.OnItemSelectedListener f9224Z;

    /* JADX INFO: renamed from: a */
    public Context f9225a;

    /* JADX INFO: renamed from: b */
    public List<LiveTypeInfo> f9226b;

    /* JADX INFO: renamed from: c */
    public int f9227c;

    /* JADX INFO: renamed from: d */
    public Handler f9228d;

    /* JADX INFO: renamed from: e */
    public C0124Bv f9229e;

    /* JADX INFO: renamed from: f */
    public int f9230f;

    /* JADX INFO: renamed from: g */
    public List<LiveChannelInfo> f9231g;

    /* JADX INFO: renamed from: h */
    public View f9232h;

    /* JADX INFO: renamed from: i */
    public TextView f9233i;

    /* JADX INFO: renamed from: j */
    public ListView f9234j;

    /* JADX INFO: renamed from: k */
    public ListView f9235k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f9236l;

    /* JADX INFO: renamed from: m */
    public TextView f9237m;

    /* JADX INFO: renamed from: n */
    public TextView f9238n;

    /* JADX INFO: renamed from: o */
    public String f9239o;

    /* JADX INFO: renamed from: p */
    public int f9240p;

    /* JADX INFO: renamed from: q */
    public ImageButton f9241q;

    /* JADX INFO: renamed from: r */
    public HashMap<String, Integer> f9242r;

    /* JADX INFO: renamed from: s */
    public List<LiveChannelInfo> f9243s;

    /* JADX INFO: renamed from: t */
    public DialogC1326Uc f9244t;

    /* JADX INFO: renamed from: u */
    public F f9245u;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f9246v;

    /* JADX INFO: renamed from: w */
    public int f9247w;

    /* JADX INFO: renamed from: x */
    public String f9248x;

    /* JADX INFO: renamed from: y */
    public LruCache<String, List<EpgItemInfo>> f9249y;

    /* JADX INFO: renamed from: z */
    public RecyclerView f9250z;

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$A */
    public class A extends AsyncTask<Void, Integer, List<EpgItemInfo>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f9251a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DialogC2292a f9252b;

        /* JADX WARN: Invalid debug info offset */
        public A(DialogC2292a dialogC2292a, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public List<EpgItemInfo> m13810a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m13811b(List<EpgItemInfo> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ List<EpgItemInfo> doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(List<EpgItemInfo> list) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$B */
    public class B extends AbstractAsyncTaskC0387Fv {

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ String f9253k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ DialogC2292a f9254l;

        /* JADX WARN: Invalid debug info offset */
        public B(DialogC2292a dialogC2292a, Context context, String str, String str2, String str3) {
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

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$C */
    public class C implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC2292a f9255a;

        /* JADX WARN: Invalid debug info offset */
        public C(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$D */
    public class D implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC2292a f9256a;

        /* JADX WARN: Invalid debug info offset */
        public D(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$E */
    public class E implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC2292a f9257a;

        /* JADX WARN: Invalid debug info offset */
        public E(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$F */
    public interface F {
        /* JADX INFO: renamed from: a */
        void mo13656a(EpgItemInfo epgItemInfo);

        /* JADX INFO: renamed from: b */
        void mo13657b(LiveChannelInfo liveChannelInfo);

        /* JADX INFO: renamed from: c */
        boolean mo13658c(LiveTypeInfo liveTypeInfo);

        /* JADX INFO: renamed from: d */
        void mo13659d(LiveTypeInfo liveTypeInfo);

        /* JADX INFO: renamed from: e */
        void mo13660e(LiveTypeInfo liveTypeInfo);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$G */
    public static class G {

        /* JADX INFO: renamed from: a */
        public LiveTypeInfo f9258a;

        /* JADX INFO: renamed from: b */
        public List<LiveChannelInfo> f9259b;

        /* JADX WARN: Invalid debug info offset */
        public G(LiveTypeInfo liveTypeInfo, List<LiveChannelInfo> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public List<LiveChannelInfo> m13812a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public LiveTypeInfo m13813b() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public void m13814c(List<LiveChannelInfo> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public void m13815d(LiveTypeInfo liveTypeInfo) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$a, reason: case insensitive filesystem */
    public class C5917a implements AdapterView.OnItemLongClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC2292a f9260a;

        /* JADX WARN: Invalid debug info offset */
        public C5917a(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$b, reason: case insensitive filesystem */
    public class C5918b implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC2292a f9261a;

        /* JADX WARN: Invalid debug info offset */
        public C5918b(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$c, reason: case insensitive filesystem */
    public class ViewOnKeyListenerC5919c implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC2292a f9262a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC5919c(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$d, reason: case insensitive filesystem */
    public class ViewOnKeyListenerC5920d implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC2292a f9263a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC5920d(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$e, reason: case insensitive filesystem */
    public class ViewOnKeyListenerC5921e implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC2292a f9264a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC5921e(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$f, reason: case insensitive filesystem */
    public class ViewOnTouchListenerC5922f implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC2292a f9265a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnTouchListenerC5922f(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$g, reason: case insensitive filesystem */
    public class ViewOnFocusChangeListenerC5923g implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC2292a f9266a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnFocusChangeListenerC5923g(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$h */
    public class h implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC2292a f9267a;

        /* JADX WARN: Invalid debug info offset */
        public h(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$i */
    public class i implements DialogC1326Uc.e {

        /* JADX INFO: renamed from: a */
        public C0893Ns f9268a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DialogC2292a f9269b;

        /* JADX WARN: Invalid debug info offset */
        public i(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.DialogC1326Uc.e
        /* JADX INFO: renamed from: a */
        public void mo933a(DialogC1326Uc dialogC1326Uc, View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$j */
    public class j implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC2292a f9270a;

        /* JADX WARN: Invalid debug info offset */
        public j(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$k */
    public class k implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC2292a f9271a;

        /* JADX WARN: Invalid debug info offset */
        public k(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$l */
    public class l implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC2292a f9272a;

        /* JADX WARN: Invalid debug info offset */
        public l(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$m */
    public class m extends PasswordVerifyFragment.AbstractC2083c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LiveTypeInfo f9273a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DialogC2292a f9274b;

        /* JADX WARN: Invalid debug info offset */
        public m(DialogC2292a dialogC2292a, LiveTypeInfo liveTypeInfo) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.fragmens.PasswordVerifyFragment.InterfaceC2082b
        /* JADX INFO: renamed from: b */
        public void mo12400b(PasswordVerifyFragment passwordVerifyFragment) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$n */
    public class n implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC2292a f9275a;

        /* JADX WARN: Invalid debug info offset */
        public n(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$o */
    public class o implements AsyncTaskC4636jq.a<Bundle> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f9276a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DialogC2292a f9277b;

        /* JADX WARN: Invalid debug info offset */
        public o(DialogC2292a dialogC2292a, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AsyncTaskC4636jq.a
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ Bundle mo3494a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000c
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: b */
        public android.os.Bundle m13816b() {
            /*
                r4 = this;
                r0 = 0
                return r0
            L27:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.DialogC2292a.o.m13816b():android.os.Bundle");
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$p */
    public class p implements AsyncTaskC4636jq.b<Bundle> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC2292a f9278a;

        /* JADX WARN: Invalid debug info offset */
        public p(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AsyncTaskC4636jq.b
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ void mo3496a(Bundle bundle) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m13817b(Bundle bundle) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$q */
    public class q implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC2292a f9279a;

        /* JADX WARN: Invalid debug info offset */
        public q(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$r */
    public class r implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ EnumC0260Dv f9280a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DialogC2292a f9281b;

        /* JADX WARN: Invalid debug info offset */
        public r(DialogC2292a dialogC2292a, EnumC0260Dv enumC0260Dv) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$s */
    public class s implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC2292a f9282a;

        /* JADX WARN: Invalid debug info offset */
        public s(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$t */
    public class t implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC2292a f9283a;

        /* JADX WARN: Invalid debug info offset */
        public t(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$u */
    public class u extends AbstractRunnableC5778yI<LiveTypeInfo> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DialogC2292a f9284b;

        /* JADX WARN: Invalid debug info offset */
        public u(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractRunnableC5778yI
        /* JADX INFO: renamed from: a */
        public void mo13818a() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$v */
    public class v implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC2292a f9285a;

        /* JADX WARN: Invalid debug info offset */
        public v(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$w */
    public class w extends AbstractRunnableC5778yI<C5468tv> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DialogC2292a f9286b;

        /* JADX WARN: Invalid debug info offset */
        public w(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractRunnableC5778yI
        /* JADX INFO: renamed from: a */
        public void mo13818a() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$x */
    public class x extends AbstractRunnableC5778yI<C5468tv> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DialogC2292a f9287b;

        /* JADX WARN: Invalid debug info offset */
        public x(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractRunnableC5778yI
        /* JADX INFO: renamed from: a */
        public void mo13818a() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$y */
    public class y implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC2292a f9288a;

        /* JADX WARN: Invalid debug info offset */
        public y(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.a$z */
    public class z implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC2292a f9289a;

        /* JADX WARN: Invalid debug info offset */
        public z(DialogC2292a dialogC2292a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public DialogC2292a(Context context, Handler handler) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DialogC2292a(Context context, Handler handler, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ int m13684A(DialogC2292a dialogC2292a, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public static void m13685B(DialogC2292a dialogC2292a, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public static /* synthetic */ F m13686C(DialogC2292a dialogC2292a) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public static /* synthetic */ ListView m13687D(DialogC2292a dialogC2292a) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public static /* synthetic */ AbstractRunnableC5778yI m13688E(DialogC2292a dialogC2292a) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public static /* synthetic */ boolean m13689F(DialogC2292a dialogC2292a, boolean z2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public static /* synthetic */ Handler m13690G(DialogC2292a dialogC2292a) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m13691H(DialogC2292a dialogC2292a) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m13692I(DialogC2292a dialogC2292a) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public static /* synthetic */ C0124Bv m13693J(DialogC2292a dialogC2292a) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public static void m13694K(DialogC2292a dialogC2292a) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public static /* synthetic */ RecyclerView m13695L(DialogC2292a dialogC2292a) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public static /* synthetic */ Button m13696M(DialogC2292a dialogC2292a) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public static /* synthetic */ boolean m13697N(DialogC2292a dialogC2292a, boolean z2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m13698O(DialogC2292a dialogC2292a, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O0 */
    public static void m13699O0(List<EpgItemInfo> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public static /* synthetic */ View m13700P(DialogC2292a dialogC2292a) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ boolean m13701Q(DialogC2292a dialogC2292a, int i2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public static /* synthetic */ int m13702R(DialogC2292a dialogC2292a) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public static /* synthetic */ List m13703S(DialogC2292a dialogC2292a) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T */
    public static /* synthetic */ TextView m13704T(DialogC2292a dialogC2292a) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U */
    public static /* synthetic */ TextView m13705U(DialogC2292a dialogC2292a) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public static /* synthetic */ TextView m13706V(DialogC2292a dialogC2292a) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W */
    public static /* synthetic */ int m13707W(DialogC2292a dialogC2292a) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m13708X(DialogC2292a dialogC2292a, AdapterView adapterView, View view, int i2, long j2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m13709Y(DialogC2292a dialogC2292a, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ ListView m13710Z(DialogC2292a dialogC2292a) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ Pair m13711a0(DialogC2292a dialogC2292a, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ boolean m13712b0(DialogC2292a dialogC2292a, int i2, boolean z2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    public static void m13713b1(View view, RecyclerView recyclerView, boolean z2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m13714c0(DialogC2292a dialogC2292a) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ AbstractRunnableC5778yI m13715d0(DialogC2292a dialogC2292a) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public static void m13716d1(int i2, Context context, ListView listView) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m13717h(DialogC2292a dialogC2292a, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m13718i(DialogC2292a dialogC2292a) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m13719j(DialogC2292a dialogC2292a, AdapterView adapterView, View view, int i2, long j2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ C1202Sh m13720k(DialogC2292a dialogC2292a) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ String m13721l(DialogC2292a dialogC2292a) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ List m13722m(DialogC2292a dialogC2292a, String str, long j2, boolean z2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ List m13723n(DialogC2292a dialogC2292a, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m13724o(DialogC2292a dialogC2292a, List list, boolean z2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Context m13725p(DialogC2292a dialogC2292a) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m13726q(DialogC2292a dialogC2292a, List list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ C4273eD m13727r(DialogC2292a dialogC2292a) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m13728s(DialogC2292a dialogC2292a, List list, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m13729t(DialogC2292a dialogC2292a, List list, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m13730u(DialogC2292a dialogC2292a, LiveTypeInfo liveTypeInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ EpgInfoListAdapter m13731v(DialogC2292a dialogC2292a) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ AbstractRunnableC5778yI m13732w(DialogC2292a dialogC2292a) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public static /* synthetic */ ListView m13733x(DialogC2292a dialogC2292a) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m13734y(DialogC2292a dialogC2292a) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public static /* synthetic */ EnumC0260Dv m13735z(DialogC2292a dialogC2292a, EnumC0260Dv enumC0260Dv) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A0 */
    public List<LiveChannelInfo> m13736A0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A1 */
    public final void m13737A1(List<EpgItemInfo> list, boolean z2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B0 */
    public G m13738B0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B1 */
    public final void m13739B1(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C0 */
    public G m13740C0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C1 */
    public final void m13741C1(int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D0 */
    public final int m13742D0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E0 */
    public final int m13743E0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F0 */
    public final void m13744F0(int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G0 */
    public final boolean m13745G0(int i2, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H0 */
    public final void m13746H0(List<EpgItemReviewInfo> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I0 */
    public final void m13747I0(int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J0 */
    public final void m13748J0(AdapterView<?> adapterView, View view, int i2, long j2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public final void m13749K0(AdapterView<?> adapterView, View view, int i2, long j2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public final void m13750L0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @SuppressLint({"InflateParams"})
    /* JADX INFO: renamed from: M0 */
    public void m13751M0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    public final void m13752N0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public final void m13753P0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public final void m13754Q0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public final void m13755R0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m13756S0(int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m13757T0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: U0 */
    public final List<EpgItemInfo> m13758U0(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: V0 */
    public final List<EpgItemInfo> m13759V0(String str, long j2, boolean z2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public final void m13760W0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public final void m13761X0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public final void m13762Y0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public final void m13763Z0(int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.EpgInfoListAdapter.InterfaceC1948c
    /* JADX INFO: renamed from: a */
    public void mo10490a(int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public final void m13764a1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.EpgInfoListAdapter.InterfaceC1948c
    /* JADX INFO: renamed from: b */
    public boolean mo10491b(int i2, EpgItemInfo epgItemInfo, View view, int i3, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.EpgInfoListAdapter.InterfaceC1948c
    /* JADX INFO: renamed from: c */
    public void mo10492c(View view, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public final boolean m13765c1(int i2, LinearLayoutManager linearLayoutManager) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.EpgInfoListAdapter.InterfaceC1948c
    /* JADX INFO: renamed from: d */
    public void mo10493d(View view, boolean z2, int i2, EpgItemInfo epgItemInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.EpgInfoListAdapter.InterfaceC1948c
    /* JADX INFO: renamed from: e */
    public void mo10494e(int i2, EpgItemInfo epgItemInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e0 */
    public final void m13766e0(List<EpgItemReviewInfo> list, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    public final boolean m13767e1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.EpgInfoListAdapter.InterfaceC1948c
    /* JADX INFO: renamed from: f */
    public boolean mo10495f(int i2, EpgItemInfo epgItemInfo, View view, int i3, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f0 */
    public final void m13768f0(boolean z2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: f1 */
    public final boolean m13769f1(boolean r7, boolean r8) {
        /*
            r6 = this;
            r0 = 0
            return r0
        L10:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.DialogC2292a.m13769f1(boolean, boolean):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.LivePlayer.InterfaceC2259T
    /* JADX INFO: renamed from: g */
    public boolean mo13663g(LiveChannelInfo liveChannelInfo, boolean z2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @SuppressLint({"StaticFieldLeak"})
    /* JADX INFO: renamed from: g0 */
    public final void m13770g0(String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g1 */
    public final boolean m13771g1(int i2, boolean z2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h0 */
    public void m13772h0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    public void m13773h1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i0 */
    public final void m13774i0(List<LiveTypeInfo> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    public final void m13775i1(List<EpgItemReviewInfo> list, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j0 */
    public final void m13776j0(List<LiveTypeInfo> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j1 */
    public final boolean m13777j1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public final boolean m13778k0(int i2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k1 */
    public final boolean m13779k1(boolean z2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l0 */
    public final boolean m13780l0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l1 */
    public final void m13781l1(int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m0 */
    public void m13782m0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m1 */
    public final void m13783m1(int i2, boolean z2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n0 */
    public void m13784n0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n1 */
    public void m13785n1(String str, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o0 */
    public void m13786o0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o1 */
    public void m13787o1(String str, int i2, boolean z2, boolean z3) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p0 */
    public final void m13788p0(LiveTypeInfo liveTypeInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p1 */
    public void m13789p1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q0 */
    public final void m13790q0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q1 */
    public void m13791q1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r0 */
    public final void m13792r0(EnumC0260Dv enumC0260Dv) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r1 */
    public void m13793r1(F f) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s0 */
    public final void m13794s0(LiveTypeInfo liveTypeInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s1 */
    public void m13795s1(String str, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Dialog
    public void show() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t0 */
    public void m13796t0(LiveTypeInfo liveTypeInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t1 */
    public final void m13797t1(boolean z2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u0 */
    public final boolean m13798u0(EpgItemInfo epgItemInfo) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u1 */
    public final void m13799u1(ListView listView, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v0 */
    public final void m13800v0(int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v1 */
    public final void m13801v1(int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w0 */
    public final List<LiveChannelInfo> m13802w0(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w1 */
    public final void m13803w1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x0 */
    public G m13804x0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x1 */
    public final void m13805x1(int i2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y0 */
    public String m13806y0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y1 */
    public void m13807y1(EnumC0260Dv enumC0260Dv) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z0 */
    public final Pair<Integer, Integer> m13808z0(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z1 */
    public final void m13809z1(List<EpgItemInfo> list) {
    }
}
