package android.media.ViviTV.player;

import android.content.Intent;
import android.media.ViviTV.activity.BaseActivity;
import android.media.ViviTV.fragmens.VodPlayFragment;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class VodPlayer extends BaseActivity implements VodPlayFragment.InterfaceC2176n0 {

    /* JADX INFO: renamed from: u */
    public FrameLayout f9187u;

    /* JADX INFO: renamed from: v */
    public VodPlayFragment f9188v;

    @Override // android.media.ViviTV.fragmens.VodPlayFragment.InterfaceC2176n0
    /* JADX INFO: renamed from: E */
    public boolean mo10308E() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0035
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle r3) {
        /*
            r2 = this;
            return
        L38:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.VodPlayer.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity
    /* JADX INFO: renamed from: r0 */
    public boolean mo9569r0() {
        return false;
    }
}
