package cn.dolit.updatelib.activitys;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cn.dolit.updatelib.services.UpdateService;

/* JADX INFO: loaded from: classes.dex */
public class CustomUpdateDialogActivity extends Activity {

    /* JADX INFO: renamed from: k */
    public static final String f10464k = "l_language";

    /* JADX INFO: renamed from: l */
    public static final String f10465l = "l_country";

    /* JADX INFO: renamed from: a */
    public UpdateService.BinderC3091o f10466a;

    /* JADX INFO: renamed from: b */
    public TextView f10467b;

    /* JADX INFO: renamed from: c */
    public TextView f10468c;

    /* JADX INFO: renamed from: d */
    public TextView f10469d;

    /* JADX INFO: renamed from: e */
    public int f10470e;

    /* JADX INFO: renamed from: f */
    public Button f10471f;

    /* JADX INFO: renamed from: g */
    public Button f10472g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f10473h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f10474i;

    /* JADX INFO: renamed from: j */
    public ServiceConnection f10475j;

    /* JADX INFO: renamed from: cn.dolit.updatelib.activitys.CustomUpdateDialogActivity$a */
    public class ServiceConnectionC3076a implements ServiceConnection {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CustomUpdateDialogActivity f10476a;

        /* JADX WARN: Invalid debug info offset */
        public ServiceConnectionC3076a(CustomUpdateDialogActivity customUpdateDialogActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ UpdateService.BinderC3091o m16752a(CustomUpdateDialogActivity customUpdateDialogActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ UpdateService.BinderC3091o m16753b(CustomUpdateDialogActivity customUpdateDialogActivity, UpdateService.BinderC3091o binderC3091o) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ TextView m16754c(CustomUpdateDialogActivity customUpdateDialogActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final void m16755d() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0010
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void doOnClick(android.view.View r3) {
        /*
            r2 = this;
            return
        L19:
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.dolit.updatelib.activitys.CustomUpdateDialogActivity.doOnClick(android.view.View):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: e */
    public final void m16756e() {
        /*
            r3 = this;
            return
        L46:
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.dolit.updatelib.activitys.CustomUpdateDialogActivity.m16756e():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x00a6
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // android.app.Activity
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            return
        Lab:
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.dolit.updatelib.activitys.CustomUpdateDialogActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Activity
    public void onDestroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }
}
