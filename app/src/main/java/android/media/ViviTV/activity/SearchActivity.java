package android.media.ViviTV.activity;

import android.content.Context;
import android.media.ViviTV.adapters.ViewOnKeyListenerC1991b;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.List;
import p000.AbstractFragmentC4519i6;
import p000.AbstractViewOnKeyListenerC1663Zn;
import p000.C0190Cp;
import p000.C0254Dp;
import p000.C6071v30;
import p000.R00;
import p000.X00;

/* JADX INFO: loaded from: classes4.dex */
public class SearchActivity extends BaseActivity implements View.OnClickListener, AbstractFragmentC4519i6.a {

    /* JADX INFO: renamed from: R0 */
    public static final int f5215R0 = 0;

    /* JADX INFO: renamed from: S0 */
    public static final int f5216S0 = 1;

    /* JADX INFO: renamed from: T0 */
    public static final int f5217T0 = 2;

    /* JADX INFO: renamed from: Z */
    public static final String f5218Z = "&num=28";

    /* JADX INFO: renamed from: A */
    public TextView f5219A;

    /* JADX INFO: renamed from: B */
    public TextView f5220B;

    /* JADX INFO: renamed from: C */
    public TextView f5221C;

    /* JADX INFO: renamed from: D */
    public TextView f5222D;

    /* JADX INFO: renamed from: E */
    public TextView f5223E;

    /* JADX INFO: renamed from: F */
    public TextView f5224F;

    /* JADX INFO: renamed from: G */
    public TextView f5225G;

    /* JADX INFO: renamed from: H */
    public TextView f5226H;

    /* JADX INFO: renamed from: I */
    public View f5227I;

    /* JADX INFO: renamed from: J */
    public X00 f5228J;

    /* JADX INFO: renamed from: K */
    public ViewOnKeyListenerC1991b f5229K;

    /* JADX INFO: renamed from: L */
    public String f5230L;

    /* JADX INFO: renamed from: M */
    public int f5231M;

    /* JADX INFO: renamed from: N */
    public RelativeLayout f5232N;

    /* JADX INFO: renamed from: O */
    public TextView f5233O;

    /* JADX INFO: renamed from: P */
    public ListView f5234P;

    /* JADX INFO: renamed from: Q */
    public C0254Dp f5235Q;

    /* JADX INFO: renamed from: R */
    public Animation f5236R;

    /* JADX INFO: renamed from: S */
    public View f5237S;

    /* JADX INFO: renamed from: T */
    public FrameLayout f5238T;

    /* JADX INFO: renamed from: U */
    public AbstractFragmentC4519i6 f5239U;

    /* JADX INFO: renamed from: V */
    public String f5240V;

    /* JADX INFO: renamed from: W */
    public boolean f5241W;

    /* JADX INFO: renamed from: X */
    public Handler f5242X;

    /* JADX INFO: renamed from: Y */
    public Runnable f5243Y;

    /* JADX INFO: renamed from: u */
    public String f5244u;

    /* JADX INFO: renamed from: v */
    public String f5245v;

    /* JADX INFO: renamed from: w */
    public int f5246w;

    /* JADX INFO: renamed from: x */
    public GridView f5247x;

    /* JADX INFO: renamed from: y */
    public EditText f5248y;

