package android.media.ViviTV.home;

import android.media.ViviTV.broadcast.UsbReceiver;
import android.media.ViviTV.databinding.FragmentHomeTopViewBinding;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import p000.DialogC1326Uc;
import p000.EnumC0533ID;
import p000.X30;

/* JADX INFO: loaded from: classes.dex */
public class HomeTopViewFragment extends BaseHomeTopViewFragment implements View.OnClickListener, InterfaceC2229a.e, UsbReceiver.InterfaceC1993a {

    /* JADX INFO: renamed from: a */
    public FragmentHomeTopViewBinding f8816a;

    /* JADX INFO: renamed from: b */
    public DialogC1326Uc f8817b;

    /* JADX INFO: renamed from: c */
    public Timer f8818c;

    /* JADX INFO: renamed from: d */
    public Timer f8819d;

    /* JADX INFO: renamed from: e */
    public int f8820e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2229a.d f8821f;

    /* JADX INFO: renamed from: g */
    public List<X30> f8822g;

    /* JADX INFO: renamed from: h */
    public final View.OnKeyListener f8823h;

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeTopViewFragment$a */
    public class ViewOnKeyListenerC2210a implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeTopViewFragment f8824a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC2210a(HomeTopViewFragment homeTopViewFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeTopViewFragment$b */
    public class C2211b extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8825a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HomeTopViewFragment f8826b;

        /* JADX WARN: Invalid debug info offset */
        public C2211b(HomeTopViewFragment homeTopViewFragment, List list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m13224a(C2211b c2211b, List list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m13225b(List list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeTopViewFragment$c */
    public class C2212c extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8827a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HomeTopViewFragment f8828b;

        /* JADX WARN: Invalid debug info offset */
        public C2212c(HomeTopViewFragment homeTopViewFragment, List list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m13226a(C2212c c2212c, X30 x30) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m13227b(X30 x30) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeTopViewFragment$d */
    public static /* synthetic */ class C2213d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8829a;

        static {
            int[] iArr = new int[EnumC0533ID.values().length];
            f8829a = iArr;
            try {
                iArr[EnumC0533ID.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8829a[EnumC0533ID.ET_NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8829a[EnumC0533ID.DISCONNECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m13207E0(HomeTopViewFragment homeTopViewFragment, DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ InterfaceC2229a.d m13208F0(HomeTopViewFragment homeTopViewFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ boolean m13209G0(HomeTopViewFragment homeTopViewFragment, List list) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m13210H0(HomeTopViewFragment homeTopViewFragment, List list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ int m13211I0(HomeTopViewFragment homeTopViewFragment) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ int m13212J0(HomeTopViewFragment homeTopViewFragment, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ int m13213K0(HomeTopViewFragment homeTopViewFragment) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    private void m13214N0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public final void m13215L0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M0 */
    public final void m13216M0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O0 */
    public final void m13217O0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public final void m13218P0(List<X30> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public final void m13219Q0(List<X30> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public final boolean m13220R0(List<X30> list) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.home.InterfaceC2229a.e
    /* JADX INFO: renamed from: S */
    public void mo13201S() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m13221S0(DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public void m13222T0(InterfaceC2229a.d dVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public final void m13223U0(List<X30> list) {
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
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.home.HomeTopViewFragment.mo10831o(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.home.InterfaceC2229a.e
    /* JADX INFO: renamed from: s0 */
    public void mo13204s0(EnumC0533ID enumC0533ID) {
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
}
