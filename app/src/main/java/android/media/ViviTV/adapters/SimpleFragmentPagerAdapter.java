package android.media.ViviTV.adapters;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: a */
    public List<Fragment> f5791a;

    /* JADX INFO: renamed from: b */
    public List<String> f5792b;

    /* JADX WARN: Invalid debug info offset */
    public SimpleFragmentPagerAdapter(FragmentManager fragmentManager, List<Fragment> list, List<String> list2) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(View view, int i, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.viewpager.widget.PagerAdapter
    @Nullable
    public CharSequence getPageTitle(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.viewpager.widget.PagerAdapter
    public float getPageWidth(int i) {
        return 0.0f;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
    }
}
