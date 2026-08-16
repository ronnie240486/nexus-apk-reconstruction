package com.youth.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.youth.banner.view.BannerViewPager;
import java.util.List;
import p000.C1164S5;
import p000.InterfaceC0573Ir;
import p000.InterfaceC5428tH;
import p000.InterfaceC5510uH;
import p000.L30;

/* JADX INFO: loaded from: classes2.dex */
public class Banner extends FrameLayout implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: A */
    public List<ImageView> f13372A;

    /* JADX INFO: renamed from: B */
    public Context f13373B;

    /* JADX INFO: renamed from: C */
    public BannerViewPager f13374C;

    /* JADX INFO: renamed from: D */
    public TextView f13375D;

    /* JADX INFO: renamed from: E */
    public TextView f13376E;

    /* JADX INFO: renamed from: F */
    public TextView f13377F;

    /* JADX INFO: renamed from: G */
    public LinearLayout f13378G;

    /* JADX INFO: renamed from: H */
    public LinearLayout f13379H;

    /* JADX INFO: renamed from: I */
    public LinearLayout f13380I;

    /* JADX INFO: renamed from: J */
    public ImageView f13381J;

    /* JADX INFO: renamed from: K */
    public InterfaceC0573Ir f13382K;

    /* JADX INFO: renamed from: L */
    public C4180b f13383L;

    /* JADX INFO: renamed from: M */
    public ViewPager.OnPageChangeListener f13384M;

    /* JADX INFO: renamed from: N */
    public C1164S5 f13385N;

    /* JADX INFO: renamed from: O */
    public InterfaceC5428tH f13386O;

    /* JADX INFO: renamed from: P */
    public InterfaceC5510uH f13387P;

    /* JADX INFO: renamed from: Q */
    public DisplayMetrics f13388Q;

    /* JADX INFO: renamed from: R */
    public L30 f13389R;

    /* JADX INFO: renamed from: S */
    public final Runnable f13390S;

    /* JADX INFO: renamed from: a */
    public String f13391a;

    /* JADX INFO: renamed from: b */
    public int f13392b;

    /* JADX INFO: renamed from: c */
    public int f13393c;

    /* JADX INFO: renamed from: d */
    public int f13394d;

    /* JADX INFO: renamed from: e */
    public int f13395e;

    /* JADX INFO: renamed from: f */
    public int f13396f;

    /* JADX INFO: renamed from: g */
    public int f13397g;

    /* JADX INFO: renamed from: h */
    public int f13398h;

    /* JADX INFO: renamed from: i */
    public int f13399i;

    /* JADX INFO: renamed from: j */
    public boolean f13400j;

    /* JADX INFO: renamed from: k */
    public boolean f13401k;

    /* JADX INFO: renamed from: l */
    public int f13402l;

    /* JADX INFO: renamed from: m */
    public int f13403m;

    /* JADX INFO: renamed from: n */
    public int f13404n;

    /* JADX INFO: renamed from: o */
    public int f13405o;

    /* JADX INFO: renamed from: p */
    public int f13406p;

    /* JADX INFO: renamed from: q */
    public int f13407q;

    /* JADX INFO: renamed from: r */
    public int f13408r;

    /* JADX INFO: renamed from: s */
    public int f13409s;

    /* JADX INFO: renamed from: t */
    public int f13410t;

    /* JADX INFO: renamed from: u */
    public int f13411u;

    /* JADX INFO: renamed from: v */
    public int f13412v;

    /* JADX INFO: renamed from: w */
    public int f13413w;

    /* JADX INFO: renamed from: x */
    public List<String> f13414x;

    /* JADX INFO: renamed from: y */
    public List f13415y;

    /* JADX INFO: renamed from: z */
    public List<View> f13416z;

    /* JADX INFO: renamed from: com.youth.banner.Banner$a */
    public class RunnableC4179a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Banner f13417a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC4179a(Banner banner) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: com.youth.banner.Banner$b */
    public class C4180b extends PagerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Banner f13418a;

        /* JADX INFO: renamed from: com.youth.banner.Banner$b$a */
        public class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f13419a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C4180b f13420b;

            /* JADX WARN: Invalid debug info offset */
            public a(C4180b c4180b, int i) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        /* JADX INFO: renamed from: com.youth.banner.Banner$b$b */
        public class b implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f13421a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C4180b f13422b;

            /* JADX WARN: Invalid debug info offset */
            public b(C4180b c4180b, int i) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public C4180b(Banner banner) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public Banner(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Banner(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Banner(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m19546a(Banner banner) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m19547b(Banner banner) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m19548c(Banner banner) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m19549d(Banner banner, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ BannerViewPager m19550e(Banner banner) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Runnable m19551f(Banner banner) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ L30 m19552g(Banner banner) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m19553h(Banner banner) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ List m19554i(Banner banner) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InterfaceC5428tH m19555j(Banner banner) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ InterfaceC5510uH m19556k(Banner banner) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public final void m19557A() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public Banner m19558B(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public final void m19559C(List<?> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public Banner m19560D(InterfaceC0573Ir interfaceC0573Ir) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public Banner m19561E(List<?> list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public Banner m19562F(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public Banner m19563G(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: H */
    public Banner m19564H(InterfaceC5428tH interfaceC5428tH) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public Banner m19565I(InterfaceC5510uH interfaceC5510uH) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public Banner m19566J(boolean z, ViewPager.PageTransformer pageTransformer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public final void m19567K(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public final void m19568L() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public Banner m19569M(boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public Banner m19570N() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public void m19571O() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public void m19572P() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q */
    public int m19573Q(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public void m19574R(List<?> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public void m19575S(List<?> list, List<String> list2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T */
    public void m19576T(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public final void m19577l() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public final void m19578m(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public final void m19579n() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public final void m19580o(Context context, AttributeSet attributeSet) {
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
    /* JADX INFO: renamed from: p */
    public final void m19581p() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public Banner m19582q(boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public void m19583r() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public void m19584s() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public void m19585t() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public final void m19586u(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public void m19587v(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public Banner m19588w(Class<? extends ViewPager.PageTransformer> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public Banner m19589x(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public final void m19590y() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public Banner m19591z(List<String> list) {
        return null;
    }
}
