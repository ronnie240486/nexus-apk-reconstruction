package android.media.ViviTV.activity;

import android.media.ViviTV.adapters.EbookGalleryFragmentAdapter;
import android.media.ViviTV.databinding.ActivityEbookGalleryBinding;
import android.media.ViviTV.fragmens.EbookGalleryFragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import androidx.viewpager.widget.ViewPager;
import java.util.List;
import p000.C4303eh;

/* JADX INFO: loaded from: classes4.dex */
public class EbookGalleryActivity extends BaseActivity implements ViewPager.OnPageChangeListener, View.OnFocusChangeListener, RadioGroup.OnCheckedChangeListener {

    /* JADX INFO: renamed from: x */
    public static final int f4904x = 0;

    /* JADX INFO: renamed from: u */
    public List<EbookGalleryFragment> f4905u;

    /* JADX INFO: renamed from: v */
    public EbookGalleryFragmentAdapter f4906v;

    /* JADX INFO: renamed from: w */
    public ActivityEbookGalleryBinding f4907w;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.EbookGalleryActivity$a */
    public class AsyncTaskC1796a extends AsyncTask<Void, Integer, List<C4303eh>> {

        /* JADX INFO: renamed from: a */
        public int f4908a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ EbookGalleryActivity f4909b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1796a(EbookGalleryActivity ebookGalleryActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public List<C4303eh> m9703a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9704b(List<C4303eh> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ List<C4303eh> doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(List<C4303eh> list) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m9700P0(EbookGalleryActivity ebookGalleryActivity, List list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public final void m9701Q0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public final void m9702R0(List<C4303eh> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
    }
}
