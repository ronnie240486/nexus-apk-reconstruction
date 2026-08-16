package android.media.ViviTV.activity;

import android.content.Intent;
import android.media.ViviTV.adapters.PurchaseHorizontalAdapter;
import android.media.ViviTV.databinding.ActivityPackagePurchaseBinding;
import android.media.ViviTV.widget.HorizontalRecyclerView;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import p000.C1117RL;

/* JADX INFO: loaded from: classes4.dex */
public class PackagePurchaseActivity extends BaseActivity implements HorizontalRecyclerView.InterfaceC2365a, View.OnClickListener {

    /* JADX INFO: renamed from: u */
    public PurchaseHorizontalAdapter f5152u;

    /* JADX INFO: renamed from: v */
    public List<C1117RL> f5153v;

    /* JADX INFO: renamed from: w */
    public ActivityPackagePurchaseBinding f5154w;

    /* JADX INFO: renamed from: x */
    public PurchaseHorizontalAdapter.InterfaceC1974a f5155x;

    /* JADX INFO: renamed from: y */
    public ViewTreeObserver.OnGlobalLayoutListener f5156y;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.PackagePurchaseActivity$a */
    public class AsyncTaskC1857a extends AsyncTask<Void, Integer, List<C1117RL>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PackagePurchaseActivity f5157a;

        /* JADX INFO: renamed from: android.media.ViviTV.activity.PackagePurchaseActivity$a$a */
        public class a extends TypeToken<List<C1117RL>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AsyncTaskC1857a f5158a;

            /* JADX WARN: Invalid debug info offset */
            public a(AsyncTaskC1857a asyncTaskC1857a) {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1857a(PackagePurchaseActivity packagePurchaseActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0018
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.util.List<p000.C1117RL> m10013a(java.lang.Void... r5) {
            /*
                r4 = this;
                r0 = 0
                return r0
            L45:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.PackagePurchaseActivity.AsyncTaskC1857a.m10013a(java.lang.Void[]):java.util.List");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m10014b(List<C1117RL> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ List<C1117RL> doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(List<C1117RL> list) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.PackagePurchaseActivity$b */
    public class C1858b implements PurchaseHorizontalAdapter.InterfaceC1974a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PackagePurchaseActivity f5159a;

        /* JADX WARN: Invalid debug info offset */
        public C1858b(PackagePurchaseActivity packagePurchaseActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.adapters.PurchaseHorizontalAdapter.InterfaceC1974a
        /* JADX INFO: renamed from: a */
        public void mo10015a(int i, C1117RL c1117rl) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.PackagePurchaseActivity$c */
    public class ViewTreeObserverOnGlobalLayoutListenerC1859c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PackagePurchaseActivity f5160a;

        /* JADX WARN: Invalid debug info offset */
        public ViewTreeObserverOnGlobalLayoutListenerC1859c(PackagePurchaseActivity packagePurchaseActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ List m10004P0(PackagePurchaseActivity packagePurchaseActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ List m10005Q0(PackagePurchaseActivity packagePurchaseActivity, List list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ PurchaseHorizontalAdapter m10006R0(PackagePurchaseActivity packagePurchaseActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ PurchaseHorizontalAdapter m10007S0(PackagePurchaseActivity packagePurchaseActivity, PurchaseHorizontalAdapter purchaseHorizontalAdapter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ ActivityPackagePurchaseBinding m10008T0(PackagePurchaseActivity packagePurchaseActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ PurchaseHorizontalAdapter.InterfaceC1974a m10009U0(PackagePurchaseActivity packagePurchaseActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener m10010V0(PackagePurchaseActivity packagePurchaseActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    private void m10011W0() {
    }

    @Override // android.media.ViviTV.widget.HorizontalRecyclerView.InterfaceC2365a
    /* JADX INFO: renamed from: N */
    public boolean mo884N(KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public final void m10012X0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
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
