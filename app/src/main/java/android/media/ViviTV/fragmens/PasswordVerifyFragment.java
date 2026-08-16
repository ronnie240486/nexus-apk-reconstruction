package android.media.ViviTV.fragmens;

import android.content.Context;
import android.content.DialogInterface;
import android.media.ViviTV.adapters.BaseRecyclerViewAdapter;
import android.media.ViviTV.adapters.InputKeyAdapter;
import android.media.ViviTV.databinding.FragmentPasswordVerifyBinding;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

/* JADX INFO: loaded from: classes.dex */
public class PasswordVerifyFragment extends DialogFragment implements BaseRecyclerViewAdapter.InterfaceC1942b<InputKeyAdapter.C1952b>, View.OnClickListener {

    /* JADX INFO: renamed from: h */
    public static final String f8253h = "pvf_local";

    /* JADX INFO: renamed from: i */
    public static String f8254i = "key_pwd_md5";

    /* JADX INFO: renamed from: j */
    public static String f8255j = "key_pwd_save_key";

    /* JADX INFO: renamed from: k */
    public static PasswordVerifyFragment f8256k;

    /* JADX INFO: renamed from: a */
    public FragmentPasswordVerifyBinding f8257a;

    /* JADX INFO: renamed from: b */
    public EnumC2081a f8258b;

    /* JADX INFO: renamed from: c */
    public String f8259c;

    /* JADX INFO: renamed from: d */
    public AbstractC2083c f8260d;

    /* JADX INFO: renamed from: e */
    public String f8261e;

    /* JADX INFO: renamed from: f */
    public boolean f8262f;

    /* JADX INFO: renamed from: g */
    public boolean f8263g;

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.PasswordVerifyFragment$a */
    public enum EnumC2081a {
        INPUT_PWD,
        MODIFY_PWD_VERIFY,
        MODIFY_PWD_SAVE
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.PasswordVerifyFragment$b */
    public interface InterfaceC2082b {
        /* JADX INFO: renamed from: a */
        void mo12484a(boolean z);

        /* JADX INFO: renamed from: b */
        void mo12400b(PasswordVerifyFragment passwordVerifyFragment);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.PasswordVerifyFragment$c */
    public static abstract class AbstractC2083c implements InterfaceC2082b {
        @Override // android.media.ViviTV.fragmens.PasswordVerifyFragment.InterfaceC2082b
        /* JADX INFO: renamed from: a */
        public void mo12484a(boolean z) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E0 */
    public static String m12468E0(Context context, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J0 */
    private void m12469J0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O0 */
    public static void m12470O0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0060
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: P0 */
    public static final void m12471P0(androidx.fragment.app.FragmentActivity r2, java.lang.String r3, java.lang.String r4, android.media.ViviTV.fragmens.PasswordVerifyFragment.AbstractC2083c r5) {
        /*
            return
        L6c:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.fragmens.PasswordVerifyFragment.m12471P0(androidx.fragment.app.FragmentActivity, java.lang.String, java.lang.String, android.media.ViviTV.fragmens.PasswordVerifyFragment$c):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D0 */
    public AbstractC2083c m12472D0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F0 */
    public final void m12473F0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G0 */
    public boolean m12474G0(int i, InputKeyAdapter.C1952b c1952b) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.BaseRecyclerViewAdapter.InterfaceC1942b
    /* JADX INFO: renamed from: H */
    public /* bridge */ /* synthetic */ boolean mo10273H(int i, InputKeyAdapter.C1952b c1952b) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H0 */
    public void m12475H0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I0 */
    public final void m12476I0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public final void m12477K0(EnumC2081a enumC2081a) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public final void m12478L0(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M0 */
    public void m12479M0(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    public void m12480N0(AbstractC2083c abstractC2083c) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public final void m12481Q0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public final void m12482R0(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public final void m12483S0(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
    }
}
