package android.media.ViviTV.fragmens;

import android.media.ViviTV.model.persistent.LiveChannelInfo;
import android.media.ViviTV.model.persistent.LiveTypeInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.List;
import p000.C0124Bv;
import p000.DialogC1326Uc;

/* JADX INFO: loaded from: classes.dex */
public class ChannelListFragment extends Fragment {

    /* JADX INFO: renamed from: a */
    public View f8003a;

    /* JADX INFO: renamed from: b */
    public ListView f8004b;

    /* JADX INFO: renamed from: c */
    public ListView f8005c;

    /* JADX INFO: renamed from: d */
    public TextView f8006d;

    /* JADX INFO: renamed from: e */
    public C0124Bv f8007e;

    /* JADX INFO: renamed from: f */
    public List<LiveTypeInfo> f8008f;

    /* JADX INFO: renamed from: g */
    public HashMap<String, Integer> f8009g;

    /* JADX INFO: renamed from: h */
    public int f8010h;

    /* JADX INFO: renamed from: i */
    public DialogC1326Uc f8011i;

    /* JADX INFO: renamed from: j */
    public InterfaceC2022d f8012j;

    /* JADX INFO: renamed from: k */
    public String f8013k;

    /* JADX INFO: renamed from: l */
    public int f8014l;

    /* JADX INFO: renamed from: m */
    public List<LiveChannelInfo> f8015m;

    /* JADX INFO: renamed from: n */
    public List<LiveChannelInfo> f8016n;

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.ChannelListFragment$a */
    public class C2019a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ChannelListFragment f8017a;

        /* JADX WARN: Invalid debug info offset */
        public C2019a(ChannelListFragment channelListFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.ChannelListFragment$b */
    public class C2020b implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ChannelListFragment f8018a;

        /* JADX WARN: Invalid debug info offset */
        public C2020b(ChannelListFragment channelListFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.ChannelListFragment$c */
    public class C2021c implements DialogC1326Uc.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ChannelListFragment f8019a;

        /* JADX WARN: Invalid debug info offset */
        public C2021c(ChannelListFragment channelListFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.DialogC1326Uc.e
        /* JADX INFO: renamed from: a */
        public void mo933a(DialogC1326Uc dialogC1326Uc, View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.ChannelListFragment$d */
    public interface InterfaceC2022d {
        /* JADX INFO: renamed from: a */
        void mo12129a(LiveChannelInfo liveChannelInfo);

        /* JADX INFO: renamed from: b */
        void mo12130b(LiveTypeInfo liveTypeInfo);

        /* JADX INFO: renamed from: c */
        void mo12131c(LiveTypeInfo liveTypeInfo);

        /* JADX INFO: renamed from: d */
        boolean mo12132d(LiveTypeInfo liveTypeInfo);
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m12115D0(ChannelListFragment channelListFragment, LiveTypeInfo liveTypeInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ InterfaceC2022d m12116E0(ChannelListFragment channelListFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m12117F0(ChannelListFragment channelListFragment, LiveTypeInfo liveTypeInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G0 */
    private void m12118G0(List<LiveTypeInfo> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H0 */
    private final void m12119H0(LiveTypeInfo liveTypeInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J0 */
    private void m12120J0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    private void m12121P0(ListView listView, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I0 */
    public final void m12122I0(LiveTypeInfo liveTypeInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public void m12123K0(String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public void m12124L0(String str, int i, boolean z, boolean z2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M0 */
    public void m12125M0(String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    public void m12126N0(InterfaceC2022d interfaceC2022d) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O0 */
    public final void m12127O0(ListView listView, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public final void m12128Q0(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
    }
}
