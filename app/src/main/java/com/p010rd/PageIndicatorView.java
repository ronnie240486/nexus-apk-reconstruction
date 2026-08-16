package com.p010rd;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import p000.C1722ag;
import p000.EnumC0731LH;
import p000.EnumC1183SO;
import p000.EnumC1611Z2;

/* JADX INFO: loaded from: classes2.dex */
public class PageIndicatorView extends View implements ViewPager.OnPageChangeListener, C4031a.a, ViewPager.OnAdapterChangeListener, View.OnTouchListener {

    /* JADX INFO: renamed from: f */
    public static final Handler f12300f = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public C4031a f12301a;

    /* JADX INFO: renamed from: b */
    public DataSetObserver f12302b;

    /* JADX INFO: renamed from: c */
    public ViewPager f12303c;

    /* JADX INFO: renamed from: d */
    public boolean f12304d;

    /* JADX INFO: renamed from: e */
    public Runnable f12305e;

    /* JADX INFO: renamed from: com.rd.PageIndicatorView$a */
    public class C4028a extends DataSetObserver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PageIndicatorView f12306a;

        /* JADX WARN: Invalid debug info offset */
        public C4028a(PageIndicatorView pageIndicatorView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.database.DataSetObserver
        public void onChanged() {
        }
    }

    /* JADX INFO: renamed from: com.rd.PageIndicatorView$b */
    public class RunnableC4029b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PageIndicatorView f12307a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC4029b(PageIndicatorView pageIndicatorView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: com.rd.PageIndicatorView$c */
    public static /* synthetic */ class C4030c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12308a;

        static {
            int[] iArr = new int[EnumC1183SO.values().length];
            f12308a = iArr;
            try {
                iArr[EnumC1183SO.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12308a[EnumC1183SO.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12308a[EnumC1183SO.Auto.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public PageIndicatorView(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PageIndicatorView(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PageIndicatorView(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(21)
    public PageIndicatorView(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m18488b(PageIndicatorView pageIndicatorView) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C4031a m18489c(PageIndicatorView pageIndicatorView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m18490d(PageIndicatorView pageIndicatorView) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public void m18491A() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public final void m18492B() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public final void m18493C() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public final void m18494D() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: E */
    public final void m18495E() {
        /*
            r2 = this;
            return
        L1e:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p010rd.PageIndicatorView.m18495E():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public final void m18496F() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public final void m18497G() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p010rd.C4031a.a
    /* JADX INFO: renamed from: a */
    public void mo18498a() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public final int m18499e(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public void m18500f() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public final void m18501g() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: h */
    public final ViewPager m18502h(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public final void m18503i(@Nullable ViewParent viewParent) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public long m18504j() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public int m18505k() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public int m18506l() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public int m18507m() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public float m18508n() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public int m18509o() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
    public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onAttachedToWindow() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onDetachedFromWindow() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
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

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public int m18510p() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public int m18511q() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public int m18512r() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public final void m18513s() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setAnimationDuration(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setAnimationType(@Nullable EnumC1611Z2 enumC1611Z2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setAutoVisibility(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setClickListener(@Nullable C1722ag.b bVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCount(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDynamicCount(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setFadeOnIdle(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setIdleDuration(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setInteractiveAnimation(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOrientation(@Nullable EnumC0731LH enumC0731LH) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPadding(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPadding(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setProgress(int i, float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setRadius(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setRadius(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setRtlMode(@Nullable EnumC1183SO enumC1183SO) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setScaleFactor(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSelected(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSelectedColor(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSelection(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setStrokeWidth(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setStrokeWidth(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setUnselectedColor(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @SuppressLint({"ClickableViewAccessibility"})
    public void setViewPager(@Nullable ViewPager viewPager) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public final void m18514t(@Nullable AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public final void m18515u(@Nullable AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public final boolean m18516v() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public final boolean m18517w() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public final void m18518x(int i, float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public final void m18519y(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0016
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: z */
    public final void m18520z() {
        /*
            r2 = this;
            return
        L22:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p010rd.PageIndicatorView.m18520z():void");
    }
}
