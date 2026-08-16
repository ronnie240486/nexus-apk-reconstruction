package android.media.ViviTV.fragmens;

import android.media.ViviTV.broadcast.UpdateButtonClickReceiver;
import android.media.ViviTV.databinding.SettingLoginBinding;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import p000.B30;
import p000.C0002A1;
import p000.C0798MM;
import p000.C4681kX;
import p000.C6041r10;
import p000.DialogC1326Uc;

/* JADX INFO: loaded from: classes.dex */
public class SettingAuthorizationFragment extends BaseSlaveFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public static final int f8272A = 2;

    /* JADX INFO: renamed from: x */
    public static String f8273x = null;

    /* JADX INFO: renamed from: y */
    public static final int f8274y = 0;

    /* JADX INFO: renamed from: z */
    public static final int f8275z = 1;

    /* JADX INFO: renamed from: e */
    public boolean f8276e;

    /* JADX INFO: renamed from: f */
    public boolean f8277f;

    /* JADX INFO: renamed from: g */
    public ArrayList<C6041r10> f8278g;

    /* JADX INFO: renamed from: h */
    public C0798MM f8279h;

    /* JADX INFO: renamed from: i */
    public boolean f8280i;

    /* JADX INFO: renamed from: j */
    public C0002A1 f8281j;

    /* JADX INFO: renamed from: k */
    public ExecutorService f8282k;

    /* JADX INFO: renamed from: l */
    public String f8283l;

    /* JADX INFO: renamed from: m */
    public String f8284m;

    /* JADX INFO: renamed from: n */
    public SettingLoginBinding f8285n;

    /* JADX INFO: renamed from: o */
    public boolean f8286o;

    /* JADX INFO: renamed from: p */
    public B30 f8287p;

    /* JADX INFO: renamed from: q */
    public String f8288q;

    /* JADX INFO: renamed from: r */
    public boolean f8289r;

    /* JADX INFO: renamed from: s */
    public boolean f8290s;

    /* JADX INFO: renamed from: t */
    public UpdateButtonClickReceiver f8291t;

    /* JADX INFO: renamed from: u */
    public Runnable f8292u;

    /* JADX INFO: renamed from: v */
    public Handler f8293v;

    /* JADX INFO: renamed from: w */
    public TextWatcher f8294w;

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.SettingAuthorizationFragment$a */
    public class AsyncTaskC2086a extends AsyncTask<Void, Integer, String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SettingAuthorizationFragment f8295a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2086a(SettingAuthorizationFragment settingAuthorizationFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public String m12537a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m12538b(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ String doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(String str) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.SettingAuthorizationFragment$b */
    public class RunnableC2087b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SettingAuthorizationFragment f8296a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2087b(SettingAuthorizationFragment settingAuthorizationFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.SettingAuthorizationFragment$c */
    public class HandlerC2088c extends Handler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SettingAuthorizationFragment f8297a;

        /* JADX WARN: Invalid debug info offset */
        public HandlerC2088c(SettingAuthorizationFragment settingAuthorizationFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.SettingAuthorizationFragment$d */
    public class C2089d implements DialogC1326Uc.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SettingAuthorizationFragment f8298a;

        /* JADX WARN: Invalid debug info offset */
        public C2089d(SettingAuthorizationFragment settingAuthorizationFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.DialogC1326Uc.e
        /* JADX INFO: renamed from: a */
        public void mo933a(DialogC1326Uc dialogC1326Uc, View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.SettingAuthorizationFragment$f */
    public class C2091f implements DialogC1326Uc.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SettingAuthorizationFragment f8300a;

        /* JADX WARN: Invalid debug info offset */
        public C2091f(SettingAuthorizationFragment settingAuthorizationFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.DialogC1326Uc.e
        /* JADX INFO: renamed from: a */
        public void mo933a(DialogC1326Uc dialogC1326Uc, View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.SettingAuthorizationFragment$g */
    public class AsyncTaskC2092g extends AsyncTask<Void, Integer, C4681kX> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SettingAuthorizationFragment f8301a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2092g(SettingAuthorizationFragment settingAuthorizationFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public C4681kX m12539a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m12540b(C4681kX c4681kX) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ C4681kX doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(C4681kX c4681kX) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.SettingAuthorizationFragment$h */
    public class ViewOnLongClickListenerC2093h implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public int f8302a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SettingAuthorizationFragment f8303b;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnLongClickListenerC2093h(SettingAuthorizationFragment settingAuthorizationFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.SettingAuthorizationFragment$i */
    public class C2094i implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SettingAuthorizationFragment f8304a;

        /* JADX WARN: Invalid debug info offset */
        public C2094i(SettingAuthorizationFragment settingAuthorizationFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ String m12498L0(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ SettingLoginBinding m12499M0(SettingAuthorizationFragment settingAuthorizationFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ String m12500N0(SettingAuthorizationFragment settingAuthorizationFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ boolean m12501O0(SettingAuthorizationFragment settingAuthorizationFragment) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m12502P0(SettingAuthorizationFragment settingAuthorizationFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ boolean m12503Q0(SettingAuthorizationFragment settingAuthorizationFragment, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ boolean m12504R0(SettingAuthorizationFragment settingAuthorizationFragment, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m12505S0(C0002A1 c0002a1, SettingLoginBinding settingLoginBinding) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ void m12506T0(SettingAuthorizationFragment settingAuthorizationFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m12507U0(SettingAuthorizationFragment settingAuthorizationFragment, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ boolean m12508V0(SettingAuthorizationFragment settingAuthorizationFragment, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ C0002A1 m12509W0(SettingAuthorizationFragment settingAuthorizationFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ String m12510X0(SettingAuthorizationFragment settingAuthorizationFragment, C0002A1 c0002a1) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ void m12511Y0(SettingAuthorizationFragment settingAuthorizationFragment, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ void m12512Z0(SettingAuthorizationFragment settingAuthorizationFragment, C0002A1 c0002a1) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ String m12513a1(SettingAuthorizationFragment settingAuthorizationFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w1 */
    public static void m12514w1(C0002A1 c0002a1, SettingLoginBinding settingLoginBinding) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseSlaveFragment
    /* JADX INFO: renamed from: E0 */
    public void mo12054E0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public final void m12515K0(C0002A1 c0002a1) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    public final void m12516b1(TextView textView) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public final void m12517c1(View view, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public final void m12518d1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    public final void m12519e1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    public final void m12520f1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g1 */
    public final void m12521g1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    public final void m12522h1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: i1 */
    public final java.lang.String m12523i1() {
        /*
            r8 = this;
            r0 = 0
            return r0
        L6b:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.fragmens.SettingAuthorizationFragment.m12523i1():java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j1 */
    public final String m12524j1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k1 */
    public final String m12525k1(C0002A1 c0002a1) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l1 */
    public boolean m12526l1(int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m1 */
    public final void m12527m1(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n1 */
    public final void m12528n1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o1 */
    public final void m12529o1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p1 */
    public final void m12530p1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q1 */
    public void m12531q1(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r1 */
    public final void m12532r1(@StringRes int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s1 */
    public final void m12533s1(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t1 */
    public final void m12534t1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u1 */
    public final void m12535u1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v1 */
    public final void m12536v1() {
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.SettingAuthorizationFragment$e */
    public class C2090e implements DialogC1326Uc.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SettingAuthorizationFragment f8299a;

        /* JADX WARN: Invalid debug info offset */
        public C2090e(SettingAuthorizationFragment settingAuthorizationFragment) {
        }

        @Override // p000.DialogC1326Uc.e
        /* JADX INFO: renamed from: a */
        public void mo933a(DialogC1326Uc dialogC1326Uc, View view) {
        }
    }
}
