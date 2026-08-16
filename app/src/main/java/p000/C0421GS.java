package p000;

import android.content.Context;
import android.media.ViviTV.databinding.LayoutSpeedSelectionWindowBinding;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import cn.dolit.baselibrary.utils.SafePopupWindow;
import java.util.List;

/* JADX INFO: renamed from: GS */
/* JADX INFO: loaded from: classes.dex */
public class C0421GS extends SafePopupWindow implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: d */
    public Context f896d;

    /* JADX INFO: renamed from: e */
    public List<EnumC0358FS> f897e;

    /* JADX INFO: renamed from: f */
    public EnumC0358FS f898f;

    /* JADX INFO: renamed from: g */
    public a f899g;

    /* JADX INFO: renamed from: h */
    public b f900h;

    /* JADX INFO: renamed from: i */
    public LayoutSpeedSelectionWindowBinding f901i;

    /* JADX INFO: renamed from: GS$a */
    public interface a {
        /* JADX INFO: renamed from: O */
        void mo2066O(EnumC0358FS enumC0358FS);
    }

    /* JADX INFO: renamed from: GS$b */
    public class b extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public Context f902a;

        /* JADX INFO: renamed from: b */
        public List<EnumC0358FS> f903b;

        /* JADX INFO: renamed from: c */
        public int f904c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C0421GS f905d;

        /* JADX WARN: Invalid debug info offset */
        public b(C0421GS c0421gs, Context context, List<EnumC0358FS> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m2067a(int i) {
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
    public C0421GS(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    private void m2061k(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    private void m2062l() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public void m2063m(a aVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public void m2064n(EnumC0358FS enumC0358FS) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public void m2065o(List<EnumC0358FS> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // cn.dolit.baselibrary.utils.SafePopupWindow, android.widget.PopupWindow
    public void showAtLocation(View view, int i, int i2, int i3) {
    }
}
