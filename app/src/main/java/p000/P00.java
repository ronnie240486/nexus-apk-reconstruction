package p000;

import android.app.Fragment;
import android.media.ViviTV.activity.SearchActivityV3;
import android.media.ViviTV.adapters.VideoFileListAdapter;
import android.media.ViviTV.databinding.FragmentVideoFileListBinding;
import android.media.ViviTV.model.persistent.VodRecode;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class P00 extends Fragment implements SearchActivityV3.InterfaceC1893a, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public FragmentVideoFileListBinding f2431a;

    /* JADX INFO: renamed from: b */
    public VideoFileListAdapter f2432b;

    /* JADX INFO: renamed from: c */
    public RecyclerView.AdapterDataObserver f2433c;

    /* JADX INFO: renamed from: d */
    public RecyclerView.OnScrollListener f2434d;

    /* JADX INFO: renamed from: P00$a */
    public class C0967a extends RecyclerView.AdapterDataObserver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ P00 f2435a;

        /* JADX WARN: Invalid debug info offset */
        public C0967a(P00 p00) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: P00$c */
    public class AsyncTaskC0969c extends AsyncTask<Void, Integer, VodRecode> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ N00 f2438a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ P00 f2439b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC0969c(P00 p00, N00 n00) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public VodRecode m4363a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m4364b(VodRecode vodRecode) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ VodRecode doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(VodRecode vodRecode) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m4353b(P00 p00, View view, MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ FragmentVideoFileListBinding m4354c(P00 p00) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m4355d(P00 p00) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.SearchActivityV3.InterfaceC1893a
    /* JADX INFO: renamed from: a */
    public void mo4356a(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public void m4357e(List<Pair<String, String>> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public final void m4358f() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public final void m4359g() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean m4360h(View view, MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public void m4361i() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final void m4362j() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Fragment
    public void onDestroy() {
    }

    /* JADX INFO: renamed from: P00$b */
    public class C0968b extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a */
        public boolean f2436a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ P00 f2437b;

        /* JADX WARN: Invalid debug info offset */
        public C0968b(P00 p00) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
        }
    }
}
