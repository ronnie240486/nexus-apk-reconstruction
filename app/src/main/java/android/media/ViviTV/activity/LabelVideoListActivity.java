package android.media.ViviTV.activity;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.ViviTV.adapters.ViewOnKeyListenerC1991b;
import android.media.ViviTV.databinding.LayoutActivityLabelVideoListBinding;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.GridView;
import p000.AbstractViewOnKeyListenerC1663Zn;
import p000.C6071v30;
import p000.R00;
import p000.W00;
import p000.X00;

/* JADX INFO: loaded from: classes4.dex */
public class LabelVideoListActivity extends BaseActivity implements ViewOnKeyListenerC1991b.b, View.OnClickListener, View.OnKeyListener {

    /* JADX INFO: renamed from: D */
    public static final String f5075D = "EXTRA_LABEL";

    /* JADX INFO: renamed from: E */
    public static final String f5076E = "customBackground";

    /* JADX INFO: renamed from: A */
    public W00 f5077A;

    /* JADX INFO: renamed from: B */
    public boolean f5078B;

    /* JADX INFO: renamed from: C */
    public LayoutActivityLabelVideoListBinding f5079C;

    /* JADX INFO: renamed from: u */
    public X00 f5080u;

    /* JADX INFO: renamed from: v */
    public int f5081v;

    /* JADX INFO: renamed from: w */
    public int f5082w;

    /* JADX INFO: renamed from: x */
    public boolean f5083x;

    /* JADX INFO: renamed from: y */
    public ViewOnKeyListenerC1991b f5084y;

    /* JADX INFO: renamed from: z */
    public Button f5085z;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.LabelVideoListActivity$a */
    public class AsyncTaskC1835a extends AsyncTask<Void, Integer, Bitmap> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LabelVideoListActivity f5086a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1835a(LabelVideoListActivity labelVideoListActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Bitmap m9913a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9914b(Bitmap bitmap) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Bitmap doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Bitmap bitmap) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.LabelVideoListActivity$b */
    public class C1836b implements AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LabelVideoListActivity f5087a;

        /* JADX WARN: Invalid debug info offset */
        public C1836b(LabelVideoListActivity labelVideoListActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.LabelVideoListActivity$c */
    public class C1837c extends AbstractViewOnKeyListenerC1663Zn {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ LabelVideoListActivity f5088e;

        /* JADX WARN: Invalid debug info offset */
        public C1837c(LabelVideoListActivity labelVideoListActivity, GridView gridView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractViewOnKeyListenerC1663Zn
        /* JADX INFO: renamed from: b */
        public boolean mo8770b(View view, int i, KeyEvent keyEvent) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractViewOnKeyListenerC1663Zn
        /* JADX INFO: renamed from: k */
        public void mo8779k() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.LabelVideoListActivity$d */
    public class C1838d extends C6071v30.C5566c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LabelVideoListActivity f5089a;

        /* JADX WARN: Invalid debug info offset */
        public C1838d(LabelVideoListActivity labelVideoListActivity) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.LabelVideoListActivity$e */
    public class AsyncTaskC1839e extends AsyncTask<Void, Integer, X00> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5090a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LabelVideoListActivity f5091b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1839e(LabelVideoListActivity labelVideoListActivity, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public X00 m9915a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9916b(X00 x00) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ X00 doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onCancelled() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(X00 x00) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ W00 m9892P0(LabelVideoListActivity labelVideoListActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ LayoutActivityLabelVideoListBinding m9893Q0(LabelVideoListActivity labelVideoListActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ X00 m9894R0(LabelVideoListActivity labelVideoListActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ X00 m9895S0(LabelVideoListActivity labelVideoListActivity, X00 x00) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ int m9896T0(LabelVideoListActivity labelVideoListActivity) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ int m9897U0(LabelVideoListActivity labelVideoListActivity, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m9898V0(LabelVideoListActivity labelVideoListActivity, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m9899W0(LabelVideoListActivity labelVideoListActivity, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ boolean m9900X0(LabelVideoListActivity labelVideoListActivity, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ int m9901Y0(LabelVideoListActivity labelVideoListActivity, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ Button m9902Z0(LabelVideoListActivity labelVideoListActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ ViewOnKeyListenerC1991b m9903a1(LabelVideoListActivity labelVideoListActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    private void m9904b1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    private void m9905c1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    private void m9906f1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g1 */
    private void m9907g1(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    public static final void m9908h1(Context context, W00 w00) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    public static final void m9909i1(Context context, W00 w00, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.ViewOnKeyListenerC1991b.b
    /* JADX INFO: renamed from: G */
    public void mo9910G(int i, R00 r00) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public final void m9911d1(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    public final void m9912e1() {
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
    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        return false;
    }
}
