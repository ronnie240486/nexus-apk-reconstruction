package android.media.ViviTV.activity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import java.util.List;
import p000.InterfaceC1408Vq;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMultiFragmentActivity extends BaseActivity implements InterfaceC1408Vq {

    /* JADX INFO: renamed from: C */
    public static String f4801C = "focus_index";

    /* JADX INFO: renamed from: A */
    public View.OnFocusChangeListener f4802A;

    /* JADX INFO: renamed from: B */
    public View.OnKeyListener f4803B;

    /* JADX INFO: renamed from: u */
    public List<RadioButton> f4804u;

    /* JADX INFO: renamed from: v */
    public ViewPager f4805v;

    /* JADX INFO: renamed from: w */
    public int f4806w;

    /* JADX INFO: renamed from: x */
    public boolean f4807x;

    /* JADX INFO: renamed from: y */
    public TextView f4808y;

    /* JADX INFO: renamed from: z */
    public View.OnClickListener f4809z;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.BaseMultiFragmentActivity$a */
    public class ViewOnClickListenerC1769a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseMultiFragmentActivity f4810a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC1769a(BaseMultiFragmentActivity baseMultiFragmentActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.BaseMultiFragmentActivity$b */
    public class ViewOnFocusChangeListenerC1770b implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseMultiFragmentActivity f4811a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnFocusChangeListenerC1770b(BaseMultiFragmentActivity baseMultiFragmentActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.BaseMultiFragmentActivity$c */
    public class ViewOnKeyListenerC1771c implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseMultiFragmentActivity f4812a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC1771c(BaseMultiFragmentActivity baseMultiFragmentActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m9581P0(BaseMultiFragmentActivity baseMultiFragmentActivity, RadioButton radioButton, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ int m9582Q0(BaseMultiFragmentActivity baseMultiFragmentActivity, View view) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    private void m9583R0(RadioButton radioButton, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1408Vq
    /* JADX INFO: renamed from: M */
    public void mo6636M(Fragment fragment) {
    }

    /* JADX INFO: renamed from: S0 */
    public abstract List<Fragment> mo9584S0();

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public final int m9585T0(View view) {
        return 0;
    }

    /* JADX INFO: renamed from: U0 */
    public abstract void mo9586U0(int i);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public void m9587V0(List<RadioButton> list, ViewPager viewPager) {
    }

    @Override // p000.InterfaceC1408Vq
    /* JADX INFO: renamed from: i */
    public void mo6637i(Fragment fragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
    }
}
