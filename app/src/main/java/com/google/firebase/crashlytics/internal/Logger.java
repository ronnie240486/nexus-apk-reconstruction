package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class Logger {
    private int logLevel = 4;
    private final String tag;
    public static final String TAG = "FirebaseCrashlytics";
    static final Logger DEFAULT_LOGGER = new Logger(TAG);

    public Logger(String str) {
        this.tag = str;
    }

    private boolean canLog(int i) {
        return this.logLevel <= i || Log.isLoggable(this.tag, i);
    }

    public static Logger getLogger() {
        return DEFAULT_LOGGER;
    }

    /* JADX INFO: renamed from: d */
    public void m17650d(String str) {
        m17651d(str, null);
    }

    /* JADX INFO: renamed from: e */
    public void m17652e(String str) {
        m17653e(str, null);
    }

    /* JADX INFO: renamed from: i */
    public void m17654i(String str) {
        m17655i(str, null);
    }

    public void log(int i, String str) {
        log(i, str, false);
    }

    /* JADX INFO: renamed from: v */
    public void m17656v(String str) {
        m17657v(str, null);
    }

    /* JADX INFO: renamed from: w */
    public void m17658w(String str) {
        m17659w(str, null);
    }

    /* JADX INFO: renamed from: d */
    public void m17651d(String str, Throwable th) {
        if (canLog(3)) {
            Log.d(this.tag, str, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m17653e(String str, Throwable th) {
        if (canLog(6)) {
            Log.e(this.tag, str, th);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m17655i(String str, Throwable th) {
        if (canLog(4)) {
            Log.i(this.tag, str, th);
        }
    }

    public void log(int i, String str, boolean z) {
        if (z || canLog(i)) {
            Log.println(i, this.tag, str);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m17657v(String str, Throwable th) {
        if (canLog(2)) {
            Log.v(this.tag, str, th);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m17659w(String str, Throwable th) {
        if (canLog(5)) {
            Log.w(this.tag, str, th);
        }
    }
}
