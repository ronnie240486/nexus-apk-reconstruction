package android.media.ViviTV.home;

import android.media.ViviTV.broadcast.UsbReceiver;
import android.media.ViviTV.databinding.FragmentHomeTopViewNexusStyleBinding;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.TimerTask;
import p000.C5176pP;
import p000.DialogC1326Uc;
import p000.EnumC0533ID;
import p000.X30;

/* JADX INFO: loaded from: classes.dex */
public class HomeTopViewFragmentNexusStyle extends BaseHomeTopViewFragment implements View.OnClickListener, InterfaceC2229a.e, UsbReceiver.InterfaceC1993a {

    /* JADX INFO: renamed from: a */
    public FragmentHomeTopViewNexusStyleBinding f8830a;

    /* JADX INFO: renamed from: b */
    public DialogC1326Uc f8831b;

    /* JADX INFO: renamed from: c */
    public C5176pP f8832c;

    /* JADX INFO: renamed from: d */
    public C5176pP f8833d;

    /* JADX INFO: renamed from: e */
    public int f8834e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2229a.d f8835f;

    /* JADX INFO: renamed from: g */
    public List<X30> f8836g;

    /* JADX INFO: renamed from: h */
    public final View.OnKeyListener f8837h;

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeTopViewFragmentNexusStyle$a */
    public class ViewOnKeyListenerC2214a implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeTopViewFragmentNexusStyle f8838a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC2214a(HomeTopViewFragmentNexusStyle homeTopViewFragmentNexusStyle) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeTopViewFragmentNexusStyle$b */
    public class C2215b extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8839a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HomeTopViewFragmentNexusStyle f8840b;

        /* JADX WARN: Invalid debug info offset */
        public C2215b(HomeTopViewFragmentNexusStyle homeTopViewFragmentNexusStyle, List list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m13246a(C2215b c2215b, List list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m13247b(List list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeTopViewFragmentNexusStyle$c */
    public class C2216c extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8841a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HomeTopViewFragmentNexusStyle f8842b;

        /* JADX WARN: Invalid debug info offset */
        public C2216c(HomeTopViewFragmentNexusStyle homeTopViewFragmentNexusStyle, List list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m13248a(C2216c c2216c, X30 x30) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m13249b(X30 x30) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeTopViewFragmentNexusStyle$d */
    public static /* synthetic */ class C2217d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8843a;

        static {
            int[] iArr = new int[EnumC0533ID.values().length];
            f8843a = iArr;
            try {
                iArr[EnumC0533ID.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8843a[EnumC0533ID.ET_NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8843a[EnumC0533ID.DISCONNECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m13228E0(HomeTopViewFragmentNexusStyle homeTopViewFragmentNexusStyle, DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ boolean m13229F0(HomeTopViewFragmentNexusStyle homeTopViewFragmentNexusStyle) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ boolean m13230G0(HomeTopViewFragmentNexusStyle homeTopViewFragmentNexusStyle, List list) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m13231H0(HomeTopViewFragmentNexusStyle homeTopViewFragmentNexusStyle, List list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ int m13232I0(HomeTopViewFragmentNexusStyle homeTopViewFragmentNexusStyle) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ int m13233J0(HomeTopViewFragmentNexusStyle homeTopViewFragmentNexusStyle, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ int m13234K0(HomeTopViewFragmentNexusStyle homeTopViewFragmentNexusStyle) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    private void m13235L0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M0 */
    private void m13236M0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    private void m13237N0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O0 */
    private void m13238O0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    private void m13239P0(List<X30> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    private void m13240Q0(List<X30> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    private boolean m13241R0(List<X30> list) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    private /* synthetic */ void m13242S0(DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    private void m13243V0(List<X30> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.home.InterfaceC2229a.e
    /* JADX INFO: renamed from: S */
    public void mo13201S() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public final boolean m13244T0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public void m13245U0(InterfaceC2229a.d dVar) {
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
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.home.HomeTopViewFragmentNexusStyle.mo10831o(java.lang.String):void");
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
