package android.media.ViviTV.fragmens;

import android.media.ViviTV.databinding.SettingClearcacheBinding;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.afollestad.materialdialogs.MaterialDialog;
import java.io.File;
import p000.B30;
import p000.C0124Bv;
import p000.C5813yr;
import p000.DialogC1326Uc;

/* JADX INFO: loaded from: classes.dex */
public class SettingClearRecordFragment extends BaseSlaveFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: e */
    public C5813yr f8305e;

    /* JADX INFO: renamed from: f */
    public B30 f8306f;

    /* JADX INFO: renamed from: g */
    public C0124Bv f8307g;

    /* JADX INFO: renamed from: h */
    public SettingClearcacheBinding f8308h;

    /* JADX INFO: renamed from: i */
    public Handler f8309i;

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.SettingClearRecordFragment$a */
    public class AsyncTaskC2095a extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MaterialDialog f8310a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f8311b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ SettingClearRecordFragment f8312c;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2095a(SettingClearRecordFragment settingClearRecordFragment, MaterialDialog materialDialog, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000b
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public final void m12549a(p000.C1265Tf r3, java.util.List<p000.C0090BN> r4) {
            /*
                r2 = this;
                return
            L22:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.fragmens.SettingClearRecordFragment.AsyncTaskC2095a.m12549a(Tf, java.util.List):void");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public Boolean m12550b(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public void m12551c(Boolean bool) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.SettingClearRecordFragment$b */
    public class RunnableC2096b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ File[] f8313a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SettingClearRecordFragment f8314b;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2096b(SettingClearRecordFragment settingClearRecordFragment, File[] fileArr) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x001a
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.lang.Runnable
        public void run() {
            /*
                r3 = this;
                return
            L1e:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.fragmens.SettingClearRecordFragment.RunnableC2096b.run():void");
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.SettingClearRecordFragment$c */
    public class HandlerC2097c extends Handler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SettingClearRecordFragment f8315a;

        /* JADX WARN: Invalid debug info offset */
        public HandlerC2097c(SettingClearRecordFragment settingClearRecordFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ void m12541K0(SettingClearRecordFragment settingClearRecordFragment, DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ Handler m12542L0(SettingClearRecordFragment settingClearRecordFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ SettingClearcacheBinding m12543M0(SettingClearRecordFragment settingClearRecordFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseSlaveFragment
    /* JADX INFO: renamed from: E0 */
    public void mo12054E0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    public final void m12544N0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O0 */
    public final void m12545O0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public final void m12546P0(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public final void m12547Q0(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m12548R0(DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }
}
