package android.media.ViviTV.fragmens;

import android.media.ViviTV.view.FilterLayoutV2;
import android.media.view.FilterLayout;
import android.os.AsyncTask;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.C0376Fk;
import p000.C1216Sv;

/* JADX INFO: loaded from: classes.dex */
public class SingleCategoryVideoListFragment extends BaseVideoListFragment implements FilterLayout.InterfaceC2390j, FilterLayoutV2.InterfaceC2331g {

    /* JADX INFO: renamed from: N */
    public static final String f8363N = "categoryId";

    /* JADX INFO: renamed from: O */
    public static final String f8364O = "area";

    /* JADX INFO: renamed from: P */
    public static final String f8365P = "item";

    /* JADX INFO: renamed from: Q */
    public static final String f8366Q = "year";

    /* JADX INFO: renamed from: R */
    public static final String f8367R = "sortOrder";

    /* JADX INFO: renamed from: S */
    public static final String f8368S = "sort";

    /* JADX INFO: renamed from: T */
    public static final boolean f8369T = false;

    /* JADX INFO: renamed from: G */
    public String f8370G;

    /* JADX INFO: renamed from: H */
    public String f8371H;

    /* JADX INFO: renamed from: I */
    public FilterLayoutV2 f8372I;

    /* JADX INFO: renamed from: J */
    public Map<String, FilterLayout.InterfaceC2388h> f8373J;

    /* JADX INFO: renamed from: K */
    public List<FilterLayout.C2387g> f8374K;

    /* JADX INFO: renamed from: L */
    public AsyncTask<Void, Void, C1216Sv> f8375L;

    /* JADX INFO: renamed from: M */
    public boolean f8376M;

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.SingleCategoryVideoListFragment$a */
    public class AsyncTaskC2108a extends AsyncTask<Void, Void, C1216Sv> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f8377a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SingleCategoryVideoListFragment f8378b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2108a(SingleCategoryVideoListFragment singleCategoryVideoListFragment, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public C1216Sv m12626a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0007
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: b */
        public void m12627b(p000.C1216Sv r3) {
            /*
                r2 = this;
                return
            L4b:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.fragmens.SingleCategoryVideoListFragment.AsyncTaskC2108a.m12627b(Sv):void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ C1216Sv doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(C1216Sv c1216Sv) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ boolean m12614x1(SingleCategoryVideoListFragment singleCategoryVideoListFragment) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y1 */
    public static /* synthetic */ boolean m12615y1(SingleCategoryVideoListFragment singleCategoryVideoListFragment, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A1 */
    public final void m12616A1(ArrayList<String> arrayList) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B1 */
    public final void m12617B1(Map<String, FilterLayout.InterfaceC2388h> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C1 */
    public void m12618C1(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D1 */
    public void m12619D1(Map<String, ArrayList<C0376Fk>> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E1 */
    public void m12620E1(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseVideoListFragment
    /* JADX INFO: renamed from: P0 */
    public void mo12079P0(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseVideoListFragment
    /* JADX INFO: renamed from: R0 */
    public void mo12081R0(HashMap<String, String> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseVideoListFragment
    /* JADX INFO: renamed from: S0 */
    public String mo12082S0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseVideoListFragment
    /* JADX INFO: renamed from: U0 */
    public int mo12084U0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseVideoListFragment
    /* JADX INFO: renamed from: W0 */
    public int mo12086W0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseVideoListFragment
    /* JADX INFO: renamed from: X0 */
    public boolean mo12087X0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.view.FilterLayout.InterfaceC2390j
    /* JADX INFO: renamed from: b */
    public void mo12621b() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.view.FilterLayout.InterfaceC2390j
    /* JADX INFO: renamed from: d0 */
    public void mo12622d0(Map<String, FilterLayout.InterfaceC2388h> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseVideoListFragment
    /* JADX INFO: renamed from: d1 */
    public boolean mo12093d1() {
        return false;
    }

    @Override // android.media.ViviTV.fragmens.BaseVideoListFragment
    /* JADX INFO: renamed from: h1 */
    public boolean mo12097h1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.view.FilterLayoutV2.InterfaceC2331g
    /* JADX INFO: renamed from: l */
    public List<FilterLayoutV2.InterfaceC2329e> mo12623l(FilterLayoutV2.C2328d c2328d, FilterLayoutV2.InterfaceC2329e interfaceC2329e) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseVideoListFragment
    /* JADX INFO: renamed from: p1 */
    public void mo12105p1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.view.FilterLayout.InterfaceC2390j
    /* JADX INFO: renamed from: q */
    public void mo12624q(Map<String, FilterLayout.InterfaceC2388h> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z1 */
    public final void m12625z1(int i) {
    }
}
