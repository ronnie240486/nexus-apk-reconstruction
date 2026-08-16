package com.leochuan;

import android.widget.Scroller;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class CenterSnapHelper extends RecyclerView.OnFlingListener {

    /* JADX INFO: renamed from: a */
    public RecyclerView f11240a;

    /* JADX INFO: renamed from: b */
    public Scroller f11241b;

    /* JADX INFO: renamed from: c */
    public boolean f11242c;

    /* JADX INFO: renamed from: d */
    public final RecyclerView.OnScrollListener f11243d;

    /* JADX INFO: renamed from: com.leochuan.CenterSnapHelper$a */
    public class C3865a extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a */
        public boolean f11244a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CenterSnapHelper f11245b;

        /* JADX WARN: Invalid debug info offset */
        public C3865a(CenterSnapHelper centerSnapHelper) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m17733a(CenterSnapHelper centerSnapHelper) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m17734b(CenterSnapHelper centerSnapHelper, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) throws IllegalStateException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public void m17735c(ViewPagerLayoutManager viewPagerLayoutManager, ViewPagerLayoutManager.InterfaceC3871a interfaceC3871a) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void destroyCallbacks() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.OnFlingListener
    public boolean onFling(int i, int i2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setupCallbacks() throws IllegalStateException {
    }
}
