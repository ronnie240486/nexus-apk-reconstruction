package android.media.ViviTV.view;

import android.content.Context;
import android.media.ViviTV.adapters.BaseRecyclerViewAdapter;
import android.media.ViviTV.adapters.FilterAdapter;
import android.media.ViviTV.databinding.FilterRecyclerViewLineBinding;
import android.media.ViviTV.databinding.LayoutFilterV2Binding;
import android.media.view.FilterLayout;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class FilterLayoutV2 extends FrameLayout implements BaseRecyclerViewAdapter.InterfaceC1943c<InterfaceC2329e> {

    /* JADX INFO: renamed from: m */
    public static final String f9716m = "FilterLayoutV2";

    /* JADX INFO: renamed from: n */
    public static Comparator<Pair<Integer, InterfaceC2329e>> f9717n = new C2325a();

    /* JADX INFO: renamed from: a */
    public LayoutFilterV2Binding f9718a;

    /* JADX INFO: renamed from: b */
    public SparseArray<Pair<Integer, InterfaceC2329e>> f9719b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2330f f9720c;

    /* JADX INFO: renamed from: d */
    public InterfaceC2329e f9721d;

    /* JADX INFO: renamed from: e */
    public boolean f9722e;

    /* JADX INFO: renamed from: f */
    public List<List<InterfaceC2329e>> f9723f;

    /* JADX INFO: renamed from: g */
    public List<C2328d> f9724g;

    /* JADX INFO: renamed from: h */
    public InterfaceC2331g f9725h;

    /* JADX INFO: renamed from: i */
    public FilterLayout.InterfaceC2390j f9726i;

    /* JADX INFO: renamed from: j */
    public List<FilterLayout.C2387g> f9727j;

    /* JADX INFO: renamed from: k */
    public View.OnKeyListener f9728k;

    /* JADX INFO: renamed from: l */
    public View.OnKeyListener f9729l;

    /* JADX INFO: renamed from: android.media.ViviTV.view.FilterLayoutV2$a */
    public class C2325a implements Comparator<Pair<Integer, InterfaceC2329e>> {
        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public int m14272a(Pair<Integer, InterfaceC2329e> pair, Pair<Integer, InterfaceC2329e> pair2) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Pair<Integer, InterfaceC2329e> pair, Pair<Integer, InterfaceC2329e> pair2) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.view.FilterLayoutV2$b */
    public class ViewOnKeyListenerC2326b implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FilterLayoutV2 f9730a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC2326b(FilterLayoutV2 filterLayoutV2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.view.FilterLayoutV2$c */
    public class ViewOnKeyListenerC2327c implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FilterLayoutV2 f9731a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC2327c(FilterLayoutV2 filterLayoutV2) {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.view.FilterLayoutV2$d */
    public static class C2328d {

        /* JADX INFO: renamed from: a */
        public int f9732a;

        /* JADX INFO: renamed from: b */
        public List<InterfaceC2329e> f9733b;

        /* JADX INFO: renamed from: c */
        public FilterRecyclerViewLineBinding f9734c;

        /* JADX WARN: Invalid debug info offset */
        public C2328d(int i, List<InterfaceC2329e> list, FilterRecyclerViewLineBinding filterRecyclerViewLineBinding) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.view.FilterLayoutV2$e */
    public interface InterfaceC2329e {
        /* JADX INFO: renamed from: b */
        String mo2b();

        /* JADX INFO: renamed from: e */
        List<InterfaceC2329e> mo5e();

        /* JADX INFO: renamed from: g */
        String mo7g();
    }

    /* JADX INFO: renamed from: android.media.ViviTV.view.FilterLayoutV2$f */
    public interface InterfaceC2330f {
        /* JADX INFO: renamed from: e0 */
        void mo12288e0(List<InterfaceC2329e> list);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.view.FilterLayoutV2$g */
    public interface InterfaceC2331g {
        /* JADX INFO: renamed from: l */
        List<InterfaceC2329e> mo12623l(C2328d c2328d, InterfaceC2329e interfaceC2329e);
    }

    /* JADX WARN: Invalid debug info offset */
    public FilterLayoutV2(@NonNull Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public FilterLayoutV2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public FilterLayoutV2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @RequiresApi(api = 21)
    public FilterLayoutV2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ List m14255a(FilterLayoutV2 filterLayoutV2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m14256b(FilterLayoutV2 filterLayoutV2, View view) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ FilterLayout.InterfaceC2390j m14257c(FilterLayoutV2 filterLayoutV2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ LayoutFilterV2Binding m14258d(FilterLayoutV2 filterLayoutV2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static void m14259e(RecyclerView recyclerView, List<InterfaceC2329e> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    private void m14260n() {
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    /* JADX INFO: renamed from: f */
    public final FilterAdapter m14261f(List<InterfaceC2329e> list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public InterfaceC2331g m14262g() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final Map<String, FilterLayout.InterfaceC2388h> m14263h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public FilterLayout.InterfaceC2390j m14264i() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    /* JADX INFO: renamed from: j */
    public final FilterRecyclerViewLineBinding m14265j() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public Map<String, FilterLayout.InterfaceC2388h> m14266k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public boolean m14267l(View view, int i, InterfaceC2329e interfaceC2329e) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public final void m14268m() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public void m14269o() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.BaseRecyclerViewAdapter.InterfaceC1943c
    /* JADX INFO: renamed from: o0 */
    public /* bridge */ /* synthetic */ boolean mo10456o0(View view, int i, InterfaceC2329e interfaceC2329e) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public final boolean m14270p(View view) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public final void m14271q() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCallback(InterfaceC2330f interfaceC2330f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setConditionBundleList(List<FilterLayout.C2387g> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDataLoadCallback(InterfaceC2331g interfaceC2331g) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setExtraHeaderItem(InterfaceC2329e interfaceC2329e) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setFilterItems(List<InterfaceC2329e> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setFilterItems(List<InterfaceC2329e> list, List<InterfaceC2329e> list2, List<InterfaceC2329e> list3) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setFilterItemsAllLevel(List<List<InterfaceC2329e>> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setFilterLayoutListener(FilterLayout.InterfaceC2390j interfaceC2390j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setForbiddenFocusOutBounds(boolean z) {
    }
}
