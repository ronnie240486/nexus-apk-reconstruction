package android.media.ViviTV.adapters;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;
import p000.InterfaceC1340Uq;

/* JADX INFO: loaded from: classes.dex */
public abstract class RecyclerAdapterPTR<VHH extends RecyclerView.ViewHolder, DataType> extends RecyclerView.Adapter<VHH> implements View.OnKeyListener, InterfaceC1340Uq, View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public Context f5758a;

    /* JADX INFO: renamed from: b */
    public List<DataType> f5759b;

    /* JADX INFO: renamed from: c */
    public int f5760c;

    /* JADX INFO: renamed from: d */
    public boolean f5761d;

    /* JADX INFO: renamed from: e */
    public AsyncTask<Void, Boolean, List<DataType>> f5762e;

    /* JADX INFO: renamed from: f */
    public boolean f5763f;

    /* JADX INFO: renamed from: g */
    public InterfaceC1978d f5764g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1979e f5765h;

    /* JADX INFO: renamed from: i */
    public InterfaceC1980f f5766i;

    /* JADX INFO: renamed from: j */
    public View.OnClickListener f5767j;

    /* JADX INFO: renamed from: k */
    public int f5768k;

    /* JADX INFO: renamed from: l */
    public boolean f5769l;

    /* JADX INFO: renamed from: m */
    public boolean f5770m;

    /* JADX INFO: renamed from: n */
    public boolean f5771n;

    /* JADX INFO: renamed from: o */
    public boolean f5772o;

    /* JADX INFO: renamed from: p */
    public boolean f5773p;

    /* JADX INFO: renamed from: q */
    public int f5774q;

    /* JADX INFO: renamed from: r */
    public int f5775r;

    /* JADX INFO: renamed from: s */
    public boolean f5776s;

    /* JADX INFO: renamed from: t */
    public InterfaceC1977c f5777t;

    /* JADX INFO: renamed from: u */
    public View.OnClickListener f5778u;

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.RecyclerAdapterPTR$a */
    public class AsyncTaskC1975a extends AsyncTask<Void, Boolean, List<DataType>> {

        /* JADX INFO: renamed from: a */
        public ProgressDialog f5779a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f5780b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ RecyclerAdapterPTR f5781c;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1975a(RecyclerAdapterPTR recyclerAdapterPTR, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public List<DataType> m10689a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m10690b(List<DataType> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public void m10691c(List<DataType> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Object doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onCancelled() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onCancelled(Object obj) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.RecyclerAdapterPTR$b */
    public class ViewOnClickListenerC1976b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerAdapterPTR f5782a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC1976b(RecyclerAdapterPTR recyclerAdapterPTR) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.RecyclerAdapterPTR$c */
    public interface InterfaceC1977c<DataType> {
        /* JADX INFO: renamed from: I */
        void mo9924I(View view, int i, DataType datatype);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.RecyclerAdapterPTR$d */
    public interface InterfaceC1978d {
        /* JADX INFO: renamed from: a */
        boolean mo9928a(View view, int i, KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.RecyclerAdapterPTR$e */
    public interface InterfaceC1979e {
        /* JADX INFO: renamed from: i */
        void mo10692i(View view, boolean z);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.RecyclerAdapterPTR$f */
    public interface InterfaceC1980f {
        /* JADX INFO: renamed from: c0 */
        void mo9930c0();

        /* JADX INFO: renamed from: j0 */
        boolean mo9933j0();

        /* JADX INFO: renamed from: x */
        void mo9934x(boolean z);

        /* JADX INFO: renamed from: y */
        void mo9935y();
    }

    /* JADX WARN: Invalid debug info offset */
    public RecyclerAdapterPTR(Context context, List<DataType> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m10647d(RecyclerAdapterPTR recyclerAdapterPTR) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m10648h(RecyclerAdapterPTR recyclerAdapterPTR) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ int m10649i(RecyclerAdapterPTR recyclerAdapterPTR, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m10650j(RecyclerAdapterPTR recyclerAdapterPTR) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ boolean m10651k(RecyclerAdapterPTR recyclerAdapterPTR, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ boolean m10652l(RecyclerAdapterPTR recyclerAdapterPTR) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ InterfaceC1980f m10653m(RecyclerAdapterPTR recyclerAdapterPTR) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ List m10654n(RecyclerAdapterPTR recyclerAdapterPTR) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ boolean m10655o(RecyclerAdapterPTR recyclerAdapterPTR) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ InterfaceC1977c m10656p(RecyclerAdapterPTR recyclerAdapterPTR) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ View.OnClickListener m10657q(RecyclerAdapterPTR recyclerAdapterPTR) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public int m10658A(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public int m10659B() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public boolean m10660C() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public boolean m10661D() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public boolean m10662E() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public boolean m10663F() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public boolean m10664G() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public boolean m10665H() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public final boolean m10666I(View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public void m10667J(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public void m10668K(InterfaceC1979e interfaceC1979e) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public void m10669L(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public void m10670M(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public void m10671N(InterfaceC1980f interfaceC1980f) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public void m10672O(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public void m10673P(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q */
    public void m10674Q(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public void m10675R(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public void m10676S(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T */
    public void m10677T(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U */
    public void m10678U(View.OnClickListener onClickListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public void m10679V(InterfaceC1977c interfaceC1977c) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W */
    public void m10680W(InterfaceC1978d interfaceC1978d) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X */
    public void m10681X(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y */
    public void m10682Y(int i) {
    }

    /* JADX INFO: renamed from: Z */
    public abstract List<DataType> mo10524Z(int i, int i2);

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1340Uq
    /* JADX INFO: renamed from: a */
    public int mo6389a() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1340Uq
    /* JADX INFO: renamed from: b */
    public void mo6390b() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1340Uq
    /* JADX INFO: renamed from: c */
    public void mo6391c(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(VHH vhh, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public VHH onCreateViewHolder(ViewGroup viewGroup, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void onFocusChange(View view, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public void m10683r(List<DataType> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public void m10684s(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public void m10685t() {
    }

    /* JADX INFO: renamed from: u */
    public abstract void mo10529u(VHH vhh, int i);

    /* JADX INFO: renamed from: v */
    public abstract RecyclerView.ViewHolder mo10530v(View view);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public List<DataType> m10686w() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public InterfaceC1977c m10687x() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public DataType m10688y(int i) {
        return null;
    }

    /* JADX INFO: renamed from: z */
    public abstract int mo10531z();
}
