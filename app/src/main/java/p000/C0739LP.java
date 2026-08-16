package p000;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import cn.dolit.baselibrary.utils.SafePopupWindow;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: LP */
/* JADX INFO: loaded from: classes.dex */
public class C0739LP extends SafePopupWindow {

    /* JADX INFO: renamed from: d */
    public int f1801d;

    /* JADX INFO: renamed from: e */
    public Context f1802e;

    /* JADX INFO: renamed from: f */
    public Handler f1803f;

    /* JADX INFO: renamed from: g */
    public Button f1804g;

    /* JADX INFO: renamed from: h */
    public ListView f1805h;

    /* JADX INFO: renamed from: i */
    public String f1806i;

    /* JADX INFO: renamed from: j */
    public ArrayList<C0740LQ> f1807j;

    /* JADX INFO: renamed from: k */
    public DialogC1413Vv f1808k;

    /* JADX INFO: renamed from: l */
    public C0673KP f1809l;

    /* JADX INFO: renamed from: m */
    public C0740LQ f1810m;

    /* JADX INFO: renamed from: n */
    public boolean f1811n;

    /* JADX INFO: renamed from: o */
    public f f1812o;

    /* JADX INFO: renamed from: p */
    public Runnable f1813p;

    /* JADX INFO: renamed from: q */
    public String f1814q;

    /* JADX INFO: renamed from: r */
    public String f1815r;

    /* JADX INFO: renamed from: s */
    public File f1816s;

    /* JADX INFO: renamed from: t */
    public Runnable f1817t;

    /* JADX INFO: renamed from: LP$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0739LP f1818a;

        /* JADX WARN: Invalid debug info offset */
        public a(C0739LP c0739lp) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: LP$b */
    public class b implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0739LP f1819a;

        /* JADX WARN: Invalid debug info offset */
        public b(C0739LP c0739lp) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: LP$c */
    public class c implements AsyncTaskC4636jq.a<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0739LP f1820a;

        /* JADX WARN: Invalid debug info offset */
        public c(C0739LP c0739lp) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AsyncTaskC4636jq.a
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ Boolean mo3494a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public Boolean m3495b() {
            return null;
        }
    }

    /* JADX INFO: renamed from: LP$d */
    public class d implements AsyncTaskC4636jq.b<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0739LP f1821a;

        /* JADX WARN: Invalid debug info offset */
        public d(C0739LP c0739lp) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AsyncTaskC4636jq.b
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ void mo3496a(Boolean bool) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0010
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: b */
        public void m3497b(java.lang.Boolean r4) {
            /*
                r3 = this;
                return
            L1a:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0739LP.d.m3497b(java.lang.Boolean):void");
        }
    }

    /* JADX INFO: renamed from: LP$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0739LP f1822a;

        /* JADX WARN: Invalid debug info offset */
        public e(C0739LP c0739lp) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x001b
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.lang.Runnable
        public void run() {
            /*
                r5 = this;
                return
            L44:
            L46:
            L49:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0739LP.e.run():void");
        }
    }

    /* JADX INFO: renamed from: LP$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        void mo3498a(ArrayList<String> arrayList);

        /* JADX INFO: renamed from: b */
        void mo3499b(ArrayList<String> arrayList);

        /* JADX INFO: renamed from: c */
        void mo3500c();

        /* JADX INFO: renamed from: d */
        void mo3501d(boolean z);
    }

    /* JADX WARN: Invalid debug info offset */
    public C0739LP(Context context, ArrayList<C0740LQ> arrayList, Handler handler, String str, f fVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    private void m3476A() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    private void m3477B() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Handler m3478m(C0739LP c0739lp) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ DialogC1413Vv m3479n(C0739LP c0739lp) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m3480o(C0739LP c0739lp, ArrayList arrayList) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ C0740LQ m3481p(C0739LP c0739lp) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ C0740LQ m3482q(C0739LP c0739lp, C0740LQ c0740lq) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ C0673KP m3483r(C0739LP c0739lp) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Runnable m3484s(C0739LP c0739lp) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ int m3485t(C0739LP c0739lp) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ String m3486u(C0739LP c0739lp) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ boolean m3487v(C0739LP c0739lp) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ Context m3488w(C0739LP c0739lp) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public static /* synthetic */ String m3489x(C0739LP c0739lp) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    private void m3490z() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: k */
    public void m3491k(boolean r5) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0739LP.m3491k(boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public void m3492l(C0740LQ c0740lq) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // cn.dolit.baselibrary.utils.SafePopupWindow, android.widget.PopupWindow
    public void showAtLocation(View view, int i, int i2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public final void m3493y(ArrayList<String> arrayList) {
    }
}
