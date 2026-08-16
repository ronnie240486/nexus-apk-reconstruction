package p000;

import android.content.Context;
import android.media.ViviTV.databinding.LayoutQualitySelectionWindowBinding;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import cn.dolit.baselibrary.utils.SafePopupWindow;
import java.util.List;

/* JADX INFO: renamed from: bM */
/* JADX INFO: loaded from: classes.dex */
public class C2969bM extends SafePopupWindow implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: d */
    public Context f10184d;

    /* JADX INFO: renamed from: e */
    public List<EnumC0674KQ> f10185e;

    /* JADX INFO: renamed from: f */
    public EnumC0674KQ f10186f;

    /* JADX INFO: renamed from: g */
    public a f10187g;

    /* JADX INFO: renamed from: h */
    public b f10188h;

    /* JADX INFO: renamed from: i */
    public LayoutQualitySelectionWindowBinding f10189i;

    /* JADX INFO: renamed from: bM$a */
    public interface a {
        /* JADX INFO: renamed from: c */
        void mo12985c(EnumC0674KQ enumC0674KQ);
    }

    /* JADX INFO: renamed from: bM$b */
    public class b extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public Context f10190a;

        /* JADX INFO: renamed from: b */
        public List<EnumC0674KQ> f10191b;

        /* JADX INFO: renamed from: c */
        public int f10192c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C2969bM f10193d;

        /* JADX WARN: Invalid debug info offset */
        public b(C2969bM c2969bM, Context context, List<EnumC0674KQ> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m14631a(int i) {
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
    public C2969bM(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final void m14626k(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public final void m14627l() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public void m14628m(a aVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public void m14629n(EnumC0674KQ enumC0674KQ) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public void m14630o(List<EnumC0674KQ> list) {
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
