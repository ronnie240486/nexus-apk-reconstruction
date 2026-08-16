package android.media.ViviTV.viewholders;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.ViviTV.model.persistent.VodRecode;
import android.media.ViviTV.player.widget.AbstractC2308a;
import android.media.ViviTV.player.widget.DolitVideoView;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewPropertyAnimatorListener;
import java.util.HashMap;
import java.util.List;
import java.util.TimerTask;
import p000.B30;
import p000.C4182cp;
import p000.C5176pP;
import p000.InterfaceC0191Cq;
import p000.InterfaceC0700Kq;
import p000.InterfaceC1535Xq;
import p000.InterfaceC4313er;

/* JADX INFO: loaded from: classes.dex */
public class ViewHolderVideo extends BaseHomeRecyclerViewHolder implements AbstractC2308a.b, AbstractC2308a.c, AbstractC2308a.g, InterfaceC1535Xq, InterfaceC0700Kq, AbstractC2308a.d, InterfaceC0191Cq {

    /* JADX INFO: renamed from: J */
    public static HashMap<String, Integer> f9881J = new HashMap<>();

    /* JADX INFO: renamed from: K */
    public static String f9882K = "cn.dolit.ott.VIDEO_WINDOW";

    /* JADX INFO: renamed from: L */
    public static String f9883L = "PLAY_STATUS";

    /* JADX INFO: renamed from: M */
    public static String f9884M = "STOP";

    /* JADX INFO: renamed from: N */
    public static String f9885N = "CONTINUE";

    /* JADX INFO: renamed from: O */
    public static final int f9886O = 20;

    /* JADX INFO: renamed from: A */
    public Animation f9887A;

    /* JADX INFO: renamed from: B */
    public VideoWindowReceiver f9888B;

    /* JADX INFO: renamed from: C */
    public VodRecode f9889C;

    /* JADX INFO: renamed from: D */
    public InterfaceC4313er f9890D;

    /* JADX INFO: renamed from: E */
    public B30 f9891E;

    /* JADX INFO: renamed from: F */
    public C5176pP f9892F;

    /* JADX INFO: renamed from: G */
    public int f9893G;

    /* JADX INFO: renamed from: H */
    public Runnable f9894H;

    /* JADX INFO: renamed from: I */
    public Handler f9895I;

    /* JADX INFO: renamed from: n */
    public int f9896n;

    /* JADX INFO: renamed from: o */
    public String f9897o;

    /* JADX INFO: renamed from: p */
    public List<String> f9898p;

    /* JADX INFO: renamed from: q */
    public DolitVideoView f9899q;

    /* JADX INFO: renamed from: r */
    public boolean f9900r;

    /* JADX INFO: renamed from: s */
    public TextView f9901s;

    /* JADX INFO: renamed from: t */
    public boolean f9902t;

    /* JADX INFO: renamed from: u */
    public C4182cp f9903u;

    /* JADX INFO: renamed from: v */
    public int f9904v;

    /* JADX INFO: renamed from: w */
    public boolean f9905w;

    /* JADX INFO: renamed from: x */
    public int f9906x;

    /* JADX INFO: renamed from: y */
    public ImageView f9907y;

    /* JADX INFO: renamed from: z */
    public ImageView f9908z;

    public class VideoWindowReceiver extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewHolderVideo f9909a;

        /* JADX WARN: Invalid debug info offset */
        public VideoWindowReceiver(ViewHolderVideo viewHolderVideo) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.viewholders.ViewHolderVideo$a */
    public class C2360a implements ViewPropertyAnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewHolderVideo f9910a;

        /* JADX WARN: Invalid debug info offset */
        public C2360a(ViewHolderVideo viewHolderVideo) {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationCancel(View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationStart(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.viewholders.ViewHolderVideo$b */
    public class C2361b extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewHolderVideo f9911a;

        /* JADX WARN: Invalid debug info offset */
        public C2361b(ViewHolderVideo viewHolderVideo) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.viewholders.ViewHolderVideo$c */
    public class HandlerC2362c extends Handler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewHolderVideo f9912a;

        /* JADX WARN: Invalid debug info offset */
        public HandlerC2362c(ViewHolderVideo viewHolderVideo) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.viewholders.ViewHolderVideo$d */
    public static class C2363d {

        /* JADX INFO: renamed from: a */
        public int f9913a;

        /* JADX WARN: Invalid debug info offset */
        public C2363d(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public String toString() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public ViewHolderVideo(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m14370I(ViewHolderVideo viewHolderVideo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public static /* synthetic */ ImageView m14371K(ViewHolderVideo viewHolderVideo) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m14372L(ViewHolderVideo viewHolderVideo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m14373M(ViewHolderVideo viewHolderVideo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m14374N(ViewHolderVideo viewHolderVideo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public static /* synthetic */ Handler m14375O(ViewHolderVideo viewHolderVideo) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q */
    private VodRecode m14376Q() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T */
    private /* synthetic */ void m14377T() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a.d
    /* JADX INFO: renamed from: B0 */
    public boolean mo12401B0(Object obj, int i, int i2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.viewholders.BaseHomeRecyclerViewHolder
    /* JADX INFO: renamed from: C */
    public void mo14292C(C4182cp c4182cp) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public void m14378J() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public final void m14379P() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public final void m14380R() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public final void m14381S() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U */
    public final void m14382U() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public final boolean m14383V(Uri uri, String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W */
    public final void m14384W() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: X */
    public final void m14385X() {
        /*
            r3 = this;
            return
        L24:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.viewholders.ViewHolderVideo.m14385X():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y */
    public void m14386Y(Boolean bool) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: Z */
    public final void m14387Z() {
        /*
            r3 = this;
            return
        L23:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.viewholders.ViewHolderVideo.m14387Z():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a0 */
    public final void m14388a0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1535Xq
    /* JADX INFO: renamed from: b */
    public Object mo7947b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b0 */
    public final void m14389b0() {
        /*
            r3 = this;
            return
        L7f:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.viewholders.ViewHolderVideo.m14389b0():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1535Xq
    /* JADX INFO: renamed from: d */
    public void mo7948d(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d0 */
    public final void m14390d0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0700Kq
    /* JADX INFO: renamed from: e */
    public void mo3291e(View view, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e0 */
    public final void m14391e0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0700Kq
    /* JADX INFO: renamed from: f */
    public void mo3292f(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f0 */
    public final void m14392f0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0700Kq
    /* JADX INFO: renamed from: g */
    public boolean mo3293g(boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public final void m14393g0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0191Cq
    public HashMap<String, Object> getExtras() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1535Xq
    /* JADX INFO: renamed from: h */
    public String mo7949h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a.b
    /* JADX INFO: renamed from: h0 */
    public void mo1548h0(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i0 */
    public final void m14394i0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a.c
    /* JADX INFO: renamed from: j */
    public boolean mo10404j(Object obj, int i, int i2, long j) {
        return false;
    }

    @Override // cn.dolit.twowayviewlib.viewholders.BaseRecyclerViewHolder
    /* JADX INFO: renamed from: o */
    public boolean mo14302o() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a.g
    /* JADX INFO: renamed from: u */
    public void mo1331u(Object obj, int i, int i2) {
    }
}
