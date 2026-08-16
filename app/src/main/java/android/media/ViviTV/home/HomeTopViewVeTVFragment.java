package android.media.ViviTV.home;

import android.annotation.SuppressLint;
import android.media.ViviTV.adapters.HomeMovieAdapterRr;
import android.media.ViviTV.adapters.RecyclerAdapterPTR;
import android.media.ViviTV.broadcast.UsbReceiver;
import android.media.ViviTV.databinding.FragmentHomeTopViewVetvBinding;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import p000.C5176pP;
import p000.DialogC1326Uc;
import p000.EnumC0533ID;
import p000.R00;
import p000.X00;
import p000.X30;

/* JADX INFO: loaded from: classes.dex */
public class HomeTopViewVeTVFragment extends BaseHomeTopViewFragment implements View.OnClickListener, InterfaceC2229a.e, UsbReceiver.InterfaceC1993a, View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public FragmentHomeTopViewVetvBinding f8844a;

    /* JADX INFO: renamed from: b */
    public DialogC1326Uc f8845b;

    /* JADX INFO: renamed from: c */
    public C5176pP f8846c;

    /* JADX INFO: renamed from: d */
    public C5176pP f8847d;

    /* JADX INFO: renamed from: e */
    public int f8848e;

    /* JADX INFO: renamed from: f */
    public List<X30> f8849f;

    /* JADX INFO: renamed from: g */
    public C5176pP f8850g;

    /* JADX INFO: renamed from: h */
    public long f8851h;

    /* JADX INFO: renamed from: i */
    public String[] f8852i;

    /* JADX INFO: renamed from: j */
    public HomeMovieAdapterRr.InterfaceC1950a f8853j;

    /* JADX INFO: renamed from: k */
    public RecyclerAdapterPTR.InterfaceC1978d f8854k;

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeTopViewVeTVFragment$a */
    public class C2218a extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeTopViewVeTVFragment f8855a;

        /* JADX WARN: Invalid debug info offset */
        public C2218a(HomeTopViewVeTVFragment homeTopViewVeTVFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeTopViewVeTVFragment$b */
    public class AsyncTaskC2219b extends AsyncTask<Void, Integer, X00> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeTopViewVeTVFragment f8856a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2219b(HomeTopViewVeTVFragment homeTopViewVeTVFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public X00 m13278a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m13279b(X00 x00) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ X00 doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(X00 x00) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeTopViewVeTVFragment$c */
    public class C2220c extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8857a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HomeTopViewVeTVFragment f8858b;

        /* JADX WARN: Invalid debug info offset */
        public C2220c(HomeTopViewVeTVFragment homeTopViewVeTVFragment, List list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m13280a(C2220c c2220c, List list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m13281b(List list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeTopViewVeTVFragment$d */
    public class C2221d extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8859a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HomeTopViewVeTVFragment f8860b;

        /* JADX WARN: Invalid debug info offset */
        public C2221d(HomeTopViewVeTVFragment homeTopViewVeTVFragment, List list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m13282a(C2221d c2221d, X30 x30) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m13283b(X30 x30) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeTopViewVeTVFragment$f */
    public class C2223f implements RecyclerAdapterPTR.InterfaceC1978d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeTopViewVeTVFragment f8862a;

        /* JADX WARN: Invalid debug info offset */
        public C2223f(HomeTopViewVeTVFragment homeTopViewVeTVFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.adapters.RecyclerAdapterPTR.InterfaceC1978d
        /* JADX INFO: renamed from: a */
        public boolean mo9928a(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeTopViewVeTVFragment$g */
    public static /* synthetic */ class C2224g {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8863a;

        static {
            int[] iArr = new int[EnumC0533ID.values().length];
            f8863a = iArr;
            try {
                iArr[EnumC0533ID.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8863a[EnumC0533ID.ET_NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8863a[EnumC0533ID.DISCONNECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ int m13250E0(R00 r00, R00 r01) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m13251F0(HomeTopViewVeTVFragment homeTopViewVeTVFragment, DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ long m13252G0(HomeTopViewVeTVFragment homeTopViewVeTVFragment) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ long m13253H0(HomeTopViewVeTVFragment homeTopViewVeTVFragment, long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ void m13254I0(HomeTopViewVeTVFragment homeTopViewVeTVFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ ArrayList m13255J0(HomeTopViewVeTVFragment homeTopViewVeTVFragment, X00 x00) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ HomeMovieAdapterRr.InterfaceC1950a m13256K0(HomeTopViewVeTVFragment homeTopViewVeTVFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ boolean m13257L0(HomeTopViewVeTVFragment homeTopViewVeTVFragment, List list) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ void m13258M0(HomeTopViewVeTVFragment homeTopViewVeTVFragment, List list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ int m13259N0(HomeTopViewVeTVFragment homeTopViewVeTVFragment) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ int m13260O0(HomeTopViewVeTVFragment homeTopViewVeTVFragment, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ int m13261P0(HomeTopViewVeTVFragment homeTopViewVeTVFragment) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    private void m13262R0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    private void m13263S0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    private void m13264T0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @SuppressLint({"SimpleDateFormat"})
    /* JADX INFO: renamed from: V0 */
    private void m13265V0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    private void m13266W0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    private void m13267X0(List<X30> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    private void m13268Y0(List<X30> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    private boolean m13269Z0(List<X30> list) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ int m13270b1(R00 r00, R00 r01) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    private void m13271e1(List<X30> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public final void m13272Q0() {
    }

    @Override // android.media.ViviTV.home.InterfaceC2229a.e
    /* JADX INFO: renamed from: S */
    public void mo13201S() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public final void m13273U0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m13274a1(DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX INFO: renamed from: c1 */
    public void m13275c1(InterfaceC2229a.d dVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public final ArrayList<R00> m13276d1(X00 x00) {
        return null;
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
    /* JADX INFO: renamed from: f1 */
    public final void m13277f1() {
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
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.home.HomeTopViewVeTVFragment.mo10831o(java.lang.String):void");
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
    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
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

    /* JADX INFO: renamed from: android.media.ViviTV.home.HomeTopViewVeTVFragment$e */
    public class C2222e implements HomeMovieAdapterRr.InterfaceC1950a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeTopViewVeTVFragment f8861a;

        /* JADX WARN: Invalid debug info offset */
        public C2222e(HomeTopViewVeTVFragment homeTopViewVeTVFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.adapters.HomeMovieAdapterRr.InterfaceC1950a
        /* JADX INFO: renamed from: a */
        public void mo10535a(int i, R00 r00) {
        }

        @Override // android.media.ViviTV.adapters.HomeMovieAdapterRr.InterfaceC1950a
        /* JADX INFO: renamed from: b */
        public void mo10536b(int i, R00 r00) {
        }
    }
}
