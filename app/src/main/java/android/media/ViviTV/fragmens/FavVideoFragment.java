package android.media.ViviTV.fragmens;

import android.graphics.drawable.Drawable;
import android.media.ViviTV.model.persistent.VodRecode;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import p000.B30;
import p000.E30;

/* JADX INFO: loaded from: classes.dex */
public class FavVideoFragment extends BaseSlaveFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: x */
    public static final String f8108x = "fav_type";

    /* JADX INFO: renamed from: e */
    public View f8109e;

    /* JADX INFO: renamed from: f */
    public ImageView f8110f;

    /* JADX INFO: renamed from: g */
    public TextView f8111g;

    /* JADX INFO: renamed from: h */
    public TextView f8112h;

    /* JADX INFO: renamed from: i */
    public TextView f8113i;

    /* JADX INFO: renamed from: j */
    public GridView f8114j;

    /* JADX INFO: renamed from: k */
    public List<VodRecode> f8115k;

    /* JADX INFO: renamed from: l */
    public B30 f8116l;

    /* JADX INFO: renamed from: m */
    public E30 f8117m;

    /* JADX INFO: renamed from: n */
    public Button f8118n;

    /* JADX INFO: renamed from: o */
    public ImageButton f8119o;

    /* JADX INFO: renamed from: p */
    public ImageButton f8120p;

    /* JADX INFO: renamed from: q */
    public ImageButton f8121q;

    /* JADX INFO: renamed from: r */
    public View f8122r;

    /* JADX INFO: renamed from: s */
    public int f8123s;

    /* JADX INFO: renamed from: t */
    public boolean f8124t;

    /* JADX INFO: renamed from: u */
    public boolean f8125u;

    /* JADX INFO: renamed from: v */
    public boolean f8126v;

    /* JADX INFO: renamed from: w */
    public View.OnKeyListener f8127w;

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.FavVideoFragment$a */
    public class C2043a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FavVideoFragment f8128a;

        /* JADX WARN: Invalid debug info offset */
        public C2043a(FavVideoFragment favVideoFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.FavVideoFragment$b */
    public class C2044b implements AdapterView.OnItemLongClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FavVideoFragment f8129a;

        /* JADX WARN: Invalid debug info offset */
        public C2044b(FavVideoFragment favVideoFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.FavVideoFragment$c */
    public class ViewOnKeyListenerC2045c implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FavVideoFragment f8130a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC2045c(FavVideoFragment favVideoFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ void m12240K0(FavVideoFragment favVideoFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m12241L0(FavVideoFragment favVideoFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ E30 m12242M0(FavVideoFragment favVideoFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ List m12243N0(FavVideoFragment favVideoFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ ImageButton m12244O0(FavVideoFragment favVideoFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ View m12245P0(FavVideoFragment favVideoFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ boolean m12246Q0(FavVideoFragment favVideoFragment, View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    private Drawable m12247T0(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static FavVideoFragment m12248U0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    /* JADX INFO: renamed from: V0 */
    public static FavVideoFragment m12249V0(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static FavVideoFragment m12250W0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    private void m12251Y0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    private void m12252Z0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    private void m12253b1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseSlaveFragment
    /* JADX INFO: renamed from: E0 */
    public void mo12054E0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public final void m12254R0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public void m12255S0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public final boolean m12256X0(View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public final void m12257a1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public boolean m12258c1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public boolean m12259d1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m12260e1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m12261f1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g1 */
    public void m12262g1(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    public void m12263h1(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    public void m12264i1(boolean z) {
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
}
