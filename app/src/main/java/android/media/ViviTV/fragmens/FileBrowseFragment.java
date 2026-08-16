package android.media.ViviTV.fragmens;

import android.media.ViviTV.adapters.BaseRecyclerViewAdapter;
import android.media.ViviTV.adapters.FileListAdapterRv;
import android.media.ViviTV.databinding.FragmentFileBrowseBinding;
import android.os.Bundle;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import p000.C4242dj;
import p000.C5599vZ;

/* JADX INFO: loaded from: classes.dex */
public abstract class FileBrowseFragment extends Fragment implements BaseRecyclerViewAdapter.InterfaceC1942b<C4242dj> {

    /* JADX INFO: renamed from: e */
    public static final List<C4242dj> f8131e = new ArrayList();

    /* JADX INFO: renamed from: a */
    public C5599vZ f8132a;

    /* JADX INFO: renamed from: b */
    public FileListAdapterRv f8133b;

    /* JADX INFO: renamed from: c */
    public C4242dj f8134c;

    /* JADX INFO: renamed from: d */
    public FragmentFileBrowseBinding f8135d;

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G0 */
    private void m12265G0() {
    }

    /* JADX INFO: renamed from: D0 */
    public abstract void mo12266D0(C4242dj c4242dj);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E0 */
    public boolean m12267E0(int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F0 */
    public boolean m12268F0(int i, C4242dj c4242dj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.BaseRecyclerViewAdapter.InterfaceC1942b
    /* JADX INFO: renamed from: H */
    public /* bridge */ /* synthetic */ boolean mo10273H(int i, C4242dj c4242dj) {
        return false;
    }

    /* JADX INFO: renamed from: H0 */
    public boolean mo12269H0() {
        return true;
    }

    /* JADX INFO: renamed from: I0 */
    public abstract List<C4242dj> mo12270I0(C4242dj c4242dj);

    /* JADX INFO: renamed from: J0 */
    public abstract Pair<C4242dj, List<C4242dj>> mo12271J0(C4242dj c4242dj);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public void m12272K0(C5599vZ c5599vZ) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }
}
