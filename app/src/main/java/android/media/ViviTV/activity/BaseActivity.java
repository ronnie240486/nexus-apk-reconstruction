package android.media.ViviTV.activity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.yanzhenjie.permission.PermissionListener;
import com.yanzhenjie.permission.Rationale;
import com.yanzhenjie.permission.RationaleListener;
import java.util.LinkedList;
import java.util.List;
import p000.C5809yn;
import p000.C5879zn;
import p000.DialogC1326Uc;
import p000.DialogC1413Vv;

/* JADX INFO: loaded from: classes.dex */
public class BaseActivity extends FragmentActivity implements DialogC1326Uc.f {

    /* JADX INFO: renamed from: s */
    public static final int f4770s = 13423;

    /* JADX INFO: renamed from: t */
    public static List<Activity> f4771t = new LinkedList();

    /* JADX INFO: renamed from: a */
    public boolean f4772a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1768i f4773b;

    /* JADX INFO: renamed from: c */
    public boolean f4774c;

    /* JADX INFO: renamed from: d */
    public DialogC1413Vv f4775d;

    /* JADX INFO: renamed from: e */
    public String f4776e;

    /* JADX INFO: renamed from: f */
    public WindowManager f4777f;

    /* JADX INFO: renamed from: g */
    public Button f4778g;

    /* JADX INFO: renamed from: h */
    public DialogC1326Uc f4779h;

    /* JADX INFO: renamed from: i */
    public CountDownTimer f4780i;

    /* JADX INFO: renamed from: j */
    public long f4781j;

    /* JADX INFO: renamed from: k */
    public boolean f4782k;

    /* JADX INFO: renamed from: l */
    public StringBuilder f4783l;

    /* JADX INFO: renamed from: m */
    public int f4784m;

    /* JADX INFO: renamed from: n */
    public int f4785n;

    /* JADX INFO: renamed from: o */
    public int f4786o;

    /* JADX INFO: renamed from: p */
    public Context f4787p;

    /* JADX INFO: renamed from: q */
    public Handler f4788q;

