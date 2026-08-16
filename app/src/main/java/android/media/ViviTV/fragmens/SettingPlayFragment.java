package android.media.ViviTV.fragmens;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.ViviTV.databinding.SettingPlayBinding;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.Nullable;
import p000.EnumC6006m10;

/* JADX INFO: loaded from: classes.dex */
public class SettingPlayFragment extends BaseSlaveFragment implements View.OnClickListener, View.OnKeyListener {

    /* JADX INFO: renamed from: r */
    public static final int f8320r = 0;

    /* JADX INFO: renamed from: s */
    public static final int f8321s = 1;

    /* JADX INFO: renamed from: e */
    public C2104f f8322e;

    /* JADX INFO: renamed from: f */
    public int f8323f;

    /* JADX INFO: renamed from: g */
    public EnumC6006m10 f8324g;

    /* JADX INFO: renamed from: h */
    public int f8325h;

    /* JADX INFO: renamed from: i */
    public int f8326i;

    /* JADX INFO: renamed from: j */
    public int f8327j;

    /* JADX INFO: renamed from: k */
    public int f8328k;

    /* JADX INFO: renamed from: l */
    public boolean f8329l;

    /* JADX INFO: renamed from: m */
    public int f8330m;

    /* JADX INFO: renamed from: n */
    public boolean f8331n;

    /* JADX INFO: renamed from: o */
    public SettingPlayBinding f8332o;

    /* JADX INFO: renamed from: p */
    public BroadcastReceiver f8333p;

    /* JADX INFO: renamed from: q */
    public Runnable f8334q;

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.SettingPlayFragment$a */
    public class ViewOnFocusChangeListenerC2099a implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SettingPlayFragment f8335a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnFocusChangeListenerC2099a(SettingPlayFragment settingPlayFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.SettingPlayFragment$b */
    public class ViewOnClickListenerC2100b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ EditText f8336a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ EditText f8337b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Dialog f8338c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ SettingPlayFragment f8339d;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC2100b(SettingPlayFragment settingPlayFragment, EditText editText, EditText editText2, Dialog dialog) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0016
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                return
            L28:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.fragmens.SettingPlayFragment.ViewOnClickListenerC2100b.onClick(android.view.View):void");
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.SettingPlayFragment$c */
    public class ViewOnClickListenerC2101c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Dialog f8340a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SettingPlayFragment f8341b;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC2101c(SettingPlayFragment settingPlayFragment, Dialog dialog) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.SettingPlayFragment$d */
    public class C2102d extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SettingPlayFragment f8342a;

        /* JADX WARN: Invalid debug info offset */
        public C2102d(SettingPlayFragment settingPlayFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.SettingPlayFragment$e */
    public class RunnableC2103e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SettingPlayFragment f8343a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2103e(SettingPlayFragment settingPlayFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.SettingPlayFragment$f */
    public class C2104f extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SettingPlayFragment f8344a;

        /* JADX WARN: Invalid debug info offset */
        public C2104f(SettingPlayFragment settingPlayFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ C2104f(SettingPlayFragment settingPlayFragment, ViewOnFocusChangeListenerC2099a viewOnFocusChangeListenerC2099a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ SettingPlayBinding m12563K0(SettingPlayFragment settingPlayFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m12564L0(SettingPlayFragment settingPlayFragment, Intent intent) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    private void m12565P0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    public static final void m12566i1(View.OnClickListener onClickListener, View... viewArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseSlaveFragment
    /* JADX INFO: renamed from: E0 */
    public void mo12054E0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M0 */
    public final void m12567M0(Intent intent) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    public final void m12568N0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O0 */
    public final void m12569O0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public final void m12570Q0(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public final String m12571R0(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public final String m12572S0(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public final String m12573T0(boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public final String m12574U0(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public final String m12575V0(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public final String m12576W0(EnumC6006m10 enumC6006m10) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public final String m12577X0(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public final String m12578Y0(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public final void m12579Z0(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public final void m12580a1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    public final void m12581b1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public final void m12582c1(Boolean bool) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public final void m12583d1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    public final void m12584e1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    public final void m12585f1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g1 */
    public final void m12586g1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    public final void m12587h1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j1 */
    public final void m12588j1(View... viewArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k1 */
    public final void m12589k1(View... viewArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l1 */
    public final void m12590l1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m1 */
    public final void m12591m1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n1 */
    public final void m12592n1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o1 */
    public final void m12593o1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p1 */
    public final void m12594p1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q1 */
    public final void m12595q1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r1 */
    public final void m12596r1() {
    }
}
