package android.media.ViviTV.fragmens;

import android.media.ViviTV.adapters.JmpLabelListAdapter;
import android.media.ViviTV.adapters.JmpQuarterlyListAdapter;
import android.media.ViviTV.adapters.StarListAdapter;
import android.media.ViviTV.adapters.VideoEpisodeAdapterV2;
import android.media.ViviTV.databinding.LayoutFragmentVideoIntroductionV2Binding;
import android.media.ViviTV.model.persistent.VodRecode;
import android.media.ViviTV.widget.ExtendedRelativeLayout;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ListPopupWindow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p000.C0323Eu;
import p000.C0741LS;
import p000.C0804MS;
import p000.C0928OP;
import p000.C4289eT;
import p000.C6020o10;
import p000.DialogC1326Uc;
import p000.InterfaceC1394Vc;

/* JADX INFO: loaded from: classes.dex */
public class VideoIntroductionFragmentV2 extends BaseVideoIntroductionFragment implements JmpLabelListAdapter.InterfaceC1955a, View.OnFocusChangeListener, View.OnClickListener, InterfaceC1394Vc<VideoEpisodeAdapterV2.ViewHolderEpisode>, StarListAdapter.InterfaceC1987c, JmpQuarterlyListAdapter.InterfaceC1956a {

    /* JADX INFO: renamed from: A */
    public LayoutFragmentVideoIntroductionV2Binding f8420A;

    /* JADX INFO: renamed from: B */
    public VideoEpisodeAdapterV2 f8421B;

    /* JADX INFO: renamed from: C */
    public JmpLabelListAdapter f8422C;

    /* JADX INFO: renamed from: D */
    public String f8423D;

    /* JADX INFO: renamed from: E */
    public HashMap<String, Integer> f8424E;

    /* JADX INFO: renamed from: F */
    public boolean f8425F;

    /* JADX INFO: renamed from: G */
    public ListPopupWindow f8426G;

    /* JADX INFO: renamed from: H */
    public C0741LS f8427H;

    /* JADX INFO: renamed from: I */
    public ListPopupWindow f8428I;

    /* JADX INFO: renamed from: J */
    public C0804MS f8429J;

    /* JADX INFO: renamed from: K */
    public ExtendedRelativeLayout.InterfaceC2364a f8430K;

    /* JADX INFO: renamed from: L */
    public View.OnKeyListener f8431L;

    /* JADX INFO: renamed from: v */
    public VodRecode f8432v;

    /* JADX INFO: renamed from: w */
    public View f8433w;

    /* JADX INFO: renamed from: x */
    public boolean f8434x;

    /* JADX INFO: renamed from: y */
    public boolean f8435y;

