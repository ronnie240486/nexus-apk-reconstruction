package android.media.ViviTV.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import me.itangqi.waveloadingview.WaveLoadingView;
import p000.C3053ch;

/* JADX INFO: loaded from: classes.dex */
public class EbookGalleryRecycleAdapter extends RecyclerView.Adapter<ebookRecycleViewHolder> {

    /* JADX INFO: renamed from: a */
    public Context f5584a;

    /* JADX INFO: renamed from: b */
    public ArrayList<C3053ch> f5585b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1945a f5586c;

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.EbookGalleryRecycleAdapter$a */
    public interface InterfaceC1945a {
        /* JADX INFO: renamed from: U */
        void mo10466U(View view, C3053ch c3053ch);
    }

    public class ebookRecycleViewHolder extends RecyclerView.ViewHolder implements View.OnLongClickListener, View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public ImageView f5587a;

        /* JADX INFO: renamed from: b */
        public TextView f5588b;

        /* JADX INFO: renamed from: c */
        public WaveLoadingView f5589c;

        /* JADX INFO: renamed from: d */
        public C3053ch f5590d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ EbookGalleryRecycleAdapter f5591e;

        /* JADX WARN: Invalid debug info offset */
        public ebookRecycleViewHolder(EbookGalleryRecycleAdapter ebookGalleryRecycleAdapter, View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public static /* synthetic */ TextView m10467k(ebookRecycleViewHolder ebookrecycleviewholder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: l */
        public static /* synthetic */ ImageView m10468l(ebookRecycleViewHolder ebookrecycleviewholder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: m */
        public C3053ch m10469m() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: n */
        public void m10470n() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: o */
        public void m10471o(C3053ch c3053ch) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: p */
        public void m10472p(double d) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC1945a m10460d(EbookGalleryRecycleAdapter ebookGalleryRecycleAdapter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ ArrayList m10461h(EbookGalleryRecycleAdapter ebookGalleryRecycleAdapter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public void m10462i(@NonNull ebookRecycleViewHolder ebookrecycleviewholder, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    /* JADX INFO: renamed from: j */
    public ebookRecycleViewHolder m10463j(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public void m10464k(ArrayList<C3053ch> arrayList) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public void m10465l(InterfaceC1945a interfaceC1945a) {
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
