package android.media.ViviTV.viewholders;

import android.content.Context;
import android.media.ViviTV.widget.ExtendedRelativeLayout;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.youth.banner.Banner;
import java.util.List;
import p000.AbstractC0510Hr;
import p000.C4182cp;
import p000.InterfaceC5747xq;

/* JADX INFO: loaded from: classes.dex */
public class ViewHolderBannerWithRightTitle extends BaseHomeRecyclerViewHolder implements InterfaceC5747xq, ViewPager.OnPageChangeListener, ExtendedRelativeLayout.InterfaceC2364a, RadioGroup.OnCheckedChangeListener {

    /* JADX INFO: renamed from: t */
    public static C2347d f9788t = new C2347d(null);

    /* JADX INFO: renamed from: n */
    public Banner f9789n;

    /* JADX INFO: renamed from: o */
    public int f9790o;

    /* JADX INFO: renamed from: p */
    public List<C4182cp.a> f9791p;

    /* JADX INFO: renamed from: q */
    public ExtendedRelativeLayout f9792q;

    /* JADX INFO: renamed from: r */
    public RadioGroup f9793r;

    /* JADX INFO: renamed from: s */
    public int f9794s;

    /* JADX INFO: renamed from: android.media.ViviTV.viewholders.ViewHolderBannerWithRightTitle$b */
    public class C2345b extends RecyclerView.Adapter<C2346c> {

        /* JADX INFO: renamed from: a */
        public List<C4182cp.a> f9795a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewHolderBannerWithRightTitle f9796b;

        /* JADX WARN: Invalid debug info offset */
        public C2345b(ViewHolderBannerWithRightTitle viewHolderBannerWithRightTitle, List<C4182cp.a> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public void m14312d(C2346c c2346c, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public C2346c m14313h(ViewGroup viewGroup, int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return null;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.viewholders.ViewHolderBannerWithRightTitle$c */
    public class C2346c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public TextView f9797a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewHolderBannerWithRightTitle f9798b;

        /* JADX WARN: Invalid debug info offset */
        public C2346c(ViewHolderBannerWithRightTitle viewHolderBannerWithRightTitle, View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public static /* synthetic */ void m14314k(C2346c c2346c, C4182cp.a aVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: l */
        private void m14315l(C4182cp.a aVar) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.viewholders.ViewHolderBannerWithRightTitle$d */
    public static final class C2347d extends AbstractC0510Hr {
        /* JADX WARN: Invalid debug info offset */
        public C2347d() {
        }

        /* JADX WARN: Invalid debug info offset */
        public C2347d(C2344a c2344a) {
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
        public void m14316b(Context context, Object obj, ImageView imageView) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public ViewHolderBannerWithRightTitle(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.viewholders.BaseHomeRecyclerViewHolder
    /* JADX INFO: renamed from: C */
    public void mo14292C(C4182cp c4182cp) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public final void m14308I(C4182cp c4182cp) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public final void m14309J() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public final void m14310K() {
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

    /* JADX WARN: Invalid debug info offset */
    @Override // cn.dolit.twowayviewlib.viewholders.BaseRecyclerViewHolder
    /* JADX INFO: renamed from: l */
    public void mo14311l(boolean z) {
    }

    @Override // cn.dolit.twowayviewlib.viewholders.BaseRecyclerViewHolder
    /* JADX INFO: renamed from: o */
    public boolean mo14302o() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
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
