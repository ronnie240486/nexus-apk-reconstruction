package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: renamed from: Gu */
/* JADX INFO: loaded from: classes.dex */
public class C0449Gu extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public Context f988a;

    /* JADX INFO: renamed from: b */
    public List<C0386Fu> f989b;

    /* JADX INFO: renamed from: c */
    public b f990c;

    /* JADX INFO: renamed from: d */
    public View.OnClickListener f991d;

    /* JADX INFO: renamed from: Gu$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0449Gu f992a;

        /* JADX WARN: Invalid debug info offset */
        public a(C0449Gu c0449Gu) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: Gu$b */
    public interface b {
        /* JADX INFO: renamed from: D */
        void mo2185D(C0386Fu c0386Fu);
    }

    /* JADX INFO: renamed from: Gu$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public C0386Fu f993a;

        /* JADX INFO: renamed from: b */
        public TextView f994b;

        /* JADX INFO: renamed from: c */
        public int f995c;

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ TextView m2186a(c cVar) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ TextView m2187b(c cVar, TextView textView) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ int m2188c(c cVar, int i) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public C0386Fu m2189d() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public int m2190e() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public TextView m2191f() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g */
        public void m2192g(C0386Fu c0386Fu) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public void m2193h(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: i */
        public void m2194i(TextView textView) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C0449Gu(Context context, List<C0386Fu> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ b m2183a(C0449Gu c0449Gu) {
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public void m2184b(b bVar) {
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
