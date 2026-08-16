package android.media.ViviTV.activity;

import android.media.ViviTV.databinding.ActivityFavVideoBinding;
import android.media.ViviTV.fragmens.FavVideoFragment;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes4.dex */
public class FavVideoActivity extends BaseActivity implements Observer, View.OnClickListener {

    /* JADX INFO: renamed from: x */
    public static final String f4910x = "favType";

    /* JADX INFO: renamed from: u */
    public ActivityFavVideoBinding f4911u;

    /* JADX INFO: renamed from: v */
    public int f4912v;

    /* JADX INFO: renamed from: w */
    public FavVideoFragment f4913w;

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    private void m9705P0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0020
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: Q0 */
    public final void m9706Q0() {
        /*
            r3 = this;
            return
        L37:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.FavVideoActivity.m9706Q0():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public final void m9707R0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
    }
}
