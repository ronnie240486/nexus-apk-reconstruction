package android.media.ViviTV.activity;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.ViviTV.adapters.StarListAdapter;
import android.media.ViviTV.model.LabelInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.List;
import org.lucasr.twowayview.widget.TwoWayView;
import p000.C0368Fc;
import p000.C4289eT;

/* JADX INFO: loaded from: classes4.dex */
public class InterviewListActivity extends BaseActivity {

    /* JADX INFO: renamed from: B */
    public static final String f5024B = C0368Fc.m1865a(new StringBuilder(), "GetLabeLlist.aspx");

    /* JADX INFO: renamed from: A */
    public StarListAdapter.InterfaceC1987c f5025A;

    /* JADX INFO: renamed from: u */
    public RelativeLayout f5026u;

    /* JADX INFO: renamed from: v */
    public TwoWayView f5027v;

    /* JADX INFO: renamed from: w */
    public List<C4289eT> f5028w;

    /* JADX INFO: renamed from: x */
    public StarListAdapter f5029x;

    /* JADX INFO: renamed from: y */
    public LabelInfo f5030y;

    /* JADX INFO: renamed from: z */
    public View.OnClickListener f5031z;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.InterviewListActivity$a */
    public class AsyncTaskC1824a extends AsyncTask<Void, Integer, Bitmap> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterviewListActivity f5032a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1824a(InterviewListActivity interviewListActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Bitmap m9845a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9846b(Bitmap bitmap) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Bitmap doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Bitmap bitmap) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.InterviewListActivity$b */
    public class ViewOnClickListenerC1825b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterviewListActivity f5033a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC1825b(InterviewListActivity interviewListActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.InterviewListActivity$d */
    public class AsyncTaskC1827d extends AsyncTask<Void, Void, List<C4289eT>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterviewListActivity f5035a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1827d(InterviewListActivity interviewListActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0025
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.util.List<p000.C4289eT> m9849a(java.lang.Void... r5) {
            /*
                r4 = this;
                r0 = 0
                return r0
            L2c:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.InterviewListActivity.AsyncTaskC1827d.m9849a(java.lang.Void[]):java.util.List");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9850b(List<C4289eT> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ List<C4289eT> doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(List<C4289eT> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ LabelInfo m9836P0(InterviewListActivity interviewListActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ RelativeLayout m9837Q0(InterviewListActivity interviewListActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m9838R0(InterviewListActivity interviewListActivity, List list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    private void m9839U0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    private void m9840W0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public static void m9841X0(Context context, String str, String str2, String str3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public final void m9842S0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public void m9843T0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public final void m9844V0(List<C4289eT> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.InterviewListActivity$c */
    public class C1826c implements StarListAdapter.InterfaceC1987c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterviewListActivity f5034a;

        /* JADX WARN: Invalid debug info offset */
        public C1826c(InterviewListActivity interviewListActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.adapters.StarListAdapter.InterfaceC1987c
        /* JADX INFO: renamed from: I */
        public void mo9847I(View view, boolean z) {
        }

        @Override // android.media.ViviTV.adapters.StarListAdapter.InterfaceC1987c
        /* JADX INFO: renamed from: M */
        public void mo9848M(int i, C4289eT c4289eT) {
        }
    }
}
