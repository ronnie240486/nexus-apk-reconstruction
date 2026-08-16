package android.media.ViviTV.activity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.ViviTV.adapters.LabelVideoListAdapter;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import org.lucasr.twowayview.widget.TwoWayView;
import p000.AbstractC0310Eh;
import p000.InterfaceC0055Aq;
import p000.R00;
import p000.W00;

/* JADX INFO: loaded from: classes4.dex */
public class LabelListActivity extends BaseActivity {

    /* JADX INFO: renamed from: A */
    public static final String f5036A = "mode";

    /* JADX INFO: renamed from: B */
    public static final int f5037B = 1;

    /* JADX INFO: renamed from: C */
    public static final int f5038C = 2;

    /* JADX INFO: renamed from: D */
    public static final String f5039D = "videoLabelInfo";

    /* JADX INFO: renamed from: u */
    public RelativeLayout f5040u;

    /* JADX INFO: renamed from: v */
    public ListView f5041v;

    /* JADX INFO: renamed from: w */
    public C1834g f5042w;

    /* JADX INFO: renamed from: x */
    public int f5043x;

    /* JADX INFO: renamed from: y */
    public W00 f5044y;

    /* JADX INFO: renamed from: z */
    public LabelVideoListAdapter.InterfaceC1960d f5045z;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.LabelListActivity$a */
    public class AsyncTaskC1828a extends AsyncTask<Void, Integer, Bitmap> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LabelListActivity f5046a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1828a(LabelListActivity labelListActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Bitmap m9875a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9876b(Bitmap bitmap) {
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

    /* JADX INFO: renamed from: android.media.ViviTV.activity.LabelListActivity$b */
    public class C1829b extends AbstractC0310Eh {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LabelListActivity f5047f;

        /* JADX WARN: Invalid debug info offset */
        public C1829b(LabelListActivity labelListActivity, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC0310Eh
        /* JADX INFO: renamed from: b */
        public void mo1663b(int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.LabelListActivity$c */
    public class C1830c implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a */
        public int f5048a;

        /* JADX INFO: renamed from: b */
        public View f5049b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LabelListActivity f5050c;

        /* JADX WARN: Invalid debug info offset */
        public C1830c(LabelListActivity labelListActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.LabelListActivity$d */
    public class AsyncTaskC1831d extends AsyncTask<Void, Integer, List<W00>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5051a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LabelListActivity f5052b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1831d(LabelListActivity labelListActivity, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public List<W00> m9877a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9878b(List<W00> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ List<W00> doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(List<W00> list) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.LabelListActivity$e */
    public class RunnableC1832e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LabelListActivity f5053a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC1832e(LabelListActivity labelListActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.LabelListActivity$f */
    public class C1833f implements LabelVideoListAdapter.InterfaceC1960d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LabelListActivity f5054a;

        /* JADX WARN: Invalid debug info offset */
        public C1833f(LabelListActivity labelListActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.adapters.LabelVideoListAdapter.InterfaceC1960d
        /* JADX INFO: renamed from: a */
        public void mo9879a(View view, boolean z) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.LabelListActivity$g */
    public class C1834g extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public final Rect f5055a;

        /* JADX INFO: renamed from: b */
        public final Rect f5056b;

        /* JADX INFO: renamed from: c */
        public final SparseArray<LabelVideoListAdapter> f5057c;

        /* JADX INFO: renamed from: d */
        public List<W00> f5058d;

        /* JADX INFO: renamed from: e */
        public boolean f5059e;

        /* JADX INFO: renamed from: f */
        public int f5060f;

        /* JADX INFO: renamed from: g */
        public View.OnClickListener f5061g;

        /* JADX INFO: renamed from: h */
        public InterfaceC0055Aq f5062h;

        /* JADX INFO: renamed from: i */
        public RecyclerView.OnScrollListener f5063i;

        /* JADX INFO: renamed from: j */
        public LabelVideoListAdapter.InterfaceC1961e f5064j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ LabelListActivity f5065k;

        /* JADX INFO: renamed from: android.media.ViviTV.activity.LabelListActivity$g$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1834g f5066a;

            /* JADX WARN: Invalid debug info offset */
            public a(C1834g c1834g) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX INFO: renamed from: android.media.ViviTV.activity.LabelListActivity$g$b */
        public class b implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1834g f5067a;

            /* JADX WARN: Invalid debug info offset */
            public b(C1834g c1834g) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        /* JADX INFO: renamed from: android.media.ViviTV.activity.LabelListActivity$g$c */
        public class c implements InterfaceC0055Aq {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1834g f5068a;

            /* JADX INFO: renamed from: android.media.ViviTV.activity.LabelListActivity$g$c$a */
            public class a implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ TwoWayView f5069a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f5070b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ c f5071c;

                /* JADX WARN: Invalid debug info offset */
                public a(c cVar, TwoWayView twoWayView, int i) {
                }

                /* JADX WARN: Invalid debug info offset */
                @Override // java.lang.Runnable
                public void run() {
                }
            }

            /* JADX WARN: Invalid debug info offset */
            public c(C1834g c1834g) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // p000.InterfaceC0055Aq
            /* JADX INFO: renamed from: a */
            public boolean mo266a(View view, int i, KeyEvent keyEvent) {
                return false;
            }

            /* JADX WARN: Invalid debug info offset */
            /* JADX INFO: renamed from: b */
            public final void m9887b(View view, int i, KeyEvent keyEvent) {
            }

            /* JADX WARN: Invalid debug info offset */
            /* JADX INFO: renamed from: c */
            public final boolean m9888c(View view, int i, KeyEvent keyEvent) {
                return false;
            }
        }

        /* JADX INFO: renamed from: android.media.ViviTV.activity.LabelListActivity$g$d */
        public class d extends RecyclerView.OnScrollListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1834g f5072a;

            /* JADX WARN: Invalid debug info offset */
            public d(C1834g c1834g) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            }
        }

        /* JADX INFO: renamed from: android.media.ViviTV.activity.LabelListActivity$g$e */
        public class e implements LabelVideoListAdapter.InterfaceC1961e {

            /* JADX INFO: renamed from: a */
            public boolean f5073a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C1834g f5074b;

            /* JADX WARN: Invalid debug info offset */
            public e(C1834g c1834g) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.media.ViviTV.adapters.LabelVideoListAdapter.InterfaceC1961e
            /* JADX INFO: renamed from: a */
            public void mo9889a() {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.media.ViviTV.adapters.LabelVideoListAdapter.InterfaceC1961e
            /* JADX INFO: renamed from: b */
            public void mo9890b() {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.media.ViviTV.adapters.LabelVideoListAdapter.InterfaceC1961e
            /* JADX INFO: renamed from: c */
            public void mo9891c(boolean z) {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public C1834g(LabelListActivity labelListActivity, List<W00> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Rect m9880a(C1834g c1834g) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Rect m9881b(C1834g c1834g) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m9882c(C1834g c1834g, View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public void m9883d(List<W00> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public final View m9884e(View view) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public final void m9885f(View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g */
        public void m9886g(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.Adapter
        public int getCount() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ W00 m9851P0(LabelListActivity labelListActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ RelativeLayout m9852Q0(LabelListActivity labelListActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ int m9853R0(LabelListActivity labelListActivity) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m9854S0(LabelListActivity labelListActivity, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ List m9855T0(LabelListActivity labelListActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ C1834g m9856U0(LabelListActivity labelListActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m9857V0(LabelListActivity labelListActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ ListView m9858W0(LabelListActivity labelListActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ LabelVideoListAdapter.InterfaceC1960d m9859X0(LabelListActivity labelListActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    private void m9860Y0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    private void m9861b1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    /* JADX INFO: renamed from: g1 */
    public static List<R00> m9862g1(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j1 */
    private void m9863j1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m1 */
    public static final void m9864m1(Context context, W00 w00) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public final void m9865Z0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public final void m9866a1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public int mo9867c1() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public int m9868d1() {
        return 0;
    }

    /* JADX INFO: renamed from: e1 */
    public LabelVideoListAdapter.InterfaceC1959c mo9869e1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    public final List<W00> m9870f1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    public int mo9871h1() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    public void mo9872i1(R00 r00) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k1 */
    public final void m9873k1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l1 */
    public final void m9874l1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }
}
