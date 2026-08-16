package android.media.ViviTV.fragmens;

import android.media.ViviTV.adapters.HomeRecyclerViewAdapter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter;
import cn.dolit.twowayviewlib.listeners.ScrollReachBottomListenerTWV;
import java.util.ArrayList;
import java.util.List;
import org.lucasr.twowayview.ItemClickSupport;
import org.lucasr.twowayview.interfaces.ISearchFocusListener;
import org.lucasr.twowayview.widget.TwoWayView;
import p000.AbstractC5157p6;
import p000.C4182cp;
import p000.C4650k3;
import p000.DialogC1326Uc;
import p000.InterfaceC0700Kq;
import p000.InterfaceC5680wq;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseHomeItemFragment extends BaseHomeStructuredFragment implements ISearchFocusListener, InterfaceC5680wq {

    /* JADX INFO: renamed from: m */
    public static final String f7908m = "EXTRA_HOME_FRAGMENT_ID";

    /* JADX INFO: renamed from: n */
    public static final String f7909n = "categoryId";

    /* JADX INFO: renamed from: a */
    public TwoWayView f7910a;

    /* JADX INFO: renamed from: b */
    public View f7911b;

    /* JADX INFO: renamed from: c */
    public boolean f7912c;

    /* JADX INFO: renamed from: d */
    public List<AbstractC5157p6> f7913d;

    /* JADX INFO: renamed from: e */
    public String f7914e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2007k f7915f;

    /* JADX INFO: renamed from: g */
    public String f7916g;

    /* JADX INFO: renamed from: h */
    public boolean f7917h;

    /* JADX INFO: renamed from: i */
    public boolean f7918i;

    /* JADX INFO: renamed from: j */
    public String f7919j;

    /* JADX INFO: renamed from: k */
    public String f7920k;

    /* JADX INFO: renamed from: l */
    public boolean f7921l;

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.BaseHomeItemFragment$a */
    public class RunnableC1997a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseHomeItemFragment f7922a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC1997a(BaseHomeItemFragment baseHomeItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.BaseHomeItemFragment$b */
    public class C1998b extends ScrollReachBottomListenerTWV {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ BaseHomeItemFragment f7923c;

        /* JADX WARN: Invalid debug info offset */
        public C1998b(BaseHomeItemFragment baseHomeItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // cn.dolit.twowayviewlib.listeners.ScrollReachBottomListenerTWV
        /* JADX INFO: renamed from: a */
        public void mo12044a() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // cn.dolit.twowayviewlib.listeners.ScrollReachBottomListenerTWV, androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // cn.dolit.twowayviewlib.listeners.ScrollReachBottomListenerTWV, androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.BaseHomeItemFragment$c */
    public class C1999c implements ItemClickSupport.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseHomeItemFragment f7924a;

        /* JADX WARN: Invalid debug info offset */
        public C1999c(BaseHomeItemFragment baseHomeItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.lucasr.twowayview.ItemClickSupport.OnItemClickListener
        public void onItemClick(RecyclerView recyclerView, View view, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.BaseHomeItemFragment$d */
    public class C2000d implements ItemClickSupport.OnItemLongClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseHomeItemFragment f7925a;

        /* JADX WARN: Invalid debug info offset */
        public C2000d(BaseHomeItemFragment baseHomeItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.lucasr.twowayview.ItemClickSupport.OnItemLongClickListener
        public boolean onItemLongClick(RecyclerView recyclerView, View view, int i, long j) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.BaseHomeItemFragment$e */
    public class C2001e implements ItemClickSupport.OnItemTouchObserver {

        /* JADX INFO: renamed from: a */
        public View f7926a;

        /* JADX INFO: renamed from: b */
        public boolean f7927b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ BaseHomeItemFragment f7928c;

        /* JADX WARN: Invalid debug info offset */
        public C2001e(BaseHomeItemFragment baseHomeItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public final void m12045a() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.lucasr.twowayview.ItemClickSupport.OnItemTouchObserver
        public void onItemDown(RecyclerView recyclerView, View view, int i, long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.lucasr.twowayview.ItemClickSupport.OnItemTouchObserver
        public void onItemTouchCancel(RecyclerView recyclerView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.lucasr.twowayview.ItemClickSupport.OnItemTouchObserver
        public void onItemUp(RecyclerView recyclerView, View view, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.BaseHomeItemFragment$f */
    public class C2002f implements RecyclerView.OnChildAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseHomeItemFragment f7929a;

        /* JADX WARN: Invalid debug info offset */
        public C2002f(BaseHomeItemFragment baseHomeItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.BaseHomeItemFragment$g */
    public class RunnableC2003g implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C4650k3 f7930a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseHomeItemFragment f7931b;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2003g(BaseHomeItemFragment baseHomeItemFragment, C4650k3 c4650k3) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0025
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.lang.Runnable
        public void run() {
            /*
                r5 = this;
                return
            L2f:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.fragmens.BaseHomeItemFragment.RunnableC2003g.run():void");
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.BaseHomeItemFragment$h */
    public class RunnableC2004h implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C4182cp f7932a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f7933b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ RecyclerView.ViewHolder f7934c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ BaseHomeItemFragment f7935d;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2004h(BaseHomeItemFragment baseHomeItemFragment, C4182cp c4182cp, View view, RecyclerView.ViewHolder viewHolder) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.BaseHomeItemFragment$i */
    public class C2005i implements BaseSpannableRecyclerViewAdapter.InterfaceC3068a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseHomeItemFragment f7936a;

        /* JADX WARN: Invalid debug info offset */
        public C2005i(BaseHomeItemFragment baseHomeItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter.InterfaceC3068a
        /* JADX INFO: renamed from: a */
        public void mo12046a(View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter.InterfaceC3068a
        /* JADX INFO: renamed from: b */
        public void mo12047b(View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter.InterfaceC3068a
        /* JADX INFO: renamed from: c */
        public boolean mo12048c(View view) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.BaseHomeItemFragment$j */
    public class C2006j implements BaseSpannableRecyclerViewAdapter.InterfaceC3069b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseHomeItemFragment f7937a;

        /* JADX WARN: Invalid debug info offset */
        public C2006j(BaseHomeItemFragment baseHomeItemFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter.InterfaceC3069b
        /* JADX INFO: renamed from: a */
        public void mo12049a(BaseSpannableRecyclerViewAdapter baseSpannableRecyclerViewAdapter) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.BaseHomeItemFragment$k */
    public interface InterfaceC2007k {
        /* JADX INFO: renamed from: R */
        void mo12050R();

        /* JADX INFO: renamed from: V */
        void mo12051V(RecyclerView recyclerView, int i);

        /* JADX INFO: renamed from: z0 */
        void mo12052z0(RecyclerView recyclerView, int i, int i2);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.BaseHomeItemFragment$l */
    public interface InterfaceC2008l {
        /* JADX INFO: renamed from: s */
        boolean mo11992s(Object obj);
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ void m11993G0(BaseHomeItemFragment baseHomeItemFragment, String str, View view, C4182cp c4182cp, RecyclerView.ViewHolder viewHolder, DialogC1326Uc dialogC1326Uc, View view2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m11994H0(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ void m11995I0(BaseHomeItemFragment baseHomeItemFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m11996J0(InterfaceC0700Kq interfaceC0700Kq, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ void m11997K0(HomeRecyclerViewAdapter homeRecyclerViewAdapter, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m11998L0(BaseHomeItemFragment baseHomeItemFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ InterfaceC2007k m11999M0(BaseHomeItemFragment baseHomeItemFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ boolean m12000N0(BaseHomeItemFragment baseHomeItemFragment, C4182cp c4182cp, View view) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ boolean m12001O0(BaseHomeItemFragment baseHomeItemFragment, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m12002P0(BaseHomeItemFragment baseHomeItemFragment, String str, View view, C4182cp c4182cp, RecyclerView.ViewHolder viewHolder) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m12003Q0(BaseHomeItemFragment baseHomeItemFragment, String str, View view, C4182cp c4182cp, RecyclerView.ViewHolder viewHolder) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    private void m12004T0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k1 */
    public static /* synthetic */ void m12005k1(HomeRecyclerViewAdapter homeRecyclerViewAdapter, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m12006l1(InterfaceC0700Kq interfaceC0700Kq, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m1 */
    public static /* synthetic */ void m12007m1(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A1 */
    public final void m12008A1(String str, View view, C4182cp c4182cp, RecyclerView.ViewHolder viewHolder) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B1 */
    public void m12009B1(ArrayList<AbstractC5157p6> arrayList) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeStructuredFragment
    /* JADX INFO: renamed from: D0 */
    public boolean mo12010D0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeStructuredFragment
    /* JADX INFO: renamed from: E0 */
    public void mo12011E0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeStructuredFragment
    /* JADX INFO: renamed from: F0 */
    public void mo12012F0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public final void m12013R0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public void m12014S0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public void m12015U0(InterfaceC2008l interfaceC2008l) {
    }

    /* JADX INFO: renamed from: V0 */
    public abstract void mo12016V0(BaseSpannableRecyclerViewAdapter baseSpannableRecyclerViewAdapter);

    /* JADX INFO: renamed from: X0 */
    public abstract View mo11991X0(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public String m12018Y0() {
        return null;
    }

    /* JADX INFO: renamed from: Z0 */
    public boolean mo12019Z0(C4182cp c4182cp) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public void m12020a1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    public final void m12021b1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public void mo12022c1(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public boolean m12023d1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    public final void m12024e1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    public final void m12025f1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g1 */
    public final void m12026g1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    public boolean m12027h1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m12028i1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m12029j1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC5680wq
    /* JADX INFO: renamed from: k */
    public String mo12030k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m12031n1(String str, View view, C4182cp c4182cp, RecyclerView.ViewHolder viewHolder, DialogC1326Uc dialogC1326Uc, View view2) {
    }

    /* JADX INFO: renamed from: o1 */
    public boolean mo12032o1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.interfaces.ISearchFocusListener
    public View onFocusUpSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onPause() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p1 */
    public final void m12033p1(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q1 */
    public final void m12034q1(C4182cp c4182cp, RecyclerView.ViewHolder viewHolder) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r1 */
    public final boolean m12035r1(C4182cp c4182cp, View view) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x004c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: s1 */
    public boolean m12036s1(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            return r0
        L65:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.fragmens.BaseHomeItemFragment.m12036s1(java.lang.String):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t1 */
    public final void m12037t1(String str, View view, C4182cp c4182cp, RecyclerView.ViewHolder viewHolder) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u1 */
    public final void m12038u1(@Nullable Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v1 */
    public void m12039v1(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w1 */
    public void m12040w1(InterfaceC2007k interfaceC2007k) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x1 */
    public void m12041x1(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y1 */
    public void m12042y1(List<AbstractC5157p6> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z1 */
    public void m12043z1(View view) {
    }

    /* JADX INFO: renamed from: W0 */
    public void mo12017W0(C4182cp c4182cp) {
    }
}
