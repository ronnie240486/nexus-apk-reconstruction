package android.media.ViviTV.home;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.media.ViviTV.adapters.HomeFragmentPagerAdapter;
import android.media.ViviTV.databinding.FragmentHomeContentViewBinding;
import android.media.ViviTV.databinding.FragmentHomeContentViewPortraitBinding;
import android.media.ViviTV.fragmens.BaseHomeItemFragment;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.squareup.picasso.Callback;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC5157p6;
import p000.C4650k3;
import p000.C4898np;
import p000.C4961op;
import p000.C5202pp;
import p000.InterfaceC1536Xr;

/* JADX INFO: loaded from: classes.dex */
public class HomeContentFragment extends Fragment implements View.OnClickListener, BaseHomeItemFragment.InterfaceC2007k, InterfaceC2229a.b {

    /* JADX INFO: renamed from: L */
    public static final String f8749L = "EXTRA_LAST_INDEX";

    /* JADX INFO: renamed from: A */
    public boolean f8750A;

    /* JADX INFO: renamed from: B */
    public final View.OnFocusChangeListener f8751B;

    /* JADX INFO: renamed from: C */
    public Runnable f8752C;

    /* JADX INFO: renamed from: D */
    public final ViewPager.OnPageChangeListener f8753D;

    /* JADX INFO: renamed from: E */
    public final View.OnKeyListener f8754E;

    /* JADX INFO: renamed from: F */
    public Runnable f8755F;

    /* JADX INFO: renamed from: G */
    public Runnable f8756G;

    /* JADX INFO: renamed from: H */
    public AbstractC2208p f8757H;

    /* JADX INFO: renamed from: I */
    public AbstractC2208p f8758I;

    /* JADX INFO: renamed from: J */
    public AbstractC2208p f8759J;

    /* JADX INFO: renamed from: K */
    public AbstractC2208p f8760K;

    /* JADX INFO: renamed from: a */
    public boolean f8761a;

    /* JADX INFO: renamed from: b */
    public InterfaceC2229a.d f8762b;

    /* JADX INFO: renamed from: c */
    public AnimatorSet f8763c;

    /* JADX INFO: renamed from: d */
    public AnimatorSet f8764d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f8765e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f8766f;

    /* JADX INFO: renamed from: g */
    public ImageButton f8767g;

    /* JADX INFO: renamed from: h */
    public RadioGroup f8768h;

    /* JADX INFO: renamed from: i */
    public ViewPager f8769i;

    /* JADX INFO: renamed from: j */
    public int[] f8770j;

    /* JADX INFO: renamed from: k */
    public Handler f8771k;

    /* JADX INFO: renamed from: l */
    public int f8772l;

    /* JADX INFO: renamed from: m */
    public int f8773m;

    /* JADX INFO: renamed from: n */
    public int f8774n;

    /* JADX INFO: renamed from: o */
    public int f8775o;

    /* JADX INFO: renamed from: p */
    public int f8776p;

    /* JADX INFO: renamed from: q */
    public AbstractC2208p f8777q;

    /* JADX INFO: renamed from: r */
    public List<C4961op> f8778r;

    /* JADX INFO: renamed from: s */
    public C4898np f8779s;

    /* JADX INFO: renamed from: t */
    public int f8780t;

    /* JADX INFO: renamed from: u */
    public HorizontalScrollView f8781u;

    /* JADX INFO: renamed from: v */
    public int f8782v;

    /* JADX INFO: renamed from: w */
    public SparseArray<View> f8783w;

    /* JADX INFO: renamed from: x */
    public HomeFragmentPagerAdapter f8784x;

    /* JADX INFO: renamed from: y */
    public int f8785y;

