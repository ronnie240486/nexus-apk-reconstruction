package android.media.ViviTV.home;

import android.media.ViviTV.broadcast.UsbReceiver;
import android.media.ViviTV.databinding.FragmentTopViewLeftLogoBinding;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.TimerTask;
import p000.C5176pP;
import p000.DialogC1326Uc;
import p000.EnumC0533ID;
import p000.X30;

/* JADX INFO: loaded from: classes.dex */
public class TopViewFragmentLeftLogo extends BaseHomeTopViewFragment implements View.OnClickListener, UsbReceiver.InterfaceC1993a {

    /* JADX INFO: renamed from: h */
    public static int f8864h = 1001;

    /* JADX INFO: renamed from: a */
    public FragmentTopViewLeftLogoBinding f8865a;

    /* JADX INFO: renamed from: b */
    public boolean f8866b;

    /* JADX INFO: renamed from: c */
    public C5176pP f8867c;

    /* JADX INFO: renamed from: d */
    public List<X30> f8868d;

    /* JADX INFO: renamed from: e */
    public int f8869e;

    /* JADX INFO: renamed from: f */
    public DialogC1326Uc f8870f;

    /* JADX INFO: renamed from: g */
    public Handler f8871g;

    /* JADX INFO: renamed from: android.media.ViviTV.home.TopViewFragmentLeftLogo$a */
    public class ViewOnClickListenerC2225a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TopViewFragmentLeftLogo f8872a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC2225a(TopViewFragmentLeftLogo topViewFragmentLeftLogo) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.TopViewFragmentLeftLogo$b */
    public class AsyncTaskC2226b extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public String f8873a;

        /* JADX INFO: renamed from: b */
        public String f8874b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ TopViewFragmentLeftLogo f8875c;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2226b(TopViewFragmentLeftLogo topViewFragmentLeftLogo) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Boolean m13302a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m13303b(Boolean bool) {
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

    /* JADX INFO: renamed from: android.media.ViviTV.home.TopViewFragmentLeftLogo$c */
    public class C2227c extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8876a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TopViewFragmentLeftLogo f8877b;

        /* JADX WARN: Invalid debug info offset */
        public C2227c(TopViewFragmentLeftLogo topViewFragmentLeftLogo, List list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m13304a(C2227c c2227c, List list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m13305b(List list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.TopViewFragmentLeftLogo$d */
    public class HandlerC2228d extends Handler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TopViewFragmentLeftLogo f8878a;

        /* JADX WARN: Invalid debug info offset */
        public HandlerC2228d(TopViewFragmentLeftLogo topViewFragmentLeftLogo) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m13284E0(TopViewFragmentLeftLogo topViewFragmentLeftLogo, DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m13285F0(TopViewFragmentLeftLogo topViewFragmentLeftLogo, X30 x30) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ FragmentTopViewLeftLogoBinding m13286G0(TopViewFragmentLeftLogo topViewFragmentLeftLogo) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ boolean m13287H0(TopViewFragmentLeftLogo topViewFragmentLeftLogo, List list) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ void m13288I0(TopViewFragmentLeftLogo topViewFragmentLeftLogo, List list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ int m13289J0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ List m13290K0(TopViewFragmentLeftLogo topViewFragmentLeftLogo) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    private void m13291L0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    private void m13292P0(List<X30> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    private void m13293Q0(List<X30> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    private boolean m13294R0(List<X30> list) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    private /* synthetic */ void m13295S0(DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    private void m13296V0(List<X30> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M0 */
    public final void m13297M0(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    public final void m13298N0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x001e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: O0 */
    public final void m13299O0() {
        /*
            r4 = this;
            return
        L47:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.home.TopViewFragmentLeftLogo.m13299O0():void");
    }

    @Override // android.media.ViviTV.home.InterfaceC2229a.e
    /* JADX INFO: renamed from: S */
    public void mo13201S() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m13300T0(X30 x30) {
    }

    /* JADX INFO: renamed from: U0 */
    public void m13301U0(InterfaceC2229a.d dVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.home.InterfaceC2229a.e
    /* JADX INFO: renamed from: e */
    public void mo13202e() {
    }

    @Override // android.media.ViviTV.home.InterfaceC2229a.e
    /* JADX INFO: renamed from: f */
    public void mo13203f(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.broadcast.UsbReceiver.InterfaceC1993a
    /* JADX INFO: renamed from: i */
    public void mo10830i(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x003b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // android.media.ViviTV.broadcast.UsbReceiver.InterfaceC1993a
    /* JADX INFO: renamed from: o */
    public void mo10831o(java.lang.String r2) {
        /*
            r1 = this;
            return
        L41:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.home.TopViewFragmentLeftLogo.mo10831o(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC5354s6
    /* JADX INFO: renamed from: u0 */
    public /* bridge */ /* synthetic */ void mo13183u0(InterfaceC2229a.d dVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.home.InterfaceC2229a.e
    /* JADX INFO: renamed from: w0 */
    public void mo13205w0(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.home.InterfaceC2229a.e
    /* JADX INFO: renamed from: x0 */
    public void mo13206x0(float f) {
    }

    @Override // android.media.ViviTV.home.InterfaceC2229a.e
    /* JADX INFO: renamed from: s0 */
    public void mo13204s0(EnumC0533ID enumC0533ID) {
    }
}
