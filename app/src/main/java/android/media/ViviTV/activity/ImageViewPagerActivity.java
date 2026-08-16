package android.media.ViviTV.activity;

import android.content.Context;
import android.media.ViviTV.databinding.ActivityImageViewPagerBinding;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ImageViewPagerActivity extends BaseActivity implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: x */
    public static final String f4985x = "imgUrls";

    /* JADX INFO: renamed from: y */
    public static final long f4986y = 6000;

    /* JADX INFO: renamed from: u */
    public ActivityImageViewPagerBinding f4987u;

    /* JADX INFO: renamed from: v */
    public List<String> f4988v;

    /* JADX INFO: renamed from: w */
    public Runnable f4989w;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.ImageViewPagerActivity$a */
    public class RunnableC1817a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageViewPagerActivity f4990a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC1817a(ImageViewPagerActivity imageViewPagerActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ List m9777P0(ImageViewPagerActivity imageViewPagerActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ ActivityImageViewPagerBinding m9778Q0(ImageViewPagerActivity imageViewPagerActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    private void m9779T0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    private void m9780U0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    private void m9781V0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static void m9782W0(Context context, ArrayList<String> arrayList) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public static void m9783X0(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public final void m9784R0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public final void m9785S0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
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
