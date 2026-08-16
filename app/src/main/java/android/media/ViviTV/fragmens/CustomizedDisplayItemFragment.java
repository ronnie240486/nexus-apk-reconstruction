package android.media.ViviTV.fragmens;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.ViviTV.databinding.CustomizedDisplayItemFragmentBinding;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter;
import java.util.List;
import p000.AbstractAsyncTaskC1424W5;
import p000.C4182cp;
import p000.C4898np;

/* JADX INFO: loaded from: classes.dex */
public class CustomizedDisplayItemFragment extends BaseHomeItemFragment {

    /* JADX INFO: renamed from: u */
    public static final String f8065u = "bgImageUrl";

    /* JADX INFO: renamed from: o */
    public CustomizedDisplayItemFragmentBinding f8066o;

    /* JADX INFO: renamed from: p */
    public int f8067p;

    /* JADX INFO: renamed from: q */
    public boolean f8068q;

    /* JADX INFO: renamed from: r */
    public String f8069r;

    /* JADX INFO: renamed from: s */
    public String f8070s;

    /* JADX INFO: renamed from: t */
    public String f8071t;

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.CustomizedDisplayItemFragment$a */
    public class AsyncTaskC2034a extends AsyncTask<Void, Integer, Bitmap> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f8072a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CustomizedDisplayItemFragment f8073b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2034a(CustomizedDisplayItemFragment customizedDisplayItemFragment, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Bitmap m12202a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m12203b(Bitmap bitmap) {
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

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.CustomizedDisplayItemFragment$b */
    public class AsyncTaskC2035b extends AbstractAsyncTaskC1424W5<C4898np> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ BaseSpannableRecyclerViewAdapter f8074i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ CustomizedDisplayItemFragment f8075j;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2035b(CustomizedDisplayItemFragment customizedDisplayItemFragment, Context context, String str, AbstractAsyncTaskC1424W5.a aVar, List list, Class cls, BaseSpannableRecyclerViewAdapter baseSpannableRecyclerViewAdapter) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractAsyncTaskC1424W5
        /* JADX INFO: renamed from: b */
        public /* bridge */ /* synthetic */ void mo6705b(C4898np c4898np) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractAsyncTaskC1424W5
        /* JADX INFO: renamed from: d */
        public Pair<Boolean, C4898np> mo6707d(String str, String str2, int i) throws Exception {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public void m12204e(C4898np c4898np) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ CustomizedDisplayItemFragmentBinding m12193C1(CustomizedDisplayItemFragment customizedDisplayItemFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D1 */
    public static /* synthetic */ Drawable m12194D1(CustomizedDisplayItemFragment customizedDisplayItemFragment, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E1 */
    public static /* synthetic */ int m12195E1(CustomizedDisplayItemFragment customizedDisplayItemFragment) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F1 */
    public static /* synthetic */ boolean m12196F1(CustomizedDisplayItemFragment customizedDisplayItemFragment, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G1 */
    public final Drawable m12197G1(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H1 */
    public void m12198H1(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I1 */
    public final void m12199I1(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J1 */
    public void m12200J1(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K1 */
    public void m12201K1(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment
    /* JADX INFO: renamed from: V0 */
    public void mo12016V0(BaseSpannableRecyclerViewAdapter baseSpannableRecyclerViewAdapter) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment
    /* JADX INFO: renamed from: W0 */
    public void mo12017W0(C4182cp c4182cp) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment
    /* JADX INFO: renamed from: X0 */
    public View mo11991X0(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
    }
}
