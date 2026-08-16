package com.afollestad.materialdialogs.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.StackingBehavior;

/* JADX INFO: loaded from: classes.dex */
public class MDRootLayout extends ViewGroup {

    /* JADX INFO: renamed from: u */
    public static final int f10675u = 0;

    /* JADX INFO: renamed from: v */
    public static final int f10676v = 1;

    /* JADX INFO: renamed from: w */
    public static final int f10677w = 2;

    /* JADX INFO: renamed from: a */
    public final MDButton[] f10678a;

    /* JADX INFO: renamed from: b */
    public int f10679b;

    /* JADX INFO: renamed from: c */
    public View f10680c;

    /* JADX INFO: renamed from: d */
    public View f10681d;

    /* JADX INFO: renamed from: e */
    public boolean f10682e;

    /* JADX INFO: renamed from: f */
    public boolean f10683f;

    /* JADX INFO: renamed from: g */
    public StackingBehavior f10684g;

    /* JADX INFO: renamed from: h */
    public boolean f10685h;

    /* JADX INFO: renamed from: i */
    public boolean f10686i;

    /* JADX INFO: renamed from: j */
    public boolean f10687j;

    /* JADX INFO: renamed from: k */
    public boolean f10688k;

    /* JADX INFO: renamed from: l */
    public int f10689l;

    /* JADX INFO: renamed from: m */
    public int f10690m;

    /* JADX INFO: renamed from: n */
    public int f10691n;

    /* JADX INFO: renamed from: o */
    public GravityEnum f10692o;

    /* JADX INFO: renamed from: p */
    public int f10693p;

    /* JADX INFO: renamed from: q */
    public Paint f10694q;

    /* JADX INFO: renamed from: r */
    public ViewTreeObserver.OnScrollChangedListener f10695r;

    /* JADX INFO: renamed from: s */
    public ViewTreeObserver.OnScrollChangedListener f10696s;

    /* JADX INFO: renamed from: t */
    public int f10697t;

    /* JADX INFO: renamed from: com.afollestad.materialdialogs.internal.MDRootLayout$1 */
    public class ViewTreeObserverOnPreDrawListenerC31001 implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f10698a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f10699b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f10700c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ MDRootLayout f10701d;

        /* JADX WARN: Invalid debug info offset */
        public ViewTreeObserverOnPreDrawListenerC31001(MDRootLayout mDRootLayout, View view, boolean z, boolean z2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.afollestad.materialdialogs.internal.MDRootLayout$2 */
    public class C31012 extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f10702a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f10703b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f10704c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ MDRootLayout f10705d;

        /* JADX WARN: Invalid debug info offset */
        public C31012(MDRootLayout mDRootLayout, ViewGroup viewGroup, boolean z, boolean z2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: com.afollestad.materialdialogs.internal.MDRootLayout$3 */
    public class ViewTreeObserverOnScrollChangedListenerC31023 implements ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f10706a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f10707b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f10708c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ MDRootLayout f10709d;

        /* JADX WARN: Invalid debug info offset */
        public ViewTreeObserverOnScrollChangedListenerC31023(MDRootLayout mDRootLayout, ViewGroup viewGroup, boolean z, boolean z2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
        }
    }

    /* JADX INFO: renamed from: com.afollestad.materialdialogs.internal.MDRootLayout$4 */
    public static /* synthetic */ class C31034 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10710a;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            f10710a = iArr;
            try {
                iArr[GravityEnum.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10710a[GravityEnum.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public MDRootLayout(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public MDRootLayout(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(11)
    public MDRootLayout(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(21)
    public MDRootLayout(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m17025a(WebView webView) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m17026b(MDRootLayout mDRootLayout, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m17027c(MDRootLayout mDRootLayout, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m17028d(MDRootLayout mDRootLayout, ViewGroup viewGroup, boolean z, boolean z2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ MDButton[] m17029e(MDRootLayout mDRootLayout) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m17030f(MDRootLayout mDRootLayout, ViewGroup viewGroup, boolean z, boolean z2, boolean z3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m17031g(MDRootLayout mDRootLayout, WebView webView, boolean z, boolean z2, boolean z3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static boolean m17032i(AdapterView adapterView) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static boolean m17033j(RecyclerView recyclerView) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static boolean m17034k(ScrollView scrollView) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static boolean m17035l(WebView webView) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: m */
    public static View m17036m(ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: n */
    public static View m17037n(ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public static boolean m17038s(View view) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final void m17039h(ViewGroup viewGroup, boolean z, boolean z2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public final void m17040o(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onFinishInflate() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public final void m17041p(ViewGroup viewGroup, boolean z, boolean z2, boolean z3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public final void m17042q(WebView webView, boolean z, boolean z2, boolean z3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public final void m17043r() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setButtonGravity(GravityEnum gravityEnum) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setButtonStackedGravity(GravityEnum gravityEnum) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDividerColor(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setMaxHeight(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setStackingBehavior(StackingBehavior stackingBehavior) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public void m17044t() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public final void m17045u(View view, boolean z, boolean z2) {
    }
}
