package android.media.ViviTV.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.ViviTV.databinding.ActivityInstalledAppListBinding;
import android.media.dialog.CommonDialog;
import android.media.view.ApplicationLayout;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import p000.C0736LM;
import p000.C4650k3;
import p000.C4714l3;

/* JADX INFO: loaded from: classes4.dex */
public class InstalledAppListActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener, ApplicationLayout.InterfaceC2380f, View.OnFocusChangeListener, RadioGroup.OnCheckedChangeListener, ApplicationLayout.InterfaceC2378d, ApplicationLayout.InterfaceC2379e {

    /* JADX INFO: renamed from: G */
    public static final String f4991G = "extra_select_local_app_mode";

    /* JADX INFO: renamed from: H */
    public static final String f4992H = "selectAppResult";

    /* JADX INFO: renamed from: I */
    public static final String f4993I = "action_broadcast";

    /* JADX INFO: renamed from: J */
    public static final String f4994J = "extra_local_app_visible";

    /* JADX INFO: renamed from: K */
    public static final String f4995K = "extra_select_mode_browse";

    /* JADX INFO: renamed from: L */
    public static final int f4996L = 20;

    /* JADX INFO: renamed from: M */
    public static final int f4997M = -1;

    /* JADX INFO: renamed from: A */
    public boolean f4998A;

    /* JADX INFO: renamed from: B */
    public boolean f4999B;

    /* JADX INFO: renamed from: C */
    public boolean f5000C;

    /* JADX INFO: renamed from: D */
    public int f5001D;

    /* JADX INFO: renamed from: E */
    public List<C0736LM> f5002E;

    /* JADX INFO: renamed from: F */
    public Runnable f5003F;

    /* JADX INFO: renamed from: u */
    public CommonDialog f5004u;

    /* JADX INFO: renamed from: v */
    public String f5005v;

    /* JADX INFO: renamed from: w */
    public RadioGroup f5006w;

    /* JADX INFO: renamed from: x */
    public ActivityInstalledAppListBinding f5007x;

    /* JADX INFO: renamed from: y */
    public boolean f5008y;

    /* JADX INFO: renamed from: z */
    public String f5009z;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.InstalledAppListActivity$a */
    public class AsyncTaskC1818a extends AsyncTask<Void, Boolean, List<C0736LM>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InstalledAppListActivity f5010a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1818a(InstalledAppListActivity installedAppListActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public List<C0736LM> m9821a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9822b(List<C0736LM> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ List<C0736LM> doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(List<C0736LM> list) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.InstalledAppListActivity$b */
    public class AsyncTaskC1819b extends AsyncTask<Void, Boolean, List<C0736LM>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InstalledAppListActivity f5011a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1819b(InstalledAppListActivity installedAppListActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public List<C0736LM> m9823a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9824b(List<C0736LM> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ List<C0736LM> doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(List<C0736LM> list) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.InstalledAppListActivity$c */
    public class C1820c extends TypeToken<List<C0736LM>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InstalledAppListActivity f5012a;

        /* JADX WARN: Invalid debug info offset */
        public C1820c(InstalledAppListActivity installedAppListActivity) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.InstalledAppListActivity$d */
    public class AsyncTaskC1821d extends AsyncTask<Void, Boolean, List<C4714l3>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InstalledAppListActivity f5013a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1821d(InstalledAppListActivity installedAppListActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public List<C4714l3> m9825a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9826b(List<C4714l3> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ List<C4714l3> doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(List<C4714l3> list) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.InstalledAppListActivity$e */
    public class C1822e implements CommonDialog.InterfaceC2374a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InstalledAppListActivity f5014a;

        /* JADX WARN: Invalid debug info offset */
        public C1822e(InstalledAppListActivity installedAppListActivity) {
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

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m9786P0(InstalledAppListActivity installedAppListActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m9787Q0(InstalledAppListActivity installedAppListActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ int m9788R0(InstalledAppListActivity installedAppListActivity) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ RadioGroup m9789S0(InstalledAppListActivity installedAppListActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ String m9790T0(InstalledAppListActivity installedAppListActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ boolean m9791U0(InstalledAppListActivity installedAppListActivity, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ ActivityInstalledAppListBinding m9792V0(InstalledAppListActivity installedAppListActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m9793W0(InstalledAppListActivity installedAppListActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ List m9794X0(InstalledAppListActivity installedAppListActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ List m9795Y0(InstalledAppListActivity installedAppListActivity, List list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ void m9796Z0(InstalledAppListActivity installedAppListActivity, List list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ CommonDialog m9797a1(InstalledAppListActivity installedAppListActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ void m9798b1(InstalledAppListActivity installedAppListActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public static final String m9799c1(Intent intent) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    private void m9800h1(List<C4714l3> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q1 */
    public static void m9801q1(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r1 */
    public static void m9802r1(Activity activity, int i, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s1 */
    public static void m9803s1(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.view.ApplicationLayout.InterfaceC2379e
    /* JADX INFO: renamed from: P */
    public void mo9804P(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public final void m9805d1(RadioButton radioButton) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    public final void m9806e1(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    public final void m9807f1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g1 */
    public final void m9808g1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    public final boolean m9809i1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j1 */
    public final boolean m9810j1(boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m9811k1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m9812l1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m1 */
    public final void m9813m1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n1 */
    public final void m9814n1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o1 */
    public final void m9815o1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
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
    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.view.ApplicationLayout.InterfaceC2378d
    /* JADX INFO: renamed from: p */
    public boolean mo9816p(AdapterView<?> adapterView, View view, int i, C4650k3 c4650k3) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p1 */
    public final void m9817p1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.view.ApplicationLayout.InterfaceC2380f
    /* JADX INFO: renamed from: r */
    public void mo9818r() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t1 */
    public void m9819t1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x004a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: u1 */
    public java.util.List m9820u1(int r4, int r5) {
        /*
            r3 = this;
            r0 = 0
            return r0
        L5f:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.InstalledAppListActivity.m9820u1(int, int):java.util.List");
    }
}
