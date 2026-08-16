package android.media.ViviTV.activity;

import android.content.Context;
import android.media.ViviTV.biz.VideoCateBiz;
import android.media.ViviTV.fragmens.BaseVideoListFragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import java.util.List;
import p000.C0376Fk;
import p000.C6041r10;
import p000.RunnableC0076B9;

/* JADX INFO: loaded from: classes.dex */
public abstract class TypeDetailsActivity extends BaseActivity implements BaseVideoListFragment.InterfaceC2018g, View.OnClickListener {

    /* JADX INFO: renamed from: P */
    public static final String f5330P = "TypeDetailsActivity";

    /* JADX INFO: renamed from: Q */
    public static final int f5331Q = 0;

    /* JADX INFO: renamed from: A */
    public Button f5332A;

    /* JADX INFO: renamed from: B */
    public List<Fragment> f5333B;

    /* JADX INFO: renamed from: C */
    public FrameLayout f5334C;

    /* JADX INFO: renamed from: D */
    public RelativeLayout f5335D;

    /* JADX INFO: renamed from: E */
    public boolean f5336E;

    /* JADX INFO: renamed from: F */
    public boolean f5337F;

    /* JADX INFO: renamed from: G */
    public RadioButton f5338G;

    /* JADX INFO: renamed from: H */
    public int f5339H;

    /* JADX INFO: renamed from: I */
    public TextView f5340I;

    /* JADX INFO: renamed from: J */
    public List<C0376Fk> f5341J;

    /* JADX INFO: renamed from: K */
    public View.OnFocusChangeListener f5342K;

    /* JADX INFO: renamed from: L */
    public CompoundButton.OnCheckedChangeListener f5343L;

    /* JADX INFO: renamed from: M */
    public View.OnKeyListener f5344M;

    /* JADX INFO: renamed from: N */
    public final View.OnClickListener f5345N;

    /* JADX INFO: renamed from: O */
    public View.OnKeyListener f5346O;

    /* JADX INFO: renamed from: u */
    public C6041r10 f5347u;

    /* JADX INFO: renamed from: v */
    public RadioButton f5348v;

    /* JADX INFO: renamed from: w */
    public TextView f5349w;

    /* JADX INFO: renamed from: x */
    public String f5350x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f5351y;

    /* JADX INFO: renamed from: z */
    public RadioButton f5352z;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.TypeDetailsActivity$a */
    public class AsyncTaskC1904a extends AsyncTask<Void, Void, VideoCateBiz.LoadCategoryResult> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TypeDetailsActivity f5353a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1904a(TypeDetailsActivity typeDetailsActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public VideoCateBiz.LoadCategoryResult m10257a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m10258b(VideoCateBiz.LoadCategoryResult loadCategoryResult) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ VideoCateBiz.LoadCategoryResult doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(VideoCateBiz.LoadCategoryResult loadCategoryResult) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.TypeDetailsActivity$b */
    public class ViewOnFocusChangeListenerC1905b implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a */
        public RunnableC0076B9 f5354a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TypeDetailsActivity f5355b;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnFocusChangeListenerC1905b(TypeDetailsActivity typeDetailsActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.TypeDetailsActivity$c */
    public class C1906c implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TypeDetailsActivity f5356a;

        /* JADX WARN: Invalid debug info offset */
        public C1906c(TypeDetailsActivity typeDetailsActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.TypeDetailsActivity$d */
    public class ViewOnKeyListenerC1907d implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TypeDetailsActivity f5357a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC1907d(TypeDetailsActivity typeDetailsActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.TypeDetailsActivity$e */
    public class ViewOnClickListenerC1908e implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TypeDetailsActivity f5358a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC1908e(TypeDetailsActivity typeDetailsActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.TypeDetailsActivity$f */
    public class ViewOnKeyListenerC1909f implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TypeDetailsActivity f5359a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC1909f(TypeDetailsActivity typeDetailsActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ Button m10233P0(TypeDetailsActivity typeDetailsActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m10234Q0(TypeDetailsActivity typeDetailsActivity, VideoCateBiz.LoadCategoryResult loadCategoryResult) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ LinearLayout m10235R0(TypeDetailsActivity typeDetailsActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ FrameLayout m10236S0(TypeDetailsActivity typeDetailsActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ RadioButton m10237T0(TypeDetailsActivity typeDetailsActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ RadioButton m10238U0(TypeDetailsActivity typeDetailsActivity, RadioButton radioButton) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ List m10239V0(TypeDetailsActivity typeDetailsActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ TextView m10240W0(TypeDetailsActivity typeDetailsActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m10241X0(TypeDetailsActivity typeDetailsActivity, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ List m10242Y0(TypeDetailsActivity typeDetailsActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ int m10243Z0(TypeDetailsActivity typeDetailsActivity) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ boolean m10244a1(TypeDetailsActivity typeDetailsActivity) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    private final void m10245b1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    private final void m10246d1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    private void m10247i1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x007e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: k1 */
    private final void m10248k1(android.view.View r4) {
        /*
            r3 = this;
            return
        L81:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.TypeDetailsActivity.m10248k1(android.view.View):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l1 */
    public static void m10249l1(Context context, C6041r10 c6041r10, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m1 */
    public static void m10250m1(Context context, C6041r10 c6041r10, boolean z, boolean z2) {
    }

    @Override // android.media.ViviTV.fragmens.BaseVideoListFragment.InterfaceC2018g
    /* JADX INFO: renamed from: C */
    public void mo10227C(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1408Vq
    /* JADX INFO: renamed from: M */
    public void mo6636M(Fragment fragment) {
    }

    /* JADX INFO: renamed from: c1 */
    public abstract void mo10251c1(String str);

    /* JADX INFO: renamed from: e1 */
    public abstract void mo10252e1();

    /* JADX INFO: renamed from: f1 */
    public abstract int mo10253f1();

    /* JADX INFO: renamed from: g1 */
    public abstract void mo10254g1(View view);

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x01be
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: h1 */
    public final void m10255h1(android.media.ViviTV.biz.VideoCateBiz.LoadCategoryResult r14) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.TypeDetailsActivity.m10255h1(android.media.ViviTV.biz.VideoCateBiz$LoadCategoryResult):void");
    }

    @Override // p000.InterfaceC1408Vq
    /* JADX INFO: renamed from: i */
    public void mo6637i(Fragment fragment) {
    }

    /* JADX INFO: renamed from: j1 */
    public abstract boolean mo10256j1();

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }
}
