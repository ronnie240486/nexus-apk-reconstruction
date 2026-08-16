package android.media.ViviTV.adapters;

import android.content.Context;
import android.media.ViviTV.fragmens.BaseHomeItemFragment;
import android.media.ViviTV.fragmens.HomeItemFragment;
import android.media.ViviTV.fragmens.HomeLiveItemFragment;
import android.media.ViviTV.fragmens.HomeMatchItemFragment;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.List;
import p000.C4961op;

/* JADX INFO: loaded from: classes.dex */
public class HomeFragmentPagerAdapter extends FragmentStatePagerAdapter {

    /* JADX INFO: renamed from: k */
    public static String f5620k = "android.media.ViviTV.adapters.HomeFragmentPagerAdapter";

    /* JADX INFO: renamed from: a */
    public SparseArray<Fragment> f5621a;

    /* JADX INFO: renamed from: b */
    public Context f5622b;

    /* JADX INFO: renamed from: c */
    public List<C4961op> f5623c;

    /* JADX INFO: renamed from: d */
    public BaseHomeItemFragment.InterfaceC2007k f5624d;

    /* JADX INFO: renamed from: e */
    public SparseArray<View> f5625e;

    /* JADX INFO: renamed from: f */
    public FragmentManager f5626f;

    /* JADX INFO: renamed from: g */
    public InterfaceC1949a f5627g;

    /* JADX INFO: renamed from: h */
    public HomeItemFragment f5628h;

    /* JADX INFO: renamed from: i */
    public HomeLiveItemFragment f5629i;

    /* JADX INFO: renamed from: j */
    public HomeMatchItemFragment f5630j;

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.HomeFragmentPagerAdapter$a */
    public interface InterfaceC1949a {
        /* JADX INFO: renamed from: a */
        void mo6635a(int i);
    }

    /* JADX WARN: Invalid debug info offset */
    public HomeFragmentPagerAdapter(@NonNull FragmentManager fragmentManager, List<C4961op> list, Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public InterfaceC1949a m10510a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public BaseHomeItemFragment.InterfaceC2007k m10511b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public Fragment m10512c(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    /* JADX INFO: renamed from: d */
    public final Fragment m10513d(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: e */
    public Fragment m10514e(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public SparseArray<View> m10515f() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public final BaseHomeItemFragment m10516g(LayoutInflater layoutInflater, int i, C4961op c4961op, BaseHomeItemFragment baseHomeItemFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public Fragment getItem(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final String m10517h(int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public final String m10518i(int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public void m10519j(InterfaceC1949a interfaceC1949a) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public void m10520k(BaseHomeItemFragment.InterfaceC2007k interfaceC2007k) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public void m10521l(SparseArray<View> sparseArray) {
    }
}
