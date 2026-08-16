package cn.dolit.p2ptrans;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class Module {
    private static AtomicBoolean P2P_LIB_LOADED = new AtomicBoolean(false);
    protected static final String TAG = "p2ptrans";

    static {
        StringBuilder sb;
        try {
            System.loadLibrary(TAG);
            P2P_LIB_LOADED.set(true);
        } catch (SecurityException e) {
            e = e;
            P2P_LIB_LOADED.set(false);
            sb = new StringBuilder("Encountered a security issue when loading p2ptrans library: ");
            sb.append(e);
            Log.e(TAG, sb.toString());
        } catch (UnsatisfiedLinkError e2) {
            e = e2;
            P2P_LIB_LOADED.set(false);
            sb = new StringBuilder("Can't load p2ptrans library: ");
            sb.append(e);
            Log.e(TAG, sb.toString());
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isP2pLibLoaded() {
        return false;
    }

    public native int run(String str);

    public native int setLogLevel(int i);

    public native int setProguard(String str);
}
