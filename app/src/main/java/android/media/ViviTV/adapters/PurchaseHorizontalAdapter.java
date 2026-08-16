package android.media.ViviTV.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p000.C1117RL;

/* JADX INFO: loaded from: classes.dex */
public class PurchaseHorizontalAdapter extends RecyclerView.Adapter<VideoHolderRv> implements View.OnFocusChangeListener, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public Context f5753a;

    /* JADX INFO: renamed from: b */
    public List<C1117RL> f5754b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1974a f5755c;

    public static class VideoHolderRv extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public TextView f5756a;

        /* JADX INFO: renamed from: b */
        public TextView f5757b;

        /* JADX WARN: Invalid debug info offset */
        public VideoHolderRv(View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public void m10646k(C1117RL c1117rl) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.PurchaseHorizontalAdapter$a */
    public interface InterfaceC1974a {
        /* JADX INFO: renamed from: a */
        void mo10015a(int i, C1117RL c1117rl);
    }

    /* JADX WARN: Invalid debug info offset */
    public PurchaseHorizontalAdapter(Context context, List<C1117RL> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final boolean m10642d(View view) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public void m10643h(VideoHolderRv videoHolderRv, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public VideoHolderRv m10644i(ViewGroup viewGroup, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public void m10645j(InterfaceC1974a interfaceC1974a) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return null;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
    }
}
