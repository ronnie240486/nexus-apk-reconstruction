package com.google.android.datatransport.runtime.logging;

import android.os.Build;
import android.util.Log;
import p000.C4515i2;
import p000.C5312rZ;

/* JADX INFO: loaded from: classes.dex */
public final class Logging {
    private static final String LOG_PREFIX = "TRuntime.";
    private static final int MAX_LOG_TAG_SIZE_IN_SDK_N = 23;

    private Logging() {
    }

    private static String concatTag(String str, String str2) {
        String strM21289a = C4515i2.m21289a(str, str2);
        return strM21289a.length() > 23 ? strM21289a.substring(0, 23) : strM21289a;
    }

    /* JADX INFO: renamed from: d */
    public static void m17426d(String str, String str2) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 3)) {
            Log.d(tag, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m17430e(String str, String str2, Throwable th) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 6)) {
            Log.e(tag, str2, th);
        }
    }

    private static String getTag(String str) {
        return Build.VERSION.SDK_INT < 26 ? concatTag(LOG_PREFIX, str) : C5312rZ.m27869a(LOG_PREFIX, str);
    }

    /* JADX INFO: renamed from: i */
    public static void m17431i(String str, String str2, Object obj) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 4)) {
            Log.i(tag, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m17432w(String str, String str2, Object obj) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 5)) {
            Log.w(tag, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m17427d(String str, String str2, Object obj) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 3)) {
            Log.d(tag, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m17428d(String str, String str2, Object obj, Object obj2) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 3)) {
            Log.d(tag, String.format(str2, obj, obj2));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m17429d(String str, String str2, Object... objArr) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 3)) {
            Log.d(tag, String.format(str2, objArr));
        }
    }
}
