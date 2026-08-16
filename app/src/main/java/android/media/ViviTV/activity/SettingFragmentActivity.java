package android.media.ViviTV.activity;

import android.content.Context;
import android.media.ViviTV.databinding.LayoutActivityFragmentSettingBinding;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RadioButton;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import java.util.List;
import p000.InterfaceC1408Vq;

/* JADX INFO: loaded from: classes4.dex */
public class SettingFragmentActivity extends BaseActivity implements View.OnClickListener, View.OnFocusChangeListener, InterfaceC1408Vq, ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: A */
    public static final String f5292A = "invalid_login_dialog";

    /* JADX INFO: renamed from: B */
    public static final int f5293B = 0;

    /* JADX INFO: renamed from: C */
    public static final int f5294C = 1;

    /* JADX INFO: renamed from: y */
    public static final String f5295y = "focusIndex";

    /* JADX INFO: renamed from: z */
    public static final String f5296z = "jumpFrom";

    /* JADX INFO: renamed from: u */
    public List<Fragment> f5297u;

    /* JADX INFO: renamed from: v */
    public LayoutActivityFragmentSettingBinding f5298v;

    /* JADX INFO: renamed from: w */
    public String f5299w;

    /* JADX INFO: renamed from: x */
    public View.OnKeyListener f5300x;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.SettingFragmentActivity$a */
    public class RunnableC1896a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SettingFragmentActivity f5301a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC1896a(SettingFragmentActivity settingFragmentActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.SettingFragmentActivity$b */
    public class ViewOnKeyListenerC1897b implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SettingFragmentActivity f5302a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC1897b(SettingFragmentActivity settingFragmentActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ LayoutActivityFragmentSettingBinding m10187P0(SettingFragmentActivity settingFragmentActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ List m10188Q0(SettingFragmentActivity settingFragmentActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    private void m10189T0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    private final void m10190W0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    private final void m10191X0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public static final void m10192Y0(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public static final void m10193Z0(Context context, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1408Vq
    /* JADX INFO: renamed from: M */
    public void mo6636M(Fragment fragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public final void m10194R0() {
    }

    /* JADX INFO: renamed from: S0 */
    public final void m10195S0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public final void m10196U0(RadioButton radioButton, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public final void m10197V0() {
    }

    @Override // p000.InterfaceC1408Vq
    /* JADX INFO: renamed from: i */
    public void mo6637i(Fragment fragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
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
    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
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

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
    }
}
