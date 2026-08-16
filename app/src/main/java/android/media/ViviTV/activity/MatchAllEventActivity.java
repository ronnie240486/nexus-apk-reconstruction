package android.media.ViviTV.activity;

import android.media.ViviTV.adapters.MatchAllEventLeftMenuAdapter;
import android.media.ViviTV.adapters.MatchMainMenuAdapter;
import android.media.ViviTV.databinding.ActivityMatchAllEventBinding;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p000.C0389Fx;
import p000.C0772Lx;
import p000.C0997PS;
import p000.C1062QS;
import p000.C1124RS;

/* JADX INFO: loaded from: classes4.dex */
public class MatchAllEventActivity extends BaseActivity {

    /* JADX INFO: renamed from: A */
    public MatchMainMenuAdapter f5101A;

    /* JADX INFO: renamed from: B */
    public List<C1124RS> f5102B;

    /* JADX INFO: renamed from: C */
    public ArrayList<C1062QS> f5103C;

    /* JADX INFO: renamed from: D */
    public String f5104D;

    /* JADX INFO: renamed from: E */
    public ProgressBar f5105E;

    /* JADX INFO: renamed from: F */
    public Button f5106F;

    /* JADX INFO: renamed from: u */
    public ActivityMatchAllEventBinding f5107u;

    /* JADX INFO: renamed from: v */
    public RecyclerView f5108v;

    /* JADX INFO: renamed from: w */
    public RecyclerView f5109w;

    /* JADX INFO: renamed from: x */
    public MatchAllEventLeftMenuAdapter f5110x;

    /* JADX INFO: renamed from: y */
    public List<C0389Fx> f5111y;

    /* JADX INFO: renamed from: z */
    public List<C0772Lx> f5112z;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.MatchAllEventActivity$a */
    public class C1842a implements MatchAllEventLeftMenuAdapter.InterfaceC1964c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MatchAllEventActivity f5113a;

        /* JADX WARN: Invalid debug info offset */
        public C1842a(MatchAllEventActivity matchAllEventActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.adapters.MatchAllEventLeftMenuAdapter.InterfaceC1964c
        /* JADX INFO: renamed from: a */
        public void mo9960a(int i) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.MatchAllEventActivity$b */
    public class C1843b implements MatchAllEventLeftMenuAdapter.InterfaceC1965d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MatchAllEventActivity f5114a;

        /* JADX WARN: Invalid debug info offset */
        public C1843b(MatchAllEventActivity matchAllEventActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.adapters.MatchAllEventLeftMenuAdapter.InterfaceC1965d
        /* JADX INFO: renamed from: a */
        public void mo9961a(int i, boolean z) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.MatchAllEventActivity$c */
    public class C1844c implements MatchMainMenuAdapter.InterfaceC1969d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MatchAllEventActivity f5115a;

        /* JADX WARN: Invalid debug info offset */
        public C1844c(MatchAllEventActivity matchAllEventActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.adapters.MatchMainMenuAdapter.InterfaceC1969d
        /* JADX INFO: renamed from: a */
        public void mo9962a(int i) {
        }

        @Override // android.media.ViviTV.adapters.MatchMainMenuAdapter.InterfaceC1969d
        /* JADX INFO: renamed from: b */
        public void mo9963b(int i) {
        }

        @Override // android.media.ViviTV.adapters.MatchMainMenuAdapter.InterfaceC1969d
        /* JADX INFO: renamed from: c */
        public void mo9964c(View view, int i, KeyEvent keyEvent, int i2) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.MatchAllEventActivity$d */
    public class RunnableC1845d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MatchAllEventActivity f5116a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC1845d(MatchAllEventActivity matchAllEventActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.MatchAllEventActivity$e */
    public class C1846e implements C0997PS.f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MatchAllEventActivity f5117a;

        /* JADX WARN: Invalid debug info offset */
        public C1846e(MatchAllEventActivity matchAllEventActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C0997PS.f
        /* JADX INFO: renamed from: a */
        public void mo4454a(List<C1124RS> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C0997PS.d
        /* JADX INFO: renamed from: b */
        public void mo4452b(int i, String str) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m9945P0(MatchAllEventActivity matchAllEventActivity, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m9946Q0(MatchAllEventActivity matchAllEventActivity, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ List m9947R0(MatchAllEventActivity matchAllEventActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ RecyclerView m9948S0(MatchAllEventActivity matchAllEventActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ ProgressBar m9949T0(MatchAllEventActivity matchAllEventActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m9950U0(MatchAllEventActivity matchAllEventActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    private void m9951W0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    private void m9952Z0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    private /* synthetic */ void m9953a1(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    private void m9954b1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    private void m9955c1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public final void m9956V0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public final void m9957X0(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public final void m9958Y0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public final void m9959d1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }
}
