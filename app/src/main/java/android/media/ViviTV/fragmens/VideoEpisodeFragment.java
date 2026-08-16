package android.media.ViviTV.fragmens;

import android.app.Activity;
import android.media.ViviTV.model.persistent.VodRecode;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p000.AbstractViewOnKeyListenerC1663Zn;
import p000.D00;
import p000.DialogC1326Uc;

/* JADX INFO: loaded from: classes.dex */
public class VideoEpisodeFragment extends VideoSlaveFragment implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: g */
    public TextView f8396g;

    /* JADX INFO: renamed from: h */
    public GridView f8397h;

    /* JADX INFO: renamed from: i */
    public VodRecode f8398i;

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.VideoEpisodeFragment$a */
    public class C2111a extends AbstractViewOnKeyListenerC1663Zn {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ VideoEpisodeFragment f8399e;

        /* JADX WARN: Invalid debug info offset */
        public C2111a(VideoEpisodeFragment videoEpisodeFragment, GridView gridView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractViewOnKeyListenerC1663Zn
        /* JADX INFO: renamed from: d */
        public boolean mo8772d() {
            return false;
        }

        @Override // p000.AbstractViewOnKeyListenerC1663Zn
        /* JADX INFO: renamed from: k */
        public void mo8779k() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.VideoEpisodeFragment$b */
    public class AsyncTaskC2112b extends AsyncTask<Void, Integer, VodRecode> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f8400a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ D00 f8401b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f8402c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f8403d;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2112b(Activity activity, D00 d00, int i, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public VodRecode m12667a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m12668b(VodRecode vodRecode) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ VodRecode doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(VodRecode vodRecode) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ void m12656K0(Activity activity, D00 d00, int i, String str, DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m12657L0(Activity activity, D00 d00, VodRecode vodRecode, DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ void m12658M0(Activity activity, D00 d00, int i, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m12659N0(Activity activity, D00 d00, VodRecode vodRecode, int i, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O0 */
    private void m12660O0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m12661P0(Activity activity, D00 d00, VodRecode vodRecode, DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m12662Q0(Activity activity, D00 d00, int i, String str, DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static final void m12663R0(Activity activity, D00 d00, int i, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static void m12664S0(Activity activity, D00 d00, int i, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static void m12665T0(Activity activity, D00 d00, VodRecode vodRecode) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static void m12666U0(Activity activity, D00 d00, VodRecode vodRecode, int i, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseSlaveFragment
    /* JADX INFO: renamed from: E0 */
    public void mo12054E0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
    }
}
