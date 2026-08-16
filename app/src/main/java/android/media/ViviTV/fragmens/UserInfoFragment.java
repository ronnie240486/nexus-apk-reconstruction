package android.media.ViviTV.fragmens;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.ViviTV.databinding.FragmentUserInfoBinding;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import p000.B30;
import p000.C0002A1;
import p000.C4312eq;
import p000.ViewOnClickListenerC5171pK;

/* JADX INFO: loaded from: classes.dex */
public class UserInfoFragment extends BaseHomeItemFragment implements View.OnClickListener, ViewOnClickListenerC5171pK.a {

    /* JADX INFO: renamed from: o */
    public View f8385o;

    /* JADX INFO: renamed from: p */
    public ViewOnClickListenerC5171pK f8386p;

    /* JADX INFO: renamed from: q */
    public String f8387q;

    /* JADX INFO: renamed from: r */
    public B30 f8388r;

    /* JADX INFO: renamed from: s */
    public FragmentUserInfoBinding f8389s;

    /* JADX INFO: renamed from: t */
    public C0002A1 f8390t;

    /* JADX INFO: renamed from: u */
    public BroadcastReceiver f8391u;

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.UserInfoFragment$a */
    public class AsyncTaskC2109a extends AsyncTask<Void, Integer, C4312eq> {

        /* JADX INFO: renamed from: a */
        public String f8392a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f8393b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ UserInfoFragment f8394c;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2109a(UserInfoFragment userInfoFragment, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public C4312eq m12654a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m12655b(C4312eq c4312eq) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ C4312eq doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(C4312eq c4312eq) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.UserInfoFragment$b */
    public class C2110b extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UserInfoFragment f8395a;

        /* JADX WARN: Invalid debug info offset */
        public C2110b(UserInfoFragment userInfoFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ void m12634C1(DialogInterface dialogInterface) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D1 */
    public static /* synthetic */ void m12635D1(UserInfoFragment userInfoFragment, MaterialDialog materialDialog, DialogAction dialogAction) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E1 */
    public static /* synthetic */ C0002A1 m12636E1(UserInfoFragment userInfoFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F1 */
    public static /* synthetic */ FragmentUserInfoBinding m12637F1(UserInfoFragment userInfoFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ void m12638G1(UserInfoFragment userInfoFragment, Intent intent) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H1 */
    public static /* synthetic */ void m12639H1(UserInfoFragment userInfoFragment, Intent intent) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P1 */
    private void m12640P1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R1 */
    public static /* synthetic */ void m12641R1(DialogInterface dialogInterface) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I1 */
    public final void m12642I1(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J1 */
    public final void m12643J1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.ViewOnClickListenerC5171pK.a
    /* JADX INFO: renamed from: K */
    public boolean mo12644K(Intent intent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K1 */
    public final void m12645K1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L1 */
    public final void m12646L1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M1 */
    public final void m12647M1(Intent intent) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N1 */
    public final void m12648N1(Intent intent) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O1 */
    public final void m12649O1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m12650Q1(MaterialDialog materialDialog, DialogAction dialogAction) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S1 */
    public final void m12651S1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T1 */
    public final void m12652T1(String str) {
    }

    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment
    /* JADX INFO: renamed from: V0 */
    public void mo12016V0(BaseSpannableRecyclerViewAdapter baseSpannableRecyclerViewAdapter) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment
    /* JADX INFO: renamed from: X0 */
    public View mo11991X0(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.ViewOnClickListenerC5171pK.a
    /* JADX INFO: renamed from: m0 */
    public boolean mo12653m0(Intent intent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment, androidx.fragment.app.Fragment
    public void onResume() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
    }
}
