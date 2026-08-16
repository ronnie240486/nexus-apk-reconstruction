package android.media.ViviTV.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.ViviTV.databinding.ActivityInterCutBinding;
import android.media.ViviTV.fragmens.AdvertiseFragment;
import android.media.ViviTV.p001ad.model.PriorityAdInfo;
import android.os.Bundle;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes4.dex */
public class InterCutActivity extends BaseActivity {

    /* JADX INFO: renamed from: A */
    public static final String f5015A = "EXTRA_AD_INFO";

    /* JADX INFO: renamed from: B */
    public static final String f5016B = "EXTRA_AD_ID";

    /* JADX INFO: renamed from: y */
    public static final String f5017y = InterCutActivity.class.getName().concat(".ACTION_STOP_AD");

    /* JADX INFO: renamed from: z */
    public static final String f5018z = InterCutActivity.class.getName().concat(".ACTION_AD_CTR_STOP");

    /* JADX INFO: renamed from: u */
    public ActivityInterCutBinding f5019u;

    /* JADX INFO: renamed from: v */
    public AdvertiseFragment f5020v;

    /* JADX INFO: renamed from: w */
    public PriorityAdInfo f5021w;

    /* JADX INFO: renamed from: x */
    public BroadcastReceiver f5022x;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.InterCutActivity$a */
    public class C1823a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterCutActivity f5023a;

        /* JADX WARN: Invalid debug info offset */
        public C1823a(InterCutActivity interCutActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m9827P0(InterCutActivity interCutActivity, Intent intent) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x001d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: R0 */
    private void m9828R0() {
        /*
            r3 = this;
            return
        L20:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.InterCutActivity.m9828R0():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static void m9829T0(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public static void m9830V0(Context context, PriorityAdInfo priorityAdInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static void m9831W0(Context context, PriorityAdInfo priorityAdInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public final void m9832Q0(Intent intent) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: S0 */
    public final void m9833S0() {
        /*
            r3 = this;
            return
        L19:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.InterCutActivity.m9833S0():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0010
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: U0 */
    public final void m9834U0() {
        /*
            r2 = this;
            return
        L21:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.InterCutActivity.m9834U0():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public final void m9835X0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }
}
