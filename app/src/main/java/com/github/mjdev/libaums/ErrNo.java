package com.github.mjdev.libaums;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class ErrNo {
    private static String TAG = "ErrNo";
    private static boolean isInited = true;

    static {
        try {
            System.loadLibrary("errno-lib");
        } catch (UnsatisfiedLinkError e) {
            isInited = false;
            Log.e(TAG, "could not load errno-lib", e);
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public static int getErrno() {
        return 0;
    }

    public static native int getErrnoNative();

    /* JADX WARN: Invalid debug info offset */
    public static String getErrstr() {
        return null;
    }

    public static native String getErrstrNative();
}
