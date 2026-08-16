package android.media.ViviTV.viewholders;

import android.content.Context;
import android.media.ViviTV.widget.ExtendedRelativeLayout;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.youth.banner.Banner;
import java.util.List;
import p000.AbstractC0510Hr;
import p000.C4182cp;
import p000.InterfaceC0700Kq;
import p000.InterfaceC5747xq;

/* JADX INFO: loaded from: classes.dex */
public class ViewHolderBanner extends BaseHomeRecyclerViewHolder implements InterfaceC5747xq, ViewPager.OnPageChangeListener, ExtendedRelativeLayout.InterfaceC2364a, InterfaceC0700Kq {

    /* JADX INFO: renamed from: r */
    public static C2341b f9776r = new C2341b(null);

    /* JADX INFO: renamed from: n */
    public Banner f9777n;

    /* JADX INFO: renamed from: o */
    public int f9778o;

    /* JADX INFO: renamed from: p */
    public List<C4182cp.a> f9779p;

    /* JADX INFO: renamed from: q */
    public ExtendedRelativeLayout f9780q;

    /* JADX INFO: renamed from: android.media.ViviTV.viewholders.ViewHolderBanner$b */
    public static final class C2341b extends AbstractC0510Hr {
        /* JADX WARN: Invalid debug info offset */
        public C2341b() {
        }

        /* JADX WARN: Invalid debug info offset */
        public C2341b(C2340a c2340a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC0510Hr, p000.InterfaceC0573Ir
        /* JADX INFO: renamed from: B6 */
        public /* bridge */ /* synthetic */ View mo2401B6(Context context) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0573Ir
        /* JADX INFO: renamed from: Z2 */
        public /* bridge */ /* synthetic */ void mo2722Z2(Context context, Object obj, View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC0510Hr
        /* JADX INFO: renamed from: a */
        public ImageView mo2402a(Context context) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m14303b(Context context, Object obj, ImageView imageView) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public ViewHolderBanner(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.viewholders.BaseHomeRecyclerViewHolder
    /* JADX INFO: renamed from: C */
    public void mo14292C(C4182cp c4182cp) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC5747xq
    /* JADX INFO: renamed from: c */
    public String mo14301c() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.widget.ExtendedRelativeLayout.InterfaceC2364a
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    @Override // p000.InterfaceC0700Kq
    /* JADX INFO: renamed from: e */
    public void mo3291e(View view, int i) {
    }

    @Override // p000.InterfaceC0700Kq
    /* JADX INFO: renamed from: f */
    public void mo3292f(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0700Kq
    /* JADX INFO: renamed from: g */
    public boolean mo3293g(boolean z) {
        return false;
    }

    @Override // cn.dolit.twowayviewlib.viewholders.BaseRecyclerViewHolder
    /* JADX INFO: renamed from: o */
    public boolean mo14302o() {
        return false;
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
