package android.media.ViviTV.fragmens;

import android.media.ViviTV.databinding.FragmentHomeLiveItemBinding;
import android.media.ViviTV.model.persistent.LiveChannelInfo;
import android.media.ViviTV.model.persistent.LiveTypeInfo;
import android.media.ViviTV.player.widget.AbstractC2308a;
import android.media.ViviTV.player.widget.DolitVideoView;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.C0124Bv;
import p000.C0548IS;
import p000.C0893Ns;
import p000.C1091Qv;
import p000.C1139Rh;
import p000.C1671Zv;
import p000.C4459h9;
import p000.C4593j9;
import p000.DialogC1326Uc;

/* JADX INFO: loaded from: classes.dex */
public class HomeLiveItemFragment extends BaseHomeItemFragment implements C1139Rh.e, AbstractC2308a.f, AbstractC2308a.c, C0548IS.b {

    /* JADX INFO: renamed from: T0 */
    public static String f8150T0 = "23:59";

    /* JADX INFO: renamed from: U0 */
    public static final boolean f8151U0 = false;

    /* JADX INFO: renamed from: V0 */
    public static final String f8152V0 = "MSG_LV";

    /* JADX INFO: renamed from: W0 */
    public static HandlerC2071w f8153W0 = new HandlerC2060l();

    /* JADX INFO: renamed from: A */
    public C0124Bv f8154A;

    /* JADX INFO: renamed from: B */
    public int f8155B;

    /* JADX INFO: renamed from: C */
    public int f8156C;

    /* JADX INFO: renamed from: D */
    public int f8157D;

    /* JADX INFO: renamed from: E */
    public int f8158E;

    /* JADX INFO: renamed from: F */
    public int f8159F;

    /* JADX INFO: renamed from: G */
    public int f8160G;

    /* JADX INFO: renamed from: H */
    public long f8161H;

    /* JADX INFO: renamed from: I */
    public HashMap<String, List<LiveChannelInfo>> f8162I;

    /* JADX INFO: renamed from: J */
    public List<LiveChannelInfo> f8163J;

    /* JADX INFO: renamed from: K */
    public long f8164K;

    /* JADX INFO: renamed from: L */
    public C1091Qv f8165L;

    /* JADX INFO: renamed from: M */
    public HashMap<String, Integer> f8166M;

    /* JADX INFO: renamed from: N */
    public long f8167N;

    /* JADX INFO: renamed from: O */
    public float f8168O;

    /* JADX INFO: renamed from: P */
    public boolean f8169P;

    /* JADX INFO: renamed from: Q */
    public String f8170Q;

    /* JADX INFO: renamed from: R */
    public C0548IS f8171R;

    /* JADX INFO: renamed from: R0 */
    public View.OnKeyListener f8172R0;

    /* JADX INFO: renamed from: S */
    public Runnable f8173S;

    /* JADX INFO: renamed from: S0 */
    public Runnable f8174S0;

    /* JADX INFO: renamed from: T */
    public C0893Ns f8175T;

    /* JADX INFO: renamed from: U */
    public AbstractC2308a.g f8176U;

    /* JADX INFO: renamed from: V */
    public AbstractC2308a.d f8177V;

    /* JADX INFO: renamed from: W */
    public AbstractC2308a.b f8178W;

    /* JADX INFO: renamed from: X */
    public AbstractC2308a.i f8179X;

    /* JADX INFO: renamed from: Y */
    public AbstractC2308a.h f8180Y;

    /* JADX INFO: renamed from: Z */
    public long f8181Z;

    /* JADX INFO: renamed from: o */
    public FragmentHomeLiveItemBinding f8182o;

    /* JADX INFO: renamed from: p */
    public DolitVideoView f8183p;

    /* JADX INFO: renamed from: q */
    public ListView f8184q;

    /* JADX INFO: renamed from: r */
    public ListView f8185r;

    /* JADX INFO: renamed from: s */
    public TextView f8186s;

    /* JADX INFO: renamed from: t */
    public FrameLayout f8187t;

    /* JADX INFO: renamed from: u */
    public ImageView f8188u;

    /* JADX INFO: renamed from: v */
    public List<LiveChannelInfo> f8189v;

