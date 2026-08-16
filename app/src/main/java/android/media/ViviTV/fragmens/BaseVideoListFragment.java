package android.media.ViviTV.fragmens;

import android.app.Activity;
import android.media.ViviTV.adapters.ViewOnKeyListenerC1991b;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import p000.AbstractViewOnKeyListenerC1663Zn;
import p000.C1216Sv;
import p000.C6071v30;
import p000.InterfaceC1408Vq;
import p000.R00;
import p000.X00;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseVideoListFragment extends Fragment implements AbsListView.OnScrollListener, View.OnClickListener {

    /* JADX INFO: renamed from: C */
    public static final int f7964C = 1;

    /* JADX INFO: renamed from: D */
    public static final int f7965D = 2;

    /* JADX INFO: renamed from: E */
    public static final int f7966E = 0;

    /* JADX INFO: renamed from: F */
    public static final int f7967F = 3;

    /* JADX INFO: renamed from: A */
    public int f7968A;

    /* JADX INFO: renamed from: B */
    public Handler f7969B;

    /* JADX INFO: renamed from: a */
    public HashMap<String, String> f7970a;

    /* JADX INFO: renamed from: b */
    public View f7971b;

    /* JADX INFO: renamed from: c */
    public GridView f7972c;

    /* JADX INFO: renamed from: d */
    public int f7973d;

    /* JADX INFO: renamed from: e */
    public int f7974e;

    /* JADX INFO: renamed from: f */
    public boolean f7975f;

    /* JADX INFO: renamed from: g */
    public TextView f7976g;

    /* JADX INFO: renamed from: h */
    public ViewOnKeyListenerC1991b f7977h;

    /* JADX INFO: renamed from: i */
    public Button f7978i;

    /* JADX INFO: renamed from: j */
    public View f7979j;

    /* JADX INFO: renamed from: k */
    public ImageView f7980k;

    /* JADX INFO: renamed from: l */
    public TextView f7981l;

    /* JADX INFO: renamed from: m */
    public Animation f7982m;

    /* JADX INFO: renamed from: n */
    public String f7983n;

    /* JADX INFO: renamed from: o */
    public InterfaceC2018g f7984o;

    /* JADX INFO: renamed from: p */
    public int f7985p;

    /* JADX INFO: renamed from: q */
    public TextView f7986q;

    /* JADX INFO: renamed from: r */
    public RelativeLayout f7987r;

    /* JADX INFO: renamed from: s */
    public TextView f7988s;

    /* JADX INFO: renamed from: t */
    public X00 f7989t;

    /* JADX INFO: renamed from: u */
    public boolean f7990u;

    /* JADX INFO: renamed from: v */
    public TextView f7991v;

    /* JADX INFO: renamed from: w */
    public TextView f7992w;

    /* JADX INFO: renamed from: x */
    public TextView f7993x;

    /* JADX INFO: renamed from: y */
    public boolean f7994y;

    /* JADX INFO: renamed from: z */
    public boolean f7995z;

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.BaseVideoListFragment$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC2012a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseVideoListFragment f7996a;

        /* JADX WARN: Invalid debug info offset */
        public ViewTreeObserverOnGlobalLayoutListenerC2012a(BaseVideoListFragment baseVideoListFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.BaseVideoListFragment$b */
    public class C2013b extends AbstractViewOnKeyListenerC1663Zn {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ BaseVideoListFragment f7997e;

        /* JADX WARN: Invalid debug info offset */
        public C2013b(BaseVideoListFragment baseVideoListFragment, GridView gridView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractViewOnKeyListenerC1663Zn
        /* JADX INFO: renamed from: b */
        public boolean mo8770b(View view, int i, KeyEvent keyEvent) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractViewOnKeyListenerC1663Zn
        /* JADX INFO: renamed from: d */
        public boolean mo8772d() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractViewOnKeyListenerC1663Zn
        /* JADX INFO: renamed from: f */
        public boolean mo8774f() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractViewOnKeyListenerC1663Zn
        /* JADX INFO: renamed from: k */
        public void mo8779k() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.BaseVideoListFragment$c */
    public class C2014c implements ViewOnKeyListenerC1991b.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseVideoListFragment f7998a;

        /* JADX WARN: Invalid debug info offset */
        public C2014c(BaseVideoListFragment baseVideoListFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.adapters.ViewOnKeyListenerC1991b.b
        /* JADX INFO: renamed from: G */
        public void mo9910G(int i, R00 r00) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.BaseVideoListFragment$d */
    public class C2015d extends C6071v30.C5566c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseVideoListFragment f7999a;

        /* JADX WARN: Invalid debug info offset */
        public C2015d(BaseVideoListFragment baseVideoListFragment) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.BaseVideoListFragment$e */
    public class AsyncTaskC2016e extends AsyncTask<Void, Void, C1216Sv> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f8000a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseVideoListFragment f8001b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2016e(BaseVideoListFragment baseVideoListFragment, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public C1216Sv m12113a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: b */
        public void m12114b(p000.C1216Sv r4) {
            /*
                r3 = this;
                return
            L3a:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.fragmens.BaseVideoListFragment.AsyncTaskC2016e.m12114b(Sv):void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ C1216Sv doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(C1216Sv c1216Sv) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.BaseVideoListFragment$f */
    public class HandlerC2017f extends Handler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseVideoListFragment f8002a;

        /* JADX WARN: Invalid debug info offset */
        public HandlerC2017f(BaseVideoListFragment baseVideoListFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.BaseVideoListFragment$g */
    public interface InterfaceC2018g extends InterfaceC1408Vq {
        /* JADX INFO: renamed from: C */
        void mo10227C(int i, int i2);
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m12067D0(BaseVideoListFragment baseVideoListFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ InterfaceC2018g m12068E0(BaseVideoListFragment baseVideoListFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ ImageView m12069F0(BaseVideoListFragment baseVideoListFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ void m12070G0(BaseVideoListFragment baseVideoListFragment, R00 r00) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ boolean m12071H0(BaseVideoListFragment baseVideoListFragment, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ Handler m12072I0(BaseVideoListFragment baseVideoListFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ Button m12073J0(BaseVideoListFragment baseVideoListFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ TextView m12074K0(BaseVideoListFragment baseVideoListFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ TextView m12075L0(BaseVideoListFragment baseVideoListFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ View m12076M0(BaseVideoListFragment baseVideoListFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ Animation m12077N0(BaseVideoListFragment baseVideoListFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: O0 */
    public final void m12078O0() {
    }

    /* JADX INFO: renamed from: P0 */
    public abstract void mo12079P0(View view);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public final void m12080Q0(R00 r00) {
    }

    /* JADX INFO: renamed from: R0 */
    public abstract void mo12081R0(HashMap<String, String> map);

    /* JADX INFO: renamed from: S0 */
    public abstract String mo12082S0();

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public String m12083T0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public int mo12084U0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public int m12085V0() {
        return 0;
    }

    /* JADX INFO: renamed from: W0 */
    public int mo12086W0() {
        return 6;
    }

    /* JADX INFO: renamed from: X0 */
    public boolean mo12087X0() {
        return true;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public final void m12088Y0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public final void m12089Z0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public final void m12090a1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    public final void m12091b1(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public final void m12092c1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public boolean mo12093d1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    public final void m12094e1(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    public final void m12095f1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g1 */
    public final void m12096g1() {
    }

    /* JADX INFO: renamed from: h1 */
    public boolean mo12097h1() {
        return true;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    public final void m12098i1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: j1 */
    public final void m12099j1(int r4) {
        /*
            r3 = this;
            return
        L28:
        L2a:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.fragmens.BaseVideoListFragment.m12099j1(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k1 */
    public final void m12100k1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l1 */
    public void m12101l1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m1 */
    public final boolean m12102m1(X00 x00, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n1 */
    public final void m12103n1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o1 */
    public final void m12104o1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p1 */
    public void mo12105p1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q1 */
    public void m12106q1(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r1 */
    public void m12107r1(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s1 */
    public void m12108s1(InterfaceC2018g interfaceC2018g) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t1 */
    public void m12109t1(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u1 */
    public void m12110u1(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v1 */
    public void m12111v1(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w1 */
    public final void m12112w1() {
    }
}
