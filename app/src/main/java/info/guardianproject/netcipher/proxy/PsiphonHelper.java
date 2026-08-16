package info.guardianproject.netcipher.proxy;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public class PsiphonHelper implements ProxyHelper {
    public static final String COMPONENT_NAME = "com.psiphon3.StatusActivity";
    public static final int DEFAULT_HTTP_PORT = 8080;
    public static final int DEFAULT_SOCKS_PORT = 1080;
    public static final String FDROID_URI = "https://f-droid.org/repository/browse/?fdid=com.psiphon3";
    public static final String MARKET_URI = "market://details?id=com.psiphon3";
    public static final String ORBOT_PLAY_URI = "https://play.google.com/store/apps/details?id=com.psiphon3";
    public static final String PACKAGE_NAME = "com.psiphon3";

    /* JADX INFO: renamed from: info.guardianproject.netcipher.proxy.PsiphonHelper$1 */
    public class C45711 extends Thread {
        final /* synthetic */ PsiphonHelper this$0;
        final /* synthetic */ Context val$context;

        /* JADX WARN: Invalid debug info offset */
        public C45711(PsiphonHelper psiphonHelper, Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    private static boolean isAppInstalled(Context context, String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0015
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static boolean isPortOpen(java.lang.String r3, int r4, int r5) {
        /*
            r0 = 0
            return r0
        L13:
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: info.guardianproject.netcipher.proxy.PsiphonHelper.isPortOpen(java.lang.String, int, int):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // info.guardianproject.netcipher.proxy.ProxyHelper
    public Intent getInstallIntent(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // info.guardianproject.netcipher.proxy.ProxyHelper
    public String getName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // info.guardianproject.netcipher.proxy.ProxyHelper
    public Intent getStartIntent(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // info.guardianproject.netcipher.proxy.ProxyHelper
    public boolean isInstalled(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // info.guardianproject.netcipher.proxy.ProxyHelper
    public boolean requestStart(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // info.guardianproject.netcipher.proxy.ProxyHelper
    public void requestStatus(Context context) {
    }
}
