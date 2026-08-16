package android.media.ViviTV.activity;

import android.media.ViviTV.adapters.ViewOnKeyListenerC1991b;
import android.media.ViviTV.databinding.ActivitySearchPortraitBinding;
import android.media.ViviTV.model.persistent.SearchHistoryInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.annotation.NonNull;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import java.util.List;
import p000.AbstractC0310Eh;
import p000.C6071v30;
import p000.R00;
import p000.X00;

/* JADX INFO: loaded from: classes4.dex */
public class SearchActivityPortrait extends BaseActivity implements View.OnClickListener, TextWatcher {

    /* JADX INFO: renamed from: A */
    public AbstractC0310Eh f5258A;

    /* JADX INFO: renamed from: u */
    public boolean f5259u;

    /* JADX INFO: renamed from: v */
    public ViewOnKeyListenerC1991b f5260v;

    /* JADX INFO: renamed from: w */
    public int f5261w;

    /* JADX INFO: renamed from: x */
    public X00 f5262x;

    /* JADX INFO: renamed from: y */
    public String f5263y;

    /* JADX INFO: renamed from: z */
    public ActivitySearchPortraitBinding f5264z;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.SearchActivityPortrait$a */
    public class C1885a implements ViewOnKeyListenerC1991b.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SearchActivityPortrait f5265a;

        /* JADX WARN: Invalid debug info offset */
        public C1885a(SearchActivityPortrait searchActivityPortrait) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.adapters.ViewOnKeyListenerC1991b.b
        /* JADX INFO: renamed from: G */
        public void mo9910G(int i, R00 r00) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.SearchActivityPortrait$b */
    public class C1886b extends C6071v30.C5566c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SearchActivityPortrait f5266a;

        /* JADX WARN: Invalid debug info offset */
        public C1886b(SearchActivityPortrait searchActivityPortrait) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.SearchActivityPortrait$c */
    public class AsyncTaskC1887c extends AsyncTask<Void, Integer, List<SearchHistoryInfo>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SearchActivityPortrait f5267a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1887c(SearchActivityPortrait searchActivityPortrait) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public List<SearchHistoryInfo> m10160a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m10161b(List<SearchHistoryInfo> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ List<SearchHistoryInfo> doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(List<SearchHistoryInfo> list) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.SearchActivityPortrait$d */
    public class ViewOnClickListenerC1888d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SearchActivityPortrait f5268a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC1888d(SearchActivityPortrait searchActivityPortrait) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.SearchActivityPortrait$e */
    public class AsyncTaskC1889e extends AsyncTaskC1892h {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f5269e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ SearchActivityPortrait f5270f;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1889e(SearchActivityPortrait searchActivityPortrait, int i, String str, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.activity.SearchActivityPortrait.AsyncTaskC1892h
        /* JADX INFO: renamed from: b */
        public void mo10162b(X00 x00) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.activity.SearchActivityPortrait.AsyncTaskC1892h, android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(X00 x00) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.SearchActivityPortrait$f */
    public class C1890f implements MaterialDialog.SingleButtonCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SearchActivityPortrait f5271a;

        /* JADX WARN: Invalid debug info offset */
        public C1890f(SearchActivityPortrait searchActivityPortrait) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.afollestad.materialdialogs.MaterialDialog.SingleButtonCallback
        /* JADX INFO: renamed from: a */
        public void mo526a(@NonNull MaterialDialog materialDialog, @NonNull DialogAction dialogAction) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.SearchActivityPortrait$g */
    public class C1891g extends AbstractC0310Eh {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ SearchActivityPortrait f5272f;

        /* JADX WARN: Invalid debug info offset */
        public C1891g(SearchActivityPortrait searchActivityPortrait) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC0310Eh
        /* JADX INFO: renamed from: b */
        public void mo1663b(int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.SearchActivityPortrait$h */
    public class AsyncTaskC1892h extends AsyncTask<Void, Integer, X00> {

        /* JADX INFO: renamed from: a */
        public int f5273a;

        /* JADX INFO: renamed from: b */
        public String f5274b;

        /* JADX INFO: renamed from: c */
        public MaterialDialog f5275c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ SearchActivityPortrait f5276d;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1892h(SearchActivityPortrait searchActivityPortrait, int i, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public X00 m10163a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void mo10162b(X00 x00) {
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

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m10138P0(SearchActivityPortrait searchActivityPortrait, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m10139Q0(SearchActivityPortrait searchActivityPortrait, List list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ String m10140R0(SearchActivityPortrait searchActivityPortrait) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m10141S0(SearchActivityPortrait searchActivityPortrait, String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ ActivitySearchPortraitBinding m10142T0(SearchActivityPortrait searchActivityPortrait) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m10143U0(SearchActivityPortrait searchActivityPortrait, String str, SearchHistoryInfo searchHistoryInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ AbstractC0310Eh m10144V0(SearchActivityPortrait searchActivityPortrait) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ boolean m10145W0(SearchActivityPortrait searchActivityPortrait, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ int m10146X0(SearchActivityPortrait searchActivityPortrait) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ int m10147Y0(SearchActivityPortrait searchActivityPortrait, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ X00 m10148Z0(SearchActivityPortrait searchActivityPortrait, X00 x00) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ ViewOnKeyListenerC1991b m10149a1(SearchActivityPortrait searchActivityPortrait) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ ViewOnKeyListenerC1991b m10150b1(SearchActivityPortrait searchActivityPortrait, ViewOnKeyListenerC1991b viewOnKeyListenerC1991b) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ void m10151c1(SearchActivityPortrait searchActivityPortrait) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    private void m10152e1(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    private void m10153i1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k1 */
    private void m10154k1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public final void m10155d1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    public final void m10156f1(String str, SearchHistoryInfo searchHistoryInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g1 */
    public final void m10157g1(String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    public final void m10158h1(List<SearchHistoryInfo> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j1 */
    public final void m10159j1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