    /* JADX INFO: renamed from: w */
    public List<LiveChannelInfo> f8190w;

    /* JADX INFO: renamed from: x */
    public List<LiveTypeInfo> f8191x;

    /* JADX INFO: renamed from: y */
    public C4459h9 f8192y;

    /* JADX INFO: renamed from: z */
    public C4593j9 f8193z;

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$a */
    public class ViewOnClickListenerC2049a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeLiveItemFragment f8194a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC2049a(HomeLiveItemFragment homeLiveItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$b */
    public class ViewOnKeyListenerC2050b implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeLiveItemFragment f8195a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC2050b(HomeLiveItemFragment homeLiveItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$c */
    public class ViewOnClickListenerC2051c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeLiveItemFragment f8196a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC2051c(HomeLiveItemFragment homeLiveItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$d */
    public class ViewOnKeyListenerC2052d implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeLiveItemFragment f8197a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC2052d(HomeLiveItemFragment homeLiveItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$e */
    public class C2053e extends PasswordVerifyFragment.AbstractC2083c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LiveTypeInfo f8198a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f8199b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f8200c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ HomeLiveItemFragment f8201d;

        /* JADX WARN: Invalid debug info offset */
        public C2053e(HomeLiveItemFragment homeLiveItemFragment, LiveTypeInfo liveTypeInfo, int i, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.fragmens.PasswordVerifyFragment.InterfaceC2082b
        /* JADX INFO: renamed from: b */
        public void mo12400b(PasswordVerifyFragment passwordVerifyFragment) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$f */
    public class C2054f implements AbstractC2308a.g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeLiveItemFragment f8202a;

        /* JADX WARN: Invalid debug info offset */
        public C2054f(HomeLiveItemFragment homeLiveItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.player.widget.AbstractC2308a.g
        /* JADX INFO: renamed from: u */
        public void mo1331u(Object obj, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$g */
    public class C2055g implements AbstractC2308a.d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeLiveItemFragment f8203a;

        /* JADX WARN: Invalid debug info offset */
        public C2055g(HomeLiveItemFragment homeLiveItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.player.widget.AbstractC2308a.d
        /* JADX INFO: renamed from: B0 */
        public boolean mo12401B0(Object obj, int i, int i2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$h */
    public class C2056h implements AbstractC2308a.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeLiveItemFragment f8204a;

        /* JADX WARN: Invalid debug info offset */
        public C2056h(HomeLiveItemFragment homeLiveItemFragment) {
        }

        @Override // android.media.ViviTV.player.widget.AbstractC2308a.b
        /* JADX INFO: renamed from: h0 */
        public void mo1548h0(Object obj) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$i */
    public class C2057i implements AbstractC2308a.i {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeLiveItemFragment f8205a;

        /* JADX WARN: Invalid debug info offset */
        public C2057i(HomeLiveItemFragment homeLiveItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.player.widget.AbstractC2308a.i
        /* JADX INFO: renamed from: a */
        public void mo12402a(Object obj, int i, int i2, int i3, int i4, int i5, int i6) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$j */
    public class C2058j implements AbstractC2308a.h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeLiveItemFragment f8206a;

        /* JADX WARN: Invalid debug info offset */
        public C2058j(HomeLiveItemFragment homeLiveItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.player.widget.AbstractC2308a.h
        /* JADX INFO: renamed from: t */
        public void mo12403t(Object obj) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$k */
    public class C2059k implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeLiveItemFragment f8207a;

        /* JADX WARN: Invalid debug info offset */
        public C2059k(HomeLiveItemFragment homeLiveItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$l */
    public class HandlerC2060l extends HandlerC2071w {
        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m12404b(HandlerC2060l handlerC2060l) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m12405c() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$m */
    public class AsyncTaskC2061m extends AsyncTask<Void, Integer, Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeLiveItemFragment f8208a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2061m(HomeLiveItemFragment homeLiveItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m12406a(AsyncTaskC2061m asyncTaskC2061m) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public Integer m12407b(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m12408c() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public void m12409d(Integer num) {
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

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$n */
    public class RunnableC2062n implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeLiveItemFragment f8209a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2062n(HomeLiveItemFragment homeLiveItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$o */
    public class C2063o implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeLiveItemFragment f8210a;

        /* JADX WARN: Invalid debug info offset */
        public C2063o(HomeLiveItemFragment homeLiveItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$p */
    public class ViewOnKeyListenerC2064p implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeLiveItemFragment f8211a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC2064p(HomeLiveItemFragment homeLiveItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$q */
    public class C2065q implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeLiveItemFragment f8212a;

        /* JADX WARN: Invalid debug info offset */
        public C2065q(HomeLiveItemFragment homeLiveItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$r */
    public class C2066r implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeLiveItemFragment f8213a;

        /* JADX WARN: Invalid debug info offset */
        public C2066r(HomeLiveItemFragment homeLiveItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$s */
    public class ViewOnKeyListenerC2067s implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeLiveItemFragment f8214a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC2067s(HomeLiveItemFragment homeLiveItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$t */
    public class C2068t implements AdapterView.OnItemLongClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeLiveItemFragment f8215a;

        /* JADX WARN: Invalid debug info offset */
        public C2068t(HomeLiveItemFragment homeLiveItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$u */
    public class ViewOnClickListenerC2069u implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeLiveItemFragment f8216a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC2069u(HomeLiveItemFragment homeLiveItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$v */
    public class ViewOnKeyListenerC2070v implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeLiveItemFragment f8217a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC2070v(HomeLiveItemFragment homeLiveItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$w */
    public static class HandlerC2071w extends Handler {

        /* JADX INFO: renamed from: a */
        public WeakReference<HomeLiveItemFragment> f8218a;

        /* JADX WARN: Invalid debug info offset */
        public HandlerC2071w() {
        }

        /* JADX WARN: Invalid debug info offset */
        public HandlerC2071w(C2059k c2059k) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m12410a(HomeLiveItemFragment homeLiveItemFragment) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeLiveItemFragment$x */
    public static final class C2072x {

        /* JADX INFO: renamed from: a */
        public boolean f8219a;

        /* JADX INFO: renamed from: b */
        public int f8220b;

        /* JADX WARN: Invalid debug info offset */
        public C2072x(boolean z, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public int m12411a() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public boolean m12412b() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public void m12413c(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public void m12414d(boolean z) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A2 */
    public static /* synthetic */ HandlerC2071w m12301A2() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B2 */
    public static /* synthetic */ C4593j9 m12302B2(HomeLiveItemFragment homeLiveItemFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ boolean m12303C1(HomeLiveItemFragment homeLiveItemFragment, View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C2 */
    public static /* synthetic */ void m12304C2(HomeLiveItemFragment homeLiveItemFragment, ListView listView, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D1 */
    public static /* synthetic */ void m12305D1(HomeLiveItemFragment homeLiveItemFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E1 */
    public static /* synthetic */ void m12306E1(HomeLiveItemFragment homeLiveItemFragment, LiveTypeInfo liveTypeInfo, int i, boolean z, DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F1 */
    public static /* synthetic */ void m12307F1(HomeLiveItemFragment homeLiveItemFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ void m12308G1(HomeLiveItemFragment homeLiveItemFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ int m12309I1(HomeLiveItemFragment homeLiveItemFragment) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J1 */
    public static /* synthetic */ int m12310J1(HomeLiveItemFragment homeLiveItemFragment, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K1 */
    public static /* synthetic */ ListView m12311K1(HomeLiveItemFragment homeLiveItemFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L1 */
    public static /* synthetic */ HashMap m12312L1(HomeLiveItemFragment homeLiveItemFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M1 */
    public static /* synthetic */ List m12313M1(HomeLiveItemFragment homeLiveItemFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N1 */
    public static /* synthetic */ void m12314N1(HomeLiveItemFragment homeLiveItemFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ boolean m12315O1(HomeLiveItemFragment homeLiveItemFragment) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P1 */
    public static /* synthetic */ int m12316P1(HomeLiveItemFragment homeLiveItemFragment) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q1 */
    public static /* synthetic */ List m12317Q1(HomeLiveItemFragment homeLiveItemFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R1 */
    public static /* synthetic */ int m12318R1(HomeLiveItemFragment homeLiveItemFragment) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S1 */
    public static /* synthetic */ int m12319S1(HomeLiveItemFragment homeLiveItemFragment, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S2 */
    private void m12320S2() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T1 */
    public static /* synthetic */ DolitVideoView m12321T1(HomeLiveItemFragment homeLiveItemFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U1 */
    public static /* synthetic */ void m12322U1(HomeLiveItemFragment homeLiveItemFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ long m12323V1(HomeLiveItemFragment homeLiveItemFragment) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W1 */
    public static /* synthetic */ long m12324W1(HomeLiveItemFragment homeLiveItemFragment, long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ View.OnKeyListener m12325X1(HomeLiveItemFragment homeLiveItemFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ Runnable m12326Y1(HomeLiveItemFragment homeLiveItemFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ float m12327Z1(HomeLiveItemFragment homeLiveItemFragment, float f) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m12328a2(HomeLiveItemFragment homeLiveItemFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ int m12329b2(HomeLiveItemFragment homeLiveItemFragment, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c2 */
    public static /* synthetic */ int m12330c2(HomeLiveItemFragment homeLiveItemFragment) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c3 */
    public static HomeLiveItemFragment m12331c3(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d2 */
    public static /* synthetic */ void m12332d2(FragmentHomeLiveItemBinding fragmentHomeLiveItemBinding, LiveChannelInfo liveChannelInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e2 */
    public static /* synthetic */ void m12333e2(HomeLiveItemFragment homeLiveItemFragment, String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f2 */
    public static /* synthetic */ int m12334f2(HomeLiveItemFragment homeLiveItemFragment) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g2 */
    public static /* synthetic */ void m12335g2(HomeLiveItemFragment homeLiveItemFragment, C1091Qv c1091Qv) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: g3 */
    public static void m12336g3(android.media.ViviTV.databinding.FragmentHomeLiveItemBinding r3) {
        /*
            return
        L28:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.fragmens.HomeLiveItemFragment.m12336g3(android.media.ViviTV.databinding.FragmentHomeLiveItemBinding):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h2 */
    public static /* synthetic */ void m12337h2(HomeLiveItemFragment homeLiveItemFragment, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i2 */
    public static /* synthetic */ void m12338i2(HomeLiveItemFragment homeLiveItemFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j2 */
    public static /* synthetic */ String m12339j2(HomeLiveItemFragment homeLiveItemFragment, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k2 */
    public static /* synthetic */ C1091Qv m12340k2(HomeLiveItemFragment homeLiveItemFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l2 */
    public static /* synthetic */ C1091Qv m12341l2(HomeLiveItemFragment homeLiveItemFragment, C1091Qv c1091Qv) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l3 */
    public static void m12342l3(FragmentHomeLiveItemBinding fragmentHomeLiveItemBinding, LiveChannelInfo liveChannelInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m2 */
    public static /* synthetic */ int m12343m2(HomeLiveItemFragment homeLiveItemFragment) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n2 */
    public static /* synthetic */ int m12344n2(HomeLiveItemFragment homeLiveItemFragment, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o2 */
    public static /* synthetic */ C1671Zv m12345o2(HomeLiveItemFragment homeLiveItemFragment, C1091Qv c1091Qv) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p2 */
    public static /* synthetic */ Map m12346p2(HomeLiveItemFragment homeLiveItemFragment, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ long m12347q2(HomeLiveItemFragment homeLiveItemFragment) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r2 */
    public static /* synthetic */ long m12348r2(HomeLiveItemFragment homeLiveItemFragment, long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s2 */
    public static /* synthetic */ C0548IS m12349s2(HomeLiveItemFragment homeLiveItemFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t2 */
    public static /* synthetic */ void m12350t2(FragmentHomeLiveItemBinding fragmentHomeLiveItemBinding) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u2 */
    public static /* synthetic */ void m12351u2(HomeLiveItemFragment homeLiveItemFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v2 */
    public static /* synthetic */ void m12352v2(HomeLiveItemFragment homeLiveItemFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w2 */
    public static /* synthetic */ FragmentHomeLiveItemBinding m12353w2(HomeLiveItemFragment homeLiveItemFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x2 */
    public static /* synthetic */ void m12354x2(HomeLiveItemFragment homeLiveItemFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y2 */
    public static /* synthetic */ void m12355y2(HomeLiveItemFragment homeLiveItemFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z2 */
    public static /* synthetic */ ListView m12356z2(HomeLiveItemFragment homeLiveItemFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.C0548IS.b
    /* JADX INFO: renamed from: A0 */
    public void mo2581A0(float f, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D2 */
    public final void m12357D2(List<LiveTypeInfo> list) {
    }

    @Override // p000.C1139Rh.e
    /* JADX INFO: renamed from: E */
    public void mo5343E() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment, android.media.ViviTV.fragmens.BaseHomeStructuredFragment
    /* JADX INFO: renamed from: E0 */
    public void mo12011E0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E2 */
    public final boolean m12358E2() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F2 */
    public final void m12359F2(LiveTypeInfo liveTypeInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G2 */
    public final void m12360G2(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0019
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: H1 */
    public final p000.C1671Zv m12361H1(p000.C1091Qv r7) {
        /*
            r6 = this;
            r0 = 0
            return r0
        L38:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.fragmens.HomeLiveItemFragment.m12361H1(Qv):Zv");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H2 */
    public void m12362H2() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I2 */
    public final List<LiveChannelInfo> m12363I2(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J2 */
    public LiveChannelInfo m12364J2() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K2 */
    public final Map<String, String> m12365K2(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L2 */
    public final void m12366L2() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M2 */
    public void m12367M2(LiveTypeInfo liveTypeInfo, int i, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N2 */
    public final boolean m12368N2() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O2 */
    public final void m12369O2() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P2 */
    public final void m12370P2() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q2 */
    public final void m12371Q2() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R2 */
    public final void m12372R2() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ void m12373T2() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ boolean m12374U2(View view, int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment
    /* JADX INFO: renamed from: V0 */
    public void mo12016V0(BaseSpannableRecyclerViewAdapter baseSpannableRecyclerViewAdapter) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m12375V2() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ void m12376W2() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment
    /* JADX INFO: renamed from: X0 */
    public View mo11991X0(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m12377X2(LiveTypeInfo liveTypeInfo, int i, boolean z, DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y2 */
    public final boolean m12378Y2(AdapterView<?> adapterView, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z2 */
    public final void m12379Z2() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a3 */
    public final void m12380a3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b3 */
    public final void m12381b3() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment
    /* JADX INFO: renamed from: c1 */
    public void mo12022c1(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d3 */
    public void m12382d3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e3 */
    public final void m12383e3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f3 */
    public void m12384f3(String str, int i, boolean z, boolean z2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0011
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: h3 */
    public final void m12385h3() {
        /*
            r2 = this;
            return
        L25:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.fragmens.HomeLiveItemFragment.m12385h3():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i3 */
    public final void m12386i3() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a.c
    /* JADX INFO: renamed from: j */
    public boolean mo10404j(Object obj, int i, int i2, long j) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j3 */
    public final void m12387j3(C1091Qv c1091Qv) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k3 */
    public void m12388k3(List<LiveChannelInfo> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m3 */
    public final void m12389m3(ListView listView, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a.f
    /* JADX INFO: renamed from: n0 */
    public void mo12390n0(AbstractC2308a abstractC2308a, String str, String str2, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n3 */
    public final void m12391n3(ListView listView, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o3 */
    public final void m12392o3(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onStart() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p3 */
    public void m12393p3(LiveTypeInfo liveTypeInfo, int i, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q3 */
    public void m12394q3(View view, float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // p000.C1139Rh.e
    /* JADX INFO: renamed from: r */
    public void mo5344r() {
        /*
            r2 = this;
            return
        L11:
        L2d:
        L2f:
        L38:
        L44:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.fragmens.HomeLiveItemFragment.mo5344r():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r3 */
    public final void m12395r3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s3 */
    public void m12396s3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t3 */
    public void m12397t3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u3 */
    public final void m12398u3(String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v3 */
    public final void m12399v3(C1671Zv c1671Zv) {
    }
}
