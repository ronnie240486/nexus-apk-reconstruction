package android.media.ViviTV.viewholders;

import android.media.ViviTV.widget.ExtendedRelativeLayout;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.leochuan.AutoPlayRecyclerView;
import com.leochuan.ScaleLayoutManager;
import com.leochuan.ViewPagerLayoutManager;
import com.p010rd.PageIndicatorView;
import java.util.List;
import p000.C4182cp;
import p000.InterfaceC5747xq;

/* JADX INFO: loaded from: classes.dex */
public class ViewHolderBannerPager extends BaseHomeRecyclerViewHolder implements InterfaceC5747xq, ExtendedRelativeLayout.InterfaceC2364a, ViewPagerLayoutManager.InterfaceC3871a {

    /* JADX INFO: renamed from: n */
    public AutoPlayRecyclerView f9781n;

    /* JADX INFO: renamed from: o */
    public List<C4182cp.a> f9782o;

    /* JADX INFO: renamed from: p */
    public ExtendedRelativeLayout f9783p;

    /* JADX INFO: renamed from: q */
    public ScaleLayoutManager f9784q;

    /* JADX INFO: renamed from: r */
    public PageIndicatorView f9785r;

    /* JADX INFO: renamed from: android.media.ViviTV.viewholders.ViewHolderBannerPager$a */
    public static class C2342a extends RecyclerView.Adapter<C2343b> {

        /* JADX INFO: renamed from: a */
        public List<C4182cp.a> f9786a;

        /* JADX WARN: Invalid debug info offset */
        public C2342a(List<C4182cp.a> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public void m14305d(C2343b c2343b, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public C2343b m14306h(ViewGroup viewGroup, int i) {
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

    /* JADX INFO: renamed from: android.media.ViviTV.viewholders.ViewHolderBannerPager$b */
    public static class C2343b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public ImageView f9787a;

        /* JADX WARN: Invalid debug info offset */
        public C2343b(View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public void m14307k(C4182cp.a aVar) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public ViewHolderBannerPager(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.viewholders.BaseHomeRecyclerViewHolder
    /* JADX INFO: renamed from: C */
    public void mo14292C(C4182cp c4182cp) {
    }

    @Deprecated
    /* JADX INFO: renamed from: I */
    public void m14304I(int i) {
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

    @Override // cn.dolit.twowayviewlib.viewholders.BaseRecyclerViewHolder
    /* JADX INFO: renamed from: o */
    public boolean mo14302o() {
        return false;
    }

    @Override // com.leochuan.ViewPagerLayoutManager.InterfaceC3871a
    public void onPageScrollStateChanged(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.leochuan.ViewPagerLayoutManager.InterfaceC3871a
    public void onPageSelected(int i) {
    }
}
