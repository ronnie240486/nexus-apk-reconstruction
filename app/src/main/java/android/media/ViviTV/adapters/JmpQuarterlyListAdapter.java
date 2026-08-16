package android.media.ViviTV.adapters;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import p000.C0928OP;

/* JADX INFO: loaded from: classes.dex */
public class JmpQuarterlyListAdapter extends RecyclerView.Adapter<ViewHolderJmpLabel> implements View.OnClickListener, View.OnKeyListener, View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public Context f5678a;

    /* JADX INFO: renamed from: b */
    public List<C0928OP> f5679b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1956a f5680c;

    /* JADX INFO: renamed from: d */
    public int f5681d;

    /* JADX INFO: renamed from: e */
    public int f5682e;

    /* JADX INFO: renamed from: f */
    public int f5683f;

    /* JADX INFO: renamed from: g */
    public HashMap<Integer, WeakReference<ViewHolderJmpLabel>> f5684g;

    public static class ViewHolderJmpLabel extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public TextView f5685a;

        /* JADX WARN: Invalid debug info offset */
        public ViewHolderJmpLabel(View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public void m10584k(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: l */
        public TextView m10585l() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: m */
        public void m10586m(int i) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.JmpQuarterlyListAdapter$a */
    public interface InterfaceC1956a {
        /* JADX INFO: renamed from: C0 */
        void mo10587C0(int i);

        /* JADX INFO: renamed from: q0 */
        void mo10588q0(int i);
    }

    /* JADX WARN: Invalid debug info offset */
    public JmpQuarterlyListAdapter(Context context, List<C0928OP> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public void m10578d(ViewHolderJmpLabel viewHolderJmpLabel, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public ViewHolderJmpLabel m10579h(ViewGroup viewGroup, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public void m10580i(@NonNull ViewHolderJmpLabel viewHolderJmpLabel) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final void m10581j(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public void m10582k(InterfaceC1956a interfaceC1956a) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public void m10583l(int i) {
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
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onViewRecycled(@NonNull RecyclerView.ViewHolder viewHolder) {
    }
}
