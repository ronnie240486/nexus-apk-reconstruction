package android.media.ViviTV.activity;

import android.content.Context;
import android.media.ViviTV.adapters.BaseRecyclerViewAdapter;
import android.media.ViviTV.databinding.ActivityUsbDeviceListBinding;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import java.util.List;
import p000.AbstractAsyncTaskC1424W5;
import p000.C5599vZ;
import p000.DialogC1326Uc;

/* JADX INFO: loaded from: classes4.dex */
public class UsbDeviceListActivity extends BaseActivity implements BaseRecyclerViewAdapter.InterfaceC1942b<C5599vZ> {

    /* JADX INFO: renamed from: u */
    public ActivityUsbDeviceListBinding f5371u;

    /* JADX INFO: renamed from: v */
    public Handler f5372v;

    /* JADX INFO: renamed from: w */
    public Runnable f5373w;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.UsbDeviceListActivity$a */
    public class AsyncTaskC1911a extends AbstractAsyncTaskC1424W5<Boolean> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ DialogC1326Uc f5374i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ UsbDeviceListActivity f5375j;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1911a(UsbDeviceListActivity usbDeviceListActivity, Context context, String str, AbstractAsyncTaskC1424W5.a aVar, List list, Class cls, DialogC1326Uc dialogC1326Uc) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractAsyncTaskC1424W5
        /* JADX INFO: renamed from: b */
        public /* bridge */ /* synthetic */ void mo6705b(Boolean bool) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractAsyncTaskC1424W5
        /* JADX INFO: renamed from: d */
        public Pair<Boolean, Boolean> mo6707d(String str, String str2, int i) throws Exception {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public void m10283e(Boolean bool) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.UsbDeviceListActivity$b */
    public class AsyncTaskC1912b extends AsyncTask<Void, Integer, List<C5599vZ>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UsbDeviceListActivity f5376a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1912b(UsbDeviceListActivity usbDeviceListActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0007
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.util.List<p000.C5599vZ> m10284a(java.lang.Void... r9) {
            /*
                r8 = this;
                r0 = 0
                return r0
            L37:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.UsbDeviceListActivity.AsyncTaskC1912b.m10284a(java.lang.Void[]):java.util.List");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m10285b(List<C5599vZ> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ List<C5599vZ> doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(List<C5599vZ> list) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m10266P0(DialogC1326Uc dialogC1326Uc) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m10267Q0(UsbDeviceListActivity usbDeviceListActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m10268R0(UsbDeviceListActivity usbDeviceListActivity, DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m10269S0(UsbDeviceListActivity usbDeviceListActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ void m10270T0(UsbDeviceListActivity usbDeviceListActivity, List list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m10271a1(DialogC1326Uc dialogC1326Uc) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public static void m10272c1(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.BaseRecyclerViewAdapter.InterfaceC1942b
    /* JADX INFO: renamed from: H */
    public /* bridge */ /* synthetic */ boolean mo10273H(int i, C5599vZ c5599vZ) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public final void m10274U0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public final void m10275V0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public final void m10276W0(List<C5599vZ> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public boolean m10277X0(int i, C5599vZ c5599vZ) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m10278Y0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m10279Z0(DialogC1326Uc dialogC1326Uc, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    public final void m10280b1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public final void m10281d1(DialogC1326Uc dialogC1326Uc, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    public final void m10282e1(DialogC1326Uc dialogC1326Uc, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }
}
