package android.media.ViviTV.fragmens;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.ViviTV.activity.CustomizedThreePageActivity;
import android.media.ViviTV.databinding.FragmentCustomizedDetailsPdfWebBinding;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.shockwave.pdfium.C4033a;
import java.util.List;
import p000.C4182cp;
import p000.DialogC1413Vv;
import p000.InterfaceC0020AH;
import p000.InterfaceC0084BH;
import p000.InterfaceC0156CH;
import p000.InterfaceC5777yH;
import p000.S50;
import p000.V50;

/* JADX INFO: loaded from: classes.dex */
public class CustomizedDetailsPdfFragment extends Fragment implements CustomizedThreePageActivity.InterfaceC1784a {

    /* JADX INFO: renamed from: n */
    public static double f8026n = 0.00306d;

    /* JADX INFO: renamed from: o */
    public static float f8027o = 600.0f;

    /* JADX INFO: renamed from: a */
    public FragmentCustomizedDetailsPdfWebBinding f8028a;

    /* JADX INFO: renamed from: b */
    public C4182cp f8029b;

    /* JADX INFO: renamed from: c */
    public C4182cp.b f8030c;

    /* JADX INFO: renamed from: d */
    public String f8031d;

    /* JADX INFO: renamed from: e */
    public String f8032e;

    /* JADX INFO: renamed from: f */
    public int f8033f;

    /* JADX INFO: renamed from: g */
    public DialogC1413Vv f8034g;

    /* JADX INFO: renamed from: h */
    public float f8035h;

    /* JADX INFO: renamed from: i */
    public String f8036i;

    /* JADX INFO: renamed from: j */
    public InterfaceC0084BH f8037j;

    /* JADX INFO: renamed from: k */
    public InterfaceC0020AH f8038k;

    /* JADX INFO: renamed from: l */
    public InterfaceC5777yH f8039l;

    /* JADX INFO: renamed from: m */
    public InterfaceC0156CH f8040m;

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.CustomizedDetailsPdfFragment$a */
    public class RunnableC2024a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f8041a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CustomizedDetailsPdfFragment f8042b;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2024a(CustomizedDetailsPdfFragment customizedDetailsPdfFragment, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.CustomizedDetailsPdfFragment$b */
    public class C2025b extends S50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC1413Vv f8043a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CustomizedDetailsPdfFragment f8044b;

        /* JADX WARN: Invalid debug info offset */
        public C2025b(CustomizedDetailsPdfFragment customizedDetailsPdfFragment, DialogC1413Vv dialogC1413Vv) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m12164d(C2025b c2025b, DialogC1413Vv dialogC1413Vv, V50.C1358b c1358b) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m12165e(C2025b c2025b, DialogC1413Vv dialogC1413Vv) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        private /* synthetic */ void m12166f(DialogC1413Vv dialogC1413Vv) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g */
        private /* synthetic */ void m12167g(DialogC1413Vv dialogC1413Vv, V50.C1358b c1358b) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.R50
        /* JADX INFO: renamed from: a */
        public void mo4927a(V50.C1358b c1358b) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.R50
        /* JADX INFO: renamed from: b */
        public void mo4928b(V50.C1358b c1358b) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.CustomizedDetailsPdfFragment$c */
    public class AsyncTaskC2026c extends AsyncTask<Void, Integer, Bitmap> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f8045a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CustomizedDetailsPdfFragment f8046b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2026c(CustomizedDetailsPdfFragment customizedDetailsPdfFragment, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Bitmap m12168a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m12169b(Bitmap bitmap) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Bitmap doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Bitmap bitmap) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.CustomizedDetailsPdfFragment$d */
    public class C2027d implements InterfaceC0084BH {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CustomizedDetailsPdfFragment f8047a;

        /* JADX WARN: Invalid debug info offset */
        public C2027d(CustomizedDetailsPdfFragment customizedDetailsPdfFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0084BH
        /* JADX INFO: renamed from: a */
        public void mo476a(int i, Throwable th) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.CustomizedDetailsPdfFragment$e */
    public class C2028e implements InterfaceC0020AH {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CustomizedDetailsPdfFragment f8048a;

        /* JADX WARN: Invalid debug info offset */
        public C2028e(CustomizedDetailsPdfFragment customizedDetailsPdfFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0020AH
        /* JADX INFO: renamed from: a */
        public void mo110a(int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.CustomizedDetailsPdfFragment$f */
    public class C2029f implements InterfaceC5777yH {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CustomizedDetailsPdfFragment f8049a;

        /* JADX WARN: Invalid debug info offset */
        public C2029f(CustomizedDetailsPdfFragment customizedDetailsPdfFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC5777yH
        /* JADX INFO: renamed from: a */
        public void mo9631a(int i) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.CustomizedDetailsPdfFragment$g */
    public class C2030g implements InterfaceC0156CH {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CustomizedDetailsPdfFragment f8050a;

        /* JADX WARN: Invalid debug info offset */
        public C2030g(CustomizedDetailsPdfFragment customizedDetailsPdfFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0156CH
        /* JADX INFO: renamed from: a */
        public void mo931a(int i, float f) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ int m12143D0(CustomizedDetailsPdfFragment customizedDetailsPdfFragment) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ int m12144E0(CustomizedDetailsPdfFragment customizedDetailsPdfFragment, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ FragmentCustomizedDetailsPdfWebBinding m12145F0(CustomizedDetailsPdfFragment customizedDetailsPdfFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ DialogC1413Vv m12146G0(CustomizedDetailsPdfFragment customizedDetailsPdfFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m12147H0(CustomizedDetailsPdfFragment customizedDetailsPdfFragment, V50.C1357a c1357a) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ Drawable m12148I0(CustomizedDetailsPdfFragment customizedDetailsPdfFragment, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ String m12149J0(CustomizedDetailsPdfFragment customizedDetailsPdfFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ float m12150K0() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ double m12151L0() {
        return 0.0d;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ double m12152M0(double d) {
        return 0.0d;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ float m12153N0(CustomizedDetailsPdfFragment customizedDetailsPdfFragment, float f) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O0 */
    private void m12154O0(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    private void m12155P0(String str, DialogC1413Vv dialogC1413Vv) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    private Drawable m12156Q0(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    private void m12157R0(C4182cp.b bVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    private void m12158U0(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    private void m12159X0(V50.C1357a c1357a) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public void m12160S0(List<C4033a.a> list, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public void m12161T0(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public void m12162V0(C4182cp c4182cp) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public void m12163W0(C4182cp.b bVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.CustomizedThreePageActivity.InterfaceC1784a
    /* JADX INFO: renamed from: Z */
    public boolean mo9643Z(KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
    }
}
