package cn.dolit.twowayviewlib.adapters;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cn.dolit.twowayviewlib.viewholders.BaseRecyclerViewHolder;
import java.util.List;
import org.lucasr.twowayview.widget.ShimmerImageView;
import org.lucasr.twowayview.widget.TwoWayView;
import p000.AbstractC5157p6;
import p000.InterfaceC0700Kq;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseSpannableRecyclerViewAdapter extends RecyclerView.Adapter<BaseRecyclerViewHolder> implements View.OnFocusChangeListener, View.OnKeyListener, InterfaceC0700Kq {

    /* JADX INFO: renamed from: r */
    public static final boolean f10435r = true;

    /* JADX INFO: renamed from: a */
    public Context f10436a;

    /* JADX INFO: renamed from: b */
    public TwoWayView f10437b;

    /* JADX INFO: renamed from: c */
    public List<AbstractC5157p6> f10438c;

    /* JADX INFO: renamed from: d */
    public Rect f10439d;

    /* JADX INFO: renamed from: e */
    public Rect f10440e;

    /* JADX INFO: renamed from: f */
    public Rect f10441f;

    /* JADX INFO: renamed from: g */
    public int f10442g;

    /* JADX INFO: renamed from: h */
    public int[] f10443h;

    /* JADX INFO: renamed from: i */
    public int[] f10444i;

    /* JADX INFO: renamed from: j */
    public View f10445j;

    /* JADX INFO: renamed from: k */
    public ShimmerImageView f10446k;

    /* JADX INFO: renamed from: l */
    public InterfaceC3069b f10447l;

    /* JADX INFO: renamed from: m */
    public boolean f10448m;

    /* JADX INFO: renamed from: n */
    public InterfaceC3068a f10449n;

    /* JADX INFO: renamed from: o */
    public long f10450o;

    /* JADX INFO: renamed from: p */
    public SparseArray<Float> f10451p;

    /* JADX INFO: renamed from: q */
    public boolean f10452q;

    /* JADX INFO: renamed from: cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter$a */
    public interface InterfaceC3068a {
        /* JADX INFO: renamed from: a */
        void mo12046a(View view);

        /* JADX INFO: renamed from: b */
        void mo12047b(View view);

        /* JADX INFO: renamed from: c */
        boolean mo12048c(View view);
    }

    /* JADX INFO: renamed from: cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter$b */
    public interface InterfaceC3069b {
        /* JADX INFO: renamed from: a */
        void mo12049a(BaseSpannableRecyclerViewAdapter baseSpannableRecyclerViewAdapter);
    }

    /* JADX WARN: Invalid debug info offset */
    public BaseSpannableRecyclerViewAdapter(Context context, TwoWayView twoWayView, List<AbstractC5157p6> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final void m16724d(View view, float f) {
    }

    /* JADX INFO: renamed from: e */
    public void mo3291e(View view, int i) {
    }

    /* JADX INFO: renamed from: f */
    public void mo3292f(int i) {
    }

    /* JADX INFO: renamed from: g */
    public boolean mo3293g(boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public void m16725h(List<AbstractC5157p6> list) {
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo10538i(BaseRecyclerViewHolder baseRecyclerViewHolder, int i);

    /* JADX INFO: renamed from: j */
    public abstract BaseRecyclerViewHolder mo10539j(ViewGroup viewGroup, int i);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public AbstractC5157p6 m16726k(int i) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public void mo10540l() {
    }

    /* JADX INFO: renamed from: m */
    public boolean mo10541m(View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public boolean m16727n() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public void m16728o() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public final void m16729p(BaseRecyclerViewHolder baseRecyclerViewHolder, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public final BaseRecyclerViewHolder m16730q(ViewGroup viewGroup, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public boolean m16731r(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public void m16732s(InterfaceC3069b interfaceC3069b) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public void m16733t(InterfaceC3068a interfaceC3068a) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public void m16734u() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public void m16735v(boolean z) {
    }
}
