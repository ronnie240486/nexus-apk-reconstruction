package android.media.ViviTV.activity;

import android.content.Context;
import android.media.ViviTV.adapters.SingleChannelEpgListAdapter;
import android.media.ViviTV.databinding.LayoutActivityEpgsingleChannelBinding;
import android.media.ViviTV.model.persistent.EpgItemInfo;
import android.media.ViviTV.model.persistent.LiveChannelInfo;
import android.media.dialog.CommonDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.viewpager.widget.ViewPager;
import com.afollestad.materialdialogs.MaterialDialog;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.List;
import p000.C1439WJ;

/* JADX INFO: loaded from: classes4.dex */
public class EPGSingleChannelActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener, ViewPager.OnPageChangeListener, View.OnFocusChangeListener, SingleChannelEpgListAdapter.InterfaceC1983a {

    /* JADX INFO: renamed from: C */
    public static final boolean f4874C = true;

    /* JADX INFO: renamed from: D */
    public static final boolean f4875D = false;

    /* JADX INFO: renamed from: E */
    public static final String f4876E = "title";

    /* JADX INFO: renamed from: F */
    public static final String f4877F = "yyyy-MM-dd";

    /* JADX INFO: renamed from: G */
    public static final String f4878G = "channel_info";

    /* JADX INFO: renamed from: A */
    public LiveChannelInfo f4879A;

    /* JADX INFO: renamed from: B */
    public LayoutActivityEpgsingleChannelBinding f4880B;

    /* JADX INFO: renamed from: u */
    public String f4881u;

    /* JADX INFO: renamed from: v */
    public HashMap<String, List<EpgItemInfo>> f4882v;

    /* JADX INFO: renamed from: w */
    public List<String> f4883w;

    /* JADX INFO: renamed from: x */
    public String f4884x;

    /* JADX INFO: renamed from: y */
    public String f4885y;

