package info.guardianproject.netcipher.proxy;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import java.net.URL;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class OrbotHelper implements ProxyHelper {
    public static final String ACTION_REQUEST_HS = "org.torproject.android.REQUEST_HS_PORT";
    public static final String ACTION_START = "org.torproject.android.intent.action.START";
    public static final String ACTION_START_TOR = "org.torproject.android.START_TOR";
    public static final String ACTION_STATUS = "org.torproject.android.intent.action.STATUS";
    public static final String DEFAULT_PROXY_HOST = "localhost";
    public static final int DEFAULT_PROXY_HTTP_PORT = 8118;
    public static final int DEFAULT_PROXY_SOCKS_PORT = 9050;
    public static final String EXTRA_PACKAGE_NAME = "org.torproject.android.intent.extra.PACKAGE_NAME";
    public static final String EXTRA_PROXY_PORT_HTTP = "org.torproject.android.intent.extra.HTTP_PROXY_PORT";
    public static final String EXTRA_PROXY_PORT_SOCKS = "org.torproject.android.intent.extra.SOCKS_PROXY_PORT";
    public static final String EXTRA_STATUS = "org.torproject.android.intent.extra.STATUS";
    public static final int HS_REQUEST_CODE = 9999;
    public static final String ORBOT_FDROID_URI = "https://f-droid.org/repository/browse/?fdid=org.torproject.android";
    public static final String ORBOT_MARKET_URI = "market://details?id=org.torproject.android";
    public static final String ORBOT_PACKAGE_NAME = "org.torproject.android";
    public static final String ORBOT_PLAY_URI = "https://play.google.com/store/apps/details?id=org.torproject.android";
    private static final int REQUEST_CODE_STATUS = 100;
    public static final int START_TOR_RESULT = 37428;
    public static final String STATUS_OFF = "OFF";
    public static final String STATUS_ON = "ON";
    public static final String STATUS_STARTING = "STARTING";
    public static final String STATUS_STARTS_DISABLED = "STARTS_DISABLED";
    public static final String STATUS_STOPPING = "STOPPING";
    private static volatile OrbotHelper instance;
    private final Context context;
    private final Handler handler;
    private Set<InstallCallback> installCallbacks;
    private long installTimeoutMs;
    private boolean isInstalled;

    @Nullable
    private Intent lastStatusIntent;
    private Runnable onInstallTimeout;
    private Runnable onStatusTimeout;
    private BroadcastReceiver orbotInstallReceiver;
    private BroadcastReceiver orbotStatusReceiver;
    private Set<StatusCallback> statusCallbacks;
    private long statusTimeoutMs;
    private boolean validateOrbot;

    /* JADX INFO: renamed from: info.guardianproject.netcipher.proxy.OrbotHelper$1 */
    public class C45671 extends BroadcastReceiver {
        final /* synthetic */ OrbotHelper this$0;

        /* JADX WARN: Invalid debug info offset */
        public C45671(OrbotHelper orbotHelper) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* JADX INFO: renamed from: info.guardianproject.netcipher.proxy.OrbotHelper$2 */
    public class RunnableC45682 implements Runnable {
        final /* synthetic */ OrbotHelper this$0;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC45682(OrbotHelper orbotHelper) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: info.guardianproject.netcipher.proxy.OrbotHelper$3 */
    public class C45693 extends BroadcastReceiver {
        final /* synthetic */ OrbotHelper this$0;

        /* JADX WARN: Invalid debug info offset */
        public C45693(OrbotHelper orbotHelper) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* JADX INFO: renamed from: info.guardianproject.netcipher.proxy.OrbotHelper$4 */
    public class RunnableC45704 implements Runnable {
        final /* synthetic */ OrbotHelper this$0;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC45704(OrbotHelper orbotHelper) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public interface InstallCallback {
        void onInstallTimeout();

        void onInstalled();
    }

    public static abstract class SimpleStatusCallback implements StatusCallback {
        @Override // info.guardianproject.netcipher.proxy.StatusCallback
        public void onDisabled() {
        }

        @Override // info.guardianproject.netcipher.proxy.StatusCallback
        public void onEnabled(Intent intent) {
        }

        @Override // info.guardianproject.netcipher.proxy.StatusCallback
        public void onNotYetInstalled() {
        }

        @Override // info.guardianproject.netcipher.proxy.StatusCallback
        public void onStarting() {
        }

        @Override // info.guardianproject.netcipher.proxy.StatusCallback
        public void onStopping() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    private OrbotHelper(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ Intent access$002(OrbotHelper orbotHelper, Intent intent) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ Runnable access$100(OrbotHelper orbotHelper) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ Handler access$200(OrbotHelper orbotHelper) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ Set access$300(OrbotHelper orbotHelper) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ BroadcastReceiver access$400(OrbotHelper orbotHelper) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ Context access$500(OrbotHelper orbotHelper) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ boolean access$602(OrbotHelper orbotHelper, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ Runnable access$700(OrbotHelper orbotHelper) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ BroadcastReceiver access$800(OrbotHelper orbotHelper) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ Set access$900(OrbotHelper orbotHelper) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static synchronized info.guardianproject.netcipher.proxy.OrbotHelper get(android.content.Context r2) {
        /*
            r0 = 0
            return r0
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: info.guardianproject.netcipher.proxy.OrbotHelper.get(android.content.Context):info.guardianproject.netcipher.proxy.OrbotHelper");
    }

    /* JADX WARN: Invalid debug info offset */
    public static Intent getOrbotInstallIntent(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static Intent getOrbotStartIntent() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Intent getOrbotStartIntent(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Intent getShowOrbotStartIntent() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static boolean isAppInstalled(Context context, String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isOnionAddress(Uri uri) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isOnionAddress(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isOnionAddress(URL url) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isOrbotInstalled(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static boolean isOrbotRunning(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <E> Set<E> newSetFromMap(Map<E, Boolean> map) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void requestHiddenServiceOnPort(Activity activity, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean requestShowOrbotStart(Activity activity) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean requestStartTor(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public OrbotHelper addInstallCallback(InstallCallback installCallback) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public OrbotHelper addStatusCallback(StatusCallback statusCallback) {
        return null;
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
    public boolean init() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void installOrbot(Activity activity) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OrbotHelper installTimeout(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isInstalled() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // info.guardianproject.netcipher.proxy.ProxyHelper
    public boolean isInstalled(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public OrbotHelper removeInstallCallback(InstallCallback installCallback) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public OrbotHelper removeStatusCallback(StatusCallback statusCallback) {
        return null;
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

    /* JADX WARN: Invalid debug info offset */
    public OrbotHelper skipOrbotValidation() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public OrbotHelper statusTimeout(long j) {
        return null;
    }
}
