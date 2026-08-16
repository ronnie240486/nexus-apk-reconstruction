package android.media.ViviTV.adapters;

import android.content.Context;
import android.os.AsyncTask;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseRecyclerViewAdapter<VHH extends RecyclerView.ViewHolder, DataType> extends RecyclerView.Adapter<VHH> implements View.OnClickListener, View.OnLongClickListener, View.OnFocusChangeListener, View.OnKeyListener {

    /* JADX INFO: renamed from: l */
    public static final String f5567l = "1";

    /* JADX INFO: renamed from: a */
    public Context f5568a;

    /* JADX INFO: renamed from: b */
    public List<DataType> f5569b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1942b<DataType> f5570c;

    /* JADX INFO: renamed from: d */
    public InterfaceC1943c<DataType> f5571d;

    /* JADX INFO: renamed from: e */
    public InterfaceC1944d<DataType> f5572e;

    /* JADX INFO: renamed from: f */
    public boolean f5573f;

    /* JADX INFO: renamed from: g */
    public boolean f5574g;

    /* JADX INFO: renamed from: h */
    public boolean f5575h;

    /* JADX INFO: renamed from: i */
    public int f5576i;

    /* JADX INFO: renamed from: j */
    public boolean f5577j;

    /* JADX INFO: renamed from: k */
    public boolean f5578k;

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.BaseRecyclerViewAdapter$a */
    public class AsyncTaskC1941a extends AsyncTask<Void, Integer, Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Comparator f5579a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f5580b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f5581c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ BaseRecyclerViewAdapter f5582d;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1941a(BaseRecyclerViewAdapter baseRecyclerViewAdapter, Comparator comparator, Object obj, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Integer m10454a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m10455b(Integer num) {
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
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.BaseRecyclerViewAdapter$b */
    public interface InterfaceC1942b<DT> {
        /* JADX INFO: renamed from: H */
        boolean mo10273H(int i, DT dt);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.BaseRecyclerViewAdapter$c */
    public interface InterfaceC1943c<DT> {
        /* JADX INFO: renamed from: o0 */
        boolean mo10456o0(View view, int i, DT dt);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.BaseRecyclerViewAdapter$d */
    public interface InterfaceC1944d<DT> extends InterfaceC1943c<DT> {
        /* JADX INFO: renamed from: f0 */
        boolean mo10457f0(View view, int i, DT dt, int i2, KeyEvent keyEvent);

        /* JADX INFO: renamed from: g0 */
        boolean mo10458g0(View view, int i, DT dt);

        /* JADX INFO: renamed from: t0 */
        boolean mo10459t0(View view, int i, DT dt, boolean z);
    }

    /* JADX WARN: Invalid debug info offset */
    public BaseRecyclerViewAdapter(Context context, List<DataType> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public void m10427A(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public void m10428B(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public void m10429C(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public void m10430D(InterfaceC1942b<DataType> interfaceC1942b) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public void m10431E(InterfaceC1943c<DataType> interfaceC1943c) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public void m10432F(InterfaceC1944d<DataType> interfaceC1944d) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public void m10433G(int i) {
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo10434d(@NonNull VHH vhh, int i, DataType datatype);

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public abstract VHH mo10435h(@NonNull ViewGroup viewGroup, int i, View view);

    /* JADX INFO: renamed from: i */
    public abstract int mo10436i();

    /* JADX INFO: renamed from: j */
    public int mo10437j(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public View m10438k(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public InterfaceC1942b<DataType> m10439l() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public InterfaceC1944d<DataType> m10440m() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public int m10441n() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: o */
    public final VHH m10442o(View view) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull VHH vhh, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final VHH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public void m10443p(View view, VHH vhh) {
    }

    /* JADX INFO: renamed from: q */
    public boolean mo10444q() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public boolean m10445r() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public boolean m10446s() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public boolean m10447t() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public boolean m10448u() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public boolean m10449v() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public final void m10450w(View view, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public void m10451x(DataType datatype, Comparator<DataType> comparator, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public void m10452y(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public void m10453z(boolean z) {
    }
}
