package android.media.ViviTV.activity;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.media.ViviTV.fragmens.VodPlayFragment;
import android.media.ViviTV.model.persistent.VodRecode;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p000.C5697x2;
import p000.C6082x00;
import p000.D00;

/* JADX INFO: loaded from: classes.dex */
public class VideoAlbumActivityV2 extends BaseActivity implements AdapterView.OnItemClickListener, View.OnClickListener, VodPlayFragment.InterfaceC2178o0, View.OnKeyListener, AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: A */
    public D00 f5426A;

    /* JADX INFO: renamed from: B */
    public VodPlayFragment f5427B;

    /* JADX INFO: renamed from: C */
    public C5697x2 f5428C;

    /* JADX INFO: renamed from: D */
    public ImageView f5429D;

    /* JADX INFO: renamed from: E */
    public ListView f5430E;

    /* JADX INFO: renamed from: F */
    public TextView f5431F;

    /* JADX INFO: renamed from: G */
    public SparseArray<D00> f5432G;

    /* JADX INFO: renamed from: H */
    public SparseArray<C5697x2> f5433H;

    /* JADX INFO: renamed from: I */
    public D00.C0203a f5434I;

    /* JADX INFO: renamed from: J */
    public ImageView f5435J;

    /* JADX INFO: renamed from: K */
    public Runnable f5436K;

    /* JADX INFO: renamed from: u */
    public RelativeLayout f5437u;

    /* JADX INFO: renamed from: v */
    public TextView f5438v;

    /* JADX INFO: renamed from: w */
    public ListView f5439w;

    /* JADX INFO: renamed from: x */
    public RelativeLayout f5440x;

    /* JADX INFO: renamed from: y */
    public FrameLayout f5441y;

    /* JADX INFO: renamed from: z */
    public D00 f5442z;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.VideoAlbumActivityV2$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC1921a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VideoAlbumActivityV2 f5443a;

        /* JADX WARN: Invalid debug info offset */
        public ViewTreeObserverOnGlobalLayoutListenerC1921a(VideoAlbumActivityV2 videoAlbumActivityV2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.VideoAlbumActivityV2$b */
    public class RunnableC1922b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VideoAlbumActivityV2 f5444a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC1922b(VideoAlbumActivityV2 videoAlbumActivityV2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.VideoAlbumActivityV2$c */
    public class C1923c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ValueAnimator f5445a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ValueAnimator f5446b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ValueAnimator f5447c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ValueAnimator f5448d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ VideoAlbumActivityV2 f5449e;

        /* JADX WARN: Invalid debug info offset */
        public C1923c(VideoAlbumActivityV2 videoAlbumActivityV2, ValueAnimator valueAnimator, ValueAnimator valueAnimator2, ValueAnimator valueAnimator3, ValueAnimator valueAnimator4) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.VideoAlbumActivityV2$d */
    public class C1924d implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5450a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f5451b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f5452c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f5453d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f5454e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ VideoAlbumActivityV2 f5455f;

        /* JADX WARN: Invalid debug info offset */
        public C1924d(VideoAlbumActivityV2 videoAlbumActivityV2, int i, int i2, int i3, int i4, boolean z) {
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

    /* JADX INFO: renamed from: android.media.ViviTV.activity.VideoAlbumActivityV2$e */
    public class C1925e implements C6082x00.InterfaceC5693b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ D00.C0203a f5456a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VideoAlbumActivityV2 f5457b;

        /* JADX WARN: Invalid debug info offset */
        public C1925e(VideoAlbumActivityV2 videoAlbumActivityV2, D00.C0203a c0203a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C6082x00.InterfaceC5693b
        /* JADX INFO: renamed from: a */
        public void mo10340a(D00 d00) {
        }

        @Override // p000.C6082x00.InterfaceC5693b
        /* JADX INFO: renamed from: b */
        public void mo10341b() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.VideoAlbumActivityV2$f */
    public class RunnableC1926f implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VideoAlbumActivityV2 f5458a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC1926f(VideoAlbumActivityV2 videoAlbumActivityV2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ FrameLayout m10314P0(VideoAlbumActivityV2 videoAlbumActivityV2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ RelativeLayout m10315Q0(VideoAlbumActivityV2 videoAlbumActivityV2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ RelativeLayout m10316R0(VideoAlbumActivityV2 videoAlbumActivityV2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ ListView m10317S0(VideoAlbumActivityV2 videoAlbumActivityV2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ VodPlayFragment m10318T0(VideoAlbumActivityV2 videoAlbumActivityV2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ SparseArray m10319U0(VideoAlbumActivityV2 videoAlbumActivityV2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m10320V0(VideoAlbumActivityV2 videoAlbumActivityV2, D00 d00) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ D00.C0203a m10321W0(VideoAlbumActivityV2 videoAlbumActivityV2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m10322X0(VideoAlbumActivityV2 videoAlbumActivityV2, D00.C0203a c0203a) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    private void m10323Z0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    private Drawable m10324b1(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0078
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: e1 */
    private final void m10325e1() {
        /*
            r5 = this;
            return
        L7b:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.VideoAlbumActivityV2.m10325e1():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    private void m10326f1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g1 */
    private void m10327g1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    private final boolean m10328h1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: l1 */
    private final void m10329l1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x005a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: n1 */
    private void m10330n1() {
        /*
            r6 = this;
            return
        L7c:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.VideoAlbumActivityV2.m10330n1():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o1 */
    private void m10331o1() {
    }

    @Override // android.media.ViviTV.fragmens.VodPlayFragment.InterfaceC2178o0
    /* JADX INFO: renamed from: O */
    public void mo9634O(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public final void m10332Y0(D00.C0203a c0203a) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: a1 */
    public final void m10333a1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public final VodRecode m10334c1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public final void m10335d1(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    public final boolean m10336i1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j1 */
    public final void m10337j1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k1 */
    public final boolean m10338k1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m1 */
    public final void m10339m1(D00 d00) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
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

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
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

    @Override // android.media.ViviTV.fragmens.VodPlayFragment.InterfaceC2178o0
    /* JADX INFO: renamed from: z */
    public void mo9642z() {
    }
}
