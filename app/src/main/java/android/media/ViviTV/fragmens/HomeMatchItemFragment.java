package android.media.ViviTV.fragmens;

import android.content.Context;
import android.graphics.Rect;
import android.media.ViviTV.adapters.MatchMainMenuAdapter;
import android.media.ViviTV.databinding.FragmentHomeMatchItemBinding;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter;
import java.util.List;
import p000.C0772Lx;
import p000.C0997PS;
import p000.C1062QS;
import p000.C1124RS;

/* JADX INFO: loaded from: classes.dex */
public class HomeMatchItemFragment extends BaseHomeItemFragment implements View.OnClickListener, View.OnKeyListener {

    /* JADX INFO: renamed from: o */
    public FragmentHomeMatchItemBinding f8221o;

    /* JADX INFO: renamed from: p */
    public RecyclerView f8222p;

    /* JADX INFO: renamed from: q */
    public MatchMainMenuAdapter f8223q;

    /* JADX INFO: renamed from: r */
    public List<C0772Lx> f8224r;

    /* JADX INFO: renamed from: s */
    public List<C1062QS> f8225s;

    /* JADX INFO: renamed from: t */
    public List<View> f8226t;

    /* JADX INFO: renamed from: u */
    public List<C1124RS> f8227u;

    /* JADX INFO: renamed from: v */
    public ProgressBar f8228v;

    /* JADX INFO: renamed from: w */
    public boolean f8229w;

    /* JADX INFO: renamed from: x */
    public View f8230x;

    /* JADX INFO: renamed from: y */
    public final View.OnKeyListener f8231y;

    /* JADX INFO: renamed from: z */
    public final View.OnKeyListener f8232z;

    public static class ItemSpacingDecoration extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a */
        public final int f8233a;

        /* JADX WARN: Invalid debug info offset */
        public ItemSpacingDecoration(Context context, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public final int m12439a(Context context, int i) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeMatchItemFragment$a */
    public class C2073a implements MatchMainMenuAdapter.InterfaceC1969d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeMatchItemFragment f8234a;

        /* JADX WARN: Invalid debug info offset */
        public C2073a(HomeMatchItemFragment homeMatchItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.adapters.MatchMainMenuAdapter.InterfaceC1969d
        /* JADX INFO: renamed from: a */
        public void mo9962a(int i) {
        }

        @Override // android.media.ViviTV.adapters.MatchMainMenuAdapter.InterfaceC1969d
        /* JADX INFO: renamed from: b */
        public void mo9963b(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.adapters.MatchMainMenuAdapter.InterfaceC1969d
        /* JADX INFO: renamed from: c */
        public void mo9964c(View view, int i, KeyEvent keyEvent, int i2) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeMatchItemFragment$b */
    public class ViewOnClickListenerC2074b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeMatchItemFragment f8235a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC2074b(HomeMatchItemFragment homeMatchItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeMatchItemFragment$c */
    public class ViewOnClickListenerC2075c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeMatchItemFragment f8236a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC2075c(HomeMatchItemFragment homeMatchItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeMatchItemFragment$d */
    public class ViewOnClickListenerC2076d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeMatchItemFragment f8237a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC2076d(HomeMatchItemFragment homeMatchItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeMatchItemFragment$e */
    public class ViewOnKeyListenerC2077e implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeMatchItemFragment f8238a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC2077e(HomeMatchItemFragment homeMatchItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeMatchItemFragment$f */
    public class ViewOnFocusChangeListenerC2078f implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeMatchItemFragment f8239a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnFocusChangeListenerC2078f(HomeMatchItemFragment homeMatchItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeMatchItemFragment$g */
    public class C2079g implements C0997PS.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeMatchItemFragment f8240a;

        /* JADX WARN: Invalid debug info offset */
        public C2079g(HomeMatchItemFragment homeMatchItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C0997PS.e
        /* JADX INFO: renamed from: a */
        public void mo4453a(List<C1062QS> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C0997PS.d
        /* JADX INFO: renamed from: b */
        public void mo4452b(int i, String str) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeMatchItemFragment$h */
    public class C2080h implements C0997PS.g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeMatchItemFragment f8241a;

        /* JADX WARN: Invalid debug info offset */
        public C2080h(HomeMatchItemFragment homeMatchItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C0997PS.g
        /* JADX INFO: renamed from: a */
        public void mo4455a(List<C1124RS> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C0997PS.d
        /* JADX INFO: renamed from: b */
        public void mo4452b(int i, String str) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ boolean m12415C1(HomeMatchItemFragment homeMatchItemFragment, View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D1 */
    public static /* synthetic */ void m12416D1(HomeMatchItemFragment homeMatchItemFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E1 */
    public static /* synthetic */ boolean m12417E1(HomeMatchItemFragment homeMatchItemFragment, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F1 */
    public static /* synthetic */ List m12418F1(HomeMatchItemFragment homeMatchItemFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ View.OnKeyListener m12419G1(HomeMatchItemFragment homeMatchItemFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H1 */
    public static /* synthetic */ List m12420H1(HomeMatchItemFragment homeMatchItemFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ List m12421I1(HomeMatchItemFragment homeMatchItemFragment, List list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J1 */
    public static /* synthetic */ FragmentHomeMatchItemBinding m12422J1(HomeMatchItemFragment homeMatchItemFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K1 */
    public static /* synthetic */ View m12423K1(HomeMatchItemFragment homeMatchItemFragment, View view) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L1 */
    public static /* synthetic */ void m12424L1(HomeMatchItemFragment homeMatchItemFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M1 */
    public static /* synthetic */ void m12425M1(HomeMatchItemFragment homeMatchItemFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N1 */
    public static /* synthetic */ ProgressBar m12426N1(HomeMatchItemFragment homeMatchItemFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ void m12427O1(HomeMatchItemFragment homeMatchItemFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W1 */
    private void m12428W1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment, android.media.ViviTV.fragmens.BaseHomeStructuredFragment
    /* JADX INFO: renamed from: E0 */
    public void mo12011E0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P1 */
    public final void m12429P1(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q1 */
    public final void m12430Q1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R1 */
    public final void m12431R1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S1 */
    public final void m12432S1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T1 */
    public final void m12433T1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U1 */
    public final void m12434U1() {
    }

    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment
    /* JADX INFO: renamed from: V0 */
    public void mo12016V0(BaseSpannableRecyclerViewAdapter baseSpannableRecyclerViewAdapter) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V1 */
    public final void m12435V1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment
    /* JADX INFO: renamed from: X0 */
    public View mo11991X0(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X1 */
    public final void m12436X1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ boolean m12437Y1(View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z1 */
    public final void m12438Z1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment, androidx.fragment.app.Fragment
    public void onResume() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onStart() {
    }
}
