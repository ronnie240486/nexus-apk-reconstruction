package android.media.ViviTV.activity;

import android.content.Context;
import android.media.ViviTV.fragmens.BaseVideoListFragment;
import android.media.ViviTV.model.LabelInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import androidx.fragment.app.Fragment;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SubjectAlbumActivity extends BaseActivity implements BaseVideoListFragment.InterfaceC2018g, View.OnClickListener {

    /* JADX INFO: renamed from: E */
    public static final String f5315E = "SubjectAlbumActivity";

    /* JADX INFO: renamed from: A */
    public FrameLayout f5316A;

    /* JADX INFO: renamed from: B */
    public CompoundButton.OnCheckedChangeListener f5317B;

    /* JADX INFO: renamed from: C */
    public View.OnFocusChangeListener f5318C;

    /* JADX INFO: renamed from: D */
    public View.OnKeyListener f5319D;

    /* JADX INFO: renamed from: u */
    public LabelInfo f5320u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f5321v;

    /* JADX INFO: renamed from: w */
    public Button f5322w;

    /* JADX INFO: renamed from: x */
    public RadioButton f5323x;

    /* JADX INFO: renamed from: y */
    public RadioButton f5324y;

    /* JADX INFO: renamed from: z */
    public List<Fragment> f5325z;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.SubjectAlbumActivity$a */
    public class AsyncTaskC1900a extends AsyncTask<Void, Void, LabelInfo.C2231a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SubjectAlbumActivity f5326a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1900a(SubjectAlbumActivity subjectAlbumActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0027
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public android.media.ViviTV.model.LabelInfo.C2231a m10231a(java.lang.Void... r5) {
            /*
                r4 = this;
                r0 = 0
                return r0
            L35:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.SubjectAlbumActivity.AsyncTaskC1900a.m10231a(java.lang.Void[]):android.media.ViviTV.model.LabelInfo$a");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m10232b(LabelInfo.C2231a c2231a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ LabelInfo.C2231a doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(LabelInfo.C2231a c2231a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.SubjectAlbumActivity$b */
    public class C1901b implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SubjectAlbumActivity f5327a;

        /* JADX WARN: Invalid debug info offset */
        public C1901b(SubjectAlbumActivity subjectAlbumActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.SubjectAlbumActivity$c */
    public class ViewOnFocusChangeListenerC1902c implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SubjectAlbumActivity f5328a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnFocusChangeListenerC1902c(SubjectAlbumActivity subjectAlbumActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.SubjectAlbumActivity$d */
    public class ViewOnKeyListenerC1903d implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SubjectAlbumActivity f5329a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC1903d(SubjectAlbumActivity subjectAlbumActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ Button m10217P0(SubjectAlbumActivity subjectAlbumActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ LabelInfo m10218Q0(SubjectAlbumActivity subjectAlbumActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m10219R0(SubjectAlbumActivity subjectAlbumActivity, LabelInfo.C2231a c2231a) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ RadioButton m10220S0(SubjectAlbumActivity subjectAlbumActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ RadioButton m10221T0(SubjectAlbumActivity subjectAlbumActivity, RadioButton radioButton) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m10222U0(SubjectAlbumActivity subjectAlbumActivity, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ List m10223V0(SubjectAlbumActivity subjectAlbumActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    private final void m10224X0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    private void m10225Z0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    public static void m10226b1(Context context, String str, String str2) {
    }

    @Override // android.media.ViviTV.fragmens.BaseVideoListFragment.InterfaceC2018g
    /* JADX INFO: renamed from: C */
    public void mo10227C(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1408Vq
    /* JADX INFO: renamed from: M */
    public void mo6636M(Fragment fragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public final void m10228W0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x00c9
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: Y0 */
    public final void m10229Y0(android.media.ViviTV.model.LabelInfo.C2231a r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.SubjectAlbumActivity.m10229Y0(android.media.ViviTV.model.LabelInfo$a):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0049
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a1 */
    public final void m10230a1(android.view.View r4) {
        /*
            r3 = this;
            return
        L4c:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.SubjectAlbumActivity.m10230a1(android.view.View):void");
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
}
