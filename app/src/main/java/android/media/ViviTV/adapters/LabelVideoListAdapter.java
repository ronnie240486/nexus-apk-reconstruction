package android.media.ViviTV.adapters;

import android.content.Context;
import android.os.AsyncTask;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p000.InterfaceC0055Aq;
import p000.InterfaceC1340Uq;
import p000.R00;
import p000.W00;
import p000.X00;

/* JADX INFO: loaded from: classes.dex */
public class LabelVideoListAdapter extends RecyclerView.Adapter<VideoInfoViewHolder> implements View.OnKeyListener, InterfaceC1340Uq, View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public Context f5686a;

    /* JADX INFO: renamed from: b */
    public List<R00> f5687b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0055Aq f5688c;

    /* JADX INFO: renamed from: d */
    public int f5689d;

    /* JADX INFO: renamed from: e */
    public InterfaceC1960d f5690e;

    /* JADX INFO: renamed from: f */
    public boolean f5691f;

    /* JADX INFO: renamed from: g */
    public InterfaceC1961e f5692g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f5693h;

    /* JADX INFO: renamed from: i */
    public W00 f5694i;

    /* JADX INFO: renamed from: j */
    public X00 f5695j;

    /* JADX INFO: renamed from: k */
    public int f5696k;

    /* JADX INFO: renamed from: l */
    public InterfaceC1959c f5697l;

    /* JADX INFO: renamed from: m */
    public View.OnClickListener f5698m;

    public static class VideoInfoViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public InterfaceC1959c f5699a;

        /* JADX WARN: Invalid debug info offset */
        public VideoInfoViewHolder(View view, InterfaceC1959c interfaceC1959c) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public void m10608k(R00 r00) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.LabelVideoListAdapter$a */
    public class AsyncTaskC1957a extends AsyncTask<Void, Boolean, List<R00>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5700a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LabelVideoListAdapter f5701b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1957a(LabelVideoListAdapter labelVideoListAdapter, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public List<R00> m10609a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m10610b(List<R00> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public void m10611c(List<R00> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ List<R00> doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onCancelled() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onCancelled(List<R00> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(List<R00> list) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.LabelVideoListAdapter$b */
    public class ViewOnClickListenerC1958b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LabelVideoListAdapter f5702a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC1958b(LabelVideoListAdapter labelVideoListAdapter) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.LabelVideoListAdapter$c */
    public interface InterfaceC1959c {
        /* JADX INFO: renamed from: J */
        void mo9918J(ImageView imageView, R00 r00);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.LabelVideoListAdapter$d */
    public interface InterfaceC1960d {
        /* JADX INFO: renamed from: a */
        void mo9879a(View view, boolean z);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.LabelVideoListAdapter$e */
    public interface InterfaceC1961e {
        /* JADX INFO: renamed from: a */
        void mo9889a();

        /* JADX INFO: renamed from: b */
        void mo9890b();

        /* JADX INFO: renamed from: c */
        void mo9891c(boolean z);
    }

    /* JADX WARN: Invalid debug info offset */
    public LabelVideoListAdapter(Context context, List<R00> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    public LabelVideoListAdapter(Context context, List<R00> list, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ W00 m10589d(LabelVideoListAdapter labelVideoListAdapter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ X00 m10590h(LabelVideoListAdapter labelVideoListAdapter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ X00 m10591i(LabelVideoListAdapter labelVideoListAdapter, X00 x00) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ boolean m10592j(LabelVideoListAdapter labelVideoListAdapter, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ InterfaceC1961e m10593k(LabelVideoListAdapter labelVideoListAdapter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Context m10594l(LabelVideoListAdapter labelVideoListAdapter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ List m10595m(LabelVideoListAdapter labelVideoListAdapter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ View.OnClickListener m10596n(LabelVideoListAdapter labelVideoListAdapter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1340Uq
    /* JADX INFO: renamed from: a */
    public int mo6389a() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1340Uq
    /* JADX INFO: renamed from: b */
    public void mo6390b() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1340Uq
    /* JADX INFO: renamed from: c */
    public void mo6391c(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public void m10597o(List<R00> list) {
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
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public void m10598p() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public R00 m10599q(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public void m10600r(VideoInfoViewHolder videoInfoViewHolder, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public VideoInfoViewHolder m10601s(ViewGroup viewGroup, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public void m10602t(InterfaceC1960d interfaceC1960d) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public void m10603u(InterfaceC1961e interfaceC1961e) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public void m10604v(View.OnClickListener onClickListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public void m10605w(InterfaceC0055Aq interfaceC0055Aq) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public void m10606x(W00 w00) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public void m10607y(InterfaceC1959c interfaceC1959c) {
    }
}
