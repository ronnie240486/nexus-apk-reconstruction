package android.media.ViviTV.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.ViviTV.databinding.HomeLayoutBinding;
import android.media.ViviTV.home.BaseHomeTopViewFragment;
import android.media.ViviTV.home.InterfaceC2229a;
import android.opengl.GLSurfaceView;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.TimerTask;
import javax.microedition.khronos.opengles.GL10;
import p000.C0061Aw;
import p000.C0893Ns;
import p000.C1275Tp;
import p000.C1420W1;
import p000.C4312eq;
import p000.C4833mp;
import p000.C4898np;
import p000.C5176pP;
import p000.DialogC1326Uc;
import p000.DialogC1413Vv;
import p000.DialogC4557ii;
import p000.InterfaceC4763lq;
import p000.InterfaceC4834mq;

/* JADX INFO: loaded from: classes4.dex */
public class HomeActivity extends BaseActivity implements InterfaceC2229a.a, C1275Tp.f, C0061Aw.j, View.OnClickListener {

    /* JADX INFO: renamed from: R0 */
    public static final String f4925R0 = "ViviTV/Home";

    /* JADX INFO: renamed from: S0 */
    public static final int f4926S0 = 0;

    /* JADX INFO: renamed from: W */
    public static final String f4929W = "EXTRA_RESTORE_FLAG";

    /* JADX INFO: renamed from: Y */
    public static final String f4931Y = "TAG_CONTENT_FRAG";

    /* JADX INFO: renamed from: Z */
    public static final String f4932Z = "TAG_TOP_FRAG";

    /* JADX INFO: renamed from: A */
    public C1814p f4933A;

    /* JADX INFO: renamed from: B */
    public C1812n f4934B;

    /* JADX INFO: renamed from: C */
    public C1816r f4935C;

    /* JADX INFO: renamed from: D */
    public C1811m f4936D;

    /* JADX INFO: renamed from: E */
    public long f4937E;

    /* JADX INFO: renamed from: F */
    public DialogC4557ii f4938F;

    /* JADX INFO: renamed from: G */
    public C0893Ns f4939G;

    /* JADX INFO: renamed from: H */
    public HomeLayoutBinding f4940H;

    /* JADX INFO: renamed from: I */
    public C1420W1 f4941I;

    /* JADX INFO: renamed from: J */
    public RestartAppReceiver f4942J;

    /* JADX INFO: renamed from: K */
    public DialogC1326Uc f4943K;

    /* JADX INFO: renamed from: L */
    public Handler f4944L;

    /* JADX INFO: renamed from: M */
    public Runnable f4945M;

    /* JADX INFO: renamed from: N */
    public final int f4946N;

    /* JADX INFO: renamed from: O */
    public C5176pP f4947O;

    /* JADX INFO: renamed from: P */
    public DialogC1326Uc f4948P;

    /* JADX INFO: renamed from: Q */
    public C4898np f4949Q;

    /* JADX INFO: renamed from: R */
    public boolean f4950R;

    /* JADX INFO: renamed from: S */
    public C0893Ns f4951S;

    /* JADX INFO: renamed from: T */
    public Handler f4952T;

    /* JADX INFO: renamed from: U */
    public Handler f4953U;

    /* JADX INFO: renamed from: V */
    public BroadcastReceiver f4954V;

    /* JADX INFO: renamed from: u */
    public String f4955u;

    /* JADX INFO: renamed from: v */
    public InterfaceC2229a.d f4956v;

    /* JADX INFO: renamed from: w */
    public C1815q f4957w;

    /* JADX INFO: renamed from: x */
    public C1813o f4958x;

    /* JADX INFO: renamed from: y */
    public C1810l f4959y;

    /* JADX INFO: renamed from: z */
    public C1809k f4960z;

    /* JADX INFO: renamed from: X */
    public static final String f4930X = HomeActivity.class.getName().concat(".ACTION_EXIT_APP");

    /* JADX INFO: renamed from: T0 */
    public static int f4927T0 = 0;

    /* JADX INFO: renamed from: U0 */
    public static int f4928U0 = 1;

    public static class RestartAppReceiver extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public WeakReference<HomeActivity> f4961a;

