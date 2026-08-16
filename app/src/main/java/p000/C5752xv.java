package p000;

import android.content.Context;
import android.media.ViviTV.model.persistent.LiveChannelInfo;
import android.media.ViviTV.model.persistent.LiveTypeInfo;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import cn.dolit.baselibrary.utils.SafePopupWindow;
import java.util.List;

/* JADX INFO: renamed from: xv */
/* JADX INFO: loaded from: classes.dex */
public class C5752xv extends SafePopupWindow {

    /* JADX INFO: renamed from: s */
    public static final String f19499s = "LiveChannelList";

    /* JADX INFO: renamed from: d */
    public Context f19500d;

    /* JADX INFO: renamed from: e */
    public List<LiveTypeInfo> f19501e;

    /* JADX INFO: renamed from: f */
    public int f19502f;

    /* JADX INFO: renamed from: g */
    public Handler f19503g;

    /* JADX INFO: renamed from: h */
    public C0124Bv f19504h;

    /* JADX INFO: renamed from: i */
    public int f19505i;

    /* JADX INFO: renamed from: j */
    public List<LiveChannelInfo> f19506j;

    /* JADX INFO: renamed from: k */
    public TextView f19507k;

    /* JADX INFO: renamed from: l */
    public ListView f19508l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f19509m;

    /* JADX INFO: renamed from: n */
    public TextView f19510n;

    /* JADX INFO: renamed from: o */
    public TextView f19511o;

    /* JADX INFO: renamed from: p */
    public j f19512p;

    /* JADX INFO: renamed from: q */
    public Runnable f19513q;

    /* JADX INFO: renamed from: r */
    public Runnable f19514r;

    /* JADX INFO: renamed from: xv$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C5752xv f19515a;

        /* JADX WARN: Invalid debug info offset */
        public a(C5752xv c5752xv) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: xv$b */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C5752xv f19516a;

        /* JADX WARN: Invalid debug info offset */
        public b(C5752xv c5752xv) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: xv$c */
    public class c implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C5752xv f19517a;

        /* JADX WARN: Invalid debug info offset */
        public c(C5752xv c5752xv) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: xv$e */
    public class e implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C5752xv f19519a;

        /* JADX WARN: Invalid debug info offset */
        public e(C5752xv c5752xv) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: xv$f */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C5752xv f19520a;

        /* JADX WARN: Invalid debug info offset */
        public f(C5752xv c5752xv) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: xv$g */
    public class g implements AsyncTaskC4636jq.a<Bundle> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f19521a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C5752xv f19522b;

        /* JADX WARN: Invalid debug info offset */
        public g(C5752xv c5752xv, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AsyncTaskC4636jq.a
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ Bundle mo3494a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public Bundle m29705b() {
            return null;
        }
    }

    /* JADX INFO: renamed from: xv$h */
    public class h implements AsyncTaskC4636jq.b<Bundle> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C5752xv f19523a;

        /* JADX WARN: Invalid debug info offset */
        public h(C5752xv c5752xv) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AsyncTaskC4636jq.b
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ void mo3496a(Bundle bundle) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m29706b(Bundle bundle) {
        }
    }

    /* JADX INFO: renamed from: xv$i */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C5752xv f19524a;

        /* JADX WARN: Invalid debug info offset */
        public i(C5752xv c5752xv) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: xv$j */
    public class j extends LinearLayout {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C5752xv f19525a;

        /* JADX WARN: Invalid debug info offset */
        public j(C5752xv c5752xv, Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        public j(C5752xv c5752xv, Context context, AttributeSet attributeSet) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C5752xv(Context context, Handler handler) {
    }

    /* JADX WARN: Invalid debug info offset */
    public C5752xv(Context context, Handler handler, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Handler m29688k(C5752xv c5752xv) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ int m29689l(C5752xv c5752xv) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Runnable m29690m(C5752xv c5752xv) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ ListView m29691n(C5752xv c5752xv) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ C0124Bv m29692o(C5752xv c5752xv) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m29693p(C5752xv c5752xv, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ j m29694q(C5752xv c5752xv) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Context m29695r(C5752xv c5752xv) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ TextView m29696s(C5752xv c5752xv) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ TextView m29697t(C5752xv c5752xv) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public final void m29698A(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.PopupWindow
    public void dismiss() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // cn.dolit.baselibrary.utils.SafePopupWindow, android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // cn.dolit.baselibrary.utils.SafePopupWindow, android.widget.PopupWindow
    public void showAtLocation(View view, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public void m29699u() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public void m29700v() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public final void m29701w(int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public void m29702x() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public void m29703y(String str, int i2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public void m29704z() {
    }

    /* JADX INFO: renamed from: xv$d */
    public class d implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C5752xv f19518a;

        /* JADX WARN: Invalid debug info offset */
        public d(C5752xv c5752xv) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }
}
