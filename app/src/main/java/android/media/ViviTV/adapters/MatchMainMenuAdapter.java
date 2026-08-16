package android.media.ViviTV.adapters;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p000.C0772Lx;

/* JADX INFO: loaded from: classes.dex */
public class MatchMainMenuAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    /* JADX INFO: renamed from: a */
    public final List<C0772Lx> f5723a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1969d f5724b;

    /* JADX INFO: renamed from: c */
    public int f5725c;

    public static class ItemViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public TextView f5726a;

        /* JADX INFO: renamed from: b */
        public TextView f5727b;

        /* JADX INFO: renamed from: c */
        public ImageView f5728c;

        /* JADX INFO: renamed from: d */
        public ImageView f5729d;

        /* JADX INFO: renamed from: e */
        public ImageView f5730e;

        /* JADX INFO: renamed from: f */
        public TextView f5731f;

        /* JADX INFO: renamed from: g */
        public TextView f5732g;

        /* JADX INFO: renamed from: h */
        public TextView f5733h;

        /* JADX INFO: renamed from: i */
        public ImageView f5734i;

        /* JADX WARN: Invalid debug info offset */
        public ItemViewHolder(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.MatchMainMenuAdapter$a */
    public class ViewOnClickListenerC1966a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ItemViewHolder f5735a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MatchMainMenuAdapter f5736b;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC1966a(MatchMainMenuAdapter matchMainMenuAdapter, ItemViewHolder itemViewHolder) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.MatchMainMenuAdapter$b */
    public class ViewOnKeyListenerC1967b implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ItemViewHolder f5737a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MatchMainMenuAdapter f5738b;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC1967b(MatchMainMenuAdapter matchMainMenuAdapter, ItemViewHolder itemViewHolder) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.MatchMainMenuAdapter$c */
    public class ViewOnFocusChangeListenerC1968c implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ItemViewHolder f5739a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MatchMainMenuAdapter f5740b;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnFocusChangeListenerC1968c(MatchMainMenuAdapter matchMainMenuAdapter, ItemViewHolder itemViewHolder) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.MatchMainMenuAdapter$d */
    public interface InterfaceC1969d {
        /* JADX INFO: renamed from: a */
        void mo9962a(int i);

        /* JADX INFO: renamed from: b */
        void mo9963b(int i);

        /* JADX INFO: renamed from: c */
        void mo9964c(View view, int i, KeyEvent keyEvent, int i2);
    }

    /* JADX WARN: Invalid debug info offset */
    public MatchMainMenuAdapter(List<C0772Lx> list, InterfaceC1969d interfaceC1969d) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC1969d m10623d(MatchMainMenuAdapter matchMainMenuAdapter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m10624h(MatchMainMenuAdapter matchMainMenuAdapter) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ int m10625i(MatchMainMenuAdapter matchMainMenuAdapter, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: j */
    public static java.lang.String m10626j(java.lang.String r3) {
        /*
            r0 = 0
            return r0
        L17:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.adapters.MatchMainMenuAdapter.m10626j(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public void m10627k(@NonNull ItemViewHolder itemViewHolder, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    /* JADX INFO: renamed from: l */
    public ItemViewHolder m10628l(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public final String m10629m(String str) {
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
