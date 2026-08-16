package p000;

import android.content.Context;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import cn.dolit.baselibrary.utils.SafePopupWindow;

/* JADX INFO: renamed from: z30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6099z30 extends SafePopupWindow {

    /* JADX INFO: renamed from: v */
    public static final int f19642v = 100;

    /* JADX INFO: renamed from: w */
    public static final int f19643w = 101;

    /* JADX INFO: renamed from: x */
    public static final int f19644x = 10000;

    /* JADX INFO: renamed from: y */
    public static final int f19645y = 10000;

    /* JADX INFO: renamed from: d */
    public Context f19646d;

    /* JADX INFO: renamed from: e */
    public InterfaceC4313er f19647e;

    /* JADX INFO: renamed from: f */
    public Handler f19648f;

    /* JADX INFO: renamed from: g */
    public SeekBar f19649g;

    /* JADX INFO: renamed from: h */
    public View f19650h;

    /* JADX INFO: renamed from: i */
    public TextView f19651i;

    /* JADX INFO: renamed from: j */
    public TextView f19652j;

    /* JADX INFO: renamed from: k */
    public TextView f19653k;

    /* JADX INFO: renamed from: l */
    public boolean f19654l;

    /* JADX INFO: renamed from: m */
    public int f19655m;

    /* JADX INFO: renamed from: n */
    public int f19656n;

    /* JADX INFO: renamed from: o */
    public boolean f19657o;

    /* JADX INFO: renamed from: p */
    public boolean f19658p;

    /* JADX INFO: renamed from: q */
    public DisplayMetrics f19659q;

    /* JADX INFO: renamed from: r */
    public InterfaceC5833f f19660r;

    /* JADX INFO: renamed from: s */
    public Runnable f19661s;

    /* JADX INFO: renamed from: t */
    public Runnable f19662t;

    /* JADX INFO: renamed from: u */
    public Runnable f19663u;

    /* JADX INFO: renamed from: z30$a */
    public class ViewOnKeyListenerC5828a implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6099z30 f19664a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC5828a(C6099z30 c6099z30) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: z30$b */
    public class C5829b implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a */
        public long f19665a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C6099z30 f19666b;

        /* JADX WARN: Invalid debug info offset */
        public C5829b(C6099z30 c6099z30) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: renamed from: z30$c */
    public class RunnableC5830c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6099z30 f19667a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC5830c(C6099z30 c6099z30) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: z30$d */
    public class RunnableC5831d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6099z30 f19668a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC5831d(C6099z30 c6099z30) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: z30$e */
    public class RunnableC5832e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6099z30 f19669a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC5832e(C6099z30 c6099z30) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: z30$f */
    public interface InterfaceC5833f {
        /* JADX INFO: renamed from: a */
        View mo13084a();

        /* JADX INFO: renamed from: b */
        void mo13085b(int i);

        void seekTo(int i);
    }

    /* JADX WARN: Invalid debug info offset */
    public C6099z30(Context context, InterfaceC4313er interfaceC4313er, Handler handler, boolean z, InterfaceC5833f interfaceC5833f) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Runnable m29928k(C6099z30 c6099z30) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Handler m29929l(C6099z30 c6099z30) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ TextView m29930m(C6099z30 c6099z30) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Runnable m29931n(C6099z30 c6099z30) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ boolean m29932o(C6099z30 c6099z30) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ boolean m29933p(C6099z30 c6099z30) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ InterfaceC5833f m29934q(C6099z30 c6099z30) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ boolean m29935r(C6099z30 c6099z30) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ boolean m29936s(C6099z30 c6099z30, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ InterfaceC4313er m29937t(C6099z30 c6099z30) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ int m29938u(C6099z30 c6099z30) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ int m29939v(C6099z30 c6099z30) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ TextView m29940w(C6099z30 c6099z30) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public int m29941A() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public final void m29942B(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public void m29943C(InterfaceC4313er interfaceC4313er) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public void m29944D() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.PopupWindow
    public void dismiss() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // cn.dolit.baselibrary.utils.SafePopupWindow, android.widget.PopupWindow
    public void showAtLocation(View view, int i, int i2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public void m29945x() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public void m29946y(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public void m29947z(Boolean bool) {
    }
}
