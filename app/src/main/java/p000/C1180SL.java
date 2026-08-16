package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: renamed from: SL */
/* JADX INFO: loaded from: classes.dex */
public class C1180SL extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public Context f3086a;

    /* JADX INFO: renamed from: b */
    public List<C1245TL> f3087b;

    /* JADX INFO: renamed from: SL$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public TextView f3088a;

        /* JADX INFO: renamed from: b */
        public TextView f3089b;

        /* JADX INFO: renamed from: c */
        public TextView f3090c;

        /* JADX INFO: renamed from: d */
        public TextView f3091d;

        /* JADX INFO: renamed from: e */
        public TextView f3092e;
    }

    /* JADX WARN: Invalid debug info offset */
    public C1180SL(Context context, List<C1245TL> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m5477a(List<C1245TL> list) {
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
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

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return false;
    }
}
