package android.media.ViviTV.activity;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.media.ViviTV.adapters.RelevantStarAdapter;
import android.media.ViviTV.adapters.VideoEpisodeAdapterV2;
import android.media.ViviTV.databinding.LayoutActivityVideoDetailsBaseBinding;
import android.media.ViviTV.fragmens.VodPlayFragment;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import p000.C0856NH;
import p000.C4289eT;
import p000.D00;
import p000.InterfaceC1394Vc;

/* JADX INFO: loaded from: classes.dex */
public class VideoDetailsPortraitActivity extends FragmentActivity implements VodPlayFragment.InterfaceC2178o0, RelevantStarAdapter.InterfaceC1981a {

    /* JADX INFO: renamed from: k */
    public static final String f5502k = "isGenericMethod";

    /* JADX INFO: renamed from: l */
    public static final String f5503l = "IsFromSearch";

    /* JADX INFO: renamed from: a */
    public VodPlayFragment f5504a;

    /* JADX INFO: renamed from: b */
    public D00 f5505b;

    /* JADX INFO: renamed from: c */
    public int f5506c;

    /* JADX INFO: renamed from: d */
    public int f5507d;

    /* JADX INFO: renamed from: e */
    public int f5508e;

    /* JADX INFO: renamed from: f */
    public C0856NH f5509f;

    /* JADX INFO: renamed from: g */
    public View f5510g;

    /* JADX INFO: renamed from: h */
    public VideoEpisodeAdapterV2 f5511h;

    /* JADX INFO: renamed from: i */
    public RelevantStarAdapter f5512i;

    /* JADX INFO: renamed from: j */
    public LayoutActivityVideoDetailsBaseBinding f5513j;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.VideoDetailsPortraitActivity$a */
    public class C1931a implements InterfaceC1394Vc<VideoEpisodeAdapterV2.ViewHolderEpisode> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VideoDetailsPortraitActivity f5514a;

        /* JADX WARN: Invalid debug info offset */
        public C1931a(VideoDetailsPortraitActivity videoDetailsPortraitActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m10385a(VideoEpisodeAdapterV2.ViewHolderEpisode viewHolderEpisode) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC1394Vc
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ void mo6597m(VideoEpisodeAdapterV2.ViewHolderEpisode viewHolderEpisode) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.VideoDetailsPortraitActivity$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC1932b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VideoDetailsPortraitActivity f5515a;

        /* JADX WARN: Invalid debug info offset */
        public ViewTreeObserverOnGlobalLayoutListenerC1932b(VideoDetailsPortraitActivity videoDetailsPortraitActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.VideoDetailsPortraitActivity$c */
    public class C1933c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ValueAnimator f5516a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ValueAnimator f5517b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ValueAnimator f5518c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ValueAnimator f5519d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ VideoDetailsPortraitActivity f5520e;

        /* JADX WARN: Invalid debug info offset */
        public C1933c(VideoDetailsPortraitActivity videoDetailsPortraitActivity, ValueAnimator valueAnimator, ValueAnimator valueAnimator2, ValueAnimator valueAnimator3, ValueAnimator valueAnimator4) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.VideoDetailsPortraitActivity$d */
    public class C1934d implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f5521a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f5522b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f5523c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f5524d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f5525e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ VideoDetailsPortraitActivity f5526f;

        /* JADX WARN: Invalid debug info offset */
        public C1934d(VideoDetailsPortraitActivity videoDetailsPortraitActivity, boolean z, int i, int i2, int i3, int i4) {
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

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m10366R(VideoDetailsPortraitActivity videoDetailsPortraitActivity, AdapterView adapterView, View view, int i, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public static /* synthetic */ View m10367S(VideoDetailsPortraitActivity videoDetailsPortraitActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T */
    public static /* synthetic */ View m10368T(VideoDetailsPortraitActivity videoDetailsPortraitActivity, View view) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U */
    public static /* synthetic */ VodPlayFragment m10369U(VideoDetailsPortraitActivity videoDetailsPortraitActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public static /* synthetic */ LayoutActivityVideoDetailsBaseBinding m10370V(VideoDetailsPortraitActivity videoDetailsPortraitActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W */
    public static /* synthetic */ int m10371W(VideoDetailsPortraitActivity videoDetailsPortraitActivity, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X */
    public static /* synthetic */ int m10372X(VideoDetailsPortraitActivity videoDetailsPortraitActivity, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y */
    private void m10373Y() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x002f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a0 */
    private final void m10374a0() {
        /*
            r4 = this;
            return
        L32:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.VideoDetailsPortraitActivity.m10374a0():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f0 */
    private void m10375f0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    private void m10376g0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i0 */
    private final boolean m10377i0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o0 */
    private void m10378o0(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.VodPlayFragment.InterfaceC2178o0
    /* JADX INFO: renamed from: O */
    public void mo9634O(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z */
    public final void m10379Z() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d0 */
    public final void m10380d0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e0 */
    public final void m10381e0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m10382k0(AdapterView adapterView, View view, int i, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m0 */
    public final void m10384m0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.VodPlayFragment.InterfaceC2178o0
    /* JADX INFO: renamed from: q */
    public void mo9641q(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.VodPlayFragment.InterfaceC2178o0
    /* JADX INFO: renamed from: z */
    public void mo9642z() {
    }

    @Override // android.media.ViviTV.adapters.RelevantStarAdapter.InterfaceC1981a
    /* JADX INFO: renamed from: m */
    public void mo10383m(C4289eT c4289eT) {
    }
}
