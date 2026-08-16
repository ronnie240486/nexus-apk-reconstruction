package android.media.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.ViviTV.broadcast.PackageReceiver;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.List;
import p000.AbstractAsyncTaskC1424W5;
import p000.C0736LM;
import p000.C1683a4;
import p000.C4650k3;
import p000.C5205ps;
import p000.DialogC1326Uc;
import p000.InterfaceC0382Fq;

/* JADX INFO: loaded from: classes.dex */
public class ApplicationLayout extends RelativeLayout implements InterfaceC0382Fq, CompoundButton.OnCheckedChangeListener, AdapterView.OnItemClickListener, PackageReceiver.InterfaceC1992a, C1683a4.e {

    /* JADX INFO: renamed from: a */
    public GridView f9974a;

    /* JADX INFO: renamed from: b */
    public CheckBox f9975b;

    /* JADX INFO: renamed from: c */
    public C5205ps f9976c;

    /* JADX INFO: renamed from: d */
    public PackageReceiver f9977d;

    /* JADX INFO: renamed from: e */
    public boolean f9978e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2380f f9979f;

    /* JADX INFO: renamed from: g */
    public HashMap<Object, Object> f9980g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f9981h;

    /* JADX INFO: renamed from: i */
    public InterfaceC2378d f9982i;

    /* JADX INFO: renamed from: j */
    public boolean f9983j;

    /* JADX INFO: renamed from: k */
    public boolean f9984k;

    /* JADX INFO: renamed from: l */
    public InterfaceC2379e f9985l;

    /* JADX INFO: renamed from: android.media.view.ApplicationLayout$a */
    public class C2375a implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a */
        public View f9986a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ApplicationLayout f9987b;

        /* JADX WARN: Invalid debug info offset */
        public C2375a(ApplicationLayout applicationLayout) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: renamed from: android.media.view.ApplicationLayout$b */
    public class C2376b implements AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ApplicationLayout f9988a;

        /* JADX WARN: Invalid debug info offset */
        public C2376b(ApplicationLayout applicationLayout) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* JADX INFO: renamed from: android.media.view.ApplicationLayout$c */
    public class AsyncTaskC2377c extends AbstractAsyncTaskC1424W5<Boolean> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ DialogC1326Uc f9989i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C4650k3 f9990j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ ApplicationLayout f9991k;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2377c(ApplicationLayout applicationLayout, Context context, String str, AbstractAsyncTaskC1424W5.a aVar, List list, Class cls, DialogC1326Uc dialogC1326Uc, C4650k3 c4650k3) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractAsyncTaskC1424W5
        /* JADX INFO: renamed from: b */
        public /* bridge */ /* synthetic */ void mo6705b(Boolean bool) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractAsyncTaskC1424W5
        /* JADX INFO: renamed from: d */
        public Pair<Boolean, Boolean> mo6707d(String str, String str2, int i) throws Exception {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public void m14458e(Boolean bool) {
        }
    }

    /* JADX INFO: renamed from: android.media.view.ApplicationLayout$d */
    public interface InterfaceC2378d {
        /* JADX INFO: renamed from: p */
        boolean mo9816p(AdapterView<?> adapterView, View view, int i, C4650k3 c4650k3);
    }

    /* JADX INFO: renamed from: android.media.view.ApplicationLayout$e */
    public interface InterfaceC2379e {
        /* JADX INFO: renamed from: P */
        void mo9804P(int i);
    }

    /* JADX INFO: renamed from: android.media.view.ApplicationLayout$f */
    public interface InterfaceC2380f {
        /* JADX INFO: renamed from: r */
        void mo9818r();
    }

    /* JADX WARN: Invalid debug info offset */
    public ApplicationLayout(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ApplicationLayout(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ApplicationLayout(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(21)
    public ApplicationLayout(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m14439j(ApplicationLayout applicationLayout, View view, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m14440k(ApplicationLayout applicationLayout, C4650k3 c4650k3, DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m14441l(DialogC1326Uc dialogC1326Uc) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ boolean m14442m(ApplicationLayout applicationLayout, View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ InterfaceC2379e m14443n(ApplicationLayout applicationLayout) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m14444p(ApplicationLayout applicationLayout, C4650k3 c4650k3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m14445y(DialogC1326Uc dialogC1326Uc) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.C1683a4.e
    /* JADX INFO: renamed from: A */
    public void mo8873A(C4650k3 c4650k3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public void m14446B() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public final void m14447C(C4650k3 c4650k3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public final void m14448D(C4650k3 c4650k3, DialogC1326Uc dialogC1326Uc, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.broadcast.PackageReceiver.InterfaceC1992a
    /* JADX INFO: renamed from: Q */
    public void mo10040Q(String str) {
    }

    @Override // p000.InterfaceC0382Fq
    /* JADX INFO: renamed from: a */
    public boolean mo1944a() {
        return true;
    }

    @Override // p000.InterfaceC0382Fq
    /* JADX INFO: renamed from: b */
    public boolean mo1945b(int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0382Fq
    /* JADX INFO: renamed from: c */
    public void mo1946c() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.broadcast.PackageReceiver.InterfaceC1992a
    /* JADX INFO: renamed from: d */
    public void mo10045d(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0382Fq
    public void destroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.C1683a4.e
    /* JADX INFO: renamed from: e */
    public void mo8874e(C4650k3 c4650k3, String str) {
    }

    @Override // p000.InterfaceC0382Fq
    /* JADX INFO: renamed from: f */
    public void mo1947f() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.C1683a4.e
    /* JADX INFO: renamed from: g */
    public void mo8875g(C4650k3 c4650k3, double d, long j) {
    }

    @Override // p000.InterfaceC0382Fq
    /* JADX INFO: renamed from: h */
    public int mo1948h() {
        return 0;
    }

    @Override // p000.InterfaceC0382Fq
    /* JADX INFO: renamed from: i */
    public void mo1949i() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.C1683a4.e
    /* JADX INFO: renamed from: o */
    public void mo8876o(C4650k3 c4650k3) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public final void m14449q(List<C0736LM> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public final C5205ps.a m14450r(C4650k3 c4650k3) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public final void m14451s(C4650k3 c4650k3) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setExtraItemListener(InterfaceC2378d interfaceC2378d) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setIsUninstallMode(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOnRecommendAppLoadFailedListener(InterfaceC2380f interfaceC2380f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOnlyShowPlatformApp(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setReachBottomListener(InterfaceC2379e interfaceC2379e) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setRecommendApps(List<C0736LM> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setShowInstallStatus(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setUninstallModeButtonVisibility(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public final void m14452t() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public final void m14453u() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m14454v(android.view.View r3, boolean r4) {
        /*
            r2 = this;
            return
        L2e:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.view.ApplicationLayout.m14454v(android.view.View, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean m14455w(View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m14456x(C4650k3 c4650k3, DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public boolean m14457z() {
        return false;
    }
}