    /* JADX INFO: renamed from: r */
    public C5879zn.c f4789r;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.BaseActivity$a */
    public class ViewOnClickListenerC1760a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseActivity f4790a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC1760a(BaseActivity baseActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.BaseActivity$b */
    public class DialogInterfaceOnKeyListenerC1761b implements DialogInterface.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseActivity f4791a;

        /* JADX WARN: Invalid debug info offset */
        public DialogInterfaceOnKeyListenerC1761b(BaseActivity baseActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.BaseActivity$c */
    public class HandlerC1762c extends Handler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseActivity f4792a;

        /* JADX INFO: renamed from: android.media.ViviTV.activity.BaseActivity$c$a */
        public class a extends CountDownTimer {

            /* JADX INFO: renamed from: a */
            public int f4793a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ HandlerC1762c f4794b;

            /* JADX INFO: renamed from: android.media.ViviTV.activity.BaseActivity$c$a$a, reason: collision with other inner class name */
            public class RunnableC5897a implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ a f4795a;

                /* JADX WARN: Invalid debug info offset */
                public RunnableC5897a(a aVar) {
                }

                /* JADX WARN: Invalid debug info offset */
                @Override // java.lang.Runnable
                public void run() {
                }
            }

            /* JADX WARN: Invalid debug info offset */
            public a(HandlerC1762c handlerC1762c, long j, long j2) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.CountDownTimer
            public void onFinish() {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.CountDownTimer
            public void onTick(long j) {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public HandlerC1762c(BaseActivity baseActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.BaseActivity$d */
    public class C1763d implements DialogC1326Uc.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseActivity f4796a;

        /* JADX WARN: Invalid debug info offset */
        public C1763d(BaseActivity baseActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.DialogC1326Uc.e
        /* JADX INFO: renamed from: a */
        public void mo933a(DialogC1326Uc dialogC1326Uc, View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.BaseActivity$e */
    public class C1764e implements DialogC1326Uc.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseActivity f4797a;

        /* JADX WARN: Invalid debug info offset */
        public C1764e(BaseActivity baseActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.DialogC1326Uc.e
        /* JADX INFO: renamed from: a */
        public void mo933a(DialogC1326Uc dialogC1326Uc, View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.BaseActivity$f */
    public class C1765f implements PermissionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseActivity f4798a;

        /* JADX WARN: Invalid debug info offset */
        public C1765f(BaseActivity baseActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.permission.PermissionListener
        public void onFailed(int i, @NonNull List<String> list) {
        }

        @Override // com.yanzhenjie.permission.PermissionListener
        public void onSucceed(int i, @NonNull List<String> list) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.BaseActivity$g */
    public class C1766g implements RationaleListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseActivity f4799a;

        /* JADX WARN: Invalid debug info offset */
        public C1766g(BaseActivity baseActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.permission.RationaleListener
        public void showRequestPermissionRationale(int i, Rationale rationale) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.BaseActivity$h */
    public class C1767h implements C5879zn.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseActivity f4800a;

        /* JADX WARN: Invalid debug info offset */
        public C1767h(BaseActivity baseActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C5879zn.c
        /* JADX INFO: renamed from: a */
        public void mo9578a(C5809yn c5809yn) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.BaseActivity$i */
    public interface InterfaceC1768i {
        /* JADX INFO: renamed from: K */
        void mo9579K(int i);

        /* JADX INFO: renamed from: k */
        void mo9580k(int i);
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public static /* synthetic */ DialogC1413Vv m9535R(BaseActivity baseActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public static /* synthetic */ int m9536S(BaseActivity baseActivity) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T */
    public static /* synthetic */ int m9537T(BaseActivity baseActivity) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U */
    public static /* synthetic */ Handler m9538U(BaseActivity baseActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public static /* synthetic */ StringBuilder m9539V(BaseActivity baseActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W */
    public static /* synthetic */ StringBuilder m9540W(BaseActivity baseActivity, StringBuilder sb) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X */
    public static /* synthetic */ InterfaceC1768i m9541X(BaseActivity baseActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ boolean m9542Y(BaseActivity baseActivity, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ int m9543Z(BaseActivity baseActivity) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m9544a0(BaseActivity baseActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ CountDownTimer m9545d0(BaseActivity baseActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ CountDownTimer m9546e0(BaseActivity baseActivity, CountDownTimer countDownTimer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ DialogC1326Uc m9547f0(BaseActivity baseActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m9548g0(BaseActivity baseActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A0 */
    public void m9549A0(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C0 */
    public boolean m9550C0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D0 */
    public boolean m9551D0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E0 */
    public void m9552E0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: F0 */
    public void m9553F0() {
        /*
            r1 = this;
            return
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.BaseActivity.m9553F0():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G0 */
    public void m9554G0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0018
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: H0 */
    public void m9555H0() {
        /*
            r2 = this;
            return
        L1d:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.BaseActivity.m9555H0():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I0 */
    public void m9556I0(Activity activity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J0 */
    public void m9557J0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public final void m9558K0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public void m9559L0(InterfaceC1768i interfaceC1768i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0057
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: M0 */
    public void m9560M0() {
        /*
            r5 = this;
            return
        L5f:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.BaseActivity.m9560M0():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    public final void m9561N0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x001b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: O0 */
    public final void m9562O0() {
        /*
            r6 = this;
            return
        L1f:
        L3c:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.BaseActivity.m9562O0():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i0 */
    public void m9563i0(Activity activity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public void m9564k0(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m0 */
    public final void m9565m0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o0 */
    public void m9566o0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p0 */
    public void m9567p0(Activity activity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q0 */
    public void m9568q0() {
    }

    /* JADX INFO: renamed from: r0 */
    public boolean mo9569r0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s0 */
    public DialogC1413Vv m9570s0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0013
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: t0 */
    public <T> T m9571t0(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 0
            return r0
        L18:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.BaseActivity.m9571t0(java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u0 */
    public void m9572u0(Class<?> cls) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.DialogC1326Uc.f
    /* JADX INFO: renamed from: v */
    public void mo6363v(DialogC1326Uc dialogC1326Uc) {
    }

    /* JADX INFO: renamed from: v0 */
    public boolean mo9573v0(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w0 */
    public void m9574w0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x0 */
    public void m9575x0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y0 */
    public void m9576y0(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z0 */
    public void m9577z0(String str) {
    }
}
