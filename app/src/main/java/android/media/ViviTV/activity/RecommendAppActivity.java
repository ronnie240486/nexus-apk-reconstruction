package android.media.ViviTV.activity;

import android.media.ViviTV.adapters.InstalledAppListAdapterRv;
import android.media.ViviTV.adapters.RecyclerAdapterPTR;
import android.media.ViviTV.broadcast.PackageReceiver;
import android.media.ViviTV.databinding.ActivityRecommendAppBinding;
import android.media.dialog.CommonDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p000.C0736LM;
import p000.C1683a4;
import p000.C4650k3;

/* JADX INFO: loaded from: classes4.dex */
public class RecommendAppActivity extends BaseActivity implements View.OnClickListener, View.OnFocusChangeListener, C1683a4.e, PackageReceiver.InterfaceC1992a {

    /* JADX INFO: renamed from: A */
    public InstalledAppListAdapterRv.InterfaceC1954b f5169A;

    /* JADX INFO: renamed from: B */
    public RecyclerView.OnScrollListener f5170B;

    /* JADX INFO: renamed from: C */
    public View.OnKeyListener f5171C;

    /* JADX INFO: renamed from: u */
    public List<C4650k3> f5172u;

    /* JADX INFO: renamed from: v */
    public PackageReceiver f5173v;

    /* JADX INFO: renamed from: w */
    public CommonDialog f5174w;

    /* JADX INFO: renamed from: x */
    public C0736LM f5175x;

    /* JADX INFO: renamed from: y */
    public ActivityRecommendAppBinding f5176y;

    /* JADX INFO: renamed from: z */
    public InstalledAppListAdapterRv.InterfaceC1954b f5177z;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.RecommendAppActivity$a */
    public class C1862a implements RecyclerAdapterPTR.InterfaceC1980f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InstalledAppListAdapterRv f5178a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RecommendAppActivity f5179b;

        /* JADX WARN: Invalid debug info offset */
        public C1862a(RecommendAppActivity recommendAppActivity, InstalledAppListAdapterRv installedAppListAdapterRv) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.adapters.RecyclerAdapterPTR.InterfaceC1980f
        /* JADX INFO: renamed from: c0 */
        public void mo9930c0() {
        }

        @Override // android.media.ViviTV.adapters.RecyclerAdapterPTR.InterfaceC1980f
        /* JADX INFO: renamed from: j0 */
        public boolean mo9933j0() {
            return true;
        }

        @Override // android.media.ViviTV.adapters.RecyclerAdapterPTR.InterfaceC1980f
        /* JADX INFO: renamed from: x */
        public void mo9934x(boolean z) {
        }

        @Override // android.media.ViviTV.adapters.RecyclerAdapterPTR.InterfaceC1980f
        /* JADX INFO: renamed from: y */
        public void mo9935y() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.RecommendAppActivity$b */
    public class RunnableC1863b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecommendAppActivity f5180a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC1863b(RecommendAppActivity recommendAppActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.RecommendAppActivity$c */
    public class AsyncTaskC1864c extends AsyncTask<Void, Integer, List<C4650k3>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecommendAppActivity f5181a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1864c(RecommendAppActivity recommendAppActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public List<C4650k3> m10054a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m10055b(List<C4650k3> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ List<C4650k3> doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(List<C4650k3> list) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.RecommendAppActivity$d */
    public class C1865d implements CommonDialog.InterfaceC2374a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecommendAppActivity f5182a;

        /* JADX WARN: Invalid debug info offset */
        public C1865d(RecommendAppActivity recommendAppActivity) {
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

    /* JADX INFO: renamed from: android.media.ViviTV.activity.RecommendAppActivity$f */
    public class C1867f implements InstalledAppListAdapterRv.InterfaceC1954b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecommendAppActivity f5184a;

        /* JADX WARN: Invalid debug info offset */
        public C1867f(RecommendAppActivity recommendAppActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.adapters.InstalledAppListAdapterRv.InterfaceC1954b
        /* JADX INFO: renamed from: a */
        public void mo10056a(int i, C4650k3 c4650k3) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.adapters.InstalledAppListAdapterRv.InterfaceC1954b
        /* JADX INFO: renamed from: b */
        public void mo10057b(int i, C4650k3 c4650k3) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.RecommendAppActivity$g */
    public class C1868g extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecommendAppActivity f5185a;

        /* JADX WARN: Invalid debug info offset */
        public C1868g(RecommendAppActivity recommendAppActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.RecommendAppActivity$h */
    public class ViewOnKeyListenerC1869h implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecommendAppActivity f5186a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC1869h(RecommendAppActivity recommendAppActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m10030P0(RecommendAppActivity recommendAppActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ ActivityRecommendAppBinding m10031Q0(RecommendAppActivity recommendAppActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ InstalledAppListAdapterRv.InterfaceC1954b m10032R0(RecommendAppActivity recommendAppActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ CommonDialog m10033S0(RecommendAppActivity recommendAppActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ C0736LM m10034T0(RecommendAppActivity recommendAppActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m10035U0(RecommendAppActivity recommendAppActivity, C4650k3 c4650k3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m10036V0(RecommendAppActivity recommendAppActivity, C4650k3 c4650k3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m10037W0(RecommendAppActivity recommendAppActivity, C4650k3 c4650k3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m10038X0(RecommendAppActivity recommendAppActivity, C4650k3 c4650k3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ void m10039Y0(RecommendAppActivity recommendAppActivity) {
    }

    @Override // android.media.ViviTV.broadcast.PackageReceiver.InterfaceC1992a
    /* JADX INFO: renamed from: Q */
    public void mo10040Q(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0036
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: Z0 */
    public final void m10041Z0(p000.C4650k3 r4) {
        /*
            r3 = this;
            return
        L3e:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.RecommendAppActivity.m10041Z0(k3):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public final void m10042a1(C4650k3 c4650k3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    public final void m10043b1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public final void m10044c1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.broadcast.PackageReceiver.InterfaceC1992a
    /* JADX INFO: renamed from: d */
    public void mo10045d(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public final void m10046d1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.C1683a4.e
    /* JADX INFO: renamed from: e */
    public void mo8874e(C4650k3 c4650k3, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    public final void m10047e1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    public final void m10048f1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.C1683a4.e
    /* JADX INFO: renamed from: g */
    public void mo8875g(C4650k3 c4650k3, double d, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g1 */
    public final void m10049g1(C4650k3 c4650k3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    public final void m10050h1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    public final void m10051i1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j1 */
    public final void m10052j1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k1 */
    public final void m10053k1(C4650k3 c4650k3) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.C1683a4.e
    /* JADX INFO: renamed from: o */
    public void mo8876o(C4650k3 c4650k3) {
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
    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
    }

    @Override // p000.C1683a4.e
    /* JADX INFO: renamed from: A */
    public void mo8873A(C4650k3 c4650k3) {
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.RecommendAppActivity$e */
    public class C1866e implements InstalledAppListAdapterRv.InterfaceC1954b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecommendAppActivity f5183a;

        /* JADX WARN: Invalid debug info offset */
        public C1866e(RecommendAppActivity recommendAppActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.adapters.InstalledAppListAdapterRv.InterfaceC1954b
        /* JADX INFO: renamed from: a */
        public void mo10056a(int i, C4650k3 c4650k3) {
        }

        @Override // android.media.ViviTV.adapters.InstalledAppListAdapterRv.InterfaceC1954b
        /* JADX INFO: renamed from: b */
        public void mo10057b(int i, C4650k3 c4650k3) {
        }
    }
}
