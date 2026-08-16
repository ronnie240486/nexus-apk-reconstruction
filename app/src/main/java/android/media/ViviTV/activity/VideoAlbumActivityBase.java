package android.media.ViviTV.activity;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.media.ViviTV.fragmens.VodPlayFragment;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p000.C3032cM;
import p000.C5697x2;
import p000.D00;

/* JADX INFO: loaded from: classes.dex */
public abstract class VideoAlbumActivityBase extends BaseActivity implements AdapterView.OnItemClickListener, View.OnClickListener, VodPlayFragment.InterfaceC2178o0, View.OnKeyListener, VodPlayFragment.InterfaceC2176n0 {

    /* JADX INFO: renamed from: A */
    public ListView f5391A;

    /* JADX INFO: renamed from: B */
    public RelativeLayout f5392B;

    /* JADX INFO: renamed from: C */
    public FrameLayout f5393C;

    /* JADX INFO: renamed from: D */
    public VodPlayFragment f5394D;

    /* JADX INFO: renamed from: E */
    public C5697x2 f5395E;

    /* JADX INFO: renamed from: F */
    public C3032cM f5396F;

    /* JADX INFO: renamed from: G */
    public ImageView f5397G;

    /* JADX INFO: renamed from: H */
    public RelativeLayout f5398H;

    /* JADX INFO: renamed from: I */
    public int f5399I;

    /* JADX INFO: renamed from: J */
    public int f5400J;

    /* JADX INFO: renamed from: K */
    public boolean f5401K;

    /* JADX INFO: renamed from: L */
    public AdapterView.OnItemClickListener f5402L;

    /* JADX INFO: renamed from: M */
    public View.OnKeyListener f5403M;

    /* JADX INFO: renamed from: u */
    public D00 f5404u;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f5405v;

    /* JADX INFO: renamed from: w */
    public TextView f5406w;

    /* JADX INFO: renamed from: x */
    public Button f5407x;

    /* JADX INFO: renamed from: y */
    public Button f5408y;

    /* JADX INFO: renamed from: z */
    public ListView f5409z;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.VideoAlbumActivityBase$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC1915a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VideoAlbumActivityBase f5410a;

        /* JADX WARN: Invalid debug info offset */
        public ViewTreeObserverOnGlobalLayoutListenerC1915a(VideoAlbumActivityBase videoAlbumActivityBase) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.VideoAlbumActivityBase$b */
    public class C1916b implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VideoAlbumActivityBase f5411a;

        /* JADX WARN: Invalid debug info offset */
        public C1916b(VideoAlbumActivityBase videoAlbumActivityBase) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.VideoAlbumActivityBase$c */
    public class RunnableC1917c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5412a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VideoAlbumActivityBase f5413b;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC1917c(VideoAlbumActivityBase videoAlbumActivityBase, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.VideoAlbumActivityBase$d */
    public class C1918d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ValueAnimator f5414a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ValueAnimator f5415b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ValueAnimator f5416c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ValueAnimator f5417d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ VideoAlbumActivityBase f5418e;

        /* JADX WARN: Invalid debug info offset */
        public C1918d(VideoAlbumActivityBase videoAlbumActivityBase, ValueAnimator valueAnimator, ValueAnimator valueAnimator2, ValueAnimator valueAnimator3, ValueAnimator valueAnimator4) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.VideoAlbumActivityBase$e */
    public class C1919e implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5419a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f5420b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f5421c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f5422d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f5423e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ VideoAlbumActivityBase f5424f;

        /* JADX WARN: Invalid debug info offset */
        public C1919e(VideoAlbumActivityBase videoAlbumActivityBase, int i, int i2, int i3, int i4, boolean z) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.VideoAlbumActivityBase$f */
    public class ViewOnKeyListenerC1920f implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VideoAlbumActivityBase f5425a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC1920f(VideoAlbumActivityBase videoAlbumActivityBase) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ FrameLayout m10294P0(VideoAlbumActivityBase videoAlbumActivityBase) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ RelativeLayout m10295Q0(VideoAlbumActivityBase videoAlbumActivityBase) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ RelativeLayout m10296R0(VideoAlbumActivityBase videoAlbumActivityBase) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ int m10297S0(VideoAlbumActivityBase videoAlbumActivityBase) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ int m10298T0(VideoAlbumActivityBase videoAlbumActivityBase, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ C5697x2 m10299U0(VideoAlbumActivityBase videoAlbumActivityBase) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ VodPlayFragment m10300V0(VideoAlbumActivityBase videoAlbumActivityBase) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ boolean m10301W0(VideoAlbumActivityBase videoAlbumActivityBase) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ C3032cM m10302X0(VideoAlbumActivityBase videoAlbumActivityBase) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ ListView m10303Y0(VideoAlbumActivityBase videoAlbumActivityBase) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    private void m10304Z0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0039
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: d1 */
    private final void m10305d1() {
        /*
            r3 = this;
            return
        L3c:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.VideoAlbumActivityBase.m10305d1():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    private void m10306e1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g1 */
    private final boolean m10307g1() {
        return false;
    }

    @Override // android.media.ViviTV.fragmens.VodPlayFragment.InterfaceC2176n0
    /* JADX INFO: renamed from: E */
    public boolean mo10308E() {
        return true;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.VodPlayFragment.InterfaceC2178o0
    /* JADX INFO: renamed from: O */
    public void mo9634O(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a1 */
    public final void m10309a1() {
        /*
            r3 = this;
            return
        L19:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.VideoAlbumActivityBase.m10309a1():void");
    }

    /* JADX INFO: renamed from: b1 */
    public abstract void mo10291b1();

    /* JADX INFO: renamed from: c1 */
    public abstract int mo10292c1();

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    public final void m10310f1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    public final void m10311h1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0038
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: i1 */
    public final void m10312i1() {
        /*
            r10 = this;
            return
        L56:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.VideoAlbumActivityBase.m10312i1():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j1 */
    public final void m10313j1(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.VodPlayFragment.InterfaceC2178o0
    /* JADX INFO: renamed from: q */
    public void mo9641q(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity
    /* JADX INFO: renamed from: r0 */
    public boolean mo9569r0() {
        return false;
    }
}