    /* JADX INFO: renamed from: z */
    public FrameLayout f8786z;

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeContentFragment$a */
    public class ViewOnKeyListenerC2193a implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeContentFragment f8787a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC2193a(HomeContentFragment homeContentFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeContentFragment$b */
    public class RunnableC2194b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeContentFragment f8788a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2194b(HomeContentFragment homeContentFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0036
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.lang.Runnable
        public void run() {
            /*
                r7 = this;
                return
            L3e:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.home.HomeContentFragment.RunnableC2194b.run():void");
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeContentFragment$c */
    public class C2195c extends AbstractC2208p {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ HomeContentFragment f8789c;

        /* JADX WARN: Invalid debug info offset */
        public C2195c(HomeContentFragment homeContentFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.home.HomeContentFragment.AbstractC2208p
        /* JADX INFO: renamed from: a */
        public RadioGroup.LayoutParams mo13187a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.home.HomeContentFragment.AbstractC2208p
        /* JADX INFO: renamed from: c */
        public void mo13188c() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeContentFragment$d */
    public class C2196d extends AbstractC2208p {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ HomeContentFragment f8790c;

        /* JADX WARN: Invalid debug info offset */
        public C2196d(HomeContentFragment homeContentFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.home.HomeContentFragment.AbstractC2208p
        /* JADX INFO: renamed from: a */
        public RadioGroup.LayoutParams mo13187a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.home.HomeContentFragment.AbstractC2208p
        /* JADX INFO: renamed from: c */
        public void mo13188c() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeContentFragment$e */
    public class C2197e extends AbstractC2208p {

        /* JADX INFO: renamed from: c */
        public FragmentHomeContentViewPortraitBinding f8791c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ HomeContentFragment f8792d;

        /* JADX WARN: Invalid debug info offset */
        public C2197e(HomeContentFragment homeContentFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.home.HomeContentFragment.AbstractC2208p
        /* JADX INFO: renamed from: a */
        public RadioGroup.LayoutParams mo13187a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.home.HomeContentFragment.AbstractC2208p
        /* JADX INFO: renamed from: b */
        public View mo13189b() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.home.HomeContentFragment.AbstractC2208p
        /* JADX INFO: renamed from: c */
        public void mo13188c() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.home.HomeContentFragment.AbstractC2208p
        /* JADX INFO: renamed from: d */
        public void mo13190d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeContentFragment$f */
    public class C2198f extends AbstractC2208p {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ HomeContentFragment f8793c;

        /* JADX WARN: Invalid debug info offset */
        public C2198f(HomeContentFragment homeContentFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.home.HomeContentFragment.AbstractC2208p
        /* JADX INFO: renamed from: a */
        public RadioGroup.LayoutParams mo13187a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.home.HomeContentFragment.AbstractC2208p
        /* JADX INFO: renamed from: c */
        public void mo13188c() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeContentFragment$g */
    public class C2199g implements Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageView f8794a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RadioButton f8795b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ HomeContentFragment f8796c;

        /* JADX WARN: Invalid debug info offset */
        public C2199g(HomeContentFragment homeContentFragment, ImageView imageView, RadioButton radioButton) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.squareup.picasso.Callback
        /* JADX INFO: renamed from: a */
        public void mo13191a() {
        }

        @Override // com.squareup.picasso.Callback
        /* JADX INFO: renamed from: b */
        public void mo13192b() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeContentFragment$h */
    public class C2200h implements InterfaceC1536Xr {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f8797a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RadioButton f8798b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f8799c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ HomeContentFragment f8800d;

        /* JADX WARN: Invalid debug info offset */
        public C2200h(HomeContentFragment homeContentFragment, int i, RadioButton radioButton, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC1536Xr
        /* JADX INFO: renamed from: a */
        public void mo7950a() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC1536Xr
        /* JADX INFO: renamed from: b */
        public void mo7951b(Bitmap bitmap) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeContentFragment$i */
    public class C2201i implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeContentFragment f8801a;

        /* JADX WARN: Invalid debug info offset */
        public C2201i(HomeContentFragment homeContentFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeContentFragment$j */
    public class C2202j implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeContentFragment f8802a;

        /* JADX WARN: Invalid debug info offset */
        public C2202j(HomeContentFragment homeContentFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeContentFragment$k */
    public class C2203k implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeContentFragment f8803a;

        /* JADX WARN: Invalid debug info offset */
        public C2203k(HomeContentFragment homeContentFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeContentFragment$l */
    public class C2204l implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeContentFragment f8804a;

        /* JADX WARN: Invalid debug info offset */
        public C2204l(HomeContentFragment homeContentFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeContentFragment$m */
    public class ViewOnFocusChangeListenerC2205m implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeContentFragment f8805a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnFocusChangeListenerC2205m(HomeContentFragment homeContentFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeContentFragment$n */
    public class RunnableC2206n implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeContentFragment f8806a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2206n(HomeContentFragment homeContentFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeContentFragment$o */
    public class C2207o implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeContentFragment f8807a;

        /* JADX WARN: Invalid debug info offset */
        public C2207o(HomeContentFragment homeContentFragment) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeContentFragment$p */
    public abstract class AbstractC2208p {

        /* JADX INFO: renamed from: a */
        public FragmentHomeContentViewBinding f8808a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HomeContentFragment f8809b;

        /* JADX WARN: Invalid debug info offset */
        public AbstractC2208p(HomeContentFragment homeContentFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ AbstractC2208p(HomeContentFragment homeContentFragment, C2199g c2199g) {
        }

        /* JADX INFO: renamed from: a */
        public abstract RadioGroup.LayoutParams mo13187a();

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public View mo13189b() {
            return null;
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo13188c();

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public void mo13190d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m13107D0(HomeContentFragment homeContentFragment, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m13108E0(HomeContentFragment homeContentFragment, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m13109F0(HomeContentFragment homeContentFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ void m13110G0(HomeContentFragment homeContentFragment, int i, RadioButton radioButton) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ int m13111H0(HomeContentFragment homeContentFragment) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ int m13112I0(HomeContentFragment homeContentFragment) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ int m13113J0(HomeContentFragment homeContentFragment, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ int m13114K0(HomeContentFragment homeContentFragment, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ ViewPager m13115L0(HomeContentFragment homeContentFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ ViewPager m13116M0(HomeContentFragment homeContentFragment, ViewPager viewPager) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ BaseHomeItemFragment m13117N0(HomeContentFragment homeContentFragment, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N1 */
    private /* synthetic */ void m13118N1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ RadioGroup m13119O0(HomeContentFragment homeContentFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ RadioGroup m13120P0(HomeContentFragment homeContentFragment, RadioGroup radioGroup) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m13121Q0(HomeContentFragment homeContentFragment, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ Runnable m13122R0(HomeContentFragment homeContentFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ Handler m13123S0(HomeContentFragment homeContentFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ boolean m13124T0(HomeContentFragment homeContentFragment) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ boolean m13125U0(HomeContentFragment homeContentFragment, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ Runnable m13126V0(HomeContentFragment homeContentFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ int m13127W0(HomeContentFragment homeContentFragment) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ int m13128X0(HomeContentFragment homeContentFragment) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ int m13129Y0(HomeContentFragment homeContentFragment, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ Runnable m13130Z0(HomeContentFragment homeContentFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m13131a1(HomeContentFragment homeContentFragment, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ boolean m13132b1(HomeContentFragment homeContentFragment, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ int m13133c1(HomeContentFragment homeContentFragment, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ HorizontalScrollView m13134d1(HomeContentFragment homeContentFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ HorizontalScrollView m13135e1(HomeContentFragment homeContentFragment, HorizontalScrollView horizontalScrollView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ AbstractC2208p m13136f1(HomeContentFragment homeContentFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ boolean m13137g1(HomeContentFragment homeContentFragment, View view) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ List m13138h1(HomeContentFragment homeContentFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ HomeFragmentPagerAdapter m13139i1(HomeContentFragment homeContentFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j1 */
    public static /* synthetic */ int m13140j1(HomeContentFragment homeContentFragment) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k1 */
    public static /* synthetic */ FrameLayout m13141k1(HomeContentFragment homeContentFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ FrameLayout m13142l1(HomeContentFragment homeContentFragment, FrameLayout frameLayout) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m1 */
    public static /* synthetic */ ImageButton m13143m1(HomeContentFragment homeContentFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n1 */
    public static /* synthetic */ ImageButton m13144n1(HomeContentFragment homeContentFragment, ImageButton imageButton) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o1 */
    public static /* synthetic */ ViewPager.OnPageChangeListener m13145o1(HomeContentFragment homeContentFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p1 */
    public static /* synthetic */ void m13146p1(HomeContentFragment homeContentFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q1 */
    public static /* synthetic */ RelativeLayout m13147q1(HomeContentFragment homeContentFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r1 */
    public static /* synthetic */ RelativeLayout m13148r1(HomeContentFragment homeContentFragment, RelativeLayout relativeLayout) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s1 */
    public static /* synthetic */ AbstractC2208p m13149s1(HomeContentFragment homeContentFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t1 */
    public static /* synthetic */ AbstractC2208p m13150t1(HomeContentFragment homeContentFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u1 */
    public static /* synthetic */ LinearLayout m13151u1(HomeContentFragment homeContentFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ LinearLayout m13152v1(HomeContentFragment homeContentFragment, LinearLayout linearLayout) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w1 */
    public static /* synthetic */ InterfaceC2229a.d m13153w1(HomeContentFragment homeContentFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ C4898np m13154x1(HomeContentFragment homeContentFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A1 */
    public final void m13155A1(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B1 */
    public final void m13156B1(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C1 */
    public final ArrayList<AbstractC5157p6> m13157C1(List<C4650k3> list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D1 */
    public final void m13158D1(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E1 */
    public final void m13159E1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F1 */
    public final BaseHomeItemFragment m13160F1(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G1 */
    public final AbstractC2208p m13161G1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H1 */
    public final void m13162H1(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I1 */
    public final void m13163I1() {
    }

    /* JADX INFO: renamed from: J1 */
    public final void m13164J1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K1 */
    public final void m13165K1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L1 */
    public final void m13166L1(LayoutInflater layoutInflater, int i, C4961op c4961op, BaseHomeItemFragment baseHomeItemFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M1 */
    public final /* synthetic */ void m13167M1(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m13168O1(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P1 */
    public final void m13169P1(RecyclerView recyclerView, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q1 */
    public final boolean m13170Q1(View view) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment.InterfaceC2007k
    /* JADX INFO: renamed from: R */
    public void mo12050R() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R1 */
    public final boolean m13171R1(Fragment fragment) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S1 */
    public void m13172S1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: T1 */
    public final Fragment m13173T1(C4898np c4898np, C5202pp c5202pp) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U1 */
    public final boolean m13174U1(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment.InterfaceC2007k
    /* JADX INFO: renamed from: V */
    public void mo12051V(RecyclerView recyclerView, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V1 */
    public final void m13175V1(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W1 */
    public final void m13176W1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X1 */
    public final void m13177X1(String str, RadioButton radioButton, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y1 */
    public final void m13178Y1(int i, RadioButton radioButton) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z1 */
    public void m13179Z1(C4898np c4898np) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a2 */
    public void m13180a2(List<C4961op> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b2 */
    public void m13181b2(InterfaceC2229a.d dVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.home.InterfaceC2229a.b
    /* JADX INFO: renamed from: k0 */
    public boolean mo13182k0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0037
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
        /*
            r2 = this;
            return
        L5d:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.home.HomeContentFragment.onClick(android.view.View):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC5354s6
    /* JADX INFO: renamed from: u0 */
    public /* bridge */ /* synthetic */ void mo13183u0(InterfaceC2229a.d dVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y1 */
    public final void m13184y1(LayoutInflater layoutInflater, String str, int i, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.home.InterfaceC2229a.b
    /* JADX INFO: renamed from: z */
    public void mo13185z() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment.InterfaceC2007k
    /* JADX INFO: renamed from: z0 */
    public void mo12052z0(RecyclerView recyclerView, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z1 */
    public final void m13186z1() {
    }
}
