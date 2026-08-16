package android.media.ViviTV.adapters;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p000.C4289eT;

/* JADX INFO: loaded from: classes.dex */
public class StarListAdapter extends RecyclerView.Adapter<C1988d> implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public Context f5801a;

    /* JADX INFO: renamed from: b */
    public List<C4289eT> f5802b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1987c f5803c;

    /* JADX INFO: renamed from: d */
    public View.OnClickListener f5804d;

    /* JADX INFO: renamed from: e */
    public View.OnKeyListener f5805e;

    /* JADX INFO: renamed from: f */
    public View.OnClickListener f5806f;

    /* JADX INFO: renamed from: g */
    public View.OnKeyListener f5807g;

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.StarListAdapter$a */
    public class ViewOnClickListenerC1985a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ StarListAdapter f5808a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC1985a(StarListAdapter starListAdapter) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.StarListAdapter$b */
    public class ViewOnKeyListenerC1986b implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ StarListAdapter f5809a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC1986b(StarListAdapter starListAdapter) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.StarListAdapter$c */
    public interface InterfaceC1987c {
        /* JADX INFO: renamed from: I */
        void mo9847I(View view, boolean z);

        /* JADX INFO: renamed from: M */
        void mo9848M(int i, C4289eT c4289eT);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.StarListAdapter$d */
    public class C1988d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public C4289eT f5810a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ StarListAdapter f5811b;

        /* JADX WARN: Invalid debug info offset */
        public C1988d(StarListAdapter starListAdapter, View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public static /* synthetic */ C4289eT m10707k(C1988d c1988d) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: l */
        public void m10708l(C4289eT c4289eT) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public StarListAdapter(Context context, List<C4289eT> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC1987c m10700d(StarListAdapter starListAdapter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ View.OnKeyListener m10701h(StarListAdapter starListAdapter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public void m10702i(C1988d c1988d, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public C1988d m10703j(ViewGroup viewGroup, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public void m10704k(InterfaceC1987c interfaceC1987c) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public void m10705l(View.OnClickListener onClickListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public void m10706m(View.OnKeyListener onKeyListener) {
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
}
