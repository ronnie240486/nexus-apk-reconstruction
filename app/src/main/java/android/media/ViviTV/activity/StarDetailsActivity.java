package android.media.ViviTV.activity;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.ViviTV.adapters.ViewOnKeyListenerC1991b;
import android.media.ViviTV.databinding.ActivityStarDetailsBinding;
import android.media.ViviTV.widget.HorizontalRecyclerView;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.KeyEvent;
import p000.C4289eT;
import p000.R00;

/* JADX INFO: loaded from: classes4.dex */
public class StarDetailsActivity extends BaseActivity implements ViewOnKeyListenerC1991b.b, HorizontalRecyclerView.InterfaceC2365a {

    /* JADX INFO: renamed from: w */
    public static final String f5310w = "STAR_INFO";

    /* JADX INFO: renamed from: u */
    public C4289eT f5311u;

    /* JADX INFO: renamed from: v */
    public ActivityStarDetailsBinding f5312v;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.StarDetailsActivity$a */
    public class AsyncTaskC1898a extends AsyncTask<Void, Integer, C4289eT> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ StarDetailsActivity f5313a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1898a(StarDetailsActivity starDetailsActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0036
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public p000.C4289eT m10213a(java.lang.Void... r4) {
            /*
                r3 = this;
                r0 = 0
                return r0
            L44:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.StarDetailsActivity.AsyncTaskC1898a.m10213a(java.lang.Void[]):eT");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m10214b(C4289eT c4289eT) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ C4289eT doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(C4289eT c4289eT) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.StarDetailsActivity$b */
    public class AsyncTaskC1899b extends AsyncTask<Void, Integer, Bitmap> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ StarDetailsActivity f5314a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1899b(StarDetailsActivity starDetailsActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Bitmap m10215a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m10216b(Bitmap bitmap) {
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

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ C4289eT m10202P0(StarDetailsActivity starDetailsActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ C4289eT m10203Q0(StarDetailsActivity starDetailsActivity, C4289eT c4289eT) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m10204R0(StarDetailsActivity starDetailsActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m10205S0(StarDetailsActivity starDetailsActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ ActivityStarDetailsBinding m10206T0(StarDetailsActivity starDetailsActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    private void m10207V0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    private void m10208X0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public static void m10209Z0(Context context, C4289eT c4289eT) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.ViewOnKeyListenerC1991b.b
    /* JADX INFO: renamed from: G */
    public void mo9910G(int i, R00 r00) {
    }

    @Override // android.media.ViviTV.widget.HorizontalRecyclerView.InterfaceC2365a
    /* JADX INFO: renamed from: N */
    public boolean mo884N(KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public final void m10210U0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public final void m10211W0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public final void m10212Y0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }
}