    /* JADX INFO: renamed from: z */
    public C1439WJ f4886z;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.EPGSingleChannelActivity$a */
    public class RunnableC1788a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ EPGSingleChannelActivity f4887a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC1788a(EPGSingleChannelActivity ePGSingleChannelActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.EPGSingleChannelActivity$b */
    public class AsyncTaskC1789b extends AsyncTask<Void, Integer, C1439WJ> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ EPGSingleChannelActivity f4888a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1789b(EPGSingleChannelActivity ePGSingleChannelActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public C1439WJ m9690a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9691b(C1439WJ c1439wj) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ C1439WJ doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(C1439WJ c1439wj) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.EPGSingleChannelActivity$c */
    public class AsyncTaskC1790c extends AsyncTask<Void, Integer, HashMap<String, List<EpgItemInfo>>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f4889a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ EPGSingleChannelActivity f4890b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1790c(EPGSingleChannelActivity ePGSingleChannelActivity, List list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0030
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.util.HashMap<java.lang.String, java.util.List<android.media.ViviTV.model.persistent.EpgItemInfo>> m9692a(java.lang.Void... r7) {
            /*
                r6 = this;
                r0 = 0
                return r0
            L4d:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.EPGSingleChannelActivity.AsyncTaskC1790c.m9692a(java.lang.Void[]):java.util.HashMap");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9693b(HashMap<String, List<EpgItemInfo>> map) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ HashMap<String, List<EpgItemInfo>> doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(HashMap<String, List<EpgItemInfo>> map) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.EPGSingleChannelActivity$d */
    public class AsyncTaskC1791d extends AsyncTask<Void, Integer, List<EpgItemInfo>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ EPGSingleChannelActivity f4891a;

        /* JADX INFO: renamed from: android.media.ViviTV.activity.EPGSingleChannelActivity$d$a */
        public class a extends TypeToken<List<EpgItemInfo>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AsyncTaskC1791d f4892a;

            /* JADX WARN: Invalid debug info offset */
            public a(AsyncTaskC1791d asyncTaskC1791d) {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1791d(EPGSingleChannelActivity ePGSingleChannelActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x002f
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.util.List<android.media.ViviTV.model.persistent.EpgItemInfo> m9694a(java.lang.Void... r6) {
            /*
                r5 = this;
                r0 = 0
                return r0
            La0:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.EPGSingleChannelActivity.AsyncTaskC1791d.m9694a(java.lang.Void[]):java.util.List");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9695b(List<EpgItemInfo> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ List<EpgItemInfo> doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(List<EpgItemInfo> list) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.EPGSingleChannelActivity$e */
    public class RunnableC1792e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ EPGSingleChannelActivity f4893a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC1792e(EPGSingleChannelActivity ePGSingleChannelActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.EPGSingleChannelActivity$f */
    public class AsyncTaskC1793f extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public int f4894a;

        /* JADX INFO: renamed from: b */
        public String f4895b;

        /* JADX INFO: renamed from: c */
        public long f4896c;

        /* JADX INFO: renamed from: d */
        public MaterialDialog f4897d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f4898e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ long f4899f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ EPGSingleChannelActivity f4900g;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1793f(EPGSingleChannelActivity ePGSingleChannelActivity, String str, long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0029
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.lang.Boolean m9696a(java.lang.Void... r7) {
            /*
                r6 = this;
                r0 = 0
                return r0
            L36:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.EPGSingleChannelActivity.AsyncTaskC1793f.m9696a(java.lang.Void[]):java.lang.Boolean");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9697b(Boolean bool) {
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

    /* JADX INFO: renamed from: android.media.ViviTV.activity.EPGSingleChannelActivity$g */
    public class AsyncTaskC1794g extends AsyncTask<Void, Integer, LiveChannelInfo> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f4901a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ EPGSingleChannelActivity f4902b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1794g(EPGSingleChannelActivity ePGSingleChannelActivity, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public LiveChannelInfo m9698a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9699b(LiveChannelInfo liveChannelInfo) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ LiveChannelInfo doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(LiveChannelInfo liveChannelInfo) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.EPGSingleChannelActivity$h */
    public class C1795h implements CommonDialog.InterfaceC2374a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ EPGSingleChannelActivity f4903a;

        /* JADX WARN: Invalid debug info offset */
        public C1795h(EPGSingleChannelActivity ePGSingleChannelActivity) {
        }

        @Override // android.media.dialog.CommonDialog.InterfaceC2374a
        /* JADX INFO: renamed from: a */
        public void mo9533a() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.dialog.CommonDialog.InterfaceC2374a
        /* JADX INFO: renamed from: b */
        public void mo9534b() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ String m9659P0(EPGSingleChannelActivity ePGSingleChannelActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m9660Q0(EPGSingleChannelActivity ePGSingleChannelActivity, C1439WJ c1439wj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m9661R0(EPGSingleChannelActivity ePGSingleChannelActivity, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m9662S0(EPGSingleChannelActivity ePGSingleChannelActivity, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ void m9663T0(EPGSingleChannelActivity ePGSingleChannelActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ C1439WJ m9664U0(EPGSingleChannelActivity ePGSingleChannelActivity, C1439WJ c1439wj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ List m9665V0(EPGSingleChannelActivity ePGSingleChannelActivity, String str, List list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ List m9666W0(EPGSingleChannelActivity ePGSingleChannelActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ HashMap m9667X0(EPGSingleChannelActivity ePGSingleChannelActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ HashMap m9668Y0(EPGSingleChannelActivity ePGSingleChannelActivity, HashMap map) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ LayoutActivityEpgsingleChannelBinding m9669Z0(EPGSingleChannelActivity ePGSingleChannelActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m9670a1(EPGSingleChannelActivity ePGSingleChannelActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ String m9671b1(EPGSingleChannelActivity ePGSingleChannelActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ LiveChannelInfo m9672c1(EPGSingleChannelActivity ePGSingleChannelActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    private void m9673h1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: j1 */
    public static final java.lang.String m9674j1(java.lang.String r6) {
        /*
            r0 = 0
            return r0
        L23:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.EPGSingleChannelActivity.m9674j1(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n1 */
    private void m9675n1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r1 */
    public static final void m9676r1(Context context, LiveChannelInfo liveChannelInfo, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public final void m9677d1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    public final void m9678e1() {
    }

    /* JADX INFO: renamed from: f1 */
    public final void m9679f1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: g1 */
    public final java.util.List<android.media.ViviTV.model.persistent.EpgItemInfo> m9680g1(java.lang.String r7, java.util.List<p000.C1439WJ.c> r8) {
        /*
            r6 = this;
            r0 = 0
            return r0
        L44:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.EPGSingleChannelActivity.m9680g1(java.lang.String, java.util.List):java.util.List");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    public final void m9681i1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0026
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: k1 */
    public final void m9682k1(android.media.ViviTV.model.persistent.EpgItemInfo r5) {
        /*
            r4 = this;
            return
        L48:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.EPGSingleChannelActivity.m9682k1(android.media.ViviTV.model.persistent.EpgItemInfo):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.SingleChannelEpgListAdapter.InterfaceC1983a
    /* JADX INFO: renamed from: l */
    public void mo9683l(EpgItemInfo epgItemInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l1 */
    public final void m9684l1(C1439WJ c1439wj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0023
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: m1 */
    public final void m9685m1() {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.EPGSingleChannelActivity.m9685m1():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o1 */
    public final void m9686o1(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
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

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p1 */
    public final void m9687p1(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q1 */
    public final void m9688q1(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.SingleChannelEpgListAdapter.InterfaceC1983a
    /* JADX INFO: renamed from: w */
    public boolean mo9689w(int i, View view) {
        return false;
    }
}
