package cn.dolit.twowayviewlib.activitys;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter;
import cn.dolit.twowayviewlib.adapters.DemoTwoWayViewAdapterLand;
import cn.dolit.twowayviewlib.listeners.ScrollReachBottomListenerTWV;
import java.util.List;
import org.lucasr.twowayview.widget.TwoWayView;
import p000.AbstractC5157p6;

/* JADX INFO: loaded from: classes.dex */
public class DemoTwoWayViewActivity extends Activity implements BaseSpannableRecyclerViewAdapter.InterfaceC3069b {

    /* JADX INFO: renamed from: a */
    public TwoWayView f10430a;

    /* JADX INFO: renamed from: cn.dolit.twowayviewlib.activitys.DemoTwoWayViewActivity$a */
    public class C3066a extends ScrollReachBottomListenerTWV {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ DemoTwoWayViewAdapterLand f10431c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ DemoTwoWayViewActivity f10432d;

        /* JADX WARN: Invalid debug info offset */
        public C3066a(DemoTwoWayViewActivity demoTwoWayViewActivity, DemoTwoWayViewAdapterLand demoTwoWayViewAdapterLand) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // cn.dolit.twowayviewlib.listeners.ScrollReachBottomListenerTWV
        /* JADX INFO: renamed from: a */
        public void mo12044a() {
        }
    }

    /* JADX INFO: renamed from: cn.dolit.twowayviewlib.activitys.DemoTwoWayViewActivity$b */
    public class AsyncTaskC3067b extends AsyncTask<Void, Integer, List<AbstractC5157p6>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseSpannableRecyclerViewAdapter f10433a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DemoTwoWayViewActivity f10434b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC3067b(DemoTwoWayViewActivity demoTwoWayViewActivity, BaseSpannableRecyclerViewAdapter baseSpannableRecyclerViewAdapter) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0040
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.util.List<p000.AbstractC5157p6> m16722a(java.lang.Void... r6) {
            /*
                r5 = this;
                r0 = 0
                return r0
            L44:
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.dolit.twowayviewlib.activitys.DemoTwoWayViewActivity.AsyncTaskC3067b.m16722a(java.lang.Void[]):java.util.List");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m16723b(List<AbstractC5157p6> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ List<AbstractC5157p6> doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(List<AbstractC5157p6> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter.InterfaceC3069b
    /* JADX INFO: renamed from: a */
    public void mo12049a(BaseSpannableRecyclerViewAdapter baseSpannableRecyclerViewAdapter) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
    }
}
