package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.export.external.interfaces.IX5DateSorter;

/* JADX INFO: loaded from: classes2.dex */
public class DateSorter {
    public static int DAY_COUNT;

    /* JADX INFO: renamed from: a */
    private android.webkit.DateSorter f12664a;

    /* JADX INFO: renamed from: b */
    private IX5DateSorter f12665b;

    static {
        m18850a();
        DAY_COUNT = 5;
    }

    /* JADX WARN: Invalid debug info offset */
    public DateSorter(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private static boolean m18850a() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getBoundary(int i) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getIndex(long j) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getLabel(int i) {
        return null;
    }
}
