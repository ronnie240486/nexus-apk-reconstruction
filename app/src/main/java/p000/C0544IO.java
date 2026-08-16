package p000;

import android.content.Context;
import android.media.ViviTV.databinding.LayoutReviewSeekBinding;
import android.media.ViviTV.model.persistent.EpgItemInfo;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import cn.dolit.baselibrary.utils.SafePopupWindow;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: IO */
/* JADX INFO: loaded from: classes.dex */
public class C0544IO extends SafePopupWindow implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: o */
    public static final int f1231o = 1500;

    /* JADX INFO: renamed from: d */
    public Context f1232d;

    /* JADX INFO: renamed from: e */
    public LayoutReviewSeekBinding f1233e;

    /* JADX INFO: renamed from: f */
    public int f1234f;

    /* JADX INFO: renamed from: g */
    public InterfaceC0635Jq f1235g;

    /* JADX INFO: renamed from: h */
    public EpgItemInfo f1236h;

    /* JADX INFO: renamed from: i */
    public long f1237i;

    /* JADX INFO: renamed from: j */
    public View.OnKeyListener f1238j;

    /* JADX INFO: renamed from: k */
    public Timer f1239k;

    /* JADX INFO: renamed from: l */
    public boolean f1240l;

    /* JADX INFO: renamed from: m */
    public Runnable f1241m;

    /* JADX INFO: renamed from: n */
    public View.OnKeyListener f1242n;

    /* JADX INFO: renamed from: IO$a */
    public class a extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0544IO f1243a;

        /* JADX WARN: Invalid debug info offset */
        public a(C0544IO c0544io) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m2565a(a aVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m2566b() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C0544IO(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ boolean m2545k(C0544IO c0544io, View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m2546l(C0544IO c0544io) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ LayoutReviewSeekBinding m2547m(C0544IO c0544io) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ boolean m2548n(C0544IO c0544io) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m2549o(C0544IO c0544io) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    private void m2550u() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public final void m2551A() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public final void m2552B() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.PopupWindow
    public void dismiss() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // cn.dolit.baselibrary.utils.SafePopupWindow
    /* JADX INFO: renamed from: e */
    public void mo2553e() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m2554g() {
        /*
            r3 = this;
            return
        L2a:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0544IO.m2554g():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public final void m2555p() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public View.OnKeyListener m2556q() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public InterfaceC0635Jq m2557r() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public float m2558s() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public final void m2559t() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public final /* synthetic */ boolean m2560v(View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public void m2561w(EpgItemInfo epgItemInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public void m2562x(View.OnKeyListener onKeyListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public void m2563y(InterfaceC0635Jq interfaceC0635Jq) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public final void m2564z(int i, boolean z) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
