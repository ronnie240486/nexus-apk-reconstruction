package p000;

import android.content.Context;
import android.media.AudioManager;
import android.media.ViviTV.databinding.LayoutVodOperationWindowBinding;
import android.media.ViviTV.widget.HorizontalRecyclerView;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.recyclerview.widget.RecyclerView;
import cn.dolit.baselibrary.utils.SafePopupWindow;
import java.util.TimerTask;
import net.soulwolf.widget.ratiolayout.widget.RatioImageView;

/* JADX INFO: loaded from: classes.dex */
public class C30 extends SafePopupWindow implements SeekBar.OnSeekBarChangeListener, View.OnClickListener, View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, View.OnFocusChangeListener {

    /* JADX INFO: renamed from: I */
    public static final boolean f365I = false;

    /* JADX INFO: renamed from: J */
    public static int f366J = 5000;

    /* JADX INFO: renamed from: K */
    public static final int f367K = 6000;

    /* JADX INFO: renamed from: L */
    public static final int f368L = 3000;

    /* JADX INFO: renamed from: M */
    public static boolean f369M = false;

    /* JADX INFO: renamed from: N */
    public static final int f370N = 10;

    /* JADX INFO: renamed from: A */
    public AudioManager f371A;

    /* JADX INFO: renamed from: B */
    public EnumC0141h f372B;

    /* JADX INFO: renamed from: C */
    public Runnable f373C;

    /* JADX INFO: renamed from: D */
    public Runnable f374D;

    /* JADX INFO: renamed from: E */
    public HorizontalRecyclerView.InterfaceC2365a f375E;

    /* JADX INFO: renamed from: F */
    public RecyclerView.OnScrollListener f376F;

    /* JADX INFO: renamed from: G */
    public AbstractViewOnTouchListenerC0140g f377G;

    /* JADX INFO: renamed from: H */
    public Runnable f378H;

    /* JADX INFO: renamed from: d */
    public Context f379d;

    /* JADX INFO: renamed from: e */
    public InterfaceC4313er f380e;

    /* JADX INFO: renamed from: f */
    public Handler f381f;

    /* JADX INFO: renamed from: g */
    public View f382g;

    /* JADX INFO: renamed from: h */
    public boolean f383h;

    /* JADX INFO: renamed from: i */
    public int f384i;

    /* JADX INFO: renamed from: j */
    public long f385j;

    /* JADX INFO: renamed from: k */
    public InterfaceC0142i f386k;

    /* JADX INFO: renamed from: l */
    public RecyclerView.Adapter f387l;

    /* JADX INFO: renamed from: m */
    public int f388m;

    /* JADX INFO: renamed from: n */
    public boolean f389n;

    /* JADX INFO: renamed from: o */
    public Animation f390o;

    /* JADX INFO: renamed from: p */
    public Animation f391p;

    /* JADX INFO: renamed from: q */
    public boolean f392q;

    /* JADX INFO: renamed from: r */
    public boolean f393r;

    /* JADX INFO: renamed from: s */
    public View.OnKeyListener f394s;

    /* JADX INFO: renamed from: t */
    public String f395t;

    /* JADX INFO: renamed from: u */
    public int f396u;

    /* JADX INFO: renamed from: v */
    public int f397v;

    /* JADX INFO: renamed from: w */
    public LayoutVodOperationWindowBinding f398w;

    /* JADX INFO: renamed from: x */
    public boolean f399x;

    /* JADX INFO: renamed from: y */
    public C6085x30 f400y;

    /* JADX INFO: renamed from: z */
    public ImageView[] f401z;

    /* JADX INFO: renamed from: C30$a */
    public class RunnableC0134a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C30 f402a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC0134a(C30 c30) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: C30$b */
    public class RunnableC0135b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C30 f403a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC0135b(C30 c30) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: C30$c */
    public class C0136c implements HorizontalRecyclerView.InterfaceC2365a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C30 f404a;

