package com.youth.banner.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes2.dex */
public class BannerViewPager extends ViewPager {

    /* JADX INFO: renamed from: a */
    public boolean f13431a;

    /* JADX WARN: Invalid debug info offset */
    public BannerViewPager(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BannerViewPager(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setScrollable(boolean z) {
    }
}
