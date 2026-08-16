package com.ogaclejapan.smarttablayout;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import p000.AbstractC5656wS;

/* JADX INFO: loaded from: classes2.dex */
public class SmartTabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: p */
    public static final boolean f11414p = false;

    /* JADX INFO: renamed from: q */
    public static final int f11415q = 24;

    /* JADX INFO: renamed from: r */
    public static final int f11416r = -1;

    /* JADX INFO: renamed from: s */
    public static final int f11417s = 16;

    /* JADX INFO: renamed from: t */
    public static final boolean f11418t = true;

    /* JADX INFO: renamed from: u */
    public static final int f11419u = 12;

    /* JADX INFO: renamed from: v */
    public static final int f11420v = -67108864;

    /* JADX INFO: renamed from: w */
    public static final int f11421w = 0;

    /* JADX INFO: renamed from: x */
    public static final boolean f11422x = true;

    /* JADX INFO: renamed from: a */
    public final C3888a f11423a;

    /* JADX INFO: renamed from: b */
    public int f11424b;

    /* JADX INFO: renamed from: c */
    public int f11425c;

    /* JADX INFO: renamed from: d */
    public boolean f11426d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f11427e;

    /* JADX INFO: renamed from: f */
    public float f11428f;

    /* JADX INFO: renamed from: g */
    public int f11429g;

    /* JADX INFO: renamed from: h */
    public int f11430h;

    /* JADX INFO: renamed from: i */
    public ViewPager f11431i;

    /* JADX INFO: renamed from: j */
    public ViewPager.OnPageChangeListener f11432j;

    /* JADX INFO: renamed from: k */
    public InterfaceC3883d f11433k;

    /* JADX INFO: renamed from: l */
    public InterfaceC3887h f11434l;

    /* JADX INFO: renamed from: m */
    public ViewOnClickListenerC3881b f11435m;

    /* JADX INFO: renamed from: n */
    public InterfaceC3884e f11436n;

    /* JADX INFO: renamed from: o */
    public boolean f11437o;

    /* JADX INFO: renamed from: com.ogaclejapan.smarttablayout.SmartTabLayout$b */
    public class ViewOnClickListenerC3881b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SmartTabLayout f11438a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC3881b(SmartTabLayout smartTabLayout) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ ViewOnClickListenerC3881b(SmartTabLayout smartTabLayout, C3880a c3880a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.ogaclejapan.smarttablayout.SmartTabLayout$c */
    public class C3882c implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: a */
        public int f11439a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SmartTabLayout f11440b;

        /* JADX WARN: Invalid debug info offset */
        public C3882c(SmartTabLayout smartTabLayout) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ C3882c(SmartTabLayout smartTabLayout, C3880a c3880a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
        }
    }

    /* JADX INFO: renamed from: com.ogaclejapan.smarttablayout.SmartTabLayout$d */
    public interface InterfaceC3883d {
        /* JADX INFO: renamed from: a */
        void m17987a(int i, int i2);
    }

    /* JADX INFO: renamed from: com.ogaclejapan.smarttablayout.SmartTabLayout$e */
    public interface InterfaceC3884e {
        /* JADX INFO: renamed from: a */
        void m17988a(int i);
    }

    /* JADX INFO: renamed from: com.ogaclejapan.smarttablayout.SmartTabLayout$f */
    public static class C3885f implements InterfaceC3887h {

        /* JADX INFO: renamed from: a */
        public final LayoutInflater f11441a;

        /* JADX INFO: renamed from: b */
        public final int f11442b;

        /* JADX INFO: renamed from: c */
        public final int f11443c;

        /* JADX WARN: Invalid debug info offset */
        public C3885f(Context context, int i, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ C3885f(Context context, int i, int i2, C3880a c3880a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.ogaclejapan.smarttablayout.SmartTabLayout.InterfaceC3887h
        /* JADX INFO: renamed from: a */
        public View mo17989a(ViewGroup viewGroup, int i, PagerAdapter pagerAdapter) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.ogaclejapan.smarttablayout.SmartTabLayout$g */
    public interface InterfaceC3886g {
        /* JADX INFO: renamed from: a */
        int mo17990a(int i);

        /* JADX INFO: renamed from: b */
        int mo17991b(int i);
    }

    /* JADX INFO: renamed from: com.ogaclejapan.smarttablayout.SmartTabLayout$h */
    public interface InterfaceC3887h {
        /* JADX INFO: renamed from: a */
        View mo17989a(ViewGroup viewGroup, int i, PagerAdapter pagerAdapter);
    }

    /* JADX WARN: Invalid debug info offset */
    public SmartTabLayout(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SmartTabLayout(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SmartTabLayout(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m17979a(SmartTabLayout smartTabLayout, int i, float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ViewPager.OnPageChangeListener m17980b(SmartTabLayout smartTabLayout) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC3884e m17981c(SmartTabLayout smartTabLayout) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ ViewPager m17982d(SmartTabLayout smartTabLayout) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public TextView m17983e(CharSequence charSequence) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public View m17984f(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public final void m17985g() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final void m17986h(int i, float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCustomTabColorizer(InterfaceC3886g interfaceC3886g) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCustomTabView(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCustomTabView(InterfaceC3887h interfaceC3887h) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDefaultTabTextColor(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDefaultTabTextColor(ColorStateList colorStateList) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDistributeEvenly(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDividerColors(int... iArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setIndicationInterpolator(AbstractC5656wS abstractC5656wS) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOnScrollChangeListener(InterfaceC3883d interfaceC3883d) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOnTabClickListener(InterfaceC3884e interfaceC3884e) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSelectedIndicatorColors(int... iArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setViewPager(ViewPager viewPager) {
    }
}
