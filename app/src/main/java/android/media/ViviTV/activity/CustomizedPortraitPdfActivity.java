package android.media.ViviTV.activity;

import android.content.Context;
import android.media.ViviTV.databinding.ActivityCustomizedDetailsPdfBinding;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.shockwave.pdfium.C4033a;
import java.util.List;
import p000.DialogC1413Vv;
import p000.InterfaceC0020AH;
import p000.InterfaceC0084BH;
import p000.InterfaceC5777yH;
import p000.S50;
import p000.V50;

/* JADX INFO: loaded from: classes4.dex */
public class CustomizedPortraitPdfActivity extends BaseActivity {

    /* JADX INFO: renamed from: D */
    public static final String f4839D = "pageId";

    /* JADX INFO: renamed from: E */
    public static final String f4840E = "result";

    /* JADX INFO: renamed from: A */
    public InterfaceC0020AH f4841A;

    /* JADX INFO: renamed from: B */
    public InterfaceC5777yH f4842B;

    /* JADX INFO: renamed from: C */
    public View.OnClickListener f4843C;

    /* JADX INFO: renamed from: u */
    public ActivityCustomizedDetailsPdfBinding f4844u;

    /* JADX INFO: renamed from: v */
    public String f4845v;

    /* JADX INFO: renamed from: w */
    public int f4846w;

    /* JADX INFO: renamed from: x */
    public DialogC1413Vv f4847x;

    /* JADX INFO: renamed from: y */
    public String f4848y;

    /* JADX INFO: renamed from: z */
    public InterfaceC0084BH f4849z;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.CustomizedPortraitPdfActivity$a */
    public class RunnableC1778a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f4850a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CustomizedPortraitPdfActivity f4851b;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC1778a(CustomizedPortraitPdfActivity customizedPortraitPdfActivity, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.CustomizedPortraitPdfActivity$b */
    public class C1779b extends S50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC1413Vv f4852a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CustomizedPortraitPdfActivity f4853b;

        /* JADX WARN: Invalid debug info offset */
        public C1779b(CustomizedPortraitPdfActivity customizedPortraitPdfActivity, DialogC1413Vv dialogC1413Vv) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m9627d(C1779b c1779b, DialogC1413Vv dialogC1413Vv) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m9628e(C1779b c1779b, DialogC1413Vv dialogC1413Vv, V50.C1358b c1358b) {
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

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m9629f(DialogC1413Vv dialogC1413Vv) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m9630g(DialogC1413Vv dialogC1413Vv, V50.C1358b c1358b) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.CustomizedPortraitPdfActivity$c */
    public class C1780c implements InterfaceC0084BH {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CustomizedPortraitPdfActivity f4854a;

        /* JADX WARN: Invalid debug info offset */
        public C1780c(CustomizedPortraitPdfActivity customizedPortraitPdfActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0084BH
        /* JADX INFO: renamed from: a */
        public void mo476a(int i, Throwable th) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.CustomizedPortraitPdfActivity$d */
    public class C1781d implements InterfaceC0020AH {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CustomizedPortraitPdfActivity f4855a;

        /* JADX WARN: Invalid debug info offset */
        public C1781d(CustomizedPortraitPdfActivity customizedPortraitPdfActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0020AH
        /* JADX INFO: renamed from: a */
        public void mo110a(int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.CustomizedPortraitPdfActivity$e */
    public class C1782e implements InterfaceC5777yH {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CustomizedPortraitPdfActivity f4856a;

        /* JADX WARN: Invalid debug info offset */
        public C1782e(CustomizedPortraitPdfActivity customizedPortraitPdfActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC5777yH
        /* JADX INFO: renamed from: a */
        public void mo9631a(int i) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.CustomizedPortraitPdfActivity$f */
    public class ViewOnClickListenerC1783f implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CustomizedPortraitPdfActivity f4857a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC1783f(CustomizedPortraitPdfActivity customizedPortraitPdfActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ int m9615P0(CustomizedPortraitPdfActivity customizedPortraitPdfActivity) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ int m9616Q0(CustomizedPortraitPdfActivity customizedPortraitPdfActivity, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ ActivityCustomizedDetailsPdfBinding m9617R0(CustomizedPortraitPdfActivity customizedPortraitPdfActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ DialogC1413Vv m9618S0(CustomizedPortraitPdfActivity customizedPortraitPdfActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ void m9619T0(CustomizedPortraitPdfActivity customizedPortraitPdfActivity, V50.C1357a c1357a) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ String m9620U0(CustomizedPortraitPdfActivity customizedPortraitPdfActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    private void m9621X0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public static void m9622a1(Context context, String str, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public final void m9623V0(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public final void m9624W0(String str, DialogC1413Vv dialogC1413Vv) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public void m9625Y0(List<C4033a.a> list, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public final void m9626Z0(V50.C1357a c1357a) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }
}
