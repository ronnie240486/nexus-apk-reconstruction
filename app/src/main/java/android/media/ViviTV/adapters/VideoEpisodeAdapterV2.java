package android.media.ViviTV.adapters;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import p000.C0928OP;
import p000.C6020o10;
import p000.InterfaceC1394Vc;

/* JADX INFO: loaded from: classes.dex */
public class VideoEpisodeAdapterV2 extends RecyclerView.Adapter<ViewHolderEpisode> implements View.OnFocusChangeListener, View.OnKeyListener, View.OnClickListener {

    /* JADX INFO: renamed from: l */
    public static String f5815l;

    /* JADX INFO: renamed from: a */
    public Context f5816a;

    /* JADX INFO: renamed from: b */
    public List<C6020o10> f5817b;

    /* JADX INFO: renamed from: c */
    public View f5818c;

    /* JADX INFO: renamed from: d */
    public int f5819d;

    /* JADX INFO: renamed from: e */
    public InterfaceC1394Vc<ViewHolderEpisode> f5820e;

    /* JADX INFO: renamed from: f */
    public int f5821f;

    /* JADX INFO: renamed from: g */
    public int f5822g;

    /* JADX INFO: renamed from: h */
    public String f5823h;

    /* JADX INFO: renamed from: i */
    public int f5824i;

    /* JADX INFO: renamed from: j */
    public int f5825j;

    /* JADX INFO: renamed from: k */
    public HashMap<Integer, WeakReference<ViewHolderEpisode>> f5826k;

    public static class ViewHolderEpisode extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public TextView f5827a;

        /* JADX INFO: renamed from: b */
        public TextView f5828b;

        /* JADX INFO: renamed from: c */
        public ImageView f5829c;

        /* JADX INFO: renamed from: d */
        public View f5830d;

        /* JADX INFO: renamed from: android.media.ViviTV.adapters.VideoEpisodeAdapterV2$ViewHolderEpisode$a */
        public class ViewTreeObserverOnPreDrawListenerC1989a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ViewHolderEpisode f5831a;

            /* JADX WARN: Invalid debug info offset */
            public ViewTreeObserverOnPreDrawListenerC1989a(ViewHolderEpisode viewHolderEpisode) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                return false;
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public ViewHolderEpisode(View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public static /* synthetic */ TextView m10723k(ViewHolderEpisode viewHolderEpisode) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: l */
        public void m10724l(C6020o10 c6020o10) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: m */
        public TextView m10725m() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: n */
        public TextView m10726n() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: o */
        public void m10727o(int i) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public VideoEpisodeAdapterV2(Context context, List<C6020o10> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    public VideoEpisodeAdapterV2(Context context, List<C6020o10> list, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public VideoEpisodeAdapterV2(Context context, List<C0928OP.a> list, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    private void m10712j() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    private void m10713n(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public void m10714d() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public View m10715h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public int m10716i() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public void m10717k(ViewHolderEpisode viewHolderEpisode, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public ViewHolderEpisode m10718l(ViewGroup viewGroup, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public void m10719m(@NonNull ViewHolderEpisode viewHolderEpisode) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public void m10720o(List<C0928OP.a> list) {
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
    public /* bridge */ /* synthetic */ void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public void m10721p(InterfaceC1394Vc<ViewHolderEpisode> interfaceC1394Vc) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public void m10722q(int i, String str) {
    }
}
