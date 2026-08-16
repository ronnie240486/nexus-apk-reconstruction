package android.media.ViviTV.activity;

import android.app.Activity;
import android.content.Intent;
import android.media.ViviTV.databinding.LayoutVideoDetailsFragmentActivityBinding;
import android.media.ViviTV.model.persistent.VodRecode;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import java.util.List;
import p000.B30;
import p000.C0893Ns;
import p000.C6069v10;
import p000.C6071v30;
import p000.D00;
import p000.DialogC1326Uc;
import p000.InterfaceC1408Vq;

/* JADX INFO: loaded from: classes.dex */
public class VideoDetailsFragmentActivity extends BaseActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener, InterfaceC1408Vq {

    /* JADX INFO: renamed from: H */
    public static final String f5471H = "IsFromSearch";

    /* JADX INFO: renamed from: I */
    public static final int f5472I = 1023;

    /* JADX INFO: renamed from: J */
    public static final String f5473J = "isGenericMethod";

    /* JADX INFO: renamed from: A */
    public C0893Ns f5474A;

    /* JADX INFO: renamed from: B */
    public int f5475B;

    /* JADX INFO: renamed from: C */
    public boolean f5476C;

    /* JADX INFO: renamed from: D */
    public LayoutVideoDetailsFragmentActivityBinding f5477D;

    /* JADX INFO: renamed from: E */
    public Button f5478E;

    /* JADX INFO: renamed from: F */
    public View.OnFocusChangeListener f5479F;

    /* JADX INFO: renamed from: G */
    public View.OnKeyListener f5480G;

    /* JADX INFO: renamed from: u */
    public D00 f5481u;

    /* JADX INFO: renamed from: v */
    public int f5482v;

    /* JADX INFO: renamed from: w */
    public B30 f5483w;

    /* JADX INFO: renamed from: x */
    public C0893Ns f5484x;

    /* JADX INFO: renamed from: y */
    public List<Fragment> f5485y;

    /* JADX INFO: renamed from: z */
    public VodRecode f5486z;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.VideoDetailsFragmentActivity$a */
    public class C1928a implements C6069v10.InterfaceC5561d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VideoDetailsFragmentActivity f5487a;

        /* JADX INFO: renamed from: android.media.ViviTV.activity.VideoDetailsFragmentActivity$a$a */
        public class a implements C6071v30.InterfaceC5567d {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1928a f5488a;

            /* JADX WARN: Invalid debug info offset */
            public a(C1928a c1928a) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // p000.C6071v30.InterfaceC5567d
            /* JADX INFO: renamed from: a */
            public void mo2245a(DialogC1326Uc dialogC1326Uc) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // p000.C6071v30.InterfaceC5567d
            /* JADX INFO: renamed from: b */
            public void mo2246b(DialogC1326Uc dialogC1326Uc) {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public C1928a(VideoDetailsFragmentActivity videoDetailsFragmentActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C6069v10.InterfaceC5561d
        /* JADX INFO: renamed from: a */
        public void mo9919a(D00 d00) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C6069v10.InterfaceC5561d
        /* JADX INFO: renamed from: b */
        public void mo9920b(int i) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.VideoDetailsFragmentActivity$b */
    public class ViewOnFocusChangeListenerC1929b implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VideoDetailsFragmentActivity f5489a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnFocusChangeListenerC1929b(VideoDetailsFragmentActivity videoDetailsFragmentActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.VideoDetailsFragmentActivity$c */
    public class ViewOnKeyListenerC1930c implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VideoDetailsFragmentActivity f5490a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC1930c(VideoDetailsFragmentActivity videoDetailsFragmentActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: P0 */
    public static boolean m10344P0(android.content.Context r1, p000.D00 r2, int r3) {
        /*
            r0 = 0
            return r0
        L11:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.VideoDetailsFragmentActivity.m10344P0(android.content.Context, D00, int):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ Button m10345Q0(VideoDetailsFragmentActivity videoDetailsFragmentActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ D00 m10346R0(VideoDetailsFragmentActivity videoDetailsFragmentActivity, D00 d00) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m10347S0(VideoDetailsFragmentActivity videoDetailsFragmentActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ LayoutVideoDetailsFragmentActivityBinding m10348T0(VideoDetailsFragmentActivity videoDetailsFragmentActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ List m10349U0(VideoDetailsFragmentActivity videoDetailsFragmentActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    private void m10350W0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    private void m10351X0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    private final void m10352Y0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public static void m10353Z0(Activity activity, D00 d00, int i, VodRecode vodRecode) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public static void m10354a1(Activity activity, D00 d00, int i, VodRecode vodRecode, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public static void m10355c1(Activity activity, D00 d00, int i, VodRecode vodRecode) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0032
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: d1 */
    public static void m10356d1(android.content.Context r9, p000.D00 r10, int r11, android.widget.TextView r12) {
        /*
            return
        L47:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.VideoDetailsFragmentActivity.m10356d1(android.content.Context, D00, int, android.widget.TextView):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1408Vq
    /* JADX INFO: renamed from: M */
    public void mo6636M(Fragment fragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public final void m10357V0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    public final void m10358b1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    public final void m10359e1() {
    }

    @Override // p000.InterfaceC1408Vq
    /* JADX INFO: renamed from: i */
    public void mo6637i(Fragment fragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
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
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }
}
