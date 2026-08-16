package android.media.ViviTV.viewholders;

import android.media.ViviTV.adapters.RecyclerAdapterPTR;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import org.lucasr.twowayview.widget.TwoWayView;
import p000.C4182cp;

/* JADX INFO: loaded from: classes.dex */
public abstract class ViewHolderHorizontalLoad<VHH extends RecyclerView.ViewHolder, DataType> extends BaseHomeRecyclerViewHolder implements RecyclerAdapterPTR.InterfaceC1980f, View.OnFocusChangeListener, RecyclerAdapterPTR.InterfaceC1979e {

    /* JADX INFO: renamed from: n */
    public TwoWayView f9828n;

    /* JADX INFO: renamed from: o */
    public RecyclerAdapterPTR<VHH, DataType> f9829o;

    /* JADX INFO: renamed from: p */
    public TextView f9830p;

    /* JADX INFO: renamed from: q */
    public RecyclerAdapterPTR.InterfaceC1978d f9831q;

    /* JADX INFO: renamed from: r */
    public RecyclerView.OnScrollListener f9832r;

    /* JADX INFO: renamed from: s */
    public View.OnClickListener f9833s;

    /* JADX INFO: renamed from: android.media.ViviTV.viewholders.ViewHolderHorizontalLoad$a */
    public class C2354a implements RecyclerAdapterPTR.InterfaceC1978d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewHolderHorizontalLoad f9834a;

        /* JADX INFO: renamed from: android.media.ViviTV.viewholders.ViewHolderHorizontalLoad$a$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f9835a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C2354a f9836b;

            /* JADX WARN: Invalid debug info offset */
            public a(C2354a c2354a, int i) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public C2354a(ViewHolderHorizontalLoad viewHolderHorizontalLoad) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.adapters.RecyclerAdapterPTR.InterfaceC1978d
        /* JADX INFO: renamed from: a */
        public boolean mo9928a(View view, int i, KeyEvent keyEvent) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public final boolean m14342b(View view, int i, KeyEvent keyEvent) {
            return false;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m14343c(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.viewholders.ViewHolderHorizontalLoad$b */
    public class C2355b extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewHolderHorizontalLoad f9837a;

        /* JADX WARN: Invalid debug info offset */
        public C2355b(ViewHolderHorizontalLoad viewHolderHorizontalLoad) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.viewholders.ViewHolderHorizontalLoad$c */
    public class ViewOnClickListenerC2356c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewHolderHorizontalLoad f9838a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC2356c(ViewHolderHorizontalLoad viewHolderHorizontalLoad) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public ViewHolderHorizontalLoad(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public static /* synthetic */ RecyclerAdapterPTR m14336I(ViewHolderHorizontalLoad viewHolderHorizontalLoad) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public static /* synthetic */ TwoWayView m14337J(ViewHolderHorizontalLoad viewHolderHorizontalLoad) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m14338K(ViewHolderHorizontalLoad viewHolderHorizontalLoad, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.viewholders.BaseHomeRecyclerViewHolder
    /* JADX INFO: renamed from: C */
    public final void mo14292C(C4182cp c4182cp) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public void m14339L() {
    }

    /* JADX INFO: renamed from: M */
    public abstract void mo14317M();

    /* JADX INFO: renamed from: N */
    public abstract RecyclerAdapterPTR<VHH, DataType> mo14318N();

    /* JADX INFO: renamed from: O */
    public abstract int mo14319O();

    /* JADX INFO: renamed from: P */
    public abstract void mo14320P(int i, DataType datatype);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q */
    public final void m14340Q(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public final void m14341R(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.RecyclerAdapterPTR.InterfaceC1980f
    /* JADX INFO: renamed from: c0 */
    public void mo9930c0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.RecyclerAdapterPTR.InterfaceC1979e
    /* JADX INFO: renamed from: i */
    public void mo10692i(View view, boolean z) {
    }

    @Override // android.media.ViviTV.adapters.RecyclerAdapterPTR.InterfaceC1980f
    /* JADX INFO: renamed from: j0 */
    public boolean mo9933j0() {
        return true;
    }

    @Override // cn.dolit.twowayviewlib.viewholders.BaseRecyclerViewHolder
    /* JADX INFO: renamed from: o */
    public boolean mo14302o() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
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
