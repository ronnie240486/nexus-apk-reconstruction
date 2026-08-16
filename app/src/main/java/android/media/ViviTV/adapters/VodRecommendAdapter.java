package android.media.ViviTV.adapters;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p000.R00;

/* JADX INFO: loaded from: classes.dex */
public class VodRecommendAdapter extends RecyclerView.Adapter<ViewHolderVodRecommend> implements View.OnFocusChangeListener, View.OnKeyListener, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public Context f5851a;

    /* JADX INFO: renamed from: b */
    public List<R00> f5852b;

    /* JADX INFO: renamed from: c */
    public ViewOnKeyListenerC1991b.b f5853c;

    public static class ViewHolderVodRecommend extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public ImageView f5854a;

        /* JADX INFO: renamed from: b */
        public TextView f5855b;

        /* JADX INFO: renamed from: c */
        public ImageView f5856c;

        /* JADX WARN: Invalid debug info offset */
        public ViewHolderVodRecommend(View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public void m10750k(R00 r00) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public VodRecommendAdapter(Context context, List<R00> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    private boolean m10746d(View view) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public void m10747h(ViewHolderVodRecommend viewHolderVodRecommend, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public ViewHolderVodRecommend m10748i(ViewGroup viewGroup, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public void m10749j(ViewOnKeyListenerC1991b.b bVar) {
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

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        return false;
    }
}