        /* JADX WARN: Invalid debug info offset */
        public C0136c(C30 c30) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.widget.HorizontalRecyclerView.InterfaceC2365a
        /* JADX INFO: renamed from: N */
        public boolean mo884N(KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: C30$d */
    public class C0137d extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C30 f405a;

        /* JADX WARN: Invalid debug info offset */
        public C0137d(C30 c30) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: C30$e */
    public class C0138e extends AbstractViewOnTouchListenerC0140g {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C30 f406c;

        /* JADX WARN: Invalid debug info offset */
        public C0138e(C30 c30) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C30.AbstractViewOnTouchListenerC0140g
        /* JADX INFO: renamed from: a */
        public void mo885a(View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C30.AbstractViewOnTouchListenerC0140g
        /* JADX INFO: renamed from: b */
        public void mo886b(View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C30.AbstractViewOnTouchListenerC0140g
        /* JADX INFO: renamed from: c */
        public void mo887c(View view) {
        }
    }

    /* JADX INFO: renamed from: C30$f */
    public class RunnableC0139f implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C30 f407a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC0139f(C30 c30) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: C30$h */
    public enum EnumC0141h {
        SEEK_BAR
    }

    /* JADX INFO: renamed from: C30$i */
    public interface InterfaceC0142i {
        /* JADX INFO: renamed from: a */
        String mo888a();

        /* JADX INFO: renamed from: b */
        View mo889b();

        /* JADX INFO: renamed from: c */
        void mo890c();

        /* JADX INFO: renamed from: d */
        String mo891d();

        /* JADX INFO: renamed from: e */
        void mo892e();

        /* JADX INFO: renamed from: f */
        void mo893f();

        /* JADX INFO: renamed from: g */
        String mo894g();

        /* JADX INFO: renamed from: h */
        void mo895h();

        /* JADX INFO: renamed from: i */
        void mo896i();

        /* JADX INFO: renamed from: j */
        void mo897j();

        /* JADX INFO: renamed from: k */
        void mo898k();

        /* JADX INFO: renamed from: l */
        void mo899l();

        /* JADX INFO: renamed from: m */
        RecyclerView.Adapter mo900m();

        /* JADX INFO: renamed from: n */
        String mo901n();
    }

    /* JADX WARN: Invalid debug info offset */
    public C30(Context context, InterfaceC4313er interfaceC4313er, InterfaceC0142i interfaceC0142i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h0 */
    private void m828h0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ boolean m829k(C30 c30) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ boolean m830l(C30 c30, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ boolean m831m(C30 c30) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ int m832n(C30 c30) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ boolean m833o(C30 c30, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ long m834p(C30 c30) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ InterfaceC4313er m835q(C30 c30) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ LayoutVodOperationWindowBinding m836r(C30 c30) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Runnable m837s(C30 c30) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ Handler m838t(C30 c30) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ Runnable m839u(C30 c30) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ int m840v(C30 c30) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ int m841w() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public final void m842A() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public final void m843B() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public int m844C() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public EnumC0141h m845D() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public ImageView m846E() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public RatioImageView m847F() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public int m848G() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public int m849H() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public final void m850I() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public final void m851J() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public final int m852K() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public final boolean m853L(int i, KeyEvent keyEvent, int i2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public void m854M() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public void m855N() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public void m856O() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public final void m857P() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q */
    public final void m858Q() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public final void m859R() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public final void m860S() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T */
    public final void m861T() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U */
    public void m862U() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public final void m863V(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W */
    public void m864W(String str, C6085x30 c6085x30) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X */
    public void m865X(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y */
    public void m866Y(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z */
    public void m867Z(View.OnKeyListener onKeyListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a0 */
    public void m868a0(EnumC0141h enumC0141h) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public void m869b0(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c0 */
    public int m870c0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d0 */
    public void m871d0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.PopupWindow
    public void dismiss() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e0 */
    public void m872e0(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f0 */
    public void m873f0(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public void m874g0(InterfaceC4313er interfaceC4313er) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // cn.dolit.baselibrary.utils.SafePopupWindow
    /* JADX INFO: renamed from: h */
    public void mo875h() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // cn.dolit.baselibrary.utils.SafePopupWindow
    /* JADX INFO: renamed from: i */
    public void mo876i(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i0 */
    public void m877i0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j0 */
    public void m878j0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public void m879k0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l0 */
    public void m880l0(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        return false;
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

    /* JADX WARN: Invalid debug info offset */
    @Override // cn.dolit.baselibrary.utils.SafePopupWindow, android.widget.PopupWindow
    public void showAtLocation(View view, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: x */
    public final boolean m881x() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public void m882y(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public final void m883z() {
    }

    /* JADX INFO: renamed from: C30$g */
    public static abstract class AbstractViewOnTouchListenerC0140g implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public int f408a;

        /* JADX INFO: renamed from: b */
        public C5176pP f409b;

        /* JADX INFO: renamed from: C30$g$a */
        public class a extends TimerTask {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f410a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractViewOnTouchListenerC0140g f411b;

            /* JADX WARN: Invalid debug info offset */
            public a(AbstractViewOnTouchListenerC0140g abstractViewOnTouchListenerC0140g, View view) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public AbstractViewOnTouchListenerC0140g() {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ AbstractViewOnTouchListenerC0140g(RunnableC0134a runnableC0134a) {
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo885a(View view);

        /* JADX INFO: renamed from: c */
        public abstract void mo887c(View view);

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public void mo886b(View view) {
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
    }
}
