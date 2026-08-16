package com.leochuan;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p000.AbstractC0793MH;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ViewPagerLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: A */
    public static final int f11369A = 1;

    /* JADX INFO: renamed from: B */
    public static final int f11370B = -1;

    /* JADX INFO: renamed from: C */
    public static final int f11371C = 0;

    /* JADX INFO: renamed from: D */
    public static final int f11372D = 1;

    /* JADX INFO: renamed from: E */
    public static final int f11373E = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: y */
    public static final int f11374y = -1;

    /* JADX INFO: renamed from: z */
    public static final int f11375z = 0;

    /* JADX INFO: renamed from: a */
    public SparseArray<View> f11376a;

    /* JADX INFO: renamed from: b */
    public int f11377b;

    /* JADX INFO: renamed from: c */
    public int f11378c;

    /* JADX INFO: renamed from: d */
    public int f11379d;

    /* JADX INFO: renamed from: e */
    public int f11380e;

    /* JADX INFO: renamed from: f */
    public int f11381f;

    /* JADX INFO: renamed from: g */
    public float f11382g;

    /* JADX INFO: renamed from: h */
    public AbstractC0793MH f11383h;

    /* JADX INFO: renamed from: i */
    public boolean f11384i;

    /* JADX INFO: renamed from: j */
    public boolean f11385j;

    /* JADX INFO: renamed from: k */
    public boolean f11386k;

    /* JADX INFO: renamed from: l */
    public int f11387l;

    /* JADX INFO: renamed from: m */
    public C3872b f11388m;

    /* JADX INFO: renamed from: n */
    public float f11389n;

    /* JADX INFO: renamed from: o */
    public InterfaceC3871a f11390o;

    /* JADX INFO: renamed from: p */
    public boolean f11391p;

    /* JADX INFO: renamed from: q */
    public boolean f11392q;

    /* JADX INFO: renamed from: r */
    public boolean f11393r;

    /* JADX INFO: renamed from: s */
    public int f11394s;

    /* JADX INFO: renamed from: t */
    public int f11395t;

    /* JADX INFO: renamed from: u */
    public int f11396u;

    /* JADX INFO: renamed from: v */
    public Interpolator f11397v;

    /* JADX INFO: renamed from: w */
    public int f11398w;

    /* JADX INFO: renamed from: x */
    public View f11399x;

    /* JADX INFO: renamed from: com.leochuan.ViewPagerLayoutManager$a */
    public interface InterfaceC3871a {
        void onPageScrollStateChanged(int i);

        void onPageSelected(int i);
    }

    /* JADX INFO: renamed from: com.leochuan.ViewPagerLayoutManager$b */
    public static class C3872b implements Parcelable {
        public static final Parcelable.Creator<C3872b> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        public int f11400a;

        /* JADX INFO: renamed from: b */
        public float f11401b;

        /* JADX INFO: renamed from: c */
        public boolean f11402c;

        /* JADX INFO: renamed from: com.leochuan.ViewPagerLayoutManager$b$a */
        public class a implements Parcelable.Creator<C3872b> {
            /* JADX WARN: Invalid debug info offset */
            /* JADX INFO: renamed from: a */
            public C3872b m17962a(Parcel parcel) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            /* JADX INFO: renamed from: b */
            public C3872b[] m17963b(int i) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ C3872b createFromParcel(Parcel parcel) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ C3872b[] newArray(int i) {
                return null;
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public C3872b() {
        }

        /* JADX WARN: Invalid debug info offset */
        public C3872b(Parcel parcel) {
        }

        /* JADX WARN: Invalid debug info offset */
        public C3872b(C3872b c3872b) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public ViewPagerLayoutManager(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ViewPagerLayoutManager(Context context, int i, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    private int scrollBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public final boolean m17932A(float f) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public final void m17933B(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public void m17934C(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public void m17935D(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public void m17936E(boolean z) {
    }

    /* JADX INFO: renamed from: F */
    public abstract float mo17707F();

    /* JADX INFO: renamed from: G */
    public abstract void mo17708G(View view, float f);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public void m17937H(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public void m17938I(InterfaceC3871a interfaceC3871a) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public void m17939J(Interpolator interpolator) {
    }

    /* JADX INFO: renamed from: K */
    public void mo17740K() {
    }

    /* JADX INFO: renamed from: L */
    public float mo17709L(View view, float f) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public final boolean m17940M() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public int mo17750a(View view, float f) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public int mo17752b(View view, float f) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final int m17941c() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final int m17942d() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public final int m17943e() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void ensureLayoutState() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public int m17944f() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View findViewByPosition(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public int m17945g() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int getOrientation() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public boolean getRecycleChildrenOnDetach() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public boolean getReverseLayout() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public float mo17717h() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public int m17946i() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public boolean m17947j() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public boolean m17948k() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public int m17949l(View view) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public float m17950m() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public int m17951n() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: o */
    public final android.view.View m17952o(androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3, int r4) {
        /*
            r1 = this;
            r0 = 0
            return r0
        Le:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leochuan.ViewPagerLayoutManager.m17952o(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, int):android.view.View");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public float m17953p() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public final int m17954q(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public final float m17955r() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    public final void resolveShouldLayoutReverse() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public int m17956s() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setOrientation(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setRecycleChildrenOnDetach(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setReverseLayout(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setSmoothScrollbarEnabled(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public int m17957t(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public final float m17958u(int i) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public boolean m17959v() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public final void m17960w(RecyclerView.Recycler recycler) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public final void m17961x(View view, float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public float mo17759y() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public float mo17760z() {
        return 0.0f;
    }
}