    /* JADX INFO: renamed from: z */
    public TextView f5249z;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.SearchActivity$a */
    public class AsyncTaskC1877a extends AsyncTask<Void, Integer, List<C0190Cp>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SearchActivity f5250a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1877a(SearchActivity searchActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.util.List<p000.C0190Cp> m10136a(java.lang.Void... r8) {
            /*
                r7 = this;
                r0 = 0
                return r0
            L5c:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.SearchActivity.AsyncTaskC1877a.m10136a(java.lang.Void[]):java.util.List");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m10137b(List<C0190Cp> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ List<C0190Cp> doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(List<C0190Cp> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.SearchActivity$b */
    public class C1878b implements ViewOnKeyListenerC1991b.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SearchActivity f5251a;

        /* JADX WARN: Invalid debug info offset */
        public C1878b(SearchActivity searchActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.adapters.ViewOnKeyListenerC1991b.b
        /* JADX INFO: renamed from: G */
        public void mo9910G(int i, R00 r00) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.SearchActivity$c */
    public class C1879c implements AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SearchActivity f5252a;

        /* JADX WARN: Invalid debug info offset */
        public C1879c(SearchActivity searchActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.SearchActivity$d */
    public class C1880d extends AbstractViewOnKeyListenerC1663Zn {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ SearchActivity f5253e;

        /* JADX WARN: Invalid debug info offset */
        public C1880d(SearchActivity searchActivity, GridView gridView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractViewOnKeyListenerC1663Zn
        /* JADX INFO: renamed from: b */
        public boolean mo8770b(View view, int i, KeyEvent keyEvent) {
            return false;
        }

        @Override // p000.AbstractViewOnKeyListenerC1663Zn
        /* JADX INFO: renamed from: d */
        public boolean mo8772d() {
            return false;
        }

        @Override // p000.AbstractViewOnKeyListenerC1663Zn
        /* JADX INFO: renamed from: f */
        public boolean mo8774f() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractViewOnKeyListenerC1663Zn
        /* JADX INFO: renamed from: k */
        public void mo8779k() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.SearchActivity$e */
    public class C1881e implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SearchActivity f5254a;

        /* JADX WARN: Invalid debug info offset */
        public C1881e(SearchActivity searchActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.SearchActivity$f */
    public class C1882f extends C6071v30.C5566c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SearchActivity f5255a;

        /* JADX WARN: Invalid debug info offset */
        public C1882f(SearchActivity searchActivity) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.SearchActivity$g */
    public class HandlerC1883g extends Handler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SearchActivity f5256a;

        /* JADX WARN: Invalid debug info offset */
        public HandlerC1883g(SearchActivity searchActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.SearchActivity$h */
    public class RunnableC1884h implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SearchActivity f5257a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC1884h(SearchActivity searchActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A1 */
    public static final void m10096A1(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ View m10097P0(SearchActivity searchActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ TextView m10098Q0(SearchActivity searchActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ Runnable m10099R0(SearchActivity searchActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ boolean m10100S0(SearchActivity searchActivity, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ X00 m10101T0(SearchActivity searchActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ X00 m10102U0(SearchActivity searchActivity, X00 x00) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ int m10103V0(SearchActivity searchActivity) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ int m10104W0(SearchActivity searchActivity, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ String m10105X0(SearchActivity searchActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ void m10106Y0(SearchActivity searchActivity, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ String m10107Z0(SearchActivity searchActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ Handler m10108a1(SearchActivity searchActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ String m10109b1(SearchActivity searchActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ int m10110c1(SearchActivity searchActivity) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ C0254Dp m10111d1(SearchActivity searchActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ C0254Dp m10112e1(SearchActivity searchActivity, C0254Dp c0254Dp) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ ListView m10113f1(SearchActivity searchActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ void m10114g1(SearchActivity searchActivity, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ void m10115h1(SearchActivity searchActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ GridView m10116i1(SearchActivity searchActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j1 */
    public static /* synthetic */ ViewOnKeyListenerC1991b m10117j1(SearchActivity searchActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k1 */
    public static /* synthetic */ void m10118k1(SearchActivity searchActivity, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ TextView m10119l1(SearchActivity searchActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o1 */
    private void m10120o1(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q1 */
    private void m10121q1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B1 */
    public final void m10122B1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.AbstractFragmentC4519i6.a
    /* JADX INFO: renamed from: F */
    public void mo10123F(AbstractFragmentC4519i6 abstractFragmentC4519i6, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m1 */
    public final void m10124m1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n1 */
    public final void m10125n1() {
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
    @Override // android.media.ViviTV.activity.BaseActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0022
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: p1 */
    public final void m10126p1() {
        /*
            r3 = this;
            return
        L25:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.SearchActivity.m10126p1():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r1 */
    public final void m10127r1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s1 */
    public void m10128s1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t1 */
    public final void m10129t1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u1 */
    public final void m10130u1(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v1 */
    public final void m10131v1(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w1 */
    public final void m10132w1(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x1 */
    public final void m10133x1(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y1 */
    public final void m10134y1(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z1 */
    public final void m10135z1(int i) {
    }
}
