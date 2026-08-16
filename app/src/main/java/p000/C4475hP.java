package p000;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import cn.dolit.baselibrary.utils.SafePopupWindow;
import java.util.ArrayList;

/* JADX INFO: renamed from: hP */
/* JADX INFO: loaded from: classes.dex */
public class C4475hP extends SafePopupWindow implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: d */
    public int f14308d;

    /* JADX INFO: renamed from: e */
    public Context f14309e;

    /* JADX INFO: renamed from: f */
    public Handler f14310f;

    /* JADX INFO: renamed from: g */
    public int f14311g;

    /* JADX INFO: renamed from: h */
    public String[] f14312h;

    /* JADX INFO: renamed from: i */
    public String[] f14313i;

    /* JADX INFO: renamed from: j */
    public String[] f14314j;

    /* JADX INFO: renamed from: k */
    public String[] f14315k;

    /* JADX INFO: renamed from: l */
    public C4285eP f14316l;

    /* JADX INFO: renamed from: m */
    public ArrayList<String> f14317m;

    /* JADX INFO: renamed from: n */
    public ListView f14318n;

    /* JADX INFO: renamed from: o */
    public ListView f14319o;

    /* JADX INFO: renamed from: p */
    public ListView f14320p;

    /* JADX INFO: renamed from: q */
    public ListView f14321q;

    /* JADX INFO: renamed from: r */
    public ListView f14322r;

    /* JADX INFO: renamed from: s */
    public b f14323s;

    /* JADX INFO: renamed from: t */
    public Runnable f14324t;

    /* JADX INFO: renamed from: u */
    public String f14325u;

    /* JADX INFO: renamed from: hP$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C4475hP f14326a;

        /* JADX WARN: Invalid debug info offset */
        public a(C4475hP c4475hP) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: hP$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo13086a(int[] iArr);

        /* JADX INFO: renamed from: b */
        void mo13087b(int i);

        /* JADX INFO: renamed from: c */
        void mo13088c(int i);

        /* JADX INFO: renamed from: d */
        void mo13089d(int i);

        /* JADX INFO: renamed from: e */
        C0740LQ mo13090e();
    }

    /* JADX WARN: Invalid debug info offset */
    public C4475hP(Context context, Handler handler, b bVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    private void m21000k() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public final void m21001l() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public final void m21002m() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public void m21003n(ArrayList<String> arrayList) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x00bc
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: o */
    public final void m21004o() {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4475hP.m21004o():void");
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
