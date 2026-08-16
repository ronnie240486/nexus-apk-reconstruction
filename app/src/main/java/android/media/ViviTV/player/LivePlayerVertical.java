package android.media.ViviTV.player;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.media.ViviTV.fragmens.ChannelListFragment;
import android.media.ViviTV.model.persistent.LiveChannelInfo;
import android.media.ViviTV.model.persistent.LiveTypeInfo;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class LivePlayerVertical extends LivePlayer implements View.OnClickListener {

    /* JADX INFO: renamed from: Q2 */
    public ImageView f9168Q2;

    /* JADX INFO: renamed from: R2 */
    public boolean f9169R2;

    /* JADX INFO: renamed from: S2 */
    public FrameLayout f9170S2;

    /* JADX INFO: renamed from: T2 */
    public FrameLayout f9171T2;

    /* JADX INFO: renamed from: U2 */
    public FrameLayout f9172U2;

    /* JADX INFO: renamed from: V2 */
    public ChannelListFragment f9173V2;

    /* JADX INFO: renamed from: W2 */
    public ChannelListFragment.InterfaceC2022d f9174W2;

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayerVertical$a */
    public class C2289a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ValueAnimator f9175a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ValueAnimator f9176b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ValueAnimator f9177c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ValueAnimator f9178d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ LivePlayerVertical f9179e;

        /* JADX WARN: Invalid debug info offset */
        public C2289a(LivePlayerVertical livePlayerVertical, ValueAnimator valueAnimator, ValueAnimator valueAnimator2, ValueAnimator valueAnimator3, ValueAnimator valueAnimator4) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayerVertical$b */
    public class C2290b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f9180a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f9181b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f9182c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f9183d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f9184e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LivePlayerVertical f9185f;

        /* JADX WARN: Invalid debug info offset */
        public C2290b(LivePlayerVertical livePlayerVertical, boolean z, int i, int i2, int i3, int i4) {
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

    /* JADX INFO: renamed from: android.media.ViviTV.player.LivePlayerVertical$c */
    public class C2291c implements ChannelListFragment.InterfaceC2022d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LivePlayerVertical f9186a;

        /* JADX WARN: Invalid debug info offset */
        public C2291c(LivePlayerVertical livePlayerVertical) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.fragmens.ChannelListFragment.InterfaceC2022d
        /* JADX INFO: renamed from: a */
        public void mo12129a(LiveChannelInfo liveChannelInfo) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.fragmens.ChannelListFragment.InterfaceC2022d
        /* JADX INFO: renamed from: b */
        public void mo12130b(LiveTypeInfo liveTypeInfo) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.fragmens.ChannelListFragment.InterfaceC2022d
        /* JADX INFO: renamed from: c */
        public void mo12131c(LiveTypeInfo liveTypeInfo) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.fragmens.ChannelListFragment.InterfaceC2022d
        /* JADX INFO: renamed from: d */
        public boolean mo12132d(LiveTypeInfo liveTypeInfo) {
            return false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b6 */
    public static /* synthetic */ FrameLayout m13679b6(LivePlayerVertical livePlayerVertical) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.LivePlayer
    /* JADX INFO: renamed from: B3 */
    public int mo13505B3() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.LivePlayer
    /* JADX INFO: renamed from: W3 */
    public boolean mo13564W3() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.LivePlayer
    /* JADX INFO: renamed from: Y3 */
    public boolean mo13571Y3(DisplayMetrics displayMetrics) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.LivePlayer
    /* JADX INFO: renamed from: a4 */
    public boolean mo13579a4() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.LivePlayer
    /* JADX INFO: renamed from: a6 */
    public void mo13581a6(String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.LivePlayer
    /* JADX INFO: renamed from: b4 */
    public boolean mo13584b4() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.LivePlayer
    /* JADX INFO: renamed from: c4 */
    public boolean mo13589c4() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x001b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: c6 */
    public final void m13680c6() {
        /*
            r3 = this;
            return
        L1e:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.LivePlayerVertical.m13680c6():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d6 */
    public final boolean m13681d6() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e6 */
    public final boolean m13682e6() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @SuppressLint({"SourceLockedOrientationActivity"})
    /* JADX INFO: renamed from: f6 */
    public void m13683f6() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.LivePlayer, android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.LivePlayer, android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }
}