    /* JADX INFO: renamed from: z */
    public boolean f8436z;

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.VideoIntroductionFragmentV2$a */
    public class ViewOnKeyListenerC2116a implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VideoIntroductionFragmentV2 f8437a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC2116a(VideoIntroductionFragmentV2 videoIntroductionFragmentV2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.VideoIntroductionFragmentV2$b */
    public class ViewOnKeyListenerC2117b implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VideoIntroductionFragmentV2 f8438a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC2117b(VideoIntroductionFragmentV2 videoIntroductionFragmentV2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.VideoIntroductionFragmentV2$c */
    public class C2118c implements ExtendedRelativeLayout.InterfaceC2364a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VideoIntroductionFragmentV2 f8439a;

        /* JADX WARN: Invalid debug info offset */
        public C2118c(VideoIntroductionFragmentV2 videoIntroductionFragmentV2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.widget.ExtendedRelativeLayout.InterfaceC2364a
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.VideoIntroductionFragmentV2$d */
    public class C2119d implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8440a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VideoIntroductionFragmentV2 f8441b;

        /* JADX WARN: Invalid debug info offset */
        public C2119d(VideoIntroductionFragmentV2 videoIntroductionFragmentV2, List list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.VideoIntroductionFragmentV2$e */
    public class C2120e implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8442a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VideoIntroductionFragmentV2 f8443b;

        /* JADX WARN: Invalid debug info offset */
        public C2120e(VideoIntroductionFragmentV2 videoIntroductionFragmentV2, List list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.VideoIntroductionFragmentV2$f */
    public class ViewOnKeyListenerC2121f implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VideoIntroductionFragmentV2 f8444a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC2121f(VideoIntroductionFragmentV2 videoIntroductionFragmentV2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D1 */
    private final void m12677D1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m12678R0(VideoIntroductionFragmentV2 videoIntroductionFragmentV2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m12679S0(VideoIntroductionFragmentV2 videoIntroductionFragmentV2, String str, int i, String str2, DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ void m12680T0(VideoIntroductionFragmentV2 videoIntroductionFragmentV2, String str, DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m12681U0(VideoIntroductionFragmentV2 videoIntroductionFragmentV2, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ LayoutFragmentVideoIntroductionV2Binding m12682V0(VideoIntroductionFragmentV2 videoIntroductionFragmentV2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ boolean m12683W0(VideoIntroductionFragmentV2 videoIntroductionFragmentV2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ ListPopupWindow m12684X0(VideoIntroductionFragmentV2 videoIntroductionFragmentV2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ void m12685Y0(VideoIntroductionFragmentV2 videoIntroductionFragmentV2, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ boolean m12686Z0(VideoIntroductionFragmentV2 videoIntroductionFragmentV2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ View m12687a1(VideoIntroductionFragmentV2 videoIntroductionFragmentV2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ View m12688b1(VideoIntroductionFragmentV2 videoIntroductionFragmentV2, View view) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ boolean m12689c1(VideoIntroductionFragmentV2 videoIntroductionFragmentV2, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ boolean m12690d1(VideoIntroductionFragmentV2 videoIntroductionFragmentV2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ boolean m12691e1(VideoIntroductionFragmentV2 videoIntroductionFragmentV2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ void m12692f1(VideoIntroductionFragmentV2 videoIntroductionFragmentV2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ boolean m12693g1(VideoIntroductionFragmentV2 videoIntroductionFragmentV2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ ListPopupWindow m12694h1(VideoIntroductionFragmentV2 videoIntroductionFragmentV2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q1 */
    private void m12695q1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u1 */
    private void m12696u1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v1 */
    private void m12697v1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A1 */
    public final boolean m12698A1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B1 */
    public final boolean m12699B1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.JmpQuarterlyListAdapter.InterfaceC1956a
    /* JADX INFO: renamed from: C0 */
    public void mo10587C0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C1 */
    public final void m12700C1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseSlaveFragment
    /* JADX INFO: renamed from: E0 */
    public void mo12054E0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0027
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: E1 */
    public final void m12701E1() {
        /*
            r3 = this;
            return
        L44:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.fragmens.VideoIntroductionFragmentV2.m12701E1():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseSlaveFragment
    /* JADX INFO: renamed from: F0 */
    public void mo12055F0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F1 */
    public final boolean m12702F1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G1 */
    public final void m12703G1(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H1 */
    public final void m12704H1(String str, int i, String str2) {
    }

    @Override // android.media.ViviTV.adapters.StarListAdapter.InterfaceC1987c
    /* JADX INFO: renamed from: I */
    public void mo9847I(View view, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I1 */
    public final void m12705I1(List<C0323Eu> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J1 */
    public final void m12706J1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K1 */
    public final void m12707K1(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseVideoIntroductionFragment
    /* JADX INFO: renamed from: L0 */
    public void mo12061L0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L1 */
    public final void m12708L1(List<C0928OP> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.StarListAdapter.InterfaceC1987c
    /* JADX INFO: renamed from: M */
    public void mo9848M(int i, C4289eT c4289eT) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseVideoIntroductionFragment
    /* JADX INFO: renamed from: M0 */
    public void mo12062M0(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M1 */
    public final void m12709M1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseVideoIntroductionFragment
    /* JADX INFO: renamed from: N0 */
    public int mo12063N0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N1 */
    public final void m12710N1(VideoEpisodeAdapterV2 videoEpisodeAdapterV2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O1 */
    public final void m12711O1(VideoEpisodeAdapterV2 videoEpisodeAdapterV2, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P1 */
    public final void m12712P1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.JmpLabelListAdapter.InterfaceC1955a
    /* JADX INFO: renamed from: a0 */
    public void mo10577a0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    public final void m12713i1(DialogC1326Uc.e eVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j1 */
    public final void m12714j1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k1 */
    public final boolean m12715k1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l1 */
    public final int m12716l1(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1394Vc
    /* JADX INFO: renamed from: m */
    public /* bridge */ /* synthetic */ void mo6597m(VideoEpisodeAdapterV2.ViewHolderEpisode viewHolderEpisode) {
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    /* JADX INFO: renamed from: m1 */
    public final String m12717m1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n1 */
    public void m12718n1(VideoEpisodeAdapterV2.ViewHolderEpisode viewHolderEpisode) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o1 */
    public final void m12719o1(VideoEpisodeAdapterV2 videoEpisodeAdapterV2, int i, ArrayList<C6020o10> arrayList) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p1 */
    public final void m12720p1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.JmpQuarterlyListAdapter.InterfaceC1956a
    /* JADX INFO: renamed from: q0 */
    public void mo10588q0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r1 */
    public final void m12721r1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s1 */
    public final void m12722s1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t1 */
    public final void m12723t1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m12724w1(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m12725x1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ void m12726y1(String str, int i, String str2, DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m12727z1(String str, DialogC1326Uc dialogC1326Uc, View view) {
    }
}
