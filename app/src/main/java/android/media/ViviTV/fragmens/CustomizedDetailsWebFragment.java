package android.media.ViviTV.fragmens;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.ViviTV.databinding.FragmentCustomizedDetailsPdfWebBinding;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import p000.C4182cp;
import p000.DialogC1413Vv;

/* JADX INFO: loaded from: classes.dex */
public class CustomizedDetailsWebFragment extends Fragment {

    /* JADX INFO: renamed from: a */
    public FragmentCustomizedDetailsPdfWebBinding f8057a;

    /* JADX INFO: renamed from: b */
    public C4182cp f8058b;

    /* JADX INFO: renamed from: c */
    public C4182cp.b f8059c;

    /* JADX INFO: renamed from: d */
    public String f8060d;

    /* JADX INFO: renamed from: e */
    public DialogC1413Vv f8061e;

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.CustomizedDetailsWebFragment$a */
    public class C2032a extends WebViewClient {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CustomizedDetailsWebFragment f8062a;

        /* JADX WARN: Invalid debug info offset */
        public C2032a(CustomizedDetailsWebFragment customizedDetailsWebFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.CustomizedDetailsWebFragment$b */
    public class AsyncTaskC2033b extends AsyncTask<Void, Integer, Bitmap> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f8063a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CustomizedDetailsWebFragment f8064b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2033b(CustomizedDetailsWebFragment customizedDetailsWebFragment, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Bitmap m12191a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m12192b(Bitmap bitmap) {
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

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ DialogC1413Vv m12180D0(CustomizedDetailsWebFragment customizedDetailsWebFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ DialogC1413Vv m12181E0(CustomizedDetailsWebFragment customizedDetailsWebFragment, DialogC1413Vv dialogC1413Vv) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ FragmentCustomizedDetailsPdfWebBinding m12182F0(CustomizedDetailsWebFragment customizedDetailsWebFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ Drawable m12183G0(CustomizedDetailsWebFragment customizedDetailsWebFragment, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H0 */
    private Drawable m12184H0(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I0 */
    private void m12185I0(C4182cp.b bVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    private void m12186K0(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    private void m12187N0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J0 */
    public void m12188J0(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public void m12189L0(C4182cp c4182cp) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M0 */
    public void m12190M0(C4182cp.b bVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }
}
