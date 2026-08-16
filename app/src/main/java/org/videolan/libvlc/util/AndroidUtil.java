package org.videolan.libvlc.util;

import android.net.Uri;
import android.os.Build;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class AndroidUtil {

    /* JADX INFO: renamed from: a */
    public static final boolean f17643a;

    /* JADX INFO: renamed from: b */
    public static final boolean f17644b;

    /* JADX INFO: renamed from: c */
    public static final boolean f17645c;

    /* JADX INFO: renamed from: d */
    public static final boolean f17646d;

    /* JADX INFO: renamed from: e */
    public static final boolean f17647e;

    /* JADX INFO: renamed from: f */
    public static final boolean f17648f;

    /* JADX INFO: renamed from: g */
    public static final boolean f17649g;

    /* JADX INFO: renamed from: h */
    public static final boolean f17650h;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = i >= 28;
        f17643a = z;
        boolean z2 = z || i >= 26;
        f17644b = z2;
        boolean z3 = z2 || i >= 25;
        f17645c = z3;
        boolean z4 = z3 || i >= 24;
        f17646d = z4;
        boolean z5 = z4 || i >= 23;
        f17647e = z5;
        f17648f = z5 || i >= 21;
        f17649g = true;
        f17650h = true;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static Uri m25513a(File file) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static Uri m25514b(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static Uri m25515c(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static File m25516d(Uri uri) {
        return null;
    }
}
