package android.media.ViviTV.player.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import p000.InterfaceC0635Jq;

/* JADX INFO: loaded from: classes.dex */
public class MediaController extends FrameLayout {

    /* JADX INFO: renamed from: A */
    public static final int f9402A = 1;

    /* JADX INFO: renamed from: B */
    public static final int f9403B = 2;

    /* JADX INFO: renamed from: y */
    public static final String f9404y = "MediaController";

    /* JADX INFO: renamed from: z */
    public static final int f9405z = 3000;

    /* JADX INFO: renamed from: a */
    public InterfaceC0635Jq f9406a;

    /* JADX INFO: renamed from: b */
    public Context f9407b;

    /* JADX INFO: renamed from: c */
    public PopupWindow f9408c;

    /* JADX INFO: renamed from: d */
    public int f9409d;

    /* JADX INFO: renamed from: e */
    public View f9410e;

    /* JADX INFO: renamed from: f */
    public View f9411f;

    /* JADX INFO: renamed from: g */
    public SeekBar f9412g;

    /* JADX INFO: renamed from: h */
    public TextView f9413h;

    /* JADX INFO: renamed from: i */
    public TextView f9414i;

    /* JADX INFO: renamed from: j */
    public TextView f9415j;

    /* JADX INFO: renamed from: k */
    public OutlineTextView f9416k;

    /* JADX INFO: renamed from: l */
    public String f9417l;

    /* JADX INFO: renamed from: m */
    public long f9418m;

    /* JADX INFO: renamed from: n */
    public boolean f9419n;

    /* JADX INFO: renamed from: o */
    public boolean f9420o;

    /* JADX INFO: renamed from: p */
    public boolean f9421p;

    /* JADX INFO: renamed from: q */
    public boolean f9422q;

    /* JADX INFO: renamed from: r */
    public ImageButton f9423r;

    /* JADX INFO: renamed from: s */
    public AudioManager f9424s;

    /* JADX INFO: renamed from: t */
    public InterfaceC2307e f9425t;

    /* JADX INFO: renamed from: u */
    public InterfaceC2306d f9426u;

    /* JADX INFO: renamed from: v */
    @SuppressLint({"HandlerLeak"})
    public Handler f9427v;

    /* JADX INFO: renamed from: w */
    public View.OnClickListener f9428w;

    /* JADX INFO: renamed from: x */
    public SeekBar.OnSeekBarChangeListener f9429x;

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.MediaController$a */
    public class HandlerC2303a extends Handler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MediaController f9430a;

        /* JADX WARN: Invalid debug info offset */
        public HandlerC2303a(MediaController mediaController) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.MediaController$b */
    public class ViewOnClickListenerC2304b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MediaController f9431a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC2304b(MediaController mediaController) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.MediaController$c */
    public class C2305c implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MediaController f9432a;

        /* JADX WARN: Invalid debug info offset */
        public C2305c(MediaController mediaController) {
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

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.MediaController$d */
    public interface InterfaceC2306d {
        void onHidden();
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.MediaController$e */
    public interface InterfaceC2307e {
        void onShown();
    }

    /* JADX WARN: Invalid debug info offset */
    public MediaController(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public MediaController(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ long m13912a(MediaController mediaController) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m13913b(MediaController mediaController) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m13914c(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m13915d(MediaController mediaController, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ InterfaceC0635Jq m13916e(MediaController mediaController) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ TextView m13917f(MediaController mediaController) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ boolean m13918g(MediaController mediaController) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m13919h(MediaController mediaController) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m13920i(MediaController mediaController) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Handler m13921j(MediaController mediaController) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ boolean m13922k(MediaController mediaController) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ AudioManager m13923l(MediaController mediaController) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ OutlineTextView m13924m(MediaController mediaController) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ long m13925n(MediaController mediaController) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public static String m13926q(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public final void m13927A() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public final void m13928o() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onFinishInflate() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public final void m13929p() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @android.annotation.SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: r */
    public void m13930r() {
        /*
            r2 = this;
            return
        L22:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.widget.MediaController.m13930r():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public final boolean m13931s(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setAnchorView(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setAnimationStyle(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setFileName(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setInfoView(OutlineTextView outlineTextView) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setInstantSeeking(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setMediaPlayer(InterfaceC0635Jq interfaceC0635Jq) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOnHiddenListener(InterfaceC2306d interfaceC2306d) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOnShownListener(InterfaceC2307e interfaceC2307e) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public final void m13932t(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public final void m13933u() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public boolean m13934v() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public View m13935w() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public final long m13936x() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public void m13937y() {
    }

    /* JADX WARN: Invalid debug info offset */
    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: z */
    public void m13938z(int i) {
    }
}
