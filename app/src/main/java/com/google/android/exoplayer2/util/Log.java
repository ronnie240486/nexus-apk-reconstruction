package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.net.UnknownHostException;
import org.apache.commons.p013io.IOUtils;
import p000.C0835Mx;

/* JADX INFO: loaded from: classes2.dex */
public final class Log {
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_ERROR = 3;
    public static final int LOG_LEVEL_INFO = 1;
    public static final int LOG_LEVEL_OFF = Integer.MAX_VALUE;
    public static final int LOG_LEVEL_WARNING = 2;
    private static int logLevel = 0;
    private static boolean logStackTraces = true;

    private Log() {
    }

    private static String appendThrowableString(String str, @Nullable Throwable th) {
        String throwableString = getThrowableString(th);
        if (TextUtils.isEmpty(throwableString)) {
            return str;
        }
        StringBuilder sbM3902a = C0835Mx.m3902a(str, "\n  ");
        sbM3902a.append(throwableString.replace(IOUtils.f15646e, "\n  "));
        sbM3902a.append('\n');
        return sbM3902a.toString();
    }

    /* JADX INFO: renamed from: d */
    public static void m17580d(String str, String str2) {
        if (logLevel == 0) {
            android.util.Log.d(str, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m17582e(String str, String str2) {
        if (logLevel <= 3) {
            android.util.Log.e(str, str2);
        }
    }

    public static int getLogLevel() {
        return logLevel;
    }

    @Nullable
    public static String getThrowableString(@Nullable Throwable th) {
        if (th == null) {
            return null;
        }
        if (isCausedByUnknownHostException(th)) {
            return "UnknownHostException (no network)";
        }
        return !logStackTraces ? th.getMessage() : android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    /* JADX INFO: renamed from: i */
    public static void m17584i(String str, String str2) {
        if (logLevel <= 1) {
            android.util.Log.i(str, str2);
        }
    }

    private static boolean isCausedByUnknownHostException(@Nullable Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void setLogLevel(int i) {
        logLevel = i;
    }

    public static void setLogStackTraces(boolean z) {
        logStackTraces = z;
    }

    /* JADX INFO: renamed from: w */
    public static void m17586w(String str, String str2) {
        if (logLevel <= 2) {
            android.util.Log.w(str, str2);
        }
    }

    public boolean getLogStackTraces() {
        return logStackTraces;
    }

    /* JADX INFO: renamed from: d */
    public static void m17581d(String str, String str2, @Nullable Throwable th) {
        m17580d(str, appendThrowableString(str2, th));
    }

    /* JADX INFO: renamed from: e */
    public static void m17583e(String str, String str2, @Nullable Throwable th) {
        m17582e(str, appendThrowableString(str2, th));
    }

    /* JADX INFO: renamed from: i */
    public static void m17585i(String str, String str2, @Nullable Throwable th) {
        m17584i(str, appendThrowableString(str2, th));
    }

    /* JADX INFO: renamed from: w */
    public static void m17587w(String str, String str2, @Nullable Throwable th) {
        m17586w(str, appendThrowableString(str2, th));
    }
}
