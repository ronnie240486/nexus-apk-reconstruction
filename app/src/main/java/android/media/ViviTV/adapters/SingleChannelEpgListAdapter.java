package android.media.ViviTV.adapters;

import android.content.Context;
import android.media.ViviTV.model.persistent.EpgItemInfo;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.viewpager.widget.PagerAdapter;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SingleChannelEpgListAdapter extends PagerAdapter implements View.OnKeyListener, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: e */
    public static final boolean f5793e = true;

    /* JADX INFO: renamed from: a */
    public Context f5794a;

    /* JADX INFO: renamed from: b */
    public List<String> f5795b;

    /* JADX INFO: renamed from: c */
    public HashMap<String, List<EpgItemInfo>> f5796c;

    /* JADX INFO: renamed from: d */
    public InterfaceC1983a f5797d;

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.SingleChannelEpgListAdapter$a */
    public interface InterfaceC1983a {
        /* JADX INFO: renamed from: l */
        void mo9683l(EpgItemInfo epgItemInfo);

        /* JADX INFO: renamed from: w */
        boolean mo9689w(int i, View view);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.SingleChannelEpgListAdapter$b */
    public static class C1984b extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public Context f5798a;

        /* JADX INFO: renamed from: b */
        public List<EpgItemInfo> f5799b;

        /* JADX INFO: renamed from: c */
        public boolean f5800c;

        /* JADX WARN: Invalid debug info offset */
        public C1984b(Context context, List<EpgItemInfo> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m10699a(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.Adapter
        public int getCount() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public SingleChannelEpgListAdapter(Context context, HashMap<String, List<EpgItemInfo>> map, List<String> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m10698a(InterfaceC1983a interfaceC1983a) {
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
    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
    }
}