        /* JADX WARN: Invalid debug info offset */
        public RestartAppReceiver(HomeActivity homeActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.HomeActivity$a */
    public class C1799a implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GLSurfaceView f4962a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HomeActivity f4963b;

        /* JADX WARN: Invalid debug info offset */
        public C1799a(HomeActivity homeActivity, GLSurfaceView gLSurfaceView) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m9762a(C1799a c1799a, GLSurfaceView gLSurfaceView) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public final void m9763b(GLSurfaceView gLSurfaceView) {
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 r8, javax.microedition.khronos.egl.EGLConfig r9) {
            /*
                r7 = this;
                return
            L37:
            L42:
            L43:
            L4b:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.HomeActivity.C1799a.onSurfaceCreated(javax.microedition.khronos.opengles.GL10, javax.microedition.khronos.egl.EGLConfig):void");
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.HomeActivity$b */
    public class AsyncTaskC1800b extends AsyncTask<Void, Integer, C4833mp.c> {

        /* JADX INFO: renamed from: a */
        public DialogC1413Vv f4964a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HomeActivity f4965b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1800b(HomeActivity homeActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public C4833mp.c m9764a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9765b(C4833mp.c cVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ C4833mp.c doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(C4833mp.c cVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.HomeActivity$c */
    public class C1801c extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeActivity f4966a;

        /* JADX WARN: Invalid debug info offset */
        public C1801c(HomeActivity homeActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.HomeActivity$d */
    public class C1802d implements InterfaceC4763lq {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeActivity f4967a;

        /* JADX WARN: Invalid debug info offset */
        public C1802d(HomeActivity homeActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4763lq
        /* JADX INFO: renamed from: X */
        public void mo9766X(InterfaceC4834mq interfaceC4834mq) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4763lq
        /* JADX INFO: renamed from: g */
        public void mo9767g() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4763lq
        /* JADX INFO: renamed from: v0 */
        public void mo9768v0(InterfaceC4834mq interfaceC4834mq) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.HomeActivity$e */
    public class C1803e implements DialogC1326Uc.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeActivity f4968a;

        /* JADX WARN: Invalid debug info offset */
        public C1803e(HomeActivity homeActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.DialogC1326Uc.e
        /* JADX INFO: renamed from: a */
        public void mo933a(DialogC1326Uc dialogC1326Uc, View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.HomeActivity$f */
    public class AsyncTaskC1804f extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeActivity f4969a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1804f(HomeActivity homeActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Boolean m9769a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9770b(Boolean bool) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.HomeActivity$g */
    public class HandlerC1805g extends Handler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeActivity f4970a;

        /* JADX WARN: Invalid debug info offset */
        public HandlerC1805g(HomeActivity homeActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.HomeActivity$h */
    public class HandlerC1806h extends Handler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeActivity f4971a;

        /* JADX WARN: Invalid debug info offset */
        public HandlerC1806h(HomeActivity homeActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.HomeActivity$i */
    public class RunnableC1807i implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f4972a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HomeActivity f4973b;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC1807i(HomeActivity homeActivity, Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.HomeActivity$j */
    public class C1808j extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeActivity f4974a;

        /* JADX WARN: Invalid debug info offset */
        public C1808j(HomeActivity homeActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m9771a(Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m9772b(Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.HomeActivity$k */
    public class C1809k extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeActivity f4975a;

        /* JADX WARN: Invalid debug info offset */
        public C1809k(HomeActivity homeActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ C1809k(HomeActivity homeActivity, AsyncTaskC1800b asyncTaskC1800b) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m9773a() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m9774b() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.HomeActivity$l */
    public class C1810l extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeActivity f4976a;

        /* JADX WARN: Invalid debug info offset */
        public C1810l(HomeActivity homeActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ C1810l(HomeActivity homeActivity, AsyncTaskC1800b asyncTaskC1800b) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.HomeActivity$m */
    public class C1811m extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeActivity f4977a;

        /* JADX WARN: Invalid debug info offset */
        public C1811m(HomeActivity homeActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ C1811m(HomeActivity homeActivity, AsyncTaskC1800b asyncTaskC1800b) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.HomeActivity$n */
    public class C1812n extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeActivity f4978a;

        /* JADX WARN: Invalid debug info offset */
        public C1812n(HomeActivity homeActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ C1812n(HomeActivity homeActivity, AsyncTaskC1800b asyncTaskC1800b) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.HomeActivity$o */
    public class C1813o extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeActivity f4979a;

        /* JADX WARN: Invalid debug info offset */
        public C1813o(HomeActivity homeActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ C1813o(HomeActivity homeActivity, AsyncTaskC1800b asyncTaskC1800b) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.HomeActivity$p */
    public class C1814p extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeActivity f4980a;

        /* JADX WARN: Invalid debug info offset */
        public C1814p(HomeActivity homeActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ C1814p(HomeActivity homeActivity, AsyncTaskC1800b asyncTaskC1800b) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.HomeActivity$q */
    public class C1815q extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeActivity f4981a;

        /* JADX WARN: Invalid debug info offset */
        public C1815q(HomeActivity homeActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ C1815q(HomeActivity homeActivity, AsyncTaskC1800b asyncTaskC1800b) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.HomeActivity$r */
    public class C1816r extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeActivity f4982a;

        /* JADX WARN: Invalid debug info offset */
        public C1816r(HomeActivity homeActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ C1816r(HomeActivity homeActivity, AsyncTaskC1800b asyncTaskC1800b) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B1 */
    private void m9717B1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m9718P0(HomeActivity homeActivity, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m9719Q0(HomeActivity homeActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m9720R0(HomeActivity homeActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ View m9721S0(HomeActivity homeActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ void m9722T0(HomeActivity homeActivity, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m9723U0(HomeActivity homeActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ HomeLayoutBinding m9724V0(HomeActivity homeActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m9725W0(HomeActivity homeActivity, C4898np c4898np) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ InterfaceC2229a.d m9726X0(HomeActivity homeActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ Handler m9727Y0(HomeActivity homeActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ int m9728Z0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ Handler m9729a1(HomeActivity homeActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ int m9730b1() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ DialogC4557ii m9731c1(HomeActivity homeActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ void m9732d1(HomeActivity homeActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x1 */
    private void m9733x1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A1 */
    public final void m9734A1(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.home.InterfaceC2229a.a
    /* JADX INFO: renamed from: B */
    public void mo9735B(Drawable drawable) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C1 */
    public final void m9736C1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D1 */
    public void m9737D1(Context context) {
    }

    /* JADX INFO: renamed from: E1 */
    public void m9738E1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    public final void m9739e1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.home.InterfaceC2229a.a
    /* JADX INFO: renamed from: f */
    public void mo9740f() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    public final void m9741f1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g1 */
    public final void m9742g1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.C0061Aw.j
    /* JADX INFO: renamed from: h */
    public void mo333h(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    public final void m9743h1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x001e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: i1 */
    public final void m9744i1() {
        /*
            r3 = this;
            return
        L2b:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.HomeActivity.m9744i1():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j1 */
    public final C4898np m9745j1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    /* JADX INFO: renamed from: k1 */
    public final BaseHomeTopViewFragment m9746k1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l1 */
    public final void m9747l1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m1 */
    public final void m9748m1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.C1275Tp.f
    /* JADX INFO: renamed from: n */
    public boolean mo6109n(C4312eq c4312eq, C1275Tp.e eVar) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n1 */
    public final void m9749n1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0068
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: o1 */
    public final void m9750o1(p000.C4898np r10) {
        /*
            r9 = this;
            return
        L6e:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.HomeActivity.m9750o1(np):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0025
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        /*
            r3 = this;
            return
        L2d:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.HomeActivity.onDestroy():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Activity
    public void onRestoreInstanceState(@NonNull Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p1 */
    public final void m9751p1(C4898np c4898np) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m9752q1(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m9753r1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.home.InterfaceC2229a.a
    /* JADX INFO: renamed from: s */
    public void mo9754s() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m9755s1(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ View m9756t1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m9757u1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m9758v1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w1 */
    public final void m9759w1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y1 */
    public final void m9760y1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z1 */
    public final void m9761z1() {
    }
}
