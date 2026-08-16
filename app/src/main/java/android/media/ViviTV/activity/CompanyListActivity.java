package android.media.ViviTV.activity;

import android.media.ViviTV.databinding.ActivityCompanyListBinding;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.GridView;
import p000.AbstractViewOnKeyListenerC1663Zn;
import p000.C0749La;
import p000.C0812Ma;
import p000.ViewOnKeyListenerC0684Ka;

/* JADX INFO: loaded from: classes4.dex */
public class CompanyListActivity extends BaseActivity implements ViewOnKeyListenerC0684Ka.b, View.OnClickListener, View.OnKeyListener {

    /* JADX INFO: renamed from: A */
    public ViewOnKeyListenerC0684Ka f4815A;

    /* JADX INFO: renamed from: u */
    public C0749La f4816u;

    /* JADX INFO: renamed from: v */
    public int f4817v;

    /* JADX INFO: renamed from: w */
    public int f4818w;

    /* JADX INFO: renamed from: x */
    public boolean f4819x;

    /* JADX INFO: renamed from: y */
    public Button f4820y;

    /* JADX INFO: renamed from: z */
    public ActivityCompanyListBinding f4821z;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.CompanyListActivity$a */
    public class C1772a implements AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CompanyListActivity f4822a;

        /* JADX WARN: Invalid debug info offset */
        public C1772a(CompanyListActivity companyListActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.CompanyListActivity$b */
    public class C1773b extends AbstractViewOnKeyListenerC1663Zn {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ CompanyListActivity f4823e;

        /* JADX WARN: Invalid debug info offset */
        public C1773b(CompanyListActivity companyListActivity, GridView gridView) {
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

    /* JADX INFO: renamed from: android.media.ViviTV.activity.CompanyListActivity$c */
    public class AsyncTaskC1774c extends AsyncTask<Void, Integer, C0749La> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f4824a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CompanyListActivity f4825b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1774c(CompanyListActivity companyListActivity, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public C0749La m9603a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9604b(C0749La c0749La) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ C0749La doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onCancelled() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(C0749La c0749La) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ C0749La m9589P0(CompanyListActivity companyListActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ C0749La m9590Q0(CompanyListActivity companyListActivity, C0749La c0749La) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ int m9591R0(CompanyListActivity companyListActivity) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ int m9592S0(CompanyListActivity companyListActivity, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ void m9593T0(CompanyListActivity companyListActivity, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ ActivityCompanyListBinding m9594U0(CompanyListActivity companyListActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m9595V0(CompanyListActivity companyListActivity, C0812Ma c0812Ma) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ boolean m9596W0(CompanyListActivity companyListActivity, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ int m9597X0(CompanyListActivity companyListActivity, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ Button m9598Y0(CompanyListActivity companyListActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ ViewOnKeyListenerC0684Ka m9599Z0(CompanyListActivity companyListActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    private void m9600b1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.ViewOnKeyListenerC0684Ka.b
    /* JADX INFO: renamed from: L */
    public void mo3226L(int i, C0812Ma c0812Ma) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public final void m9601a1(C0812Ma c0812Ma) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public final void m9602c1(int i) {
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
