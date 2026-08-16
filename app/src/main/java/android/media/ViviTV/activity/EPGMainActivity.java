package android.media.ViviTV.activity;

import android.media.ViviTV.databinding.LayoutActivityEpgmainBinding;
import android.media.ViviTV.model.persistent.LiveChannelInfo;
import android.media.ViviTV.model.persistent.LiveTypeInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class EPGMainActivity extends BaseActivity implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: u */
    public int f4866u;

    /* JADX INFO: renamed from: v */
    public int f4867v;

    /* JADX INFO: renamed from: w */
    public LayoutActivityEpgmainBinding f4868w;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.EPGMainActivity$a */
    public class AsyncTaskC1785a extends AsyncTask<Void, Integer, C1787c> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ EPGMainActivity f4869a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1785a(EPGMainActivity ePGMainActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public C1787c m9652a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9653b(C1787c c1787c) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ C1787c doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(C1787c c1787c) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.EPGMainActivity$b */
    public class RunnableC1786b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ListView f4870a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ EPGMainActivity f4871b;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC1786b(EPGMainActivity ePGMainActivity, ListView listView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.EPGMainActivity$c */
    public static final class C1787c {

        /* JADX INFO: renamed from: a */
        public List<LiveTypeInfo> f4872a;

        /* JADX INFO: renamed from: b */
        public List<LiveChannelInfo>[] f4873b;

        /* JADX WARN: Invalid debug info offset */
        public C1787c() {
        }

        /* JADX WARN: Invalid debug info offset */
        public C1787c(AsyncTaskC1785a asyncTaskC1785a) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ List m9654a(C1787c c1787c) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ List m9655b(C1787c c1787c, List list) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ List[] m9656c(C1787c c1787c) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public static /* synthetic */ List[] m9657d(C1787c c1787c, List[] listArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public boolean m9658e() {
            return false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ C1787c m9644P0(EPGMainActivity ePGMainActivity, List list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ LayoutActivityEpgmainBinding m9645Q0(EPGMainActivity ePGMainActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m9646R0(EPGMainActivity ePGMainActivity, C1787c c1787c) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public final void m9647S0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public final void m9648T0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public final void m9649U0(C1787c c1787c) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public final int m9650V0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: W0 */
    public final android.media.ViviTV.activity.EPGMainActivity.C1787c m9651W0(java.util.List<android.media.ViviTV.model.persistent.LiveTypeInfo> r13) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.EPGMainActivity.m9651W0(java.util.List):android.media.ViviTV.activity.EPGMainActivity$c");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
    }
}
