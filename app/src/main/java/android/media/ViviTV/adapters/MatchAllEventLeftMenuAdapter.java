package android.media.ViviTV.adapters;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p000.C0389Fx;

/* JADX INFO: loaded from: classes.dex */
public class MatchAllEventLeftMenuAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    /* JADX INFO: renamed from: a */
    public List<C0389Fx> f5703a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1964c f5704b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1965d f5705c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f5706d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f5707e;

    public static class ItemViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public TextView f5708a;

        /* JADX WARN: Invalid debug info offset */
        public ItemViewHolder(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.MatchAllEventLeftMenuAdapter$a */
    public class ViewOnClickListenerC1962a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5709a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MatchAllEventLeftMenuAdapter f5710b;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC1962a(MatchAllEventLeftMenuAdapter matchAllEventLeftMenuAdapter, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.MatchAllEventLeftMenuAdapter$b */
    public class ViewOnFocusChangeListenerC1963b implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ItemViewHolder f5711a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f5712b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ MatchAllEventLeftMenuAdapter f5713c;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnFocusChangeListenerC1963b(MatchAllEventLeftMenuAdapter matchAllEventLeftMenuAdapter, ItemViewHolder itemViewHolder, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.MatchAllEventLeftMenuAdapter$c */
    public interface InterfaceC1964c {
        /* JADX INFO: renamed from: a */
        void mo9960a(int i);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.MatchAllEventLeftMenuAdapter$d */
    public interface InterfaceC1965d {
        /* JADX INFO: renamed from: a */
        void mo9961a(int i, boolean z);
    }

    /* JADX WARN: Invalid debug info offset */
    public MatchAllEventLeftMenuAdapter(Context context, List<C0389Fx> list, InterfaceC1964c interfaceC1964c, InterfaceC1965d interfaceC1965d) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC1964c m10612d(MatchAllEventLeftMenuAdapter matchAllEventLeftMenuAdapter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ ColorStateList m10613h(MatchAllEventLeftMenuAdapter matchAllEventLeftMenuAdapter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ ColorStateList m10614i(MatchAllEventLeftMenuAdapter matchAllEventLeftMenuAdapter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InterfaceC1965d m10615j(MatchAllEventLeftMenuAdapter matchAllEventLeftMenuAdapter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final void m10616k(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public void m10617l(@NonNull ItemViewHolder itemViewHolder, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    /* JADX INFO: renamed from: m */
    public ItemViewHolder m10618m(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }
}
